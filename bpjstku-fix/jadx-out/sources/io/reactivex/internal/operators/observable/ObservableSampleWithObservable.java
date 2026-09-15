package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.ExcludeStretchedVideoQualityQuirk;
import defpackage.deInitSession;
import defpackage.deriveMediaType;
import defpackage.initSession;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSampleWithObservable<T> extends notifySuspended<T, T> {
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private AutoValue_VideoValidatedEncoderProfilesProxy<?> b;

    public ObservableSampleWithObservable(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<?> autoValue_VideoValidatedEncoderProfilesProxy2, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = autoValue_VideoValidatedEncoderProfilesProxy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        ExcludeStretchedVideoQualityQuirk excludeStretchedVideoQualityQuirk = new ExcludeStretchedVideoQualityQuirk(derivemediatype);
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new SampleMainEmitLast(excludeStretchedVideoQualityQuirk, this.b));
        } else {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new SampleMainNoLast(excludeStretchedVideoQualityQuirk, this.b));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static abstract class SampleMainObserver<T> extends AtomicReference<T> implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -3517602651313910099L;
        final deriveMediaType<? super T> downstream;
        final AtomicReference<BufferProviderState> other = new AtomicReference<>();
        final AutoValue_VideoValidatedEncoderProfilesProxy<?> sampler;
        BufferProviderState upstream;

        abstract void TuitionPaymentFragmentbindingInflater1();

        abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        SampleMainObserver(deriveMediaType<? super T> derivemediatype, AutoValue_VideoValidatedEncoderProfilesProxy<?> autoValue_VideoValidatedEncoderProfilesProxy) {
            this.downstream = derivemediatype;
            this.sampler = autoValue_VideoValidatedEncoderProfilesProxy;
        }

        @Override // defpackage.deriveMediaType
        public void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
                if (this.other.get() == null) {
                    this.sampler.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this));
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // defpackage.deriveMediaType
        public void onError(Throwable th) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.other);
            this.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public void onComplete() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.other);
            TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.BufferProviderState
        public void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.other);
            this.upstream.dispose();
        }

        @Override // defpackage.BufferProviderState
        public boolean isDisposed() {
            return this.other.get() == DisposableHelper.DISPOSED;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements deriveMediaType<Object> {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1153928113;
        private SampleMainObserver<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(SampleMainObserver<T> sampleMainObserver) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sampleMainObserver;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.other, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            SampleMainObserver<T> sampleMainObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            sampleMainObserver.upstream.dispose();
            sampleMainObserver.downstream.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            SampleMainObserver<T> sampleMainObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            sampleMainObserver.upstream.dispose();
            sampleMainObserver.TuitionPaymentFragmentbindingInflater1();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(deriveMediaType<? super T> derivemediatype, AutoValue_VideoValidatedEncoderProfilesProxy<?> autoValue_VideoValidatedEncoderProfilesProxy) {
            super(derivemediatype, autoValue_VideoValidatedEncoderProfilesProxy);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        final void TuitionPaymentFragmentbindingInflater1() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean done;
        final AtomicInteger wip;
        private static final byte[] $$c = {93, -122, -23, -24};
        private static final int $$f = 153;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {55, -47, -47, 67, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -59, -8, -8, 67, -61, -7, -8, 13, -15, 2, 11, -13, 60, -64, -5, 10, 0, -21, 9, -8, -1, 62, -78, -2, 19, -1, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 65, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -58, -5, -11, 11, 1, -1, -20, 12, 53, -55, -17, 15, -20, 9, -6, -15, 3, 9, 4, -18, 67, -61, -7, -8, 13, -15, 2, 11, -13, 60, -65, -4, 9, -3, -9, 60, -21, -54, -1, 3, 23, -13, -13, -11, 14, 4, 26, -49, 15, -20, 9, -6, -15, 3, 9, 4, -18, 31, -21, -13, -1, -5, -4, 19, 10, -20, -16, -2, 8, -8, -1, 13, 24, -51, 15, -11, -8, 19, 11, -31, 1, -2, -5, -8, -1, 49, -52, -2, 8, 0, -9, -1, 6, -11, -8, 78, -15};
        private static final int $$e = 187;
        private static final byte[] $$a = {2, -84, 82, -15, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 189;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {60051, 60046, 60058, 60052, 59747, 60055, 59746, 60034, 60054, 60041, 60090, 60072, 59745, 59748, 60043, 59744, 60060, 60045, 60048, 60073, 60047, 60088, 60053, 60083, 60061, 60057, 59749, 60063, 60059, 60062, 60079, 60056, 60050, 60049, 60040, 60117};
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 57191;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainEmitLast.$$a
                int r7 = r7 + 4
                int r5 = r5 * 2
                int r5 = 84 - r5
                int r6 = r6 * 15
                int r1 = r6 + 38
                byte[] r1 = new byte[r1]
                int r6 = r6 + 37
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r5
                r5 = r6
                r4 = r2
                goto L2b
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r4 = r3 + 1
                int r7 = r7 + 1
                if (r3 != r6) goto L29
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L29:
                r3 = r0[r7]
            L2b:
                int r5 = r5 + r3
                int r5 = r5 + (-11)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainEmitLast.a(int, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001e  */
        /* JADX WARN: Code duplicated, block: B:8:0x0016  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001e -> B:11:0x0022). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001e
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
            /*
                int r5 = 99 - r5
                int r6 = r6 + 4
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainEmitLast.$$d
                int r1 = r7 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L10
                r4 = r7
                r3 = r2
                goto L22
            L10:
                r3 = r2
            L11:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r7) goto L1e
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L1e:
                r4 = r0[r6]
                int r3 = r3 + 1
            L22:
                int r4 = -r4
                int r5 = r5 + r4
                int r5 = r5 + (-2)
                int r6 = r6 + 1
                goto L11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainEmitLast.c(int, int, byte, java.lang.Object[]):void");
        }

        SampleMainEmitLast(deriveMediaType<? super T> derivemediatype, AutoValue_VideoValidatedEncoderProfilesProxy<?> autoValue_VideoValidatedEncoderProfilesProxy) {
            super(derivemediatype, autoValue_VideoValidatedEncoderProfilesProxy);
            this.wip = new AtomicInteger();
        }

        private static void b(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2;
            int i4 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            char c = '0';
            int i5 = 1770390596;
            Object obj2 = null;
            float f = 0.0f;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 17;
                    $10 = i7 % 128;
                    int i8 = i7 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i9 = (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 2266;
                            int iLastIndexOf = TextUtils.lastIndexOf("", c, 0, 0) + 34;
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, i9, iLastIndexOf, -1927765101, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i6++;
                        i3 = 2;
                        c = '0';
                        i5 = 1770390596;
                        f = 0.0f;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 2267, TextUtils.lastIndexOf("", '0', 0) + 34, -1927765101, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i10 = $11 + 35;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    i2 = i + 47;
                    cArr4[i2] = (char) (cArr[i2] << b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (49267 - (KeyEvent.getMaxKeyCode() >> 16)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3261, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, -127612708, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            int i11 = $11 + 69;
                            $10 = i11 % 128;
                            int i12 = i11 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), Color.blue(0) + 594, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, 1570859318, false, $$g(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i13 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i13];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i14 = $11 + 105;
                                $10 = i14 % 128;
                                int i15 = i14 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            } else {
                                int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            int i20 = 0;
            while (i20 < i) {
                int i21 = $11 + 89;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 3439);
                    i20 += 37;
                } else {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                    i20++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Type inference failed for: r2v105, types: [boolean, int] */
        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        final void TuitionPaymentFragmentbindingInflater1() throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2267;
                int packedPositionGroup = 33 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[7], bArr[132], bArr[5], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, longPressTimeout, packedPositionGroup, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            b(new char[]{4, 20, '!', 15, 2, '!', 29, '!', 4, '!', 5, 17, '\n', 31, 23, 26, '\t', 20, 0, 4, 30, 19}, (byte) (119 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 21 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(new char[]{'#', 11, '\b', 20, '#', 28, 25, 21, 26, 5, 2, 23, 2, 14, 13842}, (byte) (18 - ImageFormat.getBitsPerPixel(0)), 15 - View.combineMeasuredStates(0, 0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int iRgb = Color.rgb(0, 0, 0) + 16779483;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 34;
                byte[] bArr2 = $$a;
                byte b = bArr2[7];
                byte b2 = bArr2[132];
                Object[] objArr5 = new Object[1];
                a(b, b2, (byte) (b2 | 50), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iRgb, iLastIndexOf, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2267;
                    int iResolveOpacity = 33 - Drawable.resolveOpacity(0, 0);
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr6 = new Object[1];
                    a(b3, b4, (byte) (b4 | 103), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, maximumDrawingCacheSize, iResolveOpacity, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i6 = ((int[]) objArr7[0])[0];
                int i7 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i8 = (((-662107570) + (((~((-3411461) | (~elapsedCpuTime))) | (-805301856)) * (-591))) + ((elapsedCpuTime | (-3411461)) * 591)) - 1905902535;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[2])[0] = i10 ^ (i10 << 5);
                c = 3;
            } else {
                Object[] objArr8 = new Object[1];
                b(new char[]{4, 20, '!', 15, 2, '!', 29, '!', '\b', 20, 17, ' ', 7, Typography.quote, 26, 2, 14, '#', 19, '\b', 0, 6, 11, 27, 3, 26}, (byte) (40 - (ViewConfiguration.getTouchSlop() >> 8)), 26 - KeyEvent.getDeadChar(0, 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(new char[]{1, 7, 13873, 13873, 28, 23, 22, '\b', 13875, 13875, 2, '#', ' ', 1, 26, 2, 4, 21}, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 73), 18 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                b(new char[]{' ', 3, 14, 5, 5, 11, 4, 20, 17, Typography.quote, 6, '\b', ' ', 22, 26, 11}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 67), 15 - ImageFormat.getBitsPerPixel(0), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b(new char[]{'!', 26, 28, 23, 26, 2, 19, '\b', 20, 5, 30, 4, 27, '\t', 28, 24}, (byte) (51 - ExpandableListView.getPackedPositionChild(0L)), AndroidCharacter.getMirror('0') - ' ', objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -1905902535};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[5];
                    Object[] objArr13 = new Object[1];
                    c(b5, b5, bArr3[61], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    c(bArr3[63], bArr3[61], bArr3[21], objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i11 = TuitionPaymentFragmentbindingInflater1 + 65;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                        int i12 = i11 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int i13 = 2267 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 33;
                            byte b6 = $$a[7];
                            byte b7 = b6;
                            Object[] objArr16 = new Object[1];
                            a(b6, b7, (byte) (b7 | 103), objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(jumpTapTimeout, i13, keyRepeatDelay, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            b(new char[]{4, 20, '!', 15, 2, '!', 29, '!', 4, '!', 5, 17, '\n', 31, 23, 26, '\t', 20, 0, 4, 30, 19}, (byte) (119 - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.MeasureSpec.makeMeasureSpec(0, 0) + 22, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            b(new char[]{'#', 11, '\b', 20, '#', 28, 25, 21, 26, 5, 2, 23, 2, 14, 13842}, (byte) (Color.rgb(0, 0, 0) + 16777235), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                                int iResolveSize = View.resolveSize(0, 0) + 2267;
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
                                byte[] bArr4 = $$a;
                                byte b8 = bArr4[7];
                                byte b9 = bArr4[132];
                                Object[] objArr19 = new Object[1];
                                a(b8, b9, (byte) (b9 | 50), objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, iResolveSize, iIndexOf, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2267;
                                int offsetBefore = 33 - TextUtils.getOffsetBefore("", 0);
                                byte[] bArr5 = $$a;
                                Object[] objArr20 = new Object[1];
                                a(bArr5[7], bArr5[132], bArr5[5], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout, doubleTapTimeout2, offsetBefore, -887667012, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                    c = 3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[1];
                if (strArr2 == null) {
                    throw null;
                }
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                int i15 = i14 % 2;
                for (String str : strArr2) {
                    arrayList.add(str);
                }
                throw null;
            }
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
            TuitionPaymentFragmentbindingInflater1 = i16 % 128;
            int i17 = i16 % 2;
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[3])[0];
            String[] strArr3 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i21 = i18 + ((((~((-785700198) | iIdentityHashCode)) | 797701019) * 262) - 2017403705) + (((~((~iIdentityHashCode) | (-785700198))) | 797701019) * 262);
            int i22 = i21 ^ (i21 << 13);
            int i23 = i22 ^ (i22 >>> 17);
            Object obj = objArr21[2];
            ((int[]) obj)[0] = i23 ^ (i23 << 5);
            int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            TuitionPaymentFragmentbindingInflater1 = i24 % 128;
            int i25 = i24 % 2;
            int i26 = ((int[]) obj)[0];
            int i27 = i26 * i26;
            int i28 = -(72499394 * i26);
            int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
            int i30 = -(i26 * (-1017996894));
            int i31 = ((i29 & i30) + (i30 | i29)) - (-10198468);
            int i32 = i31 >> 20;
            int i33 = ((i32 ^ (-8191)) + ((i32 & (-8191)) << 1)) / 4096;
            int i34 = (i33 & 1) + (i33 | 1);
            int i35 = (i31 ^ i34) + ((i34 & i31) << 1);
            int i36 = i31 >> 24;
            int i37 = (((i36 | (-511)) << 1) - (i36 ^ (-511))) / 256;
            int i38 = -((((i37 | 1) << 1) - (i37 ^ 1)) ^ i35);
            int i39 = ((i38 | 5) << 1) - (i38 ^ 5);
            int i40 = (((i39 >> 26) + ComposerKt.defaultsKey) / 64) + 1;
            this.done = 3065 / (((-((i40 ^ 1) + ((i40 & 1) << 1))) & i39) * 613);
            if (this.wip.getAndIncrement() == 0) {
                T andSet = getAndSet(null);
                if (andSet != null) {
                    int i41 = TuitionPaymentFragmentbindingInflater1 + 19;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i41 % 128;
                    if (i41 % 2 == 0) {
                        this.downstream.onNext(andSet);
                        throw null;
                    }
                    this.downstream.onNext(andSet);
                }
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cRed = (char) Color.red(0);
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2267;
                int i2 = 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[7], bArr[132], bArr[5], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, longPressTimeout, i2, -887667012, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            b(new char[]{4, 20, '!', 15, 2, '!', 29, '!', 4, '!', 5, 17, '\n', 31, 23, 26, '\t', 20, 0, 4, 30, 19}, (byte) (119 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.rgb(0, 0, 0) + 16777238, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(new char[]{'#', 11, '\b', 20, '#', 28, 25, 21, 26, 5, 2, 23, 2, 14, 13842}, (byte) (TextUtils.getOffsetAfter("", 0) + 19), KeyEvent.normalizeMetaState(0) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int maximumFlingVelocity = 2267 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iRgb = Color.rgb(0, 0, 0) + 16777249;
                byte[] bArr2 = $$a;
                byte b = bArr2[7];
                byte b2 = bArr2[132];
                Object[] objArr5 = new Object[1];
                a(b, b2, (byte) (b2 | 50), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, maximumFlingVelocity, iRgb, -874156483, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char size = (char) View.MeasureSpec.getSize(0);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267;
                    int packedPositionGroup = 33 - ExpandableListView.getPackedPositionGroup(0L);
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr6 = new Object[1];
                    a(b3, b4, (byte) (b4 | 103), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, scrollBarFadeDuration, packedPositionGroup, -654680577, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i3 = ((int[]) objArr7[0])[0];
                int i4 = ((int[]) objArr7[3])[0];
                String[] strArr = (String[]) objArr7[1];
                int iNextInt = new Random().nextInt();
                int i5 = 2044066755 + (((~(648407431 | iNextInt)) | 160305884) * 672);
                int i6 = ~iNextInt;
                int i7 = i5 + (((~(iNextInt | 160305884)) | (~((-648407432) | i6))) * (-672)) + (((~((-160305885) | i6)) | 151655000) * 672) + 439166173;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                b(new char[]{4, 20, '!', 15, 2, '!', 29, '!', '\b', 20, 17, ' ', 7, Typography.quote, 26, 2, 14, '#', 19, '\b', 0, 6, 11, 27, 3, 26}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39), 26 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(new char[]{1, 7, 13873, 13873, 28, 23, 22, '\b', 13875, 13875, 2, '#', ' ', 1, 26, 2, 4, 21}, (byte) (72 - TextUtils.indexOf((CharSequence) "", '0')), ExpandableListView.getPackedPositionGroup(0L) + 18, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                b(new char[]{' ', 3, 14, 5, 5, 11, 4, 20, 17, Typography.quote, 6, '\b', ' ', 22, 26, 11}, (byte) (Drawable.resolveOpacity(0, 0) + 67), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b(new char[]{'!', 26, 28, 23, 26, 2, 19, '\b', 20, 5, 30, 4, 27, '\t', 28, 24}, (byte) (52 - TextUtils.indexOf("", "", 0, 0)), TextUtils.getTrimmedLength("") + 16, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 439166173};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[5];
                    short s = (short) (b5 | 96);
                    Object[] objArr13 = new Object[1];
                    c(b5, s, (byte) (s | 11), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[18];
                    Object[] objArr14 = new Object[1];
                    c(b6, (short) (b6 | 202), bArr3[5], objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i10 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2266;
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 34;
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr16 = new Object[1];
                            a(b7, b8, (byte) (b8 | 103), objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, i10, modifierMetaStateMask, -654680577, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            b(new char[]{4, 20, '!', 15, 2, '!', 29, '!', 4, '!', 5, 17, '\n', 31, 23, 26, '\t', 20, 0, 4, 30, 19}, (byte) (TextUtils.getCapsMode("", 0, 0) + 119), TextUtils.lastIndexOf("", '0') + 23, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            b(new char[]{'#', 11, '\b', 20, '#', 28, 25, 21, 26, 5, 2, 23, 2, 14, 13842}, (byte) (19 - TextUtils.indexOf("", "", 0, 0)), 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                                int keyRepeatTimeout = 2267 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int iMakeMeasureSpec = 33 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                byte[] bArr4 = $$a;
                                byte b9 = bArr4[7];
                                byte b10 = bArr4[132];
                                Object[] objArr19 = new Object[1];
                                a(b9, b10, (byte) (b10 | 50), objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, keyRepeatTimeout, iMakeMeasureSpec, -874156483, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                                int gidForName = Process.getGidForName("") + 2268;
                                int offsetBefore2 = 33 - TextUtils.getOffsetBefore("", 0);
                                byte[] bArr5 = $$a;
                                Object[] objArr20 = new Object[1];
                                a(bArr5[7], bArr5[132], bArr5[5], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror, gidForName, offsetBefore2, -887667012, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = ((int[]) objArr[3])[0];
            int i12 = ((int[]) objArr[0])[0];
            if (i12 == i11) {
                Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i13 = ((int[]) objArr[2])[0];
                int i14 = ((int[]) objArr[0])[0];
                int i15 = ((int[]) objArr[3])[0];
                String[] strArr2 = (String[]) objArr[1];
                int i16 = ~((int) Runtime.getRuntime().freeMemory());
                int i17 = i13 + 1942677307 + (((-126398801) | i16) * 184) + (((~(i16 | 409421455)) | (-262927196)) * 184);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr21[2])[0] = i19 ^ (i19 << 5);
                int i20 = TuitionPaymentFragmentbindingInflater1 + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 2 / 5;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[1];
                if (strArr3 != null) {
                    int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
                    TuitionPaymentFragmentbindingInflater1 = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = 0;
                    while (i24 < strArr3.length) {
                        arrayList.add(strArr3[i24]);
                        i24++;
                        int i25 = TuitionPaymentFragmentbindingInflater1 + 75;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                        int i26 = i25 % 2;
                    }
                }
                int[] iArr = new int[i12];
                int i27 = i12 - 1;
                iArr[i27] = 1;
                Toast.makeText((Context) null, iArr[((i12 * i27) % 2) - 1], 1).show();
                Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i28 = ((int[]) objArr[2])[0];
                int i29 = ((int[]) objArr[0])[0];
                int i30 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[1];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i31 = i28 + (-1753310829) + (((~((-961597186) | startUptimeMillis)) | 809504000) * 1504) + ((~(startUptimeMillis | (-152093186))) * (-1504)) + 543752912;
                int i32 = (i31 << 13) ^ i31;
                int i33 = i32 ^ (i32 >>> 17);
                ((int[]) objArr22[2])[0] = i33 ^ (i33 << 5);
            }
            if (this.wip.getAndIncrement() == 0) {
                do {
                    boolean z = this.done;
                    T andSet = getAndSet(null);
                    if (andSet != null) {
                        this.downstream.onNext(andSet);
                    }
                    if (z) {
                        int i34 = TuitionPaymentFragmentbindingInflater1 + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
                        int i35 = i34 % 2;
                        this.downstream.onComplete();
                        return;
                    }
                } while (this.wip.decrementAndGet() != 0);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r7, int r8, byte r9) {
            /*
                int r8 = r8 * 4
                int r8 = r8 + 1
                int r9 = r9 + 113
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainEmitLast.$$c
                int r7 = r7 * 2
                int r7 = 3 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2a
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                int r7 = r7 + 1
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r6
            L2a:
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainEmitLast.$$g(byte, int, byte):java.lang.String");
        }
    }
}

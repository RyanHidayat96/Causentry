package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.AutoValue_AudioSettings1;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.setVideoStabilizationMode;
import defpackage.usesAffectedSoc;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservablePublish<T> extends usesAffectedSoc<T> implements AutoValue_AudioSettings1<T> {
    private AtomicReference<b<T>> TuitionPaymentFragmentbindingInflater1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {107, 48, 57, 107};
    private static final int $$f = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {80, -8, 43, 65, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 203;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int g = 1;
    private static char[] b = {59882, 59903, 59891, 59886, 59903, 59877, 59876, 59848, 59813, 59903, 59877, 59886, 59903, 59877, 59876, 59880, 59813, 59887, 59874, 59876, 59897, 59887, 59877, 59708, 59745, 59745, 59728, 59728, 59749, 59751, 59749, 59745, 59753, 59757, 59745, 59749, 59771, 59731, 59729, 59751, 59757, 59712, 59802, 59802, 59785, 59785, 59806, 59800, 59806, 59802, 59778, 59782, 59802, 59806, 59804, 59764, 59733, 59775, 59806, 59773, 59763, 59795, 59803, 59800, 59795, 59806, 59803, 59748, 59771, 59782, 59800, 59804, 59801, 59803, 59781, 59704, 59746, 59757, 59759, 59750, 59734, 59849, 59811, 59818, 59851, 59828, 59826, 59831, 59828, 59853, 59848, 59824, 59831, 59819, 59819, 59828, 59848, 59855, 59822, 59810, 59853, 59848, 59848, 59823, 59818, 59848, 59855, 59817, 59716, 59705, 59747, 59756, 59754, 59759, 59756, 59749, 59744, 59752, 59759, 59714, 59717, 59771};

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = io.reactivex.internal.operators.observable.ObservablePublish.$$a
            int r1 = r5 + 1
            int r7 = 145 - r7
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            r4 = r0[r7]
            int r3 = r3 + 1
        L24:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r7 = r7 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservablePublish.d(byte, byte, int, java.lang.Object[]):void");
    }

    public static <T> usesAffectedSoc<T> b(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        int i = 2 % 2;
        AtomicReference atomicReference = new AtomicReference();
        ObservablePublish observablePublish = new ObservablePublish(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(atomicReference), autoValue_VideoValidatedEncoderProfilesProxy, atomicReference);
        int i2 = g + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return observablePublish;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ObservablePublish(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy2, AtomicReference<b<T>> atomicReference) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_VideoValidatedEncoderProfilesProxy2;
        this.TuitionPaymentFragmentbindingInflater1 = atomicReference;
    }

    @Override // defpackage.AutoValue_AudioSettings1
    public final AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 == 0) {
            autoValue_VideoValidatedEncoderProfilesProxy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i4 = 34 / 0;
        } else {
            autoValue_VideoValidatedEncoderProfilesProxy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i5 = i3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return autoValue_VideoValidatedEncoderProfilesProxy;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.subscribe(derivemediatype);
            throw null;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.subscribe(derivemediatype);
        int i3 = g + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.usesAffectedSoc
    public final void TuitionPaymentFragmentbindingInflater1(logToString<? super BufferProviderState> logtostring) {
        b<T> bVar;
        int i = 2 % 2;
        while (true) {
            bVar = this.TuitionPaymentFragmentbindingInflater1.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b<T> bVar2 = new b<>(this.TuitionPaymentFragmentbindingInflater1);
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentbindingInflater1, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z = false;
        if (!bVar.TuitionPaymentFragmentbindingInflater1.get()) {
            int i2 = g + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (bVar.TuitionPaymentFragmentbindingInflater1.compareAndSet(false, true)) {
                z = true;
            }
        }
        try {
            logtostring.accept(bVar);
            if (z) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
                g = i4 % 128;
                int i5 = i4 % 2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subscribe(bVar);
                int i6 = g + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 4;
                }
            }
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T> implements deriveMediaType<T>, BufferProviderState {
        private AtomicReference<b<T>> b;
        private static InnerDisposable[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new InnerDisposable[0];
        static final InnerDisposable[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new InnerDisposable[0];
        private AtomicReference<BufferProviderState> g = new AtomicReference<>();
        final AtomicReference<InnerDisposable<T>[]> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicReference<>(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        final AtomicBoolean TuitionPaymentFragmentbindingInflater1 = new AtomicBoolean();

        b(AtomicReference<b<T>> atomicReference) {
            this.b = atomicReference;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            AtomicReference<InnerDisposable<T>[]> atomicReference = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            InnerDisposable<T>[] innerDisposableArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (atomicReference.getAndSet(innerDisposableArr) != innerDisposableArr) {
                PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.b, this, null);
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.g);
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get() == TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.g, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            for (InnerDisposable<T> innerDisposable : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get()) {
                innerDisposable.child.onNext(t);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.b, this, null);
            InnerDisposable<T>[] andSet = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (andSet.length != 0) {
                for (InnerDisposable<T> innerDisposable : andSet) {
                    innerDisposable.child.onError(th);
                }
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.b, this, null);
            for (InnerDisposable<T> innerDisposable : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAndSet(TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                innerDisposable.child.onComplete();
            }
        }

        final void TuitionPaymentFragmentbindingInflater1(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
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
            } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, innerDisposableArr, innerDisposableArr2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x026d  */
    /* JADX WARN: Code duplicated, block: B:64:0x026e  */
    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        Throwable cause;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = 1;
        int i7 = iArr[1];
        int i8 = iArr[2];
        int i9 = iArr[3];
        char[] cArr2 = b;
        int i10 = 5;
        if (cArr2 != null) {
            int i11 = $10 + 89;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = new Object[i6];
                    objArr2[i4] = Integer.valueOf(cArr2[i2]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i10;
                        byte b3 = (byte) (b2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", i4), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1269, (KeyEvent.getMaxKeyCode() >> 16) + 18, 407021364, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i2++;
                    int i12 = $10 + 101;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 0;
                    i6 = 1;
                    i10 = 5;
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 == null) {
                        throw th;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i7];
        System.arraycopy(cArr2, i5, cArr3, 0, i7);
        if (bArr != null) {
            char[] cArr4 = new char[i7];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i7) {
                int i14 = $11 + 39;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i16 = $11 + 59;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i17 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 3225 - (ViewConfiguration.getTapTimeout() >> 16), '=' - AndroidCharacter.getMirror('0'), 2133916302, false, $$g((byte) 6, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i17] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i18 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 3225 - Drawable.resolveOpacity(0, 0), KeyEvent.normalizeMetaState(0) + 13, 2133916302, false, $$g((byte) 6, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i18] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                            throw th2;
                        }
                        throw cause;
                    }
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                int i19 = setvideostabilizationmode.b;
                Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                    int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0');
                    int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte length2 = (byte) $$c.length;
                    byte b6 = (byte) (length2 - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(touchSlop, iLastIndexOf, iIndexOf, 387247676, false, $$g(length2, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[i19] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                c = cArr4[setvideostabilizationmode.b];
                try {
                    Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 41242), 1705 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 20 - TextUtils.lastIndexOf("", '0', 0), -1434471773, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr4;
        }
        if (i9 > 0) {
            char[] cArr5 = new char[i7];
            i = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i7);
            int i20 = i7 - i9;
            System.arraycopy(cArr5, 0, cArr3, i20, i9);
            System.arraycopy(cArr5, i9, cArr3, 0, i20);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i7];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr3[(i7 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            int i21 = $10 + 67;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                int i22 = 3 % 5;
            }
            cArr3 = cArr6;
        }
        if (i8 > 0) {
            int i23 = 0;
            while (true) {
                setvideostabilizationmode.b = i23;
                if (setvideostabilizationmode.b >= i7) {
                    break;
                }
                int i24 = $10 + 123;
                $11 = i24 % 128;
                int i25 = i24 % 2;
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                i23 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class InnerDisposable<T> extends AtomicReference<Object> implements BufferProviderState {
        private static final long serialVersionUID = -1100270633763673112L;
        final deriveMediaType<? super T> child;

        InnerDisposable(deriveMediaType<? super T> derivemediatype) {
            this.child = derivemediatype;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get() == this;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((b) andSet).TuitionPaymentFragmentbindingInflater1(this);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements AutoValue_VideoValidatedEncoderProfilesProxy<T> {
        private final AtomicReference<b<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(AtomicReference<b<T>> atomicReference) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = atomicReference;
        }

        @Override // defpackage.AutoValue_VideoValidatedEncoderProfilesProxy
        public final void subscribe(deriveMediaType<? super T> derivemediatype) {
            b<T> bVar;
            InnerDisposable<T> innerDisposable = new InnerDisposable<>(derivemediatype);
            derivemediatype.onSubscribe(innerDisposable);
            loop0: while (true) {
                bVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
                if (bVar == null || bVar.isDisposed()) {
                    b<T> bVar2 = new b<>(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bVar, bVar2)) {
                        bVar = bVar2;
                    } else {
                        continue;
                    }
                }
                while (true) {
                    InnerDisposable<T>[] innerDisposableArr = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
                    if (innerDisposableArr == b.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        break;
                    }
                    int length = innerDisposableArr.length;
                    InnerDisposable[] innerDisposableArr2 = new InnerDisposable[length + 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                    innerDisposableArr2[length] = innerDisposable;
                    if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1, innerDisposableArr, innerDisposableArr2)) {
                        break loop0;
                    }
                }
            }
            if (innerDisposable.compareAndSet(null, bVar)) {
                return;
            }
            bVar.TuitionPaymentFragmentbindingInflater1(innerDisposable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e6 A[Catch: Exception -> 0x0397, TRY_LEAVE, TryCatch #1 {Exception -> 0x0397, blocks: (B:43:0x01df, B:45:0x01e6), top: B:99:0x01df }] */
    /* JADX WARN: Code duplicated, block: B:48:0x020d A[Catch: all -> 0x02ef, TryCatch #5 {all -> 0x02ef, blocks: (B:46:0x0200, B:48:0x020d, B:49:0x0247), top: B:107:0x0200, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x02fa A[Catch: Exception -> 0x0399, TRY_LEAVE, TryCatch #0 {Exception -> 0x0399, blocks: (B:51:0x02cc, B:53:0x02f0, B:55:0x02f8, B:56:0x02f9, B:57:0x02fa, B:62:0x0384, B:67:0x038f, B:69:0x0395, B:70:0x0396, B:58:0x0327, B:60:0x0334, B:61:0x037d, B:46:0x0200, B:48:0x020d, B:49:0x0247), top: B:98:0x01e4, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0334 A[Catch: all -> 0x038e, TryCatch #4 {all -> 0x038e, blocks: (B:58:0x0327, B:60:0x0334, B:61:0x037d), top: B:105:0x0327, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x038b  */
    /* JADX WARN: Code duplicated, block: B:65:0x038c  */
    /* JADX WARN: Code duplicated, block: B:75:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:77:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:80:0x03db  */
    /* JADX WARN: Code duplicated, block: B:90:0x0517  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        ?? r25;
        int i6;
        Object[] objArr;
        int[] iArr;
        int i7;
        ?? r26;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i15 = 2 % 2;
        Object obj = null;
        if (context != 0) {
            int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i17 = ((i16 | 29) << 1) - (i16 ^ 29);
            g = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 48 / 0;
            }
            try {
                Object[] objArr3 = new Object[1];
                a(null, new int[]{0, 23, 128, 1}, true, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(new byte[]{1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0}, new int[]{23, 18, 0, 0}, true, objArr4);
                Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(context, null);
                Object[] objArr5 = new Object[1];
                a(new byte[]{0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{41, 34, 39, 0}, true, objArr5);
                Class<?> cls2 = Class.forName((String) objArr5[0]);
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i20 = (i19 & 119) + (i19 | 119);
                g = i20 % 128;
                int i21 = i20 % 2;
                Object[] objArr6 = new Object[1];
                a(new byte[]{0, 0, 1, 0, 0}, new int[]{75, 5, 0, 0}, false, objArr6);
                int i22 = cls2.getField((String) objArr6[0]).getInt(objInvoke) & 2;
                int i23 = g;
                int i24 = (i23 & 5) + (i23 | 5);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                int i25 = i24 % 2;
                int i26 = (i & (-2)) | ((~i) & 1);
                int i27 = -i22;
                int i28 = ((i22 & i27) | (i22 ^ i27)) >> 31;
                int i29 = (i23 & 67) + (i23 | 67);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i29 % 128;
                if (i29 % 2 != 0) {
                    throw null;
                }
                int i30 = (~i28) & i;
                int i31 = i28 & i26;
                int i32 = (i31 & i30) | (i30 ^ i31);
                int i33 = i23 + 43;
                int i34 = i33 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i34;
                if (i33 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i35 = i34 + 57;
                g = i35 % 128;
                int i36 = i35 % 2;
                i4 = i32;
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
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 16949);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2739;
                int iIndexOf = 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte b2 = $$a[132];
                Object[] objArr7 = new Object[1];
                d((byte) 52, b2, (short) (b2 | 140), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, jumpTapTimeout, iIndexOf, 1501733736, false, (String) objArr7[0], new Class[0]);
            }
            Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "") + 16949);
                int packedPositionChild = 2738 - ExpandableListView.getPackedPositionChild(0L);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 13;
                byte b3 = $$a[132];
                Object[] objArr8 = new Object[1];
                d((byte) 52, b3, (short) (b3 | 88), objArr8);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, packedPositionChild, iMakeMeasureSpec, 47863026, false, (String) objArr8[0], null);
            }
            if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 16949);
                    int i37 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2739;
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13;
                    byte b4 = $$a[132];
                    Object[] objArr9 = new Object[1];
                    d((byte) 37, b4, (short) (b4 | 36), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, i37, keyRepeatDelay, 631063962, false, (String) objArr9[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                    if (Build.VERSION.SDK_INT > 33) {
                        Object[] objArr10 = new Object[1];
                        a(new byte[]{1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{80, 28, 88, 0}, true, objArr10);
                        Object[] objArr11 = {(String) objArr10[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                            int i38 = 994 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int iIndexOf2 = 7 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            byte b5 = $$a[7];
                            byte b6 = b5;
                            Object[] objArr12 = new Object[1];
                            d(b5, b6, b6, objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, i38, iIndexOf2, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                        }
                        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr11)).longValue();
                        long j = 1543240553;
                        long j2 = i;
                        r26 = i4;
                        long j3 = -1;
                        long j4 = j2 ^ j3;
                        long j5 = 521;
                        long j6 = j ^ j3;
                        long j7 = (((long) 522) * j) + (((long) (-520)) * jLongValue) + (((long) (-1042)) * (j | ((j4 | jLongValue) ^ j3))) + ((jLongValue | j2) * j5) + (j5 * (((j6 | (jLongValue ^ j3)) ^ j3) | ((j6 | j2) ^ j3) | (j3 ^ (jLongValue | (j4 | j))))) + ((long) (-1744158790));
                        int i39 = ~i;
                        int i40 = ~((-693792288) | i39);
                        int i41 = ((int) (j7 >> 32)) & ((-1637013382) + ((687882762 | i40) * (-712)) + (((~(i39 | (-687882763))) | (~((-5909526) | i))) * (-712)) + (((-2131018699) | i40) * 712));
                        int i42 = (int) j7;
                        int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i44 = (i43 & 67) + (i43 | 67);
                        g = i44 % 128;
                        int i45 = i44 % 2;
                        int iMyTid = Process.myTid();
                        i7 = i41 | (i42 & ((-931374998) + (((-1342243209) | iMyTid) * (-381)) + (((~((~iMyTid) | (-1388685721))) | (-1344341386)) * 381) + 293554024));
                    } else {
                        context = i4;
                        Object[] objArr13 = new Object[1];
                        a(null, new int[]{108, 1, 30, 1}, true, objArr13);
                        str = (String) objArr13[0];
                        Object[] objArr14 = new Object[1];
                        a(new byte[]{1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1}, new int[]{109, 13, 0, 13}, true, objArr14);
                        objArr2 = new Object[]{(String) objArr14[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char threadPriority = (char) (33602 - ((Process.getThreadPriority(0) + 20) >> 6));
                            int iMyPid = (Process.myPid() >> 22) + 3085;
                            int i46 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte b7 = $$a[7];
                            byte b8 = b7;
                            Object[] objArr15 = new Object[1];
                            d(b7, b8, b8, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, iMyPid, i46, 1411172903, false, (String) objArr15[0], new Class[]{String.class});
                        }
                        if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                            i7 = 0;
                            r26 = context;
                        } else {
                            i7 = 1;
                            r26 = context;
                        }
                    }
                    int i47 = (i & (-11)) | ((~i) & 10);
                    int i48 = -i7;
                    i8 = (i7 & i48) | (i7 ^ i48);
                    i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    i10 = i9 + 19;
                    g = i10 % 128;
                    if (i10 % 2 == 0) {
                        i11 = (i8 ^ (-31)) + ((i8 & (-31)) << 1);
                    } else {
                        i11 = i8 >> 31;
                    }
                    int i49 = (~i11) & i;
                    int i50 = i47 & i11;
                    i12 = (i49 & i50) | (i49 ^ i50);
                    int i51 = i2 & 32;
                    int i52 = -i51;
                    i13 = ((i51 & i52) | (i51 ^ i52)) >> 31;
                    i14 = (i9 ^ 111) + ((i9 & 111) << 1);
                    g = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    int i53 = i12 & (~i13);
                    int i54 = i13 & i;
                    i5 = (i53 & i54) | (i53 ^ i54);
                    int i55 = i9 + 101;
                    g = i55 % 128;
                    int i56 = i55 % 2;
                    r25 = r26;
                } else if (Build.VERSION.SDK_INT == 30) {
                    i5 = i;
                    r25 = i4;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        Object[] objArr16 = new Object[1];
                        a(new byte[]{1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{80, 28, 88, 0}, true, objArr16);
                        Object[] objArr17 = {(String) objArr16[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
                            int i310 = 994 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int iIndexOf3 = 7 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr18 = new Object[1];
                            d(b9, b10, b10, objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror2, i310, iIndexOf3, 410748506, false, (String) objArr18[0], new Class[]{String.class});
                        }
                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr17)).longValue();
                        long j8 = 1543240553;
                        long j9 = i;
                        r26 = i4;
                        long j10 = -1;
                        long j11 = j9 ^ j10;
                        long j12 = 521;
                        long j13 = j8 ^ j10;
                        long j14 = (((long) 522) * j8) + (((long) (-520)) * jLongValue2) + (((long) (-1042)) * (j8 | ((j11 | jLongValue2) ^ j10))) + ((jLongValue2 | j9) * j12) + (j12 * (((j13 | (jLongValue2 ^ j10)) ^ j10) | ((j13 | j9) ^ j10) | (j10 ^ (jLongValue2 | (j11 | j8))))) + ((long) (-1744158790));
                        int i311 = ~i;
                        int i410 = ~((-693792288) | i311);
                        int i411 = ((int) (j14 >> 32)) & ((-1637013382) + ((687882762 | i410) * (-712)) + (((~(i311 | (-687882763))) | (~((-5909526) | i))) * (-712)) + (((-2131018699) | i410) * 712));
                        int i412 = (int) j14;
                        int i413 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i414 = (i413 & 67) + (i413 | 67);
                        g = i414 % 128;
                        int i415 = i414 % 2;
                        int iMyTid2 = Process.myTid();
                        i7 = i411 | (i412 & ((-931374998) + (((-1342243209) | iMyTid2) * (-381)) + (((~((~iMyTid2) | (-1388685721))) | (-1344341386)) * 381) + 293554024));
                    } else {
                        context = i4;
                        Object[] objArr19 = new Object[1];
                        a(null, new int[]{108, 1, 30, 1}, true, objArr19);
                        str = (String) objArr19[0];
                        Object[] objArr110 = new Object[1];
                        a(new byte[]{1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1}, new int[]{109, 13, 0, 13}, true, objArr110);
                        objArr2 = new Object[]{(String) objArr110[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char threadPriority2 = (char) (33602 - ((Process.getThreadPriority(0) + 20) >> 6));
                            int iMyPid2 = (Process.myPid() >> 22) + 3085;
                            int i416 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte b11 = $$a[7];
                            byte b12 = b11;
                            Object[] objArr111 = new Object[1];
                            d(b11, b12, b12, objArr111);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority2, iMyPid2, i416, 1411172903, false, (String) objArr111[0], new Class[]{String.class});
                        }
                        if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                            i7 = 0;
                            r26 = context;
                        } else {
                            i7 = 1;
                            r26 = context;
                        }
                    }
                    int i417 = (i & (-11)) | ((~i) & 10);
                    int i418 = -i7;
                    i8 = (i7 & i418) | (i7 ^ i418);
                    i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    i10 = i9 + 19;
                    g = i10 % 128;
                    if (i10 % 2 == 0) {
                        i11 = (i8 ^ (-31)) + ((i8 & (-31)) << 1);
                    } else {
                        i11 = i8 >> 31;
                    }
                    int i419 = (~i11) & i;
                    int i57 = i417 & i11;
                    i12 = (i419 & i57) | (i419 ^ i57);
                    int i58 = i2 & 32;
                    int i59 = -i58;
                    i13 = ((i58 & i59) | (i58 ^ i59)) >> 31;
                    i14 = (i9 ^ 111) + ((i9 & 111) << 1);
                    g = i14 % 128;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    int i510 = i12 & (~i13);
                    int i511 = i13 & i;
                    i5 = (i510 & i511) | (i510 ^ i511);
                    int i512 = i9 + 101;
                    g = i512 % 128;
                    int i513 = i512 % 2;
                    r25 = r26;
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                i5 = i;
                r25 = i4;
            } else {
                try {
                    try {
                        if (Build.VERSION.SDK_INT > 33) {
                            Object[] objArr112 = new Object[1];
                            a(new byte[]{1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{80, 28, 88, 0}, true, objArr112);
                            try {
                                Object[] objArr113 = {(String) objArr112[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char mirror3 = (char) (AndroidCharacter.getMirror('0') - '0');
                                    int i312 = 994 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    int iIndexOf4 = 7 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                    byte b13 = $$a[7];
                                    byte b14 = b13;
                                    Object[] objArr114 = new Object[1];
                                    d(b13, b14, b14, objArr114);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror3, i312, iIndexOf4, 410748506, false, (String) objArr114[0], new Class[]{String.class});
                                }
                                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr113)).longValue();
                                long j15 = 1543240553;
                                long j16 = i;
                                r26 = i4;
                                long j17 = -1;
                                long j18 = j16 ^ j17;
                                long j19 = 521;
                                long j110 = j15 ^ j17;
                                long j111 = (((long) 522) * j15) + (((long) (-520)) * jLongValue3) + (((long) (-1042)) * (j15 | ((j18 | jLongValue3) ^ j17))) + ((jLongValue3 | j16) * j19) + (j19 * (((j110 | (jLongValue3 ^ j17)) ^ j17) | ((j110 | j16) ^ j17) | (j17 ^ (jLongValue3 | (j18 | j15))))) + ((long) (-1744158790));
                                int i313 = ~i;
                                int i4110 = ~((-693792288) | i313);
                                int i4111 = ((int) (j111 >> 32)) & ((-1637013382) + ((687882762 | i4110) * (-712)) + (((~(i313 | (-687882763))) | (~((-5909526) | i))) * (-712)) + (((-2131018699) | i4110) * 712));
                                int i4112 = (int) j111;
                                int i4113 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                int i4114 = (i4113 & 67) + (i4113 | 67);
                                g = i4114 % 128;
                                int i4115 = i4114 % 2;
                                int iMyTid3 = Process.myTid();
                                i7 = i4111 | (i4112 & ((-931374998) + (((-1342243209) | iMyTid3) * (-381)) + (((~((~iMyTid3) | (-1388685721))) | (-1344341386)) * 381) + 293554024));
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } else {
                            context = i4;
                            Object[] objArr115 = new Object[1];
                            a(null, new int[]{108, 1, 30, 1}, true, objArr115);
                            str = (String) objArr115[0];
                            Object[] objArr116 = new Object[1];
                            a(new byte[]{1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1}, new int[]{109, 13, 0, 13}, true, objArr116);
                            try {
                                objArr2 = new Object[]{(String) objArr116[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char threadPriority3 = (char) (33602 - ((Process.getThreadPriority(0) + 20) >> 6));
                                    int iMyPid3 = (Process.myPid() >> 22) + 3085;
                                    int i4116 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                    byte b15 = $$a[7];
                                    byte b16 = b15;
                                    Object[] objArr117 = new Object[1];
                                    d(b15, b16, b16, objArr117);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority3, iMyPid3, i4116, 1411172903, false, (String) objArr117[0], new Class[]{String.class});
                                }
                                if (!str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2))) {
                                    i7 = 0;
                                    r26 = context;
                                } else {
                                    i7 = 1;
                                    r26 = context;
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
                    }
                } catch (Exception unused2) {
                    context = i4;
                }
                int i4117 = (i & (-11)) | ((~i) & 10);
                int i4118 = -i7;
                i8 = (i7 & i4118) | (i7 ^ i4118);
                i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                i10 = i9 + 19;
                g = i10 % 128;
                if (i10 % 2 == 0) {
                    i11 = (i8 ^ (-31)) + ((i8 & (-31)) << 1);
                } else {
                    i11 = i8 >> 31;
                }
                int i4119 = (~i11) & i;
                int i514 = i4117 & i11;
                i12 = (i4119 & i514) | (i4119 ^ i514);
                int i515 = i2 & 32;
                int i516 = -i515;
                i13 = ((i515 & i516) | (i515 ^ i516)) >> 31;
                i14 = (i9 ^ 111) + ((i9 & 111) << 1);
                g = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
                int i517 = i12 & (~i13);
                int i518 = i13 & i;
                i5 = (i517 & i518) | (i517 ^ i518);
                int i519 = i9 + 101;
                g = i519 % 128;
                int i5110 = i519 % 2;
                r25 = r26;
            }
            int i60 = (~((i & r25) == true ? 1 : 0)) & ((i | r25) == true ? 1 : 0);
            int i61 = (i60 | (-i60)) >> 31;
            int i62 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i63 = (i62 & 123) + (i62 | 123);
            int i64 = i63 % 128;
            g = i64;
            char c = 4;
            if (i63 % 2 == 0) {
                i6 = (i5 & (~i61)) | (r25 & i61);
                objArr = new Object[2];
                objArr[1] = new int[1];
                objArr[1] = new int[0];
                iArr = new int[1];
            } else {
                int i65 = i5 & (~i61);
                int i66 = r25 & i61;
                i6 = (i65 & i66) | (i65 ^ i66);
                objArr = new Object[4];
                objArr[0] = new int[1];
                objArr[1] = new int[1];
                iArr = new int[1];
                c = 2;
            }
            objArr[c] = iArr;
            int i67 = (~(i & i6)) & (i | i6);
            int i68 = -i67;
            int i69 = (((i67 & i68) | (i67 ^ i68)) >> 31) & 16;
            ((int[]) objArr[0])[0] = i;
            int[] iArr2 = (int[]) objArr[2];
            int i70 = ((i64 | 17) << 1) - (i64 ^ 17);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i70 % 128;
            int i71 = i70 % 2;
            iArr2[0] = i6;
            objArr[3] = null;
            int iMyUid = Process.myUid();
            int i72 = (~(488626804 | iMyUid)) | 41951241;
            int i73 = ~iMyUid;
            int i74 = 145514510 + ((i72 | (~((-1641013) | i73))) * 886) + (((~(i73 | (-488626805))) | 528937033) * (-1772)) + ((~(i73 | 528937033)) * 886);
            int i75 = i69 * (-500);
            int i76 = i74 * (-500);
            int i77 = (i75 & i76) + (i75 | i76);
            int i78 = ~i74;
            int i79 = ~(i78 | i69);
            int i80 = ~i69;
            int i81 = ~((i80 ^ i74) | (i80 & i74) | i);
            int i82 = ((i77 - (~(-(-(((i79 & i81) | (i79 ^ i81)) * TypedValues.PositionType.TYPE_TRANSITION_EASING))))) - 1) + ((~((i78 & i80) | (i80 ^ i78))) * 1002);
            int i83 = ~i;
            int i84 = (i83 & i80) | (i80 ^ i83);
            int i85 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
            g = i85 % 128;
            if (i85 % 2 == 0) {
                int i86 = i3 - (i82 << (TypedValues.PositionType.TYPE_TRANSITION_EASING >> (~((i84 & i74) | (i84 ^ i74)))));
                int i87 = i86 % 61;
                int i88 = ((~i86) & i87) | ((~i87) & i86);
                int i89 = i88 * 93;
                int i90 = (i88 | i89) & (~(i88 & i89));
                int i91 = i90 % 3;
                ((int[]) objArr[1])[1] = ((~i90) & i91) | ((~i91) & i90);
            } else {
                int i92 = (i3 - (~(-(-(i82 + ((~((i84 & i74) | (i84 ^ i74))) * TypedValues.PositionType.TYPE_TRANSITION_EASING)))))) - 1;
                int i93 = i92 << 13;
                int i94 = (i92 | i93) & (~(i92 & i93));
                int i95 = i94 ^ (i94 >>> 17);
                int i96 = i95 << 5;
                ((int[]) objArr[1])[0] = ((~i95) & i96) | ((~i96) & i95);
            }
            return objArr;
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, short r8) {
        /*
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r1 = io.reactivex.internal.operators.observable.ObservablePublish.$$c
            int r6 = 105 - r6
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r7 = r7 + r4
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservablePublish.$$g(byte, short, short):java.lang.String");
    }
}

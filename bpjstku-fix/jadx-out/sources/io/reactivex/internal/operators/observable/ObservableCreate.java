package io.reactivex.internal.operators.observable;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.data.promo.model.response.ProvinceItem;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.getDefaultAudioProfile;
import defpackage.getSupportedPostviewSize;
import defpackage.getVideoOutput;
import defpackage.initSession;
import defpackage.readableUs;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableCreate<T> extends VideoRecordEventStart<T> {
    private getVideoOutput<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableCreate(getVideoOutput<T> getvideooutput) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getvideooutput;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        CreateEmitter createEmitter = new CreateEmitter(derivemediatype);
        derivemediatype.onSubscribe(createEmitter);
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subscribe(createEmitter);
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            if (createEmitter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }
    }

    static final class CreateEmitter<T> extends AtomicReference<BufferProviderState> implements getDefaultAudioProfile<T>, BufferProviderState {
        private static final long serialVersionUID = -3434801548987643227L;
        final deriveMediaType<? super T> observer;
        private static final byte[] $$c = {88, 99, -94, -58};
        private static final int $$d = 37;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {48, -119, -71, 110, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
        private static final int $$b = 246;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int g = 1;
        private static char[] b = {47318, 47305, 47315, 47301, 47304, 47310, 47241, 47300, 47268, 47358, 47299, 47314, 47306, 47284, 47307, 47316, 47308, 47303, 47269, 47309, 47297, 47312, 47279, 47311};
        private static int TuitionPaymentFragmentbindingInflater1 = 2047719543;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 + 4
                int r0 = r7 + 1
                int r6 = r6 * 14
                int r6 = 98 - r6
                byte[] r1 = io.reactivex.internal.operators.observable.ObservableCreate.CreateEmitter.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L12
                r4 = r7
                r3 = r2
                goto L26
            L12:
                r3 = r2
            L13:
                int r5 = r5 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L22:
                int r3 = r3 + 1
                r4 = r1[r5]
            L26:
                int r6 = r6 + r4
                int r6 = r6 + (-11)
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCreate.CreateEmitter.a(int, short, byte, java.lang.Object[]):void");
        }

        CreateEmitter(deriveMediaType<? super T> derivemediatype) {
            this.observer = derivemediatype;
        }

        @Override // defpackage.getRecordingStats
        public final void TuitionPaymentFragmentbindingInflater1(T t) {
            int i = 2 % 2;
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!(!TuitionPaymentFragmentspecialinlinedviewModeldefault1(nullPointerException))) {
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nullPointerException);
                return;
            }
            if (isDisposed()) {
                return;
            }
            int i2 = g + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            this.observer.onNext(t);
            int i4 = g + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // defpackage.getRecordingStats
        public final void TuitionPaymentFragmentbindingInflater1(Throwable th) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
            g = i2 % 128;
            int i3 = i2 % 2;
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
                g = i4 % 128;
                int i5 = i4 % 2;
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                if (i5 == 0) {
                    int i6 = 30 / 0;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0017  */
        @Override // defpackage.getDefaultAudioProfile
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 27 / 0;
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
            } else if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (!(!isDisposed())) {
                return false;
            }
            try {
                this.observer.onError(th);
                dispose();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
                g = i4 % 128;
                if (i4 % 2 != 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        @Override // defpackage.getRecordingStats
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = 2 % 2;
            int i2 = g + 77;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (!isDisposed()) {
                int i4 = g + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    this.observer.onComplete();
                    return;
                } finally {
                    dispose();
                }
            }
            int i6 = g + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 25 / 0;
            }
        }

        @Override // defpackage.getDefaultAudioProfile
        public final void b(BufferProviderState bufferProviderState) {
            int i = 2 % 2;
            int i2 = g + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, bufferProviderState);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
            g = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // defpackage.getDefaultAudioProfile
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(readableUs readableus) {
            int i = 2 % 2;
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, new CancellableDisposable(readableus));
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 13 / 0;
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            int i2 = g + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            int i4 = g + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2;
            int i3 = 2 % 2;
            getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
            char[] cArr3 = b;
            long j = 0;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i4 = $11 + 85;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $10 + 123;
                    $11 = i7 % 128;
                    int i8 = i7 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31340 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2994, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i6++;
                        i2 = 2;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i9 = $10 + 97;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 252, TextUtils.getTrimmedLength("") + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
            int i11 = 33602;
            int i12 = 1687675375;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                int i13 = $11 + 121;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                } else {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                }
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                    Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cNormalizeMetaState = (char) (i11 - KeyEvent.normalizeMetaState(0));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 3086;
                        int i14 = 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        byte b4 = (byte) ($$d & 3);
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, packedPositionChild, i14, -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i11 = 33602;
                }
                objArr[0] = new String(cArr2);
                return;
            }
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                    cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i15 = $10 + 97;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i17 = $10 + 103;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i19 = $11 + 41;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 % 0) >> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] << i] >> iIntValue);
                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i12);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char tapTimeout = (char) (33602 - (ViewConfiguration.getTapTimeout() >> 16));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 3085;
                        int iIndexOf = 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte b6 = (byte) ($$d & 3);
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(tapTimeout, windowTouchSlop, iIndexOf, -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } else {
                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cBlue = (char) (33602 - Color.blue(0));
                        int iAlpha = 3085 - Color.alpha(0);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 26;
                        byte b8 = (byte) ($$d & 3);
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, iAlpha, iCombineMeasuredStates, -2146875848, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                i12 = 1687675375;
            }
            objArr[0] = new String(cArr6);
        }

        @Override // defpackage.getDefaultAudioProfile, defpackage.BufferProviderState
        public final boolean isDisposed() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cLastIndexOf = (char) (29943 - TextUtils.lastIndexOf("", '0', 0));
                int trimmedLength = TextUtils.getTrimmedLength("") + 1755;
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
                byte[] bArr = $$a;
                short s = bArr[5];
                byte b2 = bArr[28];
                Object[] objArr2 = new Object[1];
                a(s, b2, (byte) (b2 | 36), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, trimmedLength, packedPositionGroup, 986134021, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(null, null, 126 - ImageFormat.getBitsPerPixel(0), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(null, null, KeyEvent.keyCodeFromString("") + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int i2 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1755;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                int i3 = $$b;
                Object[] objArr5 = new Object[1];
                a((short) (i3 & 45), $$a[28], (byte) (i3 & 61), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, i2, iLastIndexOf, 1596667560, false, (String) objArr5[0], null);
            }
            if (j != ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object[] objArr6 = new Object[1];
                c(null, null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, objArr6);
                Class<?> cls2 = Class.forName((String) objArr6[0]);
                Object[] objArr7 = new Object[1];
                c(null, null, ExpandableListView.getPackedPositionGroup(0L) + 127, new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, objArr7);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr8 = {-478606917};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 42049), TextUtils.getOffsetBefore("", 0) + 1726, TextUtils.indexOf((CharSequence) "", '0') + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113 = ProvinceItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr8), 379940596, false, true);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 29944);
                        int iIndexOf = TextUtils.indexOf("", "") + 1755;
                        int i4 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        Object[] objArr9 = new Object[1];
                        a((short) 88, $$a[28], (byte) ($$b & 61), objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, iIndexOf, i4, 1599039318, false, (String) objArr9[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113);
                    try {
                        Object[] objArr10 = new Object[1];
                        c(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        c(null, null, 126 - ImageFormat.getBitsPerPixel(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr11);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cAxisFromString = (char) (29943 - MotionEvent.axisFromString(""));
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1755;
                            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 24;
                            int i5 = $$b;
                            Object[] objArr12 = new Object[1];
                            a((short) (i5 & 45), $$a[28], (byte) (i5 & 61), objArr12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, maximumDrawingCacheSize, iLastIndexOf2, 1596667560, false, (String) objArr12[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16807160);
                            int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 23;
                            byte[] bArr2 = $$a;
                            short s2 = bArr2[5];
                            byte b3 = bArr2[28];
                            Object[] objArr13 = new Object[1];
                            a(s2, b3, (byte) (b3 | 36), objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, packedPositionType, edgeSlop, 986134021, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$7879113;
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
            } else {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
                g = i6 % 128;
                int i7 = i6 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 29944);
                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 1755;
                    int iIndexOf2 = TextUtils.indexOf("", "") + 23;
                    Object[] objArr14 = new Object[1];
                    a((short) 88, $$a[28], (byte) ($$b & 61), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(touchSlop, edgeSlop2, iIndexOf2, 1599039318, false, (String) objArr14[0], null);
                }
                Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i8 = 1400869438 + (((~((~iMaxMemory) | 312005242)) | (-534573823)) * (-245));
                int i9 = ~(iMaxMemory | 312005242);
                int i10 = i8 + (i9 * (-245)) + ((i9 | 524607668) * 245) + 379940596;
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
            }
            int i13 = ((int[]) objArr[1])[0];
            int i14 = ((int[]) objArr[0])[0];
            if (i14 == i13) {
                int i15 = ((int[]) objArr[3])[0];
                Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i16 = ~iElapsedRealtime;
                int i17 = i15 + 1109639646 + ((iElapsedRealtime | 446820764) * (-859)) + (((~(iElapsedRealtime | (-301994141))) | (~(446820764 | i16))) * 859) + (((~(234218338 | i16)) | (-536212479)) * 859);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr16[3])[0] = i19 ^ (i19 << 5);
                int i20 = g + 89;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                int i21 = i20 % 2;
                return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            int i2 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int iResolveSize = View.resolveSize(0, 0) + 651;
                int iRed = Color.red(0) + 44;
                int i3 = $$b;
                Object[] objArr2 = new Object[1];
                a((short) (i3 & 45), $$a[28], (byte) (i3 & 61), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, iResolveSize, iRed, -459846511, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(null, null, Process.getGidForName("") + 128, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(null, null, MotionEvent.axisFromString("") + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int i4 = 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int gidForName = Process.getGidForName("") + 45;
                byte b2 = $$a[7];
                Object[] objArr5 = new Object[1];
                a((short) 140, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, i4, gidForName, -873460649, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int i5 = 652 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44;
                    byte[] bArr = $$a;
                    short s = bArr[5];
                    byte b3 = bArr[28];
                    Object[] objArr6 = new Object[1];
                    a(s, b3, (byte) (b3 | 36), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, i5, maximumDrawingCacheSize, -1595579076, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i6 = ((int[]) objArr7[2])[0];
                int i7 = ((int[]) objArr7[0])[0];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i8 = (((((~(12498859 | elapsedCpuTime)) | (-5089007)) * 262) + 1553974581) + (((~((~elapsedCpuTime) | 12498859)) | (-5089007)) * 262)) - 1198299536;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
            } else {
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.blue(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1609, 26 - (ViewConfiguration.getScrollBarSize() >> 8), 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -1198299536, 0};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRgb2 = (char) (Color.rgb(0, 0, 0) + 16777216);
                        int i11 = 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int jumpTapTimeout = 44 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b4 = $$a[7];
                        Object[] objArr9 = new Object[1];
                        a((short) 140, b4, b4, objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb2, i11, jumpTapTimeout, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.resolveSize(0, 0), 695 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 97 - TextUtils.indexOf((CharSequence) "", '0', 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ImageFormat.getBitsPerPixel(0) + 63407), (ViewConfiguration.getScrollBarSize() >> 8) + 793, 83 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Integer.TYPE, Integer.TYPE});
                    }
                    objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iIndexOf = 650 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 44;
                        byte[] bArr2 = $$a;
                        short s2 = bArr2[5];
                        byte b5 = bArr2[28];
                        Object[] objArr10 = new Object[1];
                        a(s2, b5, (byte) (b5 | 36), objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iIndexOf, longPressTimeout, -1595579076, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                    try {
                        Object[] objArr11 = new Object[1];
                        c(null, null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr11);
                        Class<?> cls2 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        c(null, null, 127 - View.combineMeasuredStates(0, 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr12);
                        long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                            int iIndexOf2 = TextUtils.indexOf("", "") + 44;
                            byte b6 = $$a[7];
                            Object[] objArr13 = new Object[1];
                            a((short) 140, b6, b6, objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetBefore, maxKeyCode, iIndexOf2, -873460649, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i12 = 652 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 45;
                            int i13 = $$b;
                            Object[] objArr14 = new Object[1];
                            a((short) (i13 & 45), $$a[28], (byte) (i13 & 61), objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, i12, modifierMetaStateMask, -459846511, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
            int i14 = ((int[]) objArr[0])[0];
            int i15 = ((int[]) objArr[2])[0];
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[1];
                if (strArr != null) {
                    while (i2 < strArr.length) {
                        arrayList.add(strArr[i2]);
                        i2++;
                        int i16 = g + 91;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                }
                throw new RuntimeException(String.valueOf(i15));
            }
            int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            g = i18 % 128;
            int i19 = i18 % 2;
            Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i20 = ((int[]) objArr[3])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            int iNextInt = new Random().nextInt(44314935);
            int i23 = ~iNextInt;
            int i24 = i20 + 1136297156 + (((~((-616664700) | i23)) | (-613233890)) * (-602)) + (((~(iNextInt | (-616664700))) | 4229658 | (~((-798849) | i23))) * (-301)) + ((~(i23 | (-613233890))) * 301);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr15[3])[0] = i26 ^ (i26 << 5);
            String simpleName = getClass().getSimpleName();
            String string = super.toString();
            int i27 = ((int[]) objArr15[3])[0];
            int i28 = i27 * i27;
            int i29 = -(34595786 * i27);
            int i30 = ((((i28 | i29) << 1) - (i28 ^ i29)) - (~(-(i27 * 1504750786)))) - 1;
            int i31 = ((i30 | 719811364) << 1) - (719811364 ^ i30);
            int i32 = i31 >> 20;
            int i33 = (((i32 | (-8191)) << 1) - (i32 ^ (-8191))) / 4096;
            int i34 = (i33 ^ 1) + ((i33 & 1) << 1);
            int i35 = -(((((i31 >> 25) - 255) / 128) + 1) ^ ((i31 & i34) + (i34 | i31)));
            int i36 = ((i35 | 6) << 1) - (i35 ^ 6);
            Object[] objArr16 = new Object[1512 / (((-((((i36 >> 19) - 16383) / 8192) + 2)) & i36) * 126)];
            objArr16[0] = simpleName;
            objArr16[1] = string;
            return String.format("%s{%s}", objArr16);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r6, short r7, int r8) {
            /*
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableCreate.CreateEmitter.$$c
                int r6 = 68 - r6
                int r7 = r7 * 2
                int r7 = 3 - r7
                int r8 = r8 * 2
                int r1 = r8 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L2a
            L14:
                r3 = r2
            L15:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2a:
                int r7 = -r7
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCreate.CreateEmitter.$$e(byte, short, int):java.lang.String");
        }
    }
}

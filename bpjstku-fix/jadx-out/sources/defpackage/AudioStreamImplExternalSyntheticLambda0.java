package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.reactivex.internal.functions.Functions;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class AudioStreamImplExternalSyntheticLambda0 {

    /* JADX INFO: loaded from: classes5.dex */
    public static final class cancel<T, S> implements dumpCodecCapabilities<S, getRecordingStats<T>, S> {
        private logToString<getRecordingStats<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.dumpCodecCapabilities
        public final /* synthetic */ Object b(Object obj, Object obj2) throws Exception {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.accept((getRecordingStats) obj2);
            return obj;
        }

        public cancel(logToString<getRecordingStats<T>> logtostring) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = logtostring;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class cancelAll<T, S> implements dumpCodecCapabilities<S, getRecordingStats<T>, S> {
        private dumpVideoCapabilities<S, getRecordingStats<T>> TuitionPaymentFragmentbindingInflater1;

        @Override // defpackage.dumpCodecCapabilities
        public final /* synthetic */ Object b(Object obj, Object obj2) throws Exception {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, (getRecordingStats) obj2);
            return obj;
        }

        public cancelAll(dumpVideoCapabilities<S, getRecordingStats<T>> dumpvideocapabilities) {
            this.TuitionPaymentFragmentbindingInflater1 = dumpvideocapabilities;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class g<T, U> implements readableMs<T, AutoValue_VideoValidatedEncoderProfilesProxy<T>> {
        private readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<U>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public g(readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<U>> readablems) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
        }

        @Override // defpackage.readableMs
        public final /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
            return new BufferedAudioStreamExternalSyntheticLambda1((AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.apply(obj), "The itemDelay returned a null ObservableSource"), 1L).map(Functions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj)).defaultIfEmpty(obj);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class d<T> implements logToString<T> {
        private deriveMediaType<T> b;
        private static final byte[] $$c = {112, 19, -59, 97};
        private static final int $$f = 228;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {106, -22, 107, 95, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$e = 82;
        private static final byte[] $$a = {15, -9, 64, -81, 6, -24, 18, 48, -72, 11, -1, -21, 0, 6, -14, -8, 72, -56, -5, -16, -5, 67, -45, 32, 2, -12, -13, -37, -16, -5, 8, 0, -6, 3, -1, -22, 12, -1, -18, 44, -54, 1, 12, -12, -8, 7, -9, -2, 21, -14, -14, -12, 13};
        private static final int $$b = 90;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {59698, 59744, 59758, 59757, 59750, 59728, 59743, 59745, 59749, 59734, 59702, 59717, 59751, 59744, 59717, 59724, 59744, 59744, 59758, 59803, 59768, 59747, 59786, 59780, 59708, 59746, 59744, 59771, 59751, 59757, 59740, 59731, 59748, 59757, 59752, 59770, 59771, 59744, 59736, 59730, 59813, 59839, 59839, 59803, 59794, 59838, 59814, 59838, 59831, 59837, 59836, 59828, 59799, 59790, 59818, 59827, 59812, 59815, 59825, 59826, 59839, 59705, 59747, 59750, 59747, 59755, 59828, 59828, 59864, 59866, 59858, 59870, 59851, 59883, 59866, 59698, 59751, 59759, 59746, 59738, 59704, 59710, 59743, 59738, 59698, 59770, 59745, 59759, 59715, 59698, 59727, 59726, 59741, 59746, 59732, 59731, 59746, 59746, 59756, 59746, 59751, 59751, 59744, 59753, 59754, 59745, 59759, 59757, 59758, 59744, 59744, 59724, 59739, 59751, 59759, 59751, 59768, 59750, 59749, 59773, 59736, 59723, 59764, 59790, 59775, 59750, 59791, 59783, 59788, 59787, 59787, 59764, 59760, 59784, 59790, 59750, 59749, 59766, 59765, 59791, 59698, 59744, 59758, 59757, 59750, 59728, 59736, 59751, 59773, 59734, 59699, 59717, 59751, 59744, 59717, 59724, 59744, 59744, 59758, 59845, 59828, 59867, 59870, 59727, 59786, 59760, 59767, 59784, 59770, 59745, 59787, 59791, 59768, 59774, 59787, 59710, 59758, 59744, 59744, 59724, 59717, 59744, 59751, 59717, 59699, 59728, 59750, 59757, 59758, 59744, 59730, 59833, 59827, 59677, 59806, 59431, 59450, 59451, 59451, 59434, 59414, 59431, 59425, 59431, 59430, 59427, 59413, 59427, 59824, 59841, 59855, 59854, 59794, 59791, 59841, 59855, 59824, 59841, 59855, 59854, 59826, 59791, 59825, 59828, 59854, 59843, 59825, 59855, 59836, 59841, 59845, 59698, 59744, 59757, 59759, 59756, 59756, 59740, 59730, 59757, 59759, 59757, 59756, 59753, 59731, 59753, 59751, 59757, 59708, 59745, 59771, 59771, 59719, 59737, 59744, 59751, 59748, 59716, 59742, 59771, 59745, 59749, 59750, 59746, 59771, 59741, 59721, 59733, 59770, 59768, 59771, 59749, 59693, 59733, 59746, 59757, 59756, 59756, 59756, 59744, 59749, 59758, 59744, 59744, 59724, 59718, 59757, 59756, 59745, 59713, 59739, 59744, 59758, 59746, 59747, 59759, 59744, 59738, 59705, 59751, 59752, 59728, 59751, 59775, 59768, 59771, 59754, 59757, 59775, 59745, 59757, 59665, 59703, 59715, 59704, 59787, 59818, 59821, 59810, 59823, 59818, 59810, 59778, 59788, 59821, 59790, 59772, 59803, 59793, 59796, 59797, 59799, 59797, 59780, 59800, 59817, 59817, 59819, 59796, 59818, 59816, 59811, 59823, 59797, 59711, 59749, 59768, 59751, 59744, 59768, 59775, 59745, 59756, 59745, 59705, 59751, 59768, 59751, 59757, 59747, 59704, 59757, 59757, 59757, 59751, 59755, 59730, 59751, 59768, 59745, 59679, 59695, 59686, 59743, 59749, 59751, 59749, 59745, 59756, 59748, 59771, 59745, 59745, 59744, 59727, 59721, 59759, 59753, 59746, 59768, 59713, 59726, 59756, 59753, 59745, 59768, 59714, 59720, 59745, 59744, 59747, 59758, 59744, 59751, 59758, 59720, 59714, 59771, 59771, 59769, 59744, 59721, 59721, 59759, 59751, 59744, 59759, 59745, 59775, 59749, 59746, 59754};
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722414;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                byte[] r0 = AudioStreamImplExternalSyntheticLambda0.d.$$d
                int r8 = r8 + 84
                int r6 = 53 - r6
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L11
                r4 = r6
                r8 = r7
                r3 = r2
                goto L26
            L11:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L15:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                r4 = r0[r8]
            L26:
                int r7 = r7 + r4
                int r8 = r8 + 1
                int r7 = r7 + (-11)
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: AudioStreamImplExternalSyntheticLambda0.d.d(short, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(int r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 3
                int r7 = r7 + 103
                byte[] r0 = AudioStreamImplExternalSyntheticLambda0.d.$$a
                int r6 = r6 * 17
                int r1 = 34 - r6
                int r8 = r8 + 4
                byte[] r1 = new byte[r1]
                int r6 = 33 - r6
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2f
            L17:
                r3 = r2
            L18:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r0[r8]
                int r3 = r3 + 1
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2f:
                int r8 = -r8
                int r7 = r7 + r8
                int r7 = r7 + (-3)
                r8 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: AudioStreamImplExternalSyntheticLambda0.d.e(int, short, byte, java.lang.Object[]):void");
        }

        public d(deriveMediaType<T> derivemediatype) {
            this.b = derivemediatype;
        }

        @Override // defpackage.logToString
        public final void accept(T t) throws Exception {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            this.b.onNext(t);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 27 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x017b  */
        /* JADX WARN: Code duplicated, block: B:36:0x017c  */
        private static void c(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            Throwable cause;
            int i5 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (true) {
                i4 = 29209604;
                if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i) {
                    break;
                }
                int i6 = $11 + 77;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i8 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 3291 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 31 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getTrimmedLength(""), 651 - View.resolveSize(0, 0), ExpandableListView.getPackedPositionChild(0L) + 45, -450685997, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i3 > 0) {
                int i9 = $10 + 47;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (!(!z)) {
                char[] cArr4 = new char[i];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                    int i11 = $10 + 119;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i / setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = (byte) (b5 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 651 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 44, -450685997, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        try {
                            Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 651 - Color.blue(0), (ViewConfiguration.getLongPressTimeout() >> 16) + 44, -450685997, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i4 = 29209604;
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            int i = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 1271 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 18, 407021364, false, $$g(b, (byte) (b | 20), b), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
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
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr2, i2, cArr4, 0, i3);
            if (bArr != null) {
                char[] cArr5 = new char[i3];
                setvideostabilizationmode.b = 0;
                char c = 0;
                while (setvideostabilizationmode.b < i3) {
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i7 = setvideostabilizationmode.b;
                        Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b2 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 3225 - Color.alpha(0), 13 - Gravity.getAbsoluteGravity(0, 0), 2133916302, false, $$g(b2, (byte) (b2 | 21), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } else {
                        int i8 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.combineMeasuredStates(0, 0) + 29944), 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, 387247676, false, $$g(b3, $$c[1], b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                    c = cArr5[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (Process.myTid() >> 22)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1705, 21 - Color.red(0), -1434471773, false, $$g(b4, (byte) (b4 | 15), b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                cArr4 = cArr5;
            }
            if (i5 > 0) {
                int i9 = $10 + 49;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    char[] cArr6 = new char[i3];
                    System.arraycopy(cArr4, 1, cArr6, 1, i3);
                    System.arraycopy(cArr6, 0, cArr4, i3 >> i5, i5);
                    System.arraycopy(cArr6, i5, cArr4, 1, i3 << i5);
                } else {
                    char[] cArr7 = new char[i3];
                    System.arraycopy(cArr4, 0, cArr7, 0, i3);
                    int i10 = i3 - i5;
                    System.arraycopy(cArr7, 0, cArr4, i10, i5);
                    System.arraycopy(cArr7, i5, cArr4, 0, i10);
                }
            }
            if (z) {
                int i11 = $11 + 39;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    cArr = new char[i3];
                    setvideostabilizationmode.b = 1;
                } else {
                    cArr = new char[i3];
                    setvideostabilizationmode.b = 0;
                }
                int i12 = $11 + 87;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                while (setvideostabilizationmode.b < i3) {
                    cArr[setvideostabilizationmode.b] = cArr4[(i3 - setvideostabilizationmode.b) - 1];
                    setvideostabilizationmode.b++;
                    int i14 = $11 + 21;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                }
                cArr4 = cArr;
            }
            if (i4 > 0) {
                setvideostabilizationmode.b = 0;
                while (setvideostabilizationmode.b < i3) {
                    int i16 = $11 + 89;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] * iArr[5]);
                        setvideostabilizationmode.b = setvideostabilizationmode.b;
                    } else {
                        cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                        setvideostabilizationmode.b++;
                    }
                }
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Multi-variable search skipped. Vars limit reached: 7851 (expected less than 5000) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v301, types: [java.lang.Object, java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r10v388, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r11v122 */
        /* JADX WARN: Type inference failed for: r11v95 */
        /* JADX WARN: Type inference failed for: r13v10 */
        /* JADX WARN: Type inference failed for: r13v363 */
        /* JADX WARN: Type inference failed for: r13v364 */
        /* JADX WARN: Type inference failed for: r13v365 */
        /* JADX WARN: Type inference failed for: r13v379 */
        /* JADX WARN: Type inference failed for: r13v380 */
        /* JADX WARN: Type inference failed for: r14v22 */
        /* JADX WARN: Type inference failed for: r14v23 */
        /* JADX WARN: Type inference failed for: r14v373 */
        /* JADX WARN: Type inference failed for: r14v374 */
        /* JADX WARN: Type inference failed for: r14v375 */
        /* JADX WARN: Type inference failed for: r14v376 */
        /* JADX WARN: Type inference failed for: r14v377 */
        /* JADX WARN: Type inference failed for: r14v381, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r14v382 */
        /* JADX WARN: Type inference failed for: r14v383 */
        /* JADX WARN: Type inference failed for: r14v384 */
        /* JADX WARN: Type inference failed for: r14v386 */
        /* JADX WARN: Type inference failed for: r14v387 */
        /* JADX WARN: Type inference failed for: r14v443, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r14v514 */
        /* JADX WARN: Type inference failed for: r14v515 */
        /* JADX WARN: Type inference failed for: r14v516 */
        /* JADX WARN: Type inference failed for: r14v517 */
        /* JADX WARN: Type inference failed for: r14v68 */
        /* JADX WARN: Type inference failed for: r1v925, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v290 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v317, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v335, types: [java.lang.reflect.Field] */
        /* JADX WARN: Type inference failed for: r2v341 */
        /* JADX WARN: Type inference failed for: r2v35 */
        /* JADX WARN: Type inference failed for: r2v357 */
        /* JADX WARN: Type inference failed for: r2v371, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v399 */
        /* JADX WARN: Type inference failed for: r2v42, types: [java.util.ArrayList, java.util.List] */
        /* JADX WARN: Type inference failed for: r2v43 */
        /* JADX WARN: Type inference failed for: r2v435, types: [java.nio.LongBuffer[]] */
        /* JADX WARN: Type inference failed for: r2v436 */
        /* JADX WARN: Type inference failed for: r2v439 */
        /* JADX WARN: Type inference failed for: r2v440 */
        /* JADX WARN: Type inference failed for: r2v452 */
        /* JADX WARN: Type inference failed for: r2v465, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r2v61, types: [java.util.ArrayList, java.util.List] */
        /* JADX WARN: Type inference failed for: r2v67 */
        /* JADX WARN: Type inference failed for: r2v698 */
        /* JADX WARN: Type inference failed for: r2v699 */
        /* JADX WARN: Type inference failed for: r2v700 */
        /* JADX WARN: Type inference failed for: r2v701 */
        /* JADX WARN: Type inference failed for: r2v702 */
        /* JADX WARN: Type inference failed for: r2v703 */
        /* JADX WARN: Type inference failed for: r2v77 */
        /* JADX WARN: Type inference failed for: r2v90 */
        /* JADX WARN: Type inference failed for: r2v91 */
        /* JADX WARN: Type inference failed for: r2v92, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r38v10 */
        /* JADX WARN: Type inference failed for: r38v11 */
        /* JADX WARN: Type inference failed for: r38v16 */
        /* JADX WARN: Type inference failed for: r38v18, types: [int] */
        /* JADX WARN: Type inference failed for: r38v2 */
        /* JADX WARN: Type inference failed for: r38v21, types: [int] */
        /* JADX WARN: Type inference failed for: r38v25 */
        /* JADX WARN: Type inference failed for: r38v26 */
        /* JADX WARN: Type inference failed for: r38v29 */
        /* JADX WARN: Type inference failed for: r38v3 */
        /* JADX WARN: Type inference failed for: r38v33 */
        /* JADX WARN: Type inference failed for: r38v34 */
        /* JADX WARN: Type inference failed for: r38v35 */
        /* JADX WARN: Type inference failed for: r38v36 */
        /* JADX WARN: Type inference failed for: r38v37 */
        /* JADX WARN: Type inference failed for: r38v38 */
        /* JADX WARN: Type inference failed for: r38v39 */
        /* JADX WARN: Type inference failed for: r38v40 */
        /* JADX WARN: Type inference failed for: r38v41 */
        /* JADX WARN: Type inference failed for: r38v8, types: [int] */
        /* JADX WARN: Type inference failed for: r38v9 */
        /* JADX WARN: Type inference failed for: r39v36 */
        /* JADX WARN: Type inference failed for: r39v37 */
        /* JADX WARN: Type inference failed for: r39v38 */
        /* JADX WARN: Type inference failed for: r39v41 */
        /* JADX WARN: Type inference failed for: r3v182, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r3v461 */
        /* JADX WARN: Type inference failed for: r3v624, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r3v652, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r43v110 */
        /* JADX WARN: Type inference failed for: r43v111 */
        /* JADX WARN: Type inference failed for: r43v112 */
        /* JADX WARN: Type inference failed for: r43v113 */
        /* JADX WARN: Type inference failed for: r43v114 */
        /* JADX WARN: Type inference failed for: r43v115 */
        /* JADX WARN: Type inference failed for: r43v116 */
        /* JADX WARN: Type inference failed for: r43v117 */
        /* JADX WARN: Type inference failed for: r43v118 */
        /* JADX WARN: Type inference failed for: r43v119 */
        /* JADX WARN: Type inference failed for: r43v120 */
        /* JADX WARN: Type inference failed for: r43v121 */
        /* JADX WARN: Type inference failed for: r43v122 */
        /* JADX WARN: Type inference failed for: r43v123 */
        /* JADX WARN: Type inference failed for: r43v124 */
        /* JADX WARN: Type inference failed for: r43v125 */
        /* JADX WARN: Type inference failed for: r43v126 */
        /* JADX WARN: Type inference failed for: r43v127 */
        /* JADX WARN: Type inference failed for: r43v128 */
        /* JADX WARN: Type inference failed for: r43v129 */
        /* JADX WARN: Type inference failed for: r43v130 */
        /* JADX WARN: Type inference failed for: r43v131 */
        /* JADX WARN: Type inference failed for: r43v132 */
        /* JADX WARN: Type inference failed for: r43v133 */
        /* JADX WARN: Type inference failed for: r43v134 */
        /* JADX WARN: Type inference failed for: r43v135 */
        /* JADX WARN: Type inference failed for: r43v136 */
        /* JADX WARN: Type inference failed for: r43v137 */
        /* JADX WARN: Type inference failed for: r43v138 */
        /* JADX WARN: Type inference failed for: r43v139 */
        /* JADX WARN: Type inference failed for: r43v140 */
        /* JADX WARN: Type inference failed for: r43v141 */
        /* JADX WARN: Type inference failed for: r43v142 */
        /* JADX WARN: Type inference failed for: r43v143 */
        /* JADX WARN: Type inference failed for: r43v144 */
        /* JADX WARN: Type inference failed for: r43v155 */
        /* JADX WARN: Type inference failed for: r43v156 */
        /* JADX WARN: Type inference failed for: r43v157 */
        /* JADX WARN: Type inference failed for: r43v158 */
        /* JADX WARN: Type inference failed for: r43v159 */
        /* JADX WARN: Type inference failed for: r43v160 */
        /* JADX WARN: Type inference failed for: r43v161 */
        /* JADX WARN: Type inference failed for: r43v162 */
        /* JADX WARN: Type inference failed for: r43v163 */
        /* JADX WARN: Type inference failed for: r43v164 */
        /* JADX WARN: Type inference failed for: r43v165 */
        /* JADX WARN: Type inference failed for: r43v166 */
        /* JADX WARN: Type inference failed for: r43v178 */
        /* JADX WARN: Type inference failed for: r43v236 */
        /* JADX WARN: Type inference failed for: r43v237 */
        /* JADX WARN: Type inference failed for: r43v238 */
        /* JADX WARN: Type inference failed for: r43v239 */
        /* JADX WARN: Type inference failed for: r43v240 */
        /* JADX WARN: Type inference failed for: r43v241 */
        /* JADX WARN: Type inference failed for: r43v242 */
        /* JADX WARN: Type inference failed for: r43v243 */
        /* JADX WARN: Type inference failed for: r43v244 */
        /* JADX WARN: Type inference failed for: r43v245 */
        /* JADX WARN: Type inference failed for: r43v246 */
        /* JADX WARN: Type inference failed for: r43v247 */
        /* JADX WARN: Type inference failed for: r43v248 */
        /* JADX WARN: Type inference failed for: r43v249 */
        /* JADX WARN: Type inference failed for: r43v250 */
        /* JADX WARN: Type inference failed for: r43v251 */
        /* JADX WARN: Type inference failed for: r43v252 */
        /* JADX WARN: Type inference failed for: r43v253 */
        /* JADX WARN: Type inference failed for: r43v254 */
        /* JADX WARN: Type inference failed for: r43v255 */
        /* JADX WARN: Type inference failed for: r43v256 */
        /* JADX WARN: Type inference failed for: r43v257 */
        /* JADX WARN: Type inference failed for: r43v258 */
        /* JADX WARN: Type inference failed for: r43v259 */
        /* JADX WARN: Type inference failed for: r43v260 */
        /* JADX WARN: Type inference failed for: r43v261 */
        /* JADX WARN: Type inference failed for: r43v262 */
        /* JADX WARN: Type inference failed for: r43v263 */
        /* JADX WARN: Type inference failed for: r43v264 */
        /* JADX WARN: Type inference failed for: r43v265 */
        /* JADX WARN: Type inference failed for: r43v266 */
        /* JADX WARN: Type inference failed for: r43v267 */
        /* JADX WARN: Type inference failed for: r43v268 */
        /* JADX WARN: Type inference failed for: r43v269 */
        /* JADX WARN: Type inference failed for: r43v270 */
        /* JADX WARN: Type inference failed for: r43v271 */
        /* JADX WARN: Type inference failed for: r43v272 */
        /* JADX WARN: Type inference failed for: r43v273 */
        /* JADX WARN: Type inference failed for: r43v274 */
        /* JADX WARN: Type inference failed for: r43v275 */
        /* JADX WARN: Type inference failed for: r43v276 */
        /* JADX WARN: Type inference failed for: r43v277 */
        /* JADX WARN: Type inference failed for: r43v278 */
        /* JADX WARN: Type inference failed for: r43v279 */
        /* JADX WARN: Type inference failed for: r43v280 */
        /* JADX WARN: Type inference failed for: r43v281 */
        /* JADX WARN: Type inference failed for: r43v282 */
        /* JADX WARN: Type inference failed for: r43v283 */
        /* JADX WARN: Type inference failed for: r43v284 */
        /* JADX WARN: Type inference failed for: r43v285 */
        /* JADX WARN: Type inference failed for: r43v286 */
        /* JADX WARN: Type inference failed for: r43v287 */
        /* JADX WARN: Type inference failed for: r43v288 */
        /* JADX WARN: Type inference failed for: r43v289 */
        /* JADX WARN: Type inference failed for: r43v290 */
        /* JADX WARN: Type inference failed for: r43v291 */
        /* JADX WARN: Type inference failed for: r43v292 */
        /* JADX WARN: Type inference failed for: r43v293 */
        /* JADX WARN: Type inference failed for: r43v294 */
        /* JADX WARN: Type inference failed for: r43v295 */
        /* JADX WARN: Type inference failed for: r43v296 */
        /* JADX WARN: Type inference failed for: r43v297 */
        /* JADX WARN: Type inference failed for: r43v298 */
        /* JADX WARN: Type inference failed for: r43v299 */
        /* JADX WARN: Type inference failed for: r43v300 */
        /* JADX WARN: Type inference failed for: r43v301 */
        /* JADX WARN: Type inference failed for: r43v302 */
        /* JADX WARN: Type inference failed for: r43v303 */
        /* JADX WARN: Type inference failed for: r43v304 */
        /* JADX WARN: Type inference failed for: r43v305 */
        /* JADX WARN: Type inference failed for: r43v306 */
        /* JADX WARN: Type inference failed for: r43v307 */
        /* JADX WARN: Type inference failed for: r43v308 */
        /* JADX WARN: Type inference failed for: r43v309 */
        /* JADX WARN: Type inference failed for: r43v310 */
        /* JADX WARN: Type inference failed for: r43v311 */
        /* JADX WARN: Type inference failed for: r43v312 */
        /* JADX WARN: Type inference failed for: r43v313 */
        /* JADX WARN: Type inference failed for: r43v314 */
        /* JADX WARN: Type inference failed for: r43v315 */
        /* JADX WARN: Type inference failed for: r43v316 */
        /* JADX WARN: Type inference failed for: r43v317 */
        /* JADX WARN: Type inference failed for: r43v318 */
        /* JADX WARN: Type inference failed for: r43v319 */
        /* JADX WARN: Type inference failed for: r43v320 */
        /* JADX WARN: Type inference failed for: r43v321 */
        /* JADX WARN: Type inference failed for: r43v322 */
        /* JADX WARN: Type inference failed for: r43v323 */
        /* JADX WARN: Type inference failed for: r43v324 */
        /* JADX WARN: Type inference failed for: r43v325 */
        /* JADX WARN: Type inference failed for: r43v326 */
        /* JADX WARN: Type inference failed for: r43v327 */
        /* JADX WARN: Type inference failed for: r43v328 */
        /* JADX WARN: Type inference failed for: r43v329 */
        /* JADX WARN: Type inference failed for: r43v332 */
        /* JADX WARN: Type inference failed for: r43v333 */
        /* JADX WARN: Type inference failed for: r43v5 */
        /* JADX WARN: Type inference failed for: r43v6 */
        /* JADX WARN: Type inference failed for: r43v68 */
        /* JADX WARN: Type inference failed for: r43v69 */
        /* JADX WARN: Type inference failed for: r43v7 */
        /* JADX WARN: Type inference failed for: r43v73 */
        /* JADX WARN: Type inference failed for: r43v75 */
        /* JADX WARN: Type inference failed for: r43v76 */
        /* JADX WARN: Type inference failed for: r43v77 */
        /* JADX WARN: Type inference failed for: r43v78 */
        /* JADX WARN: Type inference failed for: r43v8 */
        /* JADX WARN: Type inference failed for: r43v80 */
        /* JADX WARN: Type inference failed for: r43v81 */
        /* JADX WARN: Type inference failed for: r43v82, types: [char[]] */
        /* JADX WARN: Type inference failed for: r43v85 */
        /* JADX WARN: Type inference failed for: r43v86 */
        /* JADX WARN: Type inference failed for: r5v248, types: [java.lang.Object, java.nio.LongBuffer] */
        /* JADX WARN: Type inference failed for: r5v250, types: [java.lang.Object, java.nio.LongBuffer] */
        /* JADX WARN: Type inference failed for: r67v1 */
        /* JADX WARN: Type inference failed for: r67v2 */
        /* JADX WARN: Type inference failed for: r67v3 */
        /* JADX WARN: Type inference failed for: r67v4 */
        /* JADX WARN: Type inference failed for: r67v5 */
        /* JADX WARN: Type inference failed for: r6v102, types: [java.lang.Object, java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r6v37, types: [java.nio.LongBuffer[]] */
        /* JADX WARN: Type inference failed for: r6v39 */
        /* JADX WARN: Type inference failed for: r6v49 */
        /* JADX WARN: Type inference failed for: r6v50 */
        /* JADX WARN: Type inference failed for: r6v579 */
        /* JADX WARN: Type inference failed for: r6v580 */
        /* JADX WARN: Type inference failed for: r6v582 */
        /* JADX WARN: Type inference failed for: r6v584 */
        /* JADX WARN: Type inference failed for: r6v620, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r6v64 */
        /* JADX WARN: Type inference failed for: r6v869 */
        /* JADX WARN: Type inference failed for: r6v870 */
        /* JADX WARN: Type inference failed for: r6v871 */
        /* JADX WARN: Type inference failed for: r6v872 */
        /* JADX WARN: Type inference failed for: r6v873 */
        /* JADX WARN: Type inference failed for: r6v874 */
        /* JADX WARN: Type inference failed for: r6v875 */
        /* JADX WARN: Type inference failed for: r6v876 */
        /* JADX WARN: Type inference failed for: r6v877 */
        /* JADX WARN: Type inference failed for: r6v91 */
        /* JADX WARN: Type inference failed for: r7v113 */
        /* JADX WARN: Type inference failed for: r7v140, types: [java.lang.Object, java.nio.LongBuffer] */
        /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.nio.LongBuffer] */
        /* JADX WARN: Type inference failed for: r7v221 */
        /* JADX WARN: Type inference failed for: r7v222 */
        /* JADX WARN: Type inference failed for: r7v223, types: [java.lang.Object, java.security.KeyStore] */
        /* JADX WARN: Type inference failed for: r7v225, types: [java.lang.Object, java.security.KeyStore] */
        /* JADX WARN: Type inference failed for: r7v231, types: [java.lang.Object, java.security.KeyStore] */
        /* JADX WARN: Type inference failed for: r7v232 */
        /* JADX WARN: Type inference failed for: r7v233 */
        /* JADX WARN: Type inference failed for: r7v234 */
        /* JADX WARN: Type inference failed for: r7v239, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r7v241, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r7v256 */
        /* JADX WARN: Type inference failed for: r7v257 */
        /* JADX WARN: Type inference failed for: r7v258 */
        /* JADX WARN: Type inference failed for: r7v259, types: [android.security.keystore.KeyGenParameterSpec$Builder] */
        /* JADX WARN: Type inference failed for: r7v263 */
        /* JADX WARN: Type inference failed for: r7v269, types: [java.lang.Object, java.security.KeyStore] */
        /* JADX WARN: Type inference failed for: r7v515 */
        /* JADX WARN: Type inference failed for: r7v516 */
        /* JADX WARN: Type inference failed for: r7v517 */
        /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r8v418, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r8v498, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r8v536, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r9v100, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v160, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r9v165, types: [java.nio.LongBuffer] */
        /* JADX WARN: Type inference failed for: r9v395 */
        /* JADX WARN: Type inference failed for: r9v396 */
        /* JADX WARN: Type inference failed for: r9v62 */
        /* JADX WARN: Type inference failed for: r9v63, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v65, types: [java.lang.String] */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r64, java.lang.String[] r65, int r66, int r67, int r68) {
            /*
                Method dump skipped, instruction units count: 27787
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: AudioStreamImplExternalSyntheticLambda0.d.TuitionPaymentFragmentbindingInflater1(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r7, int r8, short r9) {
            /*
                int r8 = 120 - r8
                byte[] r0 = AudioStreamImplExternalSyntheticLambda0.d.$$c
                int r9 = r9 * 3
                int r9 = 1 - r9
                int r7 = r7 * 3
                int r7 = r7 + 4
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r8 = r7
                r3 = r9
                r4 = r2
                goto L29
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L29:
                int r7 = -r7
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: AudioStreamImplExternalSyntheticLambda0.d.$$g(int, int, short):java.lang.String");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class asInterface<T> implements logToString<Throwable> {
        private deriveMediaType<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // defpackage.logToString
        public final /* synthetic */ void accept(Throwable th) throws Exception {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
        }

        public asInterface(deriveMediaType<T> derivemediatype) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivemediatype;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a<T> implements formatInterval {
        private deriveMediaType<T> b;

        public a(deriveMediaType<T> derivemediatype) {
            this.b = derivemediatype;
        }

        @Override // defpackage.formatInterval
        public final void run() throws Exception {
            this.b.onComplete();
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<U, R, T> implements readableMs<U, R> {
        private final dumpCodecCapabilities<? super T, ? super U, ? extends R> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final T b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities, T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = dumpcodeccapabilities;
            this.b = t;
        }

        @Override // defpackage.readableMs
        public final R apply(U u) throws Exception {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(this.b, u);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class TuitionPaymentFragmentbindingInflater1<T, R, U> implements readableMs<T, AutoValue_VideoValidatedEncoderProfilesProxy<R>> {
        private final dumpCodecCapabilities<? super T, ? super U, ? extends R> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> b;

        public TuitionPaymentFragmentbindingInflater1(dumpCodecCapabilities<? super T, ? super U, ? extends R> dumpcodeccapabilities, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> readablems) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = dumpcodeccapabilities;
            this.b = readablems;
        }

        @Override // defpackage.readableMs
        public final /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
            return new channelCountToChannelConfig((AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.b.apply(obj), "The mapper returned a null ObservableSource"), new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, obj));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T, U> implements readableMs<T, AutoValue_VideoValidatedEncoderProfilesProxy<U>> {
        private final readableMs<? super T, ? extends Iterable<? extends U>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(readableMs<? super T, ? extends Iterable<? extends U>> readablems) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
        }

        @Override // defpackage.readableMs
        public final /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
            return new getMinBufferSize((Iterable) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.apply(obj), "The mapper returned a null Iterable"));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class onTransact<T, R> implements readableMs<List<AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>>, AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> {
        private final readableMs<? super Object[], ? extends R> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // defpackage.readableMs
        public final /* synthetic */ Object apply(Object obj) throws Exception {
            return VideoRecordEventStart.zipIterable((List) obj, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, false, VideoRecordEventStart.bufferSize());
        }

        public onTransact(readableMs<? super Object[], ? extends R> readablems) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class asBinder<T> implements Callable<usesAffectedSoc<T>> {
        private final VideoRecordEventStart<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public asBinder(VideoRecordEventStart<T> videoRecordEventStart) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = videoRecordEventStart;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() throws Exception {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.replay();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements Callable<usesAffectedSoc<T>> {
        private final VideoRecordEventStart<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(VideoRecordEventStart<T> videoRecordEventStart, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = videoRecordEventStart;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() throws Exception {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.replay(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b<T> implements Callable<usesAffectedSoc<T>> {
        private final long TuitionPaymentFragmentbindingInflater1;
        private final TimeUnit TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final VideoRecordEventStart<T> b;

        public b(VideoRecordEventStart<T> videoRecordEventStart, int i, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
            this.b = videoRecordEventStart;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
            this.TuitionPaymentFragmentbindingInflater1 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = timeUnit;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = appendbackupvideoprofile;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() throws Exception {
            return this.b.replay(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class INotificationSideChannel<T> implements Callable<usesAffectedSoc<T>> {
        private final appendBackupVideoProfile TuitionPaymentFragmentbindingInflater1;
        private final TimeUnit TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final VideoRecordEventStart<T> b;

        public INotificationSideChannel(VideoRecordEventStart<T> videoRecordEventStart, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
            this.b = videoRecordEventStart;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = timeUnit;
            this.TuitionPaymentFragmentbindingInflater1 = appendbackupvideoprofile;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() throws Exception {
            return this.b.replay(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class notify<T, R> implements readableMs<VideoRecordEventStart<T>, AutoValue_VideoValidatedEncoderProfilesProxy<R>> {
        private final readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.readableMs
        public final /* bridge */ /* synthetic */ Object apply(Object obj) throws Exception {
            return VideoRecordEventStart.wrap((AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.apply((VideoRecordEventStart) obj), "The selector returned a null ObservableSource")).observeOn(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public notify(readableMs<? super VideoRecordEventStart<T>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems, appendBackupVideoProfile appendbackupvideoprofile) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendbackupvideoprofile;
        }
    }
}

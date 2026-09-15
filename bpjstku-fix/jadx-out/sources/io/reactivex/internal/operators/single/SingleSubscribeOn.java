package io.reactivex.internal.operators.single;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.BufferProviderState;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveCodec;
import defpackage.generateBackupProfile;
import defpackage.getDefaultVideoProfile;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleSubscribeOn<T> extends deriveCodec<T> {
    private generateBackupProfile<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private appendBackupVideoProfile b;

    public SingleSubscribeOn(generateBackupProfile<? extends T> generatebackupprofile, appendBackupVideoProfile appendbackupvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = generatebackupprofile;
        this.b = appendbackupvideoprofile;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(getdefaultvideoprofile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        getdefaultvideoprofile.onSubscribe(subscribeOnObserver);
        DisposableHelper.b((AtomicReference<BufferProviderState>) subscribeOnObserver.task, this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(subscribeOnObserver));
    }

    public static final class SubscribeOnObserver<T> extends AtomicReference<BufferProviderState> implements getDefaultVideoProfile<T>, BufferProviderState, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final getDefaultVideoProfile<? super T> downstream;
        final generateBackupProfile<? extends T> source;
        final SequentialDisposable task = new SequentialDisposable();
        private static final byte[] $$c = {74, 60, 122, -26};
        private static final int $$d = 157;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {59, -124, -78, 46};
        private static final int $$b = 222;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {59729, 59839, 59831, 59824, 59839, 59826, 59829, 59829, 59810, 59809, 59824, 59837, 59836, 59829, 59824, 59832, 59823, 59808, 59829, 59708, 59771, 59728, 59743, 59752, 59744, 59749, 59756, 59757, 59744, 59775, 59751, 59758, 59749, 59749, 59744, 59745, 59741, 59784, 59403, 59894, 59404, 59407, 59895, 59878, 59865, 59874, 59393, 59884, 59881, 59892, 59406, 59394, 59407, 59676, 59738, 59773, 59773, 59738, 59718, 59747, 59744, 59771, 59746, 59747, 59718, 59714, 59759, 59752, 59744, 59749, 59712, 59738, 59768, 59746, 59753, 59757, 59744, 59745, 59712, 59714, 59751, 59768, 59769, 59744, 59746, 59770, 59746, 59746, 59768, 59746, 59753, 59759, 59744, 59747, 59866, 59866, 59752, 59848, 59848, 59854, 59848, 59841, 59871, 59845, 59808, 59813, 59842, 59841, 59866, 59847, 59842, 59813, 59833, 59868, 59868, 59833, 59809, 59841, 59866, 59865, 59835, 59809, 59854, 59842, 59843, 59849, 59843, 59686, 59676, 59718, 59747, 59744, 59771, 59746, 59747, 59718, 59714, 59759, 59752, 59744, 59749, 59712, 59738, 59768, 59746, 59753, 59757, 59744, 59745, 59712, 59738, 59768, 59746, 59753, 59757, 59744, 59745, 59752, 59756, 59749, 59717, 59738, 59773, 59773};

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 4
                int r8 = 98 - r8
                int r7 = r7 * 3
                int r7 = r7 + 1
                byte[] r0 = io.reactivex.internal.operators.single.SingleSubscribeOn.SubscribeOnObserver.$$a
                int r9 = r9 * 3
                int r9 = 4 - r9
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r9
                r4 = r2
                goto L2b
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L26:
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2b:
                int r9 = -r9
                int r8 = r8 + r9
                int r9 = r3 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.single.SingleSubscribeOn.SubscribeOnObserver.c(short, short, short, java.lang.Object[]):void");
        }

        SubscribeOnObserver(getDefaultVideoProfile<? super T> getdefaultvideoprofile, generateBackupProfile<? extends T> generatebackupprofile) {
            this.downstream = getdefaultvideoprofile;
            this.source = generatebackupprofile;
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            if (i3 == 0) {
                int i4 = 80 / 0;
            }
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 == 0) {
                this.downstream.b(t);
                int i3 = 91 / 0;
            } else {
                this.downstream.b(t);
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                this.downstream.onError(th);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.downstream.onError(th);
            int i3 = TuitionPaymentFragmentbindingInflater1 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                this.task.dispose();
            } else {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                this.task.dispose();
                int i3 = 15 / 0;
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            BufferProviderState bufferProviderState = get();
            if (i3 != 0) {
                return DisposableHelper.TuitionPaymentFragmentbindingInflater1(bufferProviderState);
            }
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(bufferProviderState);
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                this.source.TuitionPaymentFragmentbindingInflater1(this);
                int i3 = 48 / 0;
            } else {
                this.source.TuitionPaymentFragmentbindingInflater1(this);
            }
            int i4 = TuitionPaymentFragmentbindingInflater1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2;
            int i3 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            char c = 0;
            int i4 = iArr[0];
            int i5 = 1;
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i9 = -1;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = $11 + 29;
                    $10 = i11 % 128;
                    if (i11 % i2 != 0) {
                        try {
                            Object[] objArr2 = new Object[i5];
                            objArr2[c] = Integer.valueOf(cArr[i10]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) i9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + i5), 1269 - TextUtils.indexOf((CharSequence) "", '0'), 18 - (ViewConfiguration.getLongPressTimeout() >> 16), 407021364, false, $$e((byte) ($$d & 7), b, (byte) (b + 1)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr[i10])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b2 = (byte) (-1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.blue(0), 1270 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - (ViewConfiguration.getWindowTouchSlop() >> 8), 407021364, false, $$e((byte) ($$d & 7), b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                            }
                            cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i10++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                    c = 0;
                    i5 = 1;
                    i9 = -1;
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i6];
            System.arraycopy(cArr, i4, cArr3, 0, i6);
            if (bArr != null) {
                char[] cArr4 = new char[i6];
                setvideostabilizationmode.b = 0;
                char c2 = 0;
                while (setvideostabilizationmode.b < i6) {
                    if (bArr[setvideostabilizationmode.b] == 1) {
                        int i12 = $11 + 83;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        int i14 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b3 = (byte) (-1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getOffsetBefore("", 0), 3225 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, 2133916302, false, $$e((byte) 6, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } else {
                        int i15 = setvideostabilizationmode.b;
                        Object[] objArr5 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                            int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            int i16 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22;
                            byte length2 = (byte) $$c.length;
                            byte b4 = (byte) (length2 - 5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, longPressTimeout, i16, 387247676, false, $$e(length2, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    }
                    c2 = cArr4[setvideostabilizationmode.b];
                    Object[] objArr6 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 41241), 1705 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 20 - MotionEvent.axisFromString(""), -1434471773, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    int i17 = $10 + 81;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                }
                cArr3 = cArr4;
            }
            if (i8 > 0) {
                char[] cArr5 = new char[i6];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i6);
                int i19 = i6 - i8;
                System.arraycopy(cArr5, 0, cArr3, i19, i8);
                System.arraycopy(cArr5, i8, cArr3, 0, i19);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr6 = new char[i6];
                setvideostabilizationmode.b = i;
                int i20 = $10 + 115;
                $11 = i20 % 128;
                int i21 = i20 % 2;
                while (setvideostabilizationmode.b < i6) {
                    int i22 = $11 + 55;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) % 0];
                        setvideostabilizationmode.b >>= 1;
                    } else {
                        cArr6[setvideostabilizationmode.b] = cArr3[(i6 - setvideostabilizationmode.b) - 1];
                        setvideostabilizationmode.b++;
                    }
                }
                cArr3 = cArr6;
            }
            if (i7 > 0) {
                int i23 = 0;
                while (true) {
                    setvideostabilizationmode.b = i23;
                    if (setvideostabilizationmode.b >= i6) {
                        break;
                    }
                    int i24 = $10 + 81;
                    $11 = i24 % 128;
                    int i25 = i24 % 2;
                    cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                    i23 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x02a8  */
        /* JADX WARN: Code duplicated, block: B:52:0x02b4 A[Catch: Exception -> 0x03e5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x03e5, blocks: (B:49:0x0284, B:52:0x02b4, B:58:0x0304, B:63:0x0328, B:65:0x034b, B:74:0x0395, B:75:0x039c, B:76:0x03a2, B:86:0x03de, B:87:0x03e4, B:68:0x0361, B:69:0x0377, B:72:0x037e, B:55:0x02d2, B:57:0x0300, B:56:0x02e9), top: B:103:0x0284, inners: #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x02d2 A[Catch: all -> 0x03dd, TRY_ENTER, TryCatch #3 {all -> 0x03dd, blocks: (B:55:0x02d2, B:57:0x0300, B:56:0x02e9), top: B:106:0x02d0, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x02e9 A[Catch: all -> 0x03dd, TryCatch #3 {all -> 0x03dd, blocks: (B:55:0x02d2, B:57:0x0300, B:56:0x02e9), top: B:106:0x02d0, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0324  */
        /* JADX WARN: Code duplicated, block: B:63:0x0328 A[Catch: Exception -> 0x03e5, TRY_ENTER, TryCatch #1 {Exception -> 0x03e5, blocks: (B:49:0x0284, B:52:0x02b4, B:58:0x0304, B:63:0x0328, B:65:0x034b, B:74:0x0395, B:75:0x039c, B:76:0x03a2, B:86:0x03de, B:87:0x03e4, B:68:0x0361, B:69:0x0377, B:72:0x037e, B:55:0x02d2, B:57:0x0300, B:56:0x02e9), top: B:103:0x0284, inners: #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x034b A[Catch: Exception -> 0x03e5, TRY_LEAVE, TryCatch #1 {Exception -> 0x03e5, blocks: (B:49:0x0284, B:52:0x02b4, B:58:0x0304, B:63:0x0328, B:65:0x034b, B:74:0x0395, B:75:0x039c, B:76:0x03a2, B:86:0x03de, B:87:0x03e4, B:68:0x0361, B:69:0x0377, B:72:0x037e, B:55:0x02d2, B:57:0x0300, B:56:0x02e9), top: B:103:0x0284, inners: #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x0361 A[Catch: all -> 0x037c, TRY_ENTER, TryCatch #2 {all -> 0x037c, blocks: (B:68:0x0361, B:69:0x0377, B:72:0x037e), top: B:104:0x035f, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:72:0x037e A[Catch: all -> 0x037c, TRY_LEAVE, TryCatch #2 {all -> 0x037c, blocks: (B:68:0x0361, B:69:0x0377, B:72:0x037e), top: B:104:0x035f, outer: #1 }] */
        /* JADX WARN: Code duplicated, block: B:77:0x03a3  */
        /* JADX WARN: Code duplicated, block: B:79:0x03b2  */
        /* JADX WARN: Code duplicated, block: B:80:0x03b4  */
        /* JADX WARN: Code duplicated, block: B:91:0x0500  */
        /* JADX WARN: Code duplicated, block: B:92:0x052e  */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
            int i3;
            String line;
            char c;
            Object[] objArr;
            int i4;
            int[] iArr;
            int[] iArr2;
            int i5;
            int i6;
            int i7;
            int i8;
            File file;
            FileReader fileReader;
            BufferedReader bufferedReader;
            int i9;
            String line2;
            String str;
            boolean zEquals;
            int i10;
            File file2;
            int i11;
            boolean z;
            boolean zEquals2;
            FileReader fileReader2;
            BufferedReader bufferedReader2;
            int i12;
            String line3;
            String str2;
            int i13;
            int i14 = 2 % 2;
            try {
                String[] strArr = new String[2];
                Object[] objArr2 = new Object[1];
                a(new int[]{0, 19, 80, 0}, true, new byte[]{0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, objArr2);
                strArr[0] = (String) objArr2[0];
                int[] iArr3 = {19, 18, 0, 10};
                int i15 = TuitionPaymentFragmentbindingInflater1;
                int i16 = (i15 & 75) + (i15 | 75);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                if (i16 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    a(iArr3, false, new byte[]{1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1}, objArr3);
                    strArr[1] = (String) objArr3[0];
                    i13 = 1;
                } else {
                    Object[] objArr4 = new Object[1];
                    a(iArr3, false, new byte[]{1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1}, objArr4);
                    strArr[1] = (String) objArr4[0];
                    i13 = 0;
                }
                while (true) {
                    if (i13 >= 2) {
                        i3 = i;
                        break;
                    }
                    int i17 = TuitionPaymentFragmentbindingInflater1;
                    int i18 = (i17 ^ 55) + ((i17 & 55) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                    if (i18 % 2 == 0) {
                        String str3 = strArr[i13];
                        Object[] objArr5 = new Object[1];
                        a(new int[]{37, 16, 153, 2}, false, new byte[]{1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}, objArr5);
                        Class<?> cls = Class.forName((String) objArr5[0]);
                        if (((Boolean) cls.getMethod(str3, new Class[1]).invoke(cls, null)).booleanValue()) {
                            i3 = (~(i & 1)) & (i | 1);
                            break;
                        }
                        i13++;
                    } else {
                        String str4 = strArr[i13];
                        Object[] objArr6 = new Object[1];
                        a(new int[]{37, 16, 153, 2}, true, new byte[]{1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0}, objArr6);
                        Class<?> cls2 = Class.forName((String) objArr6[0]);
                        if (((Boolean) cls2.getMethod(str4, new Class[0]).invoke(cls2, null)).booleanValue()) {
                            i3 = (~(i & 1)) & (i | 1);
                            break;
                        }
                        i13++;
                    }
                }
            } catch (Exception unused) {
                i3 = (i & (-3)) | ((~i) & 2);
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cRed = (char) (Color.red(0) + 2419);
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2846;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5;
                    byte b = (byte) 0;
                    byte b2 = b;
                    Object[] objArr7 = new Object[1];
                    c(b, b2, b2, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRed, bitsPerPixel, keyRepeatTimeout, -501222268, false, (String) objArr7[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                long j = -813233736;
                long j2 = -1;
                long j3 = j ^ j2;
                long j4 = i;
                long j5 = (((long) 567) * j) + (((long) (-565)) * jLongValue) + (((long) (-566)) * (((j3 | jLongValue) ^ j2) | ((j3 | j4) ^ j2)));
                long j6 = 566;
                long j7 = jLongValue ^ j2;
                long j8 = j5 + (((j | j7) ^ j2) * j6) + (j6 * ((j4 | (j3 | j7)) ^ j2)) + ((long) (-345952950));
                int i19 = (int) Runtime.getRuntime().totalMemory();
                int i20 = ((int) (j8 >> 32)) & (938799646 + (((~(1429366883 | i19)) | 1428308065) * (-502)) + ((~((~i19) | (-65937))) * (-502)) + (((~(i19 | 1428374001)) | 1429366883) * TypedValues.PositionType.TYPE_DRAWPATH));
                int iMyUid = Process.myUid();
                int i21 = ((int) j8) & ((-1643245310) + (((-1073807377) | iMyUid) * (-381)) + (((~((~iMyUid) | (-1119070813))) | (-1346699538)) * 381) + 1098717136);
                int i22 = (i20 & i21) | (i20 ^ i21);
                int i23 = (i22 & (-2)) | ((~i22) & 1);
                int i24 = (i23 | (-i23)) >> 31;
                int i25 = TuitionPaymentFragmentbindingInflater1 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                int i26 = i25 % 2;
                int i27 = (i ^ 10) & (~i24);
                int i28 = i24 & i;
                int i29 = (i28 & i27) | (i27 ^ i28);
                int i30 = (~(i & i3)) & (i | i3);
                int i31 = -i30;
                int i32 = ((i30 & i31) | (i30 ^ i31)) >> 31;
                int i33 = i29 & (~i32);
                int i34 = i3 & i32;
                int i35 = (i33 ^ i34) | (i34 & i33);
                try {
                    try {
                        Object[] objArr8 = new Object[1];
                        a(new int[]{53, 40, 0, 0}, false, new byte[]{1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1}, objArr8);
                        File file3 = new File((String) objArr8[0]);
                        int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
                        TuitionPaymentFragmentbindingInflater1 = i36 % 128;
                        int i37 = i36 % 2;
                        if (!(!file3.canRead())) {
                            FileReader fileReader3 = new FileReader(file3);
                            BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                            int i38 = TuitionPaymentFragmentbindingInflater1 + 15;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
                            int i39 = i38 % 2;
                            try {
                                line = bufferedReader3.readLine();
                                int[] iArr4 = {93, 3, 98, 2};
                                byte[] bArr = {1, 1, 0};
                                int i40 = TuitionPaymentFragmentbindingInflater1 + 79;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i40 % 128;
                                int i41 = i40 % 2;
                                Object[] objArr9 = new Object[1];
                                a(iArr4, false, bArr, objArr9);
                                if (line.equals((String) objArr9[0])) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                } else {
                                    int i42 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i43 = ((i42 | 63) << 1) - (i42 ^ 63);
                                    TuitionPaymentFragmentbindingInflater1 = i43 % 128;
                                    if (i43 % 2 != 0) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        throw null;
                                    }
                                    fileReader3.close();
                                    bufferedReader3.close();
                                }
                                Object[] objArr10 = new Object[1];
                                a(new int[]{96, 31, 97, 25}, true, new byte[]{0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1}, objArr10);
                                file = new File((String) objArr10[0]);
                                if (!file.canRead()) {
                                    fileReader = new FileReader(file);
                                    bufferedReader = new BufferedReader(fileReader);
                                    int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    i9 = (i44 ^ 29) + ((i44 & 29) << 1);
                                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                                    try {
                                        if (i9 % 2 != 0) {
                                            line2 = bufferedReader.readLine();
                                            Object[] objArr11 = new Object[1];
                                            a(new int[]{127, 1, 42, 0}, false, new byte[]{1}, objArr11);
                                            str = (String) objArr11[0];
                                        } else {
                                            line2 = bufferedReader.readLine();
                                            Object[] objArr12 = new Object[1];
                                            a(new int[]{127, 1, 42, 0}, true, new byte[]{1}, objArr12);
                                            str = (String) objArr12[0];
                                        }
                                        zEquals = line2.equals(str);
                                        fileReader.close();
                                        bufferedReader.close();
                                        int i45 = TuitionPaymentFragmentbindingInflater1;
                                        int i46 = (i45 & 17) + (i45 | 17);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i46 % 128;
                                        int i47 = i46 % 2;
                                        i10 = (i45 ^ 61) + ((i45 & 61) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                                        if (i10 % 2 == 0) {
                                            int i48 = 4 / 3;
                                        }
                                        if (zEquals) {
                                            Object[] objArr13 = new Object[1];
                                            a(new int[]{128, 36, 0, 32}, false, new byte[]{1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0}, objArr13);
                                            file2 = new File((String) objArr13[0]);
                                            if (!(!file2.canRead())) {
                                                fileReader2 = new FileReader(file2);
                                                bufferedReader2 = new BufferedReader(fileReader2);
                                                i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                                                TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                                                try {
                                                    if (i12 % 2 != 0) {
                                                        line3 = bufferedReader2.readLine();
                                                        Object[] objArr14 = new Object[1];
                                                        a(new int[]{127, 1, 42, 0}, true, new byte[]{1}, objArr14);
                                                        str2 = (String) objArr14[0];
                                                    } else {
                                                        line3 = bufferedReader2.readLine();
                                                        Object[] objArr15 = new Object[1];
                                                        a(new int[]{127, 1, 42, 0}, true, new byte[]{1}, objArr15);
                                                        str2 = (String) objArr15[0];
                                                    }
                                                    zEquals2 = line3.equals(str2);
                                                    fileReader2.close();
                                                    bufferedReader2.close();
                                                } catch (Throwable th) {
                                                    fileReader2.close();
                                                    bufferedReader2.close();
                                                    throw th;
                                                }
                                            } else {
                                                int i49 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                i11 = (i49 & 91) + (i49 | 91);
                                                TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                                                if (i11 % 2 != 0) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                zEquals2 = z;
                                            }
                                            if (!zEquals2 && line != null) {
                                                int i50 = TuitionPaymentFragmentbindingInflater1 + 63;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i50 % 128;
                                                int i51 = i50 % 2;
                                                objArr = new Object[]{new int[]{(~(i & 20)) & (i | 20)}, new String[]{line}};
                                                c = 0;
                                            }
                                        }
                                        int i52 = ((int[]) objArr[c])[c];
                                        int i53 = (~i35) & i;
                                        i4 = ~i;
                                        int i54 = i53 | (i35 & i4);
                                        int i55 = -i54;
                                        int i56 = ((i54 & i55) | (i54 ^ i55)) >> 31;
                                        int i57 = (~i56) & i52;
                                        int i58 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i59 = (i58 ^ 125) + ((i58 & 125) << 1);
                                        TuitionPaymentFragmentbindingInflater1 = i59 % 128;
                                        int i60 = i59 % 2;
                                        int i61 = i35 & i56;
                                        int i62 = (i61 & i57) | (i57 ^ i61);
                                        String[] strArr2 = (String[]) objArr[1];
                                        Object[] objArr16 = new Object[2];
                                        int i63 = i52 ^ i;
                                        int i64 = ((i63 | (-i63)) >> 31) & 1;
                                        int i65 = -i64;
                                        int i66 = i58 + 9;
                                        TuitionPaymentFragmentbindingInflater1 = i66 % 128;
                                        int i67 = i66 % 2;
                                        int i68 = (~(((i65 & i64) | (i64 ^ i65)) >> 31)) & 1;
                                        objArr16[i64] = null;
                                        objArr16[i68] = strArr2;
                                        String[] strArr3 = (String[]) objArr16[0];
                                        int i69 = i58 + 49;
                                        int i70 = i69 % 128;
                                        TuitionPaymentFragmentbindingInflater1 = i70;
                                        int i71 = i69 % 2;
                                        iArr2 = new int[1];
                                        int i72 = ((~i62) & i) | (i62 & i4);
                                        int i73 = -i72;
                                        int i74 = (((i72 & i73) | (i72 ^ i73)) >> 31) & 16;
                                        int i75 = (i70 & 125) + (i70 | 125);
                                        int i76 = i75 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i76;
                                        int i77 = i75 % 2;
                                        iArr = new int[]{i};
                                        Object[] objArr17 = {iArr, iArr2, new int[]{i62}, strArr3};
                                        int i78 = ~((-88603531) | i);
                                        int i79 = ((1883212104 + (((-128913760) | i78) * (-220))) + ((i78 | 4254336) * 220)) - 1075111924;
                                        int i80 = -(-i74);
                                        i5 = ((i79 | i80) << 1) - (i80 ^ i79);
                                        int i81 = i5 * 615;
                                        int i82 = i2 * (-613);
                                        int i83 = ((i81 | i82) << 1) - (i81 ^ i82);
                                        int i84 = ~i5;
                                        int i85 = (~((i84 ^ i2) | (i84 & i2))) | i;
                                        int i86 = ~i2;
                                        int i87 = i76 + 15;
                                        TuitionPaymentFragmentbindingInflater1 = i87 % 128;
                                        int i88 = i87 % 2;
                                        int i89 = (i83 - (~(-(-((i85 | (~((i86 ^ i5) | (i86 & i5)))) * 614))))) - 1;
                                        int i90 = ~((i84 & i4) | (i84 ^ i4));
                                        int i91 = ~i5;
                                        int i92 = ~((i91 ^ i2) | (i91 & i2));
                                        int i93 = (i90 & i92) | (i90 ^ i92);
                                        int i94 = ~((i4 ^ i2) | (i4 & i2));
                                        int i95 = -(-(((i93 & i94) | (i93 ^ i94)) * (-1228)));
                                        i6 = (i89 & i95) + (i95 | i89);
                                        i7 = (i91 ^ i86) | (i91 & i86);
                                        i8 = i76 + 29;
                                        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                                        if (i8 % 2 != 0) {
                                            int i96 = ~((i7 & i4) | (i7 ^ i4));
                                            int i97 = ~((~i) | i5 | i2);
                                            int i98 = i6 << (((i96 & i97) | (i96 ^ i97)) * 614);
                                            int i99 = i98 >> 109;
                                            int i100 = (i98 | i99) & (~(i98 & i99));
                                            int i101 = (i100 & 73) + (i100 | 73);
                                            int i102 = (i100 | i101) & (~(i100 & i101));
                                            int i103 = i102 >> 2;
                                            iArr[0] = ((~i102) & i103) | ((~i103) & i102);
                                        } else {
                                            int i104 = ~((i7 & i4) | (i7 ^ i4));
                                            int i105 = (i4 ^ i5) | (i4 & i5);
                                            int i106 = ~((i105 & i2) | (i105 ^ i2));
                                            int i107 = ((i104 & i106) | (i104 ^ i106)) * 614;
                                            int i108 = ((i6 | i107) << 1) - (i107 ^ i6);
                                            int i109 = (i108 << 13) ^ i108;
                                            int i110 = i109 >>> 17;
                                            int i111 = ((~i109) & i110) | ((~i110) & i109);
                                            int i112 = i111 << 5;
                                            iArr2[0] = ((~i111) & i112) | ((~i112) & i111);
                                        }
                                        return objArr17;
                                    } catch (Throwable th2) {
                                        fileReader.close();
                                        bufferedReader.close();
                                        throw th2;
                                    }
                                }
                                int i113 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                                TuitionPaymentFragmentbindingInflater1 = i113 % 128;
                                int i114 = i113 % 2;
                                c = 0;
                                objArr = new Object[]{new int[]{i}, new String[0]};
                                int i510 = ((int[]) objArr[c])[c];
                                int i511 = (~i35) & i;
                                i4 = ~i;
                                int i512 = i511 | (i35 & i4);
                                int i513 = -i512;
                                int i514 = ((i512 & i513) | (i512 ^ i513)) >> 31;
                                int i515 = (~i514) & i510;
                                int i516 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i517 = (i516 ^ 125) + ((i516 & 125) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i517 % 128;
                                int i610 = i517 % 2;
                                int i611 = i35 & i514;
                                int i612 = (i611 & i515) | (i515 ^ i611);
                                String[] strArr4 = (String[]) objArr[1];
                                Object[] objArr18 = new Object[2];
                                int i613 = i510 ^ i;
                                int i614 = ((i613 | (-i613)) >> 31) & 1;
                                int i615 = -i614;
                                int i616 = i516 + 9;
                                TuitionPaymentFragmentbindingInflater1 = i616 % 128;
                                int i617 = i616 % 2;
                                int i618 = (~(((i615 & i614) | (i614 ^ i615)) >> 31)) & 1;
                                objArr18[i614] = null;
                                objArr18[i618] = strArr4;
                                String[] strArr5 = (String[]) objArr18[0];
                                int i619 = i516 + 49;
                                int i710 = i619 % 128;
                                TuitionPaymentFragmentbindingInflater1 = i710;
                                int i711 = i619 % 2;
                                iArr2 = new int[1];
                                int i712 = ((~i612) & i) | (i612 & i4);
                                int i713 = -i712;
                                int i714 = (((i712 & i713) | (i712 ^ i713)) >> 31) & 16;
                                int i715 = (i710 & 125) + (i710 | 125);
                                int i716 = i715 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i716;
                                int i717 = i715 % 2;
                                iArr = new int[]{i};
                                Object[] objArr19 = {iArr, iArr2, new int[]{i612}, strArr5};
                                int i718 = ~((-88603531) | i);
                                int i719 = ((1883212104 + (((-128913760) | i718) * (-220))) + ((i718 | 4254336) * 220)) - 1075111924;
                                int i810 = -(-i714);
                                i5 = ((i719 | i810) << 1) - (i810 ^ i719);
                                int i811 = i5 * 615;
                                int i812 = i2 * (-613);
                                int i813 = ((i811 | i812) << 1) - (i811 ^ i812);
                                int i814 = ~i5;
                                int i815 = (~((i814 ^ i2) | (i814 & i2))) | i;
                                int i816 = ~i2;
                                int i817 = i716 + 15;
                                TuitionPaymentFragmentbindingInflater1 = i817 % 128;
                                int i818 = i817 % 2;
                                int i819 = (i813 - (~(-(-((i815 | (~((i816 ^ i5) | (i816 & i5)))) * 614))))) - 1;
                                int i910 = ~((i814 & i4) | (i814 ^ i4));
                                int i911 = ~i5;
                                int i912 = ~((i911 ^ i2) | (i911 & i2));
                                int i913 = (i910 & i912) | (i910 ^ i912);
                                int i914 = ~((i4 ^ i2) | (i4 & i2));
                                int i915 = -(-(((i913 & i914) | (i913 ^ i914)) * (-1228)));
                                i6 = (i819 & i915) + (i915 | i819);
                                i7 = (i911 ^ i816) | (i911 & i816);
                                i8 = i716 + 29;
                                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                                if (i8 % 2 != 0) {
                                    int i916 = ~((i7 & i4) | (i7 ^ i4));
                                    int i917 = ~((~i) | i5 | i2);
                                    int i918 = i6 << (((i916 & i917) | (i916 ^ i917)) * 614);
                                    int i919 = i918 >> 109;
                                    int i1010 = (i918 | i919) & (~(i918 & i919));
                                    int i1011 = (i1010 & 73) + (i1010 | 73);
                                    int i1012 = (i1010 | i1011) & (~(i1010 & i1011));
                                    int i1013 = i1012 >> 2;
                                    iArr[0] = ((~i1012) & i1013) | ((~i1013) & i1012);
                                } else {
                                    int i1014 = ~((i7 & i4) | (i7 ^ i4));
                                    int i1015 = (i4 ^ i5) | (i4 & i5);
                                    int i1016 = ~((i1015 & i2) | (i1015 ^ i2));
                                    int i1017 = ((i1014 & i1016) | (i1014 ^ i1016)) * 614;
                                    int i1018 = ((i6 | i1017) << 1) - (i1017 ^ i6);
                                    int i1019 = (i1018 << 13) ^ i1018;
                                    int i115 = i1019 >>> 17;
                                    int i116 = ((~i1019) & i115) | ((~i115) & i1019);
                                    int i117 = i116 << 5;
                                    iArr2[0] = ((~i116) & i117) | ((~i117) & i116);
                                }
                                return objArr19;
                            } catch (Throwable th3) {
                                fileReader3.close();
                                bufferedReader3.close();
                                throw th3;
                            }
                        }
                        int i118 = TuitionPaymentFragmentbindingInflater1;
                        int i119 = ((i118 | 73) << 1) - (i118 ^ 73);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i119 % 128;
                        int i120 = i119 % 2;
                    } catch (Exception unused2) {
                    }
                    Object[] objArr110 = new Object[1];
                    a(new int[]{96, 31, 97, 25}, true, new byte[]{0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1}, objArr110);
                    file = new File((String) objArr110[0]);
                    if (!file.canRead()) {
                        fileReader = new FileReader(file);
                        bufferedReader = new BufferedReader(fileReader);
                        int i410 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i9 = (i410 ^ 29) + ((i410 & 29) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                        if (i9 % 2 != 0) {
                            line2 = bufferedReader.readLine();
                            Object[] objArr111 = new Object[1];
                            a(new int[]{127, 1, 42, 0}, false, new byte[]{1}, objArr111);
                            str = (String) objArr111[0];
                        } else {
                            line2 = bufferedReader.readLine();
                            Object[] objArr112 = new Object[1];
                            a(new int[]{127, 1, 42, 0}, true, new byte[]{1}, objArr112);
                            str = (String) objArr112[0];
                        }
                        zEquals = line2.equals(str);
                        fileReader.close();
                        bufferedReader.close();
                        int i411 = TuitionPaymentFragmentbindingInflater1;
                        int i412 = (i411 & 17) + (i411 | 17);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i412 % 128;
                        int i413 = i412 % 2;
                        i10 = (i411 ^ 61) + ((i411 & 61) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i414 = 4 / 3;
                        }
                        if (zEquals) {
                            Object[] objArr113 = new Object[1];
                            a(new int[]{128, 36, 0, 32}, false, new byte[]{1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0}, objArr113);
                            file2 = new File((String) objArr113[0]);
                            if (!(!file2.canRead())) {
                                fileReader2 = new FileReader(file2);
                                bufferedReader2 = new BufferedReader(fileReader2);
                                i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                                TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                                if (i12 % 2 != 0) {
                                    line3 = bufferedReader2.readLine();
                                    Object[] objArr114 = new Object[1];
                                    a(new int[]{127, 1, 42, 0}, true, new byte[]{1}, objArr114);
                                    str2 = (String) objArr114[0];
                                } else {
                                    line3 = bufferedReader2.readLine();
                                    Object[] objArr115 = new Object[1];
                                    a(new int[]{127, 1, 42, 0}, true, new byte[]{1}, objArr115);
                                    str2 = (String) objArr115[0];
                                }
                                zEquals2 = line3.equals(str2);
                                fileReader2.close();
                                bufferedReader2.close();
                            } else {
                                int i415 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                i11 = (i415 & 91) + (i415 | 91);
                                TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                zEquals2 = z;
                            }
                            if (!zEquals2) {
                            }
                        }
                        int i518 = ((int[]) objArr[c])[c];
                        int i519 = (~i35) & i;
                        i4 = ~i;
                        int i5110 = i519 | (i35 & i4);
                        int i5111 = -i5110;
                        int i5112 = ((i5110 & i5111) | (i5110 ^ i5111)) >> 31;
                        int i5113 = (~i5112) & i518;
                        int i5114 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i5115 = (i5114 ^ 125) + ((i5114 & 125) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i5115 % 128;
                        int i6110 = i5115 % 2;
                        int i6111 = i35 & i5112;
                        int i6112 = (i6111 & i5113) | (i5113 ^ i6111);
                        String[] strArr6 = (String[]) objArr[1];
                        Object[] objArr116 = new Object[2];
                        int i6113 = i518 ^ i;
                        int i6114 = ((i6113 | (-i6113)) >> 31) & 1;
                        int i6115 = -i6114;
                        int i6116 = i5114 + 9;
                        TuitionPaymentFragmentbindingInflater1 = i6116 % 128;
                        int i6117 = i6116 % 2;
                        int i6118 = (~(((i6115 & i6114) | (i6114 ^ i6115)) >> 31)) & 1;
                        objArr116[i6114] = null;
                        objArr116[i6118] = strArr6;
                        String[] strArr7 = (String[]) objArr116[0];
                        int i6119 = i5114 + 49;
                        int i7110 = i6119 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i7110;
                        int i7111 = i6119 % 2;
                        iArr2 = new int[1];
                        int i7112 = ((~i6112) & i) | (i6112 & i4);
                        int i7113 = -i7112;
                        int i7114 = (((i7112 & i7113) | (i7112 ^ i7113)) >> 31) & 16;
                        int i7115 = (i7110 & 125) + (i7110 | 125);
                        int i7116 = i7115 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7116;
                        int i7117 = i7115 % 2;
                        iArr = new int[]{i};
                        Object[] objArr117 = {iArr, iArr2, new int[]{i6112}, strArr7};
                        int i7118 = ~((-88603531) | i);
                        int i7119 = ((1883212104 + (((-128913760) | i7118) * (-220))) + ((i7118 | 4254336) * 220)) - 1075111924;
                        int i8110 = -(-i7114);
                        i5 = ((i7119 | i8110) << 1) - (i8110 ^ i7119);
                        int i8111 = i5 * 615;
                        int i8112 = i2 * (-613);
                        int i8113 = ((i8111 | i8112) << 1) - (i8111 ^ i8112);
                        int i8114 = ~i5;
                        int i8115 = (~((i8114 ^ i2) | (i8114 & i2))) | i;
                        int i8116 = ~i2;
                        int i8117 = i7116 + 15;
                        TuitionPaymentFragmentbindingInflater1 = i8117 % 128;
                        int i8118 = i8117 % 2;
                        int i8119 = (i8113 - (~(-(-((i8115 | (~((i8116 ^ i5) | (i8116 & i5)))) * 614))))) - 1;
                        int i9110 = ~((i8114 & i4) | (i8114 ^ i4));
                        int i9111 = ~i5;
                        int i9112 = ~((i9111 ^ i2) | (i9111 & i2));
                        int i9113 = (i9110 & i9112) | (i9110 ^ i9112);
                        int i9114 = ~((i4 ^ i2) | (i4 & i2));
                        int i9115 = -(-(((i9113 & i9114) | (i9113 ^ i9114)) * (-1228)));
                        i6 = (i8119 & i9115) + (i9115 | i8119);
                        i7 = (i9111 ^ i8116) | (i9111 & i8116);
                        i8 = i7116 + 29;
                        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9116 = ~((i7 & i4) | (i7 ^ i4));
                            int i9117 = ~((~i) | i5 | i2);
                            int i9118 = i6 << (((i9116 & i9117) | (i9116 ^ i9117)) * 614);
                            int i9119 = i9118 >> 109;
                            int i10110 = (i9118 | i9119) & (~(i9118 & i9119));
                            int i10111 = (i10110 & 73) + (i10110 | 73);
                            int i10112 = (i10110 | i10111) & (~(i10110 & i10111));
                            int i10113 = i10112 >> 2;
                            iArr[0] = ((~i10112) & i10113) | ((~i10113) & i10112);
                        } else {
                            int i10114 = ~((i7 & i4) | (i7 ^ i4));
                            int i10115 = (i4 ^ i5) | (i4 & i5);
                            int i10116 = ~((i10115 & i2) | (i10115 ^ i2));
                            int i10117 = ((i10114 & i10116) | (i10114 ^ i10116)) * 614;
                            int i10118 = ((i6 | i10117) << 1) - (i10117 ^ i6);
                            int i10119 = (i10118 << 13) ^ i10118;
                            int i1110 = i10119 >>> 17;
                            int i1111 = ((~i10119) & i1110) | ((~i1110) & i10119);
                            int i1112 = i1111 << 5;
                            iArr2[0] = ((~i1111) & i1112) | ((~i1112) & i1111);
                        }
                        return objArr117;
                    }
                    int i1113 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                    TuitionPaymentFragmentbindingInflater1 = i1113 % 128;
                    int i1114 = i1113 % 2;
                } catch (Exception unused3) {
                }
                line = null;
                c = 0;
                objArr = new Object[]{new int[]{i}, new String[0]};
                int i5116 = ((int[]) objArr[c])[c];
                int i5117 = (~i35) & i;
                i4 = ~i;
                int i5118 = i5117 | (i35 & i4);
                int i5119 = -i5118;
                int i51110 = ((i5118 & i5119) | (i5118 ^ i5119)) >> 31;
                int i51111 = (~i51110) & i5116;
                int i51112 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i51113 = (i51112 ^ 125) + ((i51112 & 125) << 1);
                TuitionPaymentFragmentbindingInflater1 = i51113 % 128;
                int i61110 = i51113 % 2;
                int i61111 = i35 & i51110;
                int i61112 = (i61111 & i51111) | (i51111 ^ i61111);
                String[] strArr8 = (String[]) objArr[1];
                Object[] objArr118 = new Object[2];
                int i61113 = i5116 ^ i;
                int i61114 = ((i61113 | (-i61113)) >> 31) & 1;
                int i61115 = -i61114;
                int i61116 = i51112 + 9;
                TuitionPaymentFragmentbindingInflater1 = i61116 % 128;
                int i61117 = i61116 % 2;
                int i61118 = (~(((i61115 & i61114) | (i61114 ^ i61115)) >> 31)) & 1;
                objArr118[i61114] = null;
                objArr118[i61118] = strArr8;
                String[] strArr9 = (String[]) objArr118[0];
                int i61119 = i51112 + 49;
                int i71110 = i61119 % 128;
                TuitionPaymentFragmentbindingInflater1 = i71110;
                int i71111 = i61119 % 2;
                iArr2 = new int[1];
                int i71112 = ((~i61112) & i) | (i61112 & i4);
                int i71113 = -i71112;
                int i71114 = (((i71112 & i71113) | (i71112 ^ i71113)) >> 31) & 16;
                int i71115 = (i71110 & 125) + (i71110 | 125);
                int i71116 = i71115 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i71116;
                int i71117 = i71115 % 2;
                iArr = new int[]{i};
                Object[] objArr119 = {iArr, iArr2, new int[]{i61112}, strArr9};
                int i71118 = ~((-88603531) | i);
                int i71119 = ((1883212104 + (((-128913760) | i71118) * (-220))) + ((i71118 | 4254336) * 220)) - 1075111924;
                int i81110 = -(-i71114);
                i5 = ((i71119 | i81110) << 1) - (i81110 ^ i71119);
                int i81111 = i5 * 615;
                int i81112 = i2 * (-613);
                int i81113 = ((i81111 | i81112) << 1) - (i81111 ^ i81112);
                int i81114 = ~i5;
                int i81115 = (~((i81114 ^ i2) | (i81114 & i2))) | i;
                int i81116 = ~i2;
                int i81117 = i71116 + 15;
                TuitionPaymentFragmentbindingInflater1 = i81117 % 128;
                int i81118 = i81117 % 2;
                int i81119 = (i81113 - (~(-(-((i81115 | (~((i81116 ^ i5) | (i81116 & i5)))) * 614))))) - 1;
                int i91110 = ~((i81114 & i4) | (i81114 ^ i4));
                int i91111 = ~i5;
                int i91112 = ~((i91111 ^ i2) | (i91111 & i2));
                int i91113 = (i91110 & i91112) | (i91110 ^ i91112);
                int i91114 = ~((i4 ^ i2) | (i4 & i2));
                int i91115 = -(-(((i91113 & i91114) | (i91113 ^ i91114)) * (-1228)));
                i6 = (i81119 & i91115) + (i91115 | i81119);
                i7 = (i91111 ^ i81116) | (i91111 & i81116);
                i8 = i71116 + 29;
                TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i91116 = ~((i7 & i4) | (i7 ^ i4));
                    int i91117 = ~((~i) | i5 | i2);
                    int i91118 = i6 << (((i91116 & i91117) | (i91116 ^ i91117)) * 614);
                    int i91119 = i91118 >> 109;
                    int i101110 = (i91118 | i91119) & (~(i91118 & i91119));
                    int i101111 = (i101110 & 73) + (i101110 | 73);
                    int i101112 = (i101110 | i101111) & (~(i101110 & i101111));
                    int i101113 = i101112 >> 2;
                    iArr[0] = ((~i101112) & i101113) | ((~i101113) & i101112);
                } else {
                    int i101114 = ~((i7 & i4) | (i7 ^ i4));
                    int i101115 = (i4 ^ i5) | (i4 & i5);
                    int i101116 = ~((i101115 & i2) | (i101115 ^ i2));
                    int i101117 = ((i101114 & i101116) | (i101114 ^ i101116)) * 614;
                    int i101118 = ((i6 | i101117) << 1) - (i101117 ^ i6);
                    int i101119 = (i101118 << 13) ^ i101118;
                    int i1115 = i101119 >>> 17;
                    int i1116 = ((~i101119) & i1115) | ((~i1115) & i101119);
                    int i1117 = i1116 << 5;
                    iArr2[0] = ((~i1116) & i1117) | ((~i1117) & i1116);
                }
                return objArr119;
            } catch (Throwable th4) {
                Throwable cause = th4.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(short r6, short r7, int r8) {
            /*
                int r6 = 105 - r6
                int r8 = r8 * 2
                int r0 = r8 + 1
                int r7 = r7 + 4
                byte[] r1 = io.reactivex.internal.operators.single.SingleSubscribeOn.SubscribeOnObserver.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L13
                r3 = r7
                r6 = r8
                r4 = r2
                goto L29
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r7 = r7 + 1
                if (r3 != r8) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L21:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L29:
                int r7 = -r7
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.single.SingleSubscribeOn.SubscribeOnObserver.$$e(short, short, int):java.lang.String");
        }
    }
}

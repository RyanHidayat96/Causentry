package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.reactivex.internal.util.NotificationLite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdastop3androidxcameravideointernalaudioAudioSource<T> implements Iterable<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentbindingInflater1;

    public lambdastop3androidxcameravideointernalaudioAudioSource(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_VideoValidatedEncoderProfilesProxy;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        VideoRecordEventStart.wrap(this.TuitionPaymentFragmentbindingInflater1).materialize().subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> extends isProblematicMimeType<VideoRecordEventStatus<T>> implements Iterator<T> {
        private VideoRecordEventStatus<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {114, -59, 10, 31};
        private static final int $$f = 101;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {58, -103, 118, 14, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -20, 16, -7, 13, -3, 4, 18, -4, 8, 1, 1, 58, -73, 3, 24, 5, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 68};
        private static final int $$e = 62;
        private static final byte[] $$a = {94, -1, 37, -59, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$b = 248;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int asInterface = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722401;
        private Semaphore b = new Semaphore(0);
        private AtomicReference<VideoRecordEventStatus<T>> TuitionPaymentFragmentbindingInflater1 = new AtomicReference<>();

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                int r9 = 103 - r9
                int r7 = r7 * 52
                int r7 = 53 - r7
                int r8 = r8 * 52
                int r8 = 56 - r8
                byte[] r0 = lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r8
                goto L2a
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2a:
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + (-11)
                int r9 = r9 + 1
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a(byte, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r0 = 54 - r8
                int r6 = r6 * 15
                int r6 = r6 + 84
                byte[] r1 = lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                int r8 = 53 - r8
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L2c
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L24:
                int r7 = r7 + 1
                r3 = r1[r7]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L2c:
                int r6 = -r6
                int r7 = r7 + r6
                int r6 = r7 + 3
                r7 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d(int, short, int, java.lang.Object[]):void");
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // defpackage.deriveMediaType
        public final /* synthetic */ void onNext(Object obj) {
            int i = 2 % 2;
            if (this.TuitionPaymentFragmentbindingInflater1.getAndSet((VideoRecordEventStatus) obj) == null) {
                int i2 = asInterface + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                this.b.release();
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 96 / 0;
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            if (i3 == 0) {
                int i4 = 8 / 0;
            }
            int i5 = asInterface + 83;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            if (io.reactivex.internal.util.NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r1 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
        
            if ((!io.reactivex.internal.util.NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1)) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            r2 = lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
            lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface = r2 % 128;
            r2 = r2 % 2;
            r2 = io.reactivex.internal.util.NotificationLite.b(r1);
            r1 = lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
            lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        
            throw io.reactivex.internal.util.ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
        
            if (io.reactivex.internal.util.NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != false) goto L11;
         */
        @Override // java.util.Iterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean hasNext() {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                VideoRecordEventStatus<T> r1 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                r2 = 0
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L4e
                int r5 = lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r5 = r5 + r4
                int r6 = r5 % 128
                lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface = r6
                int r5 = r5 % r0
                if (r5 != 0) goto L20
                java.lang.Object r1 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                boolean r1 = io.reactivex.internal.util.NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1)
                r5 = 17
                int r5 = r5 / r3
                if (r1 == 0) goto L4e
                goto L28
            L20:
                java.lang.Object r1 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                boolean r1 = io.reactivex.internal.util.NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1)
                if (r1 == 0) goto L4e
            L28:
                VideoRecordEventStatus<T> r1 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                java.lang.Object r1 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                boolean r3 = io.reactivex.internal.util.NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1)
                r3 = r3 ^ r4
                if (r3 != 0) goto L49
                int r2 = lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r2 = r2 + 65
                int r3 = r2 % 128
                lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface = r3
                int r2 = r2 % r0
                java.lang.Throwable r2 = io.reactivex.internal.util.NotificationLite.b(r1)
                int r1 = lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r1 = r1 + 73
                int r3 = r1 % 128
                lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface = r3
                int r1 = r1 % r0
            L49:
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r2)
                throw r0
            L4e:
                VideoRecordEventStatus<T> r1 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                if (r1 != 0) goto L92
                java.util.concurrent.Semaphore r1 = r7.b     // Catch: java.lang.InterruptedException -> L83
                r1.acquire()     // Catch: java.lang.InterruptedException -> L83
                java.util.concurrent.atomic.AtomicReference<VideoRecordEventStatus<T>> r1 = r7.TuitionPaymentFragmentbindingInflater1
                java.lang.Object r1 = r1.getAndSet(r2)
                VideoRecordEventStatus r1 = (defpackage.VideoRecordEventStatus) r1
                r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1
                java.lang.Object r5 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                boolean r5 = io.reactivex.internal.util.NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r5)
                if (r5 == 0) goto L92
                java.lang.Object r1 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                boolean r3 = io.reactivex.internal.util.NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1)
                if (r3 == 0) goto L7e
                int r2 = lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r2 = r2 + 61
                int r3 = r2 % 128
                lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface = r3
                int r2 = r2 % r0
                java.lang.Throwable r2 = io.reactivex.internal.util.NotificationLite.b(r1)
            L7e:
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r2)
                throw r0
            L83:
                r0 = move-exception
                r7.dispose()
                VideoRecordEventStatus r1 = defpackage.VideoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r0)
                r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r0)
                throw r0
            L92:
                VideoRecordEventStatus<T> r1 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                java.lang.Object r1 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                if (r1 == 0) goto Lb4
                int r2 = lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r2 = r2 + 47
                int r5 = r2 % 128
                lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface = r5
                int r2 = r2 % r0
                if (r2 != 0) goto Lad
                boolean r0 = io.reactivex.internal.util.NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1)
                r1 = 25
                int r1 = r1 / r3
                if (r0 != 0) goto Lb4
                goto Lb3
            Lad:
                boolean r0 = io.reactivex.internal.util.NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1)
                if (r0 != 0) goto Lb4
            Lb3:
                return r4
            Lb4:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hasNext():boolean");
        }

        private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i5 = $11 + 33;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getTrimmedLength(""), 3291 - View.getDefaultSize(0, 0), 31 - Color.alpha(0), 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 1), 699 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, -450685997, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
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
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 650, 44 - (Process.myTid() >> 22), -450685997, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
            int i8 = $11 + 119;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x025d  */
        /* JADX WARN: Code duplicated, block: B:56:0x053b  */
        @Override // java.util.Iterator
        public final T next() throws Throwable {
            Object[] objArr;
            T t;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cBlue = (char) Color.blue(0);
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 877;
                int iIndexOf2 = 10 - TextUtils.indexOf("", "", 0, 0);
                byte b = $$a[5];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, (byte) (b2 + 4), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iIndexOf, iIndexOf2, 252381699, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(true, TextUtils.indexOf((CharSequence) "", '0', 0) + 161, 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.argb(0, 0, 0, 0) + 16, new char[]{2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n'}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(false, 165 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15, 5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
                byte[] bArr = $$a;
                Object[] objArr5 = new Object[1];
                a(bArr[7], bArr[5], bArr[10], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, iIndexOf3, longPressTimeout, 2009631821, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[5];
                    byte b4 = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    a(b3, b4, b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, absoluteGravity, keyRepeatTimeout, 256017550, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iNextInt = new Random().nextInt(1828790721);
                int i2 = ~((-601538383) | (~iNextInt));
                int i3 = (((((-603701120) | i2) | (~(601538382 | iNextInt))) * (-338)) - 2147205420) + (((~(iNextInt | (-2162738))) | i2) * 338) + 1350387649;
                int i4 = (i3 << 13) ^ i3;
                int i5 = i4 ^ (i4 >>> 17);
                ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(true, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 160, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26, 17 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(true, ExpandableListView.getPackedPositionChild(0L) + 168, 18 - TextUtils.getCapsMode("", 0, 0), -TextUtils.lastIndexOf("", '0', 0, 0), new char[]{65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 87;
                        asInterface = i6 % 128;
                        if (i6 % 2 == 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                c(false, TextUtils.lastIndexOf("", '0', 0) + 160, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, (ViewConfiguration.getWindowTouchSlop() >> 8) + 3, new char[]{18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(false, 162 - TextUtils.lastIndexOf("", '0'), 16 - (ViewConfiguration.getPressedStateDuration() >> 16), 9 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14}, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 1350387649};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[50];
                    byte b6 = (byte) (-b5);
                    Object[] objArr13 = new Object[1];
                    d(b5, b6, (byte) (b6 + 1), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr3[50];
                    byte b8 = (byte) (b7 - 1);
                    Object[] objArr14 = new Object[1];
                    d(b8, (byte) (b8 | 52), b7, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[5];
                            byte b10 = bArr4[7];
                            Object[] objArr16 = new Object[1];
                            a(b9, b10, b10, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, edgeSlop, i9, 256017550, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(true, TextUtils.indexOf("", "") + 160, 21 - ImageFormat.getBitsPerPixel(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, new char[]{2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n'}, objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(false, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 163, Process.getGidForName("") + 16, Color.red(0) + 4, new char[]{'\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5}, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char edgeSlop2 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                                int iMyPid = (Process.myPid() >> 22) + 10;
                                byte[] bArr5 = $$a;
                                Object[] objArr19 = new Object[1];
                                a(bArr5[7], bArr5[5], bArr5[10], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop2, i10, iMyPid, 2009631821, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 10;
                                byte b11 = $$a[5];
                                byte b12 = b11;
                                Object[] objArr20 = new Object[1];
                                a(b11, b12, (byte) (b12 + 4), objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionChild, scrollBarSize2, deadChar, 252381699, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
                throw null;
            }
            int i11 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i12 = i11 + ((~((~iUptimeMillis) | 498822903)) * 130) + 462645188 + (((~(iUptimeMillis | 498822903)) | 1024) * 130);
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr21[1])[0] = i14 ^ (i14 << 5);
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i15 = asInterface + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
            int i16 = i15 % 2;
            VideoRecordEventStatus<T> videoRecordEventStatus = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object obj = videoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (obj != null) {
                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                asInterface = i17 % 128;
                int i18 = i17 % 2;
                if (!(!NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj))) {
                    t = (T) null;
                } else {
                    t = (T) videoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
            } else {
                t = (T) null;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = 2 % 2;
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = asInterface + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 13 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, short r7, int r8) {
            /*
                byte[] r0 = lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                int r7 = 120 - r7
                int r8 = r8 * 2
                int r8 = r8 + 1
                int r6 = r6 * 2
                int r6 = 4 - r6
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r6
                r7 = r8
                r4 = r2
                goto L25
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r3 = r0[r6]
            L25:
                int r6 = r6 + 1
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdastop3androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(int, short, int):java.lang.String");
        }
    }
}

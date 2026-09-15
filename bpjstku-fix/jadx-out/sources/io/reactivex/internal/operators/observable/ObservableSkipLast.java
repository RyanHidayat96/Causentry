package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.deInitSession;
import defpackage.deriveMediaType;
import defpackage.initSession;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSkipLast<T> extends notifySuspended<T, T> {
    private int b;

    public ObservableSkipLast(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, int i) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = i;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new SkipLastObserver(derivemediatype, this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SkipLastObserver<T> extends ArrayDeque<T> implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -3807491841935125653L;
        final deriveMediaType<? super T> downstream;
        final int skip;
        BufferProviderState upstream;
        private static final byte[] $$c = {8, -36, 87, -65};
        private static final int $$f = 14;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {109, 48, -62, 38, 20, 6, -55, 60, 22, 2, 17, 9, -1, 18, -63, 62, 5, 27, -11, 9, 15, 13, -2, 13, 13, 1, -49, 27, 42, 25, -3, 21, -5, 19, 13, -27, 27, 3, 9, 18, -23, 36, -3, 32, -12, 21, -40, 47, 13, -2, 13, 13, 1, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57};
        private static final int $$e = 99;
        private static final byte[] $$a = {113, 29, -123, -97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 98;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static char[] b = {60072, 60063, 60062, 60117, 60083, 60043, 60054, 60041, 60075, 60058, 60056, 60073, 60053, 60034, 60051, 60040, 60055, 60048, 60047, 60049, 60052, 60045, 60050, 60060, 60088};
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 57188;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 3
                int r8 = 84 - r8
                int r7 = r7 * 15
                int r0 = r7 + 38
                byte[] r1 = io.reactivex.internal.operators.observable.ObservableSkipLast.SkipLastObserver.$$a
                int r6 = r6 * 52
                int r6 = 107 - r6
                byte[] r0 = new byte[r0]
                int r7 = r7 + 37
                r2 = 0
                if (r1 != 0) goto L19
                r8 = r6
                r3 = r7
                r4 = r2
                goto L32
            L19:
                r3 = r2
            L1a:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L32:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableSkipLast.SkipLastObserver.a(int, int, int, java.lang.Object[]):void");
        }

        private static void d(int i, short s, short s2, Object[] objArr) {
            int i2 = 52 - (s * 49);
            byte[] bArr = $$d;
            int i3 = s2 * 12;
            int i4 = 99 - (i * 15);
            byte[] bArr2 = new byte[i3 + 38];
            int i5 = i3 + 37;
            int i6 = -1;
            if (bArr == null) {
                i4 = (i4 + i2) - 8;
                i2 = i2;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                int i8 = i2 + 1;
                bArr2[i7] = (byte) i4;
                if (i7 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i4 = (i4 + bArr[i8]) - 8;
                    i2 = i8;
                    i6 = i7;
                }
            }
        }

        SkipLastObserver(deriveMediaType<? super T> derivemediatype, int i) {
            super(i);
            this.downstream = derivemediatype;
            this.skip = i;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            int i = 2 % 2;
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            this.upstream.dispose();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            boolean zIsDisposed = this.upstream.isDisposed();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 24 / 0;
            }
            return zIsDisposed;
        }

        private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2;
            int i4 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = b;
            int i5 = 1770390596;
            long j = 0;
            Object obj2 = null;
            if (cArr2 != null) {
                int i6 = $11 + 91;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $11 + 17;
                    $10 = i9 % 128;
                    if (i9 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 2266, KeyEvent.getDeadChar(0, 0) + 33, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Process.getGidForName("") + 1), TextUtils.indexOf((CharSequence) "", '0') + 2268, 33 - (KeyEvent.getMaxKeyCode() >> 16), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    }
                    i8++;
                    i3 = 2;
                    i5 = 1770390596;
                    j = 0;
                }
                int i10 = $11 + 123;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr2 = cArr3;
            }
            Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2267, TextUtils.indexOf("", "") + 33, -1927765101, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i12 = $11 + 23;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i14 = $10 + 115;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 1;
                            byte b10 = (byte) (b9 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49266), 3262 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 30 - (ViewConfiguration.getLongPressTimeout() >> 16), -127612708, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 22879);
                                int iIndexOf = TextUtils.indexOf("", "", 0) + 594;
                                int i16 = 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                byte b11 = (byte) ($$f >>> 2);
                                byte b12 = (byte) (b11 - 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionChild, iIndexOf, i16, 1570859318, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i18 = $11 + 11;
                                $10 = i18 % 128;
                                int i19 = i18 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                            } else {
                                int i22 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i23 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i22];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i23];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            int i24 = 0;
            while (i24 < i) {
                cArr4[i24] = (char) (cArr4[i24] ^ 13722);
                i24++;
                int i25 = $10 + 69;
                $11 = i25 % 128;
                int i26 = i25 % 2;
            }
            objArr[0] = new String(cArr4);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            if (this.skip == size()) {
                this.downstream.onNext(poll());
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43042);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3111;
                int i2 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[40], bArr[5], bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(doubleTapTimeout, keyRepeatDelay, i2, -1272852037, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{7, 14, 2, 6, 21, 23, 2, 4, 0, 20, 4, 1, '\n', 18, 17, 3, '\t', 21, 15, 21, '\f', 15}, (byte) (Color.red(0) + 91), Drawable.resolveOpacity(0, 0) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{1, 17, 5, 6, 17, 0, 6, 16, 4, 7, 17, 19, 21, 7, 13918}, (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 94), (Process.myTid() >> 22) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 43042);
                int modifierMetaStateMask = 3110 - ((byte) KeyEvent.getModifierMetaStateMask());
                int maximumFlingVelocity = 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte[] bArr2 = $$a;
                byte b2 = bArr2[5];
                Object[] objArr5 = new Object[1];
                a(b2, b2, bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, modifierMetaStateMask, maximumFlingVelocity, -1269618118, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43042);
                    int iMyTid = 3111 - (Process.myTid() >> 22);
                    int iAxisFromString = 21 - MotionEvent.axisFromString("");
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr6 = new Object[1];
                    a(b3, b4, b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, iMyTid, iAxisFromString, 154975793, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i3 = ((int[]) objArr7[2])[0];
                int i4 = ((int[]) objArr7[1])[0];
                String[] strArr = (String[]) objArr7[3];
                int[] iArr = {i4};
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = (-1272411950) + (((~((-768423055) | iIdentityHashCode)) | 633405572) * 336) + (((~(iIdentityHashCode | 936608404)) | (-1071625887)) * (-168)) + (((~((~iIdentityHashCode) | 936608404)) | (-768423055)) * 168) + 2046501676;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
                objArr = new Object[]{new int[1], iArr, new int[]{i3}, strArr};
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{24, 14, 24, 6, 1, 18, 7, 14, 3, '\b', 3, '\n', 16, 19, 1, 7}, (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34), 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{21, 2, 7, 17, 17, 23, 23, 18, '\t', 14, 19, '\n', 20, 21, 2, 3}, (byte) (118 - View.MeasureSpec.getSize(0)), 16 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr9);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 2046501676};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[63];
                    byte b6 = bArr3[25];
                    Object[] objArr11 = new Object[1];
                    d(b5, b6, b6, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b7 = bArr3[25];
                    byte b8 = bArr3[63];
                    Object[] objArr12 = new Object[1];
                    d(b7, b8, b8, objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (43041 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int iRed = 3111 - Color.red(0);
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 22;
                        byte b9 = $$a[7];
                        byte b10 = b9;
                        Object[] objArr14 = new Object[1];
                        a(b9, b10, b10, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iRed, capsMode, 154975793, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new char[]{7, 14, 2, 6, 21, 23, 2, 4, 0, 20, 4, 1, '\n', 18, 17, 3, '\t', 21, 15, 21, '\f', 15}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 91), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new char[]{1, 17, 5, 6, 17, 0, 6, 16, 4, 7, 17, 19, 21, 7, 13918}, (byte) (94 - ExpandableListView.getPackedPositionChild(0L)), 15 - Color.red(0), objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatTimeout = (char) (43042 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3110;
                            int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0', 0, 0);
                            byte[] bArr4 = $$a;
                            byte b11 = bArr4[5];
                            Object[] objArr17 = new Object[1];
                            a(b11, b11, bArr4[7], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, i10, iLastIndexOf, -1269618118, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveSize = (char) (View.resolveSize(0, 0) + 43042);
                            int defaultSize = View.getDefaultSize(0, 0) + 3111;
                            int offsetAfter = 22 - TextUtils.getOffsetAfter("", 0);
                            byte[] bArr5 = $$a;
                            Object[] objArr18 = new Object[1];
                            a(bArr5[40], bArr5[5], bArr5[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, defaultSize, offsetAfter, -1272852037, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr13;
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
            int i11 = ((int[]) objArr[1])[0];
            int i12 = ((int[]) objArr[2])[0];
            if (i12 == i11) {
                int i13 = ((int[]) objArr[0])[0];
                int i14 = ((int[]) objArr[2])[0];
                int i15 = ((int[]) objArr[1])[0];
                String[] strArr2 = (String[]) objArr[3];
                int[] iArr2 = {i14};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i16 = ~iIdentityHashCode2;
                int i17 = i13 + (-1474607158) + (((~(1045531524 | i16)) | 659499934) * (-328)) + ((iIdentityHashCode2 | 659499934) * 164) + (((~(iIdentityHashCode2 | (-1045531525))) | 641796996 | (~(i16 | 1063234462))) * 164);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr[0])[0] = i19 ^ (i19 << 5);
                Object[] objArr19 = {new int[1], new int[]{i15}, iArr2, strArr2};
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr3 = (String[]) objArr[3];
                if (strArr3 != null) {
                    int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                    int i21 = 2;
                    int i22 = i20 % 2;
                    int i23 = 0;
                    while (i23 < strArr3.length) {
                        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 97;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
                        int i25 = i24 % i21;
                        arrayList.add(strArr3[i23]);
                        i23++;
                        i21 = 2;
                    }
                }
                int[] iArr3 = new int[i12];
                int i26 = i12 - 1;
                iArr3[i26] = 1;
                Toast.makeText((Context) null, iArr3[((i12 * i26) % 2) - 1], 1).show();
                int i27 = ((int[]) objArr[0])[0];
                int i28 = ((int[]) objArr[2])[0];
                int i29 = ((int[]) objArr[1])[0];
                String[] strArr4 = (String[]) objArr[3];
                int[] iArr4 = {i28};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i30 = ~iIdentityHashCode3;
                int i31 = i27 + (-1257641018) + ((~((-1327835244) | i30)) * 979) + ((iIdentityHashCode3 | 377196215) * (-979)) + (((~(iIdentityHashCode3 | (-1327835244))) | (~(i30 | 377196215))) * 979);
                int i32 = (i31 << 13) ^ i31;
                int i33 = i32 ^ (i32 >>> 17);
                ((int[]) objArr[0])[0] = i33 ^ (i33 << 5);
                Object[] objArr20 = {new int[1], new int[]{i29}, iArr4, strArr4};
            }
            offer(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            this.downstream.onError(th);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.downstream.onComplete();
                obj.hashCode();
                throw null;
            }
            this.downstream.onComplete();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, int r7, byte r8) {
            /*
                int r8 = r8 * 2
                int r8 = 4 - r8
                int r6 = r6 + 113
                int r7 = r7 * 3
                int r0 = r7 + 1
                byte[] r1 = io.reactivex.internal.operators.observable.ObservableSkipLast.SkipLastObserver.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L2c
            L14:
                r3 = r2
            L15:
                r5 = r8
                r8 = r6
                r6 = r5
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                r4 = r1[r6]
                int r3 = r3 + 1
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r6 = -r6
                int r8 = r8 + 1
                int r6 = r6 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableSkipLast.SkipLastObserver.$$g(byte, int, byte):java.lang.String");
        }
    }
}

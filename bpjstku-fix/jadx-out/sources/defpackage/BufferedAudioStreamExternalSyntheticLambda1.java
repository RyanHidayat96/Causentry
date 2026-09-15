package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
public final class BufferedAudioStreamExternalSyntheticLambda1<T> extends notifySuspended<T, T> {
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public BufferedAudioStreamExternalSyntheticLambda1(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements deriveMediaType<T>, BufferProviderState {
        private deriveMediaType<? super T> TuitionPaymentFragmentbindingInflater1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$c = {82, Base64.padSymbol, -66, -42};
        private static final int $$d = 237;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {117, 50, 102, 124, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 71;
        private static int asBinder = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f93a = 1;
        private static int[] b = {567822363, -397405367, -479682036, -1676483579, 1702658460, 312561543, -1310138713, -1237099628, -1078423763, -869938906, 852974411, 537540301, 626675221, -1443950260, 615800378, 2116839167, -953122070, -1825677361};

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 14
                int r7 = r7 + 84
                byte[] r0 = BufferedAudioStreamExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                int r5 = 144 - r5
                int r1 = 53 - r6
                byte[] r1 = new byte[r1]
                int r6 = 52 - r6
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r7
                r3 = r2
                r7 = r6
                goto L29
            L15:
                r3 = r2
            L16:
                int r5 = r5 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L25:
                int r3 = r3 + 1
                r4 = r0[r5]
            L29:
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: BufferedAudioStreamExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d(int, int, int, java.lang.Object[]):void");
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super T> derivemediatype, long j) {
            this.TuitionPaymentFragmentbindingInflater1 = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            int i = 2 % 2;
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bufferProviderState;
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 0) {
                    int i2 = asBinder + 43;
                    f93a = i2 % 128;
                    int i3 = i2 % 2;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                    bufferProviderState.dispose();
                    EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
                    return;
                }
                this.TuitionPaymentFragmentbindingInflater1.onSubscribe(this);
            }
            int i4 = f93a + 51;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            int i = 2 % 2;
            if (!(!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return;
            }
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            long j2 = j - 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.TuitionPaymentFragmentbindingInflater1.onNext(t);
                if (z) {
                    int i2 = asBinder + 65;
                    f93a = i2 % 128;
                    int i3 = i2 % 2;
                    onComplete();
                    int i4 = f93a + 87;
                    asBinder = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            int i = 2 % 2;
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
                this.TuitionPaymentFragmentbindingInflater1.onError(th);
                return;
            }
            int i2 = asBinder + 117;
            f93a = i2 % 128;
            int i3 = i2 % 2;
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            int i4 = f93a + 79;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 91 / 0;
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = f93a + 85;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
            this.TuitionPaymentFragmentbindingInflater1.onComplete();
            int i3 = asBinder + 109;
            f93a = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            int i2 = asBinder + 43;
            f93a = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = asBinder + 85;
            f93a = i2 % 128;
            int i3 = i2 % 2;
            boolean zIsDisposed = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed();
            if (i3 == 0) {
                int i4 = 72 / 0;
            }
            return zIsDisposed;
        }

        private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = b;
            int i4 = -1870535734;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 35;
                    $10 = i8 % 128;
                    if (i8 % i2 != 0) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i6] = Integer.valueOf(iArr2[i7]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i6;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 3291 - ExpandableListView.getPackedPositionType(0L), 31 - TextUtils.getOffsetBefore("", i6), 1948206109, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 3291 - TextUtils.getOffsetAfter("", 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32, 1948206109, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i7++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                    i4 = -1870535734;
                    i6 = 0;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = b;
            if (iArr5 != null) {
                int i9 = $10 + 61;
                $11 = i9 % 128;
                int i10 = 2;
                int i11 = i9 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i12 = 0;
                while (i12 < length3) {
                    int i13 = $10 + 31;
                    $11 = i13 % 128;
                    int i14 = i13 % i10;
                    Object[] objArr4 = new Object[i5];
                    objArr4[0] = Integer.valueOf(iArr5[i12]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 3290 - TextUtils.lastIndexOf("", '0', 0), 31 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1948206109, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i12++;
                    iArr5 = iArr5;
                    i10 = 2;
                    i5 = 1;
                }
                iArr5 = iArr6;
            }
            char c = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i15 = 17;
                for (int i16 = 1; i15 > i16; i16 = 1) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                    try {
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2558 - TextUtils.indexOf((CharSequence) "", '0', 0), View.getDefaultSize(0, 0) + 29, 683220507, false, $$e(b8, b9, (byte) (-b9)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i15--;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr6 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf("", "") + 28879), 348 - Color.alpha(0), 24 - ImageFormat.getBitsPerPixel(0), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                c = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r31, int r32, int r33, int r34) {
            /*
                Method dump skipped, instruction units count: 2166
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: BufferedAudioStreamExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(android.content.Context, int, int, int):java.lang.Object[]");
        }

        private static String $$e(int i, int i2, int i3) {
            byte[] bArr = $$c;
            int i4 = i3 + 4;
            int i5 = i * 3;
            int i6 = (i2 * 56) + 66;
            byte[] bArr2 = new byte[1 - i5];
            int i7 = 0 - i5;
            int i8 = -1;
            if (bArr == null) {
                i6 += i4;
                i4 = i4;
                i8 = -1;
            }
            while (true) {
                int i9 = i8 + 1;
                bArr2[i9] = (byte) i6;
                if (i9 == i7) {
                    return new String(bArr2, 0);
                }
                int i10 = i4 + 1;
                i6 += bArr[i10];
                i4 = i10;
                i8 = i9;
            }
        }
    }
}

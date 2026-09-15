package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioStreamImpl<T> extends VideoRecordEventStart<T> {
    private T[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public AudioStreamImpl(T[] tArr) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tArr;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        derivemediatype.onSubscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        T[] tArr = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int length = tArr.length;
        for (int i = 0; i < length && !tuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed(); i++) {
            T t = tArr[i];
            if (t == null) {
                deriveMediaType<? super T> derivemediatype2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                StringBuilder sb = new StringBuilder("The element at index ");
                sb.append(i);
                sb.append(" is null");
                derivemediatype2.onError(new NullPointerException(sb.toString()));
                return;
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(t);
        }
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed()) {
            return;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> extends getCurrentSystemTimeNs<T> {
        boolean TuitionPaymentFragmentbindingInflater1;
        final T[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private volatile boolean b;
        private static final byte[] $$c = {14, 116, 92, -78};
        private static final int $$f = 45;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {55, -47, -47, 67, -14, 1, 5, -12, 49, -35, -2, 5, 8, -7, 9, -8, -5, 20, -18, 12, -5, 2, 32, -32, -3, 12, -5, 2, 27, -26, 45, -29, -14, -3, 0, 4, 14, 36, -50, 13, -2, 9, 0, -12};
        private static final int $$e = 38;
        private static final byte[] $$a = {109, 48, -62, 38, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 60;
        private static int asBinder = 0;
        private static int asInterface = 1;
        private static long g = -6765971990760336920L;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 15
                int r0 = r8 + 38
                int r7 = r7 + 4
                int r6 = r6 * 3
                int r6 = r6 + 84
                byte[] r1 = AudioStreamImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                byte[] r0 = new byte[r0]
                int r8 = r8 + 37
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L2c:
                int r6 = r6 + r7
                int r6 = r6 + (-11)
                int r7 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: AudioStreamImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a(int, short, short, java.lang.Object[]):void");
        }

        private static void d(byte b, byte b2, int i, Object[] objArr) {
            int i2 = 98 - i;
            int i3 = b2 * 40;
            int i4 = 43 - (b * 40);
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[41 - i3];
            int i5 = 40 - i3;
            int i6 = -1;
            if (bArr == null) {
                i2 = i4 + (-i5) + 1;
                i4 = i4;
            }
            while (true) {
                i6++;
                int i7 = i4 + 1;
                bArr2[i6] = (byte) i2;
                if (i6 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i2 = i2 + (-bArr[i7]) + 1;
                    i4 = i7;
                }
            }
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super T> derivemediatype, T[] tArr) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tArr;
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            int i2 = 2 % 2;
            int i3 = asBinder;
            int i4 = i3 + 69;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                this.TuitionPaymentFragmentbindingInflater1 = true;
                return 1;
            }
            int i6 = i3 + 17;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            return 0;
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(g ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            while (abortcapture.b < cArrB.length) {
                int i3 = $10 + 37;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i5 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(g)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1357 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47774 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 468, 14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            int i6 = $11 + 29;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int iResolveSize = 876 - View.resolveSize(0, 0);
                int i3 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b = $$a[7];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iResolveSize, i3, -1650998592, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{20630, 20727, 60445, 26800, 55293, 8136, 7026, 43434, 48833, 65106, 31480, 48062, 35977, 49264, 19562, 37947, 39495, 53688, 24184, 26181, 59419, 9168, 12376, 28823, 63469, 13616}, View.resolveSize(0, 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{21565, 21592, 15145, 28001, 203, 6684, 19093, 63567, 47734, 10600, 32556, 59941, 34856, 5972, 18940, 50683, 40700, 1680, 23485}, TextUtils.getOffsetAfter("", 0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                int iIndexOf = TextUtils.indexOf("", "", 0) + 10;
                byte[] bArr = $$a;
                byte b3 = bArr[7];
                Object[] objArr5 = new Object[1];
                a(b3, (byte) (b3 | 37), bArr[28], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, i4, iIndexOf, 2012020043, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 876;
                    int defaultSize = 10 - View.getDefaultSize(0, 0);
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    a(b4, (byte) (b4 | 89), bArr2[28], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(doubleTapTimeout, maxKeyCode, defaultSize, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = ~iIdentityHashCode;
                int i6 = 400299292 + (((~(412015139 | i5)) | (~((-452325369) | iIdentityHashCode))) * 1900) + (((~(i5 | 452325368)) | (~(iIdentityHashCode | (-412015140)))) * (-950)) + (((~(iIdentityHashCode | 452325368)) | (~(i5 | (-412015140)))) * 950) + 861457357;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{26145, 26176, 53826, 60725, 59810, 39501, 17750, 63374, 34934, 49165, 65405, 58778, 47664, 65068, 51633, 51810, 44232, 61431, 56317, 14445, 57015, 7589, 46533, 11941, 49517, 2924, 33803, 7409, 62224, 14616}, ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{9511, 9540, 16805, 10687, 31326, 24273, 12461, 33397, 52090, 21494, 15345, 36878, 63783, 28112, 3377, 49118, 61420, 31753, 8033, 19862, 40360, 36446}, Color.green(0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{44632, 44594, 5824, 30286, 11567, 292, 48059, 2416, 16462, 1157, 25617, 6967, 29263, 15103, 21243, 13528, 25731, 11117, 16517, 50820}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{31622, 31727, 28595, 41017, 21593, 55104, 25943, 55187, 38346, 32246, 45664, 50636, 42942, 17350, 33983, 59941, 45421, 20992, 38624, 6240}, ViewConfiguration.getFadingEdgeLength() >> 16, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 861457357};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[5];
                    Object[] objArr13 = new Object[1];
                    d(b5, bArr3[34], b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[34];
                    byte b7 = b6;
                    Object[] objArr14 = new Object[1];
                    d(b6, bArr3[5], b7, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                            int i9 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int i10 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                            byte[] bArr4 = $$a;
                            byte b8 = bArr4[7];
                            Object[] objArr15 = new Object[1];
                            a(b8, (byte) (b8 | 89), bArr4[28], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf2, i9, i10, 2012931276, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            c(new char[]{20630, 20727, 60445, 26800, 55293, 8136, 7026, 43434, 48833, 65106, 31480, 48062, 35977, 49264, 19562, 37947, 39495, 53688, 24184, 26181, 59419, 9168, 12376, 28823, 63469, 13616}, ViewConfiguration.getScrollBarSize() >> 8, objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c(new char[]{21565, 21592, 15145, 28001, 203, 6684, 19093, 63567, 47734, 10600, 32556, 59941, 34856, 5972, 18940, 50683, 40700, 1680, 23485}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                                int mirror = AndroidCharacter.getMirror('0') + 828;
                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                                byte[] bArr5 = $$a;
                                byte b9 = bArr5[7];
                                Object[] objArr18 = new Object[1];
                                a(b9, (byte) (b9 | 37), bArr5[28], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, mirror, threadPriority, 2012020043, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                                int trimmedLength = TextUtils.getTrimmedLength("") + 10;
                                byte b10 = $$a[7];
                                byte b11 = b10;
                                Object[] objArr19 = new Object[1];
                                a(b10, b11, b11, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, iResolveOpacity, trimmedLength, -1650998592, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i11 = ((int[]) objArr[2])[0];
            int i12 = ((int[]) objArr[0])[0];
            if (i12 != i11) {
                throw new RuntimeException(String.valueOf(i12));
            }
            int i13 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i14 = i13 + ((((-875256932) + (((~iUptimeMillis) | 141236229) * 1324)) + (((~(iUptimeMillis | (-377800505))) | (~(418110733 | iUptimeMillis))) * (-1324))) - 1397606308);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            Object obj2 = objArr20[1];
            ((int[]) obj2)[0] = i16 ^ (i16 << 5);
            int i17 = asInterface + 79;
            int i18 = i17 % 128;
            asBinder = i18;
            int i19 = i17 % 2;
            T[] tArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i2 == tArr.length) {
                int i20 = i18 + 27;
                asInterface = i20 % 128;
                if (i20 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            int i21 = i18 + 19;
            asInterface = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((int[]) obj2)[0];
            int i24 = i23 * i23;
            int i25 = -(1598787703 * i23);
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            int i27 = -(i23 * (-166237335));
            int i28 = (i26 & i27) + (i27 | i26);
            int i29 = (i28 ^ 601112832) + ((601112832 & i28) << 1);
            int i30 = i29 >> 19;
            int i31 = ((i30 ^ (-16383)) + ((i30 & (-16383)) << 1)) / 8192;
            int i32 = (i31 & 1) + (i31 | 1);
            int i33 = (i29 ^ i32) + ((i32 & i29) << 1);
            int i34 = i29 >> 22;
            int i35 = ((i34 & (-2047)) + (i34 | (-2047))) / 1024;
            int i36 = (-((((i35 | 1) << 1) - (i35 ^ 1)) ^ i33)) + 6;
            int i37 = i36 >> 21;
            int i38 = ((((i37 | (-4095)) << 1) - (i37 ^ (-4095))) / 2048) + 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (2634 / ((i36 & (-(((i38 | 1) << 1) - (i38 ^ 1)))) * 439)) + i2;
            return (T) share.b(tArr[i2], "The array element is null");
        }

        @Override // defpackage.AudioSettingsBuilder
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            int i = 2 % 2;
            int i2 = asInterface + 15;
            int i3 = i2 % 128;
            asBinder = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                int length = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
                obj.hashCode();
                throw null;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length) {
                int i4 = i3 + 31;
                asInterface = i4 % 128;
                if (i4 % 2 != 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 19;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 67;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final void TuitionPaymentFragmentbindingInflater1() {
            int i = 2 % 2;
            int i2 = asBinder + 87;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            T[] tArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i3 != 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tArr.length;
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tArr.length;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            int i2 = asInterface + 107;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            this.b = true;
            int i4 = asBinder + 9;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = asBinder + 45;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.b;
            int i4 = asInterface + 87;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                return z;
            }
            throw null;
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
        private static java.lang.String $$g(byte r6, byte r7, int r8) {
            /*
                int r6 = r6 * 4
                int r6 = 107 - r6
                byte[] r0 = AudioStreamImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                int r7 = r7 * 3
                int r7 = r7 + 4
                int r8 = r8 * 4
                int r1 = r8 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r7 = r8
                r4 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r6 = -r6
                int r6 = r6 + r7
                int r7 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: AudioStreamImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(byte, byte, int):java.lang.String");
        }
    }
}

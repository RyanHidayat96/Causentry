package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class AudioStreamAudioStreamException<T> extends notifySuspended<T, T> {
    private T TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private long b;

    public AudioStreamAudioStreamException(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, T t, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = t;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(derivemediatype, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements deriveMediaType<T>, BufferProviderState {
        private deriveMediaType<? super T> TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private T TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BufferProviderState f77a;
        private boolean b;
        private long g;
        private static final byte[] $$c = {58, 66, -14, -31};
        private static final int $$f = 243;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {117, 50, 102, 124, -11, 3, 64, -56, -7, 1, 9, -4, 8, 56, -55, -2, -8, 14, 4, 2, -17, 15, 56, -67, 14, -7, -1, -4, 16, 3, -11, 2, 9, -2, 3, 58, -23, -34, -8, 14, 4, 2, -17, 15, 20, -18, -7, -1, -4, 16, 35, -43, 2, 9, -2, 3, 37, -40, 4, 5, -8, -5, 48, -50, 22, -1, -10, -3, 12, -5, 2, -32, 13, -10, 12, -5, 2, 31, -16, -23, 13, 9, -8, -5, 47, -43, 18, -5, -5, 9, -8, -5, 19, -6, -4, 11, -4, -4, 8, 31, -36, 9, -5, 12, -18, 16, -12, 66};
        private static final int $$e = 206;
        private static final byte[] $$a = {49, 89, 41, 48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 95;
        private static int notify = 0;
        private static int onTransact = 1;
        private static long asInterface = -6147338187627095608L;
        private static int d = -981105359;
        private static char asBinder = 34097;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 2
                int r8 = 84 - r8
                byte[] r0 = AudioStreamAudioStreamException.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                int r7 = r7 + 4
                int r6 = r6 * 15
                int r6 = r6 + 38
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2e
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                int r7 = r7 + 1
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r3 = r3 + r7
                int r7 = r3 + (-11)
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: AudioStreamAudioStreamException.TuitionPaymentFragmentspecialinlinedviewModeldefault2.c(int, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(byte r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 + 4
                int r7 = r7 * 15
                int r7 = r7 + 84
                byte[] r0 = AudioStreamAudioStreamException.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$d
                int r8 = r8 * 30
                int r8 = r8 + 38
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r9
                r4 = r2
                goto L2b
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L24:
                int r9 = r9 + 1
                r3 = r0[r9]
                r6 = r3
                r3 = r9
                r9 = r6
            L2b:
                int r9 = -r9
                int r7 = r7 + r9
                int r7 = r7 + 1
                r9 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: AudioStreamAudioStreamException.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f(byte, int, byte, java.lang.Object[]):void");
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super T> derivemediatype, long j, T t, boolean z) {
            this.TuitionPaymentFragmentbindingInflater1 = derivemediatype;
            this.g = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = t;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        }

        private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            int i5 = 0;
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i6 = $11 + 53;
                $10 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 8328);
                        int jumpTapTimeout = 1235 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 35;
                        byte b = (byte) i5;
                        byte b2 = b;
                        String str$$g = $$g(b, b2, (byte) (b2 - 1));
                        Class[] clsArr = new Class[1];
                        clsArr[i5] = Object.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, jumpTapTimeout, scrollDefaultDelay, -653973969, false, str$$g, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2764;
                        int iCombineMeasuredStates = 14 - View.combineMeasuredStates(i5, i5);
                        byte b3 = (byte) ($$f & 14);
                        byte b4 = (byte) (b3 - 2);
                        String str$$g2 = $$g(b3, b4, (byte) (b4 - 1));
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i5] = Object.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, scrollDefaultDelay2, iCombineMeasuredStates, 1504416861, false, str$$g2, clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    int i8 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i8);
                    objArr4[i5] = sessionProcessor;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c2 = (char) ((TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43325);
                        int iIndexOf = 252 - TextUtils.indexOf((CharSequence) "", '0');
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', i5) + 23;
                        Class[] clsArr3 = new Class[3];
                        clsArr3[i5] = Object.class;
                        clsArr3[1] = Integer.TYPE;
                        clsArr3[2] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iIndexOf, iLastIndexOf, -721491957, false, "j", clsArr3);
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i9 = cArr4[iIntValue2] * 32718;
                    Object[] objArr5 = new Object[2];
                    objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                    objArr5[i5] = Integer.valueOf(i9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 65200);
                        int i10 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2890;
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i5) + 18;
                        byte b5 = (byte) ($$f & 5);
                        byte b6 = (byte) (b5 - 1);
                        String str$$g3 = $$g(b5, b6, (byte) (b6 - 1));
                        i2 = 2;
                        Class[] clsArr4 = new Class[2];
                        clsArr4[i5] = Integer.TYPE;
                        clsArr4[1] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, i10, bitsPerPixel, 2012627446, false, str$$g3, clsArr4);
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) d) ^ (-6377398940819159759L)))) ^ (((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (asInterface ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) asBinder) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                    int i11 = $11 + 113;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i3 = i2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x027a  */
        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iResolveSize = 876 - View.resolveSize(0, 0);
                int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte[] bArr = $$a;
                byte b = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b, bArr[5], b, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveSize, keyRepeatTimeout, -1650998592, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{40185, 49614, 43278, 3534}, new char[]{63994, 931, 53530, 6516}, (char) TextUtils.getTrimmedLength(""), TextUtils.getTrimmedLength(""), new char[]{53151, 17464, 37504, 61293, 40690, 29252, 40835, 3170, 38694, 64105, 24776, 9129, 32709, 22828, 22702, 38727, 47882, 38966, 2887, 9280, 47170, 9244}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{40185, 49614, 43278, 3534}, new char[]{45558, 54628, 11315, 59934}, (char) (MotionEvent.axisFromString("") + 7725), 869622961 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{36970, 44407, 55166, 29820, 60510, 50668, 4551, 51323, 46472, 32713, 23240, 51622, 10897, 42484, 58631}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                int gidForName = 875 - Process.getGidForName("");
                int iIndexOf = TextUtils.indexOf("", "") + 10;
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                c(bArr2[28], (byte) (bArr2[12] + 1), bArr2[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, gidForName, iIndexOf, 2012020043, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 876;
                    int i2 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte[] bArr3 = $$a;
                    Object[] objArr6 = new Object[1];
                    c(bArr3[28], (byte) ($$b & TypedValues.PositionType.TYPE_PERCENT_HEIGHT), bArr3[7], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, packedPositionGroup, i2, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i3 = ~((-466279331) | (~startElapsedRealtime));
                int i4 = (((-468443120) | i3 | (~(466279330 | startElapsedRealtime))) * (-338)) + 620325620 + (((~(startElapsedRealtime | (-2163790))) | i3) * 338) + 903081929;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                int i7 = onTransact + 9;
                notify = i7 % 128;
                int i8 = i7 % 2;
            } else {
                Object[] objArr8 = new Object[1];
                e(new char[]{40185, 49614, 43278, 3534}, new char[]{54936, 10115, 39482, 26461}, (char) (23962 - Gravity.getAbsoluteGravity(0, 0)), (-1) - Process.getGidForName(""), new char[]{21640, 37672, 61324, 63728, 23835, 14481, 34461, 53342, 26432, 50453, 39388, 50769, 20161, 26960, 14159, 19594, 15101, 44671, 41227, 47637, 37384, 61749, 48925, 21840, 17263, 47450}, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e(new char[]{40185, 49614, 43278, 3534}, new char[]{39514, 52364, 28733, 46414}, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 20081), ViewConfiguration.getPressedStateDuration() >> 16, new char[]{15964, 20934, 43648, 28734, 6798, 49807, 48605, 45790, 55551, 19833, 43693, 20306, 58243, 15062, 59950, 39731, 56597, 21071}, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i9 = onTransact + 89;
                        notify = i9 % 128;
                        int i10 = i9 % 2;
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
                e(new char[]{40185, 49614, 43278, 3534}, new char[]{17583, 27205, 37701, 1034}, (char) (2706 - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0') + 1, new char[]{5366, 26895, 45461, 51700, 53363, 5917, 27313, 55336, 45856, 37361, 58887, 41759, 3068, 17348, 42457, 28507}, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e(new char[]{40185, 49614, 43278, 3534}, new char[]{51239, 39806, 38151, 11095}, (char) (22421 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), Color.rgb(0, 0, 0) + 16777216, new char[]{21652, 38965, 25182, 15395, 65380, 48567, 29672, 12558, 64411, 64307, 7676, 6208, 22458, 46977, 39331, 25446}, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i11 = notify + 3;
                onTransact = i11 % 128;
                int i12 = i11 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 903081929};
                    byte[] bArr4 = $$d;
                    byte b2 = bArr4[9];
                    Object[] objArr13 = new Object[1];
                    f(b2, b2, bArr4[26], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b3 = (byte) (bArr4[9] - 1);
                    Object[] objArr14 = new Object[1];
                    f(b3, b3, bArr4[107], objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            int iGreen = 876 - Color.green(0);
                            int i13 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte[] bArr5 = $$a;
                            Object[] objArr15 = new Object[1];
                            c(bArr5[28], (byte) ($$b & TypedValues.PositionType.TYPE_PERCENT_HEIGHT), bArr5[7], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iGreen, i13, 2012931276, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            e(new char[]{40185, 49614, 43278, 3534}, new char[]{63994, 931, 53530, 6516}, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), TextUtils.getOffsetBefore("", 0), new char[]{53151, 17464, 37504, 61293, 40690, 29252, 40835, 3170, 38694, 64105, 24776, 9129, 32709, 22828, 22702, 38727, 47882, 38966, 2887, 9280, 47170, 9244}, objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            e(new char[]{40185, 49614, 43278, 3534}, new char[]{45558, 54628, 11315, 59934}, (char) (7724 - View.MeasureSpec.getSize(0)), 869622961 - Drawable.resolveOpacity(0, 0), new char[]{36970, 44407, 55166, 29820, 60510, 50668, 4551, 51323, 46472, 32713, 23240, 51622, 10897, 42484, 58631}, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "");
                                int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
                                int i14 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                byte[] bArr6 = $$a;
                                Object[] objArr18 = new Object[1];
                                c(bArr6[28], (byte) (bArr6[12] + 1), bArr6[7], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, packedPositionChild, i14, 2012020043, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                                int iIndexOf2 = 876 - TextUtils.indexOf("", "", 0);
                                int i15 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                                byte[] bArr7 = $$a;
                                byte b4 = bArr7[7];
                                Object[] objArr19 = new Object[1];
                                c(b4, bArr7[5], b4, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, iIndexOf2, i15, -1650998592, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            if (i17 == i16) {
                int i18 = ((int[]) objArr[1])[0];
                Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i19 = ~iIdentityHashCode;
                int i20 = (~((-1044854942) | i19)) | 977281160;
                int i21 = ~(iIdentityHashCode | 1072118493);
                int i22 = i18 + 973382890 + ((i20 | i21) * (-713)) + (i21 * 1426) + ((~(1004544712 | i19)) * 713);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr20[1])[0] = i24 ^ (i24 << 5);
            } else {
                Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
                int i25 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i26 = i25 + 290433482 + ((~(268303967 | iIdentityHashCode2)) * 623) + (((~iIdentityHashCode2) | 173314058) * (-623)) + (((~(iIdentityHashCode2 | 240964127)) | (~(200653898 | iIdentityHashCode2)) | (-268303968)) * 623);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr21[1])[0] = i28 ^ (i28 << 5);
            }
            if (DisposableHelper.b(this.f77a, bufferProviderState)) {
                int i29 = onTransact + 65;
                notify = i29 % 128;
                if (i29 % 2 == 0) {
                    this.f77a = bufferProviderState;
                    this.TuitionPaymentFragmentbindingInflater1.onSubscribe(this);
                } else {
                    this.f77a = bufferProviderState;
                    this.TuitionPaymentFragmentbindingInflater1.onSubscribe(this);
                    obj.hashCode();
                    throw null;
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            int i2 = notify + 5;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            this.f77a.dispose();
            int i4 = onTransact + 39;
            notify = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = notify + 55;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            BufferProviderState bufferProviderState = this.f77a;
            if (i3 != 0) {
                return bufferProviderState.isDisposed();
            }
            bufferProviderState.isDisposed();
            throw null;
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            int i = 2 % 2;
            int i2 = onTransact + 125;
            int i3 = i2 % 128;
            notify = i3;
            int i4 = i2 % 2;
            if (!this.b) {
                long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (j == this.g) {
                    this.b = true;
                    this.f77a.dispose();
                    this.TuitionPaymentFragmentbindingInflater1.onNext(t);
                    this.TuitionPaymentFragmentbindingInflater1.onComplete();
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j + 1;
                int i5 = i3 + 69;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            int i7 = i3 + 39;
            onTransact = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 59 / 0;
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            int i = 2 % 2;
            if (!this.b) {
                this.b = true;
                this.TuitionPaymentFragmentbindingInflater1.onError(th);
                int i2 = notify + 79;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            int i4 = onTransact + 77;
            notify = i4 % 128;
            if (i4 % 2 == 0) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = onTransact + 109;
            notify = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 22 / 0;
                if (this.b) {
                    return;
                }
            } else if (this.b) {
                return;
            }
            this.b = true;
            T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (t == null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                this.TuitionPaymentFragmentbindingInflater1.onError(new NoSuchElementException());
                int i4 = notify + 37;
                onTransact = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            if (t != null) {
                this.TuitionPaymentFragmentbindingInflater1.onNext(t);
                int i6 = notify + 105;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
            this.TuitionPaymentFragmentbindingInflater1.onComplete();
        }

        private static String $$g(byte b, short s, byte b2) {
            int i = b + 102;
            int i2 = s * 3;
            int i3 = b2 + 4;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[1 - i2];
            int i4 = 0 - i2;
            int i5 = -1;
            if (bArr == null) {
                i += i3;
                i3 = i3;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i;
                int i7 = i3 + 1;
                if (i6 == i4) {
                    return new String(bArr2, 0);
                }
                i = bArr[i7] + i;
                i3 = i7;
                i5 = i6;
            }
        }
    }
}

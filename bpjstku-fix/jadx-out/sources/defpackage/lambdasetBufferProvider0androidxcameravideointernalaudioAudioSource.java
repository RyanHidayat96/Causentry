package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdasetBufferProvider0androidxcameravideointernalaudioAudioSource<T> extends VideoRecordEvent<T> {
    private final VideoRecordEventStart<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {106, -22, 107, 95};
    private static final int $$f = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {81, -102, -70, -91, 7, -22, 27, -26, -18, 4, -3, -26, 4, -12, 0, 30, -58, -4, -8, -8, 27, -26, -19, -11, 9, -21, -8, -6, -40, 5, -18, 4, -13, -6, 23, -24, -31, 5, 1, -16, -13, 39, -51, 10, -13, -13, 1, -16, -13, 11, -14, -12, 3, -12, -12, 0, 23, -44, 1, -13, 4, -26, 8, -20, 58};
    private static final int $$e = 8;
    private static final byte[] $$a = {108, -26, -110, 50, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 254;
    private static int asInterface = 0;
    private static int g = 1;
    private static char TuitionPaymentFragmentbindingInflater1 = 61863;
    private static char b = 61334;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 39606;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 23801;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.lambdasetBufferProvider0androidxcameravideointernalaudioAudioSource.$$a
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r8 = r8 * 52
            int r1 = r8 + 1
            int r6 = r6 * 14
            int r6 = r6 + 84
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdasetBufferProvider0androidxcameravideointernalaudioAudioSource.a(short, byte, short, java.lang.Object[]):void");
    }

    private static void d(short s, int i, int i2, Object[] objArr) {
        int i3 = 28 - (i * 24);
        int i4 = 115 - (s * 31);
        byte[] bArr = $$d;
        int i5 = i2 * 13;
        byte[] bArr2 = new byte[i5 + 25];
        int i6 = i5 + 24;
        int i7 = -1;
        if (bArr == null) {
            i3++;
            i4 = (i3 + (-i6)) - 7;
        }
        while (true) {
            int i8 = i3;
            int i9 = i4;
            i7++;
            bArr2[i7] = (byte) i9;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 = i8 + 1;
                i4 = (i9 + (-bArr[i8])) - 7;
            }
        }
    }

    public lambdasetBufferProvider0androidxcameravideointernalaudioAudioSource(VideoRecordEventStart<T> videoRecordEventStart) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoRecordEventStart;
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> implements deriveMediaType<T>, OutputTransform {
        private AudioConfig<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private BufferProviderState b;

        @Override // defpackage.OutputTransform
        public final void b(long j) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(AudioConfig<? super T> audioConfig) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = audioConfig;
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            this.b = bufferProviderState;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this);
        }

        @Override // defpackage.OutputTransform
        public final void b() {
            this.b.dispose();
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $11 + 53;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i7 = i4;
                int i8 = (c4 + i3) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i9 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[c2] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 47773);
                        int gidForName = Process.getGidForName("") + 469;
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, gidForName, keyRepeatDelay, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getTrimmedLength("") + 47773), 469 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 13 - ExpandableListView.getPackedPositionGroup(0L), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4 = i7 + 1;
                    int i10 = $11 + 125;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 2323 - (Process.myTid() >> 22), 43 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super T> audioConfig) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = g + 43;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (37568 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 625;
            int iResolveOpacity = 14 - Drawable.resolveOpacity(0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, b2, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, maximumDrawingCacheSize, iResolveOpacity, -477065106, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{30188, 13130, 8676, 55988, 27334, 1517, 15797, 31634, 20282, 48803, 48901, 41312, 12997, 36816, 47230, 22734, 31721, 24378, 40465, 61794, 61128, 4543, 40363, 2488}, TextUtils.indexOf("", "", 0) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{24325, 41478, 54898, 44373, 52034, 64811, 31601, 15742, 65260, 12834, 19158, 56734, 42203, 50198, 56457, 53585, 61899, 11420}, TextUtils.indexOf("", "") + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetAfter = (char) (37567 - TextUtils.getOffsetAfter("", 0));
            int iResolveSizeAndState = 625 - View.resolveSizeAndState(0, 0, 0);
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 15;
            byte[] bArr2 = $$a;
            byte b3 = bArr2[7];
            byte b4 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, iResolveSizeAndState, modifierMetaStateMask, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) (37567 - View.resolveSize(0, 0));
                int i4 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 624;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 15;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b5, b5, bArr3[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, i4, iLastIndexOf, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (-1304955640) + (((~((-21236005) | (~iIdentityHashCode))) | (~(1802502116 | iIdentityHashCode))) * (-272)) + (((~((-558730725) | iIdentityHashCode)) | 537494720) * (-272)) + (((~(iIdentityHashCode | 558730724)) | 1265007396) * 272) + 240500905;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[]{i6}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{33396, 48479, 15388, 44083, 41071, 15919, 7336, 57707, 37754, 28274, 28371, 56605, 10652, 63773, 1252, 16230, 25130, 17787, 28074, 14062, 44901, 50908, 61585, 10548, 57450, 13881, 1828, 26597}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{1093, 12466, 36353, 17715, 49967, 59564, 4186, 20401, 26575, 56102, 5545, 58947, 41388, 28605, 21272, 55342, 36879, 51705, 26590, 15608}, TextUtils.lastIndexOf("", '0', 0) + 19, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{58939, 37811, 55719, 50372, 28384, 43695, 62598, 6252, 12392, 13524, 49117, 34177, 16129, 33476, 12813, 49435, 38362, 61296}, 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{866, 49361, 36660, 46596, 16148, 38061, 37622, 46908, 27318, 56990, 19167, 15927, 17085, 59376, 34369, 6557, 19088, 7258}, 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(new char[]{57594, 2761, 37436, 15764, 60131, 48740, 3583, 3536, 53842, 58561, 34601, 30170, 59505, 36777, 64317, 21742, 3995, 15079, 9196, 43067, 40551, 33123, 7103, 43671, 28898, 44199, 31714, 58157, 38514, 26228, 40591, 54579, 35618, 31851, 41217, 7232, 16561, 40283, 55825, 45287, 40907, 9529, 50413, 3564, 20002, 61716, 23269, 45265, 3334, 11951, 42680, 30845, 23654, 44144, 55581, 47586, 50822, 47708, 45529, 61780, 10346, 44269, 37789, 38870, 4956, 58127}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(new char[]{205, 13052, 35962, 60535, 63537, 10125, 43566, 61033, 22826, 7378, 18055, 48301, 46709, 5675, 57925, 11846, 13808, 42976, 37364, 17095, 33312, 26626, 63293, 56845, 9227, 45440, 52648, 60813, 51975, 19818, 50894, 13343, 55470, 48408, 56926, 13033, 60561, 4574, 7952, 6284, 19536, 58883, 56086, 1363, 45570, 16356, 61436, 18553, 30795, 3437, 19530, 27005, 41319, 10279, 14361, 34929, 13164, 23222, 34597, 9658, 7867, 63651, 24604, 36099, 29545, 14483}, 64 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i10 = asInterface + 93;
            g = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 240500905};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[14];
                Object[] objArr15 = new Object[1];
                d(b6, bArr4[38], b6, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b7 = bArr4[38];
                Object[] objArr16 = new Object[1];
                d(b7, bArr4[14], b7, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i12 = ((int[]) objArr17[0])[0];
                int i13 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 37567);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 625;
                        int i14 = 15 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[7];
                        Object[] objArr18 = new Object[1];
                        a(b8, b8, bArr5[5], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay, keyRepeatDelay, i14, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new char[]{30188, 13130, 8676, 55988, 27334, 1517, 15797, 31634, 20282, 48803, 48901, 41312, 12997, 36816, 47230, 22734, 31721, 24378, 40465, 61794, 61128, 4543, 40363, 2488}, TextUtils.indexOf((CharSequence) "", '0', 0) + 23, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(new char[]{24325, 41478, 54898, 44373, 52034, 64811, 31601, 15742, 65260, 12834, 19158, 56734, 42203, 50198, 56457, 53585, 61899, 11420}, 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char deadChar = (char) (37567 - KeyEvent.getDeadChar(0, 0));
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 625;
                            int iIndexOf = 14 - TextUtils.indexOf("", "", 0, 0);
                            byte[] bArr6 = $$a;
                            byte b9 = bArr6[7];
                            byte b10 = bArr6[5];
                            Object[] objArr21 = new Object[1];
                            a(b9, b10, b10, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, pressedStateDuration, iIndexOf, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37566);
                            int capsMode = 625 - TextUtils.getCapsMode("", 0, 0);
                            int iIndexOf2 = 14 - TextUtils.indexOf("", "");
                            byte[] bArr7 = $$a;
                            byte b11 = bArr7[5];
                            byte b12 = bArr7[7];
                            Object[] objArr22 = new Object[1];
                            a(b11, b11, b12, objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, capsMode, iIndexOf2, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            int i17 = g + 13;
            asInterface = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[1])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i22 = i19 + 326016328 + (((~((-87298051) | (~iMaxMemory))) | (~(1736440070 | iMaxMemory))) * (-272)) + (((~((-88019207) | iMaxMemory)) | 721156) * (-272)) + (((~(iMaxMemory | 88019206)) | 1735718914) * 272);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[1])[0] = i24 ^ (i24 << 5);
            Object[] objArr23 = {new int[]{i21}, new int[1], new int[]{i20}, strArr3};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                for (String str2 : strArr4) {
                    int i25 = g + 61;
                    asInterface = i25 % 128;
                    int i26 = i25 % 2;
                    arrayList.add(str2);
                }
            }
            int[] iArr2 = new int[i16];
            int i27 = i16 - 1;
            iArr2[i27] = 1;
            Toast.makeText((Context) null, iArr2[((i16 * i27) % 2) - 1], 1).show();
            int i28 = ((int[]) objArr[1])[0];
            int i29 = ((int[]) objArr[2])[0];
            int i30 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int i31 = ~Process.myTid();
            int i32 = i28 + (-593110395) + ((~((-201941153) | i31)) * (-783)) + (((~(i31 | 1618384470)) | (-205353651)) * 783);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr[1])[0] = i34 ^ (i34 << 5);
            Object[] objArr24 = {new int[]{i30}, new int[1], new int[]{i29}, strArr5};
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(audioConfig));
        int i35 = g + 49;
        asInterface = i35 % 128;
        if (i35 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r6 = r6 * 2
            int r6 = r6 + 108
            byte[] r1 = defpackage.lambdasetBufferProvider0androidxcameravideointernalaudioAudioSource.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r3 = r3 + 1
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdasetBufferProvider0androidxcameravideointernalaudioAudioSource.$$g(short, int, int):java.lang.String");
    }
}

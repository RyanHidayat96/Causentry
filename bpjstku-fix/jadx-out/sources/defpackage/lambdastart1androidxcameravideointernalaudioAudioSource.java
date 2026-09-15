package defpackage;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdastart1androidxcameravideointernalaudioAudioSource<T> extends VideoEncoderSession1 {
    private static short[] asBinder;
    private generateBackupProfile<T> b;
    private static final byte[] $$c = {117, 50, 102, 124};
    private static final int $$f = ModuleDescriptor.MODULE_VERSION;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {74, 60, 122, -26};
    private static final int $$e = 164;
    private static final byte[] $$a = {49, 89, 41, 48, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1, -1, -21, 15, 0};
    private static final int $$b = 47;
    private static int notify = 0;
    private static int cancelAll = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 52737;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 29316;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 6714;
    private static char TuitionPaymentFragmentbindingInflater1 = 47517;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1266a = 2113366528;
    private static int g = -1934795583;
    private static int d = 516717023;
    private static byte[] asInterface = {7, 65, 90, 83, 82, 76, 73, 92, 22, 36, 78, 84, 80, 32, 81, 86, 64, 90, 36, 79, 18, -119, 32, 69, 32, 76, 84, 81, 17, -110, 84, 60, 7, 67, 89, 67, 81, 78, 79, 72, 6, -118, 97, -118, -98, 100, 101, 4, 124, -102, 119, 124, -103, 120, 109, 108, 57, -60, -56, -6, -53, -58, 15, 101, 116, -120, 100, 32, -35, 100, 109, -111, 100, 104, -112, 108, -97, 98, 3, -49, -84, -47, -44, -33, -48, -93, -48, -42, -48, -35, 6, 55, 18, -24, -26, 24, -25, Base64.padSymbol, -106, 57, 26, 26, 15, 30, 29, 15, 91, 38, 52, 74, 38, -29, -100, 42, 76, 54, 82, 44, 92, 42, 75, 5, -11, -33, -66, -48, -74, -95, -95, -46, -91, 2, -54, -86, -68, -121, -66, -114, -69, -69, -84, -65, 3, 69, 1, 15, -13, 66, 12, 53, 5, 58, 14, -64, 12, -88, -73, -123, -37, -73, 114, -1, -84, -79, -92, 114, -6, -94, -85, -76, 119, 6, 69, 106, 122, 115, 71, 57, 2, 117, 115, 39, -74, 112, -103, 105, 110, 114, 52, 3, 44, 42, 82, -17, 97, 43, 80, 32, 89, 45, -17, 56, -81, -83, -43, 110, 59, -16, -48, -69, 2, -37, -84, -95, -73, -96, -90, -81, -77, -42, -72, 6, -96, -76, -82, -85, -96, -74, 12, -117, 87, 85, 112, 19, -119, 81, 76, 70, 73, 15, -100, ByteCompanionObject.MAX_VALUE, 89, 79, 7, 57, 125, 57, 7, 47, -8, 57, 89, 1, 22, 19, -46, 6, -20, -9, -30, -9, -21, -81};

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = defpackage.lambdastart1androidxcameravideointernalaudioAudioSource.$$d
            int r8 = r8 + 97
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L2c
        L12:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdastart1androidxcameravideointernalaudioAudioSource.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 9
            int r6 = 115 - r6
            int r5 = r5 * 11
            int r0 = r5 + 5
            byte[] r1 = defpackage.lambdastart1androidxcameravideointernalaudioAudioSource.$$a
            int r7 = r7 * 15
            int r7 = 19 - r7
            byte[] r0 = new byte[r0]
            int r5 = r5 + 4
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r6
            r4 = r2
            r6 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r1[r7]
        L2b:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + 2
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdastart1androidxcameravideointernalaudioAudioSource.h(byte, int, short, java.lang.Object[]):void");
    }

    public lambdastart1androidxcameravideointernalaudioAudioSource(generateBackupProfile<T> generatebackupprofile) {
        this.b = generatebackupprofile;
    }

    @Override // defpackage.VideoEncoderSession1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoOutputSourceState videoOutputSourceState) {
        int i = 2 % 2;
        this.b.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentbindingInflater1(videoOutputSourceState));
        int i2 = notify + 29;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class TuitionPaymentFragmentbindingInflater1<T> implements getDefaultVideoProfile<T> {
        private VideoOutputSourceState TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(VideoOutputSourceState videoOutputSourceState) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoOutputSourceState;
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSubscribe(bufferProviderState);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
        }
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i3 = 58224;
                int i4 = 0;
                while (i4 < 16) {
                    int i5 = $11 + 51;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[c];
                    int i7 = (c3 + i3) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                    int i8 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentbindingInflater1);
                        objArr2[2] = Integer.valueOf(i8);
                        objArr2[1] = Integer.valueOf(i7);
                        objArr2[c] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c4 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47772);
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 468;
                            int longPressTimeout = 13 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            Class[] clsArr = new Class[4];
                            clsArr[c] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c4, touchSlop, longPressTimeout, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i9 = i4;
                        Object[] objArr3 = {Integer.valueOf(cArr3[c]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 468, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i3 -= 40503;
                        i4 = i9 + 1;
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
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 2323 - Gravity.getAbsoluteGravity(0, 0), 44 - (ViewConfiguration.getScrollBarSize() >> 8), -1312321721, false, $$g(b, b2, (byte) (b2 | 13)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } else {
                objArr[0] = new String(cArr2, 0, i);
                int i10 = $10 + 47;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                return;
            }
        }
    }

    private static void f(int i, int i2, short s, int i3, byte b, Object[] objArr) throws Throwable {
        boolean z;
        int length;
        byte[] bArr;
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(g)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            long j = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b2 = (byte) 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2267, 33 - View.MeasureSpec.makeMeasureSpec(0, 0), 1387473586, false, $$g(b2, b2, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr2 = asInterface;
                if (bArr2 != null) {
                    int i7 = $11 + 31;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i4])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int maxKeyCode = 3358 - (KeyEvent.getMaxKeyCode() >> 16);
                            int i8 = 19 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(minimumFlingVelocity, maxKeyCode, i8, -1054011043, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr[i4] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i4++;
                        j = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i9 = $11 + 105;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    byte[] bArr3 = asInterface;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(f1266a)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2267, Color.alpha(0) + 33, 1387473586, false, $$g(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) asBinder[i + ((int) (((long) f1266a) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) g) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i + iIntValue) - 2) + ((int) (((long) f1266a) ^ 3046761265686732006L)) + i6;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(d), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 55904), ((Process.getThreadPriority(0) + 20) >> 6) + 2855, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, -1529949196, false, $$g(b6, b7, (byte) (b7 + 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = asInterface;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z = true;
                } else {
                    int i12 = $11 + 69;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = asInterface;
                        int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i14]) ^ 3046761265686732006L)) + s)) ^ b));
                    } else {
                        short[] sArr = asBinder;
                        int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i15]) ^ 3046761265686732006L)) + s)) ^ b));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1$7879113(int r65, int r66, java.lang.Object r67, int r68, boolean r69, boolean r70) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 17228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(int, int, java.lang.Object, int, boolean, boolean):java.lang.Object[]");
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
    private static java.lang.String $$g(byte r6, byte r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = 121 - r8
            byte[] r0 = defpackage.lambdastart1androidxcameravideointernalaudioAudioSource.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lambdastart1androidxcameravideointernalaudioAudioSource.$$g(byte, byte, int):java.lang.String");
    }
}

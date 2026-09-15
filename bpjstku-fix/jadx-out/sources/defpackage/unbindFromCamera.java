package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.dynatrace.android.agent.EventType;
import java.lang.reflect.Method;
import kotlin.collections.AbstractMap$values$1$iterator$1;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class unbindFromCamera extends isServiced {
    private setViewPort INotificationSideChannelDefault;
    private setViewPort INotificationSideChannelStub;
    private setViewPort TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean getInterfaceDescriptor;
    private setViewPort onTransact;

    /* synthetic */ unbindFromCamera(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, byte b) {
        this(tuitionPaymentFragmentbindingInflater1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private unbindFromCamera(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1);
        mergeConfigs mergeconfigsTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1);
        int iB = TuitionPaymentFragmentbindingInflater1.b(tuitionPaymentFragmentbindingInflater1);
        int iTuitionPaymentFragmentbindingInflater1 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater2 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        super(strTuitionPaymentFragmentspecialinlinedviewModeldefault2, 15, mergeconfigsTuitionPaymentFragmentspecialinlinedviewModeldefault1, iB, ((Boolean) TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -1671191065, iTuitionPaymentFragmentbindingInflater2, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, new Object[]{tuitionPaymentFragmentbindingInflater1}, 1671191065)).booleanValue());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentbindingInflater1.asBinder(tuitionPaymentFragmentbindingInflater1);
        int iTuitionPaymentFragmentbindingInflater3 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater4 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        this.b = ((setViewPort) TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -33663671, iTuitionPaymentFragmentbindingInflater4, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater3, new Object[]{tuitionPaymentFragmentbindingInflater1}, 33663672)).b;
        int iTuitionPaymentFragmentbindingInflater5 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater6 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        this.g = ((setViewPort) TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -33663671, iTuitionPaymentFragmentbindingInflater6, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater5, new Object[]{tuitionPaymentFragmentbindingInflater1}, 33663672)).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.cancelAll = TuitionPaymentFragmentbindingInflater1.g(tuitionPaymentFragmentbindingInflater1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentbindingInflater1.asInterface(tuitionPaymentFragmentbindingInflater1);
        this.INotificationSideChannelStub = TuitionPaymentFragmentbindingInflater1.a(tuitionPaymentFragmentbindingInflater1);
        this.INotificationSideChannelDefault = TuitionPaymentFragmentbindingInflater1.cancel(tuitionPaymentFragmentbindingInflater1);
        this.onTransact = TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1);
        this.d = true;
        int iTuitionPaymentFragmentbindingInflater7 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        int iTuitionPaymentFragmentbindingInflater8 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
        this.getInterfaceDescriptor = ((Boolean) TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -1671191065, iTuitionPaymentFragmentbindingInflater8, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater7, new Object[]{tuitionPaymentFragmentbindingInflater1}, 1671191065)).booleanValue();
    }

    public static class TuitionPaymentFragmentbindingInflater1 {
        setViewPort TuitionPaymentFragmentbindingInflater1;
        setViewPort TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        setViewPort TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        mergeConfigs f1420a;
        long asBinder;
        String asInterface;
        EventType b;
        setViewPort cancel;
        setViewPort d;
        int g;
        private static final byte[] $$a = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
        private static final int $$b = 2;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int INotificationSideChannel = 0;
        private static int INotificationSideChannelStub = 1;
        private static char[] cancelAll = {8317, 49080, 8083, 65319, 24432, 16050, 40700, 32297, 56855, 48722, 7630, 64994, 23867, 15732, 40123, 31969, 56466, 48185, 7187, 64423, 23536, 15154, 39804, 31401, 55959, 47826, 6722, 64101, 23011, 14787, 39197, 45558, 11829, 36474, 28325, 52932, 44890, 3935, 61313, 20415, 12257, 35902, 27757, 52360, 44237, 3394, 60741, 19817, 11680, 36324, 27242, 51780, 43713, 2716, 60244, 19314, 11084, 35833, 27572, 51276, 43108, 2206, 59597, 18674, 10551, 35173, 27060, 51677, 42520, 45535, 11881, 36441, 28311, 52880, 44859, 3857, 61349, 20402, 12272, 35902, 27755, 52373, 44240, 3392, 60775, 19794, 11753, 36301, 27178, 51800, 43654, 2755, 60173, 19256, 11060, 35720, 27617, 51230, 43073, 2187, 29429, 60722, 19808, 44478, 3547, 27669, 52288, 11458, 36023, 60659, 20266, 44920, 3985, 28626, 52752, 11778, 36439, 61107, 20202, 43320, 2385, 27012, 51664, 8280, 49042, 8155, 65335, 24446, 16052, 40676, 32294, 56856, 48722, 7590, 64969, 23865, 15736, 45551, 11837, 36459, 28330, 52957, 44800, 3929, 61334, 20409, 12263, 45565, 11834, 36456, 28342, 52947, 44829, 3912, 61386, 20415, 12283, 35874, 27760, 52377, 44250, 3352, 60682, 19820, 11705, 36258, 27159, 51797, 43667, 2754, 60165, 19240, 11105, 35774, 27617, 26738, 63393, 22484, 46887, 5970, 30347, 55031, 13836, 38452, 63087, 21935};
        private static long onTransact = -7187194919909970348L;
        private static long notify = 3629522575448292101L;

        public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~i2;
            int i8 = ~i6;
            int i9 = (~(i7 | i8 | i5)) | (~(i2 | i6 | i5));
            int i10 = ~i5;
            int i11 = (~(i8 | i2)) | (~(i8 | i10));
            int i12 = (~(i5 | i6)) | (~(i7 | i10));
            int i13 = i2 + i6 + i3 + ((-564018846) * i) + (483938512 * i4);
            int i14 = i13 * i13;
            int i15 = (1473915126 * i2) + 752877568 + ((-1516524009) * i6) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i3) + (1390411776 * i) + (452984832 * i4) + ((-1135738880) * i14);
            int i16 = ((i2 * 1456092922) - 824780772) + (i6 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i3 * 1456093799) + (i * 578355822) + (i4 * 1098359728) + (i14 * 1868693504);
            if (i15 + (i16 * i16 * 2110914560) == 1) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) objArr[0];
            int i17 = 2 % 2;
            int i18 = INotificationSideChannel + 43;
            int i19 = i18 % 128;
            INotificationSideChannelStub = i19;
            int i20 = i18 % 2;
            boolean z = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i21 = i19 + 9;
            INotificationSideChannel = i21 % 128;
            int i22 = i21 % 2;
            return Boolean.valueOf(z);
        }

        private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Color.red(0) + 2624, 13 - (ViewConfiguration.getPressedStateDuration() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (notify ^ 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - KeyEvent.normalizeMetaState(0)), 481 - KeyEvent.getDeadChar(0, 0), ImageFormat.getBitsPerPixel(0) + 38, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i4 = $10 + 113;
                        $11 = i4 % 128;
                        int i5 = i4 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i6 = $11 + 23;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39422), 481 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 16777253 + Color.rgb(0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i7 = 63 / 0;
                } else {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 39422), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 481, 37 - (ViewConfiguration.getLongPressTimeout() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr2);
        }

        private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = $10 + 65;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(cancelAll[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i7 = 2188 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39;
                        byte b = (byte) ($$b - 2);
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, i7, i8, 841711447, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onTransact), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char touchSlop = (char) (33017 - (ViewConfiguration.getTouchSlop() >> 8));
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 3011;
                        int iRgb = Color.rgb(0, 0, 0) + 16777242;
                        int i9 = $$b;
                        byte b3 = (byte) (i9 - 2);
                        byte b4 = (byte) i9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, touchSlop2, iRgb, 321985076, false, $$c(b3, b4, (byte) (b4 - 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36505);
                        int i10 = 3376 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 17;
                        byte b5 = (byte) ($$b - 2);
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(maximumFlingVelocity, i10, offsetBefore, -968507904, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char keyRepeatDelay = (char) (36505 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int longPressTimeout = 3376 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 18;
                    byte b7 = (byte) ($$b - 2);
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, longPressTimeout, iLastIndexOf, -968507904, false, $$c(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
            int i11 = $11 + 53;
            $10 = i11 % 128;
            int i12 = i11 % 2;
        }

        static /* synthetic */ setViewPort TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            int i = 2 % 2;
            int i2 = INotificationSideChannelStub;
            int i3 = i2 + 75;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            setViewPort setviewport = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
            if (i4 != 0) {
                int i5 = 21 / 0;
            }
            int i6 = i2 + 25;
            INotificationSideChannel = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 72 / 0;
            }
            return setviewport;
        }

        static /* synthetic */ mergeConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            int i = 2 % 2;
            int i2 = INotificationSideChannelStub + 7;
            int i3 = i2 % 128;
            INotificationSideChannel = i3;
            int i4 = i2 % 2;
            mergeConfigs mergeconfigs = tuitionPaymentFragmentbindingInflater1.f1420a;
            int i5 = i3 + 31;
            INotificationSideChannelStub = i5 % 128;
            int i6 = i5 % 2;
            return mergeconfigs;
        }

        private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) objArr[0];
            int i = 2 % 2;
            int i2 = INotificationSideChannel + 69;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            setViewPort setviewport = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i3 == 0) {
                int i4 = 51 / 0;
            }
            return setviewport;
        }

        static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            int i = 2 % 2;
            int i2 = INotificationSideChannelStub + 11;
            int i3 = i2 % 128;
            INotificationSideChannel = i3;
            int i4 = i2 % 2;
            Object obj = null;
            String str = tuitionPaymentFragmentbindingInflater1.asInterface;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 73;
            INotificationSideChannelStub = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        static /* synthetic */ setViewPort a(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            int i = 2 % 2;
            int i2 = INotificationSideChannel + 17;
            INotificationSideChannelStub = i2 % 128;
            int i3 = i2 % 2;
            setViewPort setviewport = tuitionPaymentFragmentbindingInflater1.cancel;
            if (i3 == 0) {
                int i4 = 2 / 0;
            }
            return setviewport;
        }

        static /* synthetic */ EventType asBinder(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            int i = 2 % 2;
            int i2 = INotificationSideChannelStub;
            int i3 = i2 + 41;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
            EventType eventType = tuitionPaymentFragmentbindingInflater1.b;
            int i5 = i2 + 69;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
            return eventType;
        }

        static /* synthetic */ setViewPort asInterface(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            int i = 2 % 2;
            int i2 = INotificationSideChannel;
            int i3 = i2 + 61;
            INotificationSideChannelStub = i3 % 128;
            int i4 = i3 % 2;
            setViewPort setviewport = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i5 = i2 + 87;
            INotificationSideChannelStub = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 12 / 0;
            }
            return setviewport;
        }

        static /* synthetic */ int b(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            int i = 2 % 2;
            int i2 = INotificationSideChannel;
            int i3 = i2 + 101;
            INotificationSideChannelStub = i3 % 128;
            int i4 = i3 % 2;
            int i5 = tuitionPaymentFragmentbindingInflater1.g;
            int i6 = i2 + 47;
            INotificationSideChannelStub = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static /* synthetic */ setViewPort cancel(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            int i = 2 % 2;
            int i2 = INotificationSideChannel;
            int i3 = i2 + 31;
            INotificationSideChannelStub = i3 % 128;
            int i4 = i3 % 2;
            setViewPort setviewport = tuitionPaymentFragmentbindingInflater1.d;
            int i5 = i2 + 71;
            INotificationSideChannelStub = i5 % 128;
            int i6 = i5 % 2;
            return setviewport;
        }

        static /* synthetic */ long g(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            int i = 2 % 2;
            int i2 = INotificationSideChannel + 117;
            int i3 = i2 % 128;
            INotificationSideChannelStub = i3;
            int i4 = i2 % 2;
            long j = tuitionPaymentFragmentbindingInflater1.asBinder;
            int i5 = i3 + 85;
            INotificationSideChannel = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }

        static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            int iTuitionPaymentFragmentbindingInflater1 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
            int iTuitionPaymentFragmentbindingInflater2 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
            return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -1671191065, iTuitionPaymentFragmentbindingInflater2, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, new Object[]{tuitionPaymentFragmentbindingInflater1}, 1671191065)).booleanValue();
        }

        static /* synthetic */ setViewPort d(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            int iTuitionPaymentFragmentbindingInflater1 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
            int iTuitionPaymentFragmentbindingInflater2 = AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1();
            return (setViewPort) TuitionPaymentFragmentspecialinlinedviewModeldefault1(AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), -33663671, iTuitionPaymentFragmentbindingInflater2, AbstractMap$values$1$iterator$1.TuitionPaymentFragmentbindingInflater1(), iTuitionPaymentFragmentbindingInflater1, new Object[]{tuitionPaymentFragmentbindingInflater1}, 33663672);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v72 */
        /* JADX WARN: Type inference failed for: r0v74 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r11v53 */
        /* JADX WARN: Type inference failed for: r13v29 */
        /* JADX WARN: Type inference failed for: r16v4 */
        /* JADX WARN: Type inference failed for: r17v5 */
        /* JADX WARN: Type inference failed for: r1v108, types: [int[]] */
        /* JADX WARN: Type inference failed for: r1v157, types: [int[]] */
        /* JADX WARN: Type inference failed for: r1v160, types: [int[]] */
        /* JADX WARN: Type inference failed for: r24v11 */
        /* JADX WARN: Type inference failed for: r24v12 */
        /* JADX WARN: Type inference failed for: r24v13 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v124 */
        /* JADX WARN: Type inference failed for: r3v130, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v133, types: [int[]] */
        /* JADX WARN: Type inference failed for: r3v163, types: [int] */
        /* JADX WARN: Type inference failed for: r3v173 */
        /* JADX WARN: Type inference failed for: r3v174 */
        /* JADX WARN: Type inference failed for: r3v175 */
        /* JADX WARN: Type inference failed for: r3v176 */
        /* JADX WARN: Type inference failed for: r3v177 */
        /* JADX WARN: Type inference failed for: r3v178 */
        /* JADX WARN: Type inference failed for: r3v39 */
        /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v54 */
        /* JADX WARN: Type inference failed for: r3v72 */
        /* JADX WARN: Type inference failed for: r3v89 */
        /* JADX WARN: Type inference failed for: r3v90, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v94, types: [byte[]] */
        /* JADX WARN: Type inference failed for: r3v99, types: [int] */
        /* JADX WARN: Type inference failed for: r4v103, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v102, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r5v103 */
        /* JADX WARN: Type inference failed for: r5v104 */
        /* JADX WARN: Type inference failed for: r5v109 */
        /* JADX WARN: Type inference failed for: r5v119, types: [int] */
        /* JADX WARN: Type inference failed for: r5v132 */
        /* JADX WARN: Type inference failed for: r5v135 */
        /* JADX WARN: Type inference failed for: r5v136 */
        /* JADX WARN: Type inference failed for: r5v137 */
        /* JADX WARN: Type inference failed for: r5v36, types: [int] */
        /* JADX WARN: Type inference failed for: r5v37 */
        /* JADX WARN: Type inference failed for: r5v39 */
        /* JADX WARN: Type inference failed for: r5v77 */
        /* JADX WARN: Type inference failed for: r5v97, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v155, types: [int[]] */
        /* JADX WARN: Type inference failed for: r6v163 */
        /* JADX WARN: Type inference failed for: r6v169 */
        /* JADX WARN: Type inference failed for: r6v187 */
        /* JADX WARN: Type inference failed for: r6v85 */
        /* JADX WARN: Type inference failed for: r7v105, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r8v110 */
        /* JADX WARN: Type inference failed for: r8v47 */
        /* JADX WARN: Type inference failed for: r8v49 */
        /* JADX WARN: Type inference failed for: r8v54 */
        /* JADX WARN: Type inference failed for: r9v60 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r30, int r31, int r32) {
            /*
                Method dump skipped, instruction units count: 3641
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: unbindFromCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, int, int):java.lang.Object[]");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$c(byte r7, int r8, short r9) {
            /*
                byte[] r0 = unbindFromCamera.TuitionPaymentFragmentbindingInflater1.$$a
                int r9 = r9 * 4
                int r9 = 1 - r9
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r8 = r8 + 109
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r9
                r4 = r2
                goto L29
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L24:
                r3 = r0[r7]
                r6 = r3
                r3 = r8
                r8 = r6
            L29:
                int r8 = -r8
                int r8 = r8 + r3
                int r7 = r7 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: unbindFromCamera.TuitionPaymentFragmentbindingInflater1.$$c(byte, int, short):java.lang.String");
        }
    }

    @Override // defpackage.isServiced
    public final int cancelAll() {
        return super.cancelAll();
    }

    @Override // defpackage.isServiced
    public final StringBuilder b() {
        new updateSuggestedStreamSpecImplementationOptions();
        setViewPort setviewport = new setViewPort(onTransact(), this.b);
        setViewPort setviewport2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        setViewPort setviewport3 = this.INotificationSideChannelStub;
        setViewPort setviewport4 = this.INotificationSideChannelDefault;
        setViewPort setviewport5 = this.onTransact;
        StringBuilder sb = new StringBuilder();
        sb.append("et=");
        sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2().protocolId);
        sb.append("&na=");
        sb.append(ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asBinder));
        sb.append("&it=");
        sb.append(Thread.currentThread().getId());
        sb.append("&ca=");
        sb.append(this.asInterface);
        sb.append("&pa=");
        sb.append(a());
        sb.append("&s0=");
        sb.append(setviewport.b);
        sb.append("&t0=");
        sb.append(setviewport.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (setviewport2 != null) {
            sb.append("&s1=");
            sb.append(setviewport2.b);
            sb.append("&t1=");
            sb.append(setviewport2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (setviewport3 != null) {
            sb.append("&s2=");
            sb.append(setviewport3.b);
            sb.append("&t2=");
            sb.append(setviewport3.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (setviewport4 != null) {
            sb.append("&s3=");
            sb.append(setviewport4.b);
            sb.append("&t3=");
            sb.append(setviewport4.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (setviewport5 != null) {
            sb.append("&s4=");
            sb.append(setviewport5.b);
            sb.append("&t4=");
            sb.append(setviewport5.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        sb.append("&fw=");
        sb.append(this.getInterfaceDescriptor ? "1" : "0");
        return sb;
    }
}

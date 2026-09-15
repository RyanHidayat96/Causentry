package io.reactivex.internal.functions;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.api.internal.zag;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.DynamicRangeMatchedEncoderProfilesProvider;
import defpackage.OutputTransform;
import defpackage.QualityExploredEncoderProfilesProvider;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.SessionProcessor;
import defpackage.VideoRecordEventStatus;
import defpackage.appendBackupVideoProfile;
import defpackage.checkFullySpecifiedOrThrow;
import defpackage.dumpCodecCapabilities;
import defpackage.dumpVideoCapabilities;
import defpackage.exploreProfiles;
import defpackage.filterUnmatchedDynamicRange;
import defpackage.findQualityInTargetQualities;
import defpackage.formatInterval;
import defpackage.hasMatchedVideoProfileForAllTargetDynamicRanges;
import defpackage.initSession;
import defpackage.isSamsungJ4;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.logToString;
import defpackage.onCaptureSessionEnd;
import defpackage.readableBufferInfo;
import defpackage.readableMs;
import defpackage.share;
import defpackage.stringToLog;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class Functions {
    private static findQualityInTargetQualities<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static final logToString<Throwable> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static findQualityInTargetQualities<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static Comparator<Object> asBinder;
    private static Callable<Object> d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static readableMs<Object, Object> f1205a = new read();
    public static final Runnable b = new RemoteActionCompatParcelizer();
    public static final formatInterval TuitionPaymentFragmentbindingInflater1 = new cancelAll();
    private static logToString<Object> asInterface = new cancel();

    public static <T1, T2, R> readableMs<Object[], R> b(dumpCodecCapabilities<? super T1, ? super T2, ? extends R> dumpcodeccapabilities) {
        share.b(dumpcodeccapabilities, "f is null");
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(dumpcodeccapabilities);
    }

    public static <T1, T2, T3, R> readableMs<Object[], R> TuitionPaymentFragmentspecialinlinedviewModeldefault3(stringToLog<T1, T2, T3, R> stringtolog) {
        share.b(stringtolog, "f is null");
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(stringtolog);
    }

    public static <T1, T2, T3, T4, R> readableMs<Object[], R> TuitionPaymentFragmentbindingInflater1(exploreProfiles<T1, T2, T3, T4, R> exploreprofiles) {
        share.b(exploreprofiles, "f is null");
        return new b(exploreprofiles);
    }

    public static <T1, T2, T3, T4, T5, R> readableMs<Object[], R> b(QualityExploredEncoderProfilesProvider<T1, T2, T3, T4, T5, R> qualityExploredEncoderProfilesProvider) {
        share.b(qualityExploredEncoderProfilesProvider, "f is null");
        return new TuitionPaymentFragmentbindingInflater1(qualityExploredEncoderProfilesProvider);
    }

    public static <T1, T2, T3, T4, T5, T6, R> readableMs<Object[], R> TuitionPaymentFragmentbindingInflater1(filterUnmatchedDynamicRange<T1, T2, T3, T4, T5, T6, R> filterunmatcheddynamicrange) {
        share.b(filterunmatcheddynamicrange, "f is null");
        return new g(filterunmatcheddynamicrange);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> readableMs<Object[], R> TuitionPaymentFragmentspecialinlinedviewModeldefault1(DynamicRangeMatchedEncoderProfilesProvider<T1, T2, T3, T4, T5, T6, T7, R> dynamicRangeMatchedEncoderProfilesProvider) {
        share.b(dynamicRangeMatchedEncoderProfilesProvider, "f is null");
        return new asInterface(dynamicRangeMatchedEncoderProfilesProvider);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> readableMs<Object[], R> TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkFullySpecifiedOrThrow<T1, T2, T3, T4, T5, T6, T7, T8, R> checkfullyspecifiedorthrow) {
        share.b(checkfullyspecifiedorthrow, "f is null");
        return new a(checkfullyspecifiedorthrow);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> readableMs<Object[], R> TuitionPaymentFragmentbindingInflater1(hasMatchedVideoProfileForAllTargetDynamicRanges<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> hasmatchedvideoprofileforalltargetdynamicranges) {
        share.b(hasmatchedvideoprofileforalltargetdynamicranges, "f is null");
        return new asBinder(hasmatchedvideoprofileforalltargetdynamicranges);
    }

    static {
        new getInterfaceDescriptor();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getRoot();
        new INotificationSideChannelStub();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new sendCustomAction();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new INotificationSideChannelDefault();
        d = new getExtras();
        asBinder = new connect();
        new write();
    }

    public static <T> readableMs<T, T> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return (readableMs<T, T>) f1205a;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class getSessionToken<K, V, T> implements dumpVideoCapabilities<Map<K, V>, T> {
        private final readableMs<? super T, ? extends K> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final readableMs<? super T, ? extends V> b;
        private static final byte[] $$c = {114, -115, 48, 84};
        private static final int $$f = 68;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {29, -5, -24, -13, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        private static final int $$e = 139;
        private static final byte[] $$a = {77, -106, 83, 4, 6, -24, 18, 48, -72, 11, -1, -21, 0, 6, -14, -8, 72, -56, -5, -16, -5, 67, -45, 32, 2, -12, -13, -37, -16, -5, 8, 0, -6, 3, -1, -22, 12, -1, -18, 44, -54, 1, 12, -12, -8, 7, -9, -2, 21, -14, -14, -12, 13};
        private static final int $$b = 122;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1206a = 0;
        private static int g = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {45558, 62044, 13992, 31518, 48950, 58327, 9267, 26772, 44218, 53625, 5561, 22041, 39543, 57075, 807, 18325, 35818, 52296, 28860, 53549, 5519, 22053, 37585, 57191, 6991, 18357, 32855, 52459, 2177, 30050, 45547, 62063, 15901, 31405, 55277, 37983, 20659, 7448, 55668, 34263, 16908, 3757, 51934, 46962, 45558, 62044, 13992, 31518, 48950, 58314, 9279, 26776, 44257, 53575, 5567, 22019, 39529, 56991, 793, 18326, 35829, 52350, 28858, 46336, 63866, 15820, 45551, 62040, 13994, 31531, 49009, 58324, 9279, 45529, 62078, 44878, 60644, 10256, 26022, 41358, 64882, 14983, 30240, 45657, 53247, 2823, 18619, 34001, 49191, 7561, 22830, 38214, 53985, 28248, 43924, 59349, 9059, 24710, 48186, 63578, 13812, 28957, 36542, 51916, 1660, 17340, 40762, 56167, 6289, 21545, 36949, 11769, 45563, 62040, 13994, 31546, 49014, 58330, 9269, 26783, 44273, 53585, 9451, 26433, 41909, 60931, 10795, 30410, 45358, 64905, 14759, 17514, 32946, 49950, 3944, 19438, 38458, 53896, 7927, 22869, 58785, 13179, 28895, 46127, 63903, 45552, 62036, 14003, 31510, 49004, 32340, 15863, 63749, 45558, 62044, 13992, 31518, 48950, 58325, 9275, 26773, 44275, 53531, 5530, 22040, 39550, 57046, 45544, 62034, 13974, 31514, 48992, 58346, 9262, 26761, 44285, 53595, 5553, 45488, 45563, 62040, 13994, 31538, 49015, 58333, 9267, 26781, 44285, 53584, 5540, 22020, 45496, 19370, 2065, 52431, 33089, 17715, 6543, 56947, 37569, 19229, 2238, 52300, 33225, 17823, 6445, 57053, 37488, 22039, 11175, 61269, 44259, 24738, 9262, 63940, 48496, 28953, 45551, 62036, 14009, 31505, 49017, 58317, 9263, 26761, 44273, 53574, 30562, 13544, 61468, 48554, 39714, 55425, 7289, 20959, 38306, 51492, 3808, 16980, 34361, 64400, 16204, 31947, 45247, 62492, 10745, 45462, 61065, 44330, 27096, 9294, 57355, 48318, 31579, 14316, 8656, 25186, 42651};
        private static long TuitionPaymentFragmentbindingInflater1 = -8457181157309222339L;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
        private static int asBinder = 1730534216;
        private static char asInterface = 34097;

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void e(short r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = io.reactivex.internal.functions.Functions.getSessionToken.$$d
                int r7 = 103 - r7
                int r1 = 53 - r6
                int r5 = 93 - r5
                byte[] r1 = new byte[r1]
                int r6 = 52 - r6
                r2 = 0
                if (r0 != 0) goto L13
                r4 = r7
                r3 = r2
                r7 = r5
                goto L25
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L21
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L21:
                int r3 = r3 + 1
                r4 = r0[r5]
            L25:
                int r5 = r5 + 1
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.functions.Functions.getSessionToken.e(short, int, short, java.lang.Object[]):void");
        }

        private static void f(short s, int i, byte b, Object[] objArr) {
            int i2 = (s * 3) + 103;
            int i3 = b * 17;
            int i4 = 37 - (i * 33);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i3 + 17];
            int i5 = i3 + 16;
            int i6 = -1;
            if (bArr == null) {
                i2 = (i2 + (-i4)) - 3;
                i4++;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i2;
                if (i7 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i8 = i4;
                i2 = (i2 + (-bArr[i4])) - 3;
                i4 = i8 + 1;
                i6 = i7;
            }
        }

        private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), 2187 - KeyEvent.keyCodeFromString(""), 40 - View.resolveSize(0, 0), 841711447, false, $$g(b, b2, (byte) (b2 | 7)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33016), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3011, TextUtils.getCapsMode("", 0, 0) + 26, 321985076, false, $$g(b3, b4, (byte) (b4 | 13)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getPressedStateDuration() >> 16)), 3375 - MotionEvent.axisFromString(""), 17 - TextUtils.indexOf("", ""), -968507904, false, $$g(b5, b6, (byte) (b6 | 10)), new Class[]{Object.class, Object.class});
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
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - TextUtils.indexOf("", "", 0)), 3376 - View.combineMeasuredStates(0, 0), 17 - Color.blue(0), -968507904, false, $$g(b7, b8, (byte) (b8 | 10)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
            int i7 = $10 + 41;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }

        private static void d(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = cArr2.length;
            char[] cArr5 = new char[length2];
            int i5 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(cArr2, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            int i6 = $10 + 7;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 3;
            }
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i8 = $10 + 71;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr2 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char tapTimeout = (char) (8328 - (ViewConfiguration.getTapTimeout() >> 16));
                        int capsMode = TextUtils.getCapsMode("", i5, i5) + 1235;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 35;
                        byte b = (byte) i5;
                        byte b2 = b;
                        String str$$g = $$g(b, b2, b2);
                        Class[] clsArr = new Class[1];
                        clsArr[i5] = Object.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, capsMode, touchSlop, -653973969, false, str$$g, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) i5;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), Gravity.getAbsoluteGravity(i5, i5) + 2764, View.combineMeasuredStates(i5, i5) + 14, 1504416861, false, $$g(b3, b4, (byte) (b4 + 2)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - Color.red(0)), 254 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.blue(0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char gidForName = (char) (Process.getGidForName("") + 65201);
                        int i10 = 2891 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int mirror = 'A' - AndroidCharacter.getMirror('0');
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        String str$$g2 = $$g(b5, b6, (byte) (b6 + 1));
                        i2 = 2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, i10, mirror, 2012627446, false, str$$g2, new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = sessionProcessor.b;
                    cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) asBinder) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) asInterface) ^ (-6377398940819159759L)))));
                    sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
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

        @Override // defpackage.dumpVideoCapabilities
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, Object obj2) throws Exception {
            int i = 2 % 2;
            int i2 = f1206a + 97;
            g = i2 % 128;
            int i3 = i2 % 2;
            ((Map) obj).put(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.apply(obj2), this.b.apply(obj2));
            int i4 = g + 49;
            f1206a = i4 % 128;
            int i5 = i4 % 2;
        }

        getSessionToken(readableMs<? super T, ? extends V> readablems, readableMs<? super T, ? extends K> readablems2) {
            this.b = readablems;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems2;
        }

        /* JADX WARN: Multi-variable search skipped. Vars limit reached: 8440 (expected less than 5000) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v100, types: [int] */
        /* JADX WARN: Type inference failed for: r11v109, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r11v123, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v126 */
        /* JADX WARN: Type inference failed for: r11v128 */
        /* JADX WARN: Type inference failed for: r11v129, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v130 */
        /* JADX WARN: Type inference failed for: r11v133 */
        /* JADX WARN: Type inference failed for: r11v135 */
        /* JADX WARN: Type inference failed for: r11v136 */
        /* JADX WARN: Type inference failed for: r11v142 */
        /* JADX WARN: Type inference failed for: r11v143 */
        /* JADX WARN: Type inference failed for: r11v157 */
        /* JADX WARN: Type inference failed for: r11v159, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r11v163, types: [int] */
        /* JADX WARN: Type inference failed for: r11v164 */
        /* JADX WARN: Type inference failed for: r11v165 */
        /* JADX WARN: Type inference failed for: r11v166 */
        /* JADX WARN: Type inference failed for: r11v167 */
        /* JADX WARN: Type inference failed for: r11v168 */
        /* JADX WARN: Type inference failed for: r11v198, types: [java.nio.LongBuffer] */
        /* JADX WARN: Type inference failed for: r11v23 */
        /* JADX WARN: Type inference failed for: r11v24 */
        /* JADX WARN: Type inference failed for: r11v25 */
        /* JADX WARN: Type inference failed for: r11v26 */
        /* JADX WARN: Type inference failed for: r11v27 */
        /* JADX WARN: Type inference failed for: r11v28 */
        /* JADX WARN: Type inference failed for: r11v29 */
        /* JADX WARN: Type inference failed for: r11v30, types: [int] */
        /* JADX WARN: Type inference failed for: r11v31 */
        /* JADX WARN: Type inference failed for: r11v36 */
        /* JADX WARN: Type inference failed for: r11v363 */
        /* JADX WARN: Type inference failed for: r11v365 */
        /* JADX WARN: Type inference failed for: r11v366 */
        /* JADX WARN: Type inference failed for: r11v367 */
        /* JADX WARN: Type inference failed for: r11v368 */
        /* JADX WARN: Type inference failed for: r11v369 */
        /* JADX WARN: Type inference failed for: r11v37 */
        /* JADX WARN: Type inference failed for: r11v370 */
        /* JADX WARN: Type inference failed for: r11v371 */
        /* JADX WARN: Type inference failed for: r11v372 */
        /* JADX WARN: Type inference failed for: r11v374 */
        /* JADX WARN: Type inference failed for: r11v375 */
        /* JADX WARN: Type inference failed for: r11v376 */
        /* JADX WARN: Type inference failed for: r11v377 */
        /* JADX WARN: Type inference failed for: r11v378 */
        /* JADX WARN: Type inference failed for: r11v379 */
        /* JADX WARN: Type inference failed for: r11v38 */
        /* JADX WARN: Type inference failed for: r11v380 */
        /* JADX WARN: Type inference failed for: r11v381 */
        /* JADX WARN: Type inference failed for: r11v382 */
        /* JADX WARN: Type inference failed for: r11v383 */
        /* JADX WARN: Type inference failed for: r11v384 */
        /* JADX WARN: Type inference failed for: r11v385 */
        /* JADX WARN: Type inference failed for: r11v386 */
        /* JADX WARN: Type inference failed for: r11v387 */
        /* JADX WARN: Type inference failed for: r11v388 */
        /* JADX WARN: Type inference failed for: r11v389 */
        /* JADX WARN: Type inference failed for: r11v390 */
        /* JADX WARN: Type inference failed for: r11v391 */
        /* JADX WARN: Type inference failed for: r11v392 */
        /* JADX WARN: Type inference failed for: r11v393 */
        /* JADX WARN: Type inference failed for: r11v394 */
        /* JADX WARN: Type inference failed for: r11v395 */
        /* JADX WARN: Type inference failed for: r11v43, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r11v45, types: [int] */
        /* JADX WARN: Type inference failed for: r11v46 */
        /* JADX WARN: Type inference failed for: r11v47 */
        /* JADX WARN: Type inference failed for: r11v48 */
        /* JADX WARN: Type inference failed for: r11v49 */
        /* JADX WARN: Type inference failed for: r11v50 */
        /* JADX WARN: Type inference failed for: r11v52, types: [char] */
        /* JADX WARN: Type inference failed for: r11v54, types: [char] */
        /* JADX WARN: Type inference failed for: r11v57 */
        /* JADX WARN: Type inference failed for: r11v58 */
        /* JADX WARN: Type inference failed for: r11v59 */
        /* JADX WARN: Type inference failed for: r11v67, types: [char[]] */
        /* JADX WARN: Type inference failed for: r11v73 */
        /* JADX WARN: Type inference failed for: r11v74 */
        /* JADX WARN: Type inference failed for: r11v81, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r11v82, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r11v84, types: [char[]] */
        /* JADX WARN: Type inference failed for: r11v85 */
        /* JADX WARN: Type inference failed for: r11v86 */
        /* JADX WARN: Type inference failed for: r11v95, types: [int] */
        /* JADX WARN: Type inference failed for: r12v10 */
        /* JADX WARN: Type inference failed for: r12v11 */
        /* JADX WARN: Type inference failed for: r12v12 */
        /* JADX WARN: Type inference failed for: r12v125, types: [char[]] */
        /* JADX WARN: Type inference failed for: r12v126 */
        /* JADX WARN: Type inference failed for: r12v129 */
        /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v135, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r12v136 */
        /* JADX WARN: Type inference failed for: r12v137 */
        /* JADX WARN: Type inference failed for: r12v138 */
        /* JADX WARN: Type inference failed for: r12v139 */
        /* JADX WARN: Type inference failed for: r12v140 */
        /* JADX WARN: Type inference failed for: r12v141 */
        /* JADX WARN: Type inference failed for: r12v142 */
        /* JADX WARN: Type inference failed for: r12v143 */
        /* JADX WARN: Type inference failed for: r12v15 */
        /* JADX WARN: Type inference failed for: r12v151 */
        /* JADX WARN: Type inference failed for: r12v171, types: [char] */
        /* JADX WARN: Type inference failed for: r12v172 */
        /* JADX WARN: Type inference failed for: r12v175, types: [int] */
        /* JADX WARN: Type inference failed for: r12v182, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v183 */
        /* JADX WARN: Type inference failed for: r12v184 */
        /* JADX WARN: Type inference failed for: r12v186 */
        /* JADX WARN: Type inference failed for: r12v187 */
        /* JADX WARN: Type inference failed for: r12v188 */
        /* JADX WARN: Type inference failed for: r12v189 */
        /* JADX WARN: Type inference failed for: r12v191, types: [char] */
        /* JADX WARN: Type inference failed for: r12v197, types: [char] */
        /* JADX WARN: Type inference failed for: r12v198 */
        /* JADX WARN: Type inference failed for: r12v201 */
        /* JADX WARN: Type inference failed for: r12v21 */
        /* JADX WARN: Type inference failed for: r12v22 */
        /* JADX WARN: Type inference failed for: r12v23 */
        /* JADX WARN: Type inference failed for: r12v233 */
        /* JADX WARN: Type inference failed for: r12v24 */
        /* JADX WARN: Type inference failed for: r12v244, types: [char] */
        /* JADX WARN: Type inference failed for: r12v245 */
        /* JADX WARN: Type inference failed for: r12v246, types: [char] */
        /* JADX WARN: Type inference failed for: r12v247 */
        /* JADX WARN: Type inference failed for: r12v248 */
        /* JADX WARN: Type inference failed for: r12v249 */
        /* JADX WARN: Type inference failed for: r12v25 */
        /* JADX WARN: Type inference failed for: r12v250 */
        /* JADX WARN: Type inference failed for: r12v251 */
        /* JADX WARN: Type inference failed for: r12v252 */
        /* JADX WARN: Type inference failed for: r12v253, types: [char] */
        /* JADX WARN: Type inference failed for: r12v260, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v275, types: [java.lang.Class[]] */
        /* JADX WARN: Type inference failed for: r12v278 */
        /* JADX WARN: Type inference failed for: r12v279 */
        /* JADX WARN: Type inference failed for: r12v28, types: [char[]] */
        /* JADX WARN: Type inference failed for: r12v280, types: [char] */
        /* JADX WARN: Type inference failed for: r12v282, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r12v283 */
        /* JADX WARN: Type inference failed for: r12v284 */
        /* JADX WARN: Type inference failed for: r12v285 */
        /* JADX WARN: Type inference failed for: r12v286 */
        /* JADX WARN: Type inference failed for: r12v287 */
        /* JADX WARN: Type inference failed for: r12v288 */
        /* JADX WARN: Type inference failed for: r12v289 */
        /* JADX WARN: Type inference failed for: r12v290 */
        /* JADX WARN: Type inference failed for: r12v291 */
        /* JADX WARN: Type inference failed for: r12v292 */
        /* JADX WARN: Type inference failed for: r12v293 */
        /* JADX WARN: Type inference failed for: r12v294 */
        /* JADX WARN: Type inference failed for: r12v295 */
        /* JADX WARN: Type inference failed for: r12v296 */
        /* JADX WARN: Type inference failed for: r12v297 */
        /* JADX WARN: Type inference failed for: r12v298 */
        /* JADX WARN: Type inference failed for: r12v299 */
        /* JADX WARN: Type inference failed for: r12v300 */
        /* JADX WARN: Type inference failed for: r12v301 */
        /* JADX WARN: Type inference failed for: r12v302 */
        /* JADX WARN: Type inference failed for: r12v303 */
        /* JADX WARN: Type inference failed for: r12v304 */
        /* JADX WARN: Type inference failed for: r12v305 */
        /* JADX WARN: Type inference failed for: r12v306 */
        /* JADX WARN: Type inference failed for: r12v307 */
        /* JADX WARN: Type inference failed for: r12v308 */
        /* JADX WARN: Type inference failed for: r12v31, types: [char[]] */
        /* JADX WARN: Type inference failed for: r12v314 */
        /* JADX WARN: Type inference failed for: r12v325 */
        /* JADX WARN: Type inference failed for: r12v34 */
        /* JADX WARN: Type inference failed for: r12v343 */
        /* JADX WARN: Type inference failed for: r12v344 */
        /* JADX WARN: Type inference failed for: r12v345 */
        /* JADX WARN: Type inference failed for: r12v346 */
        /* JADX WARN: Type inference failed for: r12v347 */
        /* JADX WARN: Type inference failed for: r12v348 */
        /* JADX WARN: Type inference failed for: r12v349 */
        /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v350 */
        /* JADX WARN: Type inference failed for: r12v356 */
        /* JADX WARN: Type inference failed for: r12v360 */
        /* JADX WARN: Type inference failed for: r12v365 */
        /* JADX WARN: Type inference failed for: r12v369 */
        /* JADX WARN: Type inference failed for: r12v370 */
        /* JADX WARN: Type inference failed for: r12v372 */
        /* JADX WARN: Type inference failed for: r12v386 */
        /* JADX WARN: Type inference failed for: r12v387 */
        /* JADX WARN: Type inference failed for: r12v394 */
        /* JADX WARN: Type inference failed for: r12v396 */
        /* JADX WARN: Type inference failed for: r12v397 */
        /* JADX WARN: Type inference failed for: r12v398 */
        /* JADX WARN: Type inference failed for: r12v401 */
        /* JADX WARN: Type inference failed for: r12v416 */
        /* JADX WARN: Type inference failed for: r12v417 */
        /* JADX WARN: Type inference failed for: r12v418 */
        /* JADX WARN: Type inference failed for: r12v419 */
        /* JADX WARN: Type inference failed for: r12v420 */
        /* JADX WARN: Type inference failed for: r12v421 */
        /* JADX WARN: Type inference failed for: r12v422 */
        /* JADX WARN: Type inference failed for: r12v423 */
        /* JADX WARN: Type inference failed for: r12v424 */
        /* JADX WARN: Type inference failed for: r12v425 */
        /* JADX WARN: Type inference failed for: r12v426 */
        /* JADX WARN: Type inference failed for: r12v427 */
        /* JADX WARN: Type inference failed for: r12v428 */
        /* JADX WARN: Type inference failed for: r12v429 */
        /* JADX WARN: Type inference failed for: r12v430 */
        /* JADX WARN: Type inference failed for: r12v431 */
        /* JADX WARN: Type inference failed for: r12v432 */
        /* JADX WARN: Type inference failed for: r12v433 */
        /* JADX WARN: Type inference failed for: r12v434 */
        /* JADX WARN: Type inference failed for: r12v435 */
        /* JADX WARN: Type inference failed for: r12v436 */
        /* JADX WARN: Type inference failed for: r12v437 */
        /* JADX WARN: Type inference failed for: r12v438 */
        /* JADX WARN: Type inference failed for: r12v439 */
        /* JADX WARN: Type inference failed for: r12v440 */
        /* JADX WARN: Type inference failed for: r12v441 */
        /* JADX WARN: Type inference failed for: r12v442 */
        /* JADX WARN: Type inference failed for: r12v443 */
        /* JADX WARN: Type inference failed for: r12v444 */
        /* JADX WARN: Type inference failed for: r12v445 */
        /* JADX WARN: Type inference failed for: r12v446 */
        /* JADX WARN: Type inference failed for: r12v447 */
        /* JADX WARN: Type inference failed for: r12v448 */
        /* JADX WARN: Type inference failed for: r12v449 */
        /* JADX WARN: Type inference failed for: r12v450 */
        /* JADX WARN: Type inference failed for: r12v451 */
        /* JADX WARN: Type inference failed for: r12v452 */
        /* JADX WARN: Type inference failed for: r12v453 */
        /* JADX WARN: Type inference failed for: r12v454 */
        /* JADX WARN: Type inference failed for: r12v455 */
        /* JADX WARN: Type inference failed for: r12v456 */
        /* JADX WARN: Type inference failed for: r12v457 */
        /* JADX WARN: Type inference failed for: r12v458 */
        /* JADX WARN: Type inference failed for: r12v459 */
        /* JADX WARN: Type inference failed for: r12v460 */
        /* JADX WARN: Type inference failed for: r12v461 */
        /* JADX WARN: Type inference failed for: r12v462 */
        /* JADX WARN: Type inference failed for: r12v463 */
        /* JADX WARN: Type inference failed for: r12v464 */
        /* JADX WARN: Type inference failed for: r12v465 */
        /* JADX WARN: Type inference failed for: r12v466 */
        /* JADX WARN: Type inference failed for: r12v467 */
        /* JADX WARN: Type inference failed for: r12v468 */
        /* JADX WARN: Type inference failed for: r12v469 */
        /* JADX WARN: Type inference failed for: r12v470 */
        /* JADX WARN: Type inference failed for: r12v471 */
        /* JADX WARN: Type inference failed for: r12v472 */
        /* JADX WARN: Type inference failed for: r12v473 */
        /* JADX WARN: Type inference failed for: r12v474 */
        /* JADX WARN: Type inference failed for: r12v475 */
        /* JADX WARN: Type inference failed for: r12v476 */
        /* JADX WARN: Type inference failed for: r12v477 */
        /* JADX WARN: Type inference failed for: r12v478 */
        /* JADX WARN: Type inference failed for: r12v479 */
        /* JADX WARN: Type inference failed for: r12v48 */
        /* JADX WARN: Type inference failed for: r12v480 */
        /* JADX WARN: Type inference failed for: r12v481 */
        /* JADX WARN: Type inference failed for: r12v482 */
        /* JADX WARN: Type inference failed for: r12v483 */
        /* JADX WARN: Type inference failed for: r12v484 */
        /* JADX WARN: Type inference failed for: r12v485 */
        /* JADX WARN: Type inference failed for: r12v486 */
        /* JADX WARN: Type inference failed for: r12v487 */
        /* JADX WARN: Type inference failed for: r12v488 */
        /* JADX WARN: Type inference failed for: r12v489 */
        /* JADX WARN: Type inference failed for: r12v490 */
        /* JADX WARN: Type inference failed for: r12v491 */
        /* JADX WARN: Type inference failed for: r12v492 */
        /* JADX WARN: Type inference failed for: r12v493 */
        /* JADX WARN: Type inference failed for: r12v494 */
        /* JADX WARN: Type inference failed for: r12v495 */
        /* JADX WARN: Type inference failed for: r12v86 */
        /* JADX WARN: Type inference failed for: r12v9 */
        /* JADX WARN: Type inference failed for: r12v94 */
        /* JADX WARN: Type inference failed for: r14v456 */
        /* JADX WARN: Type inference failed for: r1v1087 */
        /* JADX WARN: Type inference failed for: r1v1088 */
        /* JADX WARN: Type inference failed for: r1v876, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r1v884, types: [byte[]] */
        /* JADX WARN: Type inference failed for: r1v887 */
        /* JADX WARN: Type inference failed for: r1v888 */
        /* JADX WARN: Type inference failed for: r1v889 */
        /* JADX WARN: Type inference failed for: r1v890 */
        /* JADX WARN: Type inference failed for: r1v891, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v901, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v904 */
        /* JADX WARN: Type inference failed for: r1v905 */
        /* JADX WARN: Type inference failed for: r1v906 */
        /* JADX WARN: Type inference failed for: r1v923 */
        /* JADX WARN: Type inference failed for: r1v931 */
        /* JADX WARN: Type inference failed for: r1v932 */
        /* JADX WARN: Type inference failed for: r1v939, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r1v941 */
        /* JADX WARN: Type inference failed for: r1v952 */
        /* JADX WARN: Type inference failed for: r1v953 */
        /* JADX WARN: Type inference failed for: r2v152, types: [java.util.ArrayList, java.util.List] */
        /* JADX WARN: Type inference failed for: r2v409 */
        /* JADX WARN: Type inference failed for: r2v437, types: [java.lang.reflect.Field] */
        /* JADX WARN: Type inference failed for: r2v526 */
        /* JADX WARN: Type inference failed for: r2v555, types: [java.nio.LongBuffer[]] */
        /* JADX WARN: Type inference failed for: r2v556 */
        /* JADX WARN: Type inference failed for: r2v560 */
        /* JADX WARN: Type inference failed for: r2v561 */
        /* JADX WARN: Type inference failed for: r2v586, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r2v601 */
        /* JADX WARN: Type inference failed for: r2v644, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r2v658, types: [android.security.keystore.KeyGenParameterSpec$Builder] */
        /* JADX WARN: Type inference failed for: r2v663, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r2v747 */
        /* JADX WARN: Type inference failed for: r2v766 */
        /* JADX WARN: Type inference failed for: r2v884 */
        /* JADX WARN: Type inference failed for: r2v885 */
        /* JADX WARN: Type inference failed for: r2v886 */
        /* JADX WARN: Type inference failed for: r2v887 */
        /* JADX WARN: Type inference failed for: r34v1 */
        /* JADX WARN: Type inference failed for: r34v100 */
        /* JADX WARN: Type inference failed for: r34v101 */
        /* JADX WARN: Type inference failed for: r34v102 */
        /* JADX WARN: Type inference failed for: r34v103 */
        /* JADX WARN: Type inference failed for: r34v104 */
        /* JADX WARN: Type inference failed for: r34v109 */
        /* JADX WARN: Type inference failed for: r34v110 */
        /* JADX WARN: Type inference failed for: r34v111 */
        /* JADX WARN: Type inference failed for: r34v114, types: [char] */
        /* JADX WARN: Type inference failed for: r34v118 */
        /* JADX WARN: Type inference failed for: r34v119 */
        /* JADX WARN: Type inference failed for: r34v120 */
        /* JADX WARN: Type inference failed for: r34v121 */
        /* JADX WARN: Type inference failed for: r34v122 */
        /* JADX WARN: Type inference failed for: r34v123 */
        /* JADX WARN: Type inference failed for: r34v124 */
        /* JADX WARN: Type inference failed for: r34v125 */
        /* JADX WARN: Type inference failed for: r34v126 */
        /* JADX WARN: Type inference failed for: r34v127 */
        /* JADX WARN: Type inference failed for: r34v128 */
        /* JADX WARN: Type inference failed for: r34v129 */
        /* JADX WARN: Type inference failed for: r34v130 */
        /* JADX WARN: Type inference failed for: r34v131 */
        /* JADX WARN: Type inference failed for: r34v132 */
        /* JADX WARN: Type inference failed for: r34v133 */
        /* JADX WARN: Type inference failed for: r34v134 */
        /* JADX WARN: Type inference failed for: r34v135 */
        /* JADX WARN: Type inference failed for: r34v136 */
        /* JADX WARN: Type inference failed for: r34v137 */
        /* JADX WARN: Type inference failed for: r34v138 */
        /* JADX WARN: Type inference failed for: r34v139 */
        /* JADX WARN: Type inference failed for: r34v140 */
        /* JADX WARN: Type inference failed for: r34v16 */
        /* JADX WARN: Type inference failed for: r34v25 */
        /* JADX WARN: Type inference failed for: r34v6 */
        /* JADX WARN: Type inference failed for: r34v68 */
        /* JADX WARN: Type inference failed for: r34v69 */
        /* JADX WARN: Type inference failed for: r34v7 */
        /* JADX WARN: Type inference failed for: r34v70 */
        /* JADX WARN: Type inference failed for: r34v78 */
        /* JADX WARN: Type inference failed for: r34v79 */
        /* JADX WARN: Type inference failed for: r34v8 */
        /* JADX WARN: Type inference failed for: r34v80 */
        /* JADX WARN: Type inference failed for: r34v81 */
        /* JADX WARN: Type inference failed for: r34v82 */
        /* JADX WARN: Type inference failed for: r34v86, types: [char[]] */
        /* JADX WARN: Type inference failed for: r34v87 */
        /* JADX WARN: Type inference failed for: r34v88, types: [char[]] */
        /* JADX WARN: Type inference failed for: r34v89 */
        /* JADX WARN: Type inference failed for: r34v90 */
        /* JADX WARN: Type inference failed for: r34v91 */
        /* JADX WARN: Type inference failed for: r34v92 */
        /* JADX WARN: Type inference failed for: r34v94, types: [char[]] */
        /* JADX WARN: Type inference failed for: r34v98 */
        /* JADX WARN: Type inference failed for: r34v99, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r35v57 */
        /* JADX WARN: Type inference failed for: r35v58 */
        /* JADX WARN: Type inference failed for: r35v59 */
        /* JADX WARN: Type inference failed for: r35v60 */
        /* JADX WARN: Type inference failed for: r35v61, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r35v62, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r35v63 */
        /* JADX WARN: Type inference failed for: r35v64, types: [char[]] */
        /* JADX WARN: Type inference failed for: r35v65 */
        /* JADX WARN: Type inference failed for: r35v66 */
        /* JADX WARN: Type inference failed for: r35v74, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r35v76 */
        /* JADX WARN: Type inference failed for: r35v77 */
        /* JADX WARN: Type inference failed for: r35v78 */
        /* JADX WARN: Type inference failed for: r35v79 */
        /* JADX WARN: Type inference failed for: r35v80 */
        /* JADX WARN: Type inference failed for: r36v23 */
        /* JADX WARN: Type inference failed for: r36v24 */
        /* JADX WARN: Type inference failed for: r36v25 */
        /* JADX WARN: Type inference failed for: r38v0 */
        /* JADX WARN: Type inference failed for: r38v1 */
        /* JADX WARN: Type inference failed for: r38v12, types: [int] */
        /* JADX WARN: Type inference failed for: r38v16 */
        /* JADX WARN: Type inference failed for: r38v17 */
        /* JADX WARN: Type inference failed for: r38v19, types: [int] */
        /* JADX WARN: Type inference failed for: r38v2 */
        /* JADX WARN: Type inference failed for: r38v3 */
        /* JADX WARN: Type inference failed for: r38v4 */
        /* JADX WARN: Type inference failed for: r38v41 */
        /* JADX WARN: Type inference failed for: r38v42 */
        /* JADX WARN: Type inference failed for: r38v43 */
        /* JADX WARN: Type inference failed for: r38v46 */
        /* JADX WARN: Type inference failed for: r38v47 */
        /* JADX WARN: Type inference failed for: r38v48 */
        /* JADX WARN: Type inference failed for: r38v49 */
        /* JADX WARN: Type inference failed for: r38v5 */
        /* JADX WARN: Type inference failed for: r38v51 */
        /* JADX WARN: Type inference failed for: r38v52 */
        /* JADX WARN: Type inference failed for: r38v53 */
        /* JADX WARN: Type inference failed for: r38v54 */
        /* JADX WARN: Type inference failed for: r38v55 */
        /* JADX WARN: Type inference failed for: r38v56 */
        /* JADX WARN: Type inference failed for: r38v57 */
        /* JADX WARN: Type inference failed for: r38v58 */
        /* JADX WARN: Type inference failed for: r38v59 */
        /* JADX WARN: Type inference failed for: r38v6 */
        /* JADX WARN: Type inference failed for: r38v60 */
        /* JADX WARN: Type inference failed for: r38v61 */
        /* JADX WARN: Type inference failed for: r38v62 */
        /* JADX WARN: Type inference failed for: r38v7 */
        /* JADX WARN: Type inference failed for: r38v8, types: [int] */
        /* JADX WARN: Type inference failed for: r38v9 */
        /* JADX WARN: Type inference failed for: r39v89, types: [java.lang.Object, java.security.KeyStore] */
        /* JADX WARN: Type inference failed for: r39v90 */
        /* JADX WARN: Type inference failed for: r39v91 */
        /* JADX WARN: Type inference failed for: r39v92 */
        /* JADX WARN: Type inference failed for: r39v93 */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v100 */
        /* JADX WARN: Type inference failed for: r3v109 */
        /* JADX WARN: Type inference failed for: r3v110 */
        /* JADX WARN: Type inference failed for: r3v111, types: [int] */
        /* JADX WARN: Type inference failed for: r3v112 */
        /* JADX WARN: Type inference failed for: r3v115 */
        /* JADX WARN: Type inference failed for: r3v122 */
        /* JADX WARN: Type inference failed for: r3v164 */
        /* JADX WARN: Type inference failed for: r3v230 */
        /* JADX WARN: Type inference failed for: r3v231 */
        /* JADX WARN: Type inference failed for: r3v232 */
        /* JADX WARN: Type inference failed for: r3v233 */
        /* JADX WARN: Type inference failed for: r3v234 */
        /* JADX WARN: Type inference failed for: r3v235 */
        /* JADX WARN: Type inference failed for: r3v236 */
        /* JADX WARN: Type inference failed for: r3v237 */
        /* JADX WARN: Type inference failed for: r3v238 */
        /* JADX WARN: Type inference failed for: r3v239 */
        /* JADX WARN: Type inference failed for: r3v240 */
        /* JADX WARN: Type inference failed for: r3v241 */
        /* JADX WARN: Type inference failed for: r3v242 */
        /* JADX WARN: Type inference failed for: r3v243 */
        /* JADX WARN: Type inference failed for: r3v244 */
        /* JADX WARN: Type inference failed for: r3v245 */
        /* JADX WARN: Type inference failed for: r3v246 */
        /* JADX WARN: Type inference failed for: r3v247 */
        /* JADX WARN: Type inference failed for: r3v248 */
        /* JADX WARN: Type inference failed for: r3v249 */
        /* JADX WARN: Type inference failed for: r3v250 */
        /* JADX WARN: Type inference failed for: r3v251 */
        /* JADX WARN: Type inference failed for: r3v252 */
        /* JADX WARN: Type inference failed for: r3v253 */
        /* JADX WARN: Type inference failed for: r3v254 */
        /* JADX WARN: Type inference failed for: r3v255 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v40 */
        /* JADX WARN: Type inference failed for: r3v41 */
        /* JADX WARN: Type inference failed for: r3v42 */
        /* JADX WARN: Type inference failed for: r3v45 */
        /* JADX WARN: Type inference failed for: r3v46 */
        /* JADX WARN: Type inference failed for: r3v49 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v57 */
        /* JADX WARN: Type inference failed for: r3v58 */
        /* JADX WARN: Type inference failed for: r3v59 */
        /* JADX WARN: Type inference failed for: r3v66 */
        /* JADX WARN: Type inference failed for: r3v67 */
        /* JADX WARN: Type inference failed for: r3v74 */
        /* JADX WARN: Type inference failed for: r3v75 */
        /* JADX WARN: Type inference failed for: r3v84 */
        /* JADX WARN: Type inference failed for: r3v85, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v89 */
        /* JADX WARN: Type inference failed for: r3v90 */
        /* JADX WARN: Type inference failed for: r4v607, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r4v651 */
        /* JADX WARN: Type inference failed for: r5v1031 */
        /* JADX WARN: Type inference failed for: r5v1032 */
        /* JADX WARN: Type inference failed for: r5v1033 */
        /* JADX WARN: Type inference failed for: r5v115, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v126, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r5v140 */
        /* JADX WARN: Type inference failed for: r5v141, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v144 */
        /* JADX WARN: Type inference failed for: r5v145, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v777 */
        /* JADX WARN: Type inference failed for: r5v778 */
        /* JADX WARN: Type inference failed for: r5v814 */
        /* JADX WARN: Type inference failed for: r62v0, types: [int] */
        /* JADX WARN: Type inference failed for: r6v128 */
        /* JADX WARN: Type inference failed for: r6v158, types: [java.lang.Object, java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r6v232, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r6v494, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r6v586, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v449, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r7v518, types: [java.lang.Object, java.nio.LongBuffer] */
        /* JADX WARN: Type inference failed for: r7v54 */
        /* JADX WARN: Type inference failed for: r7v559 */
        /* JADX WARN: Type inference failed for: r7v560 */
        /* JADX WARN: Type inference failed for: r7v561, types: [java.lang.Object, java.security.KeyStore] */
        /* JADX WARN: Type inference failed for: r7v565, types: [java.lang.Object, java.security.KeyStore] */
        /* JADX WARN: Type inference failed for: r7v567 */
        /* JADX WARN: Type inference failed for: r7v568 */
        /* JADX WARN: Type inference failed for: r7v600 */
        /* JADX WARN: Type inference failed for: r7v601 */
        /* JADX WARN: Type inference failed for: r7v602 */
        /* JADX WARN: Type inference failed for: r7v603 */
        /* JADX WARN: Type inference failed for: r7v628 */
        /* JADX WARN: Type inference failed for: r7v633, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v634 */
        /* JADX WARN: Type inference failed for: r7v635 */
        /* JADX WARN: Type inference failed for: r7v636 */
        /* JADX WARN: Type inference failed for: r7v649 */
        /* JADX WARN: Type inference failed for: r7v650 */
        /* JADX WARN: Type inference failed for: r7v651 */
        /* JADX WARN: Type inference failed for: r7v892, types: [int[]] */
        /* JADX WARN: Type inference failed for: r7v900 */
        /* JADX WARN: Type inference failed for: r7v903 */
        /* JADX WARN: Type inference failed for: r7v904 */
        /* JADX WARN: Type inference failed for: r7v905 */
        /* JADX WARN: Type inference failed for: r7v906 */
        /* JADX WARN: Type inference failed for: r7v907 */
        /* JADX WARN: Type inference failed for: r7v908 */
        /* JADX WARN: Type inference failed for: r7v909 */
        /* JADX WARN: Type inference failed for: r8v467 */
        /* JADX WARN: Type inference failed for: r8v635 */
        /* JADX WARN: Type inference failed for: r8v647, types: [java.lang.reflect.Field] */
        /* JADX WARN: Type inference failed for: r9v123, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r9v399, types: [java.lang.Object, java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r9v423, types: [int[]] */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context r60, java.lang.String[] r61, int r62, int r63, int r64) {
            /*
                Method dump skipped, instruction units count: 29914
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.functions.Functions.getSessionToken.TuitionPaymentFragmentspecialinlinedviewModeldefault3(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, short r7, short r8) {
            /*
                int r7 = r7 * 2
                int r0 = 1 - r7
                byte[] r1 = io.reactivex.internal.functions.Functions.getSessionToken.$$c
                int r6 = r6 * 3
                int r6 = r6 + 4
                int r8 = r8 + 102
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L17
                r4 = r8
                r3 = r2
                r8 = r6
                goto L2a
            L17:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L1b:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L26:
                r4 = r1[r8]
                int r3 = r3 + 1
            L2a:
                int r4 = -r4
                int r6 = r6 + r4
                int r8 = r8 + 1
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.functions.Functions.getSessionToken.$$g(byte, short, short):java.lang.String");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class search<T> implements readableMs<T, isSamsungJ4<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static short[] f1207a;
        private TimeUnit TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private static final byte[] $$a = {39, 27, 2, 54};
        private static final int $$b = 199;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int asInterface = 0;
        private static int notify = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {15842, 9603, 3396, 29860, 23679, 18393, 44891, 38714, 65192, 58889, 51641, 12609, 6356, 191, 26684, 21394, 47949, 41666, 35332, 60900, 54719, 15641, 9371, 3194, 30696, 24393, 18293, 44678, 38476, 63944, 57690, 45558, 43409, 33074, 63673, 53332, 52142, 9063, 6925, 29343, 27173, 17878, 48465, 38136, 35993, 58458, 57257, 14121, 11972, 1644, 25014, 22932, 45429, 43236, 32792, 64402, 54088, 52049, 8904, 6780, 30192, 27974, 17633, 48242, 37907, 36781, 59176, 57037, 13932, 45535, 43469, 33041, 63627, 53248, 52175, 9001, 6953, 29330, 27188, 17878, 48471, 38117, 35972, 58456, 57227, 14098, 11917, 1605, 25078, 22920, 45362, 43195, 32833, 64472, 54064, 52000, 8861, 6702, 30165, 27987, 45563, 43413, 33072, 63624, 53325, 52195, 9087, 6921, 29339, 27189, 17897, 48473, 38114, 35969, 58387, 57261, 14126, 45563, 43413, 33072, 63624, 53325, 52195, 9087, 6921, 29339, 27189, 17898, 48473, 38113, 35973, 45019, 47032, 40710, 59020, 52837, 54735, 15702, 1376, 27833, 29721, 23532, 41834, 35535, 37544, 64038, 49600, 10506, 12539, 6156, 32750, 18347, 44805, 46745, 40559, 58877, 52563, 54543, 15551, 1028, 27623, 29557, 23243, 41544, 45563, 43413, 33072, 63624, 53325, 52195, 9087, 6921, 29339, 27189, 17901, 48470, 38122, 35983, 43503, 45452, 39218, 57528, 51281, 54267, 15202, 852, 27277, 29229, 24024, 42334, 36091, 38044, 64530, 51188, 12094, 14031, 7736, 31194, 16799, 43313, 45229, 39003, 58313, 52071, 54079, 14980, 568, 28125, 53388, 51435, 57416, 39363, 45432, 43657, 16907, 31345, 5107, 2904, 9399, 56374, 62863, 60852, 34157, 48855, 22100, 20414, 26448, 161, 14579, 53320, 51674, 57659, 39584, 45571, 43645, 17379, 31554, 5311, 3080, 9619, 56581, 62846, 61137, 34384, 49071, 33281, 39522, 45788, 52054, 58303, 63509, 4236, 10426, 16739, 22979, 30262, 36528, 42773, 49010, 55292, 60442, 1232, 7457, 13782, 21047, 27257, 33499, 39750, 46005, 51252, 57497, 63722, 4449, 45544, 43423, 33030, 63649, 53336, 52197, 9045, 6938, 29326, 27185, 17885, 45563, 43413, 33072, 63627, 53337, 52194, 9086, 6925, 29343, 27172, 17916, 48397, 38076, 36048, 58404, 57274, 14133, 11998, 1639, 25073, 22940, 45345, 43192};
        private static long TuitionPaymentFragmentbindingInflater1 = -8888326126750422544L;
        private static int b = 1893566904;
        private static int asBinder = -1934795543;
        private static int g = 125143790;
        private static byte[] d = {-18, -51, -21, -8, -31, -34, -41, 36, -8, -13, -21, -8, -31, -2, -73, 52, -27, -28, -17, -16, -24, -1, -35, 22, 8, -92, -74, 22, -94, 13, 21, 34, -108, 80, 99, 48, -121, 63, -97, 51, 55, 87, 103, Base64.padSymbol, -116, -71, -101, -66, -78, -117, -67, -123, -118, -115, 106, -34, -71, -101, -81, -115, -121, -127, -66, 88, 6, 43, 47, 22, 44, 36, 23, 28, -9, 31, 16, 46, 76, -1, 111, 23, 28, 23, -28, 100, 20, 30, 34, 44, 7, 43, 39, -44, 92, 62, 4, 34, -26, -26, -26, -26, -26, -26};

        private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i4 = $11 + 123;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 2187 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 40 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 841711447, false, $$c(b2, b3, (byte) (b3 & 12)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentbindingInflater1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33016), 3012 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 26 - View.combineMeasuredStates(0, 0), 321985076, false, $$c(b4, b5, (byte) (b5 & 6)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 36505), 3377 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Process.getGidForName("") + 18, -968507904, false, $$c(b6, b7, (byte) (b7 & 9)), new Class[]{Object.class, Object.class});
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
                int i7 = $10 + 71;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    try {
                        Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36505), ((Process.getThreadPriority(0) + 20) >> 6) + 3376, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, -968507904, false, $$c(b8, b9, (byte) (b9 & 9)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        throw null;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36506 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 3375 - TextUtils.indexOf((CharSequence) "", '0', 0), View.combineMeasuredStates(0, 0) + 17, -968507904, false, $$c(b10, b11, (byte) (b11 & 9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr);
        }

        private static void e(int i, int i2, short s, int i3, byte b2, Object[] objArr) throws Throwable {
            long j;
            int i4;
            int i5;
            int i6 = 2;
            int i7 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(asBinder)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b3 = (byte) 0;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 2267 - TextUtils.indexOf("", "", 0, 0), TextUtils.getOffsetAfter("", 0) + 33, 1387473586, false, $$c(b3, (byte) (b3 - 1), (byte) $$a.length), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                boolean z = iIntValue == -1;
                long j2 = 0;
                if (z) {
                    byte[] bArr = d;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i8 = $11 + 61;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        int i10 = 0;
                        while (i10 < length) {
                            int i11 = $10 + 103;
                            $11 = i11 % 128;
                            if (i11 % i6 == 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = (byte) (b4 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionGroup(j2), Color.alpha(0) + 3358, (ViewConfiguration.getJumpTapTimeout() >> 16) + 18, -1054011043, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                i10 >>>= 1;
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr[i10])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = (byte) (b6 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 3358 - Color.blue(0), 17 - TextUtils.lastIndexOf("", '0', 0, 0), -1054011043, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                                i10++;
                            }
                            i6 = 2;
                            j2 = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i12 = $11 + 125;
                        $10 = i12 % 128;
                        if (i12 % 2 != 0) {
                            byte[] bArr3 = d;
                            try {
                                Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(b)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    byte b8 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33, 1387473586, false, $$c(b8, (byte) (b8 - 1), (byte) $$a.length), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                i5 = ((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) | 3046761265686732006L)) - ((int) (((long) asBinder) - 3046761265686732006L));
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            byte[] bArr4 = d;
                            Object[] objArr6 = {Integer.valueOf(i), Integer.valueOf(b)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b9 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (KeyEvent.getMaxKeyCode() >> 16), 2266 - MotionEvent.axisFromString(""), 33 - ((Process.getThreadPriority(0) + 20) >> 6), 1387473586, false, $$c(b9, (byte) (b9 - 1), (byte) $$a.length), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) asBinder) ^ 3046761265686732006L));
                        }
                        iIntValue = (byte) i5;
                        j = 3046761265686732006L;
                    } else {
                        j = 3046761265686732006L;
                        iIntValue = (short) (((short) (((long) f1207a[i + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) asBinder) ^ 3046761265686732006L)));
                    }
                } else {
                    j = 3046761265686732006L;
                }
                if (iIntValue > 0) {
                    int i13 = ((i + iIntValue) - 2) + ((int) (((long) b) ^ j));
                    if (z) {
                        int i14 = $10 + 73;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 + i4;
                    Object[] objArr7 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(g), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 55904), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2854, Process.getGidForName("") + 14, -1529949196, false, $$c(b10, b11, (byte) (b11 + 4)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr5 = d;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i16 = 0; i16 < length2; i16++) {
                            bArr6[i16] = (byte) (((long) bArr5[i16]) ^ 3046761265686732006L);
                        }
                        bArr5 = bArr6;
                    }
                    boolean z2 = bArr5 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i17 = $11 + 75;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        if (z2) {
                            byte[] bArr7 = d;
                            int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = f1207a;
                            int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        @Override // defpackage.readableMs
        public final /* synthetic */ Object apply(Object obj) throws Exception {
            int i = 2 % 2;
            isSamsungJ4 issamsungj4 = new isSamsungJ4(obj, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i2 = notify + 15;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return issamsungj4;
        }

        search(TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = timeUnit;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = appendbackupvideoprofile;
        }

        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2) {
            int edgeSlop;
            int i3;
            int i4;
            int i5;
            int i6;
            Class<?> cls;
            int i7;
            int i8;
            int iTuitionPaymentFragmentbindingInflater1;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14 = 2 % 2;
            int i15 = notify;
            int i16 = (i15 & 117) + (i15 | 117);
            asInterface = i16 % 128;
            if (i16 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (context != null) {
                try {
                    int i17 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    Object[] objArr = new Object[1];
                    c((i17 ^ 1) + ((i17 & 1) << 1), 31 - Color.argb(0, 0, 0, 0), (char) (35900 - (~(-ExpandableListView.getPackedPositionGroup(0L)))), objArr);
                    try {
                        Object[] objArr2 = {(String) objArr[0]};
                        int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                        Object[] objArr3 = new Object[1];
                        c(((scrollBarFadeDuration | 31) << 1) - (scrollBarFadeDuration ^ 31), 37 - (~(ViewConfiguration.getPressedStateDuration() >> 16)), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr3);
                        Object objNewInstance = Class.forName((String) objArr3[0]).getDeclaredConstructor(String.class).newInstance(objArr2);
                        int i18 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i19 = (i18 ^ 69) + ((i18 & 69) << 1);
                        int i20 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        Object[] objArr4 = new Object[1];
                        c(i19, (i20 ^ 31) + ((i20 & 31) << 1), (char) ((-2) - ((-((byte) KeyEvent.getModifierMetaStateMask())) ^ (-1))), objArr4);
                        try {
                            Object[] objArr5 = {(String) objArr4[0]};
                            int i21 = -TextUtils.lastIndexOf("", '0', 0);
                            int i22 = (i21 & 30) + (i21 | 30);
                            int i23 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentbindingInflater2 = zag.TuitionPaymentFragmentbindingInflater1();
                            int i24 = i23 * (-317);
                            int i25 = (i24 ^ 11803) + ((i24 & 11803) << 1);
                            int i26 = ~i23;
                            int i27 = i26 | (-38);
                            int i28 = ~((i27 ^ iTuitionPaymentFragmentbindingInflater2) | (i27 & iTuitionPaymentFragmentbindingInflater2));
                            int i29 = (~iTuitionPaymentFragmentbindingInflater2) | i23;
                            int i30 = i25 + (((~((i29 ^ 37) | (i29 & 37))) | i28) * (-318));
                            int i31 = (~(((-38) ^ i23) | ((-38) & i23))) | (~((i23 ^ iTuitionPaymentFragmentbindingInflater2) | (i23 & iTuitionPaymentFragmentbindingInflater2)));
                            int i32 = notify + 31;
                            asInterface = i32 % 128;
                            int i33 = i32 % 2;
                            int i34 = (-318) * i31;
                            int i35 = (((i30 & i34) + (i34 | i30)) - (~(-(-(((-38) | (~(i26 | iTuitionPaymentFragmentbindingInflater2))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1;
                            Object[] objArr6 = new Object[1];
                            c(i22, i35, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr6);
                            Class<?> cls2 = Class.forName((String) objArr6[0]);
                            Class<?>[] clsArr = new Class[1];
                            int i36 = notify;
                            int i37 = ((i36 | 113) << 1) - (i36 ^ 113);
                            asInterface = i37 % 128;
                            int i38 = i37 % 2;
                            clsArr[0] = String.class;
                            Object objNewInstance2 = cls2.getDeclaredConstructor(clsArr).newInstance(objArr5);
                            try {
                                int i39 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                int i40 = (i39 * (-919)) - (-957215858);
                                int i41 = ~i39;
                                int i42 = ~((i41 ^ (-59714211)) | (i41 & (-59714211)) | i);
                                int i43 = ~i;
                                int i44 = ((-59714211) ^ i43) | ((-59714211) & i43);
                                int i45 = -(-((i42 | (~((i44 ^ i39) | (i44 & i39)))) * 920));
                                int i46 = ((i40 | i45) << 1) - (i40 ^ i45);
                                int i47 = ~((i41 ^ (-59714211)) | (i41 & (-59714211)));
                                int i48 = ~i39;
                                int i49 = ~i;
                                int i50 = ~(i48 | i49);
                                int i51 = (i46 - (~(-(-(((i47 ^ i50) | (i50 & i47)) * 920))))) - 1;
                                int i52 = (i48 ^ (-59714211)) | (i48 & (-59714211));
                                int i53 = (59714210 & i41) | (i41 ^ 59714210);
                                int i54 = (~((i52 & i43) | (i52 ^ i43))) | (~((i53 & i) | (i53 ^ i)));
                                int i55 = i39 | (-59714211);
                                int i56 = ~((i55 & i) | (i55 ^ i));
                                int i57 = (i51 - (~(-(-(((i56 & i54) | (i54 ^ i56)) * 920))))) - 1;
                                int i58 = -(-Process.getGidForName(""));
                                int i59 = (i58 ^ 1948723802) + ((i58 & 1948723802) << 1);
                                int trimmedLength = TextUtils.getTrimmedLength("");
                                int i60 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                Object[] objArr7 = new Object[1];
                                e(i57, i59, (short) (((trimmedLength | (-18)) << 1) - (trimmedLength ^ (-18))), (i60 & 8) + (i60 | 8), (byte) (9 - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr7);
                                Class<?> cls3 = Class.forName((String) objArr7[0]);
                                int i61 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int iTuitionPaymentFragmentbindingInflater3 = zag.TuitionPaymentFragmentbindingInflater1();
                                int i62 = i61 * 46;
                                int i63 = ((i62 | 4554) << 1) - (i62 ^ 4554);
                                int i64 = ~iTuitionPaymentFragmentbindingInflater3;
                                int i65 = i63 + (((~((i64 & (-100)) | ((-100) ^ i64))) | i61) * (-90));
                                int i66 = ~(((-100) ^ iTuitionPaymentFragmentbindingInflater3) | ((-100) & iTuitionPaymentFragmentbindingInflater3));
                                int i67 = ~(i61 | 99);
                                int i68 = ((i66 ^ i67) | (i66 & i67)) * (-45);
                                int i69 = (i65 & i68) + (i68 | i65);
                                int i70 = ~((~i61) | iTuitionPaymentFragmentbindingInflater3);
                                int i71 = (i70 & (-100)) | ((-100) ^ i70);
                                int i72 = ~iTuitionPaymentFragmentbindingInflater3;
                                int i73 = ~((i61 & i72) | (i72 ^ i61));
                                int i74 = i69 + (((i73 & i71) | (i71 ^ i73)) * 45);
                                int i75 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int i76 = i75 * (-51);
                                int i77 = ((i76 | TypedValues.Custom.TYPE_FLOAT) << 1) - (i76 ^ TypedValues.Custom.TYPE_FLOAT);
                                int i78 = (i49 ^ i75) | (i49 & i75);
                                int i79 = (~((i78 & 17) | (i78 ^ 17))) * 52;
                                int i80 = (i77 & i79) + (i79 | i77);
                                int i81 = ~(((-18) ^ i49) | ((-18) & i49));
                                int i82 = ~(((-18) ^ i75) | ((-18) & i75));
                                int i83 = (i81 ^ i82) | (i82 & i81);
                                int i84 = ~(i43 | i75);
                                int i85 = (i80 - (~(((i83 ^ i84) | (i83 & i84)) * (-52)))) - 1;
                                int i86 = ~i75;
                                Object[] objArr8 = new Object[1];
                                c(i74, i85 + (((~((i86 & 17) | (i86 ^ 17))) | (~(i86 | i43))) * 52), (char) TextUtils.getTrimmedLength(""), objArr8);
                                Object objInvoke = cls3.getMethod((String) objArr8[0], null).invoke(context, null);
                                try {
                                    int edgeSlop2 = ViewConfiguration.getEdgeSlop() >> 16;
                                    int i87 = ((edgeSlop2 | 59714210) << 1) - (edgeSlop2 ^ 59714210);
                                    int i88 = -TextUtils.getOffsetBefore("", 0);
                                    int i89 = ((i88 | 1948723801) << 1) - (i88 ^ 1948723801);
                                    short s = (short) ((-19) - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))));
                                    int i90 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i91 = (i90 & 8) + (i90 | 8);
                                    int i92 = -TextUtils.indexOf("", "");
                                    int iTuitionPaymentFragmentbindingInflater4 = zag.TuitionPaymentFragmentbindingInflater1();
                                    int i93 = i92 * 677;
                                    int i94 = (i93 & (-6750)) + (i93 | (-6750));
                                    int i95 = ((i92 ^ iTuitionPaymentFragmentbindingInflater4) | (i92 & iTuitionPaymentFragmentbindingInflater4) | (-11)) * (-676);
                                    int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                                    int i97 = ~((-11) | i92);
                                    int i98 = ~iTuitionPaymentFragmentbindingInflater4;
                                    int i99 = ~((i98 ^ i92) | (i98 & i92));
                                    int i100 = (i96 - (~(-(-(((i97 ^ i99) | (i97 & i99)) * 676))))) - 1;
                                    int i101 = ~i92;
                                    int i102 = (~((i101 & (-11)) | (i101 ^ (-11)))) | (~((-11) | (~iTuitionPaymentFragmentbindingInflater4)));
                                    int i103 = (i92 & 10) | (i92 ^ 10);
                                    int i104 = ~((i103 & iTuitionPaymentFragmentbindingInflater4) | (i103 ^ iTuitionPaymentFragmentbindingInflater4));
                                    int i105 = ((i104 & i102) | (i102 ^ i104)) * 676;
                                    Object[] objArr9 = new Object[1];
                                    e(i87, i89, s, i91, (byte) ((i100 ^ i105) + ((i100 & i105) << 1)), objArr9);
                                    Class<?> cls4 = Class.forName((String) objArr9[0]);
                                    int capsMode = TextUtils.getCapsMode("", 0, 0);
                                    int iTuitionPaymentFragmentbindingInflater5 = zag.TuitionPaymentFragmentbindingInflater1();
                                    int i106 = capsMode * (-432);
                                    int i107 = (i106 ^ 50778) + ((i106 & 50778) << 1);
                                    int i108 = ~capsMode;
                                    int i109 = ~iTuitionPaymentFragmentbindingInflater5;
                                    int i110 = (i108 ^ i109) | (i108 & i109);
                                    int i111 = (i107 - (~((~((i110 & 117) | (i110 ^ 117))) * 433))) - 1;
                                    int i112 = ~capsMode;
                                    int i113 = ~((-118) | iTuitionPaymentFragmentbindingInflater5);
                                    int i114 = ((i112 ^ i113) | (i113 & i112)) * (-433);
                                    int i115 = ~((iTuitionPaymentFragmentbindingInflater5 & i112) | (i112 ^ iTuitionPaymentFragmentbindingInflater5));
                                    int i116 = ~((capsMode & 117) | (capsMode ^ 117));
                                    int i117 = (i111 ^ i114) + ((i111 & i114) << 1) + (((i115 & i116) | (i115 ^ i116)) * 433);
                                    int i118 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                                    Object[] objArr10 = new Object[1];
                                    c(i117, ((i118 | 15) << 1) - (i118 ^ 15), (char) ((bitsPerPixel & 1) + (bitsPerPixel | 1)), objArr10);
                                    Object objInvoke2 = cls4.getMethod((String) objArr10[0], null).invoke(context, null);
                                    int i119 = notify + 113;
                                    asInterface = i119 % 128;
                                    int i120 = i119 % 2;
                                    try {
                                        Object[] objArr11 = {objInvoke2, 64};
                                        int i121 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                        Object[] objArr12 = new Object[1];
                                        c(((i121 | 131) << 1) - (i121 ^ 131), 32 - (~(-TextUtils.indexOf("", "", 0))), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7718), objArr12);
                                        Class<?> cls5 = Class.forName((String) objArr12[0]);
                                        int threadPriority = Process.getThreadPriority(0);
                                        int i122 = -(((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6);
                                        int iTuitionPaymentFragmentbindingInflater6 = zag.TuitionPaymentFragmentbindingInflater1();
                                        int i123 = i122 * 980;
                                        int i124 = (i123 ^ (-160392)) + ((i123 & (-160392)) << 1);
                                        int i125 = ~iTuitionPaymentFragmentbindingInflater6;
                                        int i126 = i124 + ((~((-165) | i125)) * 979);
                                        int i127 = ((i122 ^ iTuitionPaymentFragmentbindingInflater6) | (i122 & iTuitionPaymentFragmentbindingInflater6)) * (-979);
                                        int i128 = ~(iTuitionPaymentFragmentbindingInflater6 | (-165));
                                        int i129 = ~((i122 & i125) | (i125 ^ i122));
                                        Object[] objArr13 = new Object[1];
                                        c((i126 & i127) + (i126 | i127) + (((i129 & i128) | (i128 ^ i129)) * 979), 13 - (~(ViewConfiguration.getScrollBarSize() >> 8)), (char) Color.alpha(0), objArr13);
                                        Object objInvoke3 = cls5.getMethod((String) objArr13[0], String.class, Integer.TYPE).invoke(objInvoke, objArr11);
                                        int i130 = -View.resolveSize(0, 0);
                                        int i131 = ((i130 | 178) << 1) - (i130 ^ 178);
                                        int i132 = 29 - (~View.MeasureSpec.getMode(0));
                                        int i133 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                        Object[] objArr14 = new Object[1];
                                        c(i131, i132, (char) (((i133 | 6162) << 1) - (i133 ^ 6162)), objArr14);
                                        Class<?> cls6 = Class.forName((String) objArr14[0]);
                                        int i134 = -KeyEvent.getDeadChar(0, 0);
                                        int i135 = notify;
                                        int i136 = (i135 ^ 103) + ((i135 & 103) << 1);
                                        asInterface = i136 % 128;
                                        int i137 = i136 % 2;
                                        int i138 = 69 * i134;
                                        int i139 = (i138 & 294113752) + (294113752 | i138);
                                        int i140 = ~i134;
                                        int i141 = (-59714233) | i140;
                                        int i142 = ~((i141 & i43) | (i141 ^ i43));
                                        int i143 = ~((i134 & 59714232) | (i134 ^ 59714232));
                                        int i144 = (i143 & i142) | (i142 ^ i143);
                                        int i145 = ~(59714232 | i);
                                        int i146 = ((i144 & i145) | (i144 ^ i145)) * (-68);
                                        int i147 = (((i139 & i146) + (i146 | i139)) - (~((~((i140 | i43) | 59714232)) * (-68)))) - 1;
                                        zag.TuitionPaymentFragmentbindingInflater1();
                                        zag.TuitionPaymentFragmentbindingInflater1();
                                        int i148 = ~(((-59714233) & i43) | ((-59714233) ^ i43));
                                        int i149 = -(-(68 * ((i148 & i140) | (i140 ^ i148))));
                                        int i150 = ((i147 | i149) << 1) - (i149 ^ i147);
                                        int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                        int i151 = (fadingEdgeLength * 881) - 1161233861;
                                        int i152 = ~fadingEdgeLength;
                                        int i153 = ~((-1948723820) | i152);
                                        int i154 = ~((i152 ^ i) | (i152 & i));
                                        int i155 = (i153 & i154) | (i153 ^ i154);
                                        int i156 = ~(((-1948723820) & i) | ((-1948723820) ^ i));
                                        int i157 = ((i155 & i156) | (i155 ^ i156)) * (-880);
                                        int i158 = (i151 ^ i157) + ((i151 & i157) << 1);
                                        int i159 = ~((i152 ^ i49) | (i152 & i49));
                                        int i160 = (i159 & 1948723819) | (i159 ^ 1948723819);
                                        int i161 = ~((fadingEdgeLength & i) | (fadingEdgeLength ^ i));
                                        int i162 = (i158 - (~(-(-(((i160 & i161) | (i160 ^ i161)) * (-880)))))) - 1;
                                        int i163 = -(-(i161 * 880));
                                        int i164 = (i162 ^ i163) + ((i163 & i162) << 1);
                                        short s2 = (short) (105 - (~(-(-TextUtils.indexOf((CharSequence) "", '0', 0, 0)))));
                                        int iIndexOf = (-5) - TextUtils.indexOf("", "", 0, 0);
                                        int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                        int i165 = notify + 35;
                                        asInterface = i165 % 128;
                                        int i166 = i165 % 2;
                                        int i167 = ~minimumFlingVelocity;
                                        int i168 = ~((i167 ^ 85) | (i167 & 85) | i);
                                        int i169 = (85 ^ i49) | (85 & i49);
                                        int i170 = ~((i169 ^ minimumFlingVelocity) | (i169 & minimumFlingVelocity));
                                        int i171 = ((minimumFlingVelocity * (-919)) - (-79034)) + (((i168 ^ i170) | (i168 & i170)) * 920);
                                        int i172 = ~(i167 | 85);
                                        int i173 = ~minimumFlingVelocity;
                                        int i174 = i171 + ((i172 | (~((i173 ^ i43) | (i173 & i43)))) * 920);
                                        zag.TuitionPaymentFragmentbindingInflater1();
                                        int i175 = (i167 & 85) | (i167 ^ 85);
                                        int i176 = ~((i175 & i49) | (i175 ^ i49));
                                        int i177 = (i173 & (-86)) | (i173 ^ (-86));
                                        int i178 = ~((i177 & i) | (i177 ^ i));
                                        int i179 = (i178 & i176) | (i176 ^ i178);
                                        int i180 = ~((minimumFlingVelocity & 85) | (85 ^ minimumFlingVelocity) | i);
                                        int i181 = 920 * ((i179 & i180) | (i179 ^ i180));
                                        byte b2 = (byte) ((i174 & i181) + (i174 | i181));
                                        Object[] objArr15 = new Object[1];
                                        e(i150, i164, s2, iIndexOf, b2, objArr15);
                                        Object[] objArr16 = (Object[]) cls6.getField((String) objArr15[0]).get(objInvoke3);
                                        int length = objArr16.length;
                                        int i182 = 0;
                                        while (i182 < length) {
                                            Object obj2 = objArr16[i182];
                                            int fadingEdgeLength2 = ViewConfiguration.getFadingEdgeLength() >> 16;
                                            int iTuitionPaymentFragmentbindingInflater7 = zag.TuitionPaymentFragmentbindingInflater1();
                                            int i183 = ~iTuitionPaymentFragmentbindingInflater7;
                                            int i184 = ~((i183 & (-59714242)) | ((-59714242) ^ i183));
                                            int i185 = ((-59714242) ^ fadingEdgeLength2) | ((-59714242) & fadingEdgeLength2);
                                            int i186 = ~i185;
                                            int i187 = (i184 ^ i186) | (i184 & i186);
                                            int i188 = notify + 27;
                                            Object[] objArr17 = objArr16;
                                            asInterface = i188 % 128;
                                            int i189 = i188 % 2;
                                            int i190 = ~iTuitionPaymentFragmentbindingInflater7;
                                            int i191 = ~((i190 & fadingEdgeLength2) | (i190 ^ fadingEdgeLength2));
                                            int i192 = ((fadingEdgeLength2 * 465) - 1877889807) + (464 * ((i191 & i187) | (i187 ^ i191)));
                                            int i193 = ~fadingEdgeLength2;
                                            int i194 = (i193 & iTuitionPaymentFragmentbindingInflater7) | (iTuitionPaymentFragmentbindingInflater7 ^ i193);
                                            int i195 = ((i194 & (-59714242)) | (i194 ^ (-59714242))) * (-464);
                                            int i196 = (i192 & i195) + (i195 | i192);
                                            int i197 = ~i185;
                                            int i198 = ~((fadingEdgeLength2 & iTuitionPaymentFragmentbindingInflater7) | (fadingEdgeLength2 ^ iTuitionPaymentFragmentbindingInflater7));
                                            int i199 = ((i197 & i198) | (i197 ^ i198)) * 464;
                                            int i200 = (i196 ^ i199) + ((i199 & i196) << 1);
                                            int i201 = -TextUtils.indexOf((CharSequence) "", '0');
                                            int i202 = (i201 & 1948723791) + (i201 | 1948723791);
                                            int i203 = -View.resolveSize(0, 0);
                                            int i204 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            Object[] objArr18 = new Object[1];
                                            e(i200, i202, (short) (((i203 | (-21)) << 1) - (i203 ^ (-21))), ((i204 | (-10)) << 1) - (i204 ^ (-10)), (byte) ((-90) - View.resolveSize(0, 0)), objArr18);
                                            String str = (String) objArr18[0];
                                            int i205 = notify;
                                            int i206 = (i205 ^ 27) + ((i205 & 27) << 1);
                                            asInterface = i206 % 128;
                                            int i207 = i206 % 2;
                                            try {
                                                Object[] objArr19 = {str};
                                                int i208 = -(-Color.rgb(0, 0, 0));
                                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 38;
                                                int i209 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                Object[] objArr20 = new Object[1];
                                                c((i208 & 16777424) + (i208 | 16777424), iIndexOf2, (char) ((i209 ^ 24954) + ((i209 & 24954) << 1)), objArr20);
                                                Class<?> cls7 = Class.forName((String) objArr20[0]);
                                                int i210 = asInterface;
                                                int i211 = ((i210 | 1) << 1) - (i210 ^ 1);
                                                notify = i211 % 128;
                                                if (i211 % 2 == 0) {
                                                    int scrollBarSize = 59714245 << (ViewConfiguration.getScrollBarSize() * 26);
                                                    int i212 = 1948723806 << (ExpandableListView.getPackedPositionForChild(1, 1) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 0L ? 0 : -1));
                                                    edgeSlop = ViewConfiguration.getEdgeSlop();
                                                    i3 = 82;
                                                    i6 = 35;
                                                    i4 = scrollBarSize;
                                                    i5 = i212;
                                                } else {
                                                    int i213 = 59714244 - (~(ViewConfiguration.getScrollBarSize() >> 8));
                                                    int i214 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                    int i215 = (i214 | 1948723806) + (i214 & 1948723806);
                                                    edgeSlop = ViewConfiguration.getEdgeSlop();
                                                    i3 = -32;
                                                    i4 = i213;
                                                    i5 = i215;
                                                    i6 = 16;
                                                }
                                                int i216 = edgeSlop >> i6;
                                                int i217 = (i216 * 306) + TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS;
                                                int i218 = notify;
                                                int i219 = (i218 ^ 23) + ((i218 & 23) << 1);
                                                asInterface = i219 % 128;
                                                int i220 = i219 % 2;
                                                int i221 = -(-(306 * i3));
                                                int i222 = (i217 & i221) + (i217 | i221);
                                                int i223 = ~((i216 ^ i3) | (i216 & i3));
                                                int i224 = ~((i216 ^ i) | (i216 & i));
                                                int i225 = i222 + (((i223 ^ i224) | (i223 & i224)) * 305);
                                                int i226 = ~i3;
                                                int i227 = ~((i216 & i49) | (i49 ^ i216));
                                                short s3 = (short) ((i225 - (~(((i227 & i226) | (i226 ^ i227)) * 305))) - 1);
                                                int i228 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                int i229 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                Object[] objArr21 = new Object[1];
                                                e(i4, i5, s3, ((i228 | (-4)) << 1) - (i228 ^ (-4)), (byte) ((i229 & (-77)) + (i229 | (-77))), objArr21);
                                                Object objInvoke4 = cls7.getMethod((String) objArr21[0], String.class).invoke(null, objArr19);
                                                try {
                                                    int i230 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                    int iTuitionPaymentFragmentbindingInflater8 = zag.TuitionPaymentFragmentbindingInflater1();
                                                    int i231 = i230 * (-755);
                                                    int i232 = (i231 ^ (-184975)) + ((i231 & (-184975)) << 1);
                                                    int i233 = ~i230;
                                                    int i234 = -(-((~((i233 & (-246)) | (i233 ^ (-246)))) * 1512));
                                                    int i235 = (i232 & i234) + (i232 | i234);
                                                    int i236 = ~i230;
                                                    int i237 = ~((i236 ^ (-246)) | (i236 & (-246)));
                                                    int i238 = length;
                                                    int i239 = (i230 & 245) | (i230 ^ 245);
                                                    int i240 = ~((i239 & iTuitionPaymentFragmentbindingInflater8) | (i239 ^ iTuitionPaymentFragmentbindingInflater8));
                                                    int i241 = (i235 - (~(((i240 & i237) | (i237 ^ i240)) * (-756)))) - 1;
                                                    int i242 = i230 | 245;
                                                    int i243 = ~iTuitionPaymentFragmentbindingInflater8;
                                                    int i244 = i241 + (((i242 & i243) | (i242 ^ i243)) * 756);
                                                    int i245 = -(-TextUtils.getCapsMode("", 0, 0));
                                                    int i246 = ((i245 | 28) << 1) - (i245 ^ 28);
                                                    int i247 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                    Object[] objArr22 = new Object[1];
                                                    c(i244, i246, (char) ((i247 & 13309) + (i247 | 13309)), objArr22);
                                                    Class<?> cls8 = Class.forName((String) objArr22[0]);
                                                    Object[] objArr23 = new Object[1];
                                                    c(273 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 11 - KeyEvent.getDeadChar(0, 0), (char) (0 - (~(-(-TextUtils.indexOf((CharSequence) "", '0'))))), objArr23);
                                                    try {
                                                        Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls8.getMethod((String) objArr23[0], null).invoke(obj2, null))};
                                                        int i248 = -MotionEvent.axisFromString("");
                                                        int i249 = ((i248 | 207) << 1) - (i248 ^ 207);
                                                        int edgeSlop3 = ViewConfiguration.getEdgeSlop();
                                                        int i250 = notify + 55;
                                                        asInterface = i250 % 128;
                                                        int i251 = edgeSlop3 >> 16;
                                                        if (i250 % 2 != 0) {
                                                            Object[] objArr25 = new Object[1];
                                                            c(i249, 37 >> i251, (char) (1492 >> View.resolveSizeAndState(1, 0, 0)), objArr25);
                                                            cls = Class.forName((String) objArr25[0]);
                                                            i7 = 1;
                                                            i8 = 1;
                                                        } else {
                                                            int i252 = -i251;
                                                            int i253 = ((i252 | 37) << 1) - (i252 ^ 37);
                                                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                                            char c = (char) ((iResolveSizeAndState ^ 24954) + ((iResolveSizeAndState & 24954) << 1));
                                                            Object[] objArr26 = new Object[1];
                                                            c(i249, i253, c, objArr26);
                                                            cls = Class.forName((String) objArr26[0]);
                                                            i7 = 0;
                                                            i8 = 0;
                                                        }
                                                        int i254 = (ExpandableListView.getPackedPositionForChild(i7, i8) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i7, i8) == 0L ? 0 : -1));
                                                        int i255 = ((59714256 | i254) << 1) - (i254 ^ 59714256);
                                                        int bitsPerPixel2 = 1948723806 - ImageFormat.getBitsPerPixel(0);
                                                        int iMyTid = Process.myTid() >> 22;
                                                        int i256 = notify;
                                                        int i257 = (i256 & 21) + (i256 | 21);
                                                        asInterface = i257 % 128;
                                                        if (i257 % 2 != 0) {
                                                            iTuitionPaymentFragmentbindingInflater1 = zag.TuitionPaymentFragmentbindingInflater1();
                                                            i9 = (784 % iMyTid) - 1;
                                                        } else {
                                                            iTuitionPaymentFragmentbindingInflater1 = zag.TuitionPaymentFragmentbindingInflater1();
                                                            i9 = (iMyTid * 784) + 78200;
                                                        }
                                                        int i258 = i9 - 77517;
                                                        int i259 = ~iMyTid;
                                                        int i260 = ~iTuitionPaymentFragmentbindingInflater1;
                                                        int i261 = (i259 & i260) | (i259 ^ i260);
                                                        int i262 = -(-((~((i261 & (-100)) | (i261 ^ (-100)))) * (-783)));
                                                        int i263 = (i258 & i262) + (i258 | i262);
                                                        int i264 = asInterface;
                                                        int i265 = (i264 ^ 55) + ((i264 & 55) << 1);
                                                        notify = i265 % 128;
                                                        int i266 = i265 % 2;
                                                        int i267 = ~iMyTid;
                                                        int i268 = ~((i260 & (-100)) | (i260 ^ (-100)));
                                                        int i269 = 783 * ((i267 & i268) | (i267 ^ i268));
                                                        short s4 = (short) (((i263 | i269) << 1) - (i269 ^ i263));
                                                        int i270 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                        int i271 = ((i270 | 4) << 1) - (i270 ^ 4);
                                                        int i272 = -(ViewConfiguration.getEdgeSlop() >> 16);
                                                        Object[] objArr27 = new Object[1];
                                                        e(i255, bitsPerPixel2, s4, i271, (byte) (((i272 | 10) << 1) - (i272 ^ 10)), objArr27);
                                                        Object objInvoke5 = cls.getMethod((String) objArr27[0], InputStream.class).invoke(objInvoke4, objArr24);
                                                        try {
                                                            int i273 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                                            int i274 = (i273 ^ 59714274) + ((i273 & 59714274) << 1);
                                                            int iRgb = Color.rgb(0, 0, 0) + 1965501026;
                                                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                                                            int i275 = asInterface + 69;
                                                            int i276 = i275 % 128;
                                                            notify = i276;
                                                            if (i275 % 2 == 0) {
                                                                i10 = 387440 * iMakeMeasureSpec;
                                                                int i277 = ~iMakeMeasureSpec;
                                                                int i278 = ~((i ^ (-94)) | (i & (-94)));
                                                                i11 = (-465) % ((i277 & i278) | (i277 ^ i278));
                                                            } else {
                                                                int i279 = iMakeMeasureSpec * (-464);
                                                                i10 = ((i279 | 87326) << 1) - (i279 ^ 87326);
                                                                int i280 = ~iMakeMeasureSpec;
                                                                int i281 = ~((i ^ (-94)) | (i & (-94)));
                                                                i11 = ((i280 & i281) | (i280 ^ i281)) * (-465);
                                                            }
                                                            int i282 = (i10 - (~i11)) - 1;
                                                            int i283 = ~iMakeMeasureSpec;
                                                            int i284 = ~((i283 ^ i) | (i283 & i));
                                                            int i285 = ((i282 + (((i284 & (-94)) | ((-94) ^ i284)) * 930)) - (~((i283 | (((-94) ^ i) | ((-94) & i))) * 465))) - 1;
                                                            int i286 = (i276 ^ 3) + ((i276 & 3) << 1);
                                                            asInterface = i286 % 128;
                                                            int i287 = i286 % 2;
                                                            short s5 = (short) i285;
                                                            int i288 = 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                                            int threadPriority2 = Process.getThreadPriority(0);
                                                            int i289 = -(((threadPriority2 ^ 20) + ((threadPriority2 & 20) << 1)) >> 6);
                                                            Object[] objArr28 = new Object[1];
                                                            e(i274, iRgb, s5, i288, (byte) ((i289 & (-111)) + (i289 | (-111))), objArr28);
                                                            Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                            int iAlpha = Color.alpha(0);
                                                            int i290 = (iAlpha * 273) - 76964;
                                                            int i291 = ~iAlpha;
                                                            int i292 = ~((i291 ^ (-285)) | (i291 & (-285)) | i43);
                                                            int i293 = iAlpha | 284;
                                                            int i294 = ~((i293 ^ i) | (i293 & i));
                                                            int i295 = -(-(((i292 ^ i294) | (i292 & i294)) * (-272)));
                                                            int i296 = (i290 & i295) + (i290 | i295);
                                                            int i297 = ~((i291 ^ 284) | (i291 & 284));
                                                            int i298 = ~iAlpha;
                                                            int i299 = ~((i298 & i) | (i298 ^ i));
                                                            int i300 = i296 + (((i297 & i299) | (i297 ^ i299)) * (-272));
                                                            int i301 = ~((iAlpha ^ i) | (iAlpha & i));
                                                            int i302 = -(-(((i301 & 284) | (i301 ^ 284)) * 272));
                                                            int i303 = (i300 & i302) + (i302 | i300);
                                                            int i304 = asInterface + 125;
                                                            notify = i304 % 128;
                                                            int i305 = i304 % 2;
                                                            Object[] objArr29 = new Object[1];
                                                            c(i303, 23 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr29);
                                                            if (!objNewInstance.equals(cls9.getMethod((String) objArr29[0], null).invoke(objInvoke5, null))) {
                                                                int i306 = notify;
                                                                int i307 = ((i306 | 21) << 1) - (i306 ^ 21);
                                                                int i308 = i307 % 128;
                                                                asInterface = i308;
                                                                int i309 = i307 % 2;
                                                                int i310 = (i308 & 9) + (i308 | 9);
                                                                notify = i310 % 128;
                                                                int i311 = i310 % 2;
                                                                try {
                                                                    int i312 = 59714271 - (~(-TextUtils.lastIndexOf("", '0', 0, 0)));
                                                                    int i313 = 1948723808 - (~(-TextUtils.indexOf((CharSequence) "", '0')));
                                                                    int i314 = -View.combineMeasuredStates(0, 0);
                                                                    int i315 = (i314 * (-575)) + 54050;
                                                                    int i316 = ~i314;
                                                                    int i317 = ~(i316 | 93);
                                                                    int i318 = ~((93 ^ i) | (93 & i));
                                                                    int i319 = ((i317 ^ i318) | (i317 & i318)) * 576;
                                                                    int i320 = (i315 & i319) + (i315 | i319);
                                                                    int i321 = ~((i316 ^ (-94)) | (i316 & (-94)));
                                                                    int i322 = asInterface + 121;
                                                                    notify = i322 % 128;
                                                                    int i323 = i322 % 2;
                                                                    int i324 = 93 | i49;
                                                                    int i325 = ~((i314 & i324) | (i324 ^ i314));
                                                                    int i326 = -(-(576 * ((i325 & i321) | (i321 ^ i325))));
                                                                    int i327 = ((i320 | i326) << 1) - (i326 ^ i320);
                                                                    int i328 = (~(i316 | 93)) * 576;
                                                                    short s6 = (short) ((i327 & i328) + (i328 | i327));
                                                                    byte modifierMetaStateMask = (byte) KeyEvent.getModifierMetaStateMask();
                                                                    int i329 = notify;
                                                                    int i330 = i329 + 51;
                                                                    asInterface = i330 % 128;
                                                                    int i331 = i330 % 2;
                                                                    int i332 = (TypedValues.Custom.TYPE_DIMENSION * modifierMetaStateMask) - 18060;
                                                                    int i333 = ~((~modifierMetaStateMask) | i);
                                                                    int i334 = ~((i43 ^ 20) | (i43 & 20));
                                                                    int i335 = -(-(((i333 & i334) | (i333 ^ i334)) * (-1808)));
                                                                    int i336 = ((i332 | i335) << 1) - (i332 ^ i335);
                                                                    int i337 = ~modifierMetaStateMask;
                                                                    int i338 = i337 | (-21);
                                                                    int i339 = ~((i338 & i) | (i338 ^ i));
                                                                    int i340 = (i329 & 73) + (i329 | 73);
                                                                    asInterface = i340 % 128;
                                                                    int i341 = i340 % 2;
                                                                    int i342 = i49 | modifierMetaStateMask;
                                                                    int i343 = ~((i342 & 20) | (i342 ^ 20));
                                                                    int i344 = TypedValues.Custom.TYPE_BOOLEAN * ((i343 & i339) | (i339 ^ i343));
                                                                    int i345 = (~((i337 & 20) | (i337 ^ 20))) | (~(((-21) & i) | ((-21) ^ i)));
                                                                    int i346 = ~((modifierMetaStateMask & i49) | (i49 ^ modifierMetaStateMask));
                                                                    int i347 = (i336 ^ i344) + ((i344 & i336) << 1) + (((i346 & i345) | (i345 ^ i346)) * TypedValues.Custom.TYPE_BOOLEAN);
                                                                    int i348 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                                                    Object[] objArr30 = new Object[1];
                                                                    e(i312, i313, s6, i347, (byte) ((i348 ^ (-112)) + ((i348 & (-112)) << 1)), objArr30);
                                                                    Class<?> cls10 = Class.forName((String) objArr30[0]);
                                                                    int keyRepeatDelay = 284 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                                    int deadChar = KeyEvent.getDeadChar(0, 0);
                                                                    int i349 = (deadChar * (-501)) + 11569;
                                                                    int i350 = ~(((-24) ^ i) | ((-24) & i));
                                                                    int i351 = ~((deadChar ^ 23) | (deadChar & 23));
                                                                    int i352 = ((i350 ^ i351) | (i350 & i351)) * (-502);
                                                                    int i353 = ((i349 | i352) << 1) - (i349 ^ i352);
                                                                    int i354 = ((-24) ^ i49) | ((-24) & i49);
                                                                    int i355 = i353 + ((~((i354 & deadChar) | (i354 ^ deadChar))) * (-502));
                                                                    int i356 = ~deadChar;
                                                                    int i357 = ~((i356 & i) | (i356 ^ i));
                                                                    int i358 = -(-(((i357 & (-24)) | ((-24) ^ i357)) * TypedValues.PositionType.TYPE_DRAWPATH));
                                                                    Object[] objArr31 = new Object[1];
                                                                    c(keyRepeatDelay, (i355 & i358) + (i358 | i355), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr31);
                                                                    if (!objNewInstance2.equals(cls10.getMethod((String) objArr31[0], null).invoke(objInvoke5, null))) {
                                                                        i182 = (i182 & 1) + (i182 | 1);
                                                                        objArr16 = objArr17;
                                                                        length = i238;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            Object[] objArr32 = {new int[]{i}, new int[1], new int[]{(i & (-2)) | (i49 & 1)}, null};
                                                            int i359 = ~((int) Process.getStartUptimeMillis());
                                                            int i360 = (((-942559356) + (((~((-46268493) | i359)) | 86578721) * (-828))) + ((i359 | (-46268493)) * (-828))) - 344394288;
                                                            int i361 = (i360 & 16) + (16 | i360);
                                                            int i362 = (i2 & i361) + (i2 | i361);
                                                            int i363 = i362 << 13;
                                                            int i364 = (i363 & (~i362)) | ((~i363) & i362);
                                                            int i365 = i364 ^ (i364 >>> 17);
                                                            ((int[]) objArr32[1])[0] = i365 ^ (i365 << 5);
                                                            return objArr32;
                                                        } catch (Throwable th2) {
                                                            Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    } catch (Throwable th3) {
                                                        Throwable cause3 = th3.getCause();
                                                        if (cause3 != null) {
                                                            throw cause3;
                                                        }
                                                        throw th3;
                                                    }
                                                } catch (Throwable th4) {
                                                    Throwable cause4 = th4.getCause();
                                                    if (cause4 != null) {
                                                        throw cause4;
                                                    }
                                                    throw th4;
                                                }
                                            } catch (Throwable th5) {
                                                Throwable cause5 = th5.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th5;
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        Throwable cause6 = th6.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th6;
                                    }
                                } catch (Throwable th7) {
                                    Throwable cause7 = th7.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th7;
                                }
                            } catch (Throwable th8) {
                                Throwable cause8 = th8.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th8;
                            }
                        } catch (Throwable th9) {
                            Throwable cause9 = th9.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th9;
                        }
                    } catch (Throwable th10) {
                        Throwable cause10 = th10.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th10;
                    }
                } catch (Throwable unused) {
                }
            }
            int i366 = asInterface;
            int i367 = (i366 & 63) + (i366 | 63);
            notify = i367 % 128;
            int i368 = i367 % 2;
            Object[] objArr33 = {new int[]{i}, new int[1], new int[]{i}, null};
            int iMyUid = Process.myUid();
            int i369 = (-1221226556) + ((~(iMyUid | 951787959)) * 216);
            int i370 = ~iMyUid;
            int i371 = i369 + ((1056910327 | i370) * (-216)) + (((~(i370 | 951787959)) | (-911477731)) * 216);
            int i372 = asInterface;
            int i373 = ((i372 | 11) << 1) - (i372 ^ 11);
            notify = i373 % 128;
            if (i373 % 2 == 0) {
                int i374 = i2 % (i371 / 0);
                int i375 = i374 * 66;
                int i376 = (i374 | i375) & (~(i374 & i375));
                int i377 = i376 % 18;
                i12 = (i376 | i377) & (~(i376 & i377));
                i13 = i12 - 4;
            } else {
                int i378 = (i2 - (~(-(-((i371 << 1) - i371))))) - 1;
                int i379 = i378 << 13;
                int i380 = ((~i378) & i379) | ((~i379) & i378);
                int i381 = i380 >>> 17;
                i12 = (i380 | i381) & (~(i380 & i381));
                i13 = i12 << 5;
            }
            ((int[]) objArr33[1])[0] = (i12 | i13) & (~(i12 & i13));
            return objArr33;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$c(short r6, byte r7, byte r8) {
            /*
                byte[] r0 = io.reactivex.internal.functions.Functions.search.$$a
                int r6 = r6 * 3
                int r6 = 1 - r6
                int r7 = r7 + 4
                int r8 = 121 - r8
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r6
                r8 = r7
                r4 = r2
                goto L2a
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r7 = r7 + 1
                int r3 = r3 + 1
                if (r3 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2a:
                int r7 = -r7
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.functions.Functions.search.$$c(short, byte, byte):java.lang.String");
        }
    }

    public static <T> logToString<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return (logToString<T>) asInterface;
    }

    static final class write implements logToString<OutputTransform> {
        private static final byte[] $$c = {91, -9, 99, 11};
        private static final int $$f = 106;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {73, 55, 58, 33, -3, 26, -25, 45, -2, 28, -2, 7, 29, -26, 30, 25, 7, 8, 20, 10, 0, 17, 10, -16, 29, 18, 4, 9, 28, 6, 14, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$e = 202;
        private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
        private static final int $$b = 171;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int g = 1;
        private static char TuitionPaymentFragmentbindingInflater1 = 3260;
        private static char b = 50276;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 51563;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 50013;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = io.reactivex.internal.functions.Functions.write.$$a
                int r7 = r7 * 14
                int r7 = 98 - r7
                int r6 = r6 * 52
                int r1 = 53 - r6
                int r5 = r5 * 52
                int r5 = 55 - r5
                byte[] r1 = new byte[r1]
                int r6 = 52 - r6
                r2 = 0
                if (r0 != 0) goto L18
                r4 = r6
                r3 = r2
                goto L2c
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                int r5 = r5 + 1
                r1[r3] = r4
                if (r3 != r6) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L28:
                r4 = r0[r5]
                int r3 = r3 + 1
            L2c:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.functions.Functions.write.a(byte, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = io.reactivex.internal.functions.Functions.write.$$d
                int r7 = r7 * 25
                int r1 = 53 - r7
                int r6 = r6 * 31
                int r6 = r6 + 84
                int r8 = r8 + 4
                byte[] r1 = new byte[r1]
                int r7 = 52 - r7
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2f
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                int r8 = r8 + 1
                r4 = r0[r8]
                int r3 = r3 + 1
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2f:
                int r8 = r8 + r6
                int r6 = r8 + (-11)
                r8 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.functions.Functions.write.d(byte, int, short, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            int i3 = $10 + 103;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 5;
            }
            while (true) {
                int i5 = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                int i6 = $10 + 57;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i8 = 58224;
                int i9 = 0;
                while (i9 < 16) {
                    int i10 = $11 + 27;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i5];
                    int i12 = (c2 + i8) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                    int i13 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        objArr2[2] = Integer.valueOf(i13);
                        objArr2[1] = Integer.valueOf(i12);
                        objArr2[i5] = Integer.valueOf(c);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char mode = (char) (View.MeasureSpec.getMode(i5) + 47773);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 468;
                            int i14 = 12 - (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1));
                            Class[] clsArr = new Class[4];
                            clsArr[i5] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mode, longPressTimeout, i14, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i15 = i9;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - ExpandableListView.getPackedPositionGroup(0L)), 469 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 12 - TextUtils.lastIndexOf("", '0'), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i8 -= 40503;
                        i9 = i15 + 1;
                        int i16 = $11 + 59;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i17 = 5 % 3;
                        }
                        i5 = 0;
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
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 2323, Color.argb(0, 0, 0, 0) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
        }

        write() {
        }

        /* JADX WARN: Code duplicated, block: B:23:0x01f3  */
        @Override // defpackage.logToString
        public final /* synthetic */ void accept(OutputTransform outputTransform) throws Exception {
            Object[] objArr;
            int i = 2 % 2;
            OutputTransform outputTransform2 = outputTransform;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (37566 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int iIndexOf = 624 - TextUtils.indexOf((CharSequence) "", '0');
                int iNormalizeMetaState = 14 - KeyEvent.normalizeMetaState(0);
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                Object[] objArr2 = new Object[1];
                a(b2, b2, bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, iNormalizeMetaState, -477065106, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{59724, 43040, 41933, 27189, 59422, 55695, 3428, 23736, 33072, 52471, 57736, 17049, 51510, 32405, 37252, 37364, 48500, 6622, 61733, 54246, 61278, 7003, 3212, 3904}, 22 - KeyEvent.getDeadChar(0, 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{57278, 53973, 9759, 33765, 12647, 39893, 5838, 47757, 19679, 19722, 5836, 65219, 23332, 2335, 29631, 25917, 50415, 33541}, 15 - TextUtils.getCapsMode("", 0, 0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (37567 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i2 = 626 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i3 = 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b3 = bArr2[5];
                Object[] objArr5 = new Object[1];
                a(b3, bArr2[7], b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i2, i3, -976899241, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 37567);
                    int mode = View.MeasureSpec.getMode(0) + 625;
                    int modifierMetaStateMask = 13 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    a(b4, b4, bArr3[5], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, mode, modifierMetaStateMask, -973632554, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i4 = ((int[]) objArr7[2])[0];
                int i5 = ((int[]) objArr7[0])[0];
                String[] strArr = (String[]) objArr7[3];
                int[] iArr = {i4};
                int iIdentityHashCode = System.identityHashCode(this);
                int i6 = 467239304 + (((~((-656093397) | iIdentityHashCode)) | 85463060) * 1504) + ((~(iIdentityHashCode | (-570630337))) * (-1504)) + 650416312;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                objArr = new Object[]{new int[]{i5}, new int[1], iArr, strArr};
                int i9 = g + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                int i10 = i9 % 2;
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{13728, 11409, 33464, 13844, 12333, 59996, 28275, 38386, 53017, 29126, 14050, 4497, 63407, 4967, 54030, 13077, 43229, 53186, 32387, 26280, 36857, 9425, 30366, 13803, 20103, 41689, 24748, 58515}, 26 - (ViewConfiguration.getEdgeSlop() >> 16), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{35316, 27465, 46867, 40885, 18003, 46649, 33005, 55498, 36642, 53152, 5744, 55333, 2594, 60080, 34262, 54511, 50290, 38092, 29558, 46903}, MotionEvent.axisFromString("") + 19, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i11 = g + 7;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                        if (i11 % 2 != 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{22861, 14519, 41627, 46849, 53035, 1129, 26105, 23560, 50489, 40432, 12954, 3927, 8495, 26747, 64325, 37991, 60304, 27256}, ExpandableListView.getPackedPositionChild(0L) + 17, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{32315, 29115, 23751, 47993, 49903, 6013, 22805, 55311, 10248, 40393, 29490, 31913, 53432, 23486, 40223, 29853, 27979, 20237}, (Process.myTid() >> 22) + 16, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr12 = new Object[1];
                c(new char[]{5394, 894, 3156, 44780, 57638, 4867, 42044, 54829, 7796, 52624, 31100, 39581, 57419, 838, 63681, 38096, 59411, 38684, 28694, 52068, 10574, 6349, 53197, 1967, 58023, 9106, 50217, 14551, 30315, 61023, 43514, 51089, 55122, 18228, 19211, 16896, 6570, 37976, 25108, 42252, 22639, 61387, 35481, 19527, 20497, 57059, 11048, 54223, 12413, 18188, 44326, 44360, 43004, 12615, 13984, 33161, 21346, 21566, 47497, 35008, 36379, 49174, 9707, 32701, 64442, 15534}, 64 - ((Process.getThreadPriority(0) + 20) >> 6), objArr12);
                String str = (String) objArr12[0];
                Object[] objArr13 = new Object[1];
                c(new char[]{24106, 26416, 43123, 17936, 44836, 12723, 25000, 54126, 57532, 44411, 9586, 30089, 24205, 22781, 34192, 3965, 63652, 1204, 32031, 19893, 4635, 11974, 38945, 7611, 30591, 10447, 59252, 14811, 39291, 12862, 30147, 25630, 1376, 20497, 634, 47415, 50503, 940, 14917, 48017, 6823, 56847, 430, 28171, 48307, 30555, 19728, 52521, 3787, 22049, 53650, 12019, 48347, 49844, 9580, 48010, 12307, 4512, 24272, 2456, 51185, 34703, 504, 25062, 49382, 59770}, 64 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr13);
                try {
                    Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -1018659144};
                    byte[] bArr4 = $$d;
                    byte b5 = bArr4[32];
                    byte b6 = (byte) (-b5);
                    Object[] objArr15 = new Object[1];
                    d(b6, b6, b5, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    byte b7 = bArr4[20];
                    Object[] objArr16 = new Object[1];
                    d(b7, b7, bArr4[5], objArr16);
                    Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                    int i12 = ((int[]) objArr17[0])[0];
                    int i13 = ((int[]) objArr17[2])[0];
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cMyPid = (char) (37567 - (Process.myPid() >> 22));
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 625;
                            int iMyPid = 14 - (Process.myPid() >> 22);
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[7];
                            Object[] objArr18 = new Object[1];
                            a(b8, b8, bArr5[5], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, longPressTimeout, iMyPid, -973632554, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                        try {
                            Object[] objArr19 = new Object[1];
                            c(new char[]{59724, 43040, 41933, 27189, 59422, 55695, 3428, 23736, 33072, 52471, 57736, 17049, 51510, 32405, 37252, 37364, 48500, 6622, 61733, 54246, 61278, 7003, 3212, 3904}, KeyEvent.getDeadChar(0, 0) + 22, objArr19);
                            Class<?> cls5 = Class.forName((String) objArr19[0]);
                            Object[] objArr20 = new Object[1];
                            c(new char[]{57278, 53973, 9759, 33765, 12647, 39893, 5838, 47757, 19679, 19722, 5836, 65219, 23332, 2335, 29631, 25917, 50415, 33541}, 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr20);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c2 = (char) (37567 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 625;
                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 14;
                                byte[] bArr6 = $$a;
                                byte b9 = bArr6[5];
                                Object[] objArr21 = new Object[1];
                                a(b9, bArr6[7], b9, objArr21);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, longPressTimeout2, iMakeMeasureSpec, -976899241, false, (String) objArr21[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 37567);
                                int iAlpha = Color.alpha(0) + 625;
                                int iIndexOf2 = 13 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                byte[] bArr7 = $$a;
                                byte b10 = bArr7[5];
                                Object[] objArr22 = new Object[1];
                                a(b10, b10, bArr7[7], objArr22);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollDefaultDelay, iAlpha, iIndexOf2, -477065106, false, (String) objArr22[0], null);
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
            int i14 = ((int[]) objArr[0])[0];
            int i15 = ((int[]) objArr[2])[0];
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[3];
                if (strArr2 != null) {
                    for (String str2 : strArr2) {
                        arrayList.add(str2);
                    }
                }
                throw new RuntimeException(String.valueOf(i15));
            }
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr2 = {i17};
            int iNextInt = new Random().nextInt(198543993);
            int i19 = ~iNextInt;
            int i20 = i16 + (-1596982894) + (((~(i19 | 770310120)) | (-1072431081) | (~((-751307041) | iNextInt))) * 717) + (((~(iNextInt | 770310120)) | (~(i19 | (-751307041))) | (-1072431081)) * 717);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            Object obj = new Object[]{new int[]{i18}, new int[1], iArr2, strArr3}[1];
            ((int[]) obj)[0] = i22 ^ (i22 << 5);
            int i23 = g + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
            int i24 = i23 % 2;
            int i25 = ((int[]) obj)[0];
            int i26 = i25 * i25;
            int i27 = -(767889410 * i25);
            int i28 = ((((i26 | i27) << 1) - (i26 ^ i27)) - (~(-(i25 * (-2070931036))))) - 1;
            int i29 = (i28 & (-507468311)) + ((-507468311) | i28);
            int i30 = i29 >> 25;
            int i31 = ((i30 & (-255)) + (i30 | (-255))) / 128;
            int i32 = i31 & 1;
            int i33 = (i31 ^ 1) + (i32 << 1);
            int i34 = -(((i29 ^ i33) + ((i33 & i29) << 1)) ^ (i32 + (i31 | 1)));
            int i35 = (i34 ^ 6) + ((i34 & 6) << 1);
            int i36 = i35 >> 15;
            int i37 = (((-262143) & i36) + (i36 | (-262143))) / 131072;
            int i38 = ((i37 | 1) << 1) - (i37 ^ 1);
            outputTransform2.b(((long) (3766500 / (((-((i38 & 1) + (i38 | 1))) & i35) * 837))) + 9223372036854775057L);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, byte r7, byte r8) {
            /*
                int r7 = r7 * 4
                int r0 = 1 - r7
                int r6 = r6 * 3
                int r6 = 4 - r6
                byte[] r1 = io.reactivex.internal.functions.Functions.write.$$c
                int r8 = r8 * 2
                int r8 = r8 + 108
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L19
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2d
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L27:
                r3 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r5
            L2d:
                int r6 = -r6
                int r6 = r6 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.functions.Functions.write.$$g(byte, byte, byte):java.lang.String");
        }
    }

    public static <T> findQualityInTargetQualities<T> b() {
        return (findQualityInTargetQualities<T>) TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static <T> findQualityInTargetQualities<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return (findQualityInTargetQualities<T>) TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static <T> Callable<T> g() {
        return (Callable<T>) d;
    }

    public static <T> Comparator<T> asInterface() {
        return (Comparator<T>) asBinder;
    }

    public static final class RemoteActionCompatParcelizer implements Runnable {
        private static final byte[] $$c = {119, -102, -34, -3};
        private static final int $$d = 91;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {15, -9, 64, -81};
        private static final int $$b = 119;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {89053615, 2092345762, -1618644383, -298603193, 366020653, 395773916, 777143699, -1045312901, 1904228420, 1906661019, 893994443, -869776333, -1813241410, 1219084335, -390613172, 1392424339, -1225373067, -284936956};

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 3
                int r0 = r6 + 1
                int r7 = r7 * 3
                int r7 = r7 + 4
                byte[] r1 = io.reactivex.internal.functions.Functions.RemoteActionCompatParcelizer.$$a
                int r5 = r5 * 2
                int r5 = r5 + 98
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r6
                r4 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L26:
                r3 = r1[r7]
            L28:
                int r3 = -r3
                int r5 = r5 + r3
                int r7 = r7 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.functions.Functions.RemoteActionCompatParcelizer.c(byte, int, short, java.lang.Object[]):void");
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int length2;
            int[] iArr3;
            int i2 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i3 = -1870535734;
            long j = 0;
            int i4 = 1;
            int i5 = 0;
            if (iArr4 != null) {
                int i6 = $11 + 109;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                } else {
                    length2 = iArr4.length;
                    iArr3 = new int[length2];
                }
                int i7 = 0;
                while (i7 < length2) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr4[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1))), 3291 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 31, 1948206109, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i7++;
                        i3 = -1870535734;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr4 = iArr3;
            }
            int length3 = iArr4.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (iArr6 != null) {
                int i8 = $10 + 29;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                }
                int i9 = 0;
                while (i9 < length) {
                    Object[] objArr3 = new Object[i4];
                    objArr3[i5] = Integer.valueOf(iArr6[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char offsetAfter = (char) TextUtils.getOffsetAfter("", i5);
                        int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3290;
                        int iResolveSize = View.resolveSize(i5, i5) + 31;
                        byte b4 = (byte) i5;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetAfter, i10, iResolveSize, 1948206109, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i9++;
                    iArr6 = iArr6;
                    i4 = 1;
                    i5 = 0;
                }
                iArr6 = iArr2;
            }
            int i11 = i5;
            System.arraycopy(iArr6, i11, iArr5, i11, length3);
            sessionConfigValidatingBuilder.b = 2;
            int i12 = $10 + 85;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i14 = 17;
                for (int i15 = 1; i14 > i15; i15 = 1) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i14];
                    try {
                        Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 2559 - ExpandableListView.getPackedPositionType(0L), Process.getGidForName("") + 30, 683220507, false, $$e(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i14--;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr5 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28879), Process.getGidForName("") + 349, 25 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        RemoteActionCompatParcelizer() {
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                return "EmptyRunnable";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 11;
            b = i2 % 128;
            int i3 = i2 % 2;
        }

        public static Object[] b(int i, int i2) throws Throwable {
            int i3;
            int i4;
            String line;
            char c;
            Object[] objArr;
            int i5;
            String line2;
            int[] iArr;
            int i6;
            int i7;
            boolean zEquals;
            String line3;
            int[] iArr2;
            int tapTimeout;
            int i8;
            int i9;
            int i10;
            String[] strArr;
            int[] iArr3;
            int iAxisFromString;
            int i11;
            char c2;
            int i12;
            int i13;
            int i14 = 2 % 2;
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i16 = ((i15 | 55) << 1) - (i15 ^ 55);
            b = i16 % 128;
            try {
                if (i16 % 2 != 0) {
                    strArr = new String[3];
                    iArr3 = new int[]{2130966681, -610564151, 709725668, 1114879368, -1417863973, 795392327, 668472272, -1019907067, -145746718, -656481914, 215133893, -1850293785};
                    iAxisFromString = MotionEvent.axisFromString("");
                    i11 = 100;
                    c2 = 1;
                } else {
                    strArr = new String[2];
                    iArr3 = new int[]{2130966681, -610564151, 709725668, 1114879368, -1417863973, 795392327, 668472272, -1019907067, -145746718, -656481914, 215133893, -1850293785};
                    iAxisFromString = MotionEvent.axisFromString("");
                    i11 = 18;
                    c2 = 0;
                }
                int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i18 = ((i17 | 79) << 1) - (i17 ^ 79);
                b = i18 % 128;
                int i19 = i18 % 2;
                Object[] objArr2 = new Object[1];
                a(iArr3, i11 - iAxisFromString, objArr2);
                strArr[c2] = (String) objArr2[0];
                int[] iArr4 = {-674377908, 605816428, -2113567589, -2071158805, -1383107733, 525798262, -621480487, 1132374666, -1064665585, 900571496, -2068856594, -1462268850};
                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                int i20 = (keyRepeatTimeout * (-919)) - 16542;
                int i21 = ~keyRepeatTimeout;
                int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i23 = i22 + 65;
                b = i23 % 128;
                int i24 = i23 % 2;
                int i25 = ~((i21 ^ (-19)) | (i21 & (-19)) | i);
                int i26 = ~i;
                int i27 = ((-19) ^ i26) | ((-19) & i26);
                int i28 = i22 + 57;
                int i29 = i28 % 128;
                b = i29;
                int i30 = i28 % 2;
                int i31 = ~((i27 ^ keyRepeatTimeout) | (i27 & keyRepeatTimeout));
                if (i30 != 0) {
                    i12 = i20 << (920 << ((i31 & i25) | (i25 ^ i31)));
                    int i32 = ~keyRepeatTimeout;
                    i13 = (i32 & (-19)) | (i32 ^ (-19));
                } else {
                    int i33 = -(-(((i31 & i25) | (i25 ^ i31)) * 920));
                    i12 = (i33 | i20) + (i20 & i33);
                    i13 = (i21 ^ (-19)) | (i21 & (-19));
                }
                int i34 = ~i13;
                int i35 = ~(i21 | i26);
                int i36 = (i12 - (~(-(-(((i34 & i35) | (i34 ^ i35)) * 920))))) - 1;
                int i37 = ~keyRepeatTimeout;
                int i38 = ~i;
                int i39 = (i29 & 75) + (i29 | 75);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i39 % 128;
                int i40 = i39 % 2;
                int i41 = ~(i37 | (-19) | i38);
                int i42 = ~((i37 & 18) | (i37 ^ 18) | i);
                int i43 = (i41 & i42) | (i41 ^ i42);
                int i44 = ~((-19) | keyRepeatTimeout | i);
                int i45 = i36 + (((i44 & i43) | (i43 ^ i44)) * 920);
                Object[] objArr3 = new Object[1];
                a(iArr4, i45, objArr3);
                strArr[1] = (String) objArr3[0];
                int i46 = 0;
                while (true) {
                    if (i46 < 2) {
                        int i47 = b;
                        int i48 = (i47 ^ 13) + ((i47 & 13) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
                        int i49 = i48 % 2;
                        String str = strArr[i46];
                        Object[] objArr4 = new Object[1];
                        a(new int[]{-1871080341, 1754876571, 284357910, 2108387812, 1694048568, 1198217706, -1144982889, 662423380, 1987237675, -1283310844}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16, objArr4);
                        Class<?> cls = Class.forName((String) objArr4[0]);
                        if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                            int i50 = b;
                            int i51 = ((i50 | 61) << 1) - (i50 ^ 61);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i51 % 128;
                            if (i51 % 2 != 0) {
                                i3 = (~(i & 1)) & (i | 1);
                                break;
                            }
                            break;
                        }
                        i46++;
                    }
                    i3 = i;
                    break;
                }
            } catch (Exception unused) {
                i3 = i ^ 2;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2418);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2845;
                    int iMyPid = (Process.myPid() >> 22) + 5;
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    Object[] objArr5 = new Object[1];
                    c(b2, b3, b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, pressedStateDuration, iMyPid, -501222268, false, (String) objArr5[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                long j = 383592673;
                long j2 = (((long) 465) * j) + (((long) (-463)) * jLongValue);
                long j3 = 464;
                long j4 = -1;
                long j5 = jLongValue ^ j4;
                long jNextInt = new Random().nextInt(1940362493);
                long j6 = jNextInt ^ j4;
                long j7 = (j5 | j) ^ j4;
                int i52 = i3;
                long j8 = j2 + ((((j5 | j6) ^ j4) | j7 | ((j6 | j) ^ j4)) * j3) + (((long) (-464)) * (jNextInt | (j ^ j4) | j5)) + (j3 * (j7 | ((j | jNextInt) ^ j4))) + ((long) (-1542779359));
                int i53 = (-2068179527) + (((~((-55112403) | i)) | 1492338813) * 191);
                int i54 = ~i;
                int i55 = ((int) (j8 >> 32)) & (i53 + (((~((-55112403) | i54)) | 4210768) * 191));
                int i56 = (~(376880524 | i54)) | (-1064811934);
                int i57 = ~((-372414477) | i);
                int i58 = ((int) j8) & (((i56 | i57) * (-252)) + 813105869 + ((i57 | (~((-687931410) | i54))) * 252));
                int i59 = (i55 & i58) | (i55 ^ i58);
                int i60 = (i59 | 1) & (~(i59 & 1));
                int i61 = -i60;
                int i62 = ((i60 & i61) | (i60 ^ i61)) >> 31;
                int i63 = (i62 & i) | ((i ^ 10) & (~i62));
                int i64 = (~(i & i52)) & (i | i52);
                int i65 = -i64;
                int i66 = ((i64 & i65) | (i64 ^ i65)) >> 31;
                int i67 = i63 & (~i66);
                int i68 = i52 & i66;
                int i69 = (i67 ^ i68) | (i67 & i68);
                try {
                    int i70 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i71 = (i70 ^ 41) + ((i70 & 41) << 1);
                    Object[] objArr6 = new Object[1];
                    a(new int[]{-624574744, 27935972, -1277975456, -385789369, 421810803, -1285546207, -282525414, -583896495, 1456849311, 1362149602, 96359474, 1941470061, -270273783, -1851590082, -1249385396, 1737646864, -967650352, -135631284, 563384224, 1734013593, -899470575, 303618646}, i71, objArr6);
                    File file = new File((String) objArr6[0]);
                    if (file.canRead()) {
                        FileReader fileReader = new FileReader(file);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        try {
                            line = bufferedReader.readLine();
                            int[] iArr5 = {-1234282336, 226637978, 506002447, 833551064};
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i72 = iNormalizeMetaState * 370;
                            int i73 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i74 = ((i73 | 101) << 1) - (i73 ^ 101);
                            int i75 = i74 % 128;
                            b = i75;
                            if (i74 % 2 != 0) {
                                int i76 = (iNormalizeMetaState ^ 3) | (iNormalizeMetaState & 3);
                                int i77 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i10 = (410700 * iNormalizeMetaState) << (((i76 ^ i77) | (i76 & i77)) * (-369));
                            } else {
                                i10 = (((iNormalizeMetaState ^ 3) | (iNormalizeMetaState & 3) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault1)) * (-369)) + (i72 & 1110) + (i72 | 1110);
                            }
                            int i78 = ~iNormalizeMetaState;
                            int i79 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i80 = (i10 - (~((-369) * ((~((i78 ^ i79) | (i78 & i79))) | 3)))) - 1;
                            int i81 = ~(((-4) & iNormalizeMetaState) | ((-4) ^ iNormalizeMetaState));
                            int i82 = ~((iNormalizeMetaState ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (iNormalizeMetaState & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                            int i83 = (i81 & i82) | (i81 ^ i82);
                            int i84 = ~iNormalizeMetaState;
                            int i85 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i86 = (i85 & i84) | (i84 ^ i85);
                            int i87 = ~((i86 & 3) | (i86 ^ 3));
                            int i88 = -(-(((i87 & i83) | (i83 ^ i87)) * 369));
                            int i89 = (i80 & i88) + (i88 | i80);
                            int i90 = ((i75 | 43) << 1) - (i75 ^ 43);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i90 % 128;
                            if (i90 % 2 == 0) {
                                Object[] objArr7 = new Object[1];
                                a(iArr5, i89, objArr7);
                                line.equals((String) objArr7[0]);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            Object[] objArr8 = new Object[1];
                            a(iArr5, i89, objArr8);
                            if (line.equals((String) objArr8[0])) {
                                fileReader.close();
                                bufferedReader.close();
                                int i91 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i4 = (i91 ^ 73) + ((i91 & 73) << 1);
                                b = i4 % 128;
                                int i92 = i4 % 2;
                                line = null;
                            } else {
                                int i93 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i94 = (i93 & 115) + (i93 | 115);
                                b = i94 % 128;
                                if (i94 % 2 != 0) {
                                    fileReader.close();
                                    bufferedReader.close();
                                    int i95 = 80 / 0;
                                } else {
                                    fileReader.close();
                                    bufferedReader.close();
                                }
                            }
                        } catch (Throwable th) {
                            fileReader.close();
                            bufferedReader.close();
                            throw th;
                        }
                    } else {
                        int i96 = b;
                        i4 = ((i96 | 37) << 1) - (i96 ^ 37);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                        int i97 = i4 % 2;
                        line = null;
                    }
                } catch (Exception unused2) {
                }
                try {
                    int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                    Object[] objArr9 = new Object[1];
                    a(new int[]{287447410, 1864589445, 1704179446, -1232965582, 1964139666, -1068432266, -1642606727, 1997501389, 1262263448, -1778654536, -824641684, 610716192, -56349113, -438808222, 2111318838, 428431246, 2010646312, 206864387}, (jumpTapTimeout & 31) + (jumpTapTimeout | 31), objArr9);
                    File file2 = new File((String) objArr9[0]);
                    int i98 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 105;
                    b = i98 % 128;
                    if (i98 % 2 != 0) {
                        file2.canRead();
                        throw null;
                    }
                    if (file2.canRead()) {
                        FileReader fileReader2 = new FileReader(file2);
                        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                        int i99 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                        b = i99 % 128;
                        try {
                            if (i99 % 2 != 0) {
                                line2 = bufferedReader2.readLine();
                                iArr = new int[]{1049164339, 1325582195, 522879012, 683680068};
                                i6 = -Color.argb(0, 1, 0, 1);
                                i7 = 0;
                            } else {
                                line2 = bufferedReader2.readLine();
                                iArr = new int[]{1049164339, 1325582195, 522879012, 683680068};
                                i6 = -Color.argb(0, 0, 0, 0);
                                i7 = 1;
                            }
                            int i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i101 = ((i100 | 113) << 1) - (i100 ^ 113);
                            b = i101 % 128;
                            int i102 = i101 % 2;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i103 = i6 * 659;
                            int i104 = i7 * (-657);
                            int i105 = (i103 & i104) + (i104 | i103);
                            int i106 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i107 = (i106 & 39) + (i106 | 39);
                            b = i107 % 128;
                            int i108 = i107 % 2;
                            int i109 = ~i6;
                            int i110 = ~((i109 & i7) | (i109 ^ i7));
                            int i111 = ~i7;
                            int i112 = i111 | i6;
                            int i113 = i106 + 81;
                            int i114 = i113 % 128;
                            b = i114;
                            int i115 = i113 % 2;
                            int i116 = (~i112) | i110;
                            int i117 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i6) | (i6 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            int i118 = ~i117;
                            int i119 = (-658) * ((i116 & i118) | (i116 ^ i118));
                            int i120 = ((i105 | i119) << 1) - (i105 ^ i119);
                            int i121 = ~i7;
                            int i122 = -(-((~((i121 & i6) | (i121 ^ i6))) * 658));
                            int i123 = (i120 ^ i122) + ((i120 & i122) << 1);
                            int i124 = (i114 & 125) + (i114 | 125);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i124 % 128;
                            int i125 = i124 % 2;
                            int i126 = ~((i111 ^ i6) | (i111 & i6));
                            int i127 = ~i117;
                            if (i125 == 0) {
                                int i128 = (i127 & i126) | (i126 ^ i127);
                                Object[] objArr10 = new Object[1];
                                a(iArr, i123 >> (((i128 | 658) << 1) - (i128 ^ 658)), objArr10);
                                zEquals = line2.equals((String) objArr10[0]);
                            } else {
                                int i129 = ((i127 & i126) | (i126 ^ i127)) * 658;
                                int i130 = ((i123 | i129) << 1) - (i129 ^ i123);
                                Object[] objArr11 = new Object[1];
                                a(iArr, i130, objArr11);
                                zEquals = line2.equals((String) objArr11[0]);
                            }
                            fileReader2.close();
                            bufferedReader2.close();
                            if (zEquals) {
                                int i131 = -(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                Object[] objArr12 = new Object[1];
                                a(new int[]{1805076914, -1936672477, -381551758, 795543366, -750305956, -958314440, 490451863, 789215848, -420917326, -619963974, 1886849334, 1562611290, -1035336458, -1523545647, 1217395989, -1029177228, -1332846202, 1191814270, 988656922, -74052145}, (i131 & 35) + (i131 | 35), objArr12);
                                File file3 = new File((String) objArr12[0]);
                                if (!file3.canRead()) {
                                    int i132 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i133 = (i132 ^ 105) + ((i132 & 105) << 1);
                                    b = i133 % 128;
                                    int i134 = i133 % 2;
                                } else {
                                    FileReader fileReader3 = new FileReader(file3);
                                    BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                    int i135 = b + 17;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i135 % 128;
                                    try {
                                        if (i135 % 2 == 0) {
                                            line3 = bufferedReader3.readLine();
                                            iArr2 = new int[]{1049164339, 1325582195, 522879012, 683680068};
                                            tapTimeout = ViewConfiguration.getTapTimeout();
                                            i8 = 25;
                                            i9 = 0;
                                        } else {
                                            line3 = bufferedReader3.readLine();
                                            iArr2 = new int[]{1049164339, 1325582195, 522879012, 683680068};
                                            tapTimeout = ViewConfiguration.getTapTimeout();
                                            i8 = 16;
                                            i9 = 1;
                                        }
                                        int i136 = -(tapTimeout >> i8);
                                        int i137 = (i9 & i136) + (i136 | i9);
                                        Object[] objArr13 = new Object[1];
                                        a(iArr2, i137, objArr13);
                                        boolean zEquals2 = line3.equals((String) objArr13[0]);
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        int i138 = b;
                                        int i139 = (i138 & 27) + (i138 | 27);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i139 % 128;
                                        if (i139 % 2 == 0) {
                                            int i140 = 3 / 3;
                                        }
                                        if (zEquals2) {
                                            if (line != null) {
                                                int i141 = (i138 & 65) + (i138 | 65);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i141 % 128;
                                                int i142 = i141 % 2;
                                                objArr = new Object[]{new int[]{(i & (-21)) | (i54 & 20)}, new String[]{line}};
                                                c = 0;
                                            } else {
                                                i5 = 2;
                                            }
                                        }
                                        objArr = new Object[i5];
                                        objArr[0] = new int[]{i};
                                        int i143 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i144 = (i143 & 1) + (i143 | 1);
                                        int i145 = i144 % 128;
                                        b = i145;
                                        int i146 = i144 % 2;
                                        int i147 = ((i145 | 45) << 1) - (i145 ^ 45);
                                        int i148 = i147 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i148;
                                        int i149 = i147 % 2;
                                        c = 0;
                                        objArr[1] = new String[0];
                                        int i150 = i148 + 13;
                                        b = i150 % 128;
                                        int i151 = i150 % 2;
                                    } catch (Throwable th2) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        throw th2;
                                    }
                                }
                            }
                            int i152 = ((int[]) objArr[c])[c];
                            int i153 = (~(i & i69)) & (i | i69);
                            int i154 = -i153;
                            int i155 = ((i153 & i154) | (i153 ^ i154)) >> 31;
                            int i156 = (~i155) & i152;
                            int i157 = i69 & i155;
                            int i158 = (i157 & i156) | (i156 ^ i157);
                            String[] strArr2 = (String[]) objArr[1];
                            Object[] objArr14 = new Object[2];
                            int i159 = (i152 & i54) | ((~i152) & i);
                            int i160 = ((i159 | (-i159)) >> 31) & 1;
                            int i161 = -i160;
                            int i162 = (~(((i161 & i160) | (i160 ^ i161)) >> 31)) & 1;
                            objArr14[i160] = null;
                            objArr14[i162] = strArr2;
                            String[] strArr3 = (String[]) objArr14[0];
                            int i163 = (~(i & i158)) & (i | i158);
                            int i164 = -i163;
                            int i165 = (((i163 & i164) | (i163 ^ i164)) >> 31) & 16;
                            Object[] objArr15 = {new int[]{i}, new int[1], new int[]{i158}, strArr3};
                            int i166 = ((((~(469712639 | i54)) | (~((-12714052) | i))) * 988) - 265031008) + (((~(416688359 | i)) | 53024280 | (~((-12714052) | i54))) * 988);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i167 = (i165 * (-1529)) + (i166 * (-764));
                            int i168 = ~i165;
                            int i169 = ~i166;
                            int i170 = ~((i168 ^ i169) | (i168 & i169) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i171 = ~i165;
                            int i172 = i171 | i166;
                            int i173 = ~((i172 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i172 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i174 = (i170 & i173) | (i170 ^ i173);
                            int i175 = (~i166) | i165;
                            int i176 = ~((i175 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i175 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i177 = (i167 - (~(((i176 & i174) | (i174 ^ i176)) * 765))) - 1;
                            int i178 = ~((i171 ^ i169) | (i171 & i169));
                            int i179 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i180 = ~((i168 & i179) | (i168 ^ i179));
                            int i181 = -(-(((i178 & i180) | (i178 ^ i180)) * 1530));
                            int i182 = (i177 & i181) + (i181 | i177);
                            int i183 = ~((i171 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i171));
                            int i184 = ~((i169 ^ i179) | (i169 & i179) | i165);
                            int i185 = -(-(((i183 & i184) | (i183 ^ i184)) * 765));
                            int i186 = (i182 ^ i185) + ((i185 & i182) << 1);
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i187 = i186 * 960;
                            int i188 = i2 * (-1917);
                            int i189 = ((i187 | i188) << 1) - (i187 ^ i188);
                            int i190 = ~i2;
                            int i191 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                            int i192 = -(-(((~((i190 ^ i191) | (i190 & i191))) | (~((i186 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i186 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) * 959));
                            int i193 = ((i189 | i192) << 1) - (i192 ^ i189);
                            int i194 = -(-((~i2) * (-959)));
                            int i195 = ((i193 | i194) << 1) - (i194 ^ i193);
                            int i196 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i190) | (i190 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                            int i197 = ~((i186 & i191) | (i191 ^ i186));
                            int i198 = -(-(((i196 & i197) | (i196 ^ i197)) * 959));
                            int i199 = (i195 & i198) + (i198 | i195);
                            int i200 = i199 << 13;
                            int i201 = (i200 | i199) & (~(i199 & i200));
                            int i202 = i201 >>> 17;
                            int i203 = (i201 | i202) & (~(i201 & i202));
                            int i204 = i203 << 5;
                            ((int[]) objArr15[1])[0] = (i203 | i204) & (~(i203 & i204));
                            return objArr15;
                        } catch (Throwable th3) {
                            fileReader2.close();
                            bufferedReader2.close();
                            throw th3;
                        }
                    }
                } catch (Exception unused3) {
                }
                i5 = 2;
                objArr = new Object[i5];
                objArr[0] = new int[]{i};
                int i1410 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i1411 = (i1410 & 1) + (i1410 | 1);
                int i1412 = i1411 % 128;
                b = i1412;
                int i1413 = i1411 % 2;
                int i1414 = ((i1412 | 45) << 1) - (i1412 ^ 45);
                int i1415 = i1414 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1415;
                int i1416 = i1414 % 2;
                c = 0;
                objArr[1] = new String[0];
                int i1510 = i1415 + 13;
                b = i1510 % 128;
                int i1511 = i1510 % 2;
                int i1512 = ((int[]) objArr[c])[c];
                int i1513 = (~(i & i69)) & (i | i69);
                int i1514 = -i1513;
                int i1515 = ((i1513 & i1514) | (i1513 ^ i1514)) >> 31;
                int i1516 = (~i1515) & i1512;
                int i1517 = i69 & i1515;
                int i1518 = (i1517 & i1516) | (i1516 ^ i1517);
                String[] strArr4 = (String[]) objArr[1];
                Object[] objArr16 = new Object[2];
                int i1519 = (i1512 & i54) | ((~i1512) & i);
                int i1610 = ((i1519 | (-i1519)) >> 31) & 1;
                int i1611 = -i1610;
                int i1612 = (~(((i1611 & i1610) | (i1610 ^ i1611)) >> 31)) & 1;
                objArr16[i1610] = null;
                objArr16[i1612] = strArr4;
                String[] strArr5 = (String[]) objArr16[0];
                int i1613 = (~(i & i1518)) & (i | i1518);
                int i1614 = -i1613;
                int i1615 = (((i1613 & i1614) | (i1613 ^ i1614)) >> 31) & 16;
                Object[] objArr17 = {new int[]{i}, new int[1], new int[]{i1518}, strArr5};
                int i1616 = ((((~(469712639 | i54)) | (~((-12714052) | i))) * 988) - 265031008) + (((~(416688359 | i)) | 53024280 | (~((-12714052) | i54))) * 988);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i1617 = (i1615 * (-1529)) + (i1616 * (-764));
                int i1618 = ~i1615;
                int i1619 = ~i1616;
                int i1710 = ~((i1618 ^ i1619) | (i1618 & i1619) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                int i1711 = ~i1615;
                int i1712 = i1711 | i1616;
                int i1713 = ~((i1712 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i1712 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                int i1714 = (i1710 & i1713) | (i1710 ^ i1713);
                int i1715 = (~i1616) | i1615;
                int i1716 = ~((i1715 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i1715 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                int i1717 = (i1617 - (~(((i1716 & i1714) | (i1714 ^ i1716)) * 765))) - 1;
                int i1718 = ~((i1711 ^ i1619) | (i1711 & i1619));
                int i1719 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i1810 = ~((i1618 & i1719) | (i1618 ^ i1719));
                int i1811 = -(-(((i1718 & i1810) | (i1718 ^ i1810)) * 1530));
                int i1812 = (i1717 & i1811) + (i1811 | i1717);
                int i1813 = ~((i1711 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i1711));
                int i1814 = ~((i1619 ^ i1719) | (i1619 & i1719) | i1615);
                int i1815 = -(-(((i1813 & i1814) | (i1813 ^ i1814)) * 765));
                int i1816 = (i1812 ^ i1815) + ((i1815 & i1812) << 1);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i1817 = i1816 * 960;
                int i1818 = i2 * (-1917);
                int i1819 = ((i1817 | i1818) << 1) - (i1817 ^ i1818);
                int i1910 = ~i2;
                int i1911 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                int i1912 = -(-(((~((i1910 ^ i1911) | (i1910 & i1911))) | (~((i1816 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i1816 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6)))) * 959));
                int i1913 = ((i1819 | i1912) << 1) - (i1912 ^ i1819);
                int i1914 = -(-((~i2) * (-959)));
                int i1915 = ((i1913 | i1914) << 1) - (i1914 ^ i1913);
                int i1916 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & i1910) | (i1910 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                int i1917 = ~((i1816 & i1911) | (i1911 ^ i1816));
                int i1918 = -(-(((i1916 & i1917) | (i1916 ^ i1917)) * 959));
                int i1919 = (i1915 & i1918) + (i1918 | i1915);
                int i205 = i1919 << 13;
                int i206 = (i205 | i1919) & (~(i1919 & i205));
                int i207 = i206 >>> 17;
                int i208 = (i206 | i207) & (~(i206 & i207));
                int i209 = i208 << 5;
                ((int[]) objArr17[1])[0] = (i208 | i209) & (~(i208 & i209));
                return objArr17;
            } catch (Throwable th4) {
                Throwable cause = th4.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th4;
            }
        }

        private static String $$e(int i, short s, byte b2) {
            int i2 = 122 - (b2 * 56);
            int i3 = i * 4;
            byte[] bArr = $$c;
            int i4 = 3 - (s * 4);
            byte[] bArr2 = new byte[i3 + 1];
            int i5 = -1;
            if (bArr == null) {
                i2 = i4 + i3;
                i4 = i4;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i3) {
                    return new String(bArr2, 0);
                }
                int i6 = i4 + 1;
                i2 += bArr[i6];
                i4 = i6;
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class MediaBrowserCompat<T, U> implements Callable<U>, readableMs<T, U> {
        private U b;

        MediaBrowserCompat(U u) {
            this.b = u;
        }

        @Override // java.util.concurrent.Callable
        public final U call() throws Exception {
            return this.b;
        }

        @Override // defpackage.readableMs
        public final U apply(T t) throws Exception {
            return this.b;
        }
    }

    public static <T> Callable<T> TuitionPaymentFragmentbindingInflater1(T t) {
        return new MediaBrowserCompat(t);
    }

    public static <T, U> readableMs<T, U> TuitionPaymentFragmentspecialinlinedviewModeldefault3(U u) {
        return new MediaBrowserCompat(u);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class INotificationSideChannel<T, U> implements readableMs<T, U> {
        private Class<U> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        INotificationSideChannel(Class<U> cls) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cls;
        }

        @Override // defpackage.readableMs
        public final U apply(T t) throws Exception {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.cast(t);
        }
    }

    public static <T, U> readableMs<T, U> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<U> cls) {
        return new INotificationSideChannel(cls);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class d<T> implements Callable<List<T>> {
        private int TuitionPaymentFragmentbindingInflater1;

        d(int i) {
            this.TuitionPaymentFragmentbindingInflater1 = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() throws Exception {
            return new ArrayList(this.TuitionPaymentFragmentbindingInflater1);
        }
    }

    public static <T> Callable<List<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        return new d(i);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class INotificationSideChannelStubProxy<T> implements findQualityInTargetQualities<T> {
        private T TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        INotificationSideChannelStubProxy(T t) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = t;
        }

        @Override // defpackage.findQualityInTargetQualities
        public final boolean b(T t) throws Exception {
            return share.TuitionPaymentFragmentspecialinlinedviewModeldefault3(t, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    public static <T> findQualityInTargetQualities<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t) {
        return new INotificationSideChannelStubProxy(t);
    }

    public static <T> Callable<Set<T>> TuitionPaymentFragmentbindingInflater1() {
        return HashSetCallable.INSTANCE;
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class disconnect<T> implements logToString<T> {
        private logToString<? super VideoRecordEventStatus<T>> TuitionPaymentFragmentbindingInflater1;

        disconnect(logToString<? super VideoRecordEventStatus<T>> logtostring) {
            this.TuitionPaymentFragmentbindingInflater1 = logtostring;
        }

        @Override // defpackage.logToString
        public final void accept(T t) throws Exception {
            this.TuitionPaymentFragmentbindingInflater1.accept(VideoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault2(t));
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class getNotifyChildrenChangedOptions<T> implements logToString<Throwable> {
        private logToString<? super VideoRecordEventStatus<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // defpackage.logToString
        public final /* bridge */ /* synthetic */ void accept(Throwable th) throws Exception {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.accept(VideoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th));
        }

        getNotifyChildrenChangedOptions(logToString<? super VideoRecordEventStatus<T>> logtostring) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = logtostring;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class getItem<T> implements formatInterval {
        private logToString<? super VideoRecordEventStatus<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        getItem(logToString<? super VideoRecordEventStatus<T>> logtostring) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = logtostring;
        }

        @Override // defpackage.formatInterval
        public final void run() throws Exception {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.accept(VideoRecordEventStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
    }

    public static <T> logToString<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(logToString<? super VideoRecordEventStatus<T>> logtostring) {
        return new disconnect(logtostring);
    }

    public static <T> logToString<Throwable> b(logToString<? super VideoRecordEventStatus<T>> logtostring) {
        return new getNotifyChildrenChangedOptions(logtostring);
    }

    public static <T> formatInterval TuitionPaymentFragmentbindingInflater1(logToString<? super VideoRecordEventStatus<T>> logtostring) {
        return new getItem(logtostring);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements logToString<T> {
        private formatInterval TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(formatInterval formatinterval) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = formatinterval;
        }

        @Override // defpackage.logToString
        public final void accept(T t) throws Exception {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.run();
        }
    }

    public static <T> logToString<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(formatInterval formatinterval) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(formatinterval);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class onTransact<T, U> implements findQualityInTargetQualities<T> {
        private Class<U> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        onTransact(Class<U> cls) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cls;
        }

        @Override // defpackage.findQualityInTargetQualities
        public final boolean b(T t) throws Exception {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isInstance(t);
        }
    }

    public static <T, U> findQualityInTargetQualities<T> TuitionPaymentFragmentbindingInflater1(Class<U> cls) {
        return new onTransact(cls);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class notify<T> implements findQualityInTargetQualities<T> {
        private readableBufferInfo TuitionPaymentFragmentbindingInflater1;

        notify(readableBufferInfo readablebufferinfo) {
            this.TuitionPaymentFragmentbindingInflater1 = readablebufferinfo;
        }

        @Override // defpackage.findQualityInTargetQualities
        public final boolean b(T t) throws Exception {
            return !this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    public static <T> findQualityInTargetQualities<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(readableBufferInfo readablebufferinfo) {
        return new notify(readablebufferinfo);
    }

    public static <T> readableMs<T, isSamsungJ4<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        return new search(timeUnit, appendbackupvideoprofile);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class isConnected<K, T> implements dumpVideoCapabilities<Map<K, T>, T> {
        private final readableMs<? super T, ? extends K> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // defpackage.dumpVideoCapabilities
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, Object obj2) throws Exception {
            ((Map) obj).put(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.apply(obj2), obj2);
        }

        isConnected(readableMs<? super T, ? extends K> readablems) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
        }
    }

    public static <T, K> dumpVideoCapabilities<Map<K, T>, T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(readableMs<? super T, ? extends K> readablems) {
        return new isConnected(readablems);
    }

    public static <T, K, V> dumpVideoCapabilities<Map<K, V>, T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2) {
        return new getSessionToken(readablems2, readablems);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class getServiceComponent<K, V, T> implements dumpVideoCapabilities<Map<K, Collection<V>>, T> {
        private final readableMs<? super T, ? extends V> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final readableMs<? super T, ? extends K> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final readableMs<? super K, ? extends Collection<? super V>> b;

        @Override // defpackage.dumpVideoCapabilities
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, Object obj2) throws Exception {
            Map map = (Map) obj;
            K kApply = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.apply(obj2);
            Collection<? super V> collectionApply = (Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.b.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.apply(obj2));
        }

        getServiceComponent(readableMs<? super K, ? extends Collection<? super V>> readablems, readableMs<? super T, ? extends V> readablems2, readableMs<? super T, ? extends K> readablems3) {
            this.b = readablems;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems3;
        }
    }

    public static <T, K, V> dumpVideoCapabilities<Map<K, Collection<V>>, T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(readableMs<? super T, ? extends K> readablems, readableMs<? super T, ? extends V> readablems2, readableMs<? super K, ? extends Collection<? super V>> readablems3) {
        return new getServiceComponent(readablems3, readablems2, readablems);
    }

    /* JADX INFO: loaded from: classes5.dex */
    enum NaturalComparator implements Comparator<Object> {
        INSTANCE;

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static <T> Comparator<T> a() {
        return NaturalComparator.INSTANCE;
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class IconCompatParcelizer<T> implements readableMs<List<T>, List<T>> {
        private Comparator<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.readableMs
        public final /* synthetic */ Object apply(Object obj) throws Exception {
            List list = (List) obj;
            Collections.sort(list, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return list;
        }

        IconCompatParcelizer(Comparator<? super T> comparator) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = comparator;
        }
    }

    public static <T> readableMs<List<T>, List<T>> TuitionPaymentFragmentbindingInflater1(Comparator<? super T> comparator) {
        return new IconCompatParcelizer(comparator);
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<T1, T2, R> implements readableMs<Object[], R> {
        private dumpCodecCapabilities<? super T1, ? super T2, ? extends R> b;

        @Override // defpackage.readableMs
        public final /* synthetic */ Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 2) {
                StringBuilder sb = new StringBuilder("Array of size 2 expected but got ");
                sb.append(objArr2.length);
                throw new IllegalArgumentException(sb.toString());
            }
            return this.b.b(objArr2[0], objArr2[1]);
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(dumpCodecCapabilities<? super T1, ? super T2, ? extends R> dumpcodeccapabilities) {
            this.b = dumpcodeccapabilities;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T1, T2, T3, R> implements readableMs<Object[], R> {
        private stringToLog<T1, T2, T3, R> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.readableMs
        public final /* synthetic */ Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 3) {
                StringBuilder sb = new StringBuilder("Array of size 3 expected but got ");
                sb.append(objArr2.length);
                throw new IllegalArgumentException(sb.toString());
            }
            stringToLog<T1, T2, T3, R> stringtolog = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            return stringtolog.b();
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(stringToLog<T1, T2, T3, R> stringtolog) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stringtolog;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class b<T1, T2, T3, T4, R> implements readableMs<Object[], R> {
        private exploreProfiles<T1, T2, T3, T4, R> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        @Override // defpackage.readableMs
        public final /* synthetic */ Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 4) {
                StringBuilder sb = new StringBuilder("Array of size 4 expected but got ");
                sb.append(objArr2.length);
                throw new IllegalArgumentException(sb.toString());
            }
            exploreProfiles<T1, T2, T3, T4, R> exploreprofiles = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            return exploreprofiles.b();
        }

        b(exploreProfiles<T1, T2, T3, T4, R> exploreprofiles) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = exploreprofiles;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T1, T2, T3, T4, T5, R> implements readableMs<Object[], R> {
        private final QualityExploredEncoderProfilesProvider<T1, T2, T3, T4, T5, R> b;

        @Override // defpackage.readableMs
        public final /* synthetic */ Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 5) {
                StringBuilder sb = new StringBuilder("Array of size 5 expected but got ");
                sb.append(objArr2.length);
                throw new IllegalArgumentException(sb.toString());
            }
            QualityExploredEncoderProfilesProvider<T1, T2, T3, T4, T5, R> qualityExploredEncoderProfilesProvider = this.b;
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            return qualityExploredEncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        TuitionPaymentFragmentbindingInflater1(QualityExploredEncoderProfilesProvider<T1, T2, T3, T4, T5, R> qualityExploredEncoderProfilesProvider) {
            this.b = qualityExploredEncoderProfilesProvider;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class g<T1, T2, T3, T4, T5, T6, R> implements readableMs<Object[], R> {
        private filterUnmatchedDynamicRange<T1, T2, T3, T4, T5, T6, R> b;

        @Override // defpackage.readableMs
        public final /* synthetic */ Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 6) {
                StringBuilder sb = new StringBuilder("Array of size 6 expected but got ");
                sb.append(objArr2.length);
                throw new IllegalArgumentException(sb.toString());
            }
            filterUnmatchedDynamicRange<T1, T2, T3, T4, T5, T6, R> filterunmatcheddynamicrange = this.b;
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            Object obj6 = objArr2[5];
            return filterunmatcheddynamicrange.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        g(filterUnmatchedDynamicRange<T1, T2, T3, T4, T5, T6, R> filterunmatcheddynamicrange) {
            this.b = filterunmatcheddynamicrange;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class asInterface<T1, T2, T3, T4, T5, T6, T7, R> implements readableMs<Object[], R> {
        private DynamicRangeMatchedEncoderProfilesProvider<T1, T2, T3, T4, T5, T6, T7, R> TuitionPaymentFragmentbindingInflater1;

        @Override // defpackage.readableMs
        public final /* synthetic */ Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 7) {
                StringBuilder sb = new StringBuilder("Array of size 7 expected but got ");
                sb.append(objArr2.length);
                throw new IllegalArgumentException(sb.toString());
            }
            DynamicRangeMatchedEncoderProfilesProvider<T1, T2, T3, T4, T5, T6, T7, R> dynamicRangeMatchedEncoderProfilesProvider = this.TuitionPaymentFragmentbindingInflater1;
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            Object obj6 = objArr2[5];
            Object obj7 = objArr2[6];
            return dynamicRangeMatchedEncoderProfilesProvider.b();
        }

        asInterface(DynamicRangeMatchedEncoderProfilesProvider<T1, T2, T3, T4, T5, T6, T7, R> dynamicRangeMatchedEncoderProfilesProvider) {
            this.TuitionPaymentFragmentbindingInflater1 = dynamicRangeMatchedEncoderProfilesProvider;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class a<T1, T2, T3, T4, T5, T6, T7, T8, R> implements readableMs<Object[], R> {
        private checkFullySpecifiedOrThrow<T1, T2, T3, T4, T5, T6, T7, T8, R> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.readableMs
        public final /* synthetic */ Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 8) {
                StringBuilder sb = new StringBuilder("Array of size 8 expected but got ");
                sb.append(objArr2.length);
                throw new IllegalArgumentException(sb.toString());
            }
            checkFullySpecifiedOrThrow<T1, T2, T3, T4, T5, T6, T7, T8, R> checkfullyspecifiedorthrow = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            Object obj6 = objArr2[5];
            Object obj7 = objArr2[6];
            Object obj8 = objArr2[7];
            return checkfullyspecifiedorthrow.TuitionPaymentFragmentbindingInflater1();
        }

        a(checkFullySpecifiedOrThrow<T1, T2, T3, T4, T5, T6, T7, T8, R> checkfullyspecifiedorthrow) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = checkfullyspecifiedorthrow;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    static final class asBinder<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements readableMs<Object[], R> {
        private hasMatchedVideoProfileForAllTargetDynamicRanges<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> TuitionPaymentFragmentbindingInflater1;

        @Override // defpackage.readableMs
        public final /* synthetic */ Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 9) {
                StringBuilder sb = new StringBuilder("Array of size 9 expected but got ");
                sb.append(objArr2.length);
                throw new IllegalArgumentException(sb.toString());
            }
            hasMatchedVideoProfileForAllTargetDynamicRanges<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> hasmatchedvideoprofileforalltargetdynamicranges = this.TuitionPaymentFragmentbindingInflater1;
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            Object obj6 = objArr2[5];
            Object obj7 = objArr2[6];
            Object obj8 = objArr2[7];
            Object obj9 = objArr2[8];
            return hasmatchedvideoprofileforalltargetdynamicranges.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        asBinder(hasMatchedVideoProfileForAllTargetDynamicRanges<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> hasmatchedvideoprofileforalltargetdynamicranges) {
            this.TuitionPaymentFragmentbindingInflater1 = hasmatchedvideoprofileforalltargetdynamicranges;
        }
    }

    static final class read implements readableMs<Object, Object> {
        @Override // defpackage.readableMs
        public final Object apply(Object obj) {
            return obj;
        }

        read() {
        }

        public final String toString() {
            return "IdentityFunction";
        }
    }

    static final class cancelAll implements formatInterval {
        @Override // defpackage.formatInterval
        public final void run() {
        }

        cancelAll() {
        }

        public final String toString() {
            return "EmptyAction";
        }
    }

    static final class cancel implements logToString<Object> {
        @Override // defpackage.logToString
        public final void accept(Object obj) {
        }

        cancel() {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    static final class getInterfaceDescriptor implements logToString<Throwable> {
        getInterfaceDescriptor() {
        }

        @Override // defpackage.logToString
        public final /* synthetic */ void accept(Throwable th) throws Exception {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }
    }

    static final class getRoot implements logToString<Throwable> {
        getRoot() {
        }

        @Override // defpackage.logToString
        public final /* synthetic */ void accept(Throwable th) throws Exception {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new OnErrorNotImplementedException(th));
        }
    }

    static final class INotificationSideChannelStub {
        INotificationSideChannelStub() {
        }
    }

    public static final class sendCustomAction implements findQualityInTargetQualities<Object> {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -834620840;

        @Override // defpackage.findQualityInTargetQualities
        public final boolean b(Object obj) {
            return true;
        }

        sendCustomAction() {
        }
    }

    static final class INotificationSideChannelDefault implements findQualityInTargetQualities<Object> {
        @Override // defpackage.findQualityInTargetQualities
        public final boolean b(Object obj) {
            return false;
        }

        INotificationSideChannelDefault() {
        }
    }

    static final class getExtras implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return null;
        }

        getExtras() {
        }
    }

    static final class connect implements Comparator<Object> {
        connect() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    enum HashSetCallable implements Callable<Set<Object>> {
        INSTANCE;

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Set<Object> call() throws Exception {
            return new HashSet();
        }
    }
}

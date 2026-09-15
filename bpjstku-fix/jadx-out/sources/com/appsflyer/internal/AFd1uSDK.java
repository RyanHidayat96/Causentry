package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
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
import com.appsflyer.AFLogger;
import com.google.android.libraries.places.api.net.kotlin.zzo;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.tls.internal.der.DerHeader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1uSDK implements AFd1vSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLogger = 1;
    private static int copydefault;
    private final Lazy AFAdRevenueData;
    private final Lazy areAllFieldsValid;
    private final String component1;
    private AFd1vSDK.AFa1ySDK component2;
    private final Lazy component3;
    private final Lazy component4;
    private final Lazy getCurrencyIso4217Code;
    private AFc1dSDK getMediationNetwork;
    private final Lazy getMonetizationNetwork;
    private final Lazy getRevenue;
    private static char[] hashCode = {8636, 8652, 8639, 8648, 8626};
    private static int equals = -771284898;
    private static boolean toString = true;
    private static boolean copy = true;

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = (i * (-344)) + (i2 * (-344)) + (((~i6) | (~(i4 | i3))) * 345) + (((~(i | i5)) | (~((~i3) | i4))) * 345) + ((~(i6 | i3)) * 345);
        if (i7 == 1) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i7 == 2) {
            return AFAdRevenueData(objArr);
        }
        if (i7 == 3) {
            return getRevenue(objArr);
        }
        if (i7 == 4) {
            AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
            copydefault = (AFLogger + 59) % 128;
            AFd1xSDK aFd1xSDK = (AFd1xSDK) aFd1uSDK.component3.getValue();
            AFLogger = (copydefault + 5) % 128;
            return aFd1xSDK;
        }
        Map map = (Map) objArr[0];
        List list = (List) objArr[1];
        int i8 = AFLogger + 43;
        copydefault = i8 % 128;
        if (i8 % 2 == 0) {
            return MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFd1tSDK.getCurrencyIso4217Code(list)));
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("deviceInfo", map);
        pairArr[0] = TuplesKt.to("excs", AFd1tSDK.getCurrencyIso4217Code(list));
        return MapsKt.mapOf(pairArr);
    }

    public AFd1uSDK(AFc1dSDK aFc1dSDK) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        this.getMediationNetwork = aFc1dSDK;
        this.AFAdRevenueData = LazyKt.lazy(new Function0<AFf1oSDK>() { // from class: com.appsflyer.internal.AFd1uSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFf1oSDK invoke() {
                AFf1oSDK aFf1oSDKComponent1 = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).component1();
                Intrinsics.checkNotNullExpressionValue(aFf1oSDKComponent1, "");
                return aFf1oSDKComponent1;
            }

            {
                super(0);
            }
        });
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<AFc1pSDK>() { // from class: com.appsflyer.internal.AFd1uSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFc1pSDK invoke() {
                AFc1pSDK revenue = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).getRevenue();
                Intrinsics.checkNotNullExpressionValue(revenue, "");
                return revenue;
            }

            {
                super(0);
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<AFc1qSDK>() { // from class: com.appsflyer.internal.AFd1uSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFc1qSDK invoke() {
                AFc1qSDK aFc1qSDKComponent2 = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).component2();
                Intrinsics.checkNotNullExpressionValue(aFc1qSDKComponent2, "");
                return aFc1qSDKComponent2;
            }

            {
                super(0);
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<AFf1gSDK>() { // from class: com.appsflyer.internal.AFd1uSDK.10
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1gSDK invoke() {
                AFf1gSDK aFf1gSDKRegisterClient = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).registerClient();
                Intrinsics.checkNotNullExpressionValue(aFf1gSDKRegisterClient, "");
                return aFf1gSDKRegisterClient;
            }

            {
                super(0);
            }
        });
        this.areAllFieldsValid = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1uSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService monetizationNetwork = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                return monetizationNetwork;
            }

            {
                super(0);
            }
        });
        this.component1 = "6.17.0";
        this.component4 = LazyKt.lazy(new Function0<AFc1bSDK>() { // from class: com.appsflyer.internal.AFd1uSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFc1bSDK invoke() {
                AFc1iSDK aFc1iSDKAFInAppEventType = AFd1uSDK.getCurrencyIso4217Code(AFd1uSDK.this).AFInAppEventType();
                Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFInAppEventType, "");
                return new AFc1bSDK(aFc1iSDKAFInAppEventType);
            }

            {
                super(0);
            }
        });
        this.component3 = LazyKt.lazy(new Function0<AFd1ySDK>() { // from class: com.appsflyer.internal.AFd1uSDK.6
            private static final byte[] $$a = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
            private static final int $$b = 236;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int $b = 0;
            private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {334206098, -1899118877, 889501777, 867470282, -2125585434, -2136598645, 270492288, -368647153, 1272650958, -1586268928, 659332700, 861018409, -2049159225, -2046697466, -1451463508, 192815185, -1766637499, -577935703};
            private static char[] TuitionPaymentFragmentbindingInflater1 = {64109, 36650, 4105, 42454, 12006, 45180, 17733, 52960, 21384, 58699, 28262, 62258, 34027, 2479, 37660, 9274, 43504, 13018, 50285, 18811, 53822, 26609, 59559, 29272, 1810, 34975, 7584, 42824, 10352, 48430, 18151, 12850, 18185, 55379, 28078, 59088, 30763, 36200, 1723, 39930, 11569, 42529, 15175, 19604, 49621, 19843, 14517, 42996, 4667, 39273, 1942, 62160, 31043, 58441, 21132, 55734, 17637, 13099, 48745, 9352, 37787, 7682, 34118, 29646, 65161, 26103, 53292, 24431, 50588, 45277, 16150, 43617, 4239, 40888, 2808, 45261, 50670, 23211, 61307, 25659, 64215, 3997, 33859, 6419, 45004, 45508, 50315, 23515, 60935, 25921, 45563, 50368, 23450, 61054, 25878, 64498, 3774, 34162, 6202, 44798, 9667, 16943, 14105, 43096, 7575, 38597, 2106, 64892, 30447, 60389, 23840, 54810, 19273, 15495, 45509, 11044, 39991, 4526, 35562, 31842, 61734, 27219, 57220, 20678, 51760, 48994, 12458, 42486, 7976, 53758, 42188, 15248, 36446, 1374, 39930, 28327, 58744, 30761, 52967, 17863, 55443, 44865, 8799, 47337, 4006, 33398, 6441, 61368, 25335, 63957, 19465, 49995, 22984, 11433, 41847, 13866, 36094, 974, 38536, 27993, 57362, 30400, 52648};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 4883369313546519717L;

            public final AFd1ySDK AFAdRevenueData() {
                int i = 2 % 2;
                AFd1ySDK aFd1ySDK = new AFd1ySDK(AFd1uSDK.this.getRevenue());
                int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 3;
                $b = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 73 / 0;
                }
                return aFd1ySDK;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ AFd1ySDK invoke() {
                int i = 2 % 2;
                int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
                $b = i2 % 128;
                int i3 = i2 % 2;
                AFd1ySDK aFd1ySDKAFAdRevenueData = AFAdRevenueData();
                if (i3 != 0) {
                    int i4 = 58 / 0;
                }
                return aFd1ySDKAFAdRevenueData;
            }

            private static void c(char c, int i, int i2, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i5 = $10 + 37;
                    $11 = i5 % 128;
                    if (i5 % i3 == 0) {
                        int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i - i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 2188, 39 - TextUtils.lastIndexOf("", '0', 0), 841711447, false, $$c(b, b, $$a[1]), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 33017), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3012, View.MeasureSpec.getMode(0) + 26, 321985076, false, $$c(b2, b3, (byte) (b3 | 49)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 3376 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, -968507904, false, $$c(b4, b5, (byte) (b5 | 46)), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1[i + i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b6 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), 2186 - MotionEvent.axisFromString(""), Drawable.resolveOpacity(0, 0) + 40, 841711447, false, $$c(b6, b6, $$a[1]), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33017), (ViewConfiguration.getEdgeSlop() >> 16) + 3011, KeyEvent.normalizeMetaState(0) + 26, 321985076, false, $$c(b7, b8, (byte) (b8 | 49)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 36505), Drawable.resolveOpacity(0, 0) + 3376, TextUtils.getTrimmedLength("") + 17, -968507904, false, $$c(b9, b10, (byte) (b10 | 46)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                    }
                    i3 = 2;
                }
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                int i8 = $10 + 93;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) ((Process.myPid() >> 22) + 36505), 3376 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 17, -968507904, false, $$c(b11, b12, (byte) (b12 | 46)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                }
                objArr[0] = new String(cArr);
            }

            private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
                int length;
                int[] iArr2;
                int i2 = 2;
                int i3 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i4 = -1870535734;
                int i5 = 1;
                int i6 = 0;
                if (iArr3 != null) {
                    int i7 = $11 + 81;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        length = iArr3.length;
                        iArr2 = new int[length];
                    } else {
                        length = iArr3.length;
                        iArr2 = new int[length];
                    }
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 125;
                        $10 = i9 % 128;
                        if (i9 % i2 != 0) {
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[i6] = Integer.valueOf(iArr3[i8]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b = (byte) i6;
                                    byte b2 = b;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(i6, i6), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3290, 31 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1948206109, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                                }
                                iArr2[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(iArr3[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), 3291 - View.MeasureSpec.makeMeasureSpec(0, 0), 31 - TextUtils.indexOf("", ""), 1948206109, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                            }
                            iArr2[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i8++;
                        }
                        i2 = 2;
                        i4 = -1870535734;
                        i6 = 0;
                    }
                    iArr3 = iArr2;
                }
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i10 = $10 + 63;
                    $11 = i10 % 128;
                    int i11 = 2;
                    int i12 = i10 % 2;
                    int i13 = 0;
                    while (i13 < length3) {
                        int i14 = $10 + 55;
                        $11 = i14 % 128;
                        int i15 = i14 % i11;
                        Object[] objArr4 = new Object[i5];
                        objArr4[0] = Integer.valueOf(iArr5[i13]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 3292, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, 1948206109, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        i13++;
                        iArr5 = iArr5;
                        i11 = 2;
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
                    int i16 = 17;
                    for (int i17 = 1; i16 > i17; i17 = 1) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i16];
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2560 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 29 - (ViewConfiguration.getJumpTapTimeout() >> 16), 683220507, false, $$c(b7, b8, (byte) (b8 | 56)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i16--;
                    }
                    int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr6 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (28878 - Process.getGidForName("")), 348 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    int i20 = $10 + 69;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    c = 0;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            {
                super(0);
            }

            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2) {
                char c;
                int i3;
                int i4;
                int i5;
                int offsetAfter;
                int i6;
                int i7;
                int i8;
                Object[] objArr;
                int[] iArr;
                int i9;
                int i10;
                int maxKeyCode;
                int i11;
                int i12;
                int threadPriority;
                int threadPriority2;
                int i13;
                Object obj;
                int i14;
                int i15;
                Object[] objArr2;
                int[] iArr2;
                int i16;
                int i17;
                int i18;
                Class<?> cls;
                int[] iArr3;
                int i19;
                Class<?> cls2;
                int i20;
                int[] iArr4;
                int i21;
                int i22 = 2 % 2;
                if (context != null) {
                    int i23 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                    $b = i23 % 128;
                    int i24 = i23 % 2;
                    try {
                        int i25 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i26 = (i25 & 31) + (i25 | 31);
                        Object[] objArr3 = new Object[1];
                        a(new int[]{1273398828, -1870006410, 1521336430, -1090284906, 2019120179, -991052569, -216680771, -457583815, 418642560, -1251481802, -913668533, -2088259234, -1349228441, -1206760675, 759221962, -751261438, 895228161, -1848270781}, i26, objArr3);
                        try {
                            Object[] objArr4 = {(String) objArr3[0]};
                            int[] iArr5 = {-1264767755, -1202992369, -1109208242, -125411576, 867828408, 1200032750, 222337868, -2076056847, 439140833, -93401723, 1949882337, 1843705235, -1288078941, -89522548, -1562564929, -812611748, 311546596, -1207890276, -552083584, 1457926860, -1876103979, -835418165};
                            int i27 = -ImageFormat.getBitsPerPixel(0);
                            int i28 = i27 * (-115);
                            int i29 = ((i28 | (-4255)) << 1) - (i28 ^ (-4255));
                            int i30 = $b;
                            int i31 = (i30 & 63) + (i30 | 63);
                            $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i31 % 128;
                            if (i31 % 2 == 0) {
                                int i32 = ~i;
                                int i33 = -(i27 | i);
                                i3 = ((i29 % ((-116) << (~(((i32 & i27) | (i32 ^ i27)) | 37)))) - (~(-((i33 ^ 116) + ((i33 & 116) << 1))))) - 1;
                                int i34 = ~i27;
                                i4 = ~((i34 & (-38)) | (i34 ^ (-38)));
                                i5 = ((-38) & i) | ((-38) ^ i);
                            } else {
                                int i35 = (~i) | i27;
                                int i36 = -(-((~((i35 & 37) | (i35 ^ 37))) * (-116)));
                                i3 = (i29 ^ i36) + ((i36 & i29) << 1) + (((i27 ^ i) | (i27 & i)) * 116);
                                int i37 = ~i27;
                                i4 = ~((i37 & (-38)) | (i37 ^ (-38)));
                                i5 = ((-38) ^ i) | ((-38) & i);
                            }
                            int i38 = -(-(116 * (i4 | (i5 ^ (-1)))));
                            int i39 = (i3 & i38) + (i38 | i3);
                            Object[] objArr5 = new Object[1];
                            a(iArr5, i39, objArr5);
                            Object objNewInstance = Class.forName((String) objArr5[0]).getDeclaredConstructor(String.class).newInstance(objArr4);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                            int iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
                            int i40 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i41 = ((i40 | 125) << 1) - (i40 ^ 125);
                            $b = i41 % 128;
                            int i42 = i41 % 2;
                            int i43 = (-445) * iResolveOpacity;
                            int i44 = (i43 & (-8623210)) + (i43 | (-8623210));
                            int i45 = ~iResolveOpacity;
                            int i46 = ((~((i45 ^ (-19379)) | (i45 & (-19379)))) | (~((~iTuitionPaymentFragmentbindingInflater1) | (-19379)))) * 446;
                            int i47 = (i44 & i46) + (i46 | i44);
                            int i48 = ~iResolveOpacity;
                            char c2 = (char) (((i47 - (~(((~((((-19379) ^ iResolveOpacity) | (iResolveOpacity & (-19379))) | iTuitionPaymentFragmentbindingInflater1)) | (~((i48 & 19378) | (i48 ^ 19378)))) * 446))) - 1) + ((~(((-19379) & i45) | (i45 ^ (-19379)))) * 446));
                            int iMyPid = Process.myPid() >> 22;
                            int i49 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
                            $b = i49 % 128;
                            if (i49 % 2 != 0) {
                                offsetAfter = TextUtils.getOffsetAfter("", 0);
                                int i50 = 85 % offsetAfter;
                                i6 = (i50 ^ (-2635)) + ((i50 & (-2635)) << 1);
                                i8 = ~offsetAfter;
                                i7 = ~((i8 ^ (-32)) | (i8 & (-32)));
                            } else {
                                offsetAfter = TextUtils.getOffsetAfter("", 0);
                                int i51 = offsetAfter * 85;
                                i6 = ((i51 | 2635) << 1) - (i51 ^ 2635);
                                int i52 = ~offsetAfter;
                                i7 = ~((i52 & (-32)) | (i52 ^ (-32)));
                                i8 = ~offsetAfter;
                            }
                            int i53 = ~i;
                            int i54 = ~((i8 ^ i53) | (i8 & i53));
                            int i55 = (i7 ^ i54) | (i7 & i54);
                            int i56 = ~((-32) | i53);
                            int i57 = (i55 ^ i56) | (i55 & i56);
                            int i58 = (offsetAfter ^ 31) | (offsetAfter & 31);
                            int i59 = ~((i58 ^ i) | (i58 & i));
                            int i60 = i6 + ((-84) * ((i57 ^ i59) | (i59 & i57)));
                            int i61 = ~(((-32) ^ i) | ((-32) & i));
                            int i62 = (i61 & offsetAfter) | (offsetAfter ^ i61);
                            int i63 = ~((i53 ^ 31) | (i53 & 31));
                            int i64 = ((i62 & i63) | (i62 ^ i63)) * (-84);
                            int i65 = (i60 & i64) + (i64 | i60);
                            int i66 = ~(i53 | 31);
                            int i67 = ~i58;
                            int i68 = (i65 - (~(-(-(((i66 & i67) | (i66 ^ i67)) * 84))))) - 1;
                            Object[] objArr6 = new Object[1];
                            c(c2, iMyPid, i68, objArr6);
                            String str = (String) objArr6[0];
                            int i69 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                            $b = i69 % 128;
                            try {
                                if (i69 % 2 != 0) {
                                    objArr = new Object[0];
                                    objArr[1] = str;
                                    iArr = new int[]{-1264767755, -1202992369, -1109208242, -125411576, 867828408, 1200032750, 222337868, -2076056847, 439140833, -93401723, 1949882337, 1843705235, -1288078941, -89522548, -1562564929, -812611748, 311546596, -1207890276, -552083584, 1457926860, -1876103979, -835418165};
                                    i9 = 59;
                                    i10 = 1;
                                } else {
                                    objArr = new Object[]{str};
                                    iArr = new int[]{-1264767755, -1202992369, -1109208242, -125411576, 867828408, 1200032750, 222337868, -2076056847, 439140833, -93401723, 1949882337, 1843705235, -1288078941, -89522548, -1562564929, -812611748, 311546596, -1207890276, -552083584, 1457926860, -1876103979, -835418165};
                                    i9 = 38;
                                    i10 = 0;
                                }
                                int iMakeMeasureSpec = i9 - View.MeasureSpec.makeMeasureSpec(i10, 0);
                                Object[] objArr7 = new Object[1];
                                a(iArr, iMakeMeasureSpec, objArr7);
                                Object objNewInstance2 = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr);
                                try {
                                    int i70 = -(-TextUtils.getTrimmedLength(""));
                                    int i71 = (i70 ^ 23) + ((i70 & 23) << 1);
                                    Object[] objArr8 = new Object[1];
                                    a(new int[]{2109313093, -1408435075, -1162148595, -1779420273, 1884830999, 284258496, 472549001, 2110547421, -868452254, -315686845, 985885118, 928937966, -947259772, 1254202412}, i71, objArr8);
                                    Class<?> cls3 = Class.forName((String) objArr8[0]);
                                    int i72 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                    int i73 = (i72 & 16) + (i72 | 16);
                                    Object[] objArr9 = new Object[1];
                                    a(new int[]{1503829265, -1243822291, -1310895215, -1524992037, 2011088592, 1945906459, -1936915880, 2003745935, 496752472, -1785219916, 2143451478, -1008869392}, i73, objArr9);
                                    Object objInvoke = cls3.getMethod((String) objArr9[0], null).invoke(context, null);
                                    try {
                                        int i74 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        int iTuitionPaymentFragmentbindingInflater2 = zzo.TuitionPaymentFragmentbindingInflater1();
                                        int i75 = i74 * 714;
                                        int i76 = (i75 ^ (-16376)) + ((i75 & (-16376)) << 1);
                                        int i77 = ~i74;
                                        int i78 = ~iTuitionPaymentFragmentbindingInflater2;
                                        int i79 = ~((i77 ^ i78) | (i78 & i77));
                                        int i80 = ~((i77 ^ 23) | (i77 & 23));
                                        int i81 = (i79 ^ i80) | (i79 & i80);
                                        int i82 = (-24) | i74;
                                        int i83 = ~((i82 ^ iTuitionPaymentFragmentbindingInflater2) | (i82 & iTuitionPaymentFragmentbindingInflater2));
                                        int i84 = ((i81 ^ i83) | (i81 & i83)) * (-713);
                                        int i85 = (i76 & i84) + (i84 | i76) + ((~(((-24) ^ i74) | ((-24) & i74) | iTuitionPaymentFragmentbindingInflater2)) * 1426);
                                        int i86 = ~iTuitionPaymentFragmentbindingInflater2;
                                        int i87 = i85 + ((~((i86 & (-24)) | ((-24) ^ i86))) * 713);
                                        Object[] objArr10 = new Object[1];
                                        a(new int[]{2109313093, -1408435075, -1162148595, -1779420273, 1884830999, 284258496, 472549001, 2110547421, -868452254, -315686845, 985885118, 928937966, -947259772, 1254202412}, i87, objArr10);
                                        Class<?> cls4 = Class.forName((String) objArr10[0]);
                                        int trimmedLength = TextUtils.getTrimmedLength("");
                                        char c3 = (char) ((trimmedLength ^ 33737) + ((trimmedLength & 33737) << 1));
                                        int i88 = $b + 99;
                                        $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i88 % 128;
                                        if (i88 % 2 == 0) {
                                            maxKeyCode = 31 >> (KeyEvent.getMaxKeyCode() * 14);
                                            i11 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            i12 = 99;
                                        } else {
                                            maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 31;
                                            i11 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                            i12 = 15;
                                        }
                                        int i89 = (-500) * i11;
                                        int i90 = i12 * (-500);
                                        int i91 = (i89 & i90) + (i89 | i90);
                                        int i92 = ~i12;
                                        int i93 = ~(i92 | i11);
                                        int i94 = ~i11;
                                        int i95 = (i94 ^ i12) | (i94 & i12);
                                        int i96 = -(-(((~((i95 ^ i) | (i95 & i))) | i93) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                                        int i97 = ((i91 | i96) << 1) - (i91 ^ i96);
                                        int i98 = -(-((~(i94 | i92)) * 1002));
                                        int i99 = (i97 & i98) + (i98 | i97);
                                        int i100 = ~i11;
                                        int i101 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
                                        $b = i101 % 128;
                                        int i102 = i101 % 2;
                                        int i103 = (i100 & i53) | (i100 ^ i53);
                                        Object[] objArr11 = new Object[1];
                                        c(c3, maxKeyCode, i99 + (TypedValues.PositionType.TYPE_TRANSITION_EASING * (~((i103 & i12) | (i103 ^ i12)))), objArr11);
                                        try {
                                            Object[] objArr12 = {cls4.getMethod((String) objArr11[0], null).invoke(context, null), 64};
                                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int i104 = iMakeMeasureSpec2 * (-375);
                                            int i105 = (i104 & (-12375)) + (i104 | (-12375));
                                            int i106 = ~iMakeMeasureSpec2;
                                            int i107 = ~((i106 & (-34)) | (i106 ^ (-34)));
                                            int i108 = (i107 & i) | (i ^ i107);
                                            int i109 = ~((iMakeMeasureSpec2 ^ 33) | (iMakeMeasureSpec2 & 33));
                                            int i110 = ((i108 & i109) | (i108 ^ i109)) * 376;
                                            int i111 = ((i105 | i110) << 1) - (i110 ^ i105);
                                            int i112 = ~i;
                                            int i113 = ~((i112 ^ iMakeMeasureSpec2) | (i112 & iMakeMeasureSpec2));
                                            int i114 = ~(iMakeMeasureSpec2 | 33);
                                            int i115 = ((i113 & i114) | (i113 ^ i114)) * (-376);
                                            int i116 = (i111 ^ i115) + ((i115 & i111) << 1);
                                            int i117 = -(-(((~((~iMakeMeasureSpec2) | i)) | 33) * 376));
                                            int i118 = (i116 ^ i117) + ((i117 & i116) << 1);
                                            Object[] objArr13 = new Object[1];
                                            a(new int[]{991577341, -294450869, 115199654, -1628291907, -318456055, 1281760275, 2000072190, -196768915, -391466530, -1803620904, 876209516, 328263288, 250956817, -1797263817, -2126465395, 1693750568, -1559159582, 1665506825, 916940170, 1543772033}, i118, objArr13);
                                            Class<?> cls5 = Class.forName((String) objArr13[0]);
                                            Object[] objArr14 = new Object[1];
                                            a(new int[]{1319319634, -608864495, -1231961303, 1277397323, 1911931739, -1626198079, -1179274420, 1742181485, 1229777085, 694688315}, TextUtils.indexOf((CharSequence) "", '0') + 15, objArr14);
                                            Object objInvoke2 = cls5.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke, objArr12);
                                            int i119 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int i120 = -TextUtils.indexOf((CharSequence) "", '0');
                                            int i121 = (i120 * 193) + 8492;
                                            int i122 = ~i120;
                                            int i123 = ~((i122 & 44) | (i122 ^ 44));
                                            int i124 = -(-(((i123 & i53) | (i53 ^ i123)) * (-192)));
                                            int i125 = (i121 ^ i124) + ((i121 & i124) << 1);
                                            int i126 = ~i120;
                                            int i127 = ~((i126 ^ (-45)) | (i126 & (-45)));
                                            int i128 = ~(((-45) & i112) | ((-45) ^ i112));
                                            int i129 = (i125 - (~(((i127 & i128) | (i127 ^ i128)) * (-384)))) - 1;
                                            int i130 = i126 | (-45);
                                            int i131 = ~((i130 & i) | (i130 ^ i));
                                            int i132 = (-45) | i112;
                                            int i133 = ~((i132 & i120) | (i132 ^ i120));
                                            int i134 = (i131 & i133) | (i131 ^ i133);
                                            int i135 = (i120 & 44) | (i120 ^ 44);
                                            Object[] objArr15 = new Object[1];
                                            c((char) ((i119 & 64638) + (i119 | 64638)), (i129 - (~(-(-(((~((i135 & i) | (i135 ^ i))) | i134) * DerHeader.TAG_CLASS_PRIVATE))))) - 1, (-19) - (~AndroidCharacter.getMirror('0')), objArr15);
                                            Class<?> cls6 = Class.forName((String) objArr15[0]);
                                            int i136 = -Gravity.getAbsoluteGravity(0, 0);
                                            int i137 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            Object[] objArr16 = new Object[1];
                                            c((char) (((i136 | 290) << 1) - (i136 ^ 290)), (i137 ^ 74) + ((i137 & 74) << 1), 9 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))), objArr16);
                                            Object[] objArr17 = (Object[]) cls6.getField((String) objArr16[0]).get(objInvoke2);
                                            int length = objArr17.length;
                                            int i138 = 0;
                                            while (true) {
                                                if (i138 < length) {
                                                    int i139 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                    int i140 = ((i139 | 5) << 1) - (i139 ^ 5);
                                                    $b = i140 % 128;
                                                    int i141 = i140 % 2;
                                                    Object obj2 = objArr17[i138];
                                                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int i142 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
                                                    $b = i142 % 128;
                                                    if (i142 % 2 != 0) {
                                                        threadPriority = 85 % ((Process.getThreadPriority(0) + 118) << 56);
                                                        i13 = 3;
                                                        threadPriority2 = Process.getThreadPriority(1);
                                                    } else {
                                                        threadPriority = 84 - (~(-((Process.getThreadPriority(0) + 20) >> 6)));
                                                        threadPriority2 = Process.getThreadPriority(0);
                                                        i13 = 5;
                                                    }
                                                    int i143 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                                                    int i144 = i143 % 128;
                                                    $b = i144;
                                                    int i145 = i143 % 2 != 0 ? 79 : 20;
                                                    Object[] objArr18 = objArr17;
                                                    int i146 = ((980 * i145) - (~(-(-(threadPriority2 * (-978)))))) - 1;
                                                    int i147 = ~threadPriority2;
                                                    int i148 = i146 + ((~((i147 ^ i112) | (i147 & i112))) * 979);
                                                    int i149 = ((i145 ^ i) | (i145 & i)) * (-979);
                                                    int i150 = (i148 ^ i149) + ((i148 & i149) << 1);
                                                    int i151 = ~((i147 & i) | (i147 ^ i));
                                                    int i152 = ~(i112 | i145);
                                                    int i153 = i150 + (((i151 & i152) | (i151 ^ i152)) * 979);
                                                    int i154 = (i144 ^ 121) + ((i144 & 121) << 1);
                                                    $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i154 % 128;
                                                    if (i154 % 2 == 0) {
                                                        Object[] objArr19 = new Object[1];
                                                        c(pressedStateDuration, threadPriority, i13 << (i153 + 6), objArr19);
                                                        obj = objArr19[0];
                                                    } else {
                                                        Object[] objArr20 = new Object[1];
                                                        c(pressedStateDuration, threadPriority, i13 + (i153 >> 6), objArr20);
                                                        obj = objArr20[0];
                                                    }
                                                    try {
                                                        Object[] objArr21 = {(String) obj};
                                                        int i155 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                        Object[] objArr22 = new Object[1];
                                                        a(new int[]{-1162840789, -788456036, 1370409541, -2128271057, 1179933642, -437350623, 641001267, -325091292, 1415568312, -1495659689, -1606680358, -213851303, 125763557, -460784557, -171443034, -2018172353, -1358439209, 1835003201, -1936370596, 1048157216, -941601132, 1094760197}, (i155 & 38) + (i155 | 38), objArr22);
                                                        Class<?> cls7 = Class.forName((String) objArr22[0]);
                                                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                                        int i156 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                        int i157 = i156 * (-919);
                                                        int i158 = (i157 & (-81791)) + (i157 | (-81791));
                                                        int i159 = ~i156;
                                                        int i160 = $b;
                                                        int i161 = (i160 & 73) + (i160 | 73);
                                                        int i162 = length;
                                                        $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i161 % 128;
                                                        int i163 = i161 % 2;
                                                        int i164 = ~((i159 ^ (-90)) | (i159 & (-90)) | i);
                                                        int i165 = (-90) | i112;
                                                        int i166 = ~((i165 ^ i156) | (i165 & i156));
                                                        int i167 = i158 + (920 * ((i164 ^ i166) | (i164 & i166)));
                                                        int i168 = ~((i159 ^ (-90)) | (i159 & (-90)));
                                                        int i169 = ~((i159 ^ i53) | (i159 & i53));
                                                        int i170 = i167 + (((i168 ^ i169) | (i168 & i169)) * 920);
                                                        int i171 = ~(i159 | (-90) | i112);
                                                        int i172 = ~i156;
                                                        int i173 = (i172 & 89) | (i172 ^ 89);
                                                        int i174 = (i156 & (-90)) | ((-90) ^ i156);
                                                        int i175 = i170 + ((i171 | (~((i173 & i) | (i173 ^ i))) | (~((i174 & i) | (i174 ^ i)))) * 920);
                                                        int i176 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                        int i177 = $b;
                                                        int i178 = (i177 & 59) + (i177 | 59);
                                                        $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i178 % 128;
                                                        if (i178 % 2 == 0) {
                                                            i14 = ((-1939) << i176) >>> 1988608;
                                                            i15 = (-12) | i176;
                                                        } else {
                                                            int i179 = i176 * (-1939);
                                                            i14 = (i179 ^ 10681) + ((i179 & 10681) << 1);
                                                            i15 = ((-12) ^ i176) | ((-12) & i176);
                                                        }
                                                        int i180 = ~i15;
                                                        int i181 = ~((i53 ^ 11) | (i53 & 11));
                                                        int i182 = -(-((-970) * ((i180 ^ i181) | (i180 & i181))));
                                                        int i183 = ((i14 | i182) << 1) - (i182 ^ i14);
                                                        int i184 = ~i176;
                                                        int i185 = -(-((~((i184 & 11) | (i184 ^ 11))) * 1940));
                                                        int i186 = (i183 & i185) + (i185 | i183) + (((~((~i176) | (-12))) | (~((i53 ^ 11) | (i53 & 11)))) * 970);
                                                        Object[] objArr23 = new Object[1];
                                                        c(cCombineMeasuredStates, i175, i186, objArr23);
                                                        Object objInvoke3 = cls7.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                                        try {
                                                            int i187 = -View.MeasureSpec.getSize(0);
                                                            int iTuitionPaymentFragmentbindingInflater3 = zzo.TuitionPaymentFragmentbindingInflater1();
                                                            int i188 = i187 * 50;
                                                            int i189 = (i188 & (-6054546)) + (i188 | (-6054546));
                                                            int i190 = ~iTuitionPaymentFragmentbindingInflater3;
                                                            int i191 = ~(((-62419) ^ i190) | ((-62419) & i190));
                                                            int i192 = ~(((-62419) ^ i187) | ((-62419) & i187));
                                                            int i193 = -(-(((i191 ^ i192) | (i192 & i191)) * 98));
                                                            int i194 = (i189 ^ i193) + ((i193 & i189) << 1);
                                                            int i195 = ~(i190 | (~i187));
                                                            int i196 = ((-62419) & i195) | ((-62419) ^ i195);
                                                            int i197 = ~(i187 | iTuitionPaymentFragmentbindingInflater3);
                                                            int i198 = (i194 - (~(((i196 & i197) | (i196 ^ i197)) * (-49)))) - 1;
                                                            int i199 = ~((iTuitionPaymentFragmentbindingInflater3 & (-62419)) | ((-62419) ^ iTuitionPaymentFragmentbindingInflater3));
                                                            int i200 = ~(i187 | 62418);
                                                            char c4 = (char) ((i198 - (~(((i200 & i199) | (i199 ^ i200)) * 49))) - 1);
                                                            int i201 = -Color.rgb(0, 0, 0);
                                                            int i202 = -(ViewConfiguration.getTouchSlop() >> 8);
                                                            Object[] objArr24 = new Object[1];
                                                            c(c4, ((i201 | (-16777115)) << 1) - (i201 ^ (-16777115)), (i202 & 28) + (i202 | 28), objArr24);
                                                            Class<?> cls8 = Class.forName((String) objArr24[0]);
                                                            int i203 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                            int i204 = i203 * 273;
                                                            int i205 = (i204 & (-2981)) + (i204 | (-2981));
                                                            int i206 = ~i203;
                                                            int i207 = (i206 ^ (-12)) | (i206 & (-12));
                                                            int i208 = (i203 ^ 11) | (i203 & 11);
                                                            int i209 = i138;
                                                            int i210 = -(-(((~((i208 ^ i) | (i208 & i))) | (~((i207 ^ i53) | (i207 & i53)))) * (-272)));
                                                            int i211 = (i205 & i210) + (i210 | i205);
                                                            int i212 = ~((i206 ^ 11) | (i206 & 11));
                                                            int i213 = ~((i206 & i) | (i206 ^ i));
                                                            int i214 = ((i212 & i213) | (i212 ^ i213)) * (-272);
                                                            int i215 = (i211 ^ i214) + ((i214 & i211) << 1);
                                                            int i216 = ~(i203 | i);
                                                            int i217 = ((i216 & 11) | (i216 ^ 11)) * 272;
                                                            int i218 = (i215 ^ i217) + ((i217 & i215) << 1);
                                                            Object[] objArr25 = new Object[1];
                                                            a(new int[]{-2093921869, -475652603, -2012017720, -70251053, -1572235617, 1345956267, 1213688542, 36957092}, i218, objArr25);
                                                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) cls8.getMethod((String) objArr25[0], null).invoke(obj2, null));
                                                            int i219 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                            int i220 = (i219 & 23) + (i219 | 23);
                                                            $b = i220 % 128;
                                                            if (i220 % 2 != 0) {
                                                                try {
                                                                    objArr2 = new Object[0];
                                                                    objArr2[0] = byteArrayInputStream;
                                                                    iArr2 = new int[]{-1162840789, -788456036, 1370409541, -2128271057, 1179933642, -437350623, 641001267, -325091292, 1415568312, -1495659689, -1606680358, -213851303, 125763557, -460784557, -171443034, -2018172353, -1358439209, 1835003201, -1936370596, 1048157216, -941601132, 1094760197};
                                                                    i17 = 75;
                                                                    i16 = -(ViewConfiguration.getScrollDefaultDelay() / 8);
                                                                } catch (Throwable th) {
                                                                    Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            } else {
                                                                objArr2 = new Object[]{byteArrayInputStream};
                                                                iArr2 = new int[]{-1162840789, -788456036, 1370409541, -2128271057, 1179933642, -437350623, 641001267, -325091292, 1415568312, -1495659689, -1606680358, -213851303, 125763557, -460784557, -171443034, -2018172353, -1358439209, 1835003201, -1936370596, 1048157216, -941601132, 1094760197};
                                                                i16 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                i17 = 37;
                                                            }
                                                            int i221 = i16 * 989;
                                                            int i222 = -(-(i17 * (-987)));
                                                            int i223 = (i221 ^ i222) + ((i221 & i222) << 1);
                                                            int i224 = ~i17;
                                                            int i225 = (i224 ^ i53) | (i224 & i53);
                                                            int i226 = ~((i225 ^ i16) | (i225 & i16));
                                                            int i227 = (i16 ^ i17) | (i16 & i17);
                                                            int i228 = ~((i227 ^ i) | (i227 & i));
                                                            int i229 = i223 + (((i226 ^ i228) | (i228 & i226)) * 988);
                                                            int i230 = ~i17;
                                                            int i231 = -(-(((i16 ^ i230) | (i16 & i230)) * (-988)));
                                                            int i232 = (i229 & i231) + (i229 | i231);
                                                            int i233 = ~i16;
                                                            int i234 = ~((i233 ^ i224) | (i224 & i233));
                                                            int i235 = ~((i230 & i) | (i230 ^ i));
                                                            int i236 = i16 | i112;
                                                            int i237 = ((i235 & i234) | (i234 ^ i235) | (~((i236 & i17) | (i236 ^ i17)))) * 988;
                                                            int i238 = (i232 ^ i237) + ((i232 & i237) << 1);
                                                            Object[] objArr26 = new Object[1];
                                                            a(iArr2, i238, objArr26);
                                                            Class<?> cls9 = Class.forName((String) objArr26[0]);
                                                            Object[] objArr27 = new Object[1];
                                                            a(new int[]{1249603, 2045270658, 727027319, -1307231609, 435400708, -1805436725, -930856254, -825431792, 148491813, 2061303211, 819112336, 837659572}, 18 - (~ExpandableListView.getPackedPositionType(0L)), objArr27);
                                                            Object objInvoke4 = cls9.getMethod((String) objArr27[0], InputStream.class).invoke(objInvoke3, objArr2);
                                                            try {
                                                                int maxKeyCode2 = KeyEvent.getMaxKeyCode() >> 16;
                                                                int iTuitionPaymentFragmentbindingInflater4 = zzo.TuitionPaymentFragmentbindingInflater1();
                                                                int i239 = maxKeyCode2 * 934;
                                                                int i240 = ((i239 | (-22912288)) << 1) - (i239 ^ (-22912288));
                                                                int i241 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                                                                $b = i241 % 128;
                                                                int i242 = i241 % 2;
                                                                int i243 = ~maxKeyCode2;
                                                                int i244 = ~iTuitionPaymentFragmentbindingInflater4;
                                                                int i245 = -(-((-933) * ((~(i243 | i244)) | (-24585))));
                                                                int i246 = (i240 ^ i245) + ((i245 & i240) << 1);
                                                                int i247 = ~((i244 & (-24585)) | ((-24585) ^ i244));
                                                                int i248 = ~(((-24585) ^ maxKeyCode2) | ((-24585) & maxKeyCode2));
                                                                char c5 = (char) ((((i246 - (~(((i247 & i248) | (i247 ^ i248)) * 933))) - 1) - (~((~((maxKeyCode2 & 24584) | (maxKeyCode2 ^ 24584))) * 933))) - 1);
                                                                int i249 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                                int i250 = (i249 & 128) + (i249 | 128);
                                                                int iBlue = Color.blue(0);
                                                                int i251 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                int i252 = ((i251 | 43) << 1) - (i251 ^ 43);
                                                                $b = i252 % 128;
                                                                int i253 = i252 % 2;
                                                                int i254 = (-129) * iBlue;
                                                                int i255 = (((i254 ^ 4454) + ((i254 & 4454) << 1)) - (~(-(-((~((((-35) ^ i53) | ((-35) & i53)) | iBlue)) * 130))))) - 1;
                                                                int i256 = ~((-35) | iBlue);
                                                                int i257 = (-1781112710) + (((-390595245) | i53) * (-369));
                                                                int i258 = ((-524909229) | (~((930907053 ^ i53) | (930907053 & i53)))) * (-369);
                                                                int i259 = (i257 ^ i258) + ((i257 & i258) << 1);
                                                                int i260 = ~(((-930907054) ^ i) | ((-930907054) & i));
                                                                int i261 = (540311809 ^ i260) | (540311809 & i260);
                                                                int i262 = (930907053 ^ i53) | (930907053 & i53);
                                                                int i263 = ~((i262 ^ (-524909229)) | (i262 & (-524909229)));
                                                                int i264 = ((i261 ^ i263) | (i263 & i261)) * 369;
                                                                int i265 = (i259 & i264) + (i259 | i264);
                                                                int iTuitionPaymentFragmentbindingInflater5 = zzo.TuitionPaymentFragmentbindingInflater1();
                                                                int i266 = ~(1783362994 | (~iTuitionPaymentFragmentbindingInflater5));
                                                                int i267 = (i266 ^ 1644216578) | (i266 & 1644216578);
                                                                int i268 = ~((-1783362995) | iTuitionPaymentFragmentbindingInflater5);
                                                                int i269 = (-590897097) - (~(((i267 ^ i268) | (i267 & i268)) * (-338)));
                                                                int i270 = ~iTuitionPaymentFragmentbindingInflater5;
                                                                int i271 = ~((1783362994 ^ i270) | (1783362994 & i270));
                                                                int i272 = ~(((-139146417) ^ iTuitionPaymentFragmentbindingInflater5) | ((-139146417) & iTuitionPaymentFragmentbindingInflater5));
                                                                int i273 = i256 * (-260);
                                                                if (i265 > (i269 - (~(((i271 ^ i272) | (i271 & i272)) * 338))) - 1) {
                                                                    int i274 = i255 << i273;
                                                                    int i275 = ~iBlue;
                                                                    int i276 = ~((i275 & 34) | (i275 ^ 34));
                                                                    int i277 = (iBlue & (-35)) | ((-35) ^ iBlue);
                                                                    int i278 = ~((i277 & i) | (i277 ^ i));
                                                                    int i279 = i274 >>> (130 / ((i278 & i276) | (i276 ^ i278)));
                                                                    Object[] objArr28 = new Object[1];
                                                                    c(c5, i250, i279, objArr28);
                                                                    Class<?> cls10 = Class.forName((String) objArr28[0]);
                                                                    iArr3 = new int[]{517446448, -1000622821, 328858067, -672381283, -961683389, -207371816, 674873108, -1178490389, -1773927470, -402334250, -1289500351, -397583525, 1274169195, 624294664};
                                                                    i19 = 102;
                                                                    cls = cls10;
                                                                    i18 = 0;
                                                                } else {
                                                                    int i280 = -(-i273);
                                                                    int i281 = ((i255 | i280) << 1) - (i280 ^ i255);
                                                                    int i282 = ~iBlue;
                                                                    int i283 = ~((i282 & 34) | (i282 ^ 34));
                                                                    int i284 = ~((iBlue & (-35)) | ((-35) ^ iBlue) | i);
                                                                    int i285 = (i281 - (~(-(-(((i284 & i283) | (i283 ^ i284)) * 130))))) - 1;
                                                                    Object[] objArr29 = new Object[1];
                                                                    c(c5, i250, i285, objArr29);
                                                                    i18 = 0;
                                                                    cls = Class.forName((String) objArr29[0]);
                                                                    iArr3 = new int[]{517446448, -1000622821, 328858067, -672381283, -961683389, -207371816, 674873108, -1178490389, -1773927470, -402334250, -1289500351, -397583525, 1274169195, 624294664};
                                                                    i19 = 23;
                                                                }
                                                                int iIndexOf = TextUtils.indexOf("", "", i18);
                                                                int iTuitionPaymentFragmentbindingInflater6 = zzo.TuitionPaymentFragmentbindingInflater1();
                                                                int i286 = ((iIndexOf * (-575)) - (~(i19 * (-575)))) - 1;
                                                                int i287 = ~iIndexOf;
                                                                int i288 = ~i19;
                                                                int i289 = ~((i287 & i288) | (i287 ^ i288));
                                                                int i290 = ~i19;
                                                                int i291 = ~((i290 ^ iTuitionPaymentFragmentbindingInflater6) | (i290 & iTuitionPaymentFragmentbindingInflater6));
                                                                int i292 = i286 + (((i289 ^ i291) | (i289 & i291)) * 576);
                                                                int i293 = ~iIndexOf;
                                                                int i294 = ~(i19 | i293);
                                                                int i295 = ~iTuitionPaymentFragmentbindingInflater6;
                                                                int i296 = (i295 & i290) | (i290 ^ i295);
                                                                int i297 = ~((i296 & iIndexOf) | (i296 ^ iIndexOf));
                                                                int i298 = ((i292 - (~(((i297 & i294) | (i294 ^ i297)) * 576))) - 1) + ((~((i293 ^ i290) | (i293 & i290))) * 576);
                                                                Object[] objArr30 = new Object[1];
                                                                a(iArr3, i298, objArr30);
                                                                if (!objNewInstance.equals(cls.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                                    try {
                                                                        int iBlue2 = Color.blue(0);
                                                                        int i299 = (iBlue2 * (-183)) - 4498872;
                                                                        int i300 = ~iBlue2;
                                                                        int i301 = ~((i300 ^ i53) | (i300 & i53) | 24584);
                                                                        int i302 = ~((-24585) | i53 | iBlue2);
                                                                        int i303 = -(-(((i301 & i302) | (i301 ^ i302)) * (-184)));
                                                                        int i304 = (i299 ^ i303) + ((i299 & i303) << 1);
                                                                        int i305 = ~((i300 ^ (-24585)) | (i300 & (-24585)));
                                                                        int i306 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                        int i307 = (i306 ^ 101) + ((i306 & 101) << 1);
                                                                        $b = i307 % 128;
                                                                        int i308 = i307 % 2;
                                                                        int i309 = -(-(184 * (i305 | (~((i300 & i53) | (i300 ^ i53))) | (~((-24585) | i53)))));
                                                                        int i310 = ((i304 | i309) << 1) - (i309 ^ i304);
                                                                        int i311 = ((iBlue2 ^ 24584) | (iBlue2 & 24584)) * 184;
                                                                        char c6 = (char) (((i310 | i311) << 1) - (i311 ^ i310));
                                                                        int i312 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                        int i313 = (i312 ^ 129) | (i312 & 129);
                                                                        int i314 = ~i313;
                                                                        int i315 = ~((i312 ^ i) | (i312 & i));
                                                                        int i316 = (i314 & i315) | (i314 ^ i315);
                                                                        int i317 = ~(i | 129);
                                                                        int i318 = ((i312 * (-743)) - 95847) + (((i316 & i317) | (i316 ^ i317)) * (-744));
                                                                        int i319 = ~((~i312) | (-130));
                                                                        int i320 = ((i319 & i53) | (i53 ^ i319)) * 744;
                                                                        int i321 = (i318 & i320) + (i320 | i318);
                                                                        int i322 = $b;
                                                                        int i323 = (i322 ^ 71) + ((i322 & 71) << 1);
                                                                        $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i323 % 128;
                                                                        if (i323 % 2 == 0) {
                                                                            Object[] objArr31 = new Object[1];
                                                                            c(c6, i321 * (744 / ((i313 ^ i) | (i313 & i))), TextUtils.indexOf((CharSequence) "", 'L', 1) * 86, objArr31);
                                                                            cls2 = Class.forName((String) objArr31[0]);
                                                                            i21 = 59;
                                                                            iArr4 = new int[]{517446448, -1000622821, 328858067, -672381283, -961683389, -207371816, 674873108, -1178490389, -1773927470, -402334250, -1289500351, -397583525, 1274169195, 624294664};
                                                                            i20 = -TextUtils.lastIndexOf("", 'N', 0);
                                                                        } else {
                                                                            Object[] objArr32 = new Object[1];
                                                                            c(c6, (i321 - (~(((i313 ^ i) | (i313 & i)) * 744))) - 1, 34 - (~TextUtils.indexOf((CharSequence) "", '0', 0)), objArr32);
                                                                            cls2 = Class.forName((String) objArr32[0]);
                                                                            int[] iArr6 = {517446448, -1000622821, 328858067, -672381283, -961683389, -207371816, 674873108, -1178490389, -1773927470, -402334250, -1289500351, -397583525, 1274169195, 624294664};
                                                                            i20 = -TextUtils.lastIndexOf("", '0', 0);
                                                                            iArr4 = iArr6;
                                                                            i21 = 22;
                                                                        }
                                                                        int i324 = i20 * 980;
                                                                        int i325 = i21 * (-978);
                                                                        int i326 = (i324 & i325) + (i324 | i325);
                                                                        int i327 = -(-((~((~i21) | i53)) * 979));
                                                                        int i328 = (i326 ^ i327) + ((i327 & i326) << 1);
                                                                        int i329 = (i20 | i) * (-979);
                                                                        int i330 = ~(279669061 | i112);
                                                                        int i331 = ((-1509915616) ^ i330) | ((-1509915616) & i330);
                                                                        int i332 = ~(((-729153) ^ i) | ((-729153) & i));
                                                                        int i333 = ((i331 ^ i332) | (i331 & i332)) * (-252);
                                                                        int i334 = ((58962787 ^ i333) + ((i333 & 58962787) << 1)) - (-183746556);
                                                                        int i335 = 279669061 | i53;
                                                                        int i336 = ~((i335 & (-1230975707)) | (i335 ^ (-1230975707)));
                                                                        int i337 = ~((-729153) | i);
                                                                        int i338 = -(-(((i336 & i337) | (i336 ^ i337)) * 252));
                                                                        int i339 = (i334 ^ i338) + ((i334 & i338) << 1);
                                                                        int iTuitionPaymentFragmentbindingInflater7 = zzo.TuitionPaymentFragmentbindingInflater1();
                                                                        int i340 = ~(((-217059374) ^ iTuitionPaymentFragmentbindingInflater7) | ((-217059374) & iTuitionPaymentFragmentbindingInflater7));
                                                                        int i341 = ((466439373 ^ i340) | (466439373 & i340)) * 262;
                                                                        int i342 = ((-800857957) ^ i341) + (((-800857957) & i341) << 1);
                                                                        int i343 = ~iTuitionPaymentFragmentbindingInflater7;
                                                                        int i344 = ~(((-217059374) ^ i343) | (i343 & (-217059374)));
                                                                        if (i339 > (((i342 ^ 578803734) + ((i342 & 578803734) << 1)) - (~((((i344 ^ 319638720) | (i344 & 319638720)) | 146800653) * 262))) - 1) {
                                                                            int i345 = (i328 - (~(-i329))) - 1;
                                                                            int i346 = ~i21;
                                                                            int i347 = ~((i346 & i) | (i346 ^ i));
                                                                            int i348 = ~((i53 ^ i20) | (i20 & i53));
                                                                            int i349 = i345 * ((i347 & i348) | (i347 ^ i348)) * 979;
                                                                            Object[] objArr33 = new Object[1];
                                                                            a(iArr4, i349, objArr33);
                                                                            if (!objNewInstance2.equals(cls2.getMethod((String) objArr33[0], null).invoke(objInvoke4, null))) {
                                                                                int i350 = ((i209 | (-87)) << 1) - (i209 ^ (-87));
                                                                                i138 = ((i350 | 88) << 1) - (i350 ^ 88);
                                                                                length = i162;
                                                                                objArr17 = objArr18;
                                                                            }
                                                                        } else {
                                                                            int i351 = i328 + i329;
                                                                            int i352 = ~i21;
                                                                            int i353 = ~((i352 & i) | (i352 ^ i));
                                                                            int i354 = ~((i53 ^ i20) | (i20 & i53));
                                                                            int i355 = -(-(((i353 & i354) | (i353 ^ i354)) * 979));
                                                                            int i356 = (i351 ^ i355) + ((i355 & i351) << 1);
                                                                            Object[] objArr34 = new Object[1];
                                                                            a(iArr4, i356, objArr34);
                                                                            if (!objNewInstance2.equals(cls2.getMethod((String) objArr34[0], null).invoke(objInvoke4, null))) {
                                                                                int i357 = ((i209 | (-87)) << 1) - (i209 ^ (-87));
                                                                                i138 = ((i357 | 88) << 1) - (i357 ^ 88);
                                                                                length = i162;
                                                                                objArr17 = objArr18;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        Throwable cause2 = th2.getCause();
                                                                        if (cause2 != null) {
                                                                            throw cause2;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                }
                                                                int i358 = (~(i & 1)) & (i | 1);
                                                                Object[] objArr35 = new Object[4];
                                                                int[] iArr7 = new int[1];
                                                                objArr35[0] = iArr7;
                                                                objArr35[1] = new int[1];
                                                                int[] iArr8 = new int[1];
                                                                objArr35[2] = iArr8;
                                                                int i359 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                                int i360 = (i359 & 71) + (i359 | 71);
                                                                $b = i360 % 128;
                                                                int i361 = i360 % 2;
                                                                iArr7[0] = i;
                                                                int i362 = (i359 & 95) + (i359 | 95);
                                                                $b = i362 % 128;
                                                                int i363 = i362 % 2;
                                                                iArr8[0] = i358;
                                                                objArr35[3] = null;
                                                                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                                                int i364 = ~(996879870 | startElapsedRealtime);
                                                                int i365 = ~startElapsedRealtime;
                                                                int i366 = i364 | (~(1037190099 | i365));
                                                                int i367 = ~((-996879871) | i365);
                                                                int i368 = (-1567774068) + ((i366 | i367) * (-516)) + (((~(startElapsedRealtime | (-76562946))) | (~((-960627155) | i365))) * 516) + ((960627154 | i367) * 516);
                                                                int i369 = $b + 111;
                                                                $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i369 % 128;
                                                                int i370 = i369 % 2;
                                                                int i371 = (i368 & 16) + (i368 | 16);
                                                                int i372 = ((i2 | i371) << 1) - (i2 ^ i371);
                                                                int i373 = i372 << 13;
                                                                int i374 = (i373 & (~i372)) | ((~i373) & i372);
                                                                int i375 = i374 >>> 17;
                                                                int i376 = ((~i374) & i375) | ((~i375) & i374);
                                                                int i377 = i376 << 5;
                                                                ((int[]) objArr35[1])[0] = ((~i376) & i377) | ((~i377) & i376);
                                                                return objArr35;
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
                Object[] objArr36 = new Object[4];
                int[] iArr9 = new int[1];
                objArr36[0] = iArr9;
                int i378 = $b;
                int i379 = ((i378 | 75) << 1) - (i378 ^ 75);
                $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i379 % 128;
                int i380 = i379 % 2;
                int[] iArr10 = new int[1];
                objArr36[1] = iArr10;
                int[] iArr11 = new int[1];
                objArr36[2] = iArr11;
                int i381 = ((i378 | 43) << 1) - (i378 ^ 43);
                $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i381 % 128;
                if (i381 % 2 == 0) {
                    iArr10[1] = i;
                    c = 0;
                } else {
                    c = 0;
                    iArr9[0] = i;
                }
                iArr11[c] = i;
                objArr36[3] = null;
                int i382 = ~i;
                int i383 = (~(296273676 | i382)) | 67573985;
                int i384 = ~(i | (-27263757));
                int i385 = (((i383 | i384) * (-252)) - 110914736) + ((i384 | (~(i382 | 363847661))) * 252);
                int i386 = (i2 ^ i385) + ((i2 & i385) << 1);
                int i387 = i386 << 13;
                int i388 = (i386 | i387) & (~(i386 & i387));
                int i389 = i388 ^ (i388 >>> 17);
                int i390 = i389 << 5;
                iArr10[0] = ((~i389) & i390) | ((~i390) & i389);
                return objArr36;
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
            private static java.lang.String $$c(byte r5, short r6, short r7) {
                /*
                    int r5 = r5 * 4
                    int r5 = 4 - r5
                    int r7 = r7 + 66
                    byte[] r0 = com.appsflyer.internal.AFd1uSDK.AnonymousClass6.$$a
                    int r6 = r6 * 3
                    int r6 = 1 - r6
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r4 = r7
                    r3 = r2
                    r7 = r6
                    goto L25
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r6) goto L23
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L23:
                    r4 = r0[r5]
                L25:
                    int r7 = r7 + r4
                    int r5 = r5 + 1
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1uSDK.AnonymousClass6.$$c(byte, short, short):java.lang.String");
            }
        });
    }

    public static final /* synthetic */ AFc1dSDK getCurrencyIso4217Code(AFd1uSDK aFd1uSDK) {
        int i = AFLogger + 117;
        int i2 = i % 128;
        copydefault = i2;
        AFc1dSDK aFc1dSDK = aFd1uSDK.getMediationNetwork;
        if (i % 2 != 0) {
            throw null;
        }
        AFLogger = (i2 + 47) % 128;
        return aFc1dSDK;
    }

    private final AFf1oSDK getMonetizationNetwork() {
        AFLogger = (copydefault + 99) % 128;
        AFf1oSDK aFf1oSDK = (AFf1oSDK) this.AFAdRevenueData.getValue();
        copydefault = (AFLogger + 11) % 128;
        return aFf1oSDK;
    }

    private final AFc1pSDK getMediationNetwork() {
        copydefault = (AFLogger + 87) % 128;
        AFc1pSDK aFc1pSDK = (AFc1pSDK) this.getMonetizationNetwork.getValue();
        AFLogger = (copydefault + 59) % 128;
        return aFc1pSDK;
    }

    private final AFc1qSDK component2() {
        int i = copydefault + 19;
        AFLogger = i % 128;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) this.getRevenue.getValue();
        if (i % 2 != 0) {
            return aFc1qSDK;
        }
        throw null;
    }

    private final AFf1gSDK component4() {
        int i = AFLogger + 17;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        AFf1gSDK aFf1gSDK = (AFf1gSDK) this.getCurrencyIso4217Code.getValue();
        AFLogger = (copydefault + 117) % 128;
        return aFf1gSDK;
    }

    private final ExecutorService areAllFieldsValid() {
        AFLogger = (copydefault + 47) % 128;
        ExecutorService executorService = (ExecutorService) this.areAllFieldsValid.getValue();
        AFLogger = (copydefault + 37) % 128;
        return executorService;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        AFLogger = (copydefault + 29) % 128;
        AFi1wSDK aFi1wSDK = aFd1uSDK.getMonetizationNetwork().getMediationNetwork.getCurrencyIso4217Code;
        if (aFi1wSDK != null) {
            int i = AFLogger + 37;
            copydefault = i % 128;
            if (i % 2 == 0) {
                AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
                if (aFh1cSDK != null) {
                    return aFh1cSDK.getRevenue;
                }
            } else {
                AFh1cSDK aFh1cSDK2 = aFi1wSDK.getMonetizationNetwork;
                throw null;
            }
        }
        return null;
    }

    public final AFc1aSDK getRevenue() {
        int i = copydefault + 41;
        AFLogger = i % 128;
        AFc1aSDK aFc1aSDK = (AFc1aSDK) this.component4.getValue();
        if (i % 2 != 0) {
            return aFc1aSDK;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1uSDK aFd1uSDK, Throwable th, String str) {
        int i = copydefault + 101;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1uSDK, "");
            Intrinsics.checkNotNullParameter(th, "");
            Intrinsics.checkNotNullParameter(str, "");
            throw new ArithmeticException();
        }
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1dSDK aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{aFd1uSDK}, 855295870, -855295867, System.identityHashCode(aFd1uSDK));
        if (aFh1dSDK == null || !aFd1uSDK.getMonetizationNetwork(aFh1dSDK)) {
            return;
        }
        aFd1uSDK.getRevenue().AFAdRevenueData(th, str);
        AFLogger = (copydefault + 91) % 128;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getMediationNetwork(final Throwable th, final String str) {
        copydefault = (AFLogger + 75) % 128;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1uSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFd1uSDK.getMediationNetwork(this.f$0, th, str);
            }
        });
        AFLogger = (copydefault + 53) % 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1uSDK aFd1uSDK) {
        copydefault = (AFLogger + 83) % 128;
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.copydefault();
        AFLogger = (copydefault + 105) % 128;
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void AFAdRevenueData(AFd1vSDK.AFa1ySDK aFa1ySDK) {
        int i = AFLogger + 21;
        copydefault = i % 128;
        if (i % 2 == 0) {
            this.component2 = aFa1ySDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1uSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.getMediationNetwork(this.f$0);
                }
            });
        } else {
            this.component2 = aFa1ySDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1uSDK$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.getMediationNetwork(this.f$0);
                }
            });
            throw null;
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        copydefault = (AFLogger + 43) % 128;
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.equals();
        int i = copydefault + 69;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw new ArithmeticException();
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void AFAdRevenueData() {
        int i = copydefault + 61;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1uSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.AFAdRevenueData(this.f$0);
                }
            });
            copydefault = (AFLogger + 81) % 128;
        } else {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1uSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.AFAdRevenueData(this.f$0);
                }
            });
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1uSDK aFd1uSDK) {
        AFLogger = (copydefault + 9) % 128;
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        aFd1uSDK.copy();
        AFLogger = (copydefault + 51) % 128;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        final AFd1uSDK aFd1uSDK = (AFd1uSDK) objArr[0];
        int i = AFLogger + 79;
        copydefault = i % 128;
        if (i % 2 == 0) {
            aFd1uSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1uSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1uSDK.getMonetizationNetwork(this.f$0);
                }
            });
            int i2 = copydefault + 21;
            AFLogger = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw new ArithmeticException();
        }
        aFd1uSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1uSDK$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AFd1uSDK.getMonetizationNetwork(this.f$0);
            }
        });
        throw new ArithmeticException();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    private final void copydefault() {
        Integer numValueOf;
        String str;
        String str2;
        int i;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String value;
        Integer intOrNull;
        String value2;
        synchronized (this) {
            AFh1dSDK aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            if ((aFh1dSDK != null ? aFh1dSDK.getMediationNetwork : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                int i2 = AFLogger + 47;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                    component2().getMonetizationNetwork("af_send_exc_to_server_window");
                    getRevenue().getMonetizationNetwork();
                    return;
                } else {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                    component2().getMonetizationNetwork("af_send_exc_to_server_window");
                    getRevenue().getMonetizationNetwork();
                    return;
                }
            }
            AFh1dSDK aFh1dSDK2 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            boolean monetizationNetwork = false;
            if (aFh1dSDK2 == null || !getMediationNetwork(aFh1dSDK2)) {
                component2().getMonetizationNetwork("af_send_exc_to_server_window");
                getRevenue().getMonetizationNetwork();
            } else {
                AFh1dSDK aFh1dSDK3 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                Pair<Integer, Integer> mediationNetwork = null;
                if (aFh1dSDK3 != null) {
                    int i3 = AFLogger + 111;
                    copydefault = i3 % 128;
                    if (i3 % 2 != 0) {
                        String str3 = aFh1dSDK3.getRevenue;
                        throw new ArithmeticException();
                    }
                    String str4 = aFh1dSDK3.getRevenue;
                    if (str4 != null) {
                        Intrinsics.checkNotNullParameter(str4, "");
                        MatchResult matchResultMatchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str4);
                        if (matchResultMatchEntire != null) {
                            MatchGroup matchGroup = matchResultMatchEntire.getGroups().get(1);
                            if (matchGroup == null || (value2 = matchGroup.getValue()) == null) {
                                iIntValue = 0;
                            } else {
                                AFLogger = (copydefault + 119) % 128;
                                Integer intOrNull2 = StringsKt.toIntOrNull(value2);
                                if (intOrNull2 != null) {
                                    iIntValue = intOrNull2.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                            }
                            MatchGroup matchGroup2 = matchResultMatchEntire.getGroups().get(2);
                            if (matchGroup2 != null) {
                                AFLogger = (copydefault + 95) % 128;
                                String value3 = matchGroup2.getValue();
                                if (value3 != null) {
                                    AFLogger = (copydefault + 113) % 128;
                                    Integer intOrNull3 = StringsKt.toIntOrNull(value3);
                                    if (intOrNull3 != null) {
                                        iIntValue2 = intOrNull3.intValue();
                                        copydefault = (AFLogger + 87) % 128;
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                } else {
                                    iIntValue2 = 0;
                                }
                            } else {
                                iIntValue2 = 0;
                            }
                            MatchGroup matchGroup3 = matchResultMatchEntire.getGroups().get(3);
                            if (matchGroup3 == null || (value = matchGroup3.getValue()) == null || (intOrNull = StringsKt.toIntOrNull(value)) == null) {
                                AFLogger = (copydefault + 85) % 128;
                                iIntValue3 = 0;
                            } else {
                                AFLogger = (copydefault + 123) % 128;
                                iIntValue3 = intOrNull.intValue();
                            }
                            i = (iIntValue * 1000000) + (iIntValue2 * 1000) + iIntValue3;
                        } else {
                            i = -1;
                        }
                        numValueOf = Integer.valueOf(i);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
                AFh1dSDK aFh1dSDK4 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                Pair<Integer, Integer> revenue = (aFh1dSDK4 == null || (str2 = aFh1dSDK4.getRevenue) == null) ? null : AFd1rSDK.getRevenue(str2);
                AFh1dSDK aFh1dSDK5 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                if (aFh1dSDK5 != null && (str = aFh1dSDK5.getRevenue) != null) {
                    mediationNetwork = AFd1rSDK.getMediationNetwork(str);
                }
                if ((numValueOf == null || numValueOf.intValue() != -1) && revenue == null) {
                    getRevenue().getRevenue(this.component1);
                } else if (revenue != null) {
                    getRevenue().AFAdRevenueData(revenue.getFirst().intValue(), revenue.getSecond().intValue());
                } else if (mediationNetwork != null) {
                    getRevenue().AFAdRevenueData(mediationNetwork.getFirst().intValue(), mediationNetwork.getSecond().intValue());
                } else {
                    component2().getMonetizationNetwork("af_send_exc_to_server_window");
                    getRevenue().getMonetizationNetwork();
                }
            }
            AFd1vSDK.AFa1ySDK aFa1ySDK = this.component2;
            if (aFa1ySDK != null) {
                AFh1dSDK aFh1dSDK6 = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
                if (aFh1dSDK6 != null) {
                    copydefault = (AFLogger + 71) % 128;
                    monetizationNetwork = getMonetizationNetwork(aFh1dSDK6);
                }
                aFa1ySDK.onConfigurationChanged(monetizationNetwork);
            }
        }
    }

    private final void equals() {
        int i = copydefault + 119;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            AFh1dSDK aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            if (aFh1dSDK != null) {
                if (!getCurrencyIso4217Code(aFh1dSDK)) {
                    AFg1gSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                    return;
                }
                int i2 = AFLogger + 33;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    String mediationNetwork = component4().getMediationNetwork();
                    if (mediationNetwork != null) {
                        String string = new JSONObject((Map) getMediationNetwork(new Object[]{AFAdRevenueData(aFh1dSDK), getRevenue().getMediationNetwork()}, -1072478634, 1072478634, (int) System.currentTimeMillis())).toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
                        getCurrencyIso4217Code(string, mediationNetwork);
                        return;
                    }
                    return;
                }
                component4().getMediationNetwork();
                throw null;
            }
            return;
        }
        throw new ArithmeticException();
    }

    private final void copy() {
        boolean monetizationNetwork;
        synchronized (this) {
            AFh1dSDK aFh1dSDK = (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
            if (aFh1dSDK != null) {
                int i = copydefault + 57;
                AFLogger = i % 128;
                if (i % 2 == 0) {
                    int i2 = aFh1dSDK.AFAdRevenueData;
                    throw new NullPointerException();
                }
                if (aFh1dSDK.AFAdRevenueData == -1) {
                    component2().getMonetizationNetwork("af_send_exc_to_server_window");
                } else if (component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L) == -1) {
                    AFLogger = (copydefault + 119) % 128;
                    getRevenue(aFh1dSDK);
                }
                monetizationNetwork = getMonetizationNetwork(aFh1dSDK);
            } else {
                monetizationNetwork = false;
            }
            AFd1vSDK.AFa1ySDK aFa1ySDK = this.component2;
            if (aFa1ySDK == null) {
                copydefault = (AFLogger + 107) % 128;
            } else {
                copydefault = (AFLogger + 73) % 128;
                aFa1ySDK.onConfigurationChanged(monetizationNetwork);
            }
        }
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) throws UnsupportedEncodingException {
        int length;
        char[] cArr;
        int i2;
        Object charArray = str2;
        if (str2 != null) {
            $10 = ($11 + 39) % 128;
            charArray = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        char[] cArr3 = hashCode;
        if (cArr3 != null) {
            int i3 = $11 + 61;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                $10 = ($11 + 97) % 128;
                cArr[i2] = (char) (((long) cArr3[i2]) ^ (-5879130172463570806L));
                i2++;
            }
            cArr3 = cArr;
        }
        int i4 = (int) ((-5879130172463570806L) ^ ((long) equals));
        if (copy) {
            aFk1nSDK.getMonetizationNetwork = bArr.length;
            char[] cArr4 = new char[aFk1nSDK.getMonetizationNetwork];
            aFk1nSDK.AFAdRevenueData = 0;
            while (aFk1nSDK.AFAdRevenueData < aFk1nSDK.getMonetizationNetwork) {
                $11 = ($10 + 19) % 128;
                cArr4[aFk1nSDK.AFAdRevenueData] = (char) (cArr3[bArr[(aFk1nSDK.getMonetizationNetwork - 1) - aFk1nSDK.AFAdRevenueData] + i] - i4);
                aFk1nSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!toString) {
            aFk1nSDK.getMonetizationNetwork = iArr.length;
            char[] cArr5 = new char[aFk1nSDK.getMonetizationNetwork];
            aFk1nSDK.AFAdRevenueData = 0;
            while (aFk1nSDK.AFAdRevenueData < aFk1nSDK.getMonetizationNetwork) {
                cArr5[aFk1nSDK.AFAdRevenueData] = (char) (cArr3[iArr[(aFk1nSDK.getMonetizationNetwork - 1) - aFk1nSDK.AFAdRevenueData] - i] - i4);
                aFk1nSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        aFk1nSDK.getMonetizationNetwork = cArr2.length;
        char[] cArr6 = new char[aFk1nSDK.getMonetizationNetwork];
        aFk1nSDK.AFAdRevenueData = 0;
        while (aFk1nSDK.AFAdRevenueData < aFk1nSDK.getMonetizationNetwork) {
            cArr6[aFk1nSDK.AFAdRevenueData] = (char) (cArr3[cArr2[(aFk1nSDK.getMonetizationNetwork - 1) - aFk1nSDK.AFAdRevenueData] - i] - i4);
            aFk1nSDK.AFAdRevenueData++;
        }
        String str3 = new String(cArr6);
        int i5 = $11 + 27;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw new ArithmeticException();
        }
        objArr[0] = str3;
    }

    private final void getRevenue(AFh1dSDK aFh1dSDK) {
        int i;
        long jCurrentTimeMillis;
        int i2 = copydefault + 115;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            i = aFh1dSDK.getCurrencyIso4217Code;
            jCurrentTimeMillis = System.currentTimeMillis() ^ TimeUnit.DAYS.toMillis(aFh1dSDK.AFAdRevenueData);
        } else {
            i = aFh1dSDK.getCurrencyIso4217Code;
            jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1dSDK.AFAdRevenueData);
        }
        AFc1qSDK aFc1qSDKComponent2 = component2();
        aFc1qSDKComponent2.getMonetizationNetwork("af_send_exc_to_server_window", jCurrentTimeMillis);
        aFc1qSDKComponent2.getMediationNetwork("af_send_exc_min", i);
    }

    private final Map<String, String> AFAdRevenueData(AFh1dSDK aFh1dSDK) throws UnsupportedEncodingException {
        Object[] objArr = new Object[1];
        a("\u0085\u0084\u0083\u0082\u0081", null, null, ExpandableListView.getPackedPositionType(0L) + 127, objArr);
        Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND), TuplesKt.to("model", Build.MODEL), TuplesKt.to("app_id", getMediationNetwork().getRevenue.getMonetizationNetwork.getPackageName()), TuplesKt.to("p_ex", new AFa1vSDK().getMonetizationNetwork()), TuplesKt.to("api", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("sdk", this.component1), TuplesKt.to("uid", AFb1iSDK.getRevenue(getMediationNetwork().getMonetizationNetwork)), TuplesKt.to("exc_config", aFh1dSDK.getMonetizationNetwork()));
        int i = copydefault + 125;
        AFLogger = i % 128;
        if (i % 2 != 0) {
            return mapMapOf;
        }
        throw null;
    }

    private final void getCurrencyIso4217Code(String str, String str2) {
        AFLogger = (copydefault + 53) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        ((AFd1xSDK) getMediationNetwork(new Object[]{this}, -704520981, 704520985, System.identityHashCode(this))).getMediationNetwork(bytes, MapsKt.mapOf(TuplesKt.to("Authorization", AFj1cSDK.getRevenue(str, str2))), 2000);
        int i = copydefault + 95;
        AFLogger = i % 128;
        if (i % 2 == 0) {
            throw new ArithmeticException();
        }
    }

    private final boolean getCurrencyIso4217Code(AFh1dSDK aFh1dSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long currencyIso4217Code = component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.getMediationNetwork < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
            return false;
        }
        if (currencyIso4217Code != -1) {
            copydefault = (AFLogger + 27) % 128;
            if (currencyIso4217Code >= jCurrentTimeMillis) {
                int iAFAdRevenueData = component2().AFAdRevenueData("af_send_exc_min", -1);
                if (iAFAdRevenueData == -1 || getRevenue().getCurrencyIso4217Code() < iAFAdRevenueData) {
                    return false;
                }
                return getMediationNetwork(aFh1dSDK);
            }
        }
        copydefault = (AFLogger + 13) % 128;
        return false;
    }

    private final boolean getMonetizationNetwork(AFh1dSDK aFh1dSDK) {
        copydefault = (AFLogger + 67) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long currencyIso4217Code = component2().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.getMediationNetwork < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
            copydefault = (AFLogger + 25) % 128;
            return false;
        }
        if (currencyIso4217Code == -1 || currencyIso4217Code < jCurrentTimeMillis) {
            return false;
        }
        return getMediationNetwork(aFh1dSDK);
    }

    private final boolean getMediationNetwork(AFh1dSDK aFh1dSDK) {
        new AFd1sSDK();
        String str = this.component1;
        String str2 = aFh1dSDK.getRevenue;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean mediationNetwork = AFd1sSDK.getMediationNetwork(str, str2);
        AFLogger = (copydefault + 79) % 128;
        return mediationNetwork;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1uSDK aFd1uSDK) {
        getMediationNetwork(new Object[]{aFd1uSDK}, 801406437, -801406436, (int) System.currentTimeMillis());
    }

    private static Map<String, Object> getMediationNetwork(Map<String, ? extends Object> map, List<AFc1cSDK> list) {
        return (Map) getMediationNetwork(new Object[]{map, list}, -1072478634, 1072478634, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFd1vSDK
    public final void getCurrencyIso4217Code() {
        getMediationNetwork(new Object[]{this}, 58037992, -58037990, System.identityHashCode(this));
    }

    private AFd1xSDK component3() {
        return (AFd1xSDK) getMediationNetwork(new Object[]{this}, -704520981, 704520985, System.identityHashCode(this));
    }

    private final AFh1dSDK component1() {
        return (AFh1dSDK) getMediationNetwork(new Object[]{this}, 855295870, -855295867, System.identityHashCode(this));
    }
}

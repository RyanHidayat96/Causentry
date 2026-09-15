package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.bpjstku.data.news.NewsDataStore;
import com.bpjstku.data.news.NewsRepository;
import com.bpjstku.data.news.remote.NewsApi;
import com.bpjstku.data.news.remote.NewsApiClient;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.OkHttpClient;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
public final class MExternalSyntheticLambda3 {
    private static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static {
        Function1 function1 = new Function1() { // from class: onFailure
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1((isLenovoTablet) obj);
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static /* synthetic */ ComponentDialogExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new r8lambdaqS1cldBgQdRb0InzIVn5XXJnx0Q((NewsRepository) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(NewsRepository.class), null, null));
    }

    public static /* synthetic */ NewsApi TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new NewsApi((NewsApiClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(NewsApiClient.class), null, null));
    }

    public static /* synthetic */ NewsRepository TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new NewsDataStore((NewsApi) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(NewsApi.class), null, null));
    }

    public static /* synthetic */ NewsApiClient b(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        notifyStateDetached notifystatedetached = notifyStateDetached.INSTANCE;
        return (NewsApiClient) notifyStateDetached.b(NewsApiClient.class, (OkHttpClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, null), (String) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(String.class), new setUsingExifOrientation("baseUrl"), null));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: r8lambdaG9ghsOcncBzktiummLjnZzPVm4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MExternalSyntheticLambda3.b((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(NewsApiClient.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: N
            private static final byte[] $$a = {101, 89, 94, -73};
            private static final int $$b = 106;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int d = 0;
            private static int g = 1;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 53146;
            private static char TuitionPaymentFragmentbindingInflater1 = 12745;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 63018;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 8783;
            private static long b = -6377398940819159759L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f185a = -981105359;
            private static char asBinder = 32489;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = d + 111;
                g = i2 % 128;
                FileTransformFactory fileTransformFactory = (FileTransformFactory) obj;
                CoordinateTransform coordinateTransform = (CoordinateTransform) obj2;
                if (i2 % 2 != 0) {
                    return MExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileTransformFactory, coordinateTransform);
                }
                MExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileTransformFactory, coordinateTransform);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = 0;
                    if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                        int i4 = $11 + 99;
                        $10 = i4 % 128;
                        int i5 = 58224;
                        char c = 1;
                        if (i4 % 2 != 0) {
                            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 0];
                        } else {
                            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        }
                        int i6 = 0;
                        while (i6 < 16) {
                            char c2 = cArr3[c];
                            char c3 = cArr3[i3];
                            int i7 = (c3 + i5) ^ ((c3 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                            int i8 = c3 >>> 5;
                            try {
                                Object[] objArr2 = new Object[4];
                                objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                objArr2[2] = Integer.valueOf(i8);
                                objArr2[c] = Integer.valueOf(i7);
                                objArr2[i3] = Integer.valueOf(c2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char cIndexOf = (char) (47772 - TextUtils.indexOf((CharSequence) "", '0', i3));
                                    int doubleTapTimeout = 468 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                    int iResolveSize = View.resolveSize(i3, i3) + 13;
                                    Class[] clsArr = new Class[4];
                                    clsArr[i3] = Integer.TYPE;
                                    clsArr[c] = Integer.TYPE;
                                    clsArr[2] = Integer.TYPE;
                                    clsArr[3] = Integer.TYPE;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, doubleTapTimeout, iResolveSize, -2007001706, false, "o", clsArr);
                                }
                                char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                cArr3[c] = cCharValue;
                                Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getTapTimeout() >> 16) + 468, 14 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                }
                                cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                                i5 -= 40503;
                                i6++;
                                i3 = 0;
                                c = 1;
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
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2323, 44 - (ViewConfiguration.getEdgeSlop() >> 16), -1312321721, false, $$c(b2, b3, (byte) (b3 | 6)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        objArr[0] = new String(cArr2, 0, i);
                        int i9 = $10 + 89;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        return;
                    }
                }
            }

            private static void e(char[] cArr, char[] cArr2, char c, char[] cArr3, int i, Object[] objArr) throws Throwable {
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
                int i6 = $11 + 61;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                    int i8 = $10 + 31;
                    $11 = i8 % 128;
                    int i9 = i8 % i3;
                    try {
                        Object[] objArr2 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8327);
                            int iBlue = Color.blue(i5) + 1235;
                            int iMyTid = 35 - (Process.myTid() >> 22);
                            byte b2 = (byte) i5;
                            byte b3 = b2;
                            String str$$c = $$c(b2, b3, b3);
                            Class[] clsArr = new Class[1];
                            clsArr[i5] = Object.class;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iBlue, iMyTid, -653973969, false, str$$c, clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {sessionProcessor};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cResolveSizeAndState = (char) View.resolveSizeAndState(i5, i5, i5);
                            int scrollBarSize = 2764 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int iResolveSize = View.resolveSize(i5, i5) + 14;
                            byte b4 = (byte) i5;
                            byte b5 = b4;
                            String str$$c2 = $$c(b4, b5, (byte) (b5 + 2));
                            Class[] clsArr2 = new Class[1];
                            clsArr2[i5] = Object.class;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSizeAndState, scrollBarSize, iResolveSize, 1504416861, false, str$$c2, clsArr2);
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                        int i10 = cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718;
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i10);
                        objArr4[i5] = sessionProcessor;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cResolveOpacity = (char) (Drawable.resolveOpacity(i5, i5) + 43325);
                            int offsetAfter = 253 - TextUtils.getOffsetAfter("", i5);
                            int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            Class[] clsArr3 = new Class[3];
                            clsArr3[i5] = Object.class;
                            clsArr3[1] = Integer.TYPE;
                            clsArr3[2] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, offsetAfter, scrollDefaultDelay, -721491957, false, "j", clsArr3);
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        int i11 = cArr4[iIntValue2] * 32718;
                        Object[] objArr5 = new Object[2];
                        objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                        objArr5[i5] = Integer.valueOf(i11);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char gidForName = (char) (Process.getGidForName("") + 65201);
                            int offsetAfter2 = 2891 - TextUtils.getOffsetAfter("", i5);
                            int defaultSize = View.getDefaultSize(i5, i5) + 17;
                            byte b6 = (byte) i5;
                            byte b7 = b6;
                            String str$$c3 = $$c(b6, b7, (byte) (b7 + 1));
                            i2 = 2;
                            Class[] clsArr4 = new Class[2];
                            clsArr4[i5] = Integer.TYPE;
                            clsArr4[1] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, offsetAfter2, defaultSize, 2012627446, false, str$$c3, clsArr4);
                        } else {
                            i2 = 2;
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = sessionProcessor.b;
                        cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) ((((long) ((int) (((long) f185a) ^ (-6377398940819159759L)))) ^ (((long) (cArr[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (b ^ (-6377398940819159759L)))) ^ ((long) ((char) (((long) asBinder) ^ (-6377398940819159759L)))));
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

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v2 */
            /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v25 */
            /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v3, types: [int] */
            /* JADX WARN: Type inference failed for: r5v34 */
            /* JADX WARN: Type inference failed for: r5v49 */
            /* JADX WARN: Type inference failed for: r5v7 */
            /* JADX WARN: Type inference failed for: r5v8 */
            /* JADX WARN: Type inference failed for: r8v3 */
            public static Object[] b(Context context, int i, int i2) {
                ?? r5;
                int i3;
                ?? NewInstance;
                int i4;
                int i5;
                int i6;
                Class<?> cls;
                char[] cArr;
                char[] cArr2;
                int i7;
                char[] cArr3;
                char[] cArr4;
                int capsMode;
                Class<?> cls2;
                char[] cArr5;
                char[] cArr6;
                int longPressTimeout;
                Class<?> cls3;
                char[] cArr7;
                int i8;
                int i9;
                Object[] objArr;
                Method method;
                int i10 = 2 % 2;
                if (context != null) {
                    int i11 = d;
                    int i12 = (i11 ^ 3) + ((i11 & 3) << 1);
                    g = i12 % 128;
                    int i13 = i12 % 2;
                    try {
                        char[] cArr8 = {18986, 51879, 42395, 683, 36739, 49151, 18310, 55355, 13473, 13536, 3592, 2889, 30121, 48549, 36651, 18633, 52256, 26676, 21500, 37607, 58691, 44451, 44013, 6866, 17670, 47829, 40270, 56349, 10644, 18317, 46103, 36317, 48146, 60627};
                        int i14 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i15 = i14 * (-743);
                        int i16 = ((i15 | (-23776)) << 1) - (i15 ^ (-23776));
                        int i17 = (i14 ^ 32) | (i14 & 32);
                        int i18 = ~i17;
                        int i19 = ~((i14 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i14 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        int i20 = (i18 ^ i19) | (i19 & i18);
                        int i21 = d + 121;
                        int i22 = i21 % 128;
                        g = i22;
                        if (i21 % 2 == 0) {
                            int i23 = -(i20 | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 32) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 & 32))));
                            int i24 = (i23 & (-744)) + (i23 | (-744));
                            i4 = ((i16 | i24) << 1) - (i16 ^ i24);
                        } else {
                            int i25 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault1 | 32);
                            int i26 = -(-(((i20 ^ i25) | (i20 & i25)) * (-744)));
                            i4 = (i16 ^ i26) + ((i16 & i26) << 1);
                        }
                        int i27 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i28 = ~i14;
                        int i29 = ~((i28 & (-33)) | (i28 ^ (-33)));
                        int i30 = ((i27 & i29) | (i27 ^ i29)) * 744;
                        int i31 = i22 + 57;
                        d = i31 % 128;
                        if (i31 % 2 != 0) {
                            i5 = i4 * i30;
                            i6 = 744 / ((i17 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i17 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        } else {
                            i5 = i4 + i30;
                            i6 = 744 * ((i17 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i17 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        }
                        int i32 = (i5 & i6) + (i5 | i6);
                        Object[] objArr2 = new Object[1];
                        c(cArr8, i32, objArr2);
                        NewInstance = (String) objArr2[0];
                        int i33 = d;
                        int i34 = (i33 ^ 75) + ((i33 & 75) << 1);
                        g = i34 % 128;
                        int i35 = i34 % 2;
                        try {
                            try {
                                Object[] objArr3 = {NewInstance};
                                char[] cArr9 = {12295, 9465, 1491, 54621, 52243, 19360, 42493, 49755, 1310, 9655, 56751, 35249, 53529, 24195, 38970, 43850, 45338, 13024, 53461, 50324, 51121, 47824, 55528, 956, 63930, 41718, 59337, 25646, 54384, 27554, 48235, 8623, 37951, 19544, 57523, 59671, 42469, 1394};
                                char[] cArr10 = {0, 0, 0, 0};
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                                int i36 = d;
                                int i37 = (i36 ^ 49) + ((i36 & 49) << 1);
                                g = i37 % 128;
                                int i38 = i37 % 2;
                                int i39 = -iLastIndexOf;
                                char c = (char) (((-1) ^ i39) + (i39 << 1));
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0);
                                Object[] objArr4 = new Object[1];
                                e(cArr9, cArr10, c, new char[]{31383, 9508, 50634, 7048}, ((iIndexOf | 1) << 1) - (iIndexOf ^ 1), objArr4);
                                NewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(objArr3);
                                int i40 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int i41 = (i40 ^ 31) + ((i40 & 31) << 1);
                                Object[] objArr5 = new Object[1];
                                c(new char[]{18629, 38603, 3437, 8089, 45722, 11894, 47240, 26439, 28596, 18321, 60284, 54365, 30135, 6835, 5954, 51823, 6661, 18247, 7853, 57933, 3648, 49821, 60423, 29974, 57712, 29687, 38089, 10927, 37882, 45706, 11751, 40892, 26335, 38747}, i41, objArr5);
                                try {
                                    Object[] objArr6 = {(String) objArr5[0]};
                                    char[] cArr11 = {12295, 9465, 1491, 54621, 52243, 19360, 42493, 49755, 1310, 9655, 56751, 35249, 53529, 24195, 38970, 43850, 45338, 13024, 53461, 50324, 51121, 47824, 55528, 956, 63930, 41718, 59337, 25646, 54384, 27554, 48235, 8623, 37951, 19544, 57523, 59671, 42469, 1394};
                                    char[] cArr12 = {0, 0, 0, 0};
                                    int i42 = g;
                                    int i43 = ((i42 | 83) << 1) - (i42 ^ 83);
                                    d = i43 % 128;
                                    int i44 = i43 % 2;
                                    int i45 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                    int i46 = (i45 ^ 1) + ((i45 & 1) << 1);
                                    Object[] objArr7 = new Object[1];
                                    e(cArr11, cArr12, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{31383, 9508, 50634, 7048}, i46, objArr7);
                                    Object objNewInstance = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr6);
                                    int i47 = d + 55;
                                    int i48 = i47 % 128;
                                    g = i48;
                                    if (i47 % 2 == 0) {
                                        throw null;
                                    }
                                    int i49 = i48 + 67;
                                    d = i49 % 128;
                                    int i50 = i49 % 2;
                                    try {
                                        int i51 = -(-KeyEvent.getDeadChar(0, 0));
                                        int i52 = (i51 & 23) + (i51 | 23);
                                        Object[] objArr8 = new Object[1];
                                        c(new char[]{32065, 37209, 58368, 35668, 5269, 53479, 22279, 14601, 10492, 22590, 65424, 8315, 62844, 26705, 7207, 12946, 50161, 27608, 54220, 42655, 65038, 53960, 32208, 8071, 1745, 59257}, i52, objArr8);
                                        Class<?> cls4 = Class.forName((String) objArr8[0]);
                                        int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i53 = (maximumDrawingCacheSize * (-167)) - 2839;
                                        int i54 = ~maximumDrawingCacheSize;
                                        int i55 = ~((i54 ^ (-18)) | (i54 & (-18)));
                                        int i56 = ~(((-18) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-18) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                        int i57 = ((i55 ^ i56) | (i56 & i55)) * 336;
                                        int i58 = ((i53 | i57) << 1) - (i57 ^ i53);
                                        int i59 = ~((maximumDrawingCacheSize ^ 17) | (maximumDrawingCacheSize & 17));
                                        int i60 = ~((maximumDrawingCacheSize ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (maximumDrawingCacheSize & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                                        int i61 = -(-(((i59 ^ i60) | (i59 & i60)) * (-168)));
                                        int i62 = (i58 ^ i61) + ((i61 & i58) << 1);
                                        int i63 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                        int i64 = -(-(((-18) | (~((i63 & maximumDrawingCacheSize) | (i63 ^ maximumDrawingCacheSize)))) * 168));
                                        int i65 = ((i62 | i64) << 1) - (i64 ^ i62);
                                        Object[] objArr9 = new Object[1];
                                        c(new char[]{6471, 9028, 37358, 47487, 64712, 50818, 60059, 38391, 55150, 48739, 849, 16418, 32999, 64571, 60836, 18172, 1253, 43206, 47243, 47678}, i65, objArr9);
                                        Object objInvoke = cls4.getMethod((String) objArr9[0], null).invoke(context, null);
                                        try {
                                            char[] cArr13 = {32065, 37209, 58368, 35668, 5269, 53479, 22279, 14601, 10492, 22590, 65424, 8315, 62844, 26705, 7207, 12946, 50161, 27608, 54220, 42655, 65038, 53960, 32208, 8071, 1745, 59257};
                                            int offsetBefore = TextUtils.getOffsetBefore("", 0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i66 = offsetBefore * 784;
                                            int i67 = (i66 ^ (-17986)) + ((i66 & (-17986)) << 1);
                                            int i68 = (i67 & 18792) + (i67 | 18792);
                                            int i69 = ~offsetBefore;
                                            int i70 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i71 = (i69 & i70) | (i69 ^ i70);
                                            int i72 = i68 + ((~((i71 & 23) | (i71 ^ 23))) * (-783));
                                            int i73 = ~offsetBefore;
                                            int i74 = d;
                                            int i75 = ((i74 | 45) << 1) - (i74 ^ 45);
                                            g = i75 % 128;
                                            int i76 = i75 % 2;
                                            int i77 = ~(i70 | 23);
                                            if (i76 == 0) {
                                                int i78 = i72 >>> (783 >>> ((i73 & i77) | (i73 ^ i77)));
                                                Object[] objArr10 = new Object[1];
                                                c(cArr13, i78, objArr10);
                                                cls = Class.forName((String) objArr10[0]);
                                                cArr = new char[]{35658, 10689, 14628, 63886, 31097, 24905, 65375, 58204, 61606, 46622, 1688, 42660, 29420, 60569};
                                                cArr2 = new char[]{0, 0, 0, 0};
                                            } else {
                                                int i79 = ((i73 & i77) | (i73 ^ i77)) * 783;
                                                int i80 = ((i72 | i79) << 1) - (i79 ^ i72);
                                                Object[] objArr11 = new Object[1];
                                                c(cArr13, i80, objArr11);
                                                cls = Class.forName((String) objArr11[0]);
                                                cArr = new char[]{35658, 10689, 14628, 63886, 31097, 24905, 65375, 58204, 61606, 46622, 1688, 42660, 29420, 60569};
                                                cArr2 = new char[]{0, 0, 0, 0};
                                            }
                                            int i81 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                            char[] cArr14 = cArr;
                                            char[] cArr15 = cArr2;
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i82 = i81 * 530;
                                            int i83 = (i82 & 1058) + (i82 | 1058);
                                            int i84 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                            int i85 = (((i83 | 28685190) << 1) - (28685190 ^ i83)) + (((~((i84 & i81) | (i84 ^ i81))) | (~((i81 ^ 54123) | (54123 & i81)))) * 529);
                                            int i86 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i81) | (i81 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                            int i87 = ((i86 & (-54124)) | ((-54124) ^ i86)) * 529;
                                            Object[] objArr12 = new Object[1];
                                            e(cArr14, cArr15, (char) ((i85 ^ i87) + ((i87 & i85) << 1)), new char[]{37090, 45884, 27633, 62931}, ViewConfiguration.getScrollBarSize() >> 8, objArr12);
                                            try {
                                                Object[] objArr13 = {cls.getMethod((String) objArr12[0], null).invoke(context, null), 64};
                                                char[] cArr16 = {48769, 23709, 19061, 4681, 40537, 47551, 25183, 22751, 21689, 2775, 61403, 36450, 24203, 8177, 19129, 58324, 27969, 28540, 15529, 20917, 15528, 50665, 9448, 40480, 45993, 18595, 614, 33930, 27647, 46313, 47944, 60717, 4819};
                                                char[] cArr17 = {0, 0, 0, 0};
                                                char c2 = (char) (ViewCompat.MEASURED_SIZE_MASK - (~(-(-Color.rgb(0, 0, 0)))));
                                                char[] cArr18 = {29133, 39110, 29163, 25418};
                                                int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                int i88 = (pressedStateDuration * 659) - (-1558886399);
                                                int i89 = ~((~pressedStateDuration) | (-342309263));
                                                int i90 = (342309262 ^ pressedStateDuration) | (342309262 & pressedStateDuration);
                                                int i91 = ~i90;
                                                int i92 = (i89 ^ i91) | (i91 & i89);
                                                int i93 = (pressedStateDuration ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & pressedStateDuration);
                                                int i94 = (i92 | (~i93)) * (-658);
                                                int i95 = (((i88 ^ i94) + ((i94 & i88) << 1)) - (~(-(-((~i90) * 658))))) - 1;
                                                int i96 = ~((342309262 & pressedStateDuration) | (342309262 ^ pressedStateDuration));
                                                int i97 = ~i93;
                                                int i98 = ((i96 & i97) | (i96 ^ i97)) * 658;
                                                try {
                                                    Object[] objArr14 = new Object[1];
                                                    e(cArr16, cArr17, c2, cArr18, (i95 & i98) + (i98 | i95), objArr14);
                                                    Class<?> cls5 = Class.forName((String) objArr14[0]);
                                                    int i99 = -ExpandableListView.getPackedPositionChild(0L);
                                                    int i100 = i99 * (-830);
                                                    int i101 = (i100 & 10816) + (i100 | 10816);
                                                    int i102 = ~i;
                                                    int i103 = ~((-14) | i102);
                                                    int i104 = (i99 ^ 13) | (i99 & 13);
                                                    int i105 = ~((i104 & i) | (i104 ^ i));
                                                    int i106 = ((i103 & i105) | (i103 ^ i105)) * (-831);
                                                    int i107 = ((i101 | i106) << 1) - (i101 ^ i106);
                                                    int i108 = ((-14) ^ i99) | ((-14) & i99);
                                                    int i109 = i107 + ((~((i108 & i) | (i108 ^ i))) * (-1662));
                                                    int i110 = ~i99;
                                                    int i111 = ~i;
                                                    int i112 = ~(i110 | i111);
                                                    int i113 = ~((i99 & i) | (i99 ^ i));
                                                    int i114 = (i113 & i112) | (i112 ^ i113);
                                                    int i115 = ~((i ^ 13) | (i & 13));
                                                    int i116 = ((i114 & i115) | (i114 ^ i115)) * 831;
                                                    Object[] objArr15 = new Object[1];
                                                    c(new char[]{52466, 21342, 47006, 32401, 59059, 26106, 1959, 9057, 20624, 35752, 30954, 15909, 21309, 10885, 47623, 27536}, (i109 & i116) + (i116 | i109), objArr15);
                                                    Object objInvoke2 = cls5.getMethod((String) objArr15[0], String.class, Integer.TYPE).invoke(objInvoke, objArr13);
                                                    try {
                                                        int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        int i117 = minimumFlingVelocity * (-167);
                                                        int i118 = (i117 ^ (-5010)) + ((i117 & (-5010)) << 1);
                                                        int i119 = ~minimumFlingVelocity;
                                                        int i120 = ~((i119 ^ (-31)) | (i119 & (-31)));
                                                        int i121 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                        int i122 = ~((i121 & (-31)) | ((-31) ^ i121));
                                                        int i123 = -(-(((i120 & i122) | (i120 ^ i122)) * 168));
                                                        int i124 = (i118 & i123) + (i118 | i123);
                                                        int i125 = ~minimumFlingVelocity;
                                                        int i126 = (i124 - (~(-(-((~((i125 | (-31)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6)) * 168))))) - 1;
                                                        int i127 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                        int i128 = ~((i119 & i127) | (i119 ^ i127));
                                                        int i129 = ~((i125 & 30) | (i125 ^ 30));
                                                        int i130 = (i128 & i129) | (i128 ^ i129);
                                                        int i131 = ~((minimumFlingVelocity & (-31)) | ((-31) ^ minimumFlingVelocity) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                                        int i132 = -(-(((i131 & i130) | (i130 ^ i131)) * 168));
                                                        int i133 = (i126 ^ i132) + ((i132 & i126) << 1);
                                                        Object[] objArr16 = new Object[1];
                                                        c(new char[]{20152, 42523, 13616, 7947, 56698, 18917, 61981, 51640, 46547, 44918, 43150, 31076, 49760, 402, 18899, 170, 39026, 38327, 34262, 64695, 50533, 6073, 27370, 51448, 58507, 26787, 35508, 35659, 25774, 14790, 47909, 18810}, i133, objArr16);
                                                        Class<?> cls6 = Class.forName((String) objArr16[0]);
                                                        Object[] objArr17 = new Object[1];
                                                        e(new char[]{36812, 36810, 5094, 54105, 40064, 14102, 13381, 1487, 34284, 64431}, new char[]{0, 0, 0, 0}, (char) (KeyEvent.getMaxKeyCode() >> 16), new char[]{21243, 22018, 55942, 11247}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr17);
                                                        Object[] objArr18 = (Object[]) cls6.getField((String) objArr17[0]).get(objInvoke2);
                                                        int length = objArr18.length;
                                                        int i134 = g;
                                                        int i135 = ((i134 | 13) << 1) - (i134 ^ 13);
                                                        d = i135 % 128;
                                                        int i136 = i135 % 2;
                                                        int i137 = 0;
                                                        while (true) {
                                                            if (i137 < length) {
                                                                Object obj = objArr18[i137];
                                                                char[] cArr19 = {44398, 61788, 32782, 16155, 34310, 46314, 37211, 39209};
                                                                int i138 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                int i139 = i138 * (-958);
                                                                int i140 = ((i139 | (-4790)) << 1) - (i139 ^ (-4790));
                                                                int i141 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                int i142 = d + 59;
                                                                Object[] objArr19 = objArr18;
                                                                g = i142 % 128;
                                                                int i143 = i142 % 2;
                                                                int i144 = ~(((-6) ^ i141) | ((-6) & i141));
                                                                int i145 = ~i138;
                                                                int i146 = ~((i145 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i145 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                                int i147 = (i144 & i146) | (i144 ^ i146);
                                                                int i148 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                                                int i149 = (i147 | (~((i148 ^ i138) | (i148 & i138)))) * 959;
                                                                int i150 = (i140 & i149) + (i149 | i140);
                                                                int i151 = (~((i138 ^ 5) | (i138 & 5))) * (-959);
                                                                int i152 = ((i150 | i151) << 1) - (i151 ^ i150);
                                                                int i153 = ~i138;
                                                                int i154 = ~((i153 & i148) | (i153 ^ i148));
                                                                int i155 = ~(((-6) & iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | ((-6) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                                int i156 = (i154 & i155) | (i154 ^ i155);
                                                                int i157 = ~((i138 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | (i138 & iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                                                int i158 = -(-(((i156 & i157) | (i156 ^ i157)) * 959));
                                                                int i159 = (i152 & i158) + (i158 | i152);
                                                                Object[] objArr20 = new Object[1];
                                                                c(cArr19, i159, objArr20);
                                                                String str = (String) objArr20[0];
                                                                int i160 = d;
                                                                int i161 = ((i160 | 53) << 1) - (i160 ^ 53);
                                                                g = i161 % 128;
                                                                if (i161 % 2 == 0) {
                                                                    int i162 = 3 / 2;
                                                                }
                                                                try {
                                                                    Object[] objArr21 = {str};
                                                                    char[] cArr20 = {33239, 24474, 31810, 20680, 42568, 52418, 24366, 22479, 29218, 641, 15653, 27608, 46023, 17241, 24495, 59043, 15400, 24214, 23910, 30386, 21326, 15524, 31677, 60422, 47654, 17736, 47202, 14222, 20650, 55034, 7655, 482, 53813, 30962, 56279, 33435, 51782, 57333, 48256, 2549};
                                                                    int i163 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                                                    int i164 = g;
                                                                    int i165 = (i164 & 107) + (i164 | 107);
                                                                    d = i165 % 128;
                                                                    if (i165 % 2 != 0) {
                                                                        i7 = ((216 - (~(-(-i163)))) % (-253)) >>> (216 << (~((i163 ^ i) | (i163 & i))));
                                                                    } else {
                                                                        int i166 = i163 * 217;
                                                                        int i167 = (i166 ^ (-8170)) + ((i166 & (-8170)) << 1);
                                                                        int i168 = -(-((~((i163 ^ i) | (i163 & i))) * 216));
                                                                        i7 = (i167 ^ i168) + ((i168 & i167) << 1);
                                                                    }
                                                                    int i169 = (i163 ^ (-39)) | (i163 & (-39));
                                                                    int i170 = (i7 - (~(-(-((-216) * ((i169 & i111) | (i169 ^ i111))))))) - 1;
                                                                    int i171 = ~(i163 | i111);
                                                                    int i172 = ((i171 & 38) | (i171 ^ 38)) * 216;
                                                                    int i173 = (i170 ^ i172) + ((i172 & i170) << 1);
                                                                    Object[] objArr22 = new Object[1];
                                                                    c(cArr20, i173, objArr22);
                                                                    Class<?> cls7 = Class.forName((String) objArr22[0]);
                                                                    int i174 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                                    int i175 = i174 * (-51);
                                                                    int i176 = (i175 ^ 583) + ((i175 & 583) << 1);
                                                                    int i177 = -(-((~(i102 | i174 | 11)) * 52));
                                                                    int i178 = (i176 ^ i177) + ((i177 & i176) << 1);
                                                                    int i179 = (~(((-12) ^ i174) | ((-12) & i174))) | (~(((-12) ^ i102) | ((-12) & i102)));
                                                                    int i180 = ~((i102 ^ i174) | (i102 & i174));
                                                                    int i181 = -(-(((i179 ^ i180) | (i179 & i180)) * (-52)));
                                                                    int i182 = (i178 & i181) + (i178 | i181);
                                                                    int i183 = ~i174;
                                                                    int i184 = ~((i183 ^ i111) | (i183 & i111));
                                                                    int i185 = ~(i183 | 11);
                                                                    int i186 = i182 + (((i184 ^ i185) | (i185 & i184)) * 52);
                                                                    Object[] objArr23 = new Object[1];
                                                                    c(new char[]{48913, 8089, 8466, 11229, 35369, 42673, 49477, 39338, 3839, 59141, 5693, 61044, 26904, 59587}, i186, objArr23);
                                                                    Object objInvoke3 = cls7.getMethod((String) objArr23[0], String.class).invoke(null, objArr21);
                                                                    int i187 = g + 51;
                                                                    d = i187 % 128;
                                                                    if (i187 % 2 != 0) {
                                                                        try {
                                                                            cArr3 = new char[]{16801, 40666, 30297, 47736, 7132, 38580, 33734, 39437, 30708, 57323, 16359, 24943, 53924, 11146, 24312, 5202, 61993, 59155, 60007, 1949, 5685, 58509, 46189, 57384, 36357, 32257, 49326, 7204};
                                                                            cArr4 = new char[]{0, 0, 0, 0};
                                                                            capsMode = TextUtils.getCapsMode("", 1, 0);
                                                                        } catch (Throwable th) {
                                                                            Throwable cause = th.getCause();
                                                                            if (cause != null) {
                                                                                throw cause;
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } else {
                                                                        cArr3 = new char[]{16801, 40666, 30297, 47736, 7132, 38580, 33734, 39437, 30708, 57323, 16359, 24943, 53924, 11146, 24312, 5202, 61993, 59155, 60007, 1949, 5685, 58509, 46189, 57384, 36357, 32257, 49326, 7204};
                                                                        cArr4 = new char[]{0, 0, 0, 0};
                                                                        capsMode = TextUtils.getCapsMode("", 0, 0);
                                                                    }
                                                                    char[] cArr21 = cArr3;
                                                                    char[] cArr22 = cArr4;
                                                                    int i188 = g;
                                                                    int i189 = (i188 ^ 57) + ((i188 & 57) << 1);
                                                                    d = i189 % 128;
                                                                    int i190 = i189 % 2;
                                                                    Object[] objArr24 = new Object[1];
                                                                    e(cArr21, cArr22, (char) (((59642 | capsMode) << 1) - (59642 ^ capsMode)), new char[]{12531, 31588, 64035, 33512}, TextUtils.indexOf("", "", 0, 0), objArr24);
                                                                    Class<?> cls8 = Class.forName((String) objArr24[0]);
                                                                    int i191 = length;
                                                                    int i192 = -(-Color.blue(0));
                                                                    int i193 = i102;
                                                                    Object[] objArr25 = new Object[1];
                                                                    e(new char[]{47852, 47057, 30749, 35031, 49358, 51810, 10533, 15745, 61270, 42395, 48335}, new char[]{0, 0, 0, 0}, (char) Color.blue(0), new char[]{61003, 8916, 597, 4316}, (i192 & 1428346094) + (i192 | 1428346094), objArr25);
                                                                    try {
                                                                        Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls8.getMethod((String) objArr25[0], null).invoke(obj, null))};
                                                                        Object[] objArr27 = new Object[1];
                                                                        c(new char[]{33239, 24474, 31810, 20680, 42568, 52418, 24366, 22479, 29218, 641, 15653, 27608, 46023, 17241, 24495, 59043, 15400, 24214, 23910, 30386, 21326, 15524, 31677, 60422, 47654, 17736, 47202, 14222, 20650, 55034, 7655, 482, 53813, 30962, 56279, 33435, 51782, 57333, 48256, 2549}, 35 - (~(-Process.getGidForName(""))), objArr27);
                                                                        String str2 = (String) objArr27[0];
                                                                        int i194 = d;
                                                                        int i195 = (i194 ^ 35) + ((i194 & 35) << 1);
                                                                        g = i195 % 128;
                                                                        if (i195 % 2 == 0) {
                                                                            cls2 = Class.forName(str2);
                                                                            cArr5 = new char[]{46611, 51839, 53535, 56275, 19085, 40104, 10279, 44962, 22985, 2906, 38095, 64782, 61079, 48466, 54336, 56187, 46886, 48839, 13820};
                                                                            cArr6 = new char[]{0, 0, 0, 0};
                                                                            longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 95;
                                                                        } else {
                                                                            cls2 = Class.forName(str2);
                                                                            cArr5 = new char[]{46611, 51839, 53535, 56275, 19085, 40104, 10279, 44962, 22985, 2906, 38095, 64782, 61079, 48466, 54336, 56187, 46886, 48839, 13820};
                                                                            cArr6 = new char[]{0, 0, 0, 0};
                                                                            longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
                                                                        }
                                                                        int i196 = -longPressTimeout;
                                                                        char[] cArr23 = cArr5;
                                                                        char[] cArr24 = cArr6;
                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        int i197 = (i196 * 50) - 4212128;
                                                                        int i198 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                                        int i199 = -(-(((~((i198 & (-43425)) | ((-43425) ^ i198))) | (~(((-43425) ^ i196) | ((-43425) & i196)))) * 98));
                                                                        int i200 = (i197 & i199) + (i197 | i199);
                                                                        int i201 = ~i196;
                                                                        int i202 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                                                        int i203 = ~((i201 & i202) | (i201 ^ i202));
                                                                        int i204 = ~((i196 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i196 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                                                        int i205 = g;
                                                                        int i206 = (i205 ^ 117) + ((i205 & 117) << 1);
                                                                        int i207 = i206 % 128;
                                                                        d = i207;
                                                                        int i208 = i206 % 2;
                                                                        int i209 = (i200 - (~(-(-((-49) * (((i203 & (-43425)) | ((-43425) ^ i203)) | i204)))))) - 1;
                                                                        int i210 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & (-43425)) | ((-43425) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                                                        int i211 = ~(i196 | 43424);
                                                                        int i212 = i207 + 115;
                                                                        g = i212 % 128;
                                                                        int i213 = i212 % 2;
                                                                        char c3 = (char) (i209 + (49 * ((i210 & i211) | (i210 ^ i211))));
                                                                        int i214 = -(-Color.red(0));
                                                                        int i215 = (i214 ^ (-1505059876)) + ((i214 & (-1505059876)) << 1);
                                                                        Object[] objArr28 = new Object[1];
                                                                        e(cArr23, cArr24, c3, new char[]{56401, 19099, 41126, 15785}, i215, objArr28);
                                                                        String str3 = (String) objArr28[0];
                                                                        Class<?>[] clsArr = new Class[1];
                                                                        int i216 = d + 103;
                                                                        g = i216 % 128;
                                                                        int i217 = i216 % 2;
                                                                        clsArr[0] = InputStream.class;
                                                                        Object objInvoke4 = cls2.getMethod(str3, clsArr).invoke(objInvoke3, objArr26);
                                                                        try {
                                                                            Object[] objArr29 = new Object[1];
                                                                            e(new char[]{47455, 56986, 19280, 15835, 44897, 4994, 19917, 34466, 1346, 6341, 14536, 29697, 16368, 51405, 53958, 4218, 9314, 10210, 63901, 13534, 10136, 33760, 44742, 7153, 51806, 36191, 11502, 65188, 5164, 33482, 17513, 58167, 65157, 39911}, new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{40696, 28337, 1481, 6382}, ViewConfiguration.getPressedStateDuration() >> 16, objArr29);
                                                                            Class<?> cls9 = Class.forName((String) objArr29[0]);
                                                                            int i218 = -Process.getGidForName("");
                                                                            int i219 = ((i218 | 22) << 1) - (i218 ^ 22);
                                                                            Object[] objArr30 = new Object[1];
                                                                            c(new char[]{14101, 18585, 24033, 44537, 3239, 53653, 4046, 61148, 57188, 30615, 35024, 32161, 26287, 58744, 33781, 20934, 16227, 51872, 24453, 42497, 20477, 38488, 14939, 62601, 20579, 61718}, i219, objArr30);
                                                                            if (!NewInstance.equals(cls9.getMethod((String) objArr30[0], null).invoke(objInvoke4, null))) {
                                                                                int i220 = g;
                                                                                int i221 = (i220 & 89) + (i220 | 89);
                                                                                d = i221 % 128;
                                                                                int i222 = i221 % 2;
                                                                                try {
                                                                                    char[] cArr25 = {47455, 56986, 19280, 15835, 44897, 4994, 19917, 34466, 1346, 6341, 14536, 29697, 16368, 51405, 53958, 4218, 9314, 10210, 63901, 13534, 10136, 33760, 44742, 7153, 51806, 36191, 11502, 65188, 5164, 33482, 17513, 58167, 65157, 39911};
                                                                                    char[] cArr26 = {0, 0, 0, 0};
                                                                                    char c4 = (char) ((-2) - ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) ^ (-1)));
                                                                                    char[] cArr27 = {40696, 28337, 1481, 6382};
                                                                                    int i223 = g + 75;
                                                                                    d = i223 % 128;
                                                                                    if (i223 % 2 != 0) {
                                                                                        Object[] objArr31 = new Object[1];
                                                                                        e(cArr25, cArr26, c4, cArr27, TextUtils.indexOf("", "", 1), objArr31);
                                                                                        cls3 = Class.forName((String) objArr31[0]);
                                                                                        cArr7 = new char[]{14101, 18585, 24033, 44537, 3239, 53653, 4046, 61148, 57188, 30615, 35024, 32161, 26287, 58744, 33781, 20934, 16227, 51872, 24453, 42497, 20477, 38488, 14939, 62601, 20579, 61718};
                                                                                        i8 = 92;
                                                                                        i9 = 1;
                                                                                    } else {
                                                                                        Object[] objArr32 = new Object[1];
                                                                                        e(cArr25, cArr26, c4, cArr27, TextUtils.indexOf("", "", 0), objArr32);
                                                                                        cls3 = Class.forName((String) objArr32[0]);
                                                                                        cArr7 = new char[]{14101, 18585, 24033, 44537, 3239, 53653, 4046, 61148, 57188, 30615, 35024, 32161, 26287, 58744, 33781, 20934, 16227, 51872, 24453, 42497, 20477, 38488, 14939, 62601, 20579, 61718};
                                                                                        i8 = 22;
                                                                                        i9 = 0;
                                                                                    }
                                                                                    int i224 = -ImageFormat.getBitsPerPixel(i9);
                                                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                                    int i225 = i224 * (-129);
                                                                                    int i226 = -(-(i8 * 131));
                                                                                    int i227 = (i225 & i226) + (i226 | i225);
                                                                                    int i228 = (~i8) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                                                                                    int i229 = -(-((~((i228 & i224) | (i228 ^ i224))) * 130));
                                                                                    int i230 = (i227 ^ i229) + ((i227 & i229) << 1);
                                                                                    int i231 = ~i8;
                                                                                    int i232 = (i231 ^ i224) | (i231 & i224);
                                                                                    int i233 = -(-((~i232) * (-260)));
                                                                                    int i234 = ((i230 | i233) << 1) - (i233 ^ i230);
                                                                                    int i235 = ~((~i224) | i8);
                                                                                    int i236 = d + 79;
                                                                                    g = i236 % 128;
                                                                                    if (i236 % 2 == 0) {
                                                                                        int i237 = -((~((i232 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i232 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9))) | i235);
                                                                                        Object[] objArr33 = new Object[1];
                                                                                        c(cArr7, i234 % ((i237 & 130) + (i237 | 130)), objArr33);
                                                                                        method = cls3.getMethod((String) objArr33[0], null);
                                                                                        objArr = null;
                                                                                    } else {
                                                                                        int i238 = ~(i231 | i224 | iTuitionPaymentFragmentspecialinlinedviewModeldefault9);
                                                                                        int i239 = (i234 - (~(((i238 & i235) | (i235 ^ i238)) * 130))) - 1;
                                                                                        Object[] objArr34 = new Object[1];
                                                                                        c(cArr7, i239, objArr34);
                                                                                        objArr = null;
                                                                                        method = cls3.getMethod((String) objArr34[0], null);
                                                                                    }
                                                                                    if (!objNewInstance.equals(method.invoke(objInvoke4, objArr))) {
                                                                                        int i240 = (i137 ^ 82) + ((i137 & 82) << 1);
                                                                                        i137 = (i240 ^ (-81)) + ((i240 & (-81)) << 1);
                                                                                        objArr18 = objArr19;
                                                                                        i102 = i193;
                                                                                        length = i191;
                                                                                    }
                                                                                } catch (Throwable th2) {
                                                                                    Throwable cause2 = th2.getCause();
                                                                                    if (cause2 != null) {
                                                                                        throw cause2;
                                                                                    }
                                                                                    throw th2;
                                                                                }
                                                                            }
                                                                            int i241 = (~(i & 1)) & (i | 1);
                                                                            Object[] objArr35 = new Object[4];
                                                                            int[] iArr = new int[1];
                                                                            objArr35[0] = iArr;
                                                                            objArr35[1] = new int[1];
                                                                            int[] iArr2 = new int[1];
                                                                            objArr35[2] = iArr2;
                                                                            int i242 = g;
                                                                            int i243 = (i242 ^ 97) + ((i242 & 97) << 1);
                                                                            d = i243 % 128;
                                                                            if (i243 % 2 != 0) {
                                                                                iArr[0] = i;
                                                                                iArr2[1] = i241;
                                                                            } else {
                                                                                iArr[0] = i;
                                                                                iArr2[0] = i241;
                                                                            }
                                                                            objArr35[3] = null;
                                                                            int i244 = 2029882472 + (((-2779713) | i111) * (-369)) + (((~((-919962648) | i111)) | (-879652419)) * (-369)) + (((~(919962647 | i)) | (-922742360) | (~((-876872707) | i111))) * 369) + 16;
                                                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = CrashlyticsAnalyticsListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                            int i245 = (i244 * (-518)) + (i2 * (-518));
                                                                            int i246 = ~i244;
                                                                            int i247 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                                                            int i248 = ((~(i246 | i247)) | i2) * 519;
                                                                            int i249 = ((i245 | i248) << 1) - (i245 ^ i248);
                                                                            int i250 = ~i244;
                                                                            int i251 = (i250 & i247) | (i250 ^ i247);
                                                                            int i252 = ~((i251 & i2) | (i251 ^ i2));
                                                                            int i253 = i244 | i2;
                                                                            int i254 = ~((i253 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i253 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                                            int i255 = -(-(((i252 & i254) | (i252 ^ i254)) * (-519)));
                                                                            int i256 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & i2) | (i2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                                                            int i257 = ((((i249 | i255) << 1) - (i255 ^ i249)) - (~(((i256 & i244) | (i244 ^ i256)) * 519))) - 1;
                                                                            int i258 = i257 << 13;
                                                                            int i259 = d + 15;
                                                                            g = i259 % 128;
                                                                            int i260 = i259 % 2;
                                                                            int i261 = (i258 | i257) & (~(i257 & i258));
                                                                            int i262 = i261 >>> 17;
                                                                            int i263 = (i261 | i262) & (~(i261 & i262));
                                                                            int i264 = i263 << 5;
                                                                            ((int[]) objArr35[1])[0] = ((~i263) & i264) | ((~i264) & i263);
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
                                                            NewInstance = i2;
                                                        }
                                                    } catch (Throwable unused) {
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    Throwable cause6 = th.getCause();
                                                    if (cause6 != null) {
                                                        throw cause6;
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                            }
                                        } catch (Throwable th8) {
                                            Throwable cause7 = th8.getCause();
                                            if (cause7 != null) {
                                                throw cause7;
                                            }
                                            throw th8;
                                        }
                                    } catch (Throwable th9) {
                                        Throwable cause8 = th9.getCause();
                                        if (cause8 != null) {
                                            throw cause8;
                                        }
                                        throw th9;
                                    }
                                    i3 = 4;
                                    r5 = NewInstance;
                                } catch (Throwable th10) {
                                    Throwable cause9 = th10.getCause();
                                    if (cause9 != null) {
                                        throw cause9;
                                    }
                                    throw th10;
                                }
                            } catch (Throwable unused2) {
                            }
                        } catch (Throwable th11) {
                            Throwable cause10 = th11.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th11;
                        }
                    } catch (Throwable unused3) {
                        NewInstance = i2;
                    }
                } else {
                    r5 = i2;
                    i3 = 4;
                }
                Object[] objArr36 = new Object[i3];
                objArr36[0] = new int[]{i};
                objArr36[1] = new int[1];
                objArr36[2] = new int[]{i};
                int i265 = g;
                int i266 = ((i265 | 71) << 1) - (i265 ^ 71);
                d = i266 % 128;
                int i267 = i266 % 2;
                objArr36[3] = null;
                int iMyTid = Process.myTid();
                int i268 = ~iMyTid;
                int i269 = (-195430598) + ((~(692627638 | i268)) * 979) + ((iMyTid | 732937867) * (-979)) + (((~(iMyTid | 692627638)) | (~(i268 | 732937867))) * 979);
                int i270 = i269 * 714;
                int i271 = -(-(r5 * (-712)));
                int i272 = ((i270 | i271) << 1) - (i270 ^ i271);
                int i273 = ~i269;
                int i274 = ~i;
                int i275 = (~((i273 & r5) | ((i273 ^ r5) == true ? 1 : 0))) | (~(i273 | i274));
                int i276 = ~r5;
                int i277 = (i276 & i269) | (i276 ^ i269);
                int i278 = ~((i277 & i) | (i277 ^ i));
                int i279 = -(-(((i275 & i278) | (i275 ^ i278)) * (-713)));
                int i280 = (i272 & i279) + (i279 | i272);
                int i281 = ~r5;
                int i282 = (i281 ^ i269) | (i281 & i269);
                int i283 = -(-((~((i & i282) | (i282 ^ i))) * 1426));
                int i284 = ((i280 | i283) << 1) - (i283 ^ i280);
                int i285 = -(-((~((i281 ^ i274) | (i281 & i274))) * 713));
                int i286 = (i284 & i285) + (i285 | i284);
                int i287 = i286 << 13;
                int i288 = (i287 & (~i286)) | ((~i287) & i286);
                int i289 = i288 >>> 17;
                int i290 = ((~i288) & i289) | ((~i289) & i288);
                int i291 = i290 << 5;
                ((int[]) objArr36[1])[0] = (i290 | i291) & (~(i290 & i291));
                return objArr36;
            }

            private static String $$c(byte b2, short s, int i) {
                int i2 = b2 * 4;
                int i3 = i + 102;
                byte[] bArr = $$a;
                int i4 = 4 - (s * 2);
                byte[] bArr2 = new byte[1 - i2];
                int i5 = 0 - i2;
                int i6 = -1;
                if (bArr == null) {
                    i6 = -1;
                    i3 = i4 + i5;
                    i4++;
                }
                while (true) {
                    int i7 = i6 + 1;
                    bArr2[i7] = (byte) i3;
                    if (i7 == i5) {
                        return new String(bArr2, 0);
                    }
                    int i8 = i3;
                    i6 = i7;
                    i3 = bArr[i4] + i8;
                    i4++;
                }
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(NewsApi.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function4 = new Function2() { // from class: O
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd3 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind3 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove3 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(NewsRepository.class));
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function4;
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind3;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove3, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove3);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function5 = new Function2() { // from class: r8lambdalHmNJSrHqzvR3lGLIEmplJlVZCs
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd4 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind4 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove4 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(ComponentDialogExternalSyntheticLambda0.class));
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function5;
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind4;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove4, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove4);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function6 = new Function2() { // from class: OExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd5 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind5 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove5 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(PostMessageService1.class));
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function6;
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind5;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove5, new ZoomGestureDetectorgestureDetector1(false, false, 1, null));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove5);
        ZoomGestureDetectorZoomEventBegin zoomGestureDetectorZoomEventBegin = zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Boolean bool = Boolean.TRUE;
        Map<String, Object> map = zoomGestureDetectorZoomEventBegin.TuitionPaymentFragmentbindingInflater1;
        if (bool == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
        }
        map.put("isViewModel", bool);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ PostMessageService1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new PostMessageService1((ComponentDialogExternalSyntheticLambda0) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(ComponentDialogExternalSyntheticLambda0.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }
}

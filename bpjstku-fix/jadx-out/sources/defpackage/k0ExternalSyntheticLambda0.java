package defpackage;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.syariah.SyariahDataStore;
import com.bpjstku.data.syariah.SyariahRepository;
import com.bpjstku.data.syariah.remote.SyariahApi;
import com.bpjstku.data.syariah.remote.SyariahApiClient;
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
public final class k0ExternalSyntheticLambda0 {
    private static final isLenovoTablet TuitionPaymentFragmentbindingInflater1;

    static {
        Function1 function1 = new Function1() { // from class: getLoginLastError
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2((isLenovoTablet) obj);
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        TuitionPaymentFragmentbindingInflater1 = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    public static /* synthetic */ SyariahApiClient b(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        notifyStateDetached notifystatedetached = notifyStateDetached.INSTANCE;
        return (SyariahApiClient) notifyStateDetached.b(SyariahApiClient.class, (OkHttpClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, null), (String) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(String.class), new setUsingExifOrientation("baseUrl"), null));
    }

    public static /* synthetic */ ContextAware TuitionPaymentFragmentbindingInflater1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new getNavigationEventHandler((SyariahRepository) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(SyariahRepository.class), null, null), (PreferenceManager) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), null, null));
    }

    public static /* synthetic */ SyariahApi TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new SyariahApi((SyariahApiClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(SyariahApiClient.class), null, null));
    }

    public static /* synthetic */ SyariahRepository TuitionPaymentFragmentspecialinlinedviewModeldefault1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new SyariahDataStore((SyariahApi) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(SyariahApi.class), null, null));
    }

    public static /* synthetic */ createCaptureSession TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new createCaptureSession((ContextAware) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(ContextAware.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: getAllThreats
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return k0ExternalSyntheticLambda0.b((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(SyariahApiClient.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        boolean z = false;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: getActiveNewThreats
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return k0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(SyariahApi.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        getActiveThreats getactivethreats = new getActiveThreats();
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd3 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind3 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove3 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(SyariahRepository.class));
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getactivethreats;
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind3;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove3, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove3);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function4 = new Function2() { // from class: getBase64Signature
            private static final byte[] $$c = {109, 48, -62, 38};
            private static final int $$d = 196;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {15, -9, 64, -81, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
            private static final int $$b = 38;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f913a = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47255, 47254, 47235, 47224, 47258, 47256, 47251, 47221, 47250, 47247, 47249, 47237, 47181, 47245, 47252, 47207, 47241, 47244, 47236, 47257, 47243, 47239, 47208, 47248, 47226, 47234, 47238};
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719483;
            private static boolean b = true;
            private static boolean TuitionPaymentFragmentbindingInflater1 = true;

            /* JADX WARN: Code duplicated, block: B:10:0x002e  */
            /* JADX WARN: Code duplicated, block: B:8:0x0026  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0030). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.getBase64Signature.$$a
                    int r7 = r7 * 4
                    int r7 = 3 - r7
                    int r8 = r8 * 14
                    int r8 = 98 - r8
                    int r6 = r6 * 52
                    int r1 = 53 - r6
                    byte[] r1 = new byte[r1]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r0 != 0) goto L19
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L30
                L19:
                    r3 = r2
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L1d:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r8 = r8 + 1
                    int r4 = r3 + 1
                    if (r3 != r6) goto L2e
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L2e:
                    r3 = r0[r8]
                L30:
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getBase64Signature.d(short, byte, byte, java.lang.Object[]):void");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = f913a + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                Object obj3 = null;
                FileTransformFactory fileTransformFactory = (FileTransformFactory) obj;
                CoordinateTransform coordinateTransform = (CoordinateTransform) obj2;
                if (i2 % 2 != 0) {
                    k0ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(fileTransformFactory, coordinateTransform);
                    throw null;
                }
                ContextAware contextAwareTuitionPaymentFragmentbindingInflater1 = k0ExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(fileTransformFactory, coordinateTransform);
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
                f913a = i3 % 128;
                if (i3 % 2 != 0) {
                    return contextAwareTuitionPaymentFragmentbindingInflater1;
                }
                obj3.hashCode();
                throw null;
            }

            private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
                int length;
                char[] cArr2;
                int i2;
                int i3 = 2;
                int i4 = 2 % 2;
                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i5 = 0;
                if (cArr3 != null) {
                    int i6 = $10 + 45;
                    int i7 = i6 % 128;
                    $11 = i7;
                    if (i6 % 2 == 0) {
                        length = cArr3.length;
                        cArr2 = new char[length];
                        i2 = 1;
                    } else {
                        length = cArr3.length;
                        cArr2 = new char[length];
                        i2 = 0;
                    }
                    int i8 = i7 + 113;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    while (i2 < length) {
                        int i10 = $10 + 89;
                        $11 = i10 % 128;
                        if (i10 % i3 == 0) {
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[i5] = Integer.valueOf(cArr3[i2]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) i5;
                                    byte b3 = b2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.red(i5) + 31339), 2994 - (ViewConfiguration.getTapTimeout() >> 16), MotionEvent.axisFromString("") + 18, 1182129903, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                cArr2[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                i2--;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(cArr3[i2])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (31339 - TextUtils.getCapsMode("", 0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 2994, Color.red(0) + 17, 1182129903, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            cArr2[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i2++;
                        }
                        i3 = 2;
                        i5 = 0;
                    }
                    cArr3 = cArr2;
                }
                Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43325), 253 - (Process.myPid() >> 22), 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                int i11 = 33602;
                char c = '0';
                if (TuitionPaymentFragmentbindingInflater1) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                    char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i12 = $11 + 89;
                        $10 = i12 % 128;
                        if (i12 % 2 != 0) {
                            cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 >>> getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] * i] / iIntValue);
                            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 1;
                                byte b7 = (byte) (b6 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.lastIndexOf("", c, 0) + 33603), 3085 - TextUtils.getOffsetAfter("", 0), 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                        } else {
                            cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                            Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b8 = (byte) 1;
                                byte b9 = (byte) (b8 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + i11), 3085 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 26 - Color.argb(0, 0, 0, 0), -2146875848, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                            i11 = 33602;
                            c = '0';
                        }
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                int i13 = 0;
                if (b) {
                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        int i14 = $11 + 27;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 / getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] >> i] / iIntValue);
                            Object[] objArr7 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                byte b10 = (byte) 1;
                                byte b11 = (byte) (b10 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (TextUtils.indexOf("", "") + 33602), Color.red(0) + 3085, 26 - View.combineMeasuredStates(0, 0), -2146875848, false, $$e(b10, b11, b11), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                        } else {
                            cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                            Object[] objArr8 = {getsupportedpostviewsize, getsupportedpostviewsize};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                byte b12 = (byte) 1;
                                byte b13 = (byte) (b12 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (33601 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.lastIndexOf("", '0') + 3086, View.MeasureSpec.getSize(0) + 26, -2146875848, false, $$e(b12, b13, b13), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                        }
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                while (true) {
                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13;
                    if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                        i13 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
                    }
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
            public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Class r31, int r32, int r33, int r34) {
                /*
                    Method dump skipped, instruction units count: 2735
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.getBase64Signature.TuitionPaymentFragmentspecialinlinedviewModeldefault3(java.lang.Class, int, int, int):java.lang.Object[]");
            }

            private static String $$e(byte b2, short s, byte b3) {
                int i = 68 - b2;
                int i2 = s * 4;
                int i3 = 3 - (b3 * 2);
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[1 - i2];
                int i4 = 0 - i2;
                int i5 = -1;
                if (bArr == null) {
                    i += -i3;
                    i3 = i3;
                    i5 = -1;
                }
                while (true) {
                    int i6 = i5 + 1;
                    bArr2[i6] = (byte) i;
                    if (i6 == i4) {
                        return new String(bArr2, 0);
                    }
                    int i7 = i3 + 1;
                    i += -bArr[i7];
                    i3 = i7;
                    i5 = i6;
                }
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd4 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind4 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove4 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(ContextAware.class));
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function4;
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind4;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove4, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove4);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function5 = new Function2() { // from class: getInitialScanProgressPercentage
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return k0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd5 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind5 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove5 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(createCaptureSession.class));
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function5;
        zoomGestureDetectorZoomEventMove5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind5;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove5, new ZoomGestureDetectorgestureDetector1(z, z, 1, null));
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
}

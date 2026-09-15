package defpackage;

import android.R;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.data.registration.bpu.BPURegistrationDataStore;
import com.bpjstku.data.registration.bpu.BPURegistrationRepository;
import com.bpjstku.data.registration.bpu.remote.BPURegistrationApi;
import com.bpjstku.data.registration.bpu.remote.BPURegistrationApiClient;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
public final class MediaSessionCompatApi23Callback {
    private static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static {
        Function1 function1 = new Function1() { // from class: MediaSessionCompatApi22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MediaSessionCompatApi23Callback.b((isLenovoTablet) obj);
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = islenovotablet;
    }

    public static final isLenovoTablet TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static /* synthetic */ BPURegistrationApi TuitionPaymentFragmentbindingInflater1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new BPURegistrationApi((BPURegistrationApiClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(BPURegistrationApiClient.class), null, null));
    }

    public static /* synthetic */ getImeOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new getImeOptions((getDarkScrimactivity) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(getDarkScrimactivity.class), null, null), (registerlambda1) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(registerlambda1.class), null, null), (acquireBuffer) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), null, null));
    }

    public static /* synthetic */ BPURegistrationApiClient TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        notifyStateDetached notifystatedetached = notifyStateDetached.INSTANCE;
        return (BPURegistrationApiClient) notifyStateDetached.b(BPURegistrationApiClient.class, (OkHttpClient) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(OkHttpClient.class), null, null), (String) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(String.class), new setUsingExifOrientation("baseUrl"), null));
    }

    public static /* synthetic */ getDarkScrimactivity TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new trackPipAnimationHintViewpositionInWindow((BPURegistrationRepository) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(BPURegistrationRepository.class), null, null));
    }

    public static /* synthetic */ BPURegistrationRepository b(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return new BPURegistrationDataStore((BPURegistrationApi) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(BPURegistrationApi.class), null, null));
    }

    public static /* synthetic */ Unit b(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: createItem
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MediaSessionCompatApi23Callback.TuitionPaymentFragmentspecialinlinedviewModeldefault3((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(BPURegistrationApiClient.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: MediaSessionCompatApi24
            private static final byte[] $$c = {43, 23, 22, -14};
            private static final int $$f = 214;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {57, -56, 23, -36, -20, -6, 55, -60, -22, -2, -17, -9, 1, -18, 63, -62, -5, -27, 11, -9, -15, -13, 2, -13, -13, -1, 49, -27, -42, -25, 3, -21, 5, -19, -13, 27, -27, -3, -9, -18, 23, -36, 3, -32, 12, -21, 40, -47, -13, 2, -13, -13, -1, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, 10, -15, -13, 2, -13, -13, -1, 22, -45, 0, -14, 3, -27, 7, -21, 57};
            private static final int $$e = 101;
            private static final byte[] $$a = {5, 11, -122, -94, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 223;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -7794294214084743800L;

            /* JADX WARN: Code duplicated, block: B:10:0x002a  */
            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = defpackage.MediaSessionCompatApi24.$$a
                    int r8 = r8 * 3
                    int r8 = 84 - r8
                    int r6 = r6 * 52
                    int r6 = 107 - r6
                    int r7 = r7 * 15
                    int r1 = r7 + 38
                    byte[] r1 = new byte[r1]
                    int r7 = r7 + 37
                    r2 = 0
                    if (r0 != 0) goto L18
                    r3 = r7
                    r4 = r2
                    goto L2f
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r6 = r6 + 1
                    int r4 = r3 + 1
                    if (r3 != r7) goto L2a
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L2a:
                    r3 = r0[r6]
                    r5 = r3
                    r3 = r8
                    r8 = r5
                L2f:
                    int r8 = -r8
                    int r3 = r3 + r8
                    int r8 = r3 + (-11)
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaSessionCompatApi24.a(int, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 49
                    int r7 = r7 + 4
                    int r8 = r8 * 15
                    int r8 = r8 + 84
                    int r6 = r6 * 12
                    int r6 = r6 + 38
                    byte[] r0 = defpackage.MediaSessionCompatApi24.$$d
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r7
                    r4 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r6) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    r3 = r0[r7]
                L28:
                    int r7 = r7 + 1
                    int r3 = -r3
                    int r8 = r8 + r3
                    int r8 = r8 + (-8)
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.MediaSessionCompatApi24.c(short, byte, byte, java.lang.Object[]):void");
            }

            private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                abortCapture abortcapture = new abortCapture();
                char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
                abortcapture.b = 4;
                int i3 = $11 + 67;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                while (abortcapture.b < cArrB.length) {
                    abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                    int i5 = abortcapture.b;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 64837), View.MeasureSpec.makeMeasureSpec(0, 0) + 1356, 39 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {abortcapture, abortcapture};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 47772), (Process.myTid() >> 22) + 468, Gravity.getAbsoluteGravity(0, 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i6 = $10 + 7;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char modifierMetaStateMask = (char) (43041 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int i2 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3110;
                    int trimmedLength = 22 - TextUtils.getTrimmedLength("");
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[40], bArr[5], bArr[7], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, i2, trimmedLength, -1272852037, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                b(new char[]{49787, 49690, '0', 3509, 18352, 47199, 56748, 8319, 11773, 38987, 64868, 33293, 28647, 49309, 19823, 30862, 40234, 57557, 28029, 22896, 48374, 33085, 36061, 14626, 23680, 41309}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b(new char[]{15002, 15103, 50391, 60295, 33621, 'a', 9553, 58518, 52170, 8203, 1423, 25658, 55259, 1130, 43802, 49301, 26075, 9262, 35675}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char packedPositionType = (char) (43042 - ExpandableListView.getPackedPositionType(0L));
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 3111;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 23;
                    byte[] bArr2 = $$a;
                    byte b = bArr2[5];
                    Object[] objArr5 = new Object[1];
                    a(b, b, bArr2[7], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, iKeyCodeFromString, iIndexOf, -1269618118, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                    int i4 = i3 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 43043);
                        int iLastIndexOf = 3110 - TextUtils.lastIndexOf("", '0', 0);
                        int i5 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte b2 = $$a[7];
                        byte b3 = b2;
                        Object[] objArr6 = new Object[1];
                        a(b2, b3, b3, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, iLastIndexOf, i5, 154975793, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i6 = ((int[]) objArr7[2])[0];
                    int i7 = ((int[]) objArr7[1])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i8 = ((((~((-184797899) | elapsedCpuTime)) | R.style.Widget.Material.StackView) * (-283)) - 2081129256) + ((~(elapsedCpuTime | (-167823433))) * 283) + 893805908;
                    int i9 = (i8 << 13) ^ i8;
                    int i10 = i9 ^ (i9 >>> 17);
                    ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                    objArr = new Object[]{new int[1], new int[]{i7}, new int[]{i6}, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    b(new char[]{30848, 30954, 45690, 4498, 62965, 16253, 26390, 37439, 12749, 7994, 18327, 40504, 59606, 29317, 20775, 65429, 10203, 21143, 29017, 56905}, ExpandableListView.getPackedPositionType(0L), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    b(new char[]{18963, 19066, 7630, 7106, 23108, 51161, 21983, 15755, 15259, 59270, 29995, 38011, 4221, 56699, 23364, 1839, 5496, 64829, 31515, 9962}, TextUtils.lastIndexOf("", '0') + 1, objArr9);
                    try {
                        Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 893805908};
                        byte[] bArr3 = $$d;
                        byte b4 = bArr3[12];
                        Object[] objArr11 = new Object[1];
                        c(b4, bArr3[63], b4, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b5 = bArr3[63];
                        Object[] objArr12 = new Object[1];
                        c(b5, bArr3[12], b5, objArr12);
                        Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char c = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43042);
                            int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 3112;
                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 22;
                            byte b6 = $$a[7];
                            byte b7 = b6;
                            Object[] objArr14 = new Object[1];
                            a(b6, b7, b7, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, modifierMetaStateMask2, packedPositionType2, 154975793, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                        try {
                            Object[] objArr15 = new Object[1];
                            b(new char[]{49787, 49690, '0', 3509, 18352, 47199, 56748, 8319, 11773, 38987, 64868, 33293, 28647, 49309, 19823, 30862, 40234, 57557, 28029, 22896, 48374, 33085, 36061, 14626, 23680, 41309}, (-1) - TextUtils.lastIndexOf("", '0', 0), objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            b(new char[]{15002, 15103, 50391, 60295, 33621, 'a', 9553, 58518, 52170, 8203, 1423, 25658, 55259, 1130, 43802, 49301, 26075, 9262, 35675}, 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr16);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 43043);
                                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 3111;
                                int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
                                byte[] bArr4 = $$a;
                                byte b8 = bArr4[5];
                                Object[] objArr17 = new Object[1];
                                a(b8, b8, bArr4[7], objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, iIndexOf2, i11, -1269618118, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char modifierMetaStateMask3 = (char) (43041 - ((byte) KeyEvent.getModifierMetaStateMask()));
                                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3111;
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 23;
                                byte[] bArr5 = $$a;
                                Object[] objArr18 = new Object[1];
                                a(bArr5[40], bArr5[5], bArr5[7], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask3, doubleTapTimeout, iLastIndexOf2, -1272852037, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr = objArr13;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i12 = ((int[]) objArr[1])[0];
                int i13 = ((int[]) objArr[2])[0];
                if (i13 == i12) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = ((int[]) objArr[0])[0];
                    int i17 = ((int[]) objArr[2])[0];
                    int i18 = ((int[]) objArr[1])[0];
                    String[] strArr2 = (String[]) objArr[3];
                    int[] iArr = {i17};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i19 = ~iIdentityHashCode;
                    int i20 = i16 + 1556967732 + (((~((-137079277) | i19)) | 1567952182) * 519) + (((~(i19 | (-696521))) | (~(1568648702 | iIdentityHashCode))) * (-519)) + (((~(iIdentityHashCode | 1567952182)) | 137079276) * 519);
                    int i21 = (i20 << 13) ^ i20;
                    int i22 = i21 ^ (i21 >>> 17);
                    ((int[]) objArr[0])[0] = i22 ^ (i22 << 5);
                    Object[] objArr19 = {new int[1], new int[]{i18}, iArr, strArr2};
                    int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
                    if (i23 % 2 == 0) {
                        int i24 = 2 % 4;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[3];
                    if (strArr3 != null) {
                        int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i25 % 128;
                        int i26 = i25 % 2;
                        for (String str : strArr3) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
                    int i27 = ((int[]) objArr[0])[0];
                    int i28 = ((int[]) objArr[2])[0];
                    int i29 = ((int[]) objArr[1])[0];
                    String[] strArr4 = (String[]) objArr[3];
                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                    int i30 = i27 + 1879698000 + (((~((-385042622) | elapsedCpuTime2)) | 111233061) * 345) + (((~((-385042622) | (~elapsedCpuTime2))) | 1208755776) * 345) + ((~(elapsedCpuTime2 | (-111233062))) * 345);
                    int i31 = (i30 << 13) ^ i30;
                    int i32 = i31 ^ (i31 >>> 17);
                    ((int[]) objArr[0])[0] = i32 ^ (i32 << 5);
                    Object[] objArr20 = {new int[1], new int[]{i29}, new int[]{i28}, strArr4};
                }
                BPURegistrationApi bPURegistrationApiTuitionPaymentFragmentbindingInflater1 = MediaSessionCompatApi23Callback.TuitionPaymentFragmentbindingInflater1((FileTransformFactory) obj, (CoordinateTransform) obj2);
                int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i33 % 128;
                if (i33 % 2 == 0) {
                    int i34 = 37 / 0;
                }
                return bPURegistrationApiTuitionPaymentFragmentbindingInflater1;
            }

            private static String $$g(int i, short s, int i2) {
                int i3 = 4 - (s * 3);
                int i4 = i * 4;
                int i5 = 107 - (i2 * 2);
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[1 - i4];
                int i6 = 0 - i4;
                int i7 = -1;
                if (bArr == null) {
                    i5 += -i6;
                    i3++;
                }
                while (true) {
                    i7++;
                    bArr2[i7] = (byte) i5;
                    if (i7 == i6) {
                        return new String(bArr2, 0);
                    }
                    i5 += -bArr[i3];
                    i3++;
                }
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(BPURegistrationApi.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function4 = new Function2() { // from class: MediaSessionCompatApi24Callback
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MediaSessionCompatApi23Callback.b((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd3 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind3 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove3 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(BPURegistrationRepository.class));
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function4;
        zoomGestureDetectorZoomEventMove3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind3;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove3, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove3);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function5 = new Function2() { // from class: MediaSessionCompatApi24CallbackProxy
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MediaSessionCompatApi23Callback.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd4 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind4 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove4 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(getDarkScrimactivity.class));
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function5;
        zoomGestureDetectorZoomEventMove4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind4;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove4, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove4);
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function6 = new Function2() { // from class: ParcelableVolumeInfo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MediaSessionCompatApi23Callback.TuitionPaymentFragmentspecialinlinedviewModeldefault1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd5 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind5 = Kind.Factory;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove5 = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(getImeOptions.class));
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
}

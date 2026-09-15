package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.api.InternalLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageCaptureExtKttakePicture41<T> implements ImageCaptureMetadata<T> {
    private static short[] g;
    private final ImageCaptureMetadata<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {99, -43, -44, -62};
    private static final int $$d = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {68, 83, 49, -116};
    private static final int $$b = 59;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f152a = 1;
    private static int b = -2107002347;
    private static int TuitionPaymentFragmentbindingInflater1 = -1934795614;
    private static int asInterface = -141505768;
    private static byte[] asBinder = {25, 23, -9, 24, 17, -26, 25, -54, 55, -21, 24, -26, 20, -11, 27, -57, 55, -20, -21, 24, -26, 20, -11, 27, -57, 52, -27, -49, 57, 31, -29, 19, -19, -18, 12, 20, -11, 27, -57, -16, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, -21, -28, -28, 9, 24, -13, 13, -32, -17, 21, -26, 27, -12, -46, 46, 31, -29, -32, -28, 9, 24, -93, 46, 20, -11, 27, -25, -45, 37, -31, 17, 26, -21, 28, -38, 90, 28, -32, -94, -25, -25, 25, 31, -20, -25, 21, -17, -32, 28, -28, -28, 9, 24, -24, -47, 37, -31, 17, 26, -21, 28, -38, 90, 28, -32, -94, 42, 18, 27, -28, -89, 25, -10, 30, 31, -29, -32, -28, 9, 24, -93, 46, 31, -29, -32, -28, 9, 24, -93, 46, 20, -11, 27, -25, -45, 37, -31, 17, 26, -21, 28, -38, 90, 28, -32, -94, -26, -26, -26, -26, -26, -26, -26, -26};

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 98
            byte[] r0 = defpackage.ImageCaptureExtKttakePicture41.$$a
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2c:
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ImageCaptureExtKttakePicture41.e(short, int, byte, java.lang.Object[]):void");
    }

    public ImageCaptureExtKttakePicture41(ImageCaptureMetadata<T> imageCaptureMetadata, ExecutorService executorService, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(imageCaptureMetadata, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = imageCaptureMetadata;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = executorService;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = internalLogger;
    }

    @Override // defpackage.ImageCaptureMetadata
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final T t) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(t, "");
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "Data writing", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, new Runnable() { // from class: getCaptureLatencyMillis
            @Override // java.lang.Runnable
            public final void run() {
                ImageCaptureExtKttakePicture41.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, t);
            }
        });
        int i2 = d + 59;
        f152a = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            int i7 = -1;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2267;
                int iRgb = (-16777183) - Color.rgb(0, 0, 0);
                byte length = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, iCombineMeasuredStates, iRgb, 1387473586, false, $$e((byte) (-1), length, (byte) (length - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            char c = '0';
            if (!(!z)) {
                byte[] bArr = asBinder;
                if (bArr != null) {
                    int length2 = bArr.length;
                    byte[] bArr2 = new byte[length2];
                    int i8 = 0;
                    while (i8 < length2) {
                        int i9 = $11 + 119;
                        $10 = i9 % 128;
                        int i10 = i9 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                            int edgeSlop = 3358 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int iLastIndexOf = 17 - TextUtils.lastIndexOf("", c);
                            byte b3 = (byte) i7;
                            byte b4 = (byte) (b3 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(modifierMetaStateMask, edgeSlop, iLastIndexOf, -1054011043, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i8++;
                        int i11 = $10 + 37;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        i5 = 2;
                        i7 = -1;
                        c = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = asBinder;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cRed = (char) Color.red(0);
                        int iMyPid = (Process.myPid() >> 22) + 2267;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 33;
                        byte length3 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRed, iMyPid, deadChar, 1387473586, false, $$e((byte) (-1), length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) g[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i13 = $10 + 103;
                int i14 = i13 % 128;
                $11 = i14;
                int i15 = i13 % 2;
                int i16 = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L));
                if (z) {
                    int i17 = i14 + 69;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(asInterface), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 55904), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2854, 12 - TextUtils.indexOf((CharSequence) "", '0', 0), -1529949196, false, $$e(b5, b6, (byte) (b6 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = asBinder;
                if (bArr4 != null) {
                    int length4 = bArr4.length;
                    byte[] bArr5 = new byte[length4];
                    int i19 = 0;
                    while (i19 < length4) {
                        int i20 = $10 + 115;
                        $11 = i20 % 128;
                        if (i20 % 2 == 0) {
                            bArr5[i19] = (byte) (((long) bArr4[i19]) % 3046761265686732006L);
                        } else {
                            bArr5[i19] = (byte) (((long) bArr4[i19]) ^ 3046761265686732006L);
                            i19++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 == null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z2) {
                        short[] sArr = g;
                        int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        byte[] bArr6 = asBinder;
                        int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i22]) ^ 3046761265686732006L)) + s)) ^ b2));
                        int i23 = $10 + 89;
                        $11 = i23 % 128;
                        int i24 = i23 % 2;
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

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageCaptureExtKttakePicture41 imageCaptureExtKttakePicture41, Object obj) {
        int i = 2 % 2;
        int i2 = d + 105;
        f152a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(imageCaptureExtKttakePicture41, "");
        Intrinsics.checkNotNullParameter(obj, "");
        if (i3 != 0) {
            imageCaptureExtKttakePicture41.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj);
        } else {
            imageCaptureExtKttakePicture41.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:104:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:105:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:108:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:110:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:99:0x09ec  */
    public static Object[] TuitionPaymentFragmentbindingInflater1(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        String line;
        int i6;
        Object[] objArr;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Object[] objArr2;
        int[] iArr;
        int[] iArr2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String[] strArr;
        int i17;
        int i18;
        int i19 = 2 % 2;
        try {
            String[] strArr2 = new String[2];
            int threadPriority = Process.getThreadPriority(0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i20 = -(-(threadPriority * (-103)));
            int i21 = (((-2060) | i20) << 1) - (i20 ^ (-2060));
            int i22 = ~threadPriority;
            int i23 = ~((i22 & (-21)) | ((-21) ^ i22));
            int i24 = ~threadPriority;
            int i25 = ~((i24 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i24 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
            i6 = i23 ^ i25;
            int i26 = i6 | (i23 & i25);
            int i27 = d + 27;
            f152a = i27 % 128;
            int i28 = i27 % 2;
            int i29 = -(-(i26 * 104));
            int i30 = ((i21 | i29) << 1) - (i21 ^ i29);
            int i31 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i32 = ((i30 + ((~(threadPriority | ((i31 ^ 20) | (i31 & 20)))) * (-104))) + ((20 | iTuitionPaymentFragmentspecialinlinedviewModeldefault1) * 104)) >> 6;
            int i33 = i32 * (-494);
            int i34 = (i33 & (-790986362)) + (i33 | (-790986362)) + ((~(((-2067634069) & i32) | (i32 ^ (-2067634069)))) * (-495));
            int i35 = ~i;
            int i36 = -(-((i32 | i35) * 495));
            int i37 = (i34 & i36) + (i36 | i34);
            int i38 = ~i32;
            int i39 = ~((i38 ^ 2067634068) | (i38 & 2067634068));
            int i40 = ~(i32 | i35);
            int i41 = (i37 - (~(((i40 & i39) | (i39 ^ i40)) * 495))) - 1;
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i42 = iCombineMeasuredStates * (-183);
            int i43 = (i42 & 8967) + (i42 | 8967);
            int i44 = ~iCombineMeasuredStates;
            int i45 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i46 = (i44 ^ i45) | (i44 & i45);
            int i47 = -(-(((~((i46 ^ (-49)) | (i46 & (-49)))) | (~((48 ^ i45) | (48 & i45) | iCombineMeasuredStates))) * (-184)));
            int i48 = (i43 ^ i47) + ((i47 & i43) << 1);
            int i49 = (~((i44 ^ 48) | (i44 & 48))) | (~((i44 ^ i45) | (i44 & i45)));
            int i50 = d;
            int i51 = ((i50 | 89) << 1) - (i50 ^ 89);
            f152a = i51 % 128;
            int i52 = i51 % 2;
            int i53 = ~((48 ^ i45) | (48 & i45));
            int i54 = -(-(184 * ((i49 & i53) | (i49 ^ i53))));
            int i55 = ((((i48 | i54) << 1) - (i54 ^ i48)) - (~(((iCombineMeasuredStates ^ (-49)) | (iCombineMeasuredStates & (-49))) * 184))) - 1;
            short sMyPid = (short) (Process.myPid() >> 22);
            byte bLastIndexOf = (byte) (TextUtils.lastIndexOf("", '0') + 1);
            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0);
            int i56 = ~iCombineMeasuredStates2;
            int i57 = ~((247787250 & i56) | (i56 ^ 247787250));
            int i58 = ~iCombineMeasuredStates2;
            int i59 = i56 | (-247787251);
            int i60 = (iCombineMeasuredStates2 * (-751)) + 1404631773 + (((~((i58 ^ i) | (i58 & i))) | i57) * 1504) + ((~((i59 & i) | (i59 ^ i))) * (-1504));
            int i61 = ((~(((-247787251) & i58) | (i58 ^ (-247787251)))) | (~((iCombineMeasuredStates2 & 247787250) | (247787250 ^ iCombineMeasuredStates2)))) * 752;
            int i62 = (i60 & i61) + (i61 | i60);
            Object[] objArr3 = new Object[1];
            c(i41, i55, sMyPid, bLastIndexOf, i62, objArr3);
            strArr2[0] = (String) objArr3[0];
            int i63 = -(-((Process.getThreadPriority(0) + 20) >> 6));
            int i64 = (i63 & (-2067634055)) + (i63 | (-2067634055));
            int modifierMetaStateMask = (-51) - ((byte) KeyEvent.getModifierMetaStateMask());
            short sCombineMeasuredStates = (short) View.combineMeasuredStates(0, 0);
            byte tapTimeout = (byte) (ViewConfiguration.getTapTimeout() >> 16);
            int i65 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i66 = ~i;
            int i67 = ((((i65 * (-115)) - 1569239277) + ((~(((i66 ^ i65) | (i66 & i65)) | (-247787233))) * (-116))) - (~(((i65 ^ i) | (i65 & i)) * 116))) - 1;
            int i68 = ~i65;
            int i69 = ~((i68 & 247787232) | (i68 ^ 247787232));
            int i70 = ~((247787232 & i) | (247787232 ^ i));
            int i71 = i67 + (((i69 & i70) | (i69 ^ i70)) * 116);
            Object[] objArr4 = new Object[1];
            c(i64, modifierMetaStateMask, sCombineMeasuredStates, tapTimeout, i71, objArr4);
            strArr2[1] = (String) objArr4[0];
            int i72 = 0;
            while (true) {
                if (i72 >= 2) {
                    int i73 = d + 7;
                    f152a = i73 % 128;
                    int i74 = i73 % 2;
                    i5 = i;
                    break;
                }
                String str = strArr2[i72];
                int i75 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                int i76 = i75 * 960;
                int i77 = (i76 ^ (-600288599)) + ((i76 & (-600288599)) << 1);
                int i78 = ((~((2067634076 & i66) | (2067634076 ^ i66))) | (~((i75 ^ i) | (i75 & i)))) * 959;
                int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                int i80 = (i79 & 1413811868) + (1413811868 | i79);
                int i81 = ~(2067634076 | i);
                int i82 = ~((i75 & i66) | (i66 ^ i75));
                int i83 = ((i82 & i81) | (i81 ^ i82)) * 959;
                int i84 = (i80 & i83) + (i83 | i80);
                int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i85 = (minimumFlingVelocity * (-464)) + 48308;
                int i86 = ~minimumFlingVelocity;
                int i87 = ~(iTuitionPaymentFragmentspecialinlinedviewModeldefault3 | (-52));
                int i88 = ((i87 & i86) | (i86 ^ i87)) * (-465);
                int i89 = (i85 & i88) + (i85 | i88);
                int i90 = ~((i86 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i86 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                int i91 = ((i90 & (-52)) | (i90 ^ (-52))) * 930;
                int i92 = (((i89 | i91) << 1) - (i91 ^ i89)) + ((i86 | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & (-52)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-52))) * 465);
                int i93 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i94 = i93 * 595;
                int i95 = (i94 ^ 1187) + ((i94 & 1187) << 1);
                int i96 = ~i93;
                int i97 = ~(i96 | (~i96));
                int i98 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i99 = i95 + (i97 * (-1188));
                int i100 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i101 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                int i102 = ~(i101 | i93);
                int i103 = ((i100 ^ i102) | (i102 & i100)) * 594;
                int i104 = (i99 ^ i103) + ((i103 & i99) << 1);
                int i105 = ~i98;
                int i106 = ~i93;
                int i107 = -(-(((i105 & i106) | (i105 ^ i106) | (~((i93 & i101) | (i101 ^ i93)))) * 594));
                short s = (short) ((i104 & i107) + (i107 | i104));
                byte mode = (byte) View.MeasureSpec.getMode(0);
                int i108 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i109 = i108 * (-103);
                int i110 = (i109 & (-247720425)) + (i109 | (-247720425));
                int i111 = ~i108;
                int i112 = ~((i111 ^ 247787216) | (i111 & 247787216));
                int i113 = ~(247787216 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                int i114 = ((i112 ^ i113) | (i112 & i113)) * 104;
                int i115 = ((i110 | i114) << 1) - (i110 ^ i114);
                int i116 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                int i117 = (~((i116 ^ i108) | (i116 & i108) | (-247787217))) * (-104);
                int i118 = (i115 ^ i117) + ((i117 & i115) << 1);
                int i119 = ((i108 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i108 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5)) * 104;
                int i120 = (i118 & i119) + (i118 | i119);
                Object[] objArr5 = new Object[1];
                c(i84, i92, s, mode, i120, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                if (((Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null)).booleanValue()) {
                    int i121 = f152a;
                    int i122 = ((i121 | 27) << 1) - (i121 ^ 27);
                    d = i122 % 128;
                    int i123 = i122 % 2;
                    i3 = i & (-2);
                    i4 = i35 & 1;
                    i5 = i3 | i4;
                    break;
                }
                int i124 = i72 + 37;
                i72 = ((i124 & (-36)) << 1) + (i124 ^ (-36));
            }
        } catch (Exception unused) {
            i3 = i & (-3);
            i4 = (~i) & 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2419);
                int absoluteGravity = 2845 - Gravity.getAbsoluteGravity(0, 0);
                int i125 = 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                e(b2, b3, b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatDelay, absoluteGravity, i125, -501222268, false, (String) objArr6[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j = 617975555;
            long j2 = -1;
            long j3 = j ^ j2;
            long jMyUid = Process.myUid();
            long j4 = jMyUid ^ j2;
            long j5 = (((long) 302) * j) + (((long) TypedValues.MotionType.TYPE_EASING) * jLongValue) + (((long) (-602)) * (jLongValue | ((j3 | j4) ^ j2))) + (((long) (-301)) * (((j3 | (jLongValue ^ j2)) ^ j2) | ((j3 | jMyUid) ^ j2) | (((j4 | j) | jLongValue) ^ j2))) + (((long) 301) * ((j4 | jLongValue) ^ j2)) + ((long) (-1777162241));
            int i126 = 363263298 + (((~((-867555125) | i)) | (-569671287)) * (-948));
            int i127 = ~i;
            int i128 = ((int) (j5 >> 32)) & (i126 + ((~((-565466677) | i127)) * (-948)) + 1382959180);
            int iMyPid = Process.myPid();
            int i129 = ((int) j5) & ((-635053948) + (((-1166379010) | iMyPid) * (-627)) + (((~(1301278211 | iMyPid)) | (-135948199)) * (-627)) + (((~(iMyPid | (-135948199))) | (~((~iMyPid) | (-1301278212)))) * 627));
            int i130 = (i128 & i129) | (i128 ^ i129);
            int i131 = (i & (-11)) | (i127 & 10);
            int i132 = (i130 & (-2)) | ((~i130) & 1);
            int i133 = d;
            int i134 = (i133 ^ 9) + ((i133 & 9) << 1);
            f152a = i134 % 128;
            int i135 = i134 % 2 == 0 ? (i132 | (-i132)) >> 72 : (i132 | (-i132)) >> 31;
            int i136 = i131 & (~i135);
            int i137 = i135 & i;
            int i138 = (i137 & i136) | (i136 ^ i137);
            int i139 = (i133 ^ 31) + ((i133 & 31) << 1);
            f152a = i139 % 128;
            if (i139 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i140 = (~(i & i5)) & (i | i5);
            int i141 = -i140;
            int i142 = ((i140 & i141) | (i140 ^ i141)) >> 31;
            int i143 = i138 & (~i142);
            int i144 = i5 & i142;
            int i145 = (i143 ^ i144) | (i144 & i143);
            try {
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) - 2067634126;
                int i146 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i147 = ((i146 | (-29)) << 1) - (i146 ^ (-29));
                short sIndexOf = (short) TextUtils.indexOf("", "");
                byte pressedStateDuration = (byte) (ViewConfiguration.getPressedStateDuration() >> 16);
                int i148 = -Color.alpha(0);
                int i149 = ((i148 | (-247787201)) << 1) - (i148 ^ (-247787201));
                Object[] objArr7 = new Object[1];
                c(bitsPerPixel, i147, sIndexOf, pressedStateDuration, i149, objArr7);
                File file = new File((String) objArr7[0]);
                if (file.canRead()) {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    try {
                        line = bufferedReader.readLine();
                        int i150 = -KeyEvent.keyCodeFromString("");
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i151 = i150 * 522;
                        int i152 = ((i151 | 1427889280) << 1) - (i151 ^ 1427889280);
                        int i153 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i154 = ~((i153 & (-2067634064)) | (i153 ^ (-2067634064)));
                        int i155 = -(-(((i154 & i150) | (i150 ^ i154)) * (-1042)));
                        int i156 = (i152 ^ i155) + ((i155 & i152) << 1) + (((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ (-2067634064)) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & (-2067634064))) * 521);
                        int i157 = ~i150;
                        int i158 = ~((i157 & 2067634063) | (i157 ^ 2067634063));
                        int i159 = ~i150;
                        int i160 = i158 | (~((i159 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i159 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6)));
                        int i161 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i162 = (i150 & i161) | (i161 ^ i150);
                        int i163 = i156 + (((~((i162 & (-2067634064)) | (i162 ^ (-2067634064)))) | i160) * 521);
                        int i164 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i165 = (i164 * 477) + 30400;
                        int i166 = (63 & i164) | (63 ^ i164);
                        int i167 = ((~((~i164) | (-64))) | (~((i166 & i) | (i166 ^ i)))) * (-476);
                        int i168 = (i165 & i167) + (i165 | i167);
                        int i169 = 63 | i164;
                        int i170 = (i168 - (~(-(-((~((i169 & i) | (i169 ^ i))) * 952))))) - 1;
                        int i171 = (63 & i127) | (63 ^ i127);
                        int i172 = -(-((~((i164 & i171) | (i171 ^ i164))) * 476));
                        int i173 = (i170 ^ i172) + ((i172 & i170) << 1);
                        int i174 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        Object[] objArr8 = new Object[1];
                        c(i163, i173, (short) ((i174 ^ (-1)) + (i174 << 1)), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (-247787163) - (~TextUtils.getOffsetAfter("", 0)), objArr8);
                        if (!(!line.equals((String) objArr8[0]))) {
                            fileReader.close();
                            bufferedReader.close();
                            int i175 = d + 79;
                            f152a = i175 % 128;
                            int i176 = i175 % 2;
                            line = null;
                        } else {
                            int i177 = f152a;
                            int i178 = ((i177 | 121) << 1) - (i177 ^ 121);
                            d = i178 % 128;
                            if (i178 % 2 != 0) {
                                fileReader.close();
                                bufferedReader.close();
                                int i179 = 67 / 0;
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
                    line = null;
                }
            } catch (Exception unused2) {
            }
            try {
                int i180 = -(-KeyEvent.getDeadChar(0, 0));
                int i181 = (i180 ^ (-2067634127)) + ((i180 & (-2067634127)) << 1);
                int i182 = -TextUtils.lastIndexOf("", '0');
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i183 = i182 * 375;
                int i184 = (i183 & 28386) + (i183 | 28386);
                int i185 = ~i182;
                int i186 = ~((i185 ^ (-38)) | (i185 & (-38)));
                int i187 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                int i188 = ~((i187 & i182) | (i187 ^ i182));
                int i189 = ((i186 & i188) | (i186 ^ i188)) * (-374);
                int i190 = (i184 ^ i189) + ((i184 & i189) << 1);
                int i191 = (~((i182 & 37) | (37 ^ i182))) * 748;
                int i192 = (((i190 ^ i191) + ((i191 & i190) << 1)) - (~(((~((i185 ^ 37) | (i185 & 37))) | i188) * 374))) - 1;
                short tapTimeout2 = (short) (ViewConfiguration.getTapTimeout() >> 16);
                byte b4 = (byte) ((-2) - ((-1) ^ (-ExpandableListView.getPackedPositionChild(0L))));
                int i193 = -ExpandableListView.getPackedPositionType(0L);
                int i194 = (i193 ^ (-247787160)) + ((i193 & (-247787160)) << 1);
                Object[] objArr9 = new Object[1];
                c(i181, i192, tapTimeout2, b4, i194, objArr9);
                File file2 = new File((String) objArr9[0]);
                int i195 = d;
                int i196 = (i195 & 73) + (i195 | 73);
                f152a = i196 % 128;
                int i197 = i196 % 2;
                if (file2.canRead()) {
                    FileReader fileReader2 = new FileReader(file2);
                    BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                    try {
                        try {
                            String line2 = bufferedReader2.readLine();
                            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i198 = maximumDrawingCacheSize * 1773;
                            int i199 = (i198 & 200132529) + (i198 | 200132529);
                            int i200 = ~maximumDrawingCacheSize;
                            int i201 = ~((i200 & 2067634124) | (i200 ^ 2067634124));
                            int i202 = ~((2067634124 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (2067634124 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                            int i203 = (i201 & i202) | (i201 ^ i202);
                            int i204 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i205 = i204 | maximumDrawingCacheSize;
                            int i206 = ~((i205 & (-2067634125)) | (i205 ^ (-2067634125)));
                            int i207 = i199 + (((i203 & i206) | (i203 ^ i206)) * 886);
                            int i208 = ~(i204 | (-2067634125));
                            int i209 = -(-(((i208 & maximumDrawingCacheSize) | (maximumDrawingCacheSize ^ i208)) * (-1772)));
                            Object[] objArr10 = new Object[1];
                            c((i207 ^ i209) + ((i209 & i207) << 1) + ((~((maximumDrawingCacheSize & i204) | (i204 ^ maximumDrawingCacheSize))) * 886), (-69) - (~(-TextUtils.indexOf((CharSequence) "", '0'))), (short) ExpandableListView.getPackedPositionGroup(0L), (byte) View.combineMeasuredStates(0, 0), (-247787131) - (~(-TextUtils.getOffsetAfter("", 0))), objArr10);
                            boolean zEquals = line2.equals((String) objArr10[0]);
                            fileReader2.close();
                            bufferedReader2.close();
                            int i210 = d + 35;
                            f152a = i210 % 128;
                            int i211 = i210 % 2;
                            if (zEquals) {
                                try {
                                    int iResolveSize = View.resolveSize(0, 0) - 2067634127;
                                    int i212 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int i213 = i212 * 659;
                                    int i214 = (i213 & 21024) + (i213 | 21024);
                                    int i215 = ~((~i212) | (-32));
                                    int i216 = (31 ^ i212) | (31 & i212);
                                    int i217 = ~i216;
                                    int i218 = (i215 & i217) | (i215 ^ i217);
                                    int i219 = (i212 ^ i) | (i212 & i);
                                    int i220 = ~i219;
                                    int i221 = ((i214 - (~(((i218 & i220) | (i218 ^ i220)) * (-658)))) - 1) + ((~i216) * 658) + (((~((i212 & 31) | (31 ^ i212))) | (~i219)) * 658);
                                    short packedPositionType = (short) ExpandableListView.getPackedPositionType(0L);
                                    byte offsetAfter = (byte) TextUtils.getOffsetAfter("", 0);
                                    int i222 = -Gravity.getAbsoluteGravity(0, 0);
                                    int i223 = (i222 * 399) - 82817062;
                                    int i224 = ~i222;
                                    int i225 = ~((i224 & (-247787130)) | (i224 ^ (-247787130)));
                                    int i226 = ~((247787129 ^ i222) | (247787129 & i222));
                                    int i227 = (i225 ^ i226) | (i225 & i226);
                                    int i228 = ~((247787129 ^ i) | (247787129 & i));
                                    int i229 = ((i227 ^ i228) | (i228 & i227)) * 398;
                                    int i230 = ((i223 | i229) << 1) - (i223 ^ i229);
                                    int i231 = -(-((i222 | (-247787130)) * (-1194)));
                                    int i232 = (i230 ^ i231) + ((i231 & i230) << 1);
                                    int i233 = ~i;
                                    int i234 = ~((i233 & 247787129) | (247787129 ^ i233));
                                    int i235 = ~i222;
                                    int i236 = ~((i235 ^ (-247787130)) | (i235 & (-247787130)));
                                    int i237 = (i234 & i236) | (i234 ^ i236);
                                    int i238 = ~(i222 | 247787129);
                                    int i239 = (i232 - (~(((i238 & i237) | (i237 ^ i238)) * 398))) - 1;
                                    Object[] objArr11 = new Object[1];
                                    c(iResolveSize, i221, packedPositionType, offsetAfter, i239, objArr11);
                                    File file3 = new File((String) objArr11[0]);
                                    int i240 = f152a;
                                    int i241 = ((i240 | 95) << 1) - (i240 ^ 95);
                                    d = i241 % 128;
                                    int i242 = i241 % 2;
                                    if (file3.canRead()) {
                                        FileReader fileReader3 = new FileReader(file3);
                                        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                        try {
                                            String line3 = bufferedReader3.readLine();
                                            int iAxisFromString = MotionEvent.axisFromString("");
                                            int i243 = f152a;
                                            int i244 = (i243 ^ 105) + ((i243 & 105) << 1);
                                            d = i244 % 128;
                                            int i245 = i244 % 2;
                                            int i246 = (iAxisFromString * (-55)) + 2050727124;
                                            int i247 = ((~((iAxisFromString ^ i) | (iAxisFromString & i))) | (-2067634124)) * 56;
                                            int i248 = ((i246 | i247) << 1) - (i246 ^ i247);
                                            int i249 = (i243 & 101) + (i243 | 101);
                                            d = i249 % 128;
                                            int i250 = i249 % 2;
                                            int i251 = -(-((-56) * (~((iAxisFromString ^ (-2067634124)) | (iAxisFromString & (-2067634124))))));
                                            int i252 = ((i248 | i251) << 1) - (i251 ^ i248);
                                            int i253 = ~((i127 ^ (-2067634124)) | (i127 & (-2067634124)));
                                            int i254 = -(-(((iAxisFromString & i253) | (iAxisFromString ^ i253)) * 56));
                                            int i255 = (i252 & i254) + (i254 | i252);
                                            int i256 = (-68) - (~(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                            short sMakeMeasureSpec = (short) View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int threadPriority2 = Process.getThreadPriority(0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = isVivoY17.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i257 = -(-(threadPriority2 * 561));
                                            int i258 = ((-11180) ^ i257) + ((i257 & (-11180)) << 1);
                                            int i259 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                            int i260 = (i258 - (~(-(-((~((i259 ^ 20) | (i259 & 20))) * (-560)))))) - 1;
                                            int i261 = ~threadPriority2;
                                            int i262 = -(-((~(iTuitionPaymentFragmentspecialinlinedviewModeldefault9 | (i261 & 20) | (i261 ^ 20))) * (-560)));
                                            int i263 = (i260 ^ i262) + ((i262 & i260) << 1);
                                            int i264 = ~(((-21) & threadPriority2) | ((-21) ^ threadPriority2));
                                            int i265 = ~((threadPriority2 & i259) | (i259 ^ threadPriority2));
                                            int i266 = ((i264 & i265) | (i264 ^ i265)) * 560;
                                            byte b5 = (byte) (((i263 ^ i266) + ((i266 & i263) << 1)) >> 6);
                                            int i267 = d;
                                            int i268 = (i267 & 105) + (i267 | 105);
                                            f152a = i268 % 128;
                                            int i269 = i268 % 2;
                                            int i270 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            int i271 = i270 * 758;
                                            int i272 = (i271 & (-1651489988)) + (i271 | (-1651489988));
                                            int i273 = (i270 | i127) * (-757);
                                            int i274 = f152a;
                                            int i275 = (i274 ^ 75) + ((i274 & 75) << 1);
                                            int i276 = i275 % 128;
                                            d = i276;
                                            if (i275 % 2 != 0) {
                                                int i277 = i272 << i273;
                                                int i278 = 247787130 | i270;
                                                int i279 = -(-(~((i278 & i) | (i278 ^ i))));
                                                i17 = i277 / ((i279 ^ 1514) + ((i279 & 1514) << 1));
                                                i18 = (~i270) | 247787130;
                                            } else {
                                                int i280 = -(-i273);
                                                int i281 = (i272 & i280) + (i280 | i272);
                                                int i282 = (247787130 ^ i270) | (247787130 & i270);
                                                int i283 = (~((i282 & i) | (i282 ^ i))) * 1514;
                                                i17 = ((i283 & i281) << 1) + (i281 ^ i283);
                                                int i284 = ~i270;
                                                i18 = (i284 & 247787130) | (i284 ^ 247787130);
                                            }
                                            int i285 = ~i18;
                                            int i286 = (i276 & 11) + (i276 | 11);
                                            i6 = i127;
                                            f152a = i286 % 128;
                                            int i287 = i286 % 2;
                                            int i288 = ~((247787130 ^ i127) | (247787130 & i127));
                                            int i289 = (i288 & i285) | (i285 ^ i288);
                                            int i290 = (i270 & (-247787131)) | (i270 ^ (-247787131));
                                            int i291 = ~((i290 & i) | (i290 ^ i));
                                            int i292 = -(-(757 * ((i291 & i289) | (i289 ^ i291))));
                                            try {
                                                Object[] objArr12 = new Object[1];
                                                c(i255, i256, sMakeMeasureSpec, b5, (i17 & i292) + (i292 | i17), objArr12);
                                                boolean zEquals2 = line3.equals((String) objArr12[0]);
                                                fileReader3.close();
                                                bufferedReader3.close();
                                                if (zEquals2) {
                                                    int i293 = d;
                                                    int i294 = i293 + 23;
                                                    f152a = i294 % 128;
                                                    if (i294 % 2 == 0) {
                                                        Object obj2 = null;
                                                        obj2.hashCode();
                                                        throw null;
                                                    }
                                                    if (line != null) {
                                                        int i295 = (~(i & 20)) & (i | 20);
                                                        int i296 = (i293 & 77) + (i293 | 77);
                                                        f152a = i296 % 128;
                                                        int i297 = i296 % 2;
                                                        objArr = new Object[]{new int[]{i295}, new String[]{line}};
                                                    } else {
                                                        i15 = 2;
                                                    }
                                                } else {
                                                    i15 = 2;
                                                }
                                                objArr = new Object[i15];
                                                int[] iArr3 = new int[1];
                                                objArr[0] = iArr3;
                                                int i298 = f152a;
                                                i16 = ((i298 | 17) << 1) - (i298 ^ 17);
                                                int i299 = i16 % 128;
                                                d = i299;
                                                if (i16 % 2 != 0) {
                                                    strArr = new String[1];
                                                } else {
                                                    strArr = new String[0];
                                                }
                                                int i300 = ((i299 | 55) << 1) - (i299 ^ 55);
                                                f152a = i300 % 128;
                                                int i301 = i300 % 2;
                                                iArr3[0] = i;
                                                objArr[1] = strArr;
                                                int i302 = (i299 ^ 103) + ((i299 & 103) << 1);
                                                f152a = i302 % 128;
                                                int i303 = i302 % 2;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileReader3.close();
                                                bufferedReader3.close();
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                } catch (Exception unused3) {
                                }
                            }
                        } catch (Throwable th4) {
                            fileReader2.close();
                            bufferedReader2.close();
                            throw th4;
                        }
                    } catch (Exception unused4) {
                    }
                    i7 = ((int[]) objArr[0])[0];
                    int i304 = ((~i145) & i) | (i145 & i6);
                    int i305 = -i304;
                    int i306 = ((i304 & i305) | (i304 ^ i305)) >> 31;
                    int i307 = (i306 & i145) | ((~i306) & i7);
                    String[] strArr3 = (String[]) objArr[1];
                    Object[] objArr13 = new Object[2];
                    int i308 = d;
                    i8 = ((i308 | 105) << 1) - (i308 ^ 105);
                    f152a = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i309 = (i7 & i6) | ((~i7) & i);
                        int i310 = -i309;
                        int i311 = ((i309 & i310) | (i309 ^ i310)) * 23;
                        i9 = 1;
                        i10 = i311 & 1;
                        i11 = 0;
                    } else {
                        i9 = 1;
                        int i312 = (i7 & i6) | ((~i7) & i);
                        int i313 = -i312;
                        i10 = (((i312 & i313) | (i312 ^ i313)) >> 31) & 1;
                        int i314 = -i10;
                        i11 = (~(((i314 & i10) | (i10 ^ i314)) >> 31)) & 1;
                    }
                    objArr13[i10] = null;
                    objArr13[i11] = strArr3;
                    String[] strArr4 = (String[]) objArr13[0];
                    objArr2 = new Object[4];
                    iArr = new int[i9];
                    objArr2[0] = iArr;
                    iArr2 = new int[i9];
                    objArr2[i9] = iArr2;
                    int[] iArr4 = new int[i9];
                    objArr2[2] = iArr4;
                    int i315 = ((~i307) & i) | (i307 & i6);
                    int i316 = -i315;
                    int i317 = ((i315 & i316) | (i315 ^ i316)) >> 31;
                    int i318 = i308 + 57;
                    f152a = i318 % 128;
                    int i319 = i318 % 2;
                    i12 = i317 & 16;
                    iArr[0] = i;
                    iArr4[0] = i307;
                    objArr2[3] = strArr4;
                    i13 = (-1337951990) + (((-1083923) | i) * (-381)) + (((~(i6 | (-500206111))) | 1038554605) * 381) + 412974282;
                    i14 = i308 + 107;
                    f152a = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i320 = i2 / (i13 >> i12);
                        int i321 = i320 * 18;
                        int i322 = ((~i320) & i321) | ((~i321) & i320);
                        int i323 = i322 / 111;
                        int i324 = ((~i322) & i323) | ((~i323) & i322);
                        int i325 = i324 / 3;
                        iArr[0] = (i324 | i325) & (~(i324 & i325));
                        return objArr2;
                    }
                    int i326 = -(-(i13 + i12));
                    int i327 = ((i2 | i326) << 1) - (i2 ^ i326);
                    int i328 = i327 << 13;
                    int i329 = (i328 | i327) & (~(i327 & i328));
                    int i330 = i329 >>> 17;
                    int i331 = ((~i329) & i330) | ((~i330) & i329);
                    iArr2[0] = i331 ^ (i331 << 5);
                    return objArr2;
                }
            } catch (Exception unused5) {
            }
            i6 = i127;
            i15 = 2;
            objArr = new Object[i15];
            int[] iArr5 = new int[1];
            objArr[0] = iArr5;
            int i2910 = f152a;
            i16 = ((i2910 | 17) << 1) - (i2910 ^ 17);
            int i2911 = i16 % 128;
            d = i2911;
            if (i16 % 2 != 0) {
                strArr = new String[1];
            } else {
                strArr = new String[0];
            }
            int i3010 = ((i2911 | 55) << 1) - (i2911 ^ 55);
            f152a = i3010 % 128;
            int i3011 = i3010 % 2;
            iArr5[0] = i;
            objArr[1] = strArr;
            int i3012 = (i2911 ^ 103) + ((i2911 & 103) << 1);
            f152a = i3012 % 128;
            int i3013 = i3012 % 2;
            i7 = ((int[]) objArr[0])[0];
            int i3014 = ((~i145) & i) | (i145 & i6);
            int i3015 = -i3014;
            int i3016 = ((i3014 & i3015) | (i3014 ^ i3015)) >> 31;
            int i3017 = (i3016 & i145) | ((~i3016) & i7);
            String[] strArr5 = (String[]) objArr[1];
            Object[] objArr14 = new Object[2];
            int i3018 = d;
            i8 = ((i3018 | 105) << 1) - (i3018 ^ 105);
            f152a = i8 % 128;
            if (i8 % 2 == 0) {
                int i3019 = (i7 & i6) | ((~i7) & i);
                int i3110 = -i3019;
                int i3111 = ((i3019 & i3110) | (i3019 ^ i3110)) * 23;
                i9 = 1;
                i10 = i3111 & 1;
                i11 = 0;
            } else {
                i9 = 1;
                int i3112 = (i7 & i6) | ((~i7) & i);
                int i3113 = -i3112;
                i10 = (((i3112 & i3113) | (i3112 ^ i3113)) >> 31) & 1;
                int i3114 = -i10;
                i11 = (~(((i3114 & i10) | (i10 ^ i3114)) >> 31)) & 1;
            }
            objArr14[i10] = null;
            objArr14[i11] = strArr5;
            String[] strArr6 = (String[]) objArr14[0];
            objArr2 = new Object[4];
            iArr = new int[i9];
            objArr2[0] = iArr;
            iArr2 = new int[i9];
            objArr2[i9] = iArr2;
            int[] iArr6 = new int[i9];
            objArr2[2] = iArr6;
            int i3115 = ((~i3017) & i) | (i3017 & i6);
            int i3116 = -i3115;
            int i3117 = ((i3115 & i3116) | (i3115 ^ i3116)) >> 31;
            int i3118 = i3018 + 57;
            f152a = i3118 % 128;
            int i3119 = i3118 % 2;
            i12 = i3117 & 16;
            iArr[0] = i;
            iArr6[0] = i3017;
            objArr2[3] = strArr6;
            i13 = (-1337951990) + (((-1083923) | i) * (-381)) + (((~(i6 | (-500206111))) | 1038554605) * 381) + 412974282;
            i14 = i3018 + 107;
            f152a = i14 % 128;
            if (i14 % 2 == 0) {
                int i3210 = i2 / (i13 >> i12);
                int i3211 = i3210 * 18;
                int i3212 = ((~i3210) & i3211) | ((~i3211) & i3210);
                int i3213 = i3212 / 111;
                int i3214 = ((~i3212) & i3213) | ((~i3213) & i3212);
                int i3215 = i3214 / 3;
                iArr[0] = (i3214 | i3215) & (~(i3214 & i3215));
                return objArr2;
            }
            int i3216 = -(-(i13 + i12));
            int i3217 = ((i2 | i3216) << 1) - (i2 ^ i3216);
            int i3218 = i3217 << 13;
            int i3219 = (i3218 | i3217) & (~(i3217 & i3218));
            int i332 = i3219 >>> 17;
            int i333 = ((~i3219) & i332) | ((~i332) & i3219);
            iArr2[0] = i333 ^ (i333 << 5);
            return objArr2;
        } catch (Throwable th5) {
            Throwable cause = th5.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th5;
        }
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
    private static java.lang.String $$e(int r6, int r7, short r8) {
        /*
            byte[] r0 = defpackage.ImageCaptureExtKttakePicture41.$$c
            int r8 = r8 * 2
            int r1 = 1 - r8
            int r7 = 121 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ImageCaptureExtKttakePicture41.$$e(int, int, short):java.lang.String");
    }
}

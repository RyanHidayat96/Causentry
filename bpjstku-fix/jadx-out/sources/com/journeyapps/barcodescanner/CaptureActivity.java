package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
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
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.bpjstku.R;
import com.google.android.libraries.places.internal.zzbla;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.journeyapps.barcodescanner.DecoratedBarcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import defpackage.ArrayRingBuffer;
import defpackage.ByteOrderedDataInputStream;
import defpackage.EncoderProfilesProxyCompatBaseImpl;
import defpackage.ForwardingCameraControl;
import defpackage.ImageAnalysisConfig;
import defpackage.StabilizationModeMode;
import defpackage.UseCaseConfig;
import defpackage.UseCaseConfigFactoryCaptureType;
import defpackage.UseCaseConfigFactoryProvider;
import defpackage.calculatePlaceholderForExtensions;
import defpackage.createBitmapFromPlane;
import defpackage.cropJpegByteArray;
import defpackage.getConfigs;
import defpackage.getTransformedMappingArea;
import defpackage.initSession;
import defpackage.isCropAspectRatioHasEffect;
import defpackage.isPossibleMod16FromAspectRatio;
import defpackage.isPresent;
import defpackage.isZslDisabled;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.onCaptureSessionStart;
import defpackage.toVideoProfiles;
import defpackage.tryIncrementAll;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class CaptureActivity extends Activity {
    private createBitmapFromPlane TuitionPaymentFragmentbindingInflater1;
    private DecoratedBarcodeView b;
    private static final byte[] $$c = {109, 84, -87, -114};
    private static final int $$f = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {106, -93, -11, -74, -25, -11, 50, -70, -21, -13, -5, -18, -6, 42, -64, -26, -3, -27, -10, -7, -8, 41, -70, -19, -19, 56, -64, -33, -12, -1, 45, -64, -28, -6, 46, -72, -8, -14, -22, -19, -2, -24, -18, 62, -33, -48, -15, -15, -18, 14, -35, -11, -20, 24, -50, 15, -32, -25, -17, 3, -27, -14, 67, -57, -30, -31, -13, -5, -7, -33, 34, -54, -9, -12, 15, -32, -25, -17, 3, -27, -14, 24, -46, -17, -2, -19, -12, -18, 66, -43, -64, -1, -16, -5, -14, -26, -11, -28, 36, -54, -16, -17, 1, 18, -60, -12, -14, -10, 0, -46, -1, -24, -2, -19, -12, 17, -30, -37, -1, -5, -22, -19, 33, -57, 4, -19, -19, -5, -22, -19, -12, -10, -2, -11, -19, -5, -24, -10, -18, -11, -10, -18, -4, -12, -31, 0, -9, -31, 29, -47, -2, -14, -20, -5, -14, -14, -8, -33, -4, -21, 54, -25, -11, 50, -64, -28, -13, -16, 0, -19, -26, 7, -26, 55, -72, -18, -19, 2, -26, -9, 0, -24, 49, -32, -18, -47, 42, -72, 12, 2, -20, -9, -10, -25, -13, -9, 48, -8, -72, -18, -19, 2, -26, -9, 0, -24, 49, -66, -11, -15, -18, -10, 38, -9, -49, -32, -20, -2, -37, 72, -59, -32, -20, -2, -37, 25, -41, -19, -10, 2, -15, -14, -11, -28, 0, -21, -5, -22, -19, 38, -56, -13, -46, -1, -24, -2, -19, -12, 17, -30, -37, -1, -5, -22, -19, 33, -57, 4, -19, -19, -5, -22, -19, -12, -10, -2, -11, -19, -5, -24, -10, -18, -11, -10, -18, -4, -12, -31, 0, -9, -31, 29, -47, -2, -14, -20, -5, -14, -14, -8, -33, -4, -21, 52, -6, -22, -8, 4, -28, -46, -1, -24, -2, -19, -12, 17, -30, -37, -1, -5, -22, -19, 33, -57, 4, -19, -19, -5, -22, -19, -12, -10, -2, -11, -19, -5, -24, -10, -18, -11, -10, -18, -4, -12, -31, 0, -9, -31, 29, -47, -2, -14, -20, -5, -14, -14, -8, -33, -4, -21, 53, -43, -25, -5, -26, 4, 34, -30, -43, -25, -5, -26, 4, 17, -57, -12, -19, -11, -10, -10, 26, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 31, 4, -61, -46, -1, -24, -2, -19, -12, 17, -30, -37, -1, -5, -22, -19, 33, -57, 4, -19, -19, -5, -22, -19, -12, -10, -2, -11, -19, -5, -24, -10, -18, -11, -10, -18, -4, -12, -31, 0, -9, -31, 29, -47, -2, -14, -20, -5, -14, -14, -8, -33, -4, -21, 53};
    private static final int $$e = 75;
    private static final byte[] $$a = {64, 73, -26, 82, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 222;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int asBinder = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {28659, 20752, 4654, 54052, 37965, 21863, 5758, 55240, 39059, 22958, 6874, 56216, 40131, 24077, 7950, 49199, 33060, 16983, 894, 50287, 34230, 18086, 1960, 51395, 35283, 19194, 45567, 36613, 52278, 3370, 19017, 35694, 51296, 2473, 18060, 34720, 50376, 1489, 17135, 32769, 49408, 7713, 24371, 40030, 45558, 36625, 52274, 3385, 18946, 35692, 51317, 2438, 18075, 34814, 50423, 1473, 17151, 32788, 49425, 7717, 47575, 34614, 50179, 1300, 17018, 33611, 49218, 435, 20118, 36755, 52469, 3570, 19181, 34861, 51506, 5647, 45565, 36638, 52256, 3370, 19011, 35689, 51312, 2502, 18067, 34723, 50314, 1515, 17141, 32787, 49408, 7725, 24369, 40051, 56680, 6775, 23439, 39083, 45561, 36636, 52261, 3368, 19039, 35685, 51312, 2490, 18073, 34737, 50376, 1484, 17125, 32781, 49425, 45486, 36629, 52258, 3385, 19021, 35682, 51314, 2526, 18117, 34742, 50370, 1421, 17129, 32773, 49429, 7805, 24427, 39937, 56626, 6781, 23513, 39159, 55779, 5834, 22489, 38055, 53766, 4937, 20607, 37188, 60928, 12081, 27685, 44433, 60150, 11233, 26781, 43441, 59052, 9225, 25882, 41573, 58128, 8192, 24938, 48773, 65479, 15613, 32189, 47744, 64444, 14585, 30296, 46968, 62566, 13642, 29189, 45864, 61648, 12698, 3758, 20422, 35974, 52714, 45567, 36625, 52256, 3438, 18972, 35637, 51318, 2527, 18073, 34742, 50324, 1498, 17129, 32850, 49426, 7804, 24430, 39939, 56626, 6699, 23513, 39159, 55730, 5790, 22494, 38052, 53766, 4929, 20607, 37145, 60941, 12080, 27685, 44434, 60145, 11241, 26776, 43493, 59125, 9306, 25934, 41525, 58178, 8206, 24891, 48852, 65479, 15611, 32229, 47827, 64445, 14497, 30222, 46964, 62567, 13594, 29279, 45942, 61654, 12748, 3757, 20368, 35970, 52718};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -4217512525518893200L;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 1
            byte[] r1 = com.journeyapps.barcodescanner.CaptureActivity.$$a
            int r6 = 103 - r6
            int r7 = 213 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L29
        L10:
            r3 = r2
        L11:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L29:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-11)
            r7 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CaptureActivity.c(byte, short, int, java.lang.Object[]):void");
    }

    private static void d(short s, short s2, short s3, Object[] objArr) {
        int i = s2 + 4;
        byte[] bArr = $$d;
        int i2 = 117 - s;
        byte[] bArr2 = new byte[s3 + 1];
        int i3 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i)) - 13;
            i = i;
            i3 = -1;
        }
        while (true) {
            int i4 = i3 + 1;
            int i5 = i + 1;
            bArr2[i4] = (byte) i2;
            if (i4 == s3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = (i2 + (-bArr[i5])) - 13;
                i = i5;
                i3 = i4;
            }
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = $10 + 79;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.keyCodeFromString(""), 2187 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 41, 841711447, false, $$g(b, b2, (byte) (b2 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 33018), ((Process.getThreadPriority(0) + 20) >> 6) + 3011, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, 321985076, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36504 - TextUtils.lastIndexOf("", '0')), 3375 - TextUtils.lastIndexOf("", '0', 0), 17 - Drawable.resolveOpacity(0, 0), -968507904, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
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
        int i7 = $11 + 37;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i9 = $10 + 77;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36506), (ViewConfiguration.getTouchSlop() >> 8) + 3376, AndroidCharacter.getMirror('0') - 31, -968507904, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:455:0x3154  */
    /* JADX WARN: Code duplicated, block: B:462:0x3172  */
    /* JADX WARN: Code duplicated, block: B:592:0x3780  */
    /* JADX WARN: Code duplicated, block: B:593:0x3781  */
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        Throwable th;
        Throwable cause;
        Object[] objArr3;
        char c;
        char c2;
        String str;
        Object[] objArr4;
        String str2;
        String str3;
        Object[] objArr5;
        char c3;
        String str4;
        Object[] objArr6;
        Object[] objArr7;
        char c4;
        int i;
        String str5;
        Object[] objArr8;
        String str6;
        String str7;
        Object[] objArr9;
        int i2;
        Object[] objArr10;
        char c5;
        char c6;
        Object[] objArr11;
        String str8;
        String str9;
        Object[] objArr12;
        char c7;
        Object[] objArr13;
        char c8;
        int i3;
        Object[] objArr14;
        int i4;
        Object[] objArr15;
        char c9;
        char c10;
        String str10;
        Object[] objArr16;
        Object[] objArr17;
        char c11;
        Object[] objArr18;
        char c12;
        char c13;
        Object[] objArr19;
        int intExtra;
        int i5;
        int i6 = 2 % 2;
        Object[] objArr20 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.successful).substring(5, 6).codePointAt(0) - 39, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 11, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr20);
        String str11 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        a(98 - ExpandableListView.getPackedPositionType(0L), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_tutorial_dialog_screen_warning_text_mask).substring(11, 12).codePointAt(0) - 86, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr21);
        String str12 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 62, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17, (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr22);
        String str13 = (String) objArr22[0];
        Object[] objArr23 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 24, 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2046), objArr23);
        String str14 = (String) objArr23[0];
        Object[] objArr24 = new Object[1];
        a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 26 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (KeyEvent.keyCodeFromString("") + 56846), objArr24);
        String str15 = (String) objArr24[0];
        Object[] objArr25 = new Object[1];
        a(MotionEvent.axisFromString("") + 27, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_error_dialog_screen_primary_cta_text).substring(8, 13).length() - 5), objArr25);
        String str16 = (String) objArr25[0];
        int i7 = ((Field) calculatePlaceholderForExtensions.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i7 != 2047873600 + ((17401425 | (~((-225019480) | iIdentityHashCode))) * 345) + (((~((-225019480) | (~iIdentityHashCode))) | (-1072408448)) * 345) + ((~(iIdentityHashCode | (-17401426))) * 345)) {
            int[] iArr = new int[47081311];
            iArr[47081310] = 1;
            int i8 = (-2937374) % 2;
            objArr = null;
            Toast.makeText((Context) null, iArr[-1], 1).show();
        } else {
            objArr = null;
        }
        int i9 = ((Field) getConfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).getInt(objArr);
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(objArr, objArr)).getApplicationContext().getPackageName().codePointAt(9) - 1532241174;
        int i10 = ~((-426272881) | iCodePointAt);
        int i11 = ~iCodePointAt;
        if (i9 != 886959996 + (((~(i11 | (-2142184212))) | i10) * (-1808)) + (((~((-4212833) | iCodePointAt)) | (~(i11 | (-1720124164)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(i11 | 426272880)) | (~(2142184211 | iCodePointAt)) | 422060048) * TypedValues.Custom.TYPE_BOOLEAN)) {
            int i12 = 1623152198 % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char keyRepeatTimeout = (char) (53893 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            int i13 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1320;
            int i14 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35;
            byte[] bArr = $$a;
            Object[] objArr26 = new Object[1];
            c((byte) (bArr[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr[7], objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(keyRepeatTimeout, i13, i14, -1433084963, false, (String) objArr26[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c14 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 53892);
                int i15 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1320;
                int iCombineMeasuredStates = 36 - View.combineMeasuredStates(0, 0);
                byte b = $$a[10];
                short s = (short) ($$b & PointerIconCompat.TYPE_COPY);
                Object[] objArr27 = new Object[1];
                c(b, s, (byte) (s >>> 2), objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c14, i15, iCombineMeasuredStates, -1920778747, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr2 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i16 = ((int[]) objArr28[0])[0];
            int i17 = ((int[]) objArr28[3])[0];
            String[] strArr = (String[]) objArr28[2];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = (-1261579920) + (((~((-1277082481) | iIdentityHashCode2)) | 68297472) * 336) + (((~(iIdentityHashCode2 | 93545344)) | (-1302330353)) * (-168)) + (((~((~iIdentityHashCode2) | 93545344)) | (-1277082481)) * 168) + 339746624;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[1])[0] = i20 ^ (i20 << 5);
            str15 = str15;
            str16 = str16;
            str12 = str12;
        } else {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                baseContext = (Context) Class.forName(str15).getMethod(str16, new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str13).getMethod(str14, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr29 = {171005400};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 47977), (ViewConfiguration.getPressedStateDuration() >> 16) + 1300, (ViewConfiguration.getTapTimeout() >> 16) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr30 = {baseContext, "com.bpjstku", 339746624, Integer.valueOf(iIntValue), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr29), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 53893);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 1320;
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 36;
                    byte b2 = $$a[10];
                    short s2 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                    Object[] objArr31 = new Object[1];
                    c(b2, s2, (byte) (s2 >>> 2), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(doubleTapTimeout, capsMode, offsetBefore, 819724799, false, (String) objArr31[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 57878), 1394 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 74 - TextUtils.lastIndexOf("", '0', 0, 0)), Boolean.TYPE});
                }
                Object[] objArr32 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr30);
                if (baseContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetBefore2 = (char) (TextUtils.getOffsetBefore("", 0) + 53893);
                        int iArgb = 1320 - Color.argb(0, 0, 0, 0);
                        int i21 = 37 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte b3 = $$a[10];
                        short s3 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                        Object[] objArr33 = new Object[1];
                        c(b3, s3, (byte) (s3 >>> 2), objArr33);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore2, iArgb, i21, -1920778747, false, (String) objArr33[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr32);
                    try {
                        long jLongValue = ((Long) Class.forName(str11).getDeclaredMethod(str12, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char tapTimeout = (char) (53893 - (ViewConfiguration.getTapTimeout() >> 16));
                            int mirror = AndroidCharacter.getMirror('0') + 1272;
                            int iResolveSize = View.resolveSize(0, 0) + 36;
                            byte[] bArr2 = $$a;
                            Object[] objArr34 = new Object[1];
                            c(bArr2[10], (short) ($$b & 959), (byte) (bArr2[156] - 1), objArr34);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, mirror, iResolveSize, -1273706634, false, (String) objArr34[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 53893);
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1320;
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
                            byte[] bArr3 = $$a;
                            Object[] objArr35 = new Object[1];
                            c((byte) (bArr3[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr3[7], objArr35);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState, packedPositionGroup, jumpTapTimeout, -1433084963, false, (String) objArr35[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr32 = objArr32;
                    str12 = str12;
                }
                objArr2 = objArr32;
            } catch (Throwable th2) {
                th = th2;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i22 = ((int[]) objArr2[3])[0];
        int i23 = ((int[]) objArr2[0])[0];
        if (i23 == i22) {
            objArr3 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i24 = ((int[]) objArr2[1])[0];
            int i25 = ((int[]) objArr2[0])[0];
            int i26 = ((int[]) objArr2[3])[0];
            String[] strArr2 = (String[]) objArr2[2];
            int i27 = (int) Runtime.getRuntime().totalMemory();
            int i28 = ~i27;
            int i29 = i24 + (-156694940) + (((~((-1203822399) | i28)) | (~(1341259710 | i27))) * (-831)) + ((~((-1174454285) | i27)) * (-1662)) + (((~(i27 | 1203822398)) | (~(i28 | (-166805427))) | (~(166805426 | i27))) * 831);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr3[1])[0] = i31 ^ (i31 << 5);
            c2 = 0;
            c = 1;
        } else {
            Toast.makeText((Context) null, i23 / (((i23 - 1) * i23) % 2), 0).show();
            objArr3 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i32 = ((int[]) objArr2[1])[0];
            int i33 = ((int[]) objArr2[0])[0];
            int i34 = ((int[]) objArr2[3])[0];
            String[] strArr3 = (String[]) objArr2[2];
            int i35 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i36 = ~i35;
            int i37 = i32 + (-1152979480) + ((i35 | 100749416) * 988) + (((~(131692394 | i36)) | 1207992452) * (-1976)) + (((~(i35 | (-1238935431))) | 100749416 | (~(1238935430 | i36))) * 988);
            int i38 = i37 ^ (i37 << 13);
            int i39 = i38 ^ (i38 >>> 17);
            c = 1;
            c2 = 0;
            ((int[]) objArr3[1])[0] = i39 ^ (i39 << 5);
        }
        ((Field) getTransformedMappingArea.TuitionPaymentFragmentspecialinlinedviewModeldefault3[c2]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{420218440, 244976967, 1898242356}, ((int[]) objArr3[c])[c2], Integer.MAX_VALUE) - (-1514044882));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43042);
            int iIndexOf = 3111 - TextUtils.indexOf("", "", 0);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 22;
            Object[] objArr36 = new Object[1];
            c($$a[10], (short) 121, (byte) 52, objArr36);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatDelay, iIndexOf, iResolveSizeAndState, -1272852037, false, (String) objArr36[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) != -1) {
            int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            asBinder = i40 % 128;
            int i41 = i40 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 43042);
                int i42 = 3111 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int mirror2 = 'F' - AndroidCharacter.getMirror('0');
                byte[] bArr4 = $$a;
                Object[] objArr37 = new Object[1];
                c(bArr4[10], (short) ($$b & 959), (byte) (bArr4[156] - 1), objArr37);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cMyTid, i42, mirror2, 154975793, false, (String) objArr37[0], null);
            }
            Object[] objArr38 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            int i43 = ((int[]) objArr38[2])[0];
            int i44 = ((int[]) objArr38[1])[0];
            String[] strArr4 = (String[]) objArr38[3];
            int[] iArr2 = {i44};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i45 = (-1567692500) + (((~((-1346999868) | iIdentityHashCode3)) | 358031591) * (-366)) + (((~(iIdentityHashCode3 | (-1074304537))) | 85336260) * 366) + 217309115;
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr4[0])[0] = i47 ^ (i47 << 5);
            objArr4 = new Object[]{new int[1], iArr2, new int[]{i43}, strArr4};
            str = str12;
        } else {
            try {
                Object[] objArr39 = {null, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str14, Object.class).invoke(null, this)).intValue()), 0, 217309115};
                byte[] bArr5 = $$d;
                byte b4 = bArr5[103];
                short s4 = bArr5[29];
                Object[] objArr40 = new Object[1];
                d(b4, s4, (byte) (s4 & 92), objArr40);
                Class<?> cls = Class.forName((String) objArr40[0]);
                byte b5 = (byte) (-bArr5[23]);
                Object[] objArr41 = new Object[1];
                d(b5, (short) (b5 | 72), bArr5[108], objArr41);
                Object[] objArr42 = (Object[]) cls.getMethod((String) objArr41[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr39);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c15 = (char) (43043 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int iMakeMeasureSpec = 3111 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iKeyCodeFromString = 22 - KeyEvent.keyCodeFromString("");
                    byte[] bArr6 = $$a;
                    Object[] objArr43 = new Object[1];
                    c(bArr6[10], (short) ($$b & 959), (byte) (bArr6[156] - 1), objArr43);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c15, iMakeMeasureSpec, iKeyCodeFromString, 154975793, false, (String) objArr43[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr42);
                try {
                    str = str12;
                    long jLongValue2 = ((Long) Class.forName(str11).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char cMyPid = (char) ((Process.myPid() >> 22) + 43042);
                        int iResolveSizeAndState2 = 3111 - View.resolveSizeAndState(0, 0, 0);
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 23;
                        byte b6 = $$a[10];
                        short s5 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                        Object[] objArr44 = new Object[1];
                        c(b6, s5, (byte) (s5 >>> 2), objArr44);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cMyPid, iResolveSizeAndState2, modifierMetaStateMask, -1269618118, false, (String) objArr44[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char deadChar = (char) (43042 - KeyEvent.getDeadChar(0, 0));
                        int i48 = 3111 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i49 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
                        Object[] objArr45 = new Object[1];
                        c($$a[10], (short) 121, (byte) 52, objArr45);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar, i48, i49, -1272852037, false, (String) objArr45[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                    objArr4 = objArr42;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        }
        int i50 = ((int[]) objArr4[1])[0];
        int i51 = ((int[]) objArr4[2])[0];
        if (i51 != i50) {
            ArrayList arrayList = new ArrayList();
            String[] strArr5 = (String[]) objArr4[3];
            if (strArr5 != null) {
                for (String str17 : strArr5) {
                    arrayList.add(str17);
                }
            }
            throw new RuntimeException(String.valueOf(i51));
        }
        int i52 = ((int[]) objArr4[0])[0];
        int i53 = ((int[]) objArr4[2])[0];
        int i54 = ((int[]) objArr4[1])[0];
        String[] strArr6 = (String[]) objArr4[3];
        int[] iArr3 = {i54};
        int i55 = ~System.identityHashCode(this);
        int i56 = i52 + (-1280051758) + (((-1343882777) | i55) * 184) + (((~(i55 | 189116613)) | (-1360967321)) * 184);
        int i57 = (i56 << 13) ^ i56;
        int i58 = i57 ^ (i57 >>> 17);
        Object obj = new Object[]{new int[1], iArr3, new int[]{i53}, strArr6}[0];
        ((int[]) obj)[0] = i58 ^ (i58 << 5);
        ((Field) ByteOrderedDataInputStream.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{846645633, 1931762232, 762633293}, ((int[]) obj)[0], Integer.MAX_VALUE) + 1463371568);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char cRed = (char) Color.red(0);
            int packedPositionType = 2267 - ExpandableListView.getPackedPositionType(0L);
            int iIndexOf2 = 33 - TextUtils.indexOf("", "", 0, 0);
            byte b7 = $$a[10];
            short s6 = (short) ($$b & PointerIconCompat.TYPE_COPY);
            Object[] objArr46 = new Object[1];
            c(b7, s6, (byte) (s6 >>> 2), objArr46);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cRed, packedPositionType, iIndexOf2, -887667012, false, (String) objArr46[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int mode = 2267 - View.MeasureSpec.getMode(0);
                int i59 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32;
                byte[] bArr7 = $$a;
                Object[] objArr47 = new Object[1];
                c(bArr7[10], (short) ($$b & 959), (byte) (bArr7[156] - 1), objArr47);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cLastIndexOf, mode, i59, -654680577, false, (String) objArr47[0], null);
            }
            Object[] objArr48 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).get(null);
            objArr5 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i60 = ((int[]) objArr48[0])[0];
            int i61 = ((int[]) objArr48[3])[0];
            String[] strArr7 = (String[]) objArr48[1];
            int iCodePointAt2 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.telkomsel_instruction_step3).substring(10, 11).codePointAt(0) - 170234167;
            int i62 = ~iCodePointAt2;
            int i63 = (-2051651765) + (((~((-840727791) | i62)) | (~(iCodePointAt2 | (-32014475)))) * 333) + (((~(iCodePointAt2 | (-840727791))) | (~(i62 | (-32014475)))) * 333) + 2079969702;
            int i64 = (i63 << 13) ^ i63;
            int i65 = i64 ^ (i64 >>> 17);
            ((int[]) objArr5[2])[0] = i65 ^ (i65 << 5);
            str2 = str16;
            str3 = str;
            c3 = 3;
            str14 = str14;
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                str2 = str16;
                baseContext2 = (Context) Class.forName(str15).getMethod(str2, new Class[0]).invoke(null, null);
            } else {
                str2 = str16;
            }
            if (baseContext2 != null) {
                baseContext2 = ((baseContext2 instanceof ContextWrapper) && ((ContextWrapper) baseContext2).getBaseContext() == null) ? null : baseContext2.getApplicationContext();
            }
            Object[] objArr49 = {baseContext2, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str14, Object.class).invoke(null, this)).intValue()), 0, 2079969702};
            byte[] bArr8 = $$d;
            Object[] objArr50 = new Object[1];
            d(bArr8[49], (short) ($$e | 16), (byte) (-bArr8[9]), objArr50);
            Class<?> cls2 = Class.forName((String) objArr50[0]);
            Object[] objArr51 = new Object[1];
            d(bArr8[122], (short) 104, bArr8[293], objArr51);
            Object[] objArr52 = (Object[]) cls2.getMethod((String) objArr51[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr49);
            if (baseContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                    int i66 = 2267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int longPressTimeout = 33 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte[] bArr9 = $$a;
                    Object[] objArr53 = new Object[1];
                    c(bArr9[10], (short) ($$b & 959), (byte) (bArr9[156] - 1), objArr53);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cLastIndexOf2, i66, longPressTimeout, -654680577, false, (String) objArr53[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr52);
                try {
                    str3 = str;
                    long jLongValue3 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char c16 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iGreen = 2267 - Color.green(0);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 33;
                        Object[] objArr54 = new Object[1];
                        c($$a[10], (short) 121, (byte) 52, objArr54);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c16, iGreen, scrollBarSize, -874156483, false, (String) objArr54[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char mode2 = (char) View.MeasureSpec.getMode(0);
                        int i67 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2268;
                        int gidForName = 32 - Process.getGidForName("");
                        byte b8 = $$a[10];
                        short s7 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                        Object[] objArr55 = new Object[1];
                        c(b8, s7, (byte) (s7 >>> 2), objArr55);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(mode2, i67, gidForName, -887667012, false, (String) objArr55[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                objArr52 = objArr52;
                str2 = str2;
                str3 = str;
                str14 = str14;
            }
            objArr5 = objArr52;
            c3 = 3;
        }
        if (((int[]) objArr5[0])[0] != ((int[]) objArr5[c3])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr8 = (String[]) objArr5[1];
            if (strArr8 != null) {
                for (String str18 : strArr8) {
                    arrayList2.add(str18);
                }
            }
            throw null;
        }
        Object[] objArr56 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i68 = ((int[]) objArr5[2])[0];
        int i69 = ((int[]) objArr5[0])[0];
        int i70 = ((int[]) objArr5[3])[0];
        String[] strArr9 = (String[]) objArr5[1];
        int i71 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().densityDpi;
        int i72 = ~i71;
        int i73 = i68 + 1993297838 + (((~((-556308398) | i72)) | 252404918) * 519) + (((~(i72 | (-539005706))) | (~(791410623 | i71))) * (-519)) + (((~(i71 | 252404918)) | 556308397) * 519);
        int i74 = (i73 << 13) ^ i73;
        int i75 = i74 ^ (i74 >>> 17);
        Object obj2 = objArr56[2];
        ((int[]) obj2)[0] = i75 ^ (i75 << 5);
        ((Field) isPossibleMod16FromAspectRatio.TuitionPaymentFragmentbindingInflater1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{695821066, 756131409, 993462942}, ((int[]) obj2)[0], Integer.MAX_VALUE) + 1856498893);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46400), 40 - View.MeasureSpec.getSize(0), 19 - TextUtils.getOffsetBefore("", 0), -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
        }
        Object obj3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).get(null);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-159278412);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b((char) (46400 - Drawable.resolveOpacity(0, 0)), 40 - Gravity.getAbsoluteGravity(0, 0), 19 - KeyEvent.normalizeMetaState(0), 304037219, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", new Class[0]);
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(obj3, null);
        super.onCreate(bundle);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
            char c17 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
            int i76 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i77 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr10 = $$a;
            Object[] objArr57 = new Object[1];
            c(bArr10[19], (short) 69, (byte) (-bArr10[9]), objArr57);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c17, i76, i77, -1199417970, false, (String) objArr57[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
            char gidForName2 = (char) ((-1) - Process.getGidForName(""));
            int size = View.MeasureSpec.getSize(0) + 876;
            int mirror3 = ':' - AndroidCharacter.getMirror('0');
            byte[] bArr11 = $$a;
            byte b9 = (byte) (-bArr11[14]);
            Object[] objArr58 = new Object[1];
            c(b9, (short) (b9 | 56), bArr11[7], objArr58);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(gidForName2, size, mirror3, 254769921, false, (String) objArr58[0], null);
        }
        if (j == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int mirror4 = AndroidCharacter.getMirror('0') + 828;
                int size2 = 10 - View.MeasureSpec.getSize(0);
                byte[] bArr12 = $$a;
                Object[] objArr59 = new Object[1];
                c(bArr12[19], (short) 59, bArr12[77], objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(scrollBarSize2, mirror4, size2, 1324201839, false, (String) objArr59[0], null);
            }
            Object[] objArr60 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr60[0])[0]}, new int[1], new int[]{((int[]) objArr60[2])[0]}, (String[]) objArr60[3]};
            int i78 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i79 = ~i78;
            int i80 = ((((-629724714) + (((~(i79 | 29041841)) | 11268387) * (-1042))) + ((29041841 | i78) * 521)) + ((((~(i78 | (-11268388))) | 11214881) | (~(i79 | 29095347))) * 521)) - 1782783158;
            int i81 = (i80 << 13) ^ i80;
            int i82 = i81 ^ (i81 >>> 17);
            ((int[]) objArr6[1])[0] = i82 ^ (i82 << 5);
            str4 = str14;
        } else {
            str4 = str14;
            Object[] objArr61 = {Integer.valueOf(((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue()), -1782783158};
            byte[] bArr13 = $$d;
            Object[] objArr62 = new Object[1];
            d(bArr13[103], (short) 156, (byte) (-bArr13[64]), objArr62);
            Class<?> cls3 = Class.forName((String) objArr62[0]);
            Object[] objArr63 = new Object[1];
            d(bArr13[122], (short) 104, bArr13[293], objArr63);
            Object[] objArr64 = (Object[]) cls3.getMethod((String) objArr63[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr61);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i83 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 875;
                int iAlpha = 10 - Color.alpha(0);
                byte[] bArr14 = $$a;
                Object[] objArr65 = new Object[1];
                c(bArr14[19], (short) 59, bArr14[77], objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(jumpTapTimeout2, i83, iAlpha, 1324201839, false, (String) objArr65[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).set(null, objArr64);
            try {
                long jLongValue5 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char c18 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int i84 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                    int iKeyCodeFromString2 = KeyEvent.keyCodeFromString(r15) + 10;
                    byte[] bArr15 = $$a;
                    byte b10 = (byte) (-bArr15[14]);
                    Object[] objArr66 = new Object[1];
                    c(b10, (short) (b10 | 56), bArr15[7], objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c18, i84, iKeyCodeFromString2, 254769921, false, (String) objArr66[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char cGreen = (char) Color.green(0);
                    int mirror5 = 924 - AndroidCharacter.getMirror('0');
                    int pressedStateDuration = 10 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr16 = $$a;
                    Object[] objArr67 = new Object[1];
                    c(bArr16[19], (short) 69, (byte) (-bArr16[9]), objArr67);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cGreen, mirror5, pressedStateDuration, -1199417970, false, (String) objArr67[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf8);
                objArr6 = objArr64;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i85 = ((int[]) objArr6[2])[0];
        int i86 = ((int[]) objArr6[0])[0];
        if (i86 == i85) {
            int i87 = ((int[]) objArr6[1])[0];
            objArr7 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int i88 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            int i89 = i87 + (-1736909232) + (((~(889660173 | i88)) | (-929970403)) * (-964)) + (((~((~i88) | 889660173)) | (-930036720)) * (-964));
            int i90 = (i89 << 13) ^ i89;
            int i91 = i90 ^ (i90 >>> 17);
            ((int[]) objArr7[1])[0] = i91 ^ (i91 << 5);
            i = 0;
            c4 = 1;
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr10 = (String[]) objArr6[3];
            if (strArr10 != null) {
                for (String str19 : strArr10) {
                    arrayList3.add(str19);
                }
            }
            Toast.makeText((Context) null, i86 / (((i86 - 1) * i86) % 2), 0).show();
            int i92 = ((int[]) objArr6[1])[0];
            objArr7 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int i93 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mnc;
            int i94 = ~((-73995798) | i93);
            int i95 = ~i93;
            int i96 = i92 + 1609606132 + ((i94 | (~(661593693 | i95))) * 920) + (((~((-627908126) | i95)) | 73995797) * 920) + (((~(i93 | 661593693)) | (~((-73995798) | i95)) | (~((-553912329) | i93))) * 920);
            int i97 = i96 ^ (i96 << 13);
            int i98 = i97 ^ (i97 >>> 17);
            c4 = 1;
            i = 0;
            ((int[]) objArr7[1])[0] = i98 ^ (i98 << 5);
        }
        ((Field) isPresent.b[i]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{619588855, 927324398, 671500969}, ((int[]) objArr7[c4])[i], Integer.MAX_VALUE) + 86910174);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char mode3 = (char) View.MeasureSpec.getMode(i);
            int iRgb = (-16776185) - Color.rgb(i, i, i);
            int i99 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15;
            Object[] objArr68 = new Object[1];
            c($$a[10], (short) 121, (byte) 52, objArr68);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(mode3, iRgb, i99, 1357589585, false, (String) objArr68[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
            str5 = "";
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) str5, '0'));
            int size3 = View.MeasureSpec.getSize(0) + 1031;
            int scrollBarSize3 = 15 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b11 = $$a[10];
            short s8 = (short) ($$b & PointerIconCompat.TYPE_COPY);
            Object[] objArr69 = new Object[1];
            c(b11, s8, (byte) (s8 >>> 2), objArr69);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cIndexOf, size3, scrollBarSize3, 1344079056, false, (String) objArr69[0], null);
        } else {
            str5 = r15;
        }
        if (j2 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char c19 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i100 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iIndexOf3 = 14 - TextUtils.indexOf((CharSequence) str5, '0', 0, 0);
                byte[] bArr17 = $$a;
                Object[] objArr70 = new Object[1];
                c((byte) (bArr17[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr17[7], objArr70);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(c19, i100, iIndexOf3, 632103528, false, (String) objArr70[0], null);
            }
            Object[] objArr71 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
            objArr8 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i101 = ((int[]) objArr71[3])[0];
            int i102 = ((int[]) objArr71[1])[0];
            String[] strArr11 = (String[]) objArr71[0];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i103 = ((882569317 + (((~(201254367 | iUptimeMillis)) | 43025802) * (-756))) + (((~iUptimeMillis) | 201254367) * 756)) - 636915958;
            int i104 = (i103 << 13) ^ i103;
            int i105 = i104 ^ (i104 >>> 17);
            ((int[]) objArr8[2])[0] = i105 ^ (i105 << 5);
            int i106 = asBinder + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i106 % 128;
            int i107 = i106 % 2;
        } else {
            int iIntValue2 = ((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue();
            Object[] objArr72 = {-1919199746};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 46039), 1133 - Process.getGidForName(str5), (ViewConfiguration.getScrollBarSize() >> 8) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr73 = {Integer.valueOf(iIntValue2), 0, -636915958, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).newInstance(objArr72), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char cMyPid2 = (char) (Process.myPid() >> 22);
                int longPressTimeout2 = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iKeyCodeFromString3 = KeyEvent.keyCodeFromString(str5) + 15;
                Object[] objArr74 = new Object[1];
                c($$a[10], (short) 121, (byte) 52, objArr74);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cMyPid2, longPressTimeout2, iKeyCodeFromString3, 1298546779, false, (String) objArr74[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1117, 17 - ((Process.getThreadPriority(0) + 20) >> 6)), Boolean.TYPE});
            }
            objArr8 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).invoke(null, objArr73);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char cMyPid3 = (char) (Process.myPid() >> 22);
                int iLastIndexOf = 1030 - TextUtils.lastIndexOf(str5, '0', 0, 0);
                int iMyPid = (Process.myPid() >> 22) + 15;
                byte[] bArr18 = $$a;
                Object[] objArr75 = new Object[1];
                c((byte) (bArr18[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr18[7], objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(cMyPid3, iLastIndexOf, iMyPid, 632103528, false, (String) objArr75[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr8);
            try {
                long jLongValue7 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue7);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                    char c20 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1031;
                    int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
                    byte b12 = $$a[10];
                    short s9 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                    Object[] objArr76 = new Object[1];
                    c(b12, s9, (byte) (s9 >>> 2), objArr76);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(c20, keyRepeatTimeout2, iResolveOpacity, 1344079056, false, (String) objArr76[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue7 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                    char c21 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1031;
                    int scrollBarFadeDuration = 15 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    Object[] objArr77 = new Object[1];
                    c($$a[10], (short) 121, (byte) 52, objArr77);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c21, maximumDrawingCacheSize, scrollBarFadeDuration, 1357589585, false, (String) objArr77[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf10);
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i108 = ((int[]) objArr8[1])[0];
        int i109 = ((int[]) objArr8[3])[0];
        if (i109 != i108) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr12 = (String[]) objArr8[0];
            if (strArr12 != null) {
                for (String str20 : strArr12) {
                    arrayList4.add(str20);
                }
            }
            throw new RuntimeException(String.valueOf(i109));
        }
        Object[] objArr78 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i110 = ((int[]) objArr8[2])[0];
        int i111 = ((int[]) objArr8[3])[0];
        int i112 = ((int[]) objArr8[1])[0];
        String[] strArr13 = (String[]) objArr8[0];
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i113 = i110 + 340157850 + (((~((-547357557) | (~iIdentityHashCode4))) | 303077386) * (-591)) + ((iIdentityHashCode4 | (-547357557)) * 591);
        int i114 = (i113 << 13) ^ i113;
        int i115 = i114 ^ (i114 >>> 17);
        Object obj4 = objArr78[2];
        ((int[]) obj4)[0] = i115 ^ (i115 << 5);
        ((Field) StabilizationModeMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{2020178070, 297076130, 643556720}, ((int[]) obj4)[0], Integer.MAX_VALUE) + 392272825);
        setContentView(R.layout.zxing_capture);
        this.b = (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
            char pressedStateDuration2 = (char) (37567 - (ViewConfiguration.getPressedStateDuration() >> 16));
            int mirror6 = 673 - AndroidCharacter.getMirror('0');
            int iLastIndexOf2 = TextUtils.lastIndexOf(str5, '0', 0) + 15;
            byte[] bArr19 = $$a;
            Object[] objArr79 = new Object[1];
            c((byte) (bArr19[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr19[7], objArr79);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(pressedStateDuration2, mirror6, iLastIndexOf2, -477065106, false, (String) objArr79[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null);
        long jLongValue8 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
            char cRed2 = (char) (Color.red(0) + 37567);
            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 625;
            int iNormalizeMetaState = 14 - KeyEvent.normalizeMetaState(0);
            Object[] objArr80 = new Object[1];
            c($$a[10], (short) 121, (byte) 52, objArr80);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(cRed2, maximumDrawingCacheSize2, iNormalizeMetaState, -976899241, false, (String) objArr80[0], null);
        }
        if (j3 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 37567);
                int offsetBefore3 = 625 - TextUtils.getOffsetBefore(str5, 0);
                int iResolveSize2 = View.resolveSize(0, 0) + 14;
                byte b13 = $$a[10];
                short s10 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                Object[] objArr81 = new Object[1];
                c(b13, s10, (byte) (s10 >>> 2), objArr81);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(keyRepeatDelay2, offsetBefore3, iResolveSize2, -973632554, false, (String) objArr81[0], null);
            }
            Object[] objArr82 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).get(null);
            int i116 = ((int[]) objArr82[2])[0];
            int i117 = ((int[]) objArr82[0])[0];
            String[] strArr14 = (String[]) objArr82[3];
            int[] iArr4 = {i116};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i118 = ~iMaxMemory;
            int i119 = (~((-1424943003) | i118)) | 1076545168 | (~(398795118 | i118));
            int i120 = 1660600944 + (((~(iMaxMemory | (-50397285))) | i119) * 590) + (i119 * (-1180)) + (((~((-398795119) | i118)) | (~(i118 | 1424943002))) * 590) + 353568147;
            int i121 = (i120 << 13) ^ i120;
            int i122 = i121 ^ (i121 >>> 17);
            ((int[]) objArr9[1])[0] = i122 ^ (i122 << 5);
            objArr9 = new Object[]{new int[]{i117}, new int[1], iArr4, strArr14};
            i2 = 0;
            str7 = "currentApplication";
            str6 = str2;
        } else {
            Context baseContext3 = getBaseContext();
            if (baseContext3 == null) {
                str6 = str2;
                baseContext3 = (Context) Class.forName(str15).getMethod(str6, new Class[0]).invoke(null, null);
            } else {
                str6 = str2;
            }
            if (baseContext3 != null) {
                baseContext3 = (!((baseContext3 instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext3).getBaseContext() == null) ? null : baseContext3.getApplicationContext();
            }
            int iIntValue3 = ((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue();
            str7 = r7;
            Object[] objArr83 = new Object[1];
            a(((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 15, ((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.copy_payment_code).substring(9, 10).length() + 63, (char) (((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.contentFilteringHtmlStatusCardWarningTitle).substring(0, 20).length() - 20), objArr83);
            String str21 = (String) objArr83[0];
            Object[] objArr84 = new Object[1];
            a(((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.notification_gojek_app).substring(4, 5).codePointAt(0) + 70, ((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.chademo_ev_connector_type).substring(0, 6).codePointAt(3) - 36, (char) (((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.vida_camera_screen_instructions_text_face_not_straight).substring(0, 31).codePointAt(20) - 97), objArr84);
            Object[] objArr85 = {baseContext3, new String[]{str21, (String) objArr84[0]}, Integer.valueOf(iIntValue3), 17, 353568147};
            byte[] bArr20 = $$d;
            short s11 = (short) 186;
            Object[] objArr86 = new Object[1];
            d((byte) (-bArr20[12]), s11, (byte) (s11 & 108), objArr86);
            Class<?> cls4 = Class.forName((String) objArr86[0]);
            byte b14 = (byte) (-bArr20[23]);
            Object[] objArr87 = new Object[1];
            d(b14, (short) (b14 | 72), bArr20[108], objArr87);
            Object[] objArr88 = (Object[]) cls4.getMethod((String) objArr87[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr85);
            int i123 = ((int[]) objArr88[0])[0];
            int i124 = ((int[]) objArr88[2])[0];
            if (baseContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                    char modifierMetaStateMask2 = (char) (37566 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int i125 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 624;
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 14;
                    byte b15 = $$a[10];
                    short s12 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                    Object[] objArr89 = new Object[1];
                    c(b15, s12, (byte) (s12 >>> 2), objArr89);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(modifierMetaStateMask2, i125, packedPositionType2, -973632554, false, (String) objArr89[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, objArr88);
                try {
                    long jLongValue9 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                        char cGreen2 = (char) (Color.green(0) + 37567);
                        int capsMode2 = TextUtils.getCapsMode(str5, 0, 0) + 625;
                        int i126 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr90 = new Object[1];
                        c($$a[10], (short) 121, (byte) 52, objArr90);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cGreen2, capsMode2, i126, -976899241, false, (String) objArr90[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                        char maxKeyCode = (char) (37567 - (KeyEvent.getMaxKeyCode() >> 16));
                        int i127 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 624;
                        int packedPositionType3 = 14 - ExpandableListView.getPackedPositionType(0L);
                        byte[] bArr21 = $$a;
                        Object[] objArr91 = new Object[1];
                        c((byte) (bArr21[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr21[7], objArr91);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(maxKeyCode, i127, packedPositionType3, -477065106, false, (String) objArr91[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr88 = objArr88;
                str6 = str6;
            }
            objArr9 = objArr88;
            i2 = 0;
        }
        int i128 = ((int[]) objArr9[i2])[i2];
        int i129 = ((int[]) objArr9[2])[i2];
        if (i129 == i128) {
            objArr10 = new Object[4];
            int[] iArr5 = new int[1];
            objArr10[i2] = iArr5;
            objArr10[1] = new int[1];
            int[] iArr6 = new int[1];
            objArr10[2] = iArr6;
            int i130 = ((int[]) objArr9[1])[i2];
            int i131 = ((int[]) objArr9[2])[i2];
            int i132 = ((int[]) objArr9[i2])[i2];
            String[] strArr15 = (String[]) objArr9[3];
            iArr6[i2] = i131;
            iArr5[i2] = i132;
            int i133 = ((Context) Class.forName("android.app.ActivityThread").getMethod(str7, new Class[i2]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 359258798;
            int i134 = ~i133;
            int i135 = i130 + 74022064 + (((~(1637396247 | i134)) | 186341873) * (-328)) + ((i133 | 186341873) * 164) + (((~(i133 | (-1637396248))) | 18352401 | (~(i134 | 1805385719))) * 164);
            int i136 = (i135 << 13) ^ i135;
            int i137 = i136 ^ (i136 >>> 17);
            ((int[]) objArr10[1])[0] = i137 ^ (i137 << 5);
            objArr10[3] = strArr15;
            c5 = 1;
            c6 = 0;
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr16 = (String[]) objArr9[3];
            if (strArr16 != null) {
                for (String str22 : strArr16) {
                    int i138 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
                    asBinder = i138 % 128;
                    int i139 = i138 % 2;
                    arrayList5.add(str22);
                }
            }
            Toast.makeText((Context) null, i129 / (((i129 - 1) * i129) % 2), 0).show();
            int i140 = ((int[]) objArr9[1])[0];
            int i141 = ((int[]) objArr9[2])[0];
            int i142 = ((int[]) objArr9[0])[0];
            String[] strArr17 = (String[]) objArr9[3];
            int[] iArr7 = {i141};
            int i143 = ((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1045648457;
            int i144 = ~i143;
            int i145 = i140 + (-523535168) + (((~((-879327384) | i144)) | (-944410738) | (~(879327383 | i143))) * (-564)) + ((~(i143 | (-134381665))) * 1128) + (((~((-944410738) | i144)) | (-1013709048)) * 564);
            int i146 = i145 ^ (i145 << 13);
            int i147 = i146 ^ (i146 >>> 17);
            c5 = 1;
            c6 = 0;
            ((int[]) objArr10[1])[0] = i147 ^ (i147 << 5);
            objArr10 = new Object[]{new int[]{i142}, new int[1], iArr7, strArr17};
        }
        ((Field) toVideoProfiles.b[c6]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{2073262462, 1854809550, 2097782247}, ((int[]) objArr10[c5])[c6], Integer.MAX_VALUE) - (-1563943214));
        createBitmapFromPlane createbitmapfromplane = new createBitmapFromPlane(this, this.b);
        this.TuitionPaymentFragmentbindingInflater1 = createbitmapfromplane;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
            char trimmedLength = (char) (29944 - TextUtils.getTrimmedLength(str5));
            int packedPositionChild = 1754 - ExpandableListView.getPackedPositionChild(0L);
            int trimmedLength2 = 23 - TextUtils.getTrimmedLength(str5);
            byte[] bArr22 = $$a;
            Object[] objArr92 = new Object[1];
            c(bArr22[10], (short) ($$b & 959), (byte) (bArr22[156] - 1), objArr92);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(trimmedLength, packedPositionChild, trimmedLength2, 986134021, false, (String) objArr92[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).getLong(null) != -1) {
            int i148 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
            asBinder = i148 % 128;
            int i149 = i148 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char longPressTimeout3 = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29944);
                int iArgb2 = 1755 - Color.argb(0, 0, 0, 0);
                int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte b16 = $$a[10];
                short s13 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                Object[] objArr93 = new Object[1];
                c(b16, s13, (byte) (s13 >>> 2), objArr93);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(longPressTimeout3, iArgb2, threadPriority, 1599039318, false, (String) objArr93[0], null);
            }
            Object[] objArr94 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr94[0])[0]}, new int[]{((int[]) objArr94[1])[0]}, (Object[]) objArr94[2], new int[1], (String[]) objArr94[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i150 = ((((~(437102872 | startUptimeMillis)) | (-1018437195)) * 398) - 1023957807) + (((~((~startUptimeMillis) | 437102872)) | (-1018437195)) * 398) + 1212080669;
            int i151 = (i150 << 13) ^ i150;
            int i152 = i151 ^ (i151 >>> 17);
            ((int[]) objArr11[3])[0] = i152 ^ (i152 << 5);
            createbitmapfromplane = createbitmapfromplane;
        } else {
            int iIntValue4 = ((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr95 = {1999018151};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b((char) (42049 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), View.combineMeasuredStates(0, 0) + 1726, TextUtils.indexOf(str5, str5, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue4, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).newInstance(objArr95), 1212080669, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29944);
                    int iIndexOf4 = TextUtils.indexOf(str5, str5, 0) + 1755;
                    int i153 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte b17 = $$a[10];
                    short s14 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                    Object[] objArr96 = new Object[1];
                    c(b17, s14, (byte) (s14 >>> 2), objArr96);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(minimumFlingVelocity, iIndexOf4, i153, 1599039318, false, (String) objArr96[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
                try {
                    long jLongValue10 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 29944);
                        int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                        int i154 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                        short s15 = (short) 52;
                        Object[] objArr97 = new Object[1];
                        c($$a[10], s15, (byte) s15, objArr97);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cResolveSize, jumpTapTimeout3, i154, 1596667560, false, (String) objArr97[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                        char cMyTid2 = (char) (29944 - (Process.myTid() >> 22));
                        int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1756;
                        int i155 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                        byte[] bArr23 = $$a;
                        Object[] objArr98 = new Object[1];
                        c(bArr23[10], (short) ($$b & 959), (byte) (bArr23[156] - 1), objArr98);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cMyTid2, modifierMetaStateMask3, i155, 986134021, false, (String) objArr98[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf14);
                    objArr11 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            } catch (Throwable th4) {
                th = th4;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr11[0])[0] != ((int[]) objArr11[1])[0]) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr18 = (String[]) objArr11[4];
            if (strArr18 != null) {
                for (String str23 : strArr18) {
                    arrayList6.add(str23);
                }
            }
            throw null;
        }
        int i156 = asBinder + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i156 % 128;
        int i157 = i156 % 2;
        int i158 = ((int[]) objArr11[3])[0];
        Object[] objArr99 = {new int[]{((int[]) objArr11[0])[0]}, new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[1], (String[]) objArr11[4]};
        int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
        int i159 = ~iUptimeMillis2;
        int i160 = i158 + (-318405658) + (((~((-113051122) | i159)) | 99551304) * (-602)) + (((~(iUptimeMillis2 | (-113051122))) | 78446656 | (~(134155769 | i159))) * (-301)) + ((~(i159 | 99551304)) * 301);
        int i161 = (i160 << 13) ^ i160;
        int i162 = i161 ^ (i161 >>> 17);
        Object obj5 = objArr99[3];
        ((int[]) obj5)[0] = i162 ^ (i162 << 5);
        ((Field) EncoderProfilesProxyCompatBaseImpl.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{785488988, 440931729, 1057970934}, ((int[]) obj5)[0], Integer.MAX_VALUE) - (-543230547));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
            char cIndexOf2 = (char) TextUtils.indexOf(str5, str5);
            int iMyTid = (Process.myTid() >> 22) + 876;
            int i163 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
            byte[] bArr24 = $$a;
            Object[] objArr100 = new Object[1];
            c((byte) (bArr24[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr24[7], objArr100);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cIndexOf2, iMyTid, i163, 252381699, false, (String) objArr100[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str11).getDeclaredMethod(str3, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
            char maximumDrawingCacheSize3 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(0);
            int iKeyCodeFromString4 = KeyEvent.keyCodeFromString(str5) + 10;
            short s16 = (short) 52;
            Object[] objArr101 = new Object[1];
            c($$a[10], s16, (byte) s16, objArr101);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(maximumDrawingCacheSize3, bitsPerPixel, iKeyCodeFromString4, 2009631821, false, (String) objArr101[0], null);
        }
        if (j4 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iAxisFromString = MotionEvent.axisFromString(str5) + 877;
                int iLastIndexOf3 = TextUtils.lastIndexOf(str5, '0', 0, 0) + 11;
                byte b18 = $$a[7];
                short s17 = b18;
                Object[] objArr102 = new Object[1];
                c(b18, s17, (byte) s17, objArr102);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(minimumFlingVelocity2, iAxisFromString, iLastIndexOf3, 256017550, false, (String) objArr102[0], null);
            }
            Object[] objArr103 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).get(null);
            objArr12 = new Object[]{new int[]{((int[]) objArr103[0])[0]}, new int[1], new int[]{((int[]) objArr103[2])[0]}, (String[]) objArr103[3]};
            int i164 = ~(((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1325841434);
            int i165 = 200229271 + (((~(169158709 | i164)) | (-209468939)) * (-983)) + (((~(i164 | (-209468939))) | 135538688) * 983) + 1811700719;
            int i166 = (i165 << 13) ^ i165;
            int i167 = i166 ^ (i166 >>> 17);
            ((int[]) objArr12[1])[0] = i167 ^ (i167 << 5);
            str9 = str3;
            str8 = str6;
            c7 = 2;
            str4 = str4;
        } else {
            Context baseContext4 = getBaseContext();
            if (baseContext4 == null) {
                str8 = str6;
                baseContext4 = (Context) Class.forName(str15).getMethod(str8, new Class[0]).invoke(null, null);
            } else {
                str8 = str6;
            }
            if (baseContext4 != null) {
                baseContext4 = ((baseContext4 instanceof ContextWrapper) && ((ContextWrapper) baseContext4).getBaseContext() == null) ? null : baseContext4.getApplicationContext();
            }
            Object[] objArr104 = {baseContext4, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str4, Object.class).invoke(null, this)).intValue()), 1811700719};
            byte[] bArr25 = $$d;
            Object[] objArr105 = new Object[1];
            d(bArr25[115], (short) 226, (byte) (-bArr25[2]), objArr105);
            Class<?> cls5 = Class.forName((String) objArr105[0]);
            byte b19 = bArr25[122];
            Object[] objArr106 = new Object[1];
            d(b19, (short) (b19 | 204), bArr25[293], objArr106);
            Object[] objArr107 = (Object[]) cls5.getMethod((String) objArr106[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr104);
            if (baseContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char c22 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iIndexOf5 = TextUtils.indexOf((CharSequence) str5, '0') + 877;
                    int defaultSize = View.getDefaultSize(0, 0) + 10;
                    byte b20 = $$a[7];
                    short s18 = b20;
                    Object[] objArr108 = new Object[1];
                    c(b20, s18, (byte) s18, objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(c22, iIndexOf5, defaultSize, 256017550, false, (String) objArr108[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, objArr107);
                try {
                    str9 = str3;
                    long jLongValue12 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                        char c23 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int i168 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int iNormalizeMetaState2 = 10 - KeyEvent.normalizeMetaState(0);
                        short s19 = (short) 52;
                        Object[] objArr109 = new Object[1];
                        c($$a[10], s19, (byte) s19, objArr109);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(c23, i168, iNormalizeMetaState2, 2009631821, false, (String) objArr109[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                        char c24 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                        int mode4 = 876 - View.MeasureSpec.getMode(0);
                        int mode5 = View.MeasureSpec.getMode(0) + 10;
                        byte[] bArr26 = $$a;
                        Object[] objArr110 = new Object[1];
                        c((byte) (bArr26[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr26[7], objArr110);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(c24, mode4, mode5, 252381699, false, (String) objArr110[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).set(null, lValueOf16);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            } else {
                str4 = str4;
                str9 = str3;
                objArr107 = objArr107;
            }
            objArr12 = objArr107;
            c7 = 2;
        }
        int i169 = ((int[]) objArr12[c7])[0];
        int i170 = ((int[]) objArr12[0])[0];
        if (i170 == i169) {
            int i171 = ((int[]) objArr12[1])[0];
            objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i172 = ~(201491789 | iElapsedRealtime);
            int i173 = ~iElapsedRealtime;
            int i174 = i172 | (~(241802018 | i173));
            int i175 = ~((-201491790) | i173);
            int i176 = i171 + (-1066028012) + ((i174 | i175) * (-516)) + (((~(iElapsedRealtime | (-40442403))) | (~((-201359617) | i173))) * 516) + ((201359616 | i175) * 516);
            int i177 = (i176 << 13) ^ i176;
            int i178 = i177 ^ (i177 >>> 17);
            c8 = 1;
            i3 = 0;
            ((int[]) objArr13[1])[0] = i178 ^ (i178 << 5);
        } else {
            int[] iArr8 = new int[i170];
            int i179 = i170 - 1;
            iArr8[i179] = 1;
            Toast.makeText((Context) null, iArr8[((i170 * i179) % 2) - 1], 1).show();
            int i180 = ((int[]) objArr12[1])[0];
            objArr13 = new Object[]{new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i181 = ~iIdentityHashCode5;
            int i182 = i180 + 1854270488 + (((~(807968000 | i181)) | 848278229) * (-90)) + (((~(807968000 | iIdentityHashCode5)) | 2100480) * (-45)) + (((~(iIdentityHashCode5 | (-848278230))) | 807968000 | (~(i181 | 848278229))) * 45);
            int i183 = (i182 << 13) ^ i182;
            int i184 = i183 ^ (i183 >>> 17);
            c8 = 1;
            i3 = 0;
            ((int[]) objArr13[1])[0] = i184 ^ (i184 << 5);
        }
        ((Field) UseCaseConfigFactoryCaptureType.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1381999595, 1892372070, 84871026}, ((int[]) objArr13[c8])[i3], Integer.MAX_VALUE) - (-1216908253));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
            char c25 = (char) (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int maximumDrawingCacheSize4 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 651;
            int iResolveSizeAndState3 = View.resolveSizeAndState(i3, i3, i3) + 44;
            short s20 = (short) 52;
            Object[] objArr111 = new Object[1];
            c($$a[10], s20, (byte) s20, objArr111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c25, maximumDrawingCacheSize4, iResolveSizeAndState3, -459846511, false, (String) objArr111[i3], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
            char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) str5, '0') + 1);
            int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 651;
            int iAlpha2 = Color.alpha(0) + 44;
            byte[] bArr27 = $$a;
            Object[] objArr112 = new Object[1];
            c((byte) (bArr27[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr27[7], objArr112);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cIndexOf3, tapTimeout2, iAlpha2, -873460649, false, (String) objArr112[0], null);
        }
        if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char cMyTid3 = (char) (Process.myTid() >> 22);
                int iMyTid2 = 651 - (Process.myTid() >> 22);
                int fadingEdgeLength = 44 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte[] bArr28 = $$a;
                Object[] objArr113 = new Object[1];
                c(bArr28[10], (short) ($$b & 959), (byte) (bArr28[156] - 1), objArr113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cMyTid3, iMyTid2, fadingEdgeLength, -1595579076, false, (String) objArr113[0], null);
            }
            Object[] objArr114 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
            objArr14 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i185 = ((int[]) objArr114[2])[0];
            int i186 = ((int[]) objArr114[0])[0];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i187 = ~iIdentityHashCode6;
            int i188 = 1106397823 + (((~(i187 | (-81032409))) | 13906056 | (~((-17336867) | iIdentityHashCode6))) * 717) + (((~(iIdentityHashCode6 | (-81032409))) | (~(i187 | (-17336867))) | 13906056) * 717) + 777504812;
            int i189 = (i188 << 13) ^ i188;
            int i190 = i189 ^ (i189 >>> 17);
            ((int[]) objArr14[3])[0] = i190 ^ (i190 << 5);
            i4 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b((char) ExpandableListView.getPackedPositionGroup(0L), 1610 - (ViewConfiguration.getJumpTapTimeout() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr115 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).newInstance(null), 777504812, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int keyRepeatTimeout3 = 651 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int iMakeMeasureSpec2 = 44 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr29 = $$a;
                Object[] objArr116 = new Object[1];
                c((byte) (bArr29[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr29[7], objArr116);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(scrollDefaultDelay, keyRepeatTimeout3, iMakeMeasureSpec2, 2075921419, false, (String) objArr116[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ExpandableListView.getPackedPositionType(0L), 694 - ((byte) KeyEvent.getModifierMetaStateMask()), 97 - ImageFormat.getBitsPerPixel(0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getTapTimeout() >> 16) + 63406), 793 - ExpandableListView.getPackedPositionGroup(0L), View.resolveSizeAndState(0, 0, 0) + 83), Integer.TYPE, Integer.TYPE});
            }
            objArr14 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).invoke(null, objArr115);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                char c26 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 651;
                int keyRepeatTimeout4 = 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte[] bArr30 = $$a;
                Object[] objArr117 = new Object[1];
                c(bArr30[10], (short) ($$b & 959), (byte) (bArr30[156] - 1), objArr117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(c26, touchSlop, keyRepeatTimeout4, -1595579076, false, (String) objArr117[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, objArr14);
            try {
                long jLongValue14 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf17 = Long.valueOf(jLongValue14);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                    char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iIndexOf6 = TextUtils.indexOf((CharSequence) str5, '0', 0, 0) + 652;
                    int iCombineMeasuredStates2 = 44 - View.combineMeasuredStates(0, 0);
                    byte[] bArr31 = $$a;
                    Object[] objArr118 = new Object[1];
                    c((byte) (bArr31[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr31[7], objArr118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(scrollDefaultDelay2, iIndexOf6, iCombineMeasuredStates2, -873460649, false, (String) objArr118[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, lValueOf17);
                Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int keyRepeatTimeout5 = 651 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 44;
                    short s21 = (short) 52;
                    Object[] objArr119 = new Object[1];
                    c($$a[10], s21, (byte) s21, objArr119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cResolveOpacity, keyRepeatTimeout5, pressedStateDuration3, -459846511, false, (String) objArr119[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, lValueOf18);
                i4 = 0;
            } catch (Exception unused9) {
                throw new RuntimeException();
            }
        }
        int i191 = ((int[]) objArr14[i4])[i4];
        int i192 = ((int[]) objArr14[2])[i4];
        if (i192 == i191) {
            objArr15 = new Object[4];
            int[] iArr9 = new int[1];
            objArr15[i4] = iArr9;
            int[] iArr10 = new int[1];
            objArr15[2] = iArr10;
            objArr15[3] = new int[1];
            int i193 = ((int[]) objArr14[3])[i4];
            int i194 = ((int[]) objArr14[2])[i4];
            int i195 = ((int[]) objArr14[i4])[i4];
            iArr10[i4] = i194;
            iArr9[i4] = i195;
            objArr15[1] = new String[i4];
            int iNextInt = new Random().nextInt(462673540);
            int i196 = ~iNextInt;
            int i197 = i193 + (((((~(1005853268 | i196)) | (~((-1009284079) | iNextInt))) | (~(i196 | 1009284078))) * 959) - 456228478) + (((~(iNextInt | 1009284078)) | (~(i196 | (-1009284079))) | (~(1005853268 | iNextInt))) * 959);
            int i198 = (i197 << 13) ^ i197;
            int i199 = i198 ^ (i198 >>> 17);
            ((int[]) objArr15[3])[0] = i199 ^ (i199 << 5);
            c10 = 0;
            c9 = 3;
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr19 = (String[]) objArr14[1];
            if (strArr19 != null) {
                for (String str24 : strArr19) {
                    arrayList7.add(str24);
                }
            }
            Toast.makeText((Context) null, i192 / (((i192 - 1) * i192) % 2), 0).show();
            objArr15 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i200 = ((int[]) objArr14[3])[0];
            int i201 = ((int[]) objArr14[2])[0];
            int i202 = ((int[]) objArr14[0])[0];
            int i203 = ~Process.myPid();
            int i204 = i200 + (-1936359485) + (((-759169298) | i203) * 494) + (((~(i203 | (-759417244))) | 3926702) * 494);
            int i205 = i204 ^ (i204 << 13);
            int i206 = i205 ^ (i205 >>> 17);
            c9 = 3;
            c10 = 0;
            ((int[]) objArr15[3])[0] = i206 ^ (i206 << 5);
        }
        ((Field) UseCaseConfigFactoryProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3[c10]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{511838554, 1605127861, 1257107077}, ((int[]) objArr15[c9])[c10], Integer.MAX_VALUE) - (-303985991));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
            char jumpTapTimeout4 = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int iResolveSize3 = View.resolveSize(0, 0) + 921;
            int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
            byte[] bArr32 = $$a;
            Object[] objArr120 = new Object[1];
            c((byte) (bArr32[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr32[7], objArr120);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(jumpTapTimeout4, iResolveSize3, pressedStateDuration4, -1048449946, false, (String) objArr120[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
                int iMyTid3 = (Process.myTid() >> 22) + 921;
                int deadChar2 = KeyEvent.getDeadChar(0, 0) + 28;
                byte[] bArr33 = $$a;
                Object[] objArr121 = new Object[1];
                c(bArr33[10], (short) ($$b & 959), (byte) (bArr33[156] - 1), objArr121);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cRgb, iMyTid3, deadChar2, -1142834547, false, (String) objArr121[0], null);
            }
            Object[] objArr122 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).get(null);
            objArr16 = new Object[]{new int[1], new int[]{((int[]) objArr122[1])[0]}, (Object[]) objArr122[2], new int[]{((int[]) objArr122[3])[0]}, (String[]) objArr122[4]};
            int length = ((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2034485057;
            int i207 = ~length;
            int i208 = (-720528378) + ((1740525179 | i207) * (-369)) + (((~((-641601083) | i207)) | 1132478561) * (-369)) + (((~(length | 641601082)) | 1098924097 | (~(i207 | (-608046619)))) * 369) + 303546510;
            int i209 = (i208 << 13) ^ i208;
            int i210 = i209 ^ (i209 >>> 17);
            ((int[]) objArr16[0])[0] = i210 ^ (i210 << 5);
            str10 = str4;
        } else {
            Context baseContext5 = getBaseContext();
            if (baseContext5 == null) {
                baseContext5 = (Context) Class.forName(str15).getMethod(str8, new Class[0]).invoke(null, null);
            }
            if (baseContext5 != null) {
                baseContext5 = ((baseContext5 instanceof ContextWrapper) && ((ContextWrapper) baseContext5).getBaseContext() == null) ? null : baseContext5.getApplicationContext();
            }
            str10 = str4;
            Object[] objArr123 = {baseContext5, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str10, Object.class).invoke(null, this)).intValue()), 0, 303546510};
            byte[] bArr34 = $$d;
            byte b21 = bArr34[108];
            Object[] objArr124 = new Object[1];
            d(b21, (short) (b21 | 289), (byte) (-bArr34[10]), objArr124);
            Class<?> cls6 = Class.forName((String) objArr124[0]);
            Object[] objArr125 = new Object[1];
            d(bArr34[122], (short) 294, bArr34[293], objArr125);
            Object[] objArr126 = (Object[]) cls6.getMethod((String) objArr125[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr123);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char cRgb2 = (char) (Color.rgb(0, 0, 0) + 16808749);
                int i211 = 921 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i212 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27;
                byte[] bArr35 = $$a;
                Object[] objArr127 = new Object[1];
                c(bArr35[10], (short) ($$b & 959), (byte) (bArr35[156] - 1), objArr127);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cRgb2, i211, i212, -1142834547, false, (String) objArr127[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, objArr126);
            try {
                long jLongValue15 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue15);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char mirror7 = (char) (AndroidCharacter.getMirror('0') + 31485);
                    int doubleTapTimeout2 = 921 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int offsetBefore4 = TextUtils.getOffsetBefore(str5, 0) + 28;
                    byte b22 = $$a[10];
                    short s22 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                    Object[] objArr128 = new Object[1];
                    c(b22, s22, (byte) (s22 >>> 2), objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(mirror7, doubleTapTimeout2, offsetBefore4, -778300370, false, (String) objArr128[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue15 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                    char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) str5, '0') + 31534);
                    int iGreen2 = 921 - Color.green(0);
                    int defaultSize2 = View.getDefaultSize(0, 0) + 28;
                    byte[] bArr36 = $$a;
                    Object[] objArr129 = new Object[1];
                    c((byte) (bArr36[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr36[7], objArr129);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cIndexOf4, iGreen2, defaultSize2, -1048449946, false, (String) objArr129[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, lValueOf20);
                objArr16 = objArr126;
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        int i213 = ((int[]) objArr16[1])[0];
        int i214 = ((int[]) objArr16[3])[0];
        if (i214 == i213) {
            int i215 = ((int[]) objArr16[0])[0];
            objArr17 = new Object[]{new int[1], new int[]{((int[]) objArr16[1])[0]}, (Object[]) objArr16[2], new int[]{((int[]) objArr16[3])[0]}, (String[]) objArr16[4]};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i216 = i215 + (-887193159) + (((~(iIdentityHashCode7 | 711422590)) | 1062657053) * 191) + (((~((~iIdentityHashCode7) | 711422590)) | 353405953) * 191);
            int i217 = (i216 << 13) ^ i216;
            int i218 = i217 ^ (i217 >>> 17);
            c11 = 0;
            ((int[]) objArr17[0])[0] = i218 ^ (i218 << 5);
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr20 = (String[]) objArr16[4];
            if (strArr20 != null) {
                int i219 = 0;
                while (i219 < strArr20.length) {
                    int i220 = asBinder + 125;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i220 % 128;
                    if (i220 % 2 != 0) {
                        arrayList8.add(strArr20[i219]);
                        i219 += 103;
                    } else {
                        arrayList8.add(strArr20[i219]);
                        i219++;
                    }
                }
            }
            int[] iArr11 = new int[i214];
            int i221 = i214 - 1;
            iArr11[i221] = 1;
            Toast.makeText((Context) null, iArr11[((i214 * i221) % 2) - 1], 1).show();
            int i222 = ((int[]) objArr16[0])[0];
            objArr17 = new Object[]{new int[1], new int[]{((int[]) objArr16[1])[0]}, (Object[]) objArr16[2], new int[]{((int[]) objArr16[3])[0]}, (String[]) objArr16[4]};
            int i223 = ~(((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().screenWidthDp | 1013123482);
            int i224 = i222 + (-552286119) + (((-760956162) | i223) * (-220)) + ((i223 | (-1031490972)) * 220) + 1714481818;
            int i225 = (i224 << 13) ^ i224;
            int i226 = i225 ^ (i225 >>> 17);
            c11 = 0;
            ((int[]) objArr17[0])[0] = i226 ^ (i226 << 5);
        }
        ((Field) isZslDisabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3[c11]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1705017858, 946298748, 32127876}, ((int[]) objArr17[c11])[c11], Integer.MAX_VALUE) + 1568182892);
        Intent intent = getIntent();
        createBitmapFromPlane createbitmapfromplane2 = createbitmapfromplane;
        createbitmapfromplane2.b.getWindow().addFlags(128);
        if (bundle != null) {
            int i227 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            asBinder = i227 % 128;
            int i228 = i227 % 2;
            createbitmapfromplane2.asBinder = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                if (createbitmapfromplane2.asBinder == -1) {
                    int rotation = createbitmapfromplane2.b.getWindowManager().getDefaultDisplay().getRotation();
                    int i229 = createbitmapfromplane2.b.getResources().getConfiguration().orientation;
                    if (i229 == 2) {
                        if (rotation == 0 || rotation == 1) {
                            i5 = 0;
                        } else {
                            i5 = 8;
                        }
                    } else if (i229 != 1) {
                        i5 = 0;
                    } else if (rotation != 0) {
                        int i230 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i231 = i230 + 95;
                        asBinder = i231 % 128;
                        int i232 = i231 % 2;
                        if (rotation != 3) {
                            int i233 = i230 + 95;
                            asBinder = i233 % 128;
                            int i234 = i233 % 2;
                            i5 = 9;
                        } else {
                            i5 = 1;
                        }
                    } else {
                        i5 = 1;
                    }
                    createbitmapfromplane2.asBinder = i5;
                }
                createbitmapfromplane2.b.setRequestedOrientation(createbitmapfromplane2.asBinder);
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                DecoratedBarcodeView decoratedBarcodeView = createbitmapfromplane2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Set<BarcodeFormat> setTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ImageAnalysisConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1(intent);
                Map<DecodeHintType, ?> mapB = ForwardingCameraControl.b(intent);
                CameraSettings cameraSettings = new CameraSettings();
                if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
                    cameraSettings.f837a = intExtra;
                }
                String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
                if (stringExtra != null) {
                    decoratedBarcodeView.setStatusText(stringExtra);
                }
                boolean booleanExtra = intent.getBooleanExtra("INVERTED_SCAN", false);
                String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
                new tryIncrementAll().TuitionPaymentFragmentbindingInflater1(mapB);
                decoratedBarcodeView.TuitionPaymentFragmentbindingInflater1.setCameraSettings(cameraSettings);
                decoratedBarcodeView.TuitionPaymentFragmentbindingInflater1.setDecoderFactory(new cropJpegByteArray(setTuitionPaymentFragmentspecialinlinedviewModeldefault1, mapB, stringExtra2, booleanExtra));
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                int i235 = asBinder + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i235 % 128;
                if (i235 % 2 != 0) {
                    createbitmapfromplane2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                } else {
                    createbitmapfromplane2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                }
            }
            if (intent.hasExtra("TIMEOUT")) {
                createbitmapfromplane2.asInterface.postDelayed(new Runnable() { // from class: createBitmapFromPlane.3
                    public AnonymousClass3() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        createBitmapFromPlane createbitmapfromplane3 = createBitmapFromPlane.this;
                        Intent intent2 = new Intent("com.google.zxing.client.android.SCAN");
                        intent2.putExtra("TIMEOUT", true);
                        createbitmapfromplane3.b.setResult(0, intent2);
                        createbitmapfromplane3.TuitionPaymentFragmentbindingInflater1();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                createbitmapfromplane2.cancel = true;
            }
        } else {
            str5 = str5;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
            char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
            int i236 = 876 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i237 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
            byte[] bArr37 = $$a;
            Object[] objArr130 = new Object[1];
            c(bArr37[10], (short) ($$b & 959), (byte) (bArr37[156] - 1), objArr130);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(packedPositionGroup2, i236, i237, -1650998592, false, (String) objArr130[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).getLong(null);
        long jLongValue16 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
            char c27 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int mode6 = View.MeasureSpec.getMode(0) + 876;
            int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
            byte b23 = $$a[10];
            short s23 = (short) ($$b & PointerIconCompat.TYPE_COPY);
            Object[] objArr131 = new Object[1];
            c(b23, s23, (byte) (s23 >>> 2), objArr131);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(c27, mode6, absoluteGravity, 2012020043, false, (String) objArr131[0], null);
        }
        if (j6 == ((jLongValue16 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                char cAlpha = (char) Color.alpha(0);
                int keyRepeatTimeout6 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                int i238 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9;
                Object[] objArr132 = new Object[1];
                c($$a[10], (short) 121, (byte) 52, objArr132);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cAlpha, keyRepeatTimeout6, i238, 2012931276, false, (String) objArr132[0], null);
            }
            Object[] objArr133 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).get(null);
            objArr18 = new Object[]{new int[]{((int[]) objArr133[0])[0]}, new int[1], new int[]{((int[]) objArr133[2])[0]}, (String[]) objArr133[3]};
            int i239 = (~((Context) Class.forName(r3).getMethod(str7, new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden) | 337465608;
            int i240 = 881084491 + (i239 * 495) + (((~i239) | 67715080) * 495) + 1487577845;
            int i241 = (i240 << 13) ^ i240;
            int i242 = i241 ^ (i241 >>> 17);
            ((int[]) objArr18[1])[0] = i242 ^ (i242 << 5);
        } else {
            Context baseContext6 = getBaseContext();
            if (baseContext6 == null) {
                baseContext6 = (Context) Class.forName(str15).getMethod(str8, new Class[0]).invoke(null, null);
            }
            if (baseContext6 != null) {
                baseContext6 = ((baseContext6 instanceof ContextWrapper) && ((ContextWrapper) baseContext6).getBaseContext() == null) ? null : baseContext6.getApplicationContext();
            }
            Object[] objArr134 = {baseContext6, Integer.valueOf(((Integer) Class.forName(str13).getMethod(str10, Object.class).invoke(null, this)).intValue()), 0, 1487577845};
            byte[] bArr38 = $$d;
            Object[] objArr135 = new Object[1];
            d(bArr38[6], (short) 346, (byte) 97, objArr135);
            Class<?> cls7 = Class.forName((String) objArr135[0]);
            Object[] objArr136 = new Object[1];
            d(bArr38[122], (short) 104, bArr38[293], objArr136);
            objArr18 = (Object[]) cls7.getMethod((String) objArr136[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr134);
            if (baseContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int i243 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iKeyCodeFromString5 = 10 - KeyEvent.keyCodeFromString(str5);
                    Object[] objArr137 = new Object[1];
                    c($$a[10], (short) 121, (byte) 52, objArr137);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cCombineMeasuredStates, i243, iKeyCodeFromString5, 2012931276, false, (String) objArr137[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr18);
                try {
                    long jLongValue17 = ((Long) Class.forName(str11).getDeclaredMethod(str9, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                        char c28 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                        int iNormalizeMetaState3 = 876 - KeyEvent.normalizeMetaState(0);
                        int iMyTid4 = 10 - (Process.myTid() >> 22);
                        byte b24 = $$a[10];
                        short s24 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                        Object[] objArr138 = new Object[1];
                        c(b24, s24, (byte) (s24 >>> 2), objArr138);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(c28, iNormalizeMetaState3, iMyTid4, 2012020043, false, (String) objArr138[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                        char c29 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int iIndexOf7 = 875 - TextUtils.indexOf((CharSequence) str5, '0', 0);
                        int deadChar3 = KeyEvent.getDeadChar(0, 0) + 10;
                        byte[] bArr39 = $$a;
                        Object[] objArr139 = new Object[1];
                        c(bArr39[10], (short) ($$b & 959), (byte) (bArr39[156] - 1), objArr139);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(c29, iIndexOf7, deadChar3, -1650998592, false, (String) objArr139[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf22);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
        }
        int i244 = ((int[]) objArr18[2])[0];
        int i245 = ((int[]) objArr18[0])[0];
        if (i245 == i244) {
            int i246 = ((int[]) objArr18[1])[0];
            objArr19 = new Object[]{new int[]{((int[]) objArr18[0])[0]}, new int[1], new int[]{((int[]) objArr18[2])[0]}, (String[]) objArr18[3]};
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i247 = (~((-834254101) | iIdentityHashCode8)) | 279519232;
            int i248 = i246 + 1521273620 + (i247 * 992) + ((i247 | (~((~iIdentityHashCode8) | (-239209004)))) * (-496)) + ((iIdentityHashCode8 | (-793943872)) * 496);
            int i249 = (i248 << 13) ^ i248;
            int i250 = i249 ^ (i249 >>> 17);
            c13 = 0;
            ((int[]) objArr19[1])[0] = i250 ^ (i250 << 5);
            c12 = 1;
        } else {
            Toast.makeText((Context) null, i245 / (((i245 - 1) * i245) % 2), 0).show();
            int i251 = ((int[]) objArr18[1])[0];
            Object[] objArr140 = {new int[]{((int[]) objArr18[0])[0]}, new int[1], new int[]{((int[]) objArr18[2])[0]}, (String[]) objArr18[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i252 = ~iIdentityHashCode9;
            int i253 = i251 + (-1005518026) + ((924414519 | i252) * (-757)) + ((~(935034487 | iIdentityHashCode9)) * 1514) + (((~(iIdentityHashCode9 | (-10619969))) | (~(i252 | 884104290)) | 50930197) * 757);
            int i254 = (i253 << 13) ^ i253;
            int i255 = i254 ^ (i254 >>> 17);
            c12 = 1;
            c13 = 0;
            ((int[]) objArr140[1])[0] = i255 ^ (i255 << 5);
            objArr19 = objArr140;
        }
        ((Field) UseCaseConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2[c13]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1287878108, 813435178, 1692640059}, ((int[]) objArr19[c12])[c13], Integer.MAX_VALUE) - (-1763520025));
        createBitmapFromPlane createbitmapfromplane3 = this.TuitionPaymentFragmentbindingInflater1;
        DecoratedBarcodeView decoratedBarcodeView2 = createbitmapfromplane3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        ArrayRingBuffer arrayRingBuffer = createbitmapfromplane3.TuitionPaymentFragmentbindingInflater1;
        BarcodeView barcodeView = decoratedBarcodeView2.TuitionPaymentFragmentbindingInflater1;
        DecoratedBarcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = decoratedBarcodeView2.new TuitionPaymentFragmentspecialinlinedviewModeldefault2(arrayRingBuffer);
        barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = BarcodeView.DecodeMode.SINGLE;
        barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1668982245
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Activity
    protected void onResume() {
        /*
            Method dump skipped, instruction units count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CaptureActivity.onResume():void");
    }

    @Override // android.app.Activity
    protected void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39, View.getDefaultSize(0, 0) + 19, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
                }
                Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (46400 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40, TextUtils.lastIndexOf("", '0') + 20, 41588667, false, "b", new Class[0]);
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(obj, null);
                super.onPause();
                createBitmapFromPlane createbitmapfromplane = this.TuitionPaymentFragmentbindingInflater1;
                createbitmapfromplane.f881a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                BarcodeView barcodeView = createbitmapfromplane.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
                isCropAspectRatioHasEffect iscropaspectratiohaseffect = barcodeView.b;
                barcodeView.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                System.nanoTime();
                throw null;
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551014231);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46448 - AndroidCharacter.getMirror('0')), 39 - MotionEvent.axisFromString(""), TextUtils.lastIndexOf("", '0', 0) + 20, -1192477056, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            Object obj2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-421253012);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 46400), AndroidCharacter.getMirror('0') - '\b', 19 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 41588667, false, "b", new Class[0]);
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(obj2, null);
            super.onPause();
            createBitmapFromPlane createbitmapfromplane2 = this.TuitionPaymentFragmentbindingInflater1;
            createbitmapfromplane2.f881a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            BarcodeView barcodeView2 = createbitmapfromplane2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
            isCropAspectRatioHasEffect iscropaspectratiohaseffect2 = barcodeView2.b;
            barcodeView2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            long jNanoTime = System.nanoTime();
            while (iscropaspectratiohaseffect2 != null && !iscropaspectratiohaseffect2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                int i3 = asBinder + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                if (System.nanoTime() - jNanoTime > 2000000000) {
                    return;
                }
                int i5 = asBinder + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                    return;
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

    @Override // android.app.Activity
    protected void onDestroy() {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            createBitmapFromPlane createbitmapfromplane = this.TuitionPaymentFragmentbindingInflater1;
            createbitmapfromplane.d = true;
            createbitmapfromplane.f881a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            createbitmapfromplane.asInterface.removeCallbacksAndMessages(null);
            return;
        }
        super.onDestroy();
        createBitmapFromPlane createbitmapfromplane2 = this.TuitionPaymentFragmentbindingInflater1;
        createbitmapfromplane2.d = true;
        createbitmapfromplane2.f881a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        createbitmapfromplane2.asInterface.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            super.onSaveInstanceState(bundle);
            bundle.putInt("SAVED_ORIENTATION_LOCK", this.TuitionPaymentFragmentbindingInflater1.asBinder);
            int i3 = 39 / 0;
        } else {
            super.onSaveInstanceState(bundle);
            bundle.putInt("SAVED_ORIENTATION_LOCK", this.TuitionPaymentFragmentbindingInflater1.asBinder);
        }
        int i4 = asBinder + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = asBinder + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(i, iArr);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = asBinder + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            this.b.onKeyDown(i, keyEvent);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.b.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent)) {
            return true;
        }
        int i4 = asBinder + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
        Object[] objArr;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
            int tapTimeout = 23 - (ViewConfiguration.getTapTimeout() >> 16);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[10], (short) ($$b & 959), (byte) (bArr[156] - 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, iIndexOf, tapTimeout, 986134021, false, (String) objArr2[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            int i3 = asBinder + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 29945);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1755;
                int scrollBarFadeDuration2 = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b = $$a[10];
                short s = (short) ($$b & PointerIconCompat.TYPE_COPY);
                Object[] objArr3 = new Object[1];
                c(b, s, (byte) (s >>> 2), objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, offsetAfter, scrollBarFadeDuration2, 1599039318, false, (String) objArr3[0], null);
            }
            Object[] objArr4 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            int i5 = ((int[]) objArr4[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = new Object[]{new int[]{i5}, new int[]{((int[]) objArr4[1])[0]}, (Object[]) objArr4[2], new int[1], (String[]) objArr4[4]};
            int length = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bri_mobile_instruction_4).substring(17, 19).length() - 576171037;
            int i6 = (((((~(939440895 | length)) | 55216185) * 449) - 1224724153) + (((~((~length) | 939440895)) | 55216185) * 449)) - 1542940337;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr5 = new Object[1];
            a(43 - TextUtils.lastIndexOf("", '0', 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (Process.myTid() >> 22), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 49, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, (char) (TextUtils.indexOf((CharSequence) "", '0') + 2083), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr7 = {218957315};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 42049), View.MeasureSpec.makeMeasureSpec(0, 0) + 1726, 30 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = MediaSessionCompat.MediaSessionImplBase.AnonymousClass1.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr7), -1542940337);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveSizeAndState = (char) (29944 - View.resolveSizeAndState(0, 0, 0));
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                    byte b2 = $$a[10];
                    short s2 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                    Object[] objArr8 = new Object[1];
                    c(b2, s2, (byte) (s2 >>> 2), objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, touchSlop, iIndexOf2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.bca_klik_pay_instruction_step3).substring(97, 99).codePointAt(1) + 44, 22 - View.MeasureSpec.getMode(0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.payment_bank_description_bri).substring(1, 3).length() - 2), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 62, 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.alfamart).substring(0, 8).length() - 8), objArr10);
                    long jLongValue = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMakeMeasureSpec = (char) (29944 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int i9 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                        int iIndexOf3 = 23 - TextUtils.indexOf("", "", 0);
                        short s3 = (short) 52;
                        Object[] objArr11 = new Object[1];
                        c($$a[10], s3, (byte) s3, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, i9, iIndexOf3, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 29944);
                        int i10 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
                        int size = 23 - View.MeasureSpec.getSize(0);
                        byte[] bArr2 = $$a;
                        Object[] objArr12 = new Object[1];
                        c(bArr2[10], (short) ($$b & 959), (byte) (bArr2[156] - 1), objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, i10, size, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4];
            if (strArr == null) {
                throw null;
            }
            while (i2 < strArr.length) {
                arrayList.add(strArr[i2]);
                i2++;
            }
            throw null;
        }
        int i11 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[3])[0];
        int i12 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[0])[0];
        Object[] objArr13 = {new int[]{i12}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da[4]};
        int i13 = ~((~((int) Runtime.getRuntime().maxMemory())) | 853889245);
        int i14 = i11 + ((572604545 | i13) * (-374)) + 1792042055 + ((i13 | 281284700) * 374);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        ((int[]) objArr13[3])[0] = i16 ^ (i16 << 5);
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
        asBinder = i17 % 128;
        int i18 = i17 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
            int size2 = View.MeasureSpec.getSize(0) + 1031;
            int i19 = 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr14 = new Object[1];
            c($$a[10], (short) 121, (byte) 52, objArr14);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, size2, i19, 1357589585, false, (String) objArr14[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
        Object[] objArr15 = new Object[1];
        a(75 - MotionEvent.axisFromString(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 76, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr15);
        Class<?> cls3 = Class.forName((String) objArr15[0]);
        Object[] objArr16 = new Object[1];
        a(146 - AndroidCharacter.getMirror('0'), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr16);
        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cResolveSize = (char) View.resolveSize(0, 0);
            int trimmedLength = 1031 - TextUtils.getTrimmedLength("");
            int iResolveOpacity = 15 - Drawable.resolveOpacity(0, 0);
            byte b3 = $$a[10];
            short s4 = (short) ($$b & PointerIconCompat.TYPE_COPY);
            Object[] objArr17 = new Object[1];
            c(b3, s4, (byte) (s4 >>> 2), objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cResolveSize, trimmedLength, iResolveOpacity, 1344079056, false, (String) objArr17[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
            int i20 = asBinder + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
            int i21 = i20 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int mirror = 1079 - AndroidCharacter.getMirror('0');
                int threadPriority = 15 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte[] bArr3 = $$a;
                Object[] objArr18 = new Object[1];
                c((byte) (bArr3[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr3[7], objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveOpacity, mirror, threadPriority, 632103528, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i22 = ((int[]) objArr19[3])[0];
            int i23 = ((int[]) objArr19[1])[0];
            String[] strArr2 = (String[]) objArr19[0];
            int i24 = ~((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 419791377) | 639712835);
            int i25 = (((-833678491) | i24) * (-658)) + 2102417019 + ((i24 | (-934411996)) * 658) + 255090540;
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr[2])[0] = i27 ^ (i27 << 5);
        } else {
            Object[] objArr20 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.validation_message_invalid_cvv).substring(12, 13).codePointAt(0) + 12, View.MeasureSpec.makeMeasureSpec(0, 0) + 16, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr20);
            Class<?> cls4 = Class.forName((String) objArr20[0]);
            Object[] objArr21 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.uikit_uob_web_instruction_6).substring(13, 14).length() + 59, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.txt_checkout).substring(0, 15).codePointAt(8) + 2050), objArr21);
            int iIntValue2 = ((Integer) cls4.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr22 = {218957315};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b((char) (TextUtils.indexOf("", "") + 46038), (ViewConfiguration.getEdgeSlop() >> 16) + 1134, 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr23 = {Integer.valueOf(iIntValue2), 0, 255090540, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).newInstance(objArr22), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int iIndexOf4 = TextUtils.indexOf("", "", 0, 0) + 1031;
                int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0) + 16;
                Object[] objArr24 = new Object[1];
                c($$a[10], (short) 121, (byte) 52, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c, iIndexOf4, iIndexOf5, 1298546779, false, (String) objArr24[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.red(0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1117, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16), Boolean.TYPE});
            }
            objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr23);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char cIndexOf2 = (char) TextUtils.indexOf("", "");
                int offsetAfter2 = 1031 - TextUtils.getOffsetAfter("", 0);
                int i28 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr4 = $$a;
                Object[] objArr25 = new Object[1];
                c((byte) (bArr4[19] - 1), (short) ($$b & PointerIconCompat.TYPE_COPY), bArr4[7], objArr25);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf2, offsetAfter2, i28, 632103528, false, (String) objArr25[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, objArr);
            try {
                Object[] objArr26 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 40, 22 - TextUtils.getOffsetAfter("", 0), (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 36), objArr26);
                Class<?> cls5 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 87, TextUtils.indexOf("", "", 0) + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11), objArr27);
                long jLongValue3 = ((Long) cls5.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i29 = 1031 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i30 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14;
                    byte b4 = $$a[10];
                    short s5 = (short) ($$b & PointerIconCompat.TYPE_COPY);
                    Object[] objArr28 = new Object[1];
                    c(b4, s5, (byte) (s5 >>> 2), objArr28);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c2, i29, i30, 1344079056, false, (String) objArr28[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                    int i31 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1030;
                    int i32 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15;
                    Object[] objArr29 = new Object[1];
                    c($$a[10], (short) 121, (byte) 52, objArr29);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(trimmedLength2, i31, i32, 1357589585, false, (String) objArr29[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i33 = ((int[]) objArr[1])[0];
        int i34 = ((int[]) objArr[3])[0];
        if (i34 != i33) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
                asBinder = i35 % 128;
                int i36 = i35 % 2;
                while (i2 < strArr3.length) {
                    int i37 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
                    asBinder = i37 % 128;
                    int i38 = i37 % 2;
                    arrayList2.add(strArr3[i2]);
                    i2++;
                }
            }
            throw new RuntimeException(String.valueOf(i34));
        }
        int i39 = asBinder + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i39 % 128;
        int i40 = i39 % 2;
        Object[] objArr30 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i41 = ((int[]) objArr[2])[0];
        int i42 = ((int[]) objArr[3])[0];
        int i43 = ((int[]) objArr[1])[0];
        String[] strArr4 = (String[]) objArr[0];
        int i44 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
        int i45 = ~i44;
        int i46 = i41 + 684085005 + (((~((-277877763) | i45)) | (~((-689963810) | i44)) | (~(1001439163 | i44))) * 765) + (((~((-967841572) | i45)) | 277877762) * 1530) + (((~(i44 | (-967841572))) | (~(i45 | 1001439163))) * 765);
        int i47 = i46 ^ (i46 << 13);
        int i48 = i47 ^ (i47 >>> 17);
        ((int[]) objArr30[2])[0] = i48 ^ (i48 << 5);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1797908595
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Activity
    protected void onStart() {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CaptureActivity.onStart():void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r1 = com.journeyapps.barcodescanner.CaptureActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
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
            r6 = r5
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CaptureActivity.$$g(int, byte, short):java.lang.String");
    }
}

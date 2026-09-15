package com.bpjstku.base;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import androidx.core.view.InputDeviceCompat;
import androidx.multidex.MultiDex;
import com.bpjstku.data.point.PointDataStore;
import com.bpjstku.di.ApiModuleKt;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.material.timepicker.TimePickerTextInputPresenter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.nbs.nucleo.presentation.BaseApplication;
import defpackage.AExternalSyntheticLambda1;
import defpackage.C0806l;
import defpackage.CameraUseCaseAdapter;
import defpackage.D;
import defpackage.DExternalSyntheticLambda3;
import defpackage.EExternalSyntheticLambda2;
import defpackage.IResultReceiver2Stub;
import defpackage.J;
import defpackage.L;
import defpackage.MExternalSyntheticLambda3;
import defpackage.MediaSessionCompatApi21;
import defpackage.MediaSessionCompatApi23Callback;
import defpackage.MediaSessionCompatMediaSessionImplBase1;
import defpackage.MediaSessionCompatQueueItem;
import defpackage.OExternalSyntheticLambda1;
import defpackage.OExternalSyntheticLambda4;
import defpackage.PExternalSyntheticLambda12;
import defpackage.ParcelableVolumeInfo1;
import defpackage.PlaybackStateCompat1;
import defpackage.PlaybackStateCompatApi21;
import defpackage.Q;
import defpackage.VExternalSyntheticLambda1;
import defpackage.X;
import defpackage.YExternalSyntheticLambda1;
import defpackage.calculateSensorToBufferTransformMatrix;
import defpackage.computeCropRectFromAspectRatio;
import defpackage.d0ExternalSyntheticLambda0;
import defpackage.deInitSession;
import defpackage.delete;
import defpackage.fromBundle;
import defpackage.fromCustomAction;
import defpackage.g0;
import defpackage.getBase64;
import defpackage.getContentPaddingRight;
import defpackage.getCustomActions;
import defpackage.getHumanThreatName;
import defpackage.getIcon;
import defpackage.getLocalizedName;
import defpackage.getPosition;
import defpackage.getQueueId;
import defpackage.getThreatUUID;
import defpackage.getToken;
import defpackage.initSession;
import defpackage.isLenovoTablet;
import defpackage.isMitigated;
import defpackage.isSimulated;
import defpackage.k0ExternalSyntheticLambda0;
import defpackage.l0ExternalSyntheticLambda0;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.needAbortCapture;
import defpackage.o0ExternalSyntheticLambda1;
import defpackage.onActivityResumed;
import defpackage.onAvailable;
import defpackage.onCaptureSessionStart;
import defpackage.onChange;
import defpackage.onReceive;
import defpackage.send;
import defpackage.specify_simon;
import defpackage.update;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.net.ssl.SSLContext;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003"}, d2 = {"Lcom/bpjstku/base/BpjstkuApplication;", "Lcom/nbs/nucleo/presentation/BaseApplication;", "<init>", "()V", "", "onCreate", "", "LisLenovoTablet;", "TuitionPaymentFragmentbindingInflater1", "()Ljava/util/List;", "Landroid/content/Context;", "p0", "attachBaseContext", "(Landroid/content/Context;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BpjstkuApplication extends BaseApplication {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$c = {29, 88, -118, 32};
    private static final int $$f = 87;
    private static int $10;
    private static int $11;
    private static char TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char[] b;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 14
            int r7 = 98 - r7
            int r8 = 144 - r8
            byte[] r0 = com.bpjstku.base.BpjstkuApplication.$$a
            int r6 = 53 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r8]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.base.BpjstkuApplication.a(int, byte, int, java.lang.Object[]):void");
    }

    public BpjstkuApplication() {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends getContentPaddingRight.b {
        private static final byte[] $$c = {68, -119, -76, 97};
        private static final int $$f = 226;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {15, -9, 64, -81, -5, 18, -5, 8, 3, 10, 25, -13, 4, 24, 5, -9, -15, 40, -7, -28, 36, 21, 10, 7, 3, -7, -46, 54, 19, -4, 20, 3, 0, 1, 26, -15, 4, 18, -2, 19, -11, 8, 4, 18, -2, 19, -11, -41, Base64.padSymbol, 11, 12, -9, 19, 2, -7, 17, -35, 36, 18, -2, 19, -11, -41, 23, 36, 21, 10, 7, 3, -7, -15, 31, 13, -5, 13, 3, 11, -3, -15, 31, 13, -5, 13, 3, 11, -3, -59, 54, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, -12, 13, 11, -4, 11, 11, -1, -24, 43, -2, 12, -5, 25, -9, 19, -59, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, 5, 3, -5, 4, 12, -2, 17, 3, 11, 4, 3, 11, -3, 5, 24, -7, 2, 24, -36, 40, -5, 7, 13, -2, 7, 7, 1, 26, -3, 14, -61};
        private static final int $$e = 201;
        private static final byte[] $$a = {87, -91, 60, 112, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 147;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int b = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {14584, 3012, 24219, 41330, 62522, 50959, 3023, 24274, 41326, 62497, 51017, 3067, 24196, 41341, 62503, 50945, 3012, 24249, 41315, 62527, 50950, 3037, 45561, 33475, 55195, 10357, 32035, 19974, 33482, 55211, 10337, 32054, 19982, 33497, 55185, 10342, 32051};
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 4607573413468209839L;

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 52
                int r7 = 107 - r7
                int r6 = r6 * 15
                int r0 = 53 - r6
                int r8 = r8 * 2
                int r8 = 84 - r8
                byte[] r1 = com.bpjstku.base.BpjstkuApplication.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$a
                byte[] r0 = new byte[r0]
                int r6 = 52 - r6
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r6
                r8 = r7
                r4 = r2
                goto L32
            L19:
                r3 = r2
            L1a:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L32:
                int r7 = -r7
                int r3 = r3 + r7
                int r7 = r3 + (-11)
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.base.BpjstkuApplication.TuitionPaymentFragmentspecialinlinedviewModeldefault2.a(int, int, byte, java.lang.Object[]):void");
        }

        private static void d(short s, byte b2, short s2, Object[] objArr) {
            int i = (s2 * 24) + 84;
            int i2 = b2 * 69;
            int i3 = 125 - (s * 121);
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[i2 + 53];
            int i4 = i2 + 52;
            int i5 = -1;
            if (bArr == null) {
                i = (i3 + i4) - 6;
                i3++;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i6 = i;
                i = (i6 + bArr[i3]) - 6;
                i3++;
            }
        }

        private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i4 = $11 + 95;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2186, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - Color.red(0)), 3011 - Gravity.getAbsoluteGravity(0, 0), TextUtils.getCapsMode("", 0, 0) + 26, 321985076, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36506), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3375, 16 - ImageFormat.getBitsPerPixel(0), -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
                int i7 = $11 + 75;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36505 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3376, 17 - Color.green(0), -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
            int i9 = $11 + 107;
            $10 = i9 % 128;
            int i10 = i9 % 2;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x04c0  */
        /* JADX WARN: Code duplicated, block: B:40:0x04cc  */
        @Override // getContentPaddingRight.b
        public final void TuitionPaymentFragmentbindingInflater1(int i, String str, String str2, Throwable th) throws Throwable {
            Object[] objArr;
            int i2;
            String string;
            int i3 = 2 % 2;
            int i4 = TuitionPaymentFragmentbindingInflater1 + 103;
            b = i4 % 128;
            int i5 = i4 % 2;
            String str3 = "";
            Intrinsics.checkNotNullParameter(str2, "");
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0', 0, 0));
                int trimmedLength = 3111 - TextUtils.getTrimmedLength("");
                int longPressTimeout = 22 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, bArr[40], b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, trimmedLength, longPressTimeout, -1272852037, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(TextUtils.indexOf("", ""), (KeyEvent.getMaxKeyCode() >> 16) + 22, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35076), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c((ViewConfiguration.getFadingEdgeLength() >> 16) + 22, 15 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 43043);
                int i6 = 3112 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b3, bArr2[5], b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf2, i6, i7, -1269618118, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i8 = TuitionPaymentFragmentbindingInflater1 + 41;
                b = i8 % 128;
                int i9 = i8 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) (43042 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    int iIndexOf = 3111 - TextUtils.indexOf("", "", 0, 0);
                    int iIndexOf2 = 22 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[5];
                    byte b5 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    a(b4, b5, b5, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iIndexOf, iIndexOf2, 154975793, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i10 = ((int[]) objArr7[2])[0];
                int i11 = ((int[]) objArr7[1])[0];
                String[] strArr = (String[]) objArr7[3];
                int[] iArr = {i10};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i12 = (~((-744445648) | elapsedCpuTime)) | 675364931;
                int i13 = ~((~elapsedCpuTime) | 1029666527);
                int i14 = 1298969124 + ((i12 | i13) * (-470)) + (((~(elapsedCpuTime | (-69080717))) | i13) * 470) + 730947973;
                int i15 = (i14 << 13) ^ i14;
                int i16 = i15 ^ (i15 >>> 17);
                ((int[]) objArr[0])[0] = i16 ^ (i16 << 5);
                objArr = new Object[]{new int[1], new int[]{i11}, iArr, strArr};
            } else {
                try {
                    Object[] objArr8 = {null, Integer.valueOf(i), 0, 730947973};
                    byte[] bArr4 = $$d;
                    byte b6 = bArr4[33];
                    byte b7 = b6;
                    Object[] objArr9 = new Object[1];
                    d(b6, b7, b7, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b8 = bArr4[32];
                    byte b9 = b8;
                    Object[] objArr10 = new Object[1];
                    d(b8, b9, b9, objArr10);
                    Object[] objArr11 = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43041);
                        int mirror = AndroidCharacter.getMirror('0') + 3063;
                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[5];
                        byte b11 = bArr5[7];
                        Object[] objArr12 = new Object[1];
                        a(b10, b11, b11, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, mirror, iIndexOf3, 154975793, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr11);
                    try {
                        Object[] objArr13 = new Object[1];
                        c(View.resolveSize(0, 0), View.MeasureSpec.getMode(0) + 22, (char) (35077 - TextUtils.getOffsetBefore("", 0)), objArr13);
                        Class<?> cls3 = Class.forName((String) objArr13[0]);
                        Object[] objArr14 = new Object[1];
                        c(22 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 15, (char) (KeyEvent.getMaxKeyCode() >> 16), objArr14);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maximumDrawingCacheSize = (char) (43042 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 3111;
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 22;
                            byte[] bArr6 = $$a;
                            byte b12 = bArr6[7];
                            Object[] objArr15 = new Object[1];
                            a(b12, bArr6[5], b12, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumDrawingCacheSize, iResolveOpacity, edgeSlop, -1269618118, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cNormalizeMetaState = (char) (43042 - KeyEvent.normalizeMetaState(0));
                            int i17 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3111;
                            int iArgb = 22 - Color.argb(0, 0, 0, 0);
                            byte[] bArr7 = $$a;
                            byte b13 = bArr7[7];
                            Object[] objArr16 = new Object[1];
                            a(b13, bArr7[40], b13, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, i17, iArgb, -1272852037, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr11;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i18 = ((int[]) objArr[1])[0];
            int i19 = ((int[]) objArr[2])[0];
            if (i19 != i18) {
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = (String[]) objArr[3];
                if (strArr2 != null) {
                    for (String str4 : strArr2) {
                        arrayList.add(str4);
                    }
                }
                throw new RuntimeException(String.valueOf(i19));
            }
            int i20 = TuitionPaymentFragmentbindingInflater1 + 93;
            b = i20 % 128;
            int i21 = i20 % 2;
            int i22 = ((int[]) objArr[0])[0];
            int i23 = ((int[]) objArr[2])[0];
            int i24 = ((int[]) objArr[1])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr2 = {i23};
            int iNextInt = new Random().nextInt(1715617973);
            int i25 = ~((-1555903185) | iNextInt);
            int i26 = ~iNextInt;
            int i27 = i22 + 1624994550 + ((i25 | (~(1560262354 | i26))) * (-406)) + ((~((-1411134081) | i26)) * (-406)) + (((~(iNextInt | (-149128275))) | (~(1555903184 | i26))) * 406);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            Object obj = new Object[]{new int[1], new int[]{i24}, iArr2, strArr3}[0];
            ((int[]) obj)[0] = i29 ^ (i29 << 5);
            int i30 = b + 95;
            TuitionPaymentFragmentbindingInflater1 = i30 % 128;
            int i31 = i30 % 2;
            int i32 = ((int[]) obj)[0];
            int i33 = i32 * i32;
            int i34 = -(363316494 * i32);
            int i35 = (((i33 & i34) + (i33 | i34)) - (~(-(i32 * 1672106148)))) - 1;
            int i36 = ((i35 | 184003569) << 1) - (184003569 ^ i35);
            int i37 = i36 >> 17;
            int i38 = (((-65535) ^ i37) + ((i37 & (-65535)) << 1)) / 32768;
            int i39 = ((i38 | 1) << 1) - (i38 ^ 1);
            int i40 = (i36 & i39) + (i39 | i36);
            int i41 = i36 >> 29;
            int i42 = (((i41 | (-15)) << 1) - (i41 ^ (-15))) / 8;
            int i43 = -(((i42 & 1) + (i42 | 1)) ^ i40);
            int i44 = (i43 ^ 9) + ((i43 & 9) << 1);
            int i45 = i44 >> 15;
            int i46 = ((((-262143) ^ i45) + ((i45 & (-262143)) << 1)) / 131072) + 1;
            if (i == 21654 / (((-((i46 & 1) + (i46 | 1))) & i44) * 1203) || i == 3) {
                return;
            }
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "");
            if (str != null) {
                StringBuilder sb = new StringBuilder("[");
                sb.append(str);
                sb.append("] ");
                string = sb.toString();
                if (string == null) {
                    i2 = TuitionPaymentFragmentbindingInflater1 + 25;
                    b = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i47 = 4 / 3;
                    }
                    string = "";
                }
            } else {
                i2 = TuitionPaymentFragmentbindingInflater1 + 25;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i48 = 4 / 3;
                }
                string = "";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(str2);
            firebaseCrashlytics.log(sb2.toString());
            if (th != null) {
                firebaseCrashlytics.recordException(th);
                return;
            }
            if (i == 6) {
                if (str != null) {
                    StringBuilder sb3 = new StringBuilder("[");
                    sb3.append(str);
                    sb3.append("] ");
                    String string2 = sb3.toString();
                    if (string2 != null) {
                        str3 = string2;
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str3);
                sb4.append(str2);
                firebaseCrashlytics.recordException(new Exception(sb4.toString()));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, byte r7, byte r8) {
            /*
                int r7 = r7 * 4
                int r7 = 3 - r7
                int r6 = r6 * 3
                int r6 = 1 - r6
                int r8 = r8 * 3
                int r8 = r8 + 109
                byte[] r0 = com.bpjstku.base.BpjstkuApplication.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r6
                r4 = r2
                goto L2c
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                int r7 = r7 + 1
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L26:
                r4 = r0[r7]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2c:
                int r8 = -r8
                int r8 = r8 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.base.BpjstkuApplication.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$g(byte, byte, byte):java.lang.String");
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -2038278096
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // com.nbs.nucleo.presentation.BaseApplication, androidx.multidex.MultiDexApplication, android.app.Application
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.base.BpjstkuApplication.onCreate():void");
    }

    @Override // com.nbs.nucleo.presentation.BaseApplication
    public final List<isLenovoTablet> TuitionPaymentFragmentbindingInflater1() {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            return super.TuitionPaymentFragmentbindingInflater1();
        }
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        List<isLenovoTablet> listListOf = CollectionsKt.listOf((Object[]) new isLenovoTablet[]{ApiModuleKt.b(), update.b(), MediaSessionCompatQueueItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getQueueId.b(), fromBundle.b(), getToken.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), isMitigated.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), l0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), PlaybackStateCompatApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), d0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), send.TuitionPaymentFragmentbindingInflater1(), getThreatUUID.TuitionPaymentFragmentbindingInflater1(), YExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), MExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(), MediaSessionCompatApi23Callback.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), PExternalSyntheticLambda12.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), ParcelableVolumeInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getLocalizedName.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), OExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), Q.b(), delete.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), g0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), o0ExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1(), OExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1(), getBase64.b(), needAbortCapture.b(), C0806l.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), MediaSessionCompatApi21.b(), k0ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), DExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), specify_simon.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), D.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), AExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1(), onReceive.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), J.TuitionPaymentFragmentbindingInflater1(), EExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getHumanThreatName.b(), onAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), onActivityResumed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), L.TuitionPaymentFragmentbindingInflater1(), getIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), getPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), IResultReceiver2Stub.TuitionPaymentFragmentbindingInflater1(), fromCustomAction.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), isSimulated.b(), VExternalSyntheticLambda1.b(), getCustomActions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), PlaybackStateCompat1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), MediaSessionCompatMediaSessionImplBase1.TuitionPaymentFragmentbindingInflater1(), X.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), onChange.TuitionPaymentFragmentspecialinlinedviewModeldefault1()});
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return listListOf;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0ac2  */
    @Override // com.nbs.nucleo.presentation.BaseApplication, androidx.multidex.MultiDexApplication, android.content.ContextWrapper
    public void attachBaseContext(Context p0) throws Throwable {
        Object[] objArr;
        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            super.attachBaseContext(p0);
            return;
        }
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        super.attachBaseContext(p0);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            int threadPriority = 1031 - ((Process.getThreadPriority(0) + 20) >> 6);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 15;
            byte[] bArr = $$a;
            byte b2 = bArr[0];
            byte b3 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b2, b3, (short) (b3 | 140), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, threadPriority, packedPositionGroup, 1357589585, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{27, '\r', 20, 11, 20, '\f', 18, 11, 23, 6, '\n', '\f', 23, 7, '\r', '\f', 18, 26, 30, 21, 1, 6}, (byte) (MotionEvent.axisFromString("") + 71), 22 - View.getDefaultSize(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{15, '#', 24, 31, 17, 23, 19, 17, '\r', 29, 30, 15, 20, 26, 13880}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 57), 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            char c = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            int size = View.MeasureSpec.getSize(0) + 1031;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 16;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[0];
            byte b5 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b4, b5, (short) (b5 | 88), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, size, iLastIndexOf, 1344079056, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                int i3 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
                byte b6 = (byte) ($$b & 53);
                byte b7 = $$a[0];
                Object[] objArr6 = new Object[1];
                a(b6, b7, (short) (b7 | 37), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, i3, longPressTimeout, 632103528, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i4 = ((int[]) objArr7[3])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i6 = ~(417750654 | startElapsedRealtime);
            int i7 = (((1909620834 + (((-452394879) | i6) * (-814))) + ((i6 | ((~((~startElapsedRealtime) | 173470484)) | 138826260)) * 407)) + (((~(startElapsedRealtime | (-173470485))) | ((~((-417750655) | startElapsedRealtime)) | 138826260)) * 407)) - 146540743;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{29, 26, 1, 26, '\t', 30, 27, '\r', 24, '\t', '\r', 22, 6, 17, 14, 23}, (byte) (3 - View.MeasureSpec.makeMeasureSpec(0, 0)), Color.rgb(0, 0, 0) + InputDeviceCompat.SOURCE_JOYSTICK, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{17, 20, '\f', 16, '\r', 15, '\r', 18, 1, 31, 6, 11, 30, 24, 29, 23}, (byte) (40 - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.lastIndexOf("", '0') + 17, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-1473784502};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 46038), 1135 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr11 = {Integer.valueOf(iIntValue), 0, -146540743, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).newInstance(objArr10), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1031;
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 15;
                    byte[] bArr3 = $$a;
                    byte b8 = bArr3[0];
                    byte b9 = bArr3[5];
                    Object[] objArr12 = new Object[1];
                    a(b8, b9, (short) (b9 | 140), objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, iResolveOpacity, maxKeyCode, 1298546779, false, (String) objArr12[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 1118, KeyEvent.getDeadChar(0, 0) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int i10 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1031;
                    int i11 = 16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b10 = (byte) ($$b & 53);
                    byte b11 = $$a[0];
                    Object[] objArr13 = new Object[1];
                    a(b10, b11, (short) (b11 | 37), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetAfter, i10, i11, 632103528, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{27, '\r', 20, 11, 20, '\f', 18, 11, 23, 6, '\n', '\f', 23, 7, '\r', '\f', 18, 26, 30, 21, 1, 6}, (byte) (Drawable.resolveOpacity(0, 0) + 70), TextUtils.lastIndexOf("", '0', 0, 0) + 23, objArr14);
                    Class<?> cls3 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{15, '#', 24, 31, 17, 23, 19, 17, '\r', 29, 30, 15, 20, 26, 13880}, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 57), 14 - MotionEvent.axisFromString(""), objArr15);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1032;
                        int iArgb = Color.argb(0, 0, 0, 0) + 15;
                        byte[] bArr4 = $$a;
                        byte b12 = bArr4[0];
                        byte b13 = bArr4[5];
                        Object[] objArr16 = new Object[1];
                        a(b12, b13, (short) (b13 | 88), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, packedPositionChild, iArgb, 1344079056, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int jumpTapTimeout = 1031 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i12 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        byte b14 = bArr5[0];
                        byte b15 = bArr5[5];
                        Object[] objArr17 = new Object[1];
                        a(b14, b15, (short) (b15 | 140), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(absoluteGravity, jumpTapTimeout, i12, 1357589585, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf2);
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[3])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[0];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                    if (i15 % 2 == 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 117;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        Object[] objArr18 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[3])[0];
        int i18 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[0];
        int i19 = ~(((int) Process.getStartUptimeMillis()) | 405583287);
        int i20 = i16 + ((((-296878075) | i19) * (-658)) - 1117292477) + ((i19 | (-431882240)) * 658);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        Object obj = objArr18[2];
        ((int[]) obj)[0] = i22 ^ (i22 << 5);
        ((Field) calculateSensorToBufferTransformMatrix.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{169580065, 848931981, 1419318289}, ((int[]) obj)[0], Integer.MAX_VALUE) - (-581446345));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char packedPositionChild2 = (char) (29943 - ExpandableListView.getPackedPositionChild(0L));
            int size2 = View.MeasureSpec.getSize(0) + 1755;
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23;
            byte b16 = $$a[5];
            Object[] objArr19 = new Object[1];
            a((byte) 15, b16, (short) (b16 | 36), objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(packedPositionChild2, size2, keyRepeatTimeout, 986134021, false, (String) objArr19[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).getLong(null);
        Object[] objArr20 = new Object[1];
        c(new char[]{27, '\r', 20, 11, 20, '\f', 18, 11, 23, 6, '\n', '\f', 23, 7, '\r', '\f', 18, 26, 30, 21, 1, 6}, (byte) (TextUtils.getTrimmedLength("") + 70), 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr20);
        Class<?> cls4 = Class.forName((String) objArr20[0]);
        Object[] objArr21 = new Object[1];
        c(new char[]{15, '#', 24, 31, 17, 23, 19, 17, '\r', 29, 30, 15, 20, 26, 13880}, (byte) (ImageFormat.getBitsPerPixel(0) + 58), 15 - TextUtils.getOffsetAfter("", 0), objArr21);
        long jLongValue3 = ((Long) cls4.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
            char cBlue = (char) (29944 - Color.blue(0));
            int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int mode = 23 - View.MeasureSpec.getMode(0);
            byte[] bArr6 = $$a;
            byte b17 = bArr6[0];
            Object[] objArr22 = new Object[1];
            a(b17, bArr6[5], b17, objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cBlue, maximumDrawingCacheSize, mode, 1596667560, false, (String) objArr22[0], null);
        }
        if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null) << 52) >>> 52)) >> 12)) {
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i23 % 128;
            int i24 = i23 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29944);
                int i25 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 24;
                byte[] bArr7 = $$a;
                byte b18 = bArr7[0];
                byte b19 = bArr7[5];
                Object[] objArr23 = new Object[1];
                a(b18, b19, (short) (b19 | 88), objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(tapTimeout, i25, bitsPerPixel, 1599039318, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).get(null);
            int i26 = ((int[]) objArr24[0])[0];
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = new Object[]{new int[]{i26}, new int[]{((int[]) objArr24[1])[0]}, (Object[]) objArr24[2], new int[1], (String[]) objArr24[4]};
            int i27 = ~(((int) Runtime.getRuntime().freeMemory()) | (-152945823));
            int i28 = (((-987170537) + (((-365548249) | i27) * (-220))) + ((i27 | 135529478) * 220)) - 98933424;
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0] = i30 ^ (i30 << 5);
        } else {
            Object[] objArr25 = new Object[1];
            c(new char[]{29, 26, 1, 26, '\t', 30, 27, '\r', 24, '\t', '\r', 22, 6, 17, 14, 23}, (byte) (2 - Process.getGidForName("")), MotionEvent.axisFromString("") + 17, objArr25);
            Class<?> cls5 = Class.forName((String) objArr25[0]);
            Object[] objArr26 = new Object[1];
            c(new char[]{17, 20, '\f', 16, '\r', 15, '\r', 18, 1, 31, 6, 11, 30, 24, 29, 23}, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 41), 15 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr26);
            int iIntValue2 = ((Integer) cls5.getMethod((String) objArr26[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr27 = {-1625224358};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 42049), 1726 - TextUtils.getOffsetAfter("", 0), 29 - View.getDefaultSize(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113 = PointDataStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).newInstance(objArr27), 1564211154, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                int i31 = 1756 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                byte[] bArr8 = $$a;
                byte b20 = bArr8[0];
                byte b21 = bArr8[5];
                Object[] objArr28 = new Object[1];
                a(b20, b21, (short) (b21 | 88), objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, i31, doubleTapTimeout, 1599039318, false, (String) objArr28[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113);
            try {
                Object[] objArr29 = new Object[1];
                c(new char[]{27, '\r', 20, 11, 20, '\f', 18, 11, 23, 6, '\n', '\f', 23, 7, '\r', '\f', 18, 26, 30, 21, 1, 6}, (byte) (70 - Color.argb(0, 0, 0, 0)), 22 - (ViewConfiguration.getTouchSlop() >> 8), objArr29);
                Class<?> cls6 = Class.forName((String) objArr29[0]);
                Object[] objArr30 = new Object[1];
                c(new char[]{15, '#', 24, 31, 17, 23, 19, 17, '\r', 29, 30, 15, 20, 26, 13880}, (byte) (View.MeasureSpec.getSize(0) + 57), 15 - TextUtils.indexOf("", ""), objArr30);
                long jLongValue4 = ((Long) cls6.getDeclaredMethod((String) objArr30[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue4);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c4 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29944);
                    int windowTouchSlop = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i32 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                    byte[] bArr9 = $$a;
                    byte b22 = bArr9[0];
                    Object[] objArr31 = new Object[1];
                    a(b22, bArr9[5], b22, objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c4, windowTouchSlop, i32, 1596667560, false, (String) objArr31[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char c5 = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 29944);
                    int windowTouchSlop2 = 1755 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24;
                    byte b23 = $$a[5];
                    Object[] objArr32 = new Object[1];
                    a((byte) 15, b23, (short) (b23 | 36), objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c5, windowTouchSlop2, iIndexOf, 986134021, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf4);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0] != ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr4 = (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4];
            if (strArr4 == null) {
                throw null;
            }
            while (i2 < strArr4.length) {
                int i33 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i33 % 128;
                if (i33 % 2 != 0) {
                    arrayList2.add(strArr4[i2]);
                    i2 += 15;
                } else {
                    arrayList2.add(strArr4[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i34 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[3])[0];
        int i35 = ((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[0])[0];
        Object[] objArr33 = {new int[]{i35}, new int[]{((int[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i36 = i34 + 1377287565 + (((~(35797022 | iIdentityHashCode)) | (-248399449)) * (-948)) + ((~((~iIdentityHashCode) | (-214713921))) * (-948)) + 1261171736;
        int i37 = (i36 << 13) ^ i36;
        int i38 = i37 ^ (i37 >>> 17);
        Object obj2 = objArr33[3];
        ((int[]) obj2)[0] = i38 ^ (i38 << 5);
        ((Field) CameraUseCaseAdapter.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1225354054, 1865336677, 79510584}, ((int[]) obj2)[0], Integer.MAX_VALUE) - (-1482417302));
        Object[] objArr34 = new Object[1];
        c(new char[]{29, 26, 1, 26, '\t', 30, 27, '\r', 24, '\t', 4, 11, 11, 14, 29, 19}, (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 25), 16 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr34);
        Class<?> cls7 = Class.forName((String) objArr34[0]);
        Object[] objArr35 = new Object[1];
        c(new char[]{3, 6, 13808, 13808, '\f', 16, 17, 0, 11, '\t', '\r', 29, 13830}, (byte) (8 - Color.green(0)), ((Process.getThreadPriority(0) + 20) >> 6) + 13, objArr35);
        Thread thread = (Thread) cls7.getMethod((String) objArr35[0], new Class[0]).invoke(null, new Object[0]);
        Object[] objArr36 = new Object[1];
        c(new char[]{29, 26, 1, 26, '\t', 30, 27, '\r', 24, '\t', 4, 11, 11, 14, 29, 19}, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 25), TextUtils.lastIndexOf("", '0', 0) + 17, objArr36);
        Class<?> cls8 = Class.forName((String) objArr36[0]);
        Object[] objArr37 = new Object[1];
        c(new char[]{29, 15, '\r', 17, '\r', 24, 1, 6, 2, 11, 24, 1, 13935}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 112), 13 - (ViewConfiguration.getEdgeSlop() >> 16), objArr37);
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) cls8.getMethod((String) objArr37[0], new Class[0]).invoke(thread, new Object[0]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(378973440);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43042);
            int i39 = 3112 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int absoluteGravity2 = 22 - Gravity.getAbsoluteGravity(0, 0);
            byte b24 = (byte) ($$b & 53);
            byte b25 = $$a[0];
            Object[] objArr38 = new Object[1];
            a(b24, b25, (short) (b25 | 37), objArr38);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(jumpTapTimeout2, i39, absoluteGravity2, -234353961, false, (String) objArr38[0], new Class[0]);
        }
        Object[] objArr39 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, null);
        Object[] objArr40 = new Object[1];
        c(new char[]{29, 26, 1, 26, '\t', 30, 27, '\r', 24, '\t', 17, '\r', 24, 1, 11, 1, 7, 26, 5, '\f', 3, Typography.quote, 14, 23, '\f', 16, 13875}, (byte) (69 - KeyEvent.getDeadChar(0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 26, objArr40);
        Class<?> cls9 = Class.forName((String) objArr40[0]);
        Object[] objArr41 = new Object[1];
        c(new char[]{29, 15, 18, 30, 31, 27, 13827, 13827, 19, 28, 23, 14}, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27), TextUtils.lastIndexOf("", '0', 0) + 13, objArr41);
        Method method = cls9.getMethod((String) objArr41[0], new Class[0]);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char c6 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22877);
            int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 594;
            int i40 = 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr10 = $$a;
            byte b26 = bArr10[0];
            byte b27 = bArr10[5];
            Object[] objArr42 = new Object[1];
            a(b26, b27, (short) (b27 | 140), objArr42);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c6, iIndexOf2, i40, -1471475267, false, (String) objArr42[0], null);
        }
        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).setInt(null, 0);
        int length = stackTraceElementArr.length;
        int i41 = 0;
        while (true) {
            if (i41 < length) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i41];
                int length2 = objArr39.length;
                int i42 = 0;
                while (true) {
                    if (i42 < length2) {
                        int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i43 % 128;
                        if (i43 % 2 == 0) {
                            if (objArr39[i42].equals((String) method.invoke(stackTraceElement, new Object[1]))) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char c7 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22877);
                                    int iResolveSizeAndState = 594 - View.resolveSizeAndState(0, 0, 0);
                                    int iResolveOpacity2 = 17 - Drawable.resolveOpacity(0, 0);
                                    byte[] bArr11 = $$a;
                                    byte b28 = bArr11[0];
                                    byte b29 = bArr11[5];
                                    Object[] objArr43 = new Object[1];
                                    a(b28, b29, (short) (b29 | 140), objArr43);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c7, iResolveSizeAndState, iResolveOpacity2, -1471475267, false, (String) objArr43[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).setInt(null, 1);
                            } else {
                                i42++;
                            }
                        } else if (!objArr39[i42].equals((String) method.invoke(stackTraceElement, new Object[0]))) {
                            i42++;
                        } else {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1289074282);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c8 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22877);
                                int iResolveSizeAndState2 = 594 - View.resolveSizeAndState(0, 0, 0);
                                int iResolveOpacity3 = 17 - Drawable.resolveOpacity(0, 0);
                                byte[] bArr12 = $$a;
                                byte b210 = bArr12[0];
                                byte b211 = bArr12[5];
                                Object[] objArr44 = new Object[1];
                                a(b210, b211, (short) (b211 | 140), objArr44);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c8, iResolveSizeAndState2, iResolveOpacity3, -1471475267, false, (String) objArr44[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).setInt(null, 1);
                        }
                    } else {
                        i41++;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "") + 43042);
                int size3 = View.MeasureSpec.getSize(0) + 3111;
                int tapTimeout2 = 22 - (ViewConfiguration.getTapTimeout() >> 16);
                byte[] bArr13 = $$a;
                byte b30 = bArr13[0];
                byte b31 = bArr13[5];
                Object[] objArr45 = new Object[1];
                a(b30, b31, (short) (b31 | 140), objArr45);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cIndexOf, size3, tapTimeout2, -1272852037, false, (String) objArr45[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, -1L);
            MultiDex.install(this);
            return;
        }
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i5 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int i6 = $11 + 69;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 109;
                $10 = i9 % 128;
                if (i9 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 + 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.red(0), 2267 - TextUtils.indexOf("", ""), 33 - Color.blue(0), -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 2267 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 33, -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8++;
                }
                i3 = 2;
                i5 = 1770390596;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b7 = (byte) 0;
            byte b8 = (byte) (b7 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myTid() >> 22), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2267, View.MeasureSpec.getMode(0) + 33, -1927765101, false, $$g(b7, b8, (byte) (b8 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i10 = $11 + 93;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                i2 = i + 72;
                cArr4[i2] = (char) (cArr[i2] >> b2);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i11 = $11 + 55;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i13 = $11 + 33;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = (byte) (b9 + 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (49267 - View.combineMeasuredStates(0, 0)), TextUtils.lastIndexOf("", '0') + 3262, 30 - TextUtils.indexOf("", ""), -127612708, false, $$g(b9, b10, (byte) (b10 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        try {
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b11 = (byte) 0;
                                byte b12 = b11;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 22878), ((Process.getThreadPriority(0) + 20) >> 6) + 594, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, 1570859318, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i16 = $11 + 19;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                        } else {
                            int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                int i22 = $10 + 121;
                $11 = i22 % 128;
                int i23 = i22 % 2;
                obj2 = obj;
            }
        }
        int i24 = 0;
        while (i24 < i) {
            int i25 = $11 + 55;
            int i26 = i25 % 128;
            $10 = i26;
            int i27 = i25 % 2;
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
            i24++;
            int i28 = i26 + 19;
            $11 = i28 % 128;
            int i29 = i28 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.nbs.nucleo.presentation.BaseApplication
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Throwable {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            return;
        }
        int i = 2 % 2;
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        try {
            ProviderInstaller.installIfNeeded(getApplicationContext());
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            Intrinsics.checkNotNullExpressionValue(sSLContext, "");
            Object[] objArr = new Object[1];
            c(new char[]{29, 26, 1, 26, '\t', 30, 27, '\r', 24, '\t', '\r', 22, 6, 17, 14, 23}, (byte) (3 - TextUtils.indexOf("", "")), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 99, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(new char[]{17, 20, '\f', 16, '\r', 15, '\r', 18, 1, 31, 6, 11, 30, 24, 29, 23}, (byte) (39 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr2);
            int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], Object.class).invoke(null, this)).intValue();
            if (TimePickerTextInputPresenter.AnonymousClass2.b(new ArrayList()) != 0) {
                throw new RuntimeException(String.valueOf(iIntValue));
            }
            sSLContext.init(null, null, null);
            sSLContext.createSSLEngine();
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
        } catch (GooglePlayServicesNotAvailableException e2) {
            e2.printStackTrace();
        } catch (GooglePlayServicesRepairableException e3) {
            e3.printStackTrace();
        } catch (KeyManagementException e4) {
            e4.printStackTrace();
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
        }
    }

    static {
        if (computeCropRectFromAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            return;
        }
        $10 = 0;
        $11 = 1;
        $$a = new byte[]{0, -94, -62, -97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        $$b = 254;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        b = new char[]{60056, 59748, 60045, 59749, 60094, 60079, 60117, 60048, 60041, 60046, 60051, 60040, 60047, 60073, 60050, 60053, 60072, 60062, 60052, 60034, 60054, 59747, 60085, 60063, 60088, 60058, 60061, 60060, 60049, 60059, 60043, 60083, 59746, 60055, 59745, 59744};
        TuitionPaymentFragmentbindingInflater1 = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = com.bpjstku.base.BpjstkuApplication.$$c
            int r8 = r8 * 2
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r7 = 116 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + 1
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.base.BpjstkuApplication.$$g(byte, int, byte):java.lang.String");
    }
}

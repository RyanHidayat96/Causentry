package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetFileDescriptor;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class setMinimumLoggingLevel<Data> implements getSchedulerHandler<Uri, Data> {
    private static final Set<String> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", FirebaseAnalytics.Param.CONTENT, "android.resource")));
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault2<Data> TuitionPaymentFragmentbindingInflater1;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2<Data> {
        isUseCasesCombinationSupportedByFramework<Data> b(Uri uri);
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(Uri uri, int i, int i2, getTargetRotation gettargetrotation) {
        Uri uri2 = uri;
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1(new setResolutionSelector(uri2), this.TuitionPaymentFragmentbindingInflater1.b(uri2));
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Uri uri) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1.contains(uri.getScheme());
    }

    public setMinimumLoggingLevel(TuitionPaymentFragmentspecialinlinedviewModeldefault2<Data> tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getDeviceSurfaceManagerProvider<Uri, InputStream>, TuitionPaymentFragmentspecialinlinedviewModeldefault2<InputStream> {
        private final ContentResolver TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(ContentResolver contentResolver) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = contentResolver;
        }

        @Override // setMinimumLoggingLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final isUseCasesCombinationSupportedByFramework<InputStream> b(Uri uri) {
            return new CameraEffectTransformations(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, uri);
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Uri, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new setMinimumLoggingLevel(this);
        }
    }

    public static class TuitionPaymentFragmentbindingInflater1 implements getDeviceSurfaceManagerProvider<Uri, ParcelFileDescriptor>, TuitionPaymentFragmentspecialinlinedviewModeldefault2<ParcelFileDescriptor> {
        private static short[] asBinder;
        private final ContentResolver TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static final byte[] $$c = {80, -8, 43, 65};
        private static final int $$f = 158;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {12, 11, -9, -106, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 60, -4, -4, -5, 8, -73, 50, 9, -5, -3, -1, -4, -67, 66, -18, 4, -5, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -20, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -68};
        private static final int $$e = 140;
        private static final byte[] $$a = {101, 89, 94, -73, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
        private static final int $$b = 245;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1374a = 0;
        private static int d = 1;
        private static int b = -1361675601;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -1934795529;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1975672712;
        private static byte[] TuitionPaymentFragmentbindingInflater1 = {44, 80, 35, 13, 126, 44, 85, 37, 90, 14, 1, -101, 32, -27, 106, 91, 90, 89, 54, 94, 41, -83, -79, -82, -67, -72, -87, ByteCompanionObject.MIN_VALUE, -89, -76, -93, -80, -124, -82, -68, -110, -117, -126, -99, 99, -86, -112, -102, -126, -104, ByteCompanionObject.MIN_VALUE, 100, 117, 98, -55, -105, 102, 66, -35, -118, -115, -120, -103, -127, -104, 49, 56, 43, 13, 48, 52, 51, 50, 62, -31, 67, 56, 7, 45, 62, 51, 12, 70, 111, ByteCompanionObject.MAX_VALUE, 116, 88, 91, -71, 119, 67, 107, 48, -125, 101, 75, 105, -74, -94, -99, -52, -94, -121, -114, -8, -78, -68, -94, -77, -66, -74, -84, -26, -26, -26, -26, -26, -26};

        private static void c(short s, byte b2, int i, Object[] objArr) {
            int i2 = 84 - (b2 * 3);
            int i3 = i * 15;
            int i4 = 92 - s;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i3 + 38];
            int i5 = i3 + 37;
            int i6 = -1;
            if (bArr == null) {
                i2 = (i5 + (-i2)) - 11;
                i6 = -1;
            }
            while (true) {
                i4++;
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i2;
                if (i7 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i2 = (i2 + (-bArr[i4])) - 11;
                    i6 = i7;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = setMinimumLoggingLevel.TuitionPaymentFragmentbindingInflater1.$$d
                int r8 = r8 * 15
                int r8 = r8 + 84
                int r7 = r7 * 38
                int r7 = 42 - r7
                int r6 = r6 * 14
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
            L1a:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L30:
                int r3 = r3 + r7
                int r7 = r8 + 1
                int r8 = r3 + 3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: setMinimumLoggingLevel.TuitionPaymentFragmentbindingInflater1.f(short, byte, byte, java.lang.Object[]):void");
        }

        public TuitionPaymentFragmentbindingInflater1(ContentResolver contentResolver) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = contentResolver;
        }

        @Override // setMinimumLoggingLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final isUseCasesCombinationSupportedByFramework<ParcelFileDescriptor> b(Uri uri) {
            int i = 2 % 2;
            getSurfaceProcessor getsurfaceprocessor = new getSurfaceProcessor(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, uri);
            int i2 = d + 27;
            f1374a = i2 % 128;
            int i3 = i2 % 2;
            return getsurfaceprocessor;
        }

        private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            int i4;
            boolean z;
            int i5 = 2;
            int i6 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i7 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2266;
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
                    byte length = (byte) $$c.length;
                    byte b3 = (byte) (length - 4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i7, scrollBarFadeDuration, 1387473586, false, $$g(length, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i8 = $10 + 77;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    byte[] bArr = TuitionPaymentFragmentbindingInflater1;
                    if (bArr != null) {
                        int i10 = $10 + 119;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        int length2 = bArr.length;
                        byte[] bArr2 = new byte[length2];
                        int i12 = 0;
                        while (i12 < length2) {
                            int i13 = $10 + 59;
                            $11 = i13 % 128;
                            int i14 = i13 % i5;
                            Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 3359 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.getTrimmedLength("") + 18, -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr2[i12] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i12++;
                            i5 = 2;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = TuitionPaymentFragmentbindingInflater1;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(b)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int iMyPid = (Process.myPid() >> 22) + 2267;
                            int iAlpha = 33 - Color.alpha(0);
                            byte length3 = (byte) $$c.length;
                            byte b6 = (byte) (length3 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, iMyPid, iAlpha, 1387473586, false, $$g(length3, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    } else {
                        iIntValue = (short) (((short) (((long) asBinder[i3 + ((int) (((long) b) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) b) ^ 3046761265686732006L)) + i4;
                    try {
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b7 = (byte) 3;
                            byte b8 = (byte) (b7 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getCapsMode("", 0, 0) + 55904), 2903 - AndroidCharacter.getMirror('0'), 13 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1529949196, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = TuitionPaymentFragmentbindingInflater1;
                        if (bArr4 != null) {
                            int length4 = bArr4.length;
                            byte[] bArr5 = new byte[length4];
                            for (int i15 = 0; i15 < length4; i15++) {
                                bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 3046761265686732006L);
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            int i16 = $10 + 7;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            if (z) {
                                byte[] bArr6 = TuitionPaymentFragmentbindingInflater1;
                                int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                            } else {
                                short[] sArr = asBinder;
                                int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                            }
                            sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
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

        /* JADX WARN: Code duplicated, block: B:26:0x026c  */
        /* JADX WARN: Code duplicated, block: B:27:0x026e  */
        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Uri, ParcelFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                byte[] bArr = $$a;
                byte b2 = bArr[1];
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iRgb, minimumFlingVelocity, -1650998592, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e((-110165053) - Color.red(0), Color.green(0) + 5, (short) (62 - TextUtils.getCapsMode("", 0, 0)), (byte) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 578496073, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(TextUtils.getOffsetAfter("", 0) - 110165049, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 2, (short) ((-84) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (-578496052) - View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                int iAlpha = Color.alpha(0) + 876;
                int maximumDrawingCacheSize = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte b4 = (byte) ($$b & 62);
                byte[] bArr2 = $$a;
                Object[] objArr5 = new Object[1];
                c(b4, bArr2[7], bArr2[5], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mirror, iAlpha, maximumDrawingCacheSize, 2012020043, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "");
                    int iMyPid = 876 - (Process.myPid() >> 22);
                    int size = 10 - View.MeasureSpec.getSize(0);
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    c(b5, b5, bArr3[5], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iMyPid, size, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int i2 = ~((int) Process.getStartUptimeMillis());
                int i3 = 1765436166 + ((~((-86411657) | i2)) * (-783)) + (((~(i2 | (-88054233))) | (-128364462)) * 783) + 384786560;
                int i4 = (i3 << 13) ^ i3;
                int i5 = i4 ^ (i4 >>> 17);
                ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e((-110165054) - TextUtils.lastIndexOf("", '0', 0, 0), 9 - ExpandableListView.getPackedPositionGroup(0L), (short) (ExpandableListView.getPackedPositionChild(0L) - 112), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getSize(0) - 578496038, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e((-110165051) - KeyEvent.getDeadChar(0, 0), View.resolveSizeAndState(0, 0, 0) + 1, (short) (TextUtils.indexOf("", "", 0) + 40), (byte) ((-1) - Process.getGidForName("")), View.combineMeasuredStates(0, 0) - 578496013, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i6 = f1374a + 103;
                        d = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 83 / 0;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                e((-110165044) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.getTrimmedLength("") - 1, (short) (104 - Color.alpha(0)), (byte) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) - 578495995, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 110165045, TextUtils.indexOf("", "", 0) - 1, (short) (65505 - AndroidCharacter.getMirror('0')), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 578495982, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i8 = d + 63;
                f1374a = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 384786560};
                    byte[] bArr4 = $$d;
                    byte b6 = (byte) (-bArr4[24]);
                    byte b7 = b6;
                    Object[] objArr13 = new Object[1];
                    f(b6, b7, b7, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b8 = (byte) (bArr4[24] + 1);
                    byte b9 = b8;
                    Object[] objArr14 = new Object[1];
                    f(b8, b9, b9, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cMyTid = (char) (Process.myTid() >> 22);
                            int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 876;
                            int minimumFlingVelocity3 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[7];
                            Object[] objArr16 = new Object[1];
                            c(b10, b10, bArr5[5], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyTid, minimumFlingVelocity2, minimumFlingVelocity3, 2012931276, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            e((-110165053) - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 5, (short) (62 - View.MeasureSpec.getMode(0)), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (-578496073) - (ViewConfiguration.getTapTimeout() >> 16), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            e(TextUtils.lastIndexOf("", '0') - 110165048, (-2) - (ViewConfiguration.getTouchSlop() >> 8), (short) ((ViewConfiguration.getJumpTapTimeout() >> 16) - 83), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 578496052, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                                int keyRepeatTimeout = 876 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                int iIndexOf = 10 - TextUtils.indexOf("", "", 0, 0);
                                byte b11 = (byte) ($$b & 62);
                                byte[] bArr6 = $$a;
                                Object[] objArr19 = new Object[1];
                                c(b11, bArr6[7], bArr6[5], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, keyRepeatTimeout, iIndexOf, 2012020043, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cIndexOf3 = (char) TextUtils.indexOf("", "", 0);
                                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 876;
                                int i10 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                byte[] bArr7 = $$a;
                                byte b12 = bArr7[1];
                                byte b13 = bArr7[7];
                                Object[] objArr20 = new Object[1];
                                c(b12, b13, b13, objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf3, iIndexOf2, i10, -1650998592, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
                throw null;
            }
            int i11 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i12 = ~iIdentityHashCode;
            int i13 = (-868597916) + (((~((-932068732) | i12)) | 42473561 | (~(891758502 | i12)) | (~((-2163333) | iIdentityHashCode))) * (-84));
            int i14 = (~(iIdentityHashCode | 891758502)) | 932068731;
            int i15 = ~(i12 | (-891758503));
            int i16 = i11 + i13 + ((i14 | i15) * (-84)) + ((2163332 | i15) * 84);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr21[1])[0] = i18 ^ (i18 << 5);
            setMinimumLoggingLevel setminimumlogginglevel = new setMinimumLoggingLevel(this);
            int i19 = f1374a + 87;
            d = i19 % 128;
            int i20 = i19 % 2;
            return setminimumlogginglevel;
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
        private static java.lang.String $$g(byte r7, int r8, byte r9) {
            /*
                int r7 = 121 - r7
                int r9 = r9 * 3
                int r9 = r9 + 1
                byte[] r0 = setMinimumLoggingLevel.TuitionPaymentFragmentbindingInflater1.$$c
                int r8 = r8 * 4
                int r8 = 3 - r8
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L15
                r7 = r8
                r3 = r9
                r4 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L23:
                int r8 = r8 + 1
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r6
            L2a:
                int r8 = r8 + r3
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: setMinimumLoggingLevel.TuitionPaymentFragmentbindingInflater1.$$g(byte, int, byte):java.lang.String");
        }
    }

    public static final class b implements getDeviceSurfaceManagerProvider<Uri, AssetFileDescriptor>, TuitionPaymentFragmentspecialinlinedviewModeldefault2<AssetFileDescriptor> {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final ContentResolver TuitionPaymentFragmentbindingInflater1;

        public b(ContentResolver contentResolver) {
            this.TuitionPaymentFragmentbindingInflater1 = contentResolver;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Uri, AssetFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new setMinimumLoggingLevel(this);
        }

        @Override // setMinimumLoggingLevel.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final isUseCasesCombinationSupportedByFramework<AssetFileDescriptor> b(Uri uri) {
            return new CameraControlOperationCanceledException(this.TuitionPaymentFragmentbindingInflater1, uri);
        }

        public static int TuitionPaymentFragmentbindingInflater1() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = i % 6980983;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenLayout;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
            return i3;
        }
    }
}

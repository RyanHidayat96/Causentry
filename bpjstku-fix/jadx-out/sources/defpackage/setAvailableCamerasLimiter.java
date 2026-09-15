package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Random;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class setAvailableCamerasLimiter<Data> implements getSchedulerHandler<Integer, Data> {
    private final getSchedulerHandler<Uri, Data> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Resources TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.getSchedulerHandler
    public final /* bridge */ /* synthetic */ getSchedulerHandler.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(Integer num, int i, int i2, getTargetRotation gettargetrotation) {
        Uri uriTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(num);
        if (uriTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return null;
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(uriTuitionPaymentFragmentspecialinlinedviewModeldefault2, i, i2, gettargetrotation);
    }

    @Override // defpackage.getSchedulerHandler
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Integer num) {
        return true;
    }

    public setAvailableCamerasLimiter(Resources resources, getSchedulerHandler<Uri, Data> getschedulerhandler) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = resources;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getschedulerhandler;
    }

    private Uri TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer num) {
        try {
            StringBuilder sb = new StringBuilder("android.resource://");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getResourcePackageName(num.intValue()));
            sb.append('/');
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getResourceTypeName(num.intValue()));
            sb.append('/');
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getResourceEntryName(num.intValue()));
            return Uri.parse(sb.toString());
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Objects.toString(num);
            return null;
        }
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getDeviceSurfaceManagerProvider<Integer, InputStream> {
        private final Resources TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Resources resources) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = resources;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Integer, InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new setAvailableCamerasLimiter(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, setcameraexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Uri.class, InputStream.class));
        }
    }

    public static final class b implements getDeviceSurfaceManagerProvider<Integer, AssetFileDescriptor> {
        private final Resources b;
        private static final byte[] $$c = {58, 66, -14, -31};
        private static final int $$f = 27;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {57, -50, -56, -93, -15, -1, 60, -55, -17, 3, -12, -4, 6, -13, 68, -69, -5, 10, -17, 11, -12, -9, 16, -22, 8, -9, -2, Base64.padSymbol, -74, -2, 8, -6, 59, -40, -21, -16, -5, 16, -13, 7, -16, 20, -17, 0, -23, 10, 1, -21, 51, -37, -20, 8, -16, 10, -14, -8, 82, -82, 0, 8, -1, -9, 5, -14, 69, -3, -72, -8, -1, 0, -8, 6, -2, Base64.padSymbol, -72, -8, 1, 2, -1, -20, 77, -67, -4, -4, 2, -23, 6, -11, 77, -16, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, -2, 0, 8, -1, -9, 5, -14, 0, -8, -1, 0, -8, 6, -2, -21, 10, 1, -21, 39, -37, 8, -4, -10, 5, -4, -4, 2, -23, 6, -11, 62};
        private static final int $$e = 88;
        private static final byte[] $$a = {99, -43, -44, -62, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
        private static final int $$b = 219;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {45565, 49374, 21408, 57962, 30019, 33833, 5872, 43398, 14483, 19299, 55818, 27947, 65525, 3795, 33152, 4205, 41777, 12851, 17640, 55223, 26255, 63851, 45561, 49372, 21413, 57960, 30047, 33829, 5872, 43514, 14489, 19313, 55880, 27916, 65509, 3789, 33169, 45565, 49374, 21408, 57962, 30019, 33833, 5872, 43398, 14493, 19296, 55892, 27990, 65485, 3779, 33152, 4193, 41770, 12825, 17648, 55201, 26296, 63848, 2086, 39693, 11741, 48308, 45567, 49349, 21430, 57962, 30025, 33838, 5856, 43497, 14476, 19296, 55880, 27921, 65519, 3777, 33152, 4193, 41779, 12830, 47194, 51581, 23070, 60373, 31918, 36224, 8025, 41066, 12599, 17042, 54235, 25773, 63059, 1912, 34877, 6601, 57020, 44957, 15592, 36159, 6673, 60256, 31145, 50840, 22525, 9272, 46366, 601, 36998, 24966, 61145, 32548};
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2546670907270742192L;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 15
                int r0 = 53 - r8
                byte[] r1 = setAvailableCamerasLimiter.b.$$a
                int r7 = r7 * 2
                int r7 = 84 - r7
                int r6 = 92 - r6
                byte[] r0 = new byte[r0]
                int r8 = 52 - r8
                r2 = 0
                if (r1 != 0) goto L17
                r3 = r7
                r4 = r2
                r7 = r6
                goto L30
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r6 = r6 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r1[r6]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L30:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: setAvailableCamerasLimiter.b.a(int, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = setAvailableCamerasLimiter.b.$$d
                int r6 = r6 * 15
                int r6 = 99 - r6
                int r8 = r8 * 86
                int r8 = 90 - r8
                int r7 = r7 * 34
                int r1 = r7 + 53
                byte[] r1 = new byte[r1]
                int r7 = r7 + 52
                r2 = 0
                if (r0 != 0) goto L19
                r6 = r7
                r3 = r8
                r4 = r2
                goto L2e
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r5
            L2e:
                int r8 = -r8
                int r6 = r6 + r8
                int r8 = r3 + 1
                int r6 = r6 + (-3)
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: setAvailableCamerasLimiter.b.d(short, short, int, java.lang.Object[]):void");
        }

        private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = $10 + 117;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i >>> i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), 2187 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, 841711447, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 33017), ((Process.getThreadPriority(0) + 20) >> 6) + 3011, TextUtils.indexOf("", "", 0) + 26, 321985076, false, $$g(b3, b4, (byte) (b4 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.rgb(0, 0, 0) + 16813721), TextUtils.indexOf((CharSequence) "", '0') + 3377, (Process.myTid() >> 22) + 17, -968507904, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
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
                    int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.rgb(0, 0, 0) + 16777216), 2187 - KeyEvent.normalizeMetaState(0), View.MeasureSpec.getMode(0) + 40, 841711447, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (View.getDefaultSize(0, 0) + 33017), 3011 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), 321985076, false, $$g(b9, b10, (byte) (b10 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36506 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 3376 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getTouchSlop() >> 8) + 17, -968507904, false, $$g(b11, b12, (byte) (b12 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i7 = $10 + 13;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i9 = $10 + 119;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - Color.argb(0, 0, 0, 0)), 3376 - TextUtils.getOffsetBefore("", 0), 17 - TextUtils.getTrimmedLength(""), -968507904, false, $$g(b13, b14, (byte) (b14 + 1)), new Class[]{Object.class, Object.class});
                    }
                    Object obj = null;
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                    obj.hashCode();
                    throw null;
                }
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (36505 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 3376, 17 - (Process.myPid() >> 22), -968507904, false, $$g(b15, b16, (byte) (b16 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
            }
            objArr[0] = new String(cArr);
        }

        public b(Resources resources) {
            this.b = resources;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0217  */
        /* JADX WARN: Code duplicated, block: B:27:0x0221  */
        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Integer, AssetFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Resources resources = this.b;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b = (byte) ($$b & 381);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(b, bArr[7], bArr[5], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, scrollBarFadeDuration, maxKeyCode, -1650998592, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, 22 - Color.red(0), (char) Color.blue(0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(22 - View.resolveSize(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, (char) ((-1) - Process.getGidForName("")), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i2 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                int scrollBarFadeDuration2 = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b2 = $$a[7];
                Object[] objArr5 = new Object[1];
                a((byte) 52, b2, b2, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, i2, scrollBarFadeDuration2, 2012020043, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iAxisFromString = MotionEvent.axisFromString("") + 877;
                    int mirror = AndroidCharacter.getMirror('0') - '&';
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr6 = new Object[1];
                    a(b3, b4, b4, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, iAxisFromString, mirror, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i3 = ~iIdentityHashCode;
                int i4 = (((1854270488 + (((~(367582570 | i3)) | 407892799) * (-90))) + (((~(367582570 | iIdentityHashCode)) | 94374976) * (-45))) + ((((~(iIdentityHashCode | (-407892800))) | 367582570) | (~(i3 | 407892799))) * 45)) - 1305835331;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(37 - Color.blue(0), 26 - View.getDefaultSize(0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(TextUtils.indexOf((CharSequence) "", '0', 0) + 64, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
                    TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 14 / 0;
                        if (applicationContext instanceof ContextWrapper) {
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = null;
                            }
                        }
                    } else if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                    applicationContext = applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(81 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, (char) (TextUtils.lastIndexOf("", '0') + 2477), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(96 - TextUtils.lastIndexOf("", '0', 0, 0), Drawable.resolveOpacity(0, 0) + 16, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 28489), objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i9 = TuitionPaymentFragmentbindingInflater1 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1305835331};
                    byte[] bArr2 = $$d;
                    byte b5 = bArr2[43];
                    byte b6 = bArr2[46];
                    Object[] objArr13 = new Object[1];
                    d(b5, b6, b6, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr2[46];
                    byte b8 = bArr2[43];
                    Object[] objArr14 = new Object[1];
                    d(b7, b8, b8, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                            int iGreen = Color.green(0) + 876;
                            int i11 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            byte b9 = $$a[7];
                            byte b10 = b9;
                            Object[] objArr16 = new Object[1];
                            a(b9, b10, b10, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(modifierMetaStateMask, iGreen, i11, 2012931276, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 21 - TextUtils.lastIndexOf("", '0'), (char) View.resolveSize(0, 0), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(AndroidCharacter.getMirror('0') - 26, 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                int gidForName = 875 - Process.getGidForName("");
                                int packedPositionType = 10 - ExpandableListView.getPackedPositionType(0L);
                                byte b11 = $$a[7];
                                Object[] objArr19 = new Object[1];
                                a((byte) 52, b11, b11, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, gidForName, packedPositionType, 2012020043, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(0);
                                int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                byte b12 = (byte) ($$b & 381);
                                byte[] bArr3 = $$a;
                                Object[] objArr20 = new Object[1];
                                a(b12, bArr3[7], bArr3[5], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, bitsPerPixel, keyRepeatTimeout, -1650998592, false, (String) objArr20[0], null);
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
            int i12 = ((int[]) objArr[2])[0];
            int i13 = ((int[]) objArr[0])[0];
            if (i13 == i12) {
                int i14 = ((int[]) objArr[1])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iNextInt = new Random().nextInt();
                int i15 = i14 + 1182444344 + (((~(iNextInt | 639516717)) | 599206488) * (-668)) + ((639516717 | (~(599206488 | iNextInt))) * 1336) + ((iNextInt | 666856061) * 668);
                int i16 = (i15 << 13) ^ i15;
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr21[1])[0] = i17 ^ (i17 << 5);
            } else {
                int[] iArr = new int[i13];
                int i18 = i13 - 1;
                iArr[i18] = 1;
                Toast.makeText((Context) null, iArr[((i13 * i18) % 2) - 1], 1).show();
                int i19 = ((int[]) objArr[1])[0];
                Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iNextInt2 = new Random().nextInt();
                int i20 = ~((-827559122) | (~iNextInt2));
                int i21 = i19 + (((((-1073741566) | i20) | (~(827559121 | iNextInt2))) * (-338)) - 2107086216) + (((~(iNextInt2 | (-246182445))) | i20) * 338);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr22[1])[0] = i23 ^ (i23 << 5);
            }
            setAvailableCamerasLimiter setavailablecameraslimiter = new setAvailableCamerasLimiter(resources, setcameraexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Uri.class, AssetFileDescriptor.class));
            int i24 = TuitionPaymentFragmentbindingInflater1 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
            if (i24 % 2 == 0) {
                return setavailablecameraslimiter;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, byte r7, byte r8) {
            /*
                byte[] r0 = setAvailableCamerasLimiter.b.$$c
                int r7 = r7 * 2
                int r7 = 3 - r7
                int r8 = r8 * 3
                int r8 = r8 + 109
                int r6 = r6 * 2
                int r1 = r6 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2f
            L16:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L1a:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                int r3 = r3 + 1
                int r8 = r8 + 1
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2f:
                int r8 = -r8
                int r7 = r7 + r8
                r8 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: setAvailableCamerasLimiter.b.$$g(short, byte, byte):java.lang.String");
        }
    }

    public static class TuitionPaymentFragmentbindingInflater1 implements getDeviceSurfaceManagerProvider<Integer, Uri> {
        private final Resources b;

        public TuitionPaymentFragmentbindingInflater1(Resources resources) {
            this.b = resources;
        }

        @Override // defpackage.getDeviceSurfaceManagerProvider
        public final getSchedulerHandler<Integer, Uri> TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCameraExecutor setcameraexecutor) {
            return new setAvailableCamerasLimiter(this.b, setCameraOpenRetryMaxTimeoutInMillisWhileResuming.TuitionPaymentFragmentbindingInflater1());
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdasetCallback3androidxcameravideointernalaudioBufferedAudioStream<T, U> extends notifySuspended<T, T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<U> b;

    public lambdasetCallback3androidxcameravideointernalaudioBufferedAudioStream(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy2) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = autoValue_VideoValidatedEncoderProfilesProxy2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        ExcludeStretchedVideoQualityQuirk excludeStretchedVideoQualityQuirk = new ExcludeStretchedVideoQualityQuirk(derivemediatype);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable();
        excludeStretchedVideoQualityQuirk.onSubscribe(arrayCompositeDisposable);
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(excludeStretchedVideoQualityQuirk, arrayCompositeDisposable);
        this.b.subscribe(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(arrayCompositeDisposable, tuitionPaymentFragmentbindingInflater1, excludeStretchedVideoQualityQuirk));
        this.TuitionPaymentFragmentbindingInflater1.subscribe(tuitionPaymentFragmentbindingInflater1);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentbindingInflater1<T> implements deriveMediaType<T> {
        volatile boolean TuitionPaymentFragmentbindingInflater1;
        private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private ArrayCompositeDisposable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private BufferProviderState b;
        private static final byte[] $$c = {97, 58, 103, -72};
        private static final int $$f = 33;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {58, 66, -1, 15, -6, 19, -29, 31, -13, -33, 31, 19, -13, -34, 46, 7, -6, -9, -63, 63};
        private static final int $$e = 97;
        private static final byte[] $$a = {123, -2, -101, -104, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$b = 56;
        private static int asInterface = 0;
        private static int asBinder = 1;
        private static int[] g = {1329326262, -2085625784, 1194204971, 1657294888, -488907661, 1839638540, -617634069, 1748646847, -1384200019, -931443934, 1595478307, -150839707, 1452020696, -136133964, 677904388, -117237125, -1601914854, -816116602};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = lambdasetCallback3androidxcameravideointernalaudioBufferedAudioStream.TuitionPaymentFragmentbindingInflater1.$$a
                int r7 = 103 - r7
                int r6 = r6 * 52
                int r6 = 56 - r6
                int r8 = r8 * 52
                int r1 = 53 - r8
                byte[] r1 = new byte[r1]
                int r8 = 52 - r8
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r4 = r2
                r7 = r6
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L2d:
                int r3 = r3 + r6
                int r6 = r7 + 1
                int r7 = r3 + (-11)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdasetCallback3androidxcameravideointernalaudioBufferedAudioStream.TuitionPaymentFragmentbindingInflater1.a(short, int, int, java.lang.Object[]):void");
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
        private static void d(byte r5, byte r6, int r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 16
                int r6 = 20 - r6
                int r7 = r7 * 6
                int r7 = 104 - r7
                int r5 = r5 * 16
                int r5 = r5 + 1
                byte[] r0 = lambdasetCallback3androidxcameravideointernalaudioBufferedAudioStream.TuitionPaymentFragmentbindingInflater1.$$d
                byte[] r1 = new byte[r5]
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r6
                r3 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                r4 = r0[r6]
            L28:
                int r6 = r6 + 1
                int r7 = r7 + r4
                int r7 = r7 + (-1)
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdasetCallback3androidxcameravideointernalaudioBufferedAudioStream.TuitionPaymentFragmentbindingInflater1.d(byte, byte, int, java.lang.Object[]):void");
        }

        TuitionPaymentFragmentbindingInflater1(deriveMediaType<? super T> derivemediatype, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arrayCompositeDisposable;
        }

        private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int length;
            int[] iArr2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = g;
            int i4 = -1870535734;
            float f = 0.0f;
            int i5 = 1;
            int i6 = 0;
            if (iArr3 != null) {
                int i7 = $11 + 75;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i9 = 0;
                while (i9 < length2) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = Integer.valueOf(iArr3[i9]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) i6;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0')), 3291 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), 31 - KeyEvent.normalizeMetaState(i6), 1948206109, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        iArr4[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i9++;
                        i4 = -1870535734;
                        f = 0.0f;
                        i6 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = g;
            if (iArr6 != null) {
                int i10 = $11 + 67;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                }
                int i11 = 0;
                while (i11 < length) {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr6[i11]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 3291 - (ViewConfiguration.getFadingEdgeLength() >> 16), 31 - (ViewConfiguration.getTapTimeout() >> 16), 1948206109, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    iArr2[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i11++;
                    iArr6 = iArr6;
                    i5 = 1;
                }
                int i12 = $11 + 89;
                $10 = i12 % 128;
                i2 = 2;
                int i13 = i12 % 2;
                iArr6 = iArr2;
            } else {
                i2 = 2;
            }
            System.arraycopy(iArr6, 0, iArr5, 0, length3);
            sessionConfigValidatingBuilder.b = i2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                int i14 = $10 + 17;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                for (int i16 = 17; i16 > 1; i16--) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i16];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2559;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29;
                        byte b5 = (byte) ($$f & 7);
                        byte b6 = (byte) (b5 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, maximumFlingVelocity, minimumFlingVelocity, 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                }
                int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr5 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-16748337) - Color.rgb(0, 0, 0)), 348 - View.resolveSizeAndState(0, 0, 0), 25 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
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

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int mode = View.MeasureSpec.getMode(0) + 876;
                int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
                byte b = $$a[5];
                byte b2 = (byte) (-b);
                Object[] objArr2 = new Object[1];
                a(b2, (byte) (b2 + 4), (byte) (-b), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maxKeyCode, mode, absoluteGravity, 252381699, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new int[]{1548452784, 70774333, -1633159590, -742818613, 2119080174, 585455403, 2129554386, -1515261410, 1220288619, 1157185435, -944822935, -906206054, -38357514, 752533821}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new int[]{1017850032, -1493411041, 35368301, 316506218, -1276855233, -830362541, 1173174714, 1665733110, 1737224062, 915739140}, Color.blue(0) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
                int iMyPid = 10 - (Process.myPid() >> 22);
                byte[] bArr = $$a;
                Object[] objArr5 = new Object[1];
                a((byte) (-bArr[5]), bArr[54], bArr[7], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, packedPositionGroup, iMyPid, 2009631821, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                    int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 10;
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[7];
                    Object[] objArr6 = new Object[1];
                    a(b3, b3, (byte) (-bArr2[5]), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, iResolveOpacity, packedPositionGroup2, 256017550, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i2 = ~startUptimeMillis;
                int i3 = (-1745040520) + (((~(655399527 | i2)) | (~((-100665924) | startUptimeMillis))) * (-831)) + ((~(796375679 | startUptimeMillis)) * (-1662)) + (((~(startUptimeMillis | (-655399528))) | (~(i2 | (-695709757))) | (~(695709756 | startUptimeMillis))) * 831) + 617485876;
                int i4 = (i3 << 13) ^ i3;
                int i5 = i4 ^ (i4 >>> 17);
                ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new int[]{-1679528689, 1800785576, 1241683378, 280991202, 1027862327, 2127885149, -1779290127, 423841970, 2112596724, -261615422, 1112134365, 975488705, 637791929, -320155935, 1769178020, -1541176017}, ImageFormat.getBitsPerPixel(0) + 27, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new int[]{811496123, -2027231621, 1002790375, 936389445, 131827784, -665820657, -1258589993, -2132549261, 847693368, 297662215, 1226168449, 638753698}, 18 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i6 = asBinder + 99;
                    asInterface = i6 % 128;
                    if (i6 % 2 != 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        obj.hashCode();
                        throw null;
                    }
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(new int[]{-1157725729, 1829623188, -1471747710, -1621123429, 801719226, -1979604889, -280708158, -1672756741, 666064142, -830907035}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new int[]{1083536951, -127335725, -1958950394, -583455018, -1724870582, -729489953, 1595200712, -627303727, -905466957, -1487430476}, 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 617485876};
                    byte[] bArr3 = $$d;
                    byte b4 = (byte) (-bArr3[2]);
                    byte b5 = b4;
                    Object[] objArr13 = new Object[1];
                    d(b4, b5, (byte) (b5 - 1), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[2];
                    byte b7 = (byte) (b6 + 1);
                    Object[] objArr14 = new Object[1];
                    d(b7, b7, (byte) (-b6), objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i7 = asBinder + 95;
                        asInterface = i7 % 128;
                        int i8 = i7 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int i9 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int iMyPid2 = (Process.myPid() >> 22) + 10;
                            byte[] bArr4 = $$a;
                            byte b8 = bArr4[7];
                            Object[] objArr16 = new Object[1];
                            a(b8, b8, (byte) (-bArr4[5]), objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup3, i9, iMyPid2, 256017550, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new int[]{1548452784, 70774333, -1633159590, -742818613, 2119080174, 585455403, 2129554386, -1515261410, 1220288619, 1157185435, -944822935, -906206054, -38357514, 752533821}, 21 - TextUtils.lastIndexOf("", '0'), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new int[]{1017850032, -1493411041, 35368301, 316506218, -1276855233, -830362541, 1173174714, 1665733110, 1737224062, 915739140}, 15 - Gravity.getAbsoluteGravity(0, 0), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                int i10 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                                byte[] bArr5 = $$a;
                                byte b9 = (byte) (-bArr5[5]);
                                byte b10 = bArr5[54];
                                byte b11 = bArr5[7];
                                Object[] objArr19 = new Object[1];
                                a(b9, b10, b11, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, i10, iResolveSizeAndState, 2009631821, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                int i11 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 875;
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 11;
                                byte b12 = $$a[5];
                                byte b13 = (byte) (-b12);
                                Object[] objArr20 = new Object[1];
                                a(b13, (byte) (b13 + 4), (byte) (-b12), objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, i11, iIndexOf, 252381699, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i12 = asBinder + 17;
                            asInterface = i12 % 128;
                            int i13 = i12 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[0])[0];
            if (i15 != i14) {
                throw new RuntimeException(String.valueOf(i15));
            }
            int i16 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i17 = ~System.identityHashCode(this);
            int i18 = i16 + (-2136816076) + ((401439599 | i17) * 184) + (((~(i17 | 357323075)) | 128543277) * 184);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
            if (DisposableHelper.b(this.b, bufferProviderState)) {
                this.b = bufferProviderState;
                ArrayCompositeDisposable arrayCompositeDisposable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i21 = ((int[]) objArr21[1])[0];
                int i22 = i21 * i21;
                int i23 = -(596857262 * i21);
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                int i25 = -(i21 * (-1311565502));
                int i26 = (i24 & i25) + (i25 | i24);
                int i27 = (i26 & 821749824) + (821749824 | i26);
                int i28 = ((i27 >> 29) - 15) / 8;
                int i29 = (i28 ^ 1) + ((i28 & 1) << 1);
                int i30 = (i27 ^ i29) + ((i29 & i27) << 1);
                int i31 = i27 >> 23;
                int i32 = ((i31 ^ (-1023)) + ((i31 & (-1023)) << 1)) / 512;
                int i33 = -(i30 ^ (((i32 | 1) << 1) - (i32 ^ 1)));
                int i34 = ((i33 | 1) << 1) - (i33 ^ 1);
                int i35 = i34 >> 21;
                int i36 = (((i35 ^ (-4095)) + ((i35 & (-4095)) << 1)) / 2048) + 1;
                arrayCompositeDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0 / (((-((i36 & 1) + (i36 | 1))) & i34) * 259), bufferProviderState);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            int i = 2 % 2;
            int i2 = asInterface + 71;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(t);
                return;
            }
            if (this.TuitionPaymentFragmentbindingInflater1) {
                int i4 = asInterface + 69;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onNext(t);
                int i6 = asBinder + 9;
                asInterface = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 % 5;
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            int i = 2 % 2;
            int i2 = asInterface + 105;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
                int i3 = 59 / 0;
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = asBinder + 99;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onComplete();
            int i4 = asInterface + 11;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, short r7, short r8) {
            /*
                int r7 = r7 * 2
                int r0 = 1 - r7
                int r8 = r8 * 3
                int r8 = 4 - r8
                int r6 = r6 * 56
                int r6 = r6 + 66
                byte[] r1 = lambdasetCallback3androidxcameravideointernalaudioBufferedAudioStream.TuitionPaymentFragmentbindingInflater1.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L19
                r4 = r7
                r6 = r8
                r3 = r2
                goto L2c
            L19:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L1d:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L28:
                int r3 = r3 + 1
                r4 = r1[r6]
            L2c:
                int r8 = r8 + r4
                int r6 = r6 + 1
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: lambdasetCallback3androidxcameravideointernalaudioBufferedAudioStream.TuitionPaymentFragmentbindingInflater1.$$g(short, short, short):java.lang.String");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements deriveMediaType<U> {
        private ArrayCompositeDisposable TuitionPaymentFragmentbindingInflater1;
        private ExcludeStretchedVideoQualityQuirk<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private TuitionPaymentFragmentbindingInflater1<T> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ArrayCompositeDisposable arrayCompositeDisposable, TuitionPaymentFragmentbindingInflater1<T> tuitionPaymentFragmentbindingInflater1, ExcludeStretchedVideoQualityQuirk<T> excludeStretchedVideoQualityQuirk) {
            this.TuitionPaymentFragmentbindingInflater1 = arrayCompositeDisposable;
            this.b = tuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = excludeStretchedVideoQualityQuirk;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) throws Throwable {
            if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bufferProviderState)) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bufferProviderState;
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1, bufferProviderState);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(U u) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
            this.b.TuitionPaymentFragmentbindingInflater1 = true;
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1.dispose();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onError(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.b.TuitionPaymentFragmentbindingInflater1 = true;
        }
    }
}

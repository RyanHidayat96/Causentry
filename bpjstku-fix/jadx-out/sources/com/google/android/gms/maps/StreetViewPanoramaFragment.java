package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bpjstku.databinding.ActivityLoginBinding;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.ExifData;
import defpackage.ExifSpeed;
import defpackage.attachTimestamp;
import defpackage.calculateSuggestedStreamSpecs;
import defpackage.copyToCroppedImage;
import defpackage.createExtraImageCapture;
import defpackage.createString;
import defpackage.fromMilesPerHour;
import defpackage.getByteOrder;
import defpackage.guessDataFormat;
import defpackage.initSession;
import defpackage.initialValue;
import defpackage.isFlippedVertically;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.onCaptureSessionStart;
import defpackage.toMetersPerSecond;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public class StreetViewPanoramaFragment extends Fragment {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;
    private final zzap zza = new zzap(this);
    private static final byte[] $$c = {113, 29, -123, -97};
    private static final int $$f = 47;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 53 - r5
            int r6 = r6 + 84
            byte[] r1 = com.google.android.gms.maps.StreetViewPanoramaFragment.$$a
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r1[r7]
            int r3 = r3 + 1
        L26:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaFragment.c(short, int, int, java.lang.Object[]):void");
    }

    private static void d(byte b2, short s, int i, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = 461 - s;
        int i3 = 107 - b2;
        byte[] bArr2 = new byte[i + 38];
        int i4 = i + 37;
        int i5 = -1;
        if (bArr == null) {
            i3 += -i2;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i2 + 1;
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i3 += -bArr[i6];
                i2 = i6;
                i5 = i7;
            }
        }
    }

    public static StreetViewPanoramaFragment newInstance() {
        int i = 2 % 2;
        StreetViewPanoramaFragment streetViewPanoramaFragment = new StreetViewPanoramaFragment();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return streetViewPanoramaFragment;
        }
        throw null;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttach(activity);
            zzap.zza(this.zza, activity);
        } else {
            super.onAttach(activity);
            zzap.zza(this.zza, activity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
            Preconditions.checkNotNull(onStreetViewPanoramaReadyCallback, "callback must not be null.");
            this.zza.zzb(onStreetViewPanoramaReadyCallback);
            int i3 = 15 / 0;
        } else {
            Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
            Preconditions.checkNotNull(onStreetViewPanoramaReadyCallback, "callback must not be null.");
            this.zza.zzb(onStreetViewPanoramaReadyCallback);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[DONT_INVERT, PHI: r1
  0x0021: PHI (r1v5 java.lang.ClassLoader) = (r1v4 java.lang.ClassLoader), (r1v7 java.lang.ClassLoader) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        ClassLoader classLoader;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            classLoader = StreetViewPanoramaFragment.class.getClassLoader();
            int i3 = 71 / 0;
            if (bundle != null) {
                if (classLoader != null) {
                    bundle.setClassLoader(classLoader);
                }
            }
        } else {
            classLoader = StreetViewPanoramaFragment.class.getClassLoader();
            if (bundle != null) {
                if (classLoader != null) {
                    bundle.setClassLoader(classLoader);
                }
            }
        }
        super.onActivityCreated(bundle);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i4 = $10 + 43;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i6])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), 2187 - (ViewConfiguration.getWindowTouchSlop() >> 8), 40 - TextUtils.indexOf("", "", 0, 0), 841711447, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 3011, TextUtils.indexOf((CharSequence) "", '0', 0) + 27, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - Color.blue(0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3376, 18 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36505), 3375 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, -968507904, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            int i7 = $10 + 71;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:190:0x141b  */
    /* JADX WARN: Code duplicated, block: B:193:0x1425  */
    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        String str;
        String str2;
        Object[] objArr2;
        Object[] objArr3;
        char c;
        int i;
        Object[] objArr4;
        int i2;
        Object[] objArr5;
        char c2;
        char c3;
        Object[] objArr6;
        String str3;
        Object[] objArr7;
        char c4;
        Object[] objArr8;
        char c5;
        char c6;
        Object[] objArr9;
        Object[] objArr10;
        Object[] objArr11;
        String str4;
        Object[] objArr12;
        Object[] objArr13;
        String str5;
        Object[] objArr14;
        Object[] objArr15;
        char c7;
        int i3 = 2 % 2;
        Object[] objArr16 = new Object[1];
        a((ViewConfiguration.getPressedStateDuration() >> 16) + 76, 22 - TextUtils.indexOf("", "", 0, 0), (char) ((Process.myPid() >> 22) + 44110), objArr16);
        String str6 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        a(TextUtils.getTrimmedLength("") + 98, TextUtils.getOffsetAfter("", 0) + 15, (char) (TextUtils.getOffsetAfter("", 0) + 36116), objArr17);
        String str7 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        a(View.MeasureSpec.getSize(0) + 44, (ViewConfiguration.getPressedStateDuration() >> 16) + 16, (char) (17089 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr18);
        String str8 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        a(60 - (Process.myTid() >> 22), (ViewConfiguration.getEdgeSlop() >> 16) + 16, (char) TextUtils.indexOf("", "", 0), objArr19);
        String str9 = (String) objArr19[0];
        Object[] objArr20 = new Object[1];
        a(TextUtils.getOffsetBefore("", 0), 26 - Color.red(0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 9546), objArr20);
        String str10 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        a(26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - TextUtils.lastIndexOf("", '0'), (char) (63523 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr21);
        String str11 = (String) objArr21[0];
        int i4 = ((Field) calculateSuggestedStreamSpecs.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        int i5 = ~iIdentityHashCode;
        if (i4 != 475278640 + (((~(983915325 | i5)) | 153927782) * (-90)) + (((~(983915325 | iIdentityHashCode)) | 847321881) * (-45)) + ((983915325 | (~((-153927783) | iIdentityHashCode)) | (~(i5 | 153927782))) * 45)) {
            throw new RuntimeException("-1196082159");
        }
        int i6 = ((Field) createExtraImageCapture.TuitionPaymentFragmentbindingInflater1[0]).getInt(null);
        int i7 = ~System.identityHashCode(this);
        if (i6 != (-171539076) + ((~(2109030362 | i7)) * 52) + (((~(490020762 | i7)) | (~((-2089035203) | i7)) | 1619009600) * (-52)) + (((~(i7 | (-490020763))) | 19995160) * 52)) {
            int i8 = 1504584656 % 2;
            throw new ArithmeticException();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 53893);
            int bitsPerPixel = 1319 - ImageFormat.getBitsPerPixel(0);
            int packedPositionGroup = 36 - ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr22 = new Object[1];
            c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, bitsPerPixel, packedPositionGroup, -1433084963, false, (String) objArr22[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 53893);
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1320;
                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 36;
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr23 = new Object[1];
                c(b2, b2, bArr[5], objArr23);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, absoluteGravity, iKeyCodeFromString, -1920778747, false, (String) objArr23[0], null);
            }
            Object[] objArr24 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null);
            objArr = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i9 = ((int[]) objArr24[0])[0];
            int i10 = ((int[]) objArr24[3])[0];
            String[] strArr = (String[]) objArr24[2];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i11 = ~(557827554 | iIdentityHashCode2);
            int i12 = ((((-1632206954) + ((272635916 | i11) * (-814))) + ((i11 | ((~((~iIdentityHashCode2) | (-812800271))) | 17663200)) * 407)) + (((~(iIdentityHashCode2 | 812800270)) | ((~((-557827555) | iIdentityHashCode2)) | 17663200)) * 407)) - 1432723192;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[1])[0] = i14 ^ (i14 << 5);
            str9 = str9;
        } else {
            Context applicationContext = (Context) Class.forName(str10).getMethod(str11, new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15 % 128;
                int i16 = i15 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            int iIntValue = ((Integer) Class.forName(str8).getMethod(str9, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr25 = {-1979940108};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 47977), 1299 - TextUtils.indexOf((CharSequence) "", '0'), 20 - TextUtils.indexOf("", "", 0, 0), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr26 = {applicationContext, "com.bpjstku", -1432723192, Integer.valueOf(iIntValue), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr25), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetAfter = (char) (53893 - TextUtils.getOffsetAfter("", 0));
                    int i17 = 1320 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iAlpha = 36 - Color.alpha(0);
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[7];
                    Object[] objArr27 = new Object[1];
                    c(b3, b3, bArr2[5], objArr27);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter, i17, iAlpha, 819724799, false, (String) objArr27[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 57878), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1394, 75 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Boolean.TYPE});
                }
                Object[] objArr28 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr26);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char absoluteGravity2 = (char) (Gravity.getAbsoluteGravity(0, 0) + 53893);
                        int jumpTapTimeout = 1320 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int doubleTapTimeout = 36 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[7];
                        Object[] objArr29 = new Object[1];
                        c(b4, b4, bArr3[5], objArr29);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity2, jumpTapTimeout, doubleTapTimeout, -1920778747, false, (String) objArr29[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr28);
                    try {
                        long jLongValue = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char pressedStateDuration2 = (char) (53893 - (ViewConfiguration.getPressedStateDuration() >> 16));
                            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1320;
                            int i18 = 36 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            byte[] bArr4 = $$a;
                            byte b5 = (byte) (bArr4[33] - 1);
                            byte b6 = bArr4[7];
                            Object[] objArr30 = new Object[1];
                            c(b5, b6, (short) (b6 | 51), objArr30);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(pressedStateDuration2, doubleTapTimeout2, i18, -1273706634, false, (String) objArr30[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char c8 = (char) (53893 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            int i19 = 1320 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i20 = 37 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            Object[] objArr31 = new Object[1];
                            c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr31);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c8, i19, i20, -1433084963, false, (String) objArr31[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    str9 = str9;
                    objArr28 = objArr28;
                }
                objArr = objArr28;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[3])[0]) {
            throw null;
        }
        Object[] objArr32 = {new int[]{i}, new int[1], strArr, new int[]{i}};
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[0])[0];
        int i23 = ((int[]) objArr[3])[0];
        String[] strArr2 = (String[]) objArr[2];
        int i24 = ~System.identityHashCode(this);
        int i25 = i21 + (-532047486) + (((~((-534786744) | i24)) | (-835841082)) * (-983)) + (((~(i24 | (-835841082))) | 538037256) * 983);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        Object obj = objArr32[1];
        ((int[]) obj)[0] = i27 ^ (i27 << 5);
        ((Field) guessDataFormat.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1245085018, 1892332524, 911756857}, ((int[]) obj)[0], Integer.MAX_VALUE) + 1949163076);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int i28 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 11;
            byte[] bArr5 = $$a;
            byte b7 = (byte) (bArr5[33] - 1);
            byte b8 = bArr5[7];
            Object[] objArr33 = new Object[1];
            c(b7, b8, (short) (b8 | 51), objArr33);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(size, i28, iIndexOf, -1650998592, false, (String) objArr33[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        long jLongValue2 = ((Long) Class.forName(str6).getDeclaredMethod(str7, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int i29 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int iBlue = Color.blue(0) + 10;
            byte[] bArr6 = $$a;
            byte b9 = bArr6[7];
            Object[] objArr34 = new Object[1];
            c(b9, b9, bArr6[5], objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maxKeyCode, i29, iBlue, 2012020043, false, (String) objArr34[0], null);
        }
        if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                int iAxisFromString = MotionEvent.axisFromString("") + 11;
                byte b10 = $$a[7];
                byte b11 = b10;
                Object[] objArr35 = new Object[1];
                c(b10, b11, (short) (b11 | 88), objArr35);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(trimmedLength, iResolveOpacity, iAxisFromString, 2012931276, false, (String) objArr35[0], null);
            }
            Object[] objArr36 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null);
            objArr2 = new Object[]{new int[]{((int[]) objArr36[0])[0]}, new int[1], new int[]{((int[]) objArr36[2])[0]}, (String[]) objArr36[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i30 = 1153572500 + (((~((-753789430) | iIdentityHashCode3)) | 74000853 | (~(713479200 | iIdentityHashCode3))) * (-880));
            int i31 = (~((-753789430) | (~iIdentityHashCode3))) | (-713479201);
            int i32 = ~(iIdentityHashCode3 | 753789429);
            int i33 = i30 + ((i31 | i32) * (-880)) + (i32 * 880) + 1588554837;
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr2[1])[0] = i35 ^ (i35 << 5);
            str11 = str11;
            str = str9;
            str2 = str7;
        } else {
            Context applicationContext2 = (Context) Class.forName(str10).getMethod(str11, new Class[0]).invoke(null, null);
            if (applicationContext2 != null) {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : applicationContext2.getApplicationContext();
            }
            str = str9;
            try {
                Object[] objArr37 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue()), 0, 1588554837};
                byte[] bArr7 = $$d;
                Object[] objArr38 = new Object[1];
                d(bArr7[38], (short) 458, bArr7[23], objArr38);
                Class<?> cls = Class.forName((String) objArr38[0]);
                Object[] objArr39 = new Object[1];
                d(bArr7[38], (short) 417, bArr7[24], objArr39);
                Object[] objArr40 = (Object[]) cls.getMethod((String) objArr39[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr37);
                if (applicationContext2 != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                        char c9 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i36 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                        int scrollBarFadeDuration = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr41 = new Object[1];
                        c(b12, b13, (short) (b13 | 88), objArr41);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c9, i36, scrollBarFadeDuration, 2012931276, false, (String) objArr41[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, objArr40);
                    try {
                        str2 = str7;
                        long jLongValue3 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf3 = Long.valueOf(jLongValue3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iIndexOf2 = TextUtils.indexOf("", "") + 876;
                            int iBlue2 = 10 - Color.blue(0);
                            byte[] bArr8 = $$a;
                            byte b14 = bArr8[7];
                            Object[] objArr42 = new Object[1];
                            c(b14, b14, bArr8[5], objArr42);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(jumpTapTimeout2, iIndexOf2, iBlue2, 2012020043, false, (String) objArr42[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf3);
                        Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int iRgb = Color.rgb(0, 0, 0) + 16778092;
                            int i37 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte[] bArr9 = $$a;
                            byte b15 = (byte) (bArr9[33] - 1);
                            byte b16 = bArr9[7];
                            Object[] objArr43 = new Object[1];
                            c(b15, b16, (short) (b16 | 51), objArr43);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(edgeSlop, iRgb, i37, -1650998592, false, (String) objArr43[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, lValueOf4);
                    } catch (Exception unused2) {
                        throw new RuntimeException();
                    }
                } else {
                    str11 = str11;
                    str2 = str7;
                    objArr40 = objArr40;
                }
                objArr2 = objArr40;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i38 = ((int[]) objArr2[2])[0];
        int i39 = ((int[]) objArr2[0])[0];
        if (i39 == i38) {
            int i40 = ((int[]) objArr2[1])[0];
            objArr3 = new Object[]{new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i41 = ~iMaxMemory;
            int i42 = i40 + 1854270488 + (((~(959570898 | i41)) | 999881127) * (-90)) + (((~(959570898 | iMaxMemory)) | 2163280) * (-45)) + (((~(iMaxMemory | (-999881128))) | 959570898 | (~(i41 | 999881127))) * 45);
            int i43 = (i42 << 13) ^ i42;
            int i44 = i43 ^ (i43 >>> 17);
            ((int[]) objArr3[1])[0] = i44 ^ (i44 << 5);
            i = 0;
            c = 1;
        } else {
            Toast.makeText((Context) null, i39 / (((i39 - 1) * i39) % 2), 0).show();
            int i45 = ((int[]) objArr2[1])[0];
            objArr3 = new Object[]{new int[]{((int[]) objArr2[0])[0]}, new int[1], new int[]{((int[]) objArr2[2])[0]}, (String[]) objArr2[3]};
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i46 = ~iFreeMemory;
            int i47 = i45 + 400299292 + (((~(4507738 | i46)) | (~((-44817968) | iFreeMemory))) * 1900) + (((~(i46 | 44817967)) | (~(iFreeMemory | (-4507739)))) * (-950)) + (((~(iFreeMemory | 44817967)) | (~(i46 | (-4507739)))) * 950);
            int i48 = i47 ^ (i47 << 13);
            int i49 = i48 ^ (i48 >>> 17);
            c = 1;
            i = 0;
            ((int[]) objArr3[1])[0] = i49 ^ (i49 << 5);
        }
        ((Field) getByteOrder.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{2076302133, 1651276446, 1466628830}, ((int[]) objArr3[c])[i], Integer.MAX_VALUE) - (-820654613));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
            char offsetAfter2 = (char) TextUtils.getOffsetAfter("", i);
            int iGreen = 651 - Color.green(i);
            int iMyPid = 44 - (Process.myPid() >> 22);
            byte b17 = $$a[7];
            byte b18 = b17;
            Object[] objArr44 = new Object[1];
            c(b17, b18, (short) (b18 | 140), objArr44);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetAfter2, iGreen, iMyPid, -459846511, false, (String) objArr44[0], null);
        }
        long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).getLong(null);
        long jLongValue4 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 651;
            int bitsPerPixel2 = 43 - ImageFormat.getBitsPerPixel(0);
            Object[] objArr45 = new Object[1];
            c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr45);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cLastIndexOf, longPressTimeout, bitsPerPixel2, -873460649, false, (String) objArr45[0], null);
        }
        if (j2 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char c10 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 651;
                int iIndexOf3 = 44 - TextUtils.indexOf("", "");
                byte[] bArr10 = $$a;
                byte b19 = (byte) (bArr10[33] - 1);
                byte b20 = bArr10[7];
                Object[] objArr46 = new Object[1];
                c(b19, b20, (short) (b20 | 51), objArr46);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(c10, edgeSlop2, iIndexOf3, -1595579076, false, (String) objArr46[0], null);
            }
            Object[] objArr47 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).get(null);
            objArr4 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i50 = ((int[]) objArr47[2])[0];
            int i51 = ((int[]) objArr47[0])[0];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i52 = ((((-358156215) + (((~((-9734571) | (~iIdentityHashCode4))) | (~((-6303761) | iIdentityHashCode4))) * (-272))) + (((~((-1066897387) | iIdentityHashCode4)) | 1057162816) * (-272))) + (((~(iIdentityHashCode4 | 1066897386)) | (-1063466577)) * 272)) - 1947298383;
            int i53 = (i52 << 13) ^ i52;
            int i54 = i53 ^ (i53 >>> 17);
            ((int[]) objArr4[3])[0] = i54 ^ (i54 << 5);
            i2 = 0;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1610, 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr48 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).newInstance(null), -1947298383, 0};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                int iMakeMeasureSpec = 44 - View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr49 = new Object[1];
                c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr49);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cCombineMeasuredStates, maxKeyCode2, iMakeMeasureSpec, 2075921419, false, (String) objArr49[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 696, 99 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getEdgeSlop() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 793, (ViewConfiguration.getEdgeSlop() >> 16) + 83), Integer.TYPE, Integer.TYPE});
            }
            objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr48);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                int iRgb2 = (-16776565) - Color.rgb(0, 0, 0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 45;
                byte[] bArr11 = $$a;
                byte b21 = (byte) (bArr11[33] - 1);
                byte b22 = bArr11[7];
                Object[] objArr50 = new Object[1];
                c(b21, b22, (short) (b22 | 51), objArr50);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(packedPositionChild, iRgb2, iLastIndexOf, -1595579076, false, (String) objArr50[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr4);
            try {
                long jLongValue5 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue5);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 651;
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 44;
                    Object[] objArr51 = new Object[1];
                    c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr51);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cResolveSizeAndState, scrollDefaultDelay, offsetBefore, -873460649, false, (String) objArr51[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue5 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char c11 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 652;
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44;
                    byte b23 = $$a[7];
                    byte b24 = b23;
                    Object[] objArr52 = new Object[1];
                    c(b23, b24, (short) (b24 | 140), objArr52);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c11, packedPositionChild2, maximumFlingVelocity, -459846511, false, (String) objArr52[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf6);
                i2 = 0;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i55 = ((int[]) objArr4[i2])[i2];
        int i56 = ((int[]) objArr4[2])[i2];
        if (i56 == i55) {
            objArr5 = new Object[4];
            int[] iArr = new int[1];
            objArr5[i2] = iArr;
            int[] iArr2 = new int[1];
            objArr5[2] = iArr2;
            objArr5[3] = new int[1];
            int i57 = ((int[]) objArr4[3])[i2];
            int i58 = ((int[]) objArr4[2])[i2];
            int i59 = ((int[]) objArr4[i2])[i2];
            iArr2[i2] = i58;
            iArr[i2] = i59;
            objArr5[1] = new String[i2];
            int i60 = ~System.identityHashCode(this);
            int i61 = i57 + (-446189383) + (((~(i60 | 217568869)) | 10378) * (-160)) + (((~(i60 | 214138059)) | 217568869) * 160);
            int i62 = (i61 << 13) ^ i61;
            int i63 = i62 ^ (i62 >>> 17);
            ((int[]) objArr5[3])[0] = i63 ^ (i63 << 5);
            c3 = 0;
            c2 = 3;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr4[1];
            if (strArr3 != null) {
                for (String str12 : strArr3) {
                    arrayList.add(str12);
                }
            }
            int[] iArr3 = new int[i56];
            int i64 = i56 - 1;
            iArr3[i64] = 1;
            Toast.makeText((Context) null, iArr3[((i56 * i64) % 2) - 1], 1).show();
            objArr5 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i65 = ((int[]) objArr4[3])[0];
            int i66 = ((int[]) objArr4[2])[0];
            int i67 = ((int[]) objArr4[0])[0];
            int i68 = ~new Random().nextInt();
            int i69 = i65 + (-1352521075) + ((~(i68 | (-18091))) * 52) + (((~(427731028 | i68)) | (~(424300218 | i68)) | (-427749119)) * (-52)) + (((~(i68 | (-427731029))) | 424282128) * 52);
            int i70 = (i69 << 13) ^ i69;
            int i71 = i70 ^ (i70 >>> 17);
            c2 = 3;
            c3 = 0;
            ((int[]) objArr5[3])[0] = i71 ^ (i71 << 5);
        }
        ((Field) ExifData.TuitionPaymentFragmentspecialinlinedviewModeldefault3[c3]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{2141246831, 883334464, 651936802}, ((int[]) objArr5[c2])[c3], Integer.MAX_VALUE) - (-737124300));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char c12 = (char) (43043 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int iArgb = Color.argb(0, 0, 0, 0) + 3111;
            int iBlue3 = Color.blue(0) + 22;
            byte b25 = $$a[7];
            byte b26 = b25;
            Object[] objArr53 = new Object[1];
            c(b25, b26, (short) (b26 | 88), objArr53);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(c12, iArgb, iBlue3, -1272852037, false, (String) objArr53[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char deadChar = (char) (43042 - KeyEvent.getDeadChar(0, 0));
                int gidForName = 3110 - Process.getGidForName("");
                int mode = 22 - View.MeasureSpec.getMode(0);
                byte[] bArr12 = $$a;
                byte b27 = (byte) (bArr12[33] - 1);
                byte b28 = bArr12[7];
                Object[] objArr54 = new Object[1];
                c(b27, b28, (short) (b28 | 51), objArr54);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(deadChar, gidForName, mode, 154975793, false, (String) objArr54[0], null);
            }
            Object[] objArr55 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).get(null);
            int i72 = ((int[]) objArr55[2])[0];
            int i73 = ((int[]) objArr55[1])[0];
            String[] strArr4 = (String[]) objArr55[3];
            int[] iArr4 = {i72};
            int[] iArr5 = {i73};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i74 = 1149464534 + (((~(elapsedCpuTime | 282544083)) | (-1422487376)) * (-668)) + ((282544083 | (~((-1422487376) | elapsedCpuTime))) * 1336) + ((elapsedCpuTime | (-1141385229)) * 668) + 661080767;
            int i75 = (i74 << 13) ^ i74;
            int i76 = i75 ^ (i75 >>> 17);
            ((int[]) objArr6[0])[0] = i76 ^ (i76 << 5);
            objArr6 = new Object[]{new int[1], iArr5, iArr4, strArr4};
        } else {
            Object[] objArr56 = {null, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue()), 0, 661080767};
            byte[] bArr13 = $$d;
            byte b29 = bArr13[55];
            Object[] objArr57 = new Object[1];
            d(b29, (short) (b29 | 357), (byte) (-bArr13[200]), objArr57);
            Class<?> cls2 = Class.forName((String) objArr57[0]);
            Object[] objArr58 = new Object[1];
            d(bArr13[38], (short) 291, bArr13[213], objArr58);
            objArr6 = (Object[]) cls2.getMethod((String) objArr58[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr56);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char packedPositionGroup2 = (char) (43042 - ExpandableListView.getPackedPositionGroup(0L));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 3111;
                int i77 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
                byte[] bArr14 = $$a;
                byte b30 = (byte) (bArr14[33] - 1);
                byte b31 = bArr14[7];
                Object[] objArr59 = new Object[1];
                c(b30, b31, (short) (b31 | 51), objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(packedPositionGroup2, iCombineMeasuredStates, i77, 154975793, false, (String) objArr59[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArr6);
            try {
                long jLongValue6 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue6);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char cGreen = (char) (Color.green(0) + 43042);
                    int iIndexOf4 = 3110 - TextUtils.indexOf((CharSequence) "", '0');
                    int i78 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
                    byte[] bArr15 = $$a;
                    byte b32 = bArr15[7];
                    Object[] objArr60 = new Object[1];
                    c(b32, b32, bArr15[5], objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cGreen, iIndexOf4, i78, -1269618118, false, (String) objArr60[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue6 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char tapTimeout = (char) (43042 - (ViewConfiguration.getTapTimeout() >> 16));
                    int i79 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3110;
                    int mode2 = 22 - View.MeasureSpec.getMode(0);
                    byte b33 = $$a[7];
                    byte b34 = b33;
                    Object[] objArr61 = new Object[1];
                    c(b33, b34, (short) (b34 | 88), objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(tapTimeout, i79, mode2, -1272852037, false, (String) objArr61[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf8);
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i80 = ((int[]) objArr6[1])[0];
        int i81 = ((int[]) objArr6[2])[0];
        if (i81 != i80) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr5 = (String[]) objArr6[3];
            if (strArr5 != null) {
                for (String str13 : strArr5) {
                    arrayList2.add(str13);
                }
            }
            throw new RuntimeException(String.valueOf(i81));
        }
        int i82 = ((int[]) objArr6[0])[0];
        int i83 = ((int[]) objArr6[2])[0];
        int i84 = ((int[]) objArr6[1])[0];
        String[] strArr6 = (String[]) objArr6[3];
        int[] iArr6 = {i83};
        int[] iArr7 = {i84};
        int iMyPid2 = Process.myPid();
        int i85 = (-186298070) + (((~((-140467152) | iMyPid2)) | (-1564564308)) * (-318));
        int i86 = ~((-1564564308) | iMyPid2);
        int i87 = ~iMyPid2;
        int i88 = i82 + i85 + ((i86 | (~(1566530527 | i87))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMyPid2 | 1566530527)) | (~((-1426063377) | i87))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
        int i89 = (i88 << 13) ^ i88;
        int i90 = i89 ^ (i89 >>> 17);
        Object obj2 = new Object[]{new int[1], iArr7, iArr6, strArr6}[0];
        ((int[]) obj2)[0] = i90 ^ (i90 << 5);
        ((Field) createString.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1540171671, 1486451385, 567803003}, ((int[]) obj2)[0], Integer.MAX_VALUE) - (-592025129));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
            char cCombineMeasuredStates2 = (char) (37567 - View.combineMeasuredStates(0, 0));
            int iBlue4 = Color.blue(0) + 625;
            int i91 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13;
            Object[] objArr62 = new Object[1];
            c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr62);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cCombineMeasuredStates2, iBlue4, i91, -477065106, false, (String) objArr62[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
            char c13 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 37566);
            int i92 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 625;
            int doubleTapTimeout3 = 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte b35 = $$a[7];
            byte b36 = b35;
            Object[] objArr63 = new Object[1];
            c(b35, b36, (short) (b36 | 88), objArr63);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(c13, i92, doubleTapTimeout3, -976899241, false, (String) objArr63[0], null);
        }
        if (j3 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                char gidForName2 = (char) (Process.getGidForName("") + 37568);
                int packedPositionType = 625 - ExpandableListView.getPackedPositionType(0L);
                int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 14;
                byte[] bArr16 = $$a;
                byte b37 = bArr16[7];
                Object[] objArr64 = new Object[1];
                c(b37, b37, bArr16[5], objArr64);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(gidForName2, packedPositionType, offsetAfter3, -973632554, false, (String) objArr64[0], null);
            }
            Object[] objArr65 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).get(null);
            int i93 = ((int[]) objArr65[2])[0];
            int i94 = ((int[]) objArr65[0])[0];
            String[] strArr7 = (String[]) objArr65[3];
            int[] iArr8 = {i93};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i95 = ~((-657739764) | startUptimeMillis);
            int i96 = ~startUptimeMillis;
            int i97 = (((1919469816 + ((i95 | (~(1165998357 | i96))) * (-1808))) + (((~((-87296274) | startUptimeMillis)) | (~(i96 | 1736441847))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(startUptimeMillis | (-1165998358))) | 570443490) | (~(657739763 | i96))) * TypedValues.Custom.TYPE_BOOLEAN)) - 1319243294;
            int i98 = (i97 << 13) ^ i97;
            int i99 = i98 ^ (i98 >>> 17);
            ((int[]) objArr7[1])[0] = i99 ^ (i99 << 5);
            objArr7 = new Object[]{new int[]{i94}, new int[1], iArr8, strArr7};
            c4 = 0;
            str3 = str11;
        } else {
            str3 = str11;
            Context applicationContext3 = (Context) Class.forName(str10).getMethod(str3, new Class[0]).invoke(null, null);
            if (applicationContext3 != null) {
                int i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i100 % 128;
                if (i100 % 2 == 0) {
                    int i101 = 23 / 0;
                    if (applicationContext3 instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext3).getBaseContext() != null) {
                            applicationContext3 = null;
                        }
                    }
                } else if (applicationContext3 instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext3).getBaseContext() != null) {
                        applicationContext3 = null;
                    }
                }
                applicationContext3 = applicationContext3.getApplicationContext();
            }
            int iIntValue2 = ((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue();
            Object[] objArr66 = new Object[1];
            a(TextUtils.getCapsMode("", 0, 0) + 113, 63 - TextUtils.lastIndexOf("", '0', 0), (char) TextUtils.getOffsetAfter("", 0), objArr66);
            String str14 = (String) objArr66[0];
            Object[] objArr67 = new Object[1];
            a((Process.myPid() >> 22) + 177, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64, (char) TextUtils.indexOf("", "", 0), objArr67);
            Object[] objArr68 = {applicationContext3, new String[]{str14, (String) objArr67[0]}, Integer.valueOf(iIntValue2), 17, -1319243294};
            byte[] bArr17 = $$d;
            byte b38 = bArr17[55];
            Object[] objArr69 = new Object[1];
            d(b38, (short) (b38 | 246), bArr17[33], objArr69);
            Class<?> cls3 = Class.forName((String) objArr69[0]);
            Object[] objArr70 = new Object[1];
            d(bArr17[38], (short) ($$e | 140), bArr17[24], objArr70);
            Object[] objArr71 = (Object[]) cls3.getMethod((String) objArr70[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr68);
            int i102 = ((int[]) objArr71[0])[0];
            int i103 = ((int[]) objArr71[2])[0];
            if (applicationContext3 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char cResolveOpacity = (char) (37567 - Drawable.resolveOpacity(0, 0));
                    int iCombineMeasuredStates2 = 625 - View.combineMeasuredStates(0, 0);
                    int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 14;
                    byte[] bArr18 = $$a;
                    byte b39 = bArr18[7];
                    Object[] objArr72 = new Object[1];
                    c(b39, b39, bArr18[5], objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cResolveOpacity, iCombineMeasuredStates2, longPressTimeout2, -973632554, false, (String) objArr72[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, objArr71);
                try {
                    long jLongValue8 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char gidForName3 = (char) (37566 - Process.getGidForName(""));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 625;
                        int windowTouchSlop = 14 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b40 = $$a[7];
                        byte b41 = b40;
                        Object[] objArr73 = new Object[1];
                        c(b40, b41, (short) (b41 | 88), objArr73);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(gidForName3, iResolveSizeAndState, windowTouchSlop, -976899241, false, (String) objArr73[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                        char maximumDrawingCacheSize2 = (char) (37567 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 626;
                        int i104 = 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        Object[] objArr74 = new Object[1];
                        c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr74);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(maximumDrawingCacheSize2, iLastIndexOf2, i104, -477065106, false, (String) objArr74[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                objArr71 = objArr71;
            }
            objArr7 = objArr71;
            c4 = 0;
        }
        int i105 = ((int[]) objArr7[c4])[c4];
        int i106 = ((int[]) objArr7[2])[c4];
        if (i106 == i105) {
            objArr8 = new Object[4];
            int[] iArr9 = new int[1];
            objArr8[c4] = iArr9;
            objArr8[1] = new int[1];
            int[] iArr10 = new int[1];
            objArr8[2] = iArr10;
            int i107 = ((int[]) objArr7[1])[c4];
            int i108 = ((int[]) objArr7[2])[c4];
            int i109 = ((int[]) objArr7[c4])[c4];
            String[] strArr8 = (String[]) objArr7[3];
            iArr10[c4] = i108;
            iArr9[c4] = i109;
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i110 = ~startUptimeMillis2;
            int i111 = i107 + (-1334275752) + (((~(1685251655 | i110)) | 134283392) * 184) + ((startUptimeMillis2 | 1681048582) * (-184)) + ((~((-138486466) | i110)) * 184);
            int i112 = (i111 << 13) ^ i111;
            int i113 = i112 ^ (i112 >>> 17);
            ((int[]) objArr8[1])[0] = i113 ^ (i113 << 5);
            objArr8[3] = strArr8;
            c5 = 1;
            c6 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            String[] strArr9 = (String[]) objArr7[3];
            if (strArr9 != null) {
                for (String str15 : strArr9) {
                    arrayList3.add(str15);
                }
            }
            int[] iArr11 = new int[i106];
            int i114 = i106 - 1;
            iArr11[i114] = 1;
            Toast.makeText((Context) null, iArr11[((i106 * i114) % 2) - 1], 1).show();
            int i115 = ((int[]) objArr7[1])[0];
            int i116 = ((int[]) objArr7[2])[0];
            int i117 = ((int[]) objArr7[0])[0];
            String[] strArr10 = (String[]) objArr7[3];
            int[] iArr12 = {i116};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i118 = i115 + (((185355544 + (((~((~iIdentityHashCode5) | (-929169919))) | 893518090) * 446)) + (((~(iIdentityHashCode5 | (-35651829))) | 1050112) * 446)) - 922890388);
            int i119 = (i118 << 13) ^ i118;
            int i120 = i119 ^ (i119 >>> 17);
            c5 = 1;
            c6 = 0;
            ((int[]) objArr8[1])[0] = i120 ^ (i120 << 5);
            objArr8 = new Object[]{new int[]{i117}, new int[1], iArr12, strArr10};
        }
        ((Field) toMetersPerSecond.b[c6]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{522044996, 25290498, 1998783660}, ((int[]) objArr8[c5])[c6], Integer.MAX_VALUE) - Integer.MAX_VALUE);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
            char c14 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            int jumpTapTimeout3 = 2267 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iMyPid3 = (Process.myPid() >> 22) + 33;
            byte[] bArr19 = $$a;
            byte b42 = bArr19[7];
            Object[] objArr75 = new Object[1];
            c(b42, b42, bArr19[5], objArr75);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c14, jumpTapTimeout3, iMyPid3, -887667012, false, (String) objArr75[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null) != -1) {
            int i121 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i121 % 128;
            int i122 = i121 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char doubleTapTimeout4 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int iMyPid4 = (Process.myPid() >> 22) + 2267;
                int packedPositionGroup3 = 33 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr20 = $$a;
                byte b43 = (byte) (bArr20[33] - 1);
                byte b44 = bArr20[7];
                Object[] objArr76 = new Object[1];
                c(b43, b44, (short) (b44 | 51), objArr76);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(doubleTapTimeout4, iMyPid4, packedPositionGroup3, -654680577, false, (String) objArr76[0], null);
            }
            Object[] objArr77 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).get(null);
            objArr9 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i123 = ((int[]) objArr77[0])[0];
            int i124 = ((int[]) objArr77[3])[0];
            String[] strArr11 = (String[]) objArr77[1];
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i125 = ~iUptimeMillis;
            int i126 = (-1123791721) + (((~((-566370035) | i125)) | (-242343282) | (~(566370034 | iUptimeMillis))) * (-564)) + ((~(iUptimeMillis | (-238141698))) * 1128) + (((~((-242343282) | i125)) | (-804511732)) * 564) + 1058268275;
            int i127 = (i126 << 13) ^ i126;
            int i128 = i127 ^ (i127 >>> 17);
            ((int[]) objArr9[2])[0] = i128 ^ (i128 << 5);
        } else {
            Context applicationContext4 = (Context) Class.forName(str10).getMethod(str3, new Class[0]).invoke(null, null);
            if (applicationContext4 != null) {
                applicationContext4 = ((applicationContext4 instanceof ContextWrapper) && ((ContextWrapper) applicationContext4).getBaseContext() == null) ? null : applicationContext4.getApplicationContext();
            }
            Object[] objArr78 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue()), 0, 1058268275};
            byte[] bArr21 = $$d;
            byte b45 = bArr21[55];
            byte b46 = b45;
            Object[] objArr79 = new Object[1];
            d(b46, (short) (b46 | 145), b45, objArr79);
            Class<?> cls4 = Class.forName((String) objArr79[0]);
            Object[] objArr80 = new Object[1];
            d(bArr21[38], (short) ($$e | 140), bArr21[24], objArr80);
            Object[] objArr81 = (Object[]) cls4.getMethod((String) objArr80[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr78);
            if (applicationContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char size2 = (char) View.MeasureSpec.getSize(0);
                    int iMakeMeasureSpec2 = 2267 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 33;
                    byte[] bArr22 = $$a;
                    byte b47 = (byte) (bArr22[33] - 1);
                    byte b48 = bArr22[7];
                    Object[] objArr82 = new Object[1];
                    c(b47, b48, (short) (b48 | 51), objArr82);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(size2, iMakeMeasureSpec2, iMakeMeasureSpec3, -654680577, false, (String) objArr82[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr81);
                try {
                    long jLongValue9 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char bitsPerPixel3 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                        int i129 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2266;
                        int i130 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34;
                        byte b49 = $$a[7];
                        byte b50 = b49;
                        Object[] objArr83 = new Object[1];
                        c(b49, b50, (short) (b50 | 88), objArr83);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(bitsPerPixel3, i129, i130, -874156483, false, (String) objArr83[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                        char absoluteGravity3 = (char) Gravity.getAbsoluteGravity(0, 0);
                        int i131 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2267;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 33;
                        byte[] bArr23 = $$a;
                        byte b51 = bArr23[7];
                        Object[] objArr84 = new Object[1];
                        c(b51, b51, bArr23[5], objArr84);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(absoluteGravity3, i131, capsMode, -887667012, false, (String) objArr84[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            } else {
                objArr81 = objArr81;
            }
            objArr9 = objArr81;
        }
        int i132 = ((int[]) objArr9[3])[0];
        int i133 = ((int[]) objArr9[0])[0];
        if (i133 != i132) {
            ArrayList arrayList4 = new ArrayList();
            String[] strArr12 = (String[]) objArr9[1];
            if (strArr12 != null) {
                for (String str16 : strArr12) {
                    arrayList4.add(str16);
                }
            }
            throw new RuntimeException(String.valueOf(i133));
        }
        int i134 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i134 % 128;
        int i135 = i134 % 2;
        Object[] objArr85 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i136 = ((int[]) objArr9[2])[0];
        int i137 = ((int[]) objArr9[0])[0];
        int i138 = ((int[]) objArr9[3])[0];
        String[] strArr13 = (String[]) objArr9[1];
        int iMyPid5 = Process.myPid();
        int i139 = ~iMyPid5;
        int i140 = i136 + (-1999666090) + (((~(i139 | 711801514)) | (-804256700) | (~((-4456617) | iMyPid5))) * 717) + (((~(iMyPid5 | 711801514)) | (~(i139 | (-4456617))) | (-804256700)) * 717);
        int i141 = (i140 << 13) ^ i140;
        int i142 = i141 ^ (i141 >>> 17);
        Object obj3 = objArr85[2];
        ((int[]) obj3)[0] = i142 ^ (i142 << 5);
        int i143 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i143 % 128;
        int i144 = i143 % 2;
        ((Field) ExifSpeed.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1414284118, 1724086161, 1023868285}, ((int[]) obj3)[0], Integer.MAX_VALUE) - (-1249978222));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char touchSlop = (char) (29944 - (ViewConfiguration.getTouchSlop() >> 8));
            int maximumDrawingCacheSize3 = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i145 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr24 = $$a;
            byte b52 = (byte) (bArr24[33] - 1);
            byte b53 = bArr24[7];
            Object[] objArr86 = new Object[1];
            c(b52, b53, (short) (b53 | 51), objArr86);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(touchSlop, maximumDrawingCacheSize3, i145, 986134021, false, (String) objArr86[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "") + 29944);
                int defaultSize = View.getDefaultSize(0, 0) + 1755;
                int deadChar2 = 23 - KeyEvent.getDeadChar(0, 0);
                byte[] bArr25 = $$a;
                byte b54 = bArr25[7];
                Object[] objArr87 = new Object[1];
                c(b54, b54, bArr25[5], objArr87);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cIndexOf, defaultSize, deadChar2, 1599039318, false, (String) objArr87[0], null);
            }
            Object[] objArr88 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
            objArr10 = new Object[]{new int[]{((int[]) objArr88[0])[0]}, new int[]{((int[]) objArr88[1])[0]}, (Object[]) objArr88[2], new int[1], (String[]) objArr88[4]};
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i146 = ((631833220 + (((~(iUptimeMillis2 | 455230463)) | 72627200) * 305)) + (((~((~iUptimeMillis2) | 455230463)) | 242628037) * 305)) - 187015543;
            int i147 = (i146 << 13) ^ i146;
            int i148 = i147 ^ (i147 >>> 17);
            ((int[]) objArr10[3])[0] = i148 ^ (i148 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue();
            Object[] objArr89 = {332716750};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 42049), TextUtils.indexOf("", "", 0) + 1726, 29 - TextUtils.getOffsetBefore("", 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da = ActivityLoginBinding.TuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da(iIntValue3, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).newInstance(objArr89), -187015543);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') + 29896);
                int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                int defaultSize2 = View.getDefaultSize(0, 0) + 23;
                byte[] bArr26 = $$a;
                byte b55 = bArr26[7];
                Object[] objArr90 = new Object[1];
                c(b55, b55, bArr26[5], objArr90);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(mirror, tapTimeout2, defaultSize2, 1599039318, false, (String) objArr90[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da);
            try {
                long jLongValue10 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf13 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char c15 = (char) (29944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    int edgeSlop3 = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b56 = $$a[7];
                    byte b57 = b56;
                    Object[] objArr91 = new Object[1];
                    c(b56, b57, (short) (b57 | 140), objArr91);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c15, edgeSlop3, threadPriority, 1596667560, false, (String) objArr91[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf13);
                Long lValueOf14 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char c16 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 29943);
                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0) + 1756;
                    int scrollBarFadeDuration2 = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte[] bArr27 = $$a;
                    byte b58 = (byte) (bArr27[33] - 1);
                    byte b59 = bArr27[7];
                    Object[] objArr92 = new Object[1];
                    c(b58, b59, (short) (b59 | 51), objArr92);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c16, iLastIndexOf3, scrollBarFadeDuration2, 986134021, false, (String) objArr92[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf14);
                objArr10 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault3$5f1425da;
            } catch (Exception unused7) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr10[0])[0] != ((int[]) objArr10[1])[0]) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr14 = (String[]) objArr10[4];
            if (strArr14 != null) {
                for (String str17 : strArr14) {
                    arrayList5.add(str17);
                }
            }
            throw null;
        }
        int i149 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i149 % 128;
        int i150 = i149 % 2;
        int i151 = ((int[]) objArr10[3])[0];
        Object[] objArr93 = {new int[]{((int[]) objArr10[0])[0]}, new int[]{((int[]) objArr10[1])[0]}, (Object[]) objArr10[2], new int[1], (String[]) objArr10[4]};
        int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
        int i152 = i151 + ((~(startUptimeMillis3 | (-723048161))) * TypedValues.CycleType.TYPE_EASING) + 1176844305 + (((~((~startUptimeMillis3) | (-723048161))) | 348397850) * TypedValues.CycleType.TYPE_EASING);
        int i153 = (i152 << 13) ^ i152;
        int i154 = i153 ^ (i153 >>> 17);
        Object obj4 = objArr93[3];
        ((int[]) obj4)[0] = i154 ^ (i154 << 5);
        int i155 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i155 % 128;
        int i156 = i155 % 2;
        ((Field) fromMilesPerHour.b[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1965504743, 650152660, 2126192643}, ((int[]) obj4)[0], Integer.MAX_VALUE) - (-818030800));
        super.onCreate(bundle);
        zzap zzapVar = this.zza;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 876;
            int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
            Object[] objArr94 = new Object[1];
            c((byte) 42, $$a[205], (short) DerHeader.TAG_CLASS_PRIVATE, objArr94);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(cKeyCodeFromString, iResolveOpacity2, longPressTimeout3, -1199417970, false, (String) objArr94[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
            int i157 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
            int offsetBefore2 = 10 - TextUtils.getOffsetBefore("", 0);
            Object[] objArr95 = new Object[1];
            c((byte) 52, $$a[33], (short) 202, objArr95);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(cIndexOf2, i157, offsetBefore2, 254769921, false, (String) objArr95[0], null);
        }
        if (j4 == ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                int i158 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 875;
                int i159 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                byte[] bArr28 = $$a;
                Object[] objArr96 = new Object[1];
                c(bArr28[44], bArr28[205], (short) 202, objArr96);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cLastIndexOf2, i158, i159, 1324201839, false, (String) objArr96[0], null);
            }
            Object[] objArr97 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr97[0])[0]}, new int[1], new int[]{((int[]) objArr97[2])[0]}, (String[]) objArr97[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i160 = ~iIdentityHashCode6;
            int i161 = (((400299292 + (((~(626885174 | i160)) | (~((-667195404) | iIdentityHashCode6))) * 1900)) + (((~(i160 | 667195403)) | (~(iIdentityHashCode6 | (-626885175)))) * (-950))) + (((~(iIdentityHashCode6 | 667195403)) | (~(i160 | (-626885175)))) * 950)) - 300928394;
            int i162 = (i161 << 13) ^ i161;
            int i163 = i162 ^ (i162 >>> 17);
            ((int[]) objArr11[1])[0] = i163 ^ (i163 << 5);
        } else {
            Object[] objArr98 = {Integer.valueOf(((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue()), -300928394};
            byte[] bArr29 = $$d;
            byte b60 = bArr29[55];
            Object[] objArr99 = new Object[1];
            d(b60, (short) (b60 | 100), (byte) (bArr29[38] - 1), objArr99);
            Class<?> cls5 = Class.forName((String) objArr99[0]);
            Object[] objArr100 = new Object[1];
            d(bArr29[38], (short) ($$e | 140), bArr29[24], objArr100);
            objArr11 = (Object[]) cls5.getMethod((String) objArr100[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr98);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char doubleTapTimeout5 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 877;
                int i164 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte[] bArr30 = $$a;
                Object[] objArr101 = new Object[1];
                c(bArr30[44], bArr30[205], (short) 202, objArr101);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(doubleTapTimeout5, packedPositionChild3, i164, 1324201839, false, (String) objArr101[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, objArr11);
            try {
                long jLongValue12 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf15 = Long.valueOf(jLongValue12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                    int i165 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                    int i166 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                    Object[] objArr102 = new Object[1];
                    c((byte) 52, $$a[33], (short) 202, objArr102);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(capsMode2, i165, i166, 254769921, false, (String) objArr102[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf15);
                Long lValueOf16 = Long.valueOf(jLongValue12 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                    int size3 = 876 - View.MeasureSpec.getSize(0);
                    int iBlue5 = Color.blue(0) + 10;
                    Object[] objArr103 = new Object[1];
                    c((byte) 42, $$a[205], (short) DerHeader.TAG_CLASS_PRIVATE, objArr103);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(threadPriority2, size3, iBlue5, -1199417970, false, (String) objArr103[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf16);
            } catch (Exception unused8) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr11[0])[0] != ((int[]) objArr11[2])[0]) {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr15 = (String[]) objArr11[3];
            if (strArr15 != null) {
                int i167 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i167 % 128;
                for (int i168 = i167 % 2 != 0 ? 1 : 0; i168 < strArr15.length; i168++) {
                    arrayList6.add(strArr15[i168]);
                }
            }
            throw null;
        }
        int i169 = ((int[]) objArr11[1])[0];
        Object[] objArr104 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
        int iIdentityHashCode7 = System.identityHashCode(this);
        int i170 = ~iIdentityHashCode7;
        int i171 = i169 + (-737472760) + (((~(515245615 | i170)) | (~((-513933868) | iIdentityHashCode7))) * (-831)) + ((~(1069489711 | iIdentityHashCode7)) * (-1662)) + (((~(iIdentityHashCode7 | (-515245616))) | (~(i170 | (-555555845))) | (~(555555844 | iIdentityHashCode7))) * 831);
        int i172 = (i171 << 13) ^ i171;
        int i173 = i172 ^ (i172 >>> 17);
        Object obj5 = objArr104[1];
        ((int[]) obj5)[0] = i173 ^ (i173 << 5);
        ((Field) initialValue.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1045536306, 468299013, 496342322}, ((int[]) obj5)[0], Integer.MAX_VALUE));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int i174 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int bitsPerPixel4 = 9 - ImageFormat.getBitsPerPixel(0);
            Object[] objArr105 = new Object[1];
            c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr105);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(pressedStateDuration3, i174, bitsPerPixel4, 252381699, false, (String) objArr105[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null);
        long jLongValue13 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char cAlpha = (char) Color.alpha(0);
            int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
            int i175 = 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte b61 = $$a[7];
            byte b62 = b61;
            Object[] objArr106 = new Object[1];
            c(b61, b62, (short) (b62 | 140), objArr106);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cAlpha, scrollDefaultDelay2, i175, 2009631821, false, (String) objArr106[0], null);
        }
        if (j5 == ((jLongValue13 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char c17 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 876;
                int i176 = 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                Object[] objArr107 = new Object[1];
                c((byte) 52, $$a[54], (short) 209, objArr107);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c17, iResolveOpacity3, i176, 256017550, false, (String) objArr107[0], null);
            }
            Object[] objArr108 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            objArr12 = new Object[]{new int[]{((int[]) objArr108[0])[0]}, new int[1], new int[]{((int[]) objArr108[2])[0]}, (String[]) objArr108[3]};
            int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
            int i177 = (((~((-152458627) | iMaxMemory2)) | (-197099440)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 930521562 + ((~((~iMaxMemory2) | (-152458627))) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 2061936023;
            int i178 = (i177 << 13) ^ i177;
            int i179 = i178 ^ (i178 >>> 17);
            ((int[]) objArr12[1])[0] = i179 ^ (i179 << 5);
            str4 = str3;
        } else {
            Context applicationContext5 = (Context) Class.forName(str10).getMethod(str4, new Class[0]).invoke(null, null);
            if (applicationContext5 != null) {
                if ((applicationContext5 instanceof ContextWrapper) && ((ContextWrapper) applicationContext5).getBaseContext() == null) {
                    str4 = str3;
                    applicationContext5 = null;
                } else {
                    str4 = str3;
                    str4 = str3;
                    applicationContext5 = applicationContext5.getApplicationContext();
                }
            }
            str4 = str3;
            Object[] objArr109 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue()), 2061936023};
            byte[] bArr31 = $$d;
            Object[] objArr110 = new Object[1];
            d(bArr31[55], bArr31[536], bArr31[33], objArr110);
            Class<?> cls6 = Class.forName((String) objArr110[0]);
            Object[] objArr111 = new Object[1];
            d(bArr31[38], (short) ($$e | 140), bArr31[24], objArr111);
            Object[] objArr112 = (Object[]) cls6.getMethod((String) objArr111[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr109);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                    int tapTimeout3 = 876 - (ViewConfiguration.getTapTimeout() >> 16);
                    int size4 = 10 - View.MeasureSpec.getSize(0);
                    Object[] objArr113 = new Object[1];
                    c((byte) 52, $$a[54], (short) 209, objArr113);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cLastIndexOf3, tapTimeout3, size4, 256017550, false, (String) objArr113[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, objArr112);
                try {
                    long jLongValue14 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue14);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                        char cResolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                        int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
                        int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
                        byte b63 = $$a[7];
                        byte b64 = b63;
                        Object[] objArr114 = new Object[1];
                        c(b63, b64, (short) (b64 | 140), objArr114);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cResolveSizeAndState2, iIndexOf5, iNormalizeMetaState, 2009631821, false, (String) objArr114[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue14 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                        char maximumDrawingCacheSize4 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int longPressTimeout4 = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int edgeSlop4 = (ViewConfiguration.getEdgeSlop() >> 16) + 10;
                        Object[] objArr115 = new Object[1];
                        c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr115);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(maximumDrawingCacheSize4, longPressTimeout4, edgeSlop4, 252381699, false, (String) objArr115[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            } else {
                objArr112 = objArr112;
            }
            objArr12 = objArr112;
        }
        if (((int[]) objArr12[0])[0] != ((int[]) objArr12[2])[0]) {
            throw null;
        }
        int i180 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i180 % 128;
        int i181 = i180 % 2;
        int i182 = ((int[]) objArr12[1])[0];
        Object[] objArr116 = {new int[]{((int[]) objArr12[0])[0]}, new int[1], new int[]{((int[]) objArr12[2])[0]}, (String[]) objArr12[3]};
        int iIdentityHashCode8 = System.identityHashCode(this);
        int i183 = i182 + (-340708924) + ((~((~iIdentityHashCode8) | (-27855406))) * (-116)) + ((877720914 | iIdentityHashCode8) * 116) + (((~(iIdentityHashCode8 | 837410685)) | 68165634) * 116);
        int i184 = i183 ^ (i183 << 13);
        int i185 = i184 ^ (i184 >>> 17);
        Object obj6 = objArr116[1];
        ((int[]) obj6)[0] = i185 ^ (i185 << 5);
        ((Field) isFlippedVertically.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{662512340, 245797813, 1958931644}, ((int[]) obj6)[0], Integer.MAX_VALUE) - (-1353336483));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char jumpTapTimeout4 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iBlue6 = 1031 - Color.blue(0);
            int iAxisFromString2 = MotionEvent.axisFromString("") + 16;
            byte b65 = $$a[7];
            byte b66 = b65;
            Object[] objArr117 = new Object[1];
            c(b65, b66, (short) (b66 | 88), objArr117);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(jumpTapTimeout4, iBlue6, iAxisFromString2, 1357589585, false, (String) objArr117[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null);
        long jLongValue15 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char packedPositionGroup4 = (char) ExpandableListView.getPackedPositionGroup(0L);
            int iAxisFromString3 = MotionEvent.axisFromString("") + 1032;
            int i186 = 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr32 = $$a;
            byte b67 = bArr32[7];
            Object[] objArr118 = new Object[1];
            c(b67, b67, bArr32[5], objArr118);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(packedPositionGroup4, iAxisFromString3, i186, 1344079056, false, (String) objArr118[0], null);
        }
        if (j6 == ((jLongValue15 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                char cResolveSizeAndState3 = (char) View.resolveSizeAndState(0, 0, 0);
                int tapTimeout4 = 1031 - (ViewConfiguration.getTapTimeout() >> 16);
                int i187 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr119 = new Object[1];
                c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr119);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cResolveSizeAndState3, tapTimeout4, i187, 632103528, false, (String) objArr119[0], null);
            }
            Object[] objArr120 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).get(null);
            objArr13 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i188 = ((int[]) objArr120[3])[0];
            int i189 = ((int[]) objArr120[1])[0];
            String[] strArr16 = (String[]) objArr120[0];
            int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
            int i190 = ~iUptimeMillis3;
            int i191 = (((-1632988693) + (((~(687891289 | i190)) | (~((-932171460) | iUptimeMillis3))) * 210)) + (((~(iUptimeMillis3 | 1066397659)) | (~(i190 | (-553665090)))) * 210)) - 1336437762;
            int i192 = (i191 << 13) ^ i191;
            int i193 = i192 ^ (i192 >>> 17);
            ((int[]) objArr13[2])[0] = i193 ^ (i193 << 5);
        } else {
            int iIntValue4 = ((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue();
            Object[] objArr121 = {2020644153};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 46037), Color.blue(0) + 1134, 18 - KeyEvent.normalizeMetaState(0), 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr122 = {Integer.valueOf(iIntValue4), 0, -1336437762, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).newInstance(objArr121), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char cIndexOf3 = (char) TextUtils.indexOf("", "", 0);
                int i194 = 1031 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
                byte b68 = $$a[7];
                byte b69 = b68;
                Object[] objArr123 = new Object[1];
                c(b68, b69, (short) (b69 | 88), objArr123);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cIndexOf3, i194, keyRepeatTimeout, 1298546779, false, (String) objArr123[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - Color.green(0)), 1116 - TextUtils.lastIndexOf("", '0', 0, 0), 17 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Boolean.TYPE});
            }
            objArr13 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).invoke(null, objArr122);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                char capsMode3 = (char) TextUtils.getCapsMode("", 0, 0);
                int longPressTimeout5 = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int iRgb3 = Color.rgb(0, 0, 0) + 16777231;
                Object[] objArr124 = new Object[1];
                c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr124);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(capsMode3, longPressTimeout5, iRgb3, 632103528, false, (String) objArr124[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, objArr13);
            try {
                long jLongValue16 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf19 = Long.valueOf(jLongValue16);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char defaultSize3 = (char) View.getDefaultSize(0, 0);
                    int size5 = View.MeasureSpec.getSize(0) + 1031;
                    int offsetAfter4 = TextUtils.getOffsetAfter("", 0) + 15;
                    byte[] bArr33 = $$a;
                    byte b70 = bArr33[7];
                    Object[] objArr125 = new Object[1];
                    c(b70, b70, bArr33[5], objArr125);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(defaultSize3, size5, offsetAfter4, 1344079056, false, (String) objArr125[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf19);
                Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char cIndexOf4 = (char) TextUtils.indexOf("", "", 0);
                    int windowTouchSlop2 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1031;
                    int iMyTid = 15 - (Process.myTid() >> 22);
                    byte b71 = $$a[7];
                    byte b72 = b71;
                    Object[] objArr126 = new Object[1];
                    c(b71, b72, (short) (b72 | 88), objArr126);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cIndexOf4, windowTouchSlop2, iMyTid, 1357589585, false, (String) objArr126[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, lValueOf20);
            } catch (Exception unused10) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr13[3])[0] != ((int[]) objArr13[1])[0]) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr17 = (String[]) objArr13[0];
            if (strArr17 != null) {
                for (String str18 : strArr17) {
                    arrayList7.add(str18);
                }
            }
            throw null;
        }
        Object[] objArr127 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i195 = ((int[]) objArr13[2])[0];
        int i196 = ((int[]) objArr13[3])[0];
        int i197 = ((int[]) objArr13[1])[0];
        String[] strArr18 = (String[]) objArr13[0];
        int startUptimeMillis4 = (int) Process.getStartUptimeMillis();
        int i198 = 462464089 + (((~((-330825182) | startUptimeMillis4)) | 311913868 | (~(86545011 | startUptimeMillis4))) * (-880));
        int i199 = (~((-330825182) | (~startUptimeMillis4))) | (-86545012);
        int i200 = ~(startUptimeMillis4 | 330825181);
        int i201 = i195 + i198 + ((i199 | i200) * (-880)) + (i200 * 880);
        int i202 = (i201 << 13) ^ i201;
        int i203 = i202 ^ (i202 >>> 17);
        Object obj7 = objArr127[2];
        ((int[]) obj7)[0] = i203 ^ (i203 << 5);
        ((Field) copyToCroppedImage.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1392612550, 144475998, 1848856767}, ((int[]) obj7)[0], Integer.MAX_VALUE) - (-924129415));
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31533);
            int iAlpha2 = Color.alpha(0) + 921;
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
            Object[] objArr128 = new Object[1];
            c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr128);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(minimumFlingVelocity, iAlpha2, keyRepeatDelay, -1048449946, false, (String) objArr128[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) != -1) {
            int i204 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i204 % 128;
            int i205 = i204 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                char cGreen2 = (char) (31533 - Color.green(0));
                int mirror2 = 969 - AndroidCharacter.getMirror('0');
                int i206 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr34 = $$a;
                byte b73 = (byte) (bArr34[33] - 1);
                byte b74 = bArr34[7];
                Object[] objArr129 = new Object[1];
                c(b73, b74, (short) (b74 | 51), objArr129);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cGreen2, mirror2, i206, -1142834547, false, (String) objArr129[0], null);
            }
            Object[] objArr130 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).get(null);
            objArr14 = new Object[]{new int[1], new int[]{((int[]) objArr130[1])[0]}, (Object[]) objArr130[2], new int[]{((int[]) objArr130[3])[0]}, (String[]) objArr130[4]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i207 = ~iIdentityHashCode9;
            int i208 = ((((((~((-1308551886) | i207)) | (~((-465527759) | iIdentityHashCode9))) | (~(i207 | 465527758))) * 959) - 376817626) + (((~(iIdentityHashCode9 | 465527758)) | ((~(i207 | (-465527759))) | (~((-1308551886) | iIdentityHashCode9)))) * 959)) - 921923823;
            int i209 = (i208 << 13) ^ i208;
            int i210 = i209 ^ (i209 >>> 17);
            ((int[]) objArr14[0])[0] = i210 ^ (i210 << 5);
        } else {
            Context applicationContext6 = (Context) Class.forName(str10).getMethod(str5, new Class[0]).invoke(null, null);
            if (applicationContext6 != null) {
                if ((applicationContext6 instanceof ContextWrapper) && ((ContextWrapper) applicationContext6).getBaseContext() == null) {
                    str5 = str4;
                    applicationContext6 = null;
                } else {
                    str5 = str4;
                    str5 = str4;
                    applicationContext6 = applicationContext6.getApplicationContext();
                }
            }
            str5 = str4;
            Object[] objArr131 = {applicationContext6, Integer.valueOf(((Integer) Class.forName(str8).getMethod(str, Object.class).invoke(null, this)).intValue()), 0, -921923823};
            byte[] bArr35 = $$d;
            byte b75 = bArr35[213];
            Object[] objArr132 = new Object[1];
            d(b75, b75, (byte) (-bArr35[30]), objArr132);
            Class<?> cls7 = Class.forName((String) objArr132[0]);
            Object[] objArr133 = new Object[1];
            d(bArr35[38], (short) 417, bArr35[24], objArr133);
            Object[] objArr134 = (Object[]) cls7.getMethod((String) objArr133[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr131);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                char bitsPerPixel5 = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 922;
                int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0) + 28;
                byte[] bArr36 = $$a;
                byte b76 = (byte) (bArr36[33] - 1);
                byte b77 = bArr36[7];
                Object[] objArr135 = new Object[1];
                c(b76, b77, (short) (b77 | 51), objArr135);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(bitsPerPixel5, iLastIndexOf4, absoluteGravity4, -1142834547, false, (String) objArr135[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, objArr134);
            try {
                long jLongValue17 = ((Long) Class.forName(str6).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf21 = Long.valueOf(jLongValue17);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                    char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(""));
                    int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 921;
                    int iGreen2 = Color.green(0) + 28;
                    byte[] bArr37 = $$a;
                    byte b78 = bArr37[7];
                    Object[] objArr136 = new Object[1];
                    c(b78, b78, bArr37[5], objArr136);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cAxisFromString, iResolveSizeAndState2, iGreen2, -778300370, false, (String) objArr136[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf21);
                Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char packedPositionGroup5 = (char) (31533 - ExpandableListView.getPackedPositionGroup(0L));
                    int iResolveOpacity4 = Drawable.resolveOpacity(0, 0) + 921;
                    int iLastIndexOf5 = 27 - TextUtils.lastIndexOf("", '0', 0);
                    Object[] objArr137 = new Object[1];
                    c((byte) 52, (byte) ($$b >>> 1), $$a[5], objArr137);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(packedPositionGroup5, iResolveOpacity4, iLastIndexOf5, -1048449946, false, (String) objArr137[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, lValueOf22);
                objArr14 = objArr134;
            } catch (Exception unused11) {
                throw new RuntimeException();
            }
        }
        int i211 = ((int[]) objArr14[1])[0];
        int i212 = ((int[]) objArr14[3])[0];
        if (i212 == i211) {
            int i213 = ((int[]) objArr14[0])[0];
            objArr15 = new Object[]{new int[1], new int[]{((int[]) objArr14[1])[0]}, (Object[]) objArr14[2], new int[]{((int[]) objArr14[3])[0]}, (String[]) objArr14[4]};
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i214 = ~iIdentityHashCode10;
            int i215 = i213 + (-1897539543) + (((~(1011706354 | i214)) | 19956745) * (-108)) + (((~(i214 | 762373289)) | (~((-762373290) | iIdentityHashCode10)) | 269289810) * 54) + ((iIdentityHashCode10 | 269289810) * 54);
            int i216 = (i215 << 13) ^ i215;
            int i217 = i216 ^ (i216 >>> 17);
            c7 = 0;
            ((int[]) objArr15[0])[0] = i217 ^ (i217 << 5);
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr19 = (String[]) objArr14[4];
            if (strArr19 != null) {
                for (String str19 : strArr19) {
                    arrayList8.add(str19);
                }
            }
            int[] iArr13 = new int[i212];
            int i218 = i212 - 1;
            iArr13[i218] = 1;
            Toast.makeText((Context) null, iArr13[((i212 * i218) % 2) - 1], 1).show();
            int i219 = ((int[]) objArr14[0])[0];
            objArr15 = new Object[]{new int[1], new int[]{((int[]) objArr14[1])[0]}, (Object[]) objArr14[2], new int[]{((int[]) objArr14[3])[0]}, (String[]) objArr14[4]};
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i220 = 1932536297 + (((~((-140937054) | iIdentityHashCode11)) | 136314945 | (~(1633142590 | iIdentityHashCode11))) * (-754));
            int i221 = ~((-136314946) | iIdentityHashCode11);
            int i222 = ~iIdentityHashCode11;
            int i223 = i219 + i220 + ((i221 | (~(1769457535 | i222))) * (-754)) + ((i222 | (-140937054)) * 754);
            int i224 = (i223 << 13) ^ i223;
            int i225 = i224 ^ (i224 >>> 17);
            c7 = 0;
            ((int[]) objArr15[0])[0] = i225 ^ (i225 << 5);
        }
        ((Field) attachTimestamp.TuitionPaymentFragmentspecialinlinedviewModeldefault1[c7]).setInt(null, onCaptureSessionStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new int[]{1013878319, 1632374904, 1241841375}, ((int[]) objArr15[c7])[c7], Integer.MAX_VALUE) - (-1379000174));
        zzapVar.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        View viewOnCreateView = this.zza.onCreateView(layoutInflater, viewGroup, bundle);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return viewOnCreateView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.onDestroy();
        super.onDestroy();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.onDestroyView();
            super.onDestroyView();
        } else {
            this.zza.onDestroyView();
            super.onDestroyView();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.onLowMemory();
        super.onLowMemory();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.onPause();
        super.onPause();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        int i = 2 % 2;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            zzap zzapVar = this.zza;
            zzap.zza(zzapVar, activity);
            zzapVar.onInflate(activity, new Bundle(), bundle);
            StrictMode.setThreadPolicy(threadPolicy);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1591026252
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Fragment
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaFragment.onResume():void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[PHI: r1
  0x0021: PHI (r1v5 java.lang.ClassLoader) = (r1v4 java.lang.ClassLoader), (r1v6 java.lang.ClassLoader) binds: [B:8:0x001f, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ClassLoader classLoader;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        if (i3 % 2 != 0) {
            classLoader = StreetViewPanoramaFragment.class.getClassLoader();
            int i4 = 68 / 0;
            if (bundle != null) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                if (i % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (classLoader != null) {
                    bundle.setClassLoader(classLoader);
                }
            }
        } else {
            classLoader = StreetViewPanoramaFragment.class.getClassLoader();
            if (bundle != null) {
                i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                if (i % 2 == 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (classLoader != null) {
                    bundle.setClassLoader(classLoader);
                }
            }
        }
        super.onSaveInstanceState(bundle);
        this.zza.onSaveInstanceState(bundle);
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.setArguments(bundle);
        if (i3 != 0) {
            throw null;
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1570744352
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override // android.app.Fragment
    public void onStart() {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaFragment.onStart():void");
    }

    @Override // android.app.Fragment
    public void onStop() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.zza.onStop();
        super.onStop();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        int i = 2 % 2;
        StreetViewPanoramaFragment streetViewPanoramaFragment = new StreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        streetViewPanoramaFragment.setArguments(bundle);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return streetViewPanoramaFragment;
    }

    static {
        byte[] bArr = new byte[537];
        System.arraycopy("SüÉïóö\u0006\u0015ç\u0006ïÿ\u0003\r\u0018ìó\rú\u0002ó-Í\u0004\u000fó\u0004\rõ\u0019Ú\u000bú\f\u0003ñ\u000b\u0006\u0017ëô\u000bþ\u0003/ß\fõ\u000bú\u0001\u001eïè\f\b÷ú.Ô\u0011úú\b÷ú\u0001\u0003\u000b\u0002ú\bõ\u0003û\u0002\u0003û\t\u0001î\r\u0004î*Þ\u000bÿù\bÿÿ\u0005ì\tøAô\u0002?Ê\u0003í\u0013ýõ\b9Íó\nò\u0003\u0006\u00056¼ý\b?Åûú\u000fó\u0004\rõ>Êõ\u0002\føû@»\u0010ôÿ\u000b7ÜÝ\b,Þï\u000bú\u0001\u001bðôÿ\u000bA±\u000e÷\n#Þï\u000bú\u0001Jò\u000eòß\fõ\u000bú\u0001\u001eïè\f\b÷ú.Ô\u0011úú\b÷ú\u0012ùû\nûû\u0007\u001eÛ\bú\u000bí\u000fóAô\u0002?Çø\u0000\bû\u00077Íó\nò\u0003\u0006\u00056Â\u0003\u0007ð\u0011ï\t\u0004òE¾\u0004\u000bþþòEÅûú\u000fó\u0004\rõ>´\u0000\u0018ø\u0003ß\fõ\u000bú\u0001\u001eïè\f\b÷ú.Ô\u0011úú\b÷ú\u0001\u0003\u000b\u0002ú\bõ\u0003û\u0002\u0003û\t\u0001î\r\u0004î*Þ\u000bÿù\bÿÿ\u0005ì\tøCô\u0002?»\u0002ü\u0014ï\rð\u0005B¿\u0004\u0003ô\u0000\u0004BÅûú\u000fó\u0004\rõ>Æô\u0000\u0004BæÔ\u0000\u0004+×\u0007þû\tAòô\u0002?Çø\u0000\bû\u00077Íó\nò\u0003\u0006\u00056ÇúúEË÷ýú\u0011÷\bò\u0000\u0012úþû\u00079åüèò\u0000\u000e÷\u0007\u0002ó/Ô\u0002ý\u000fíPÔÞ\u0003÷ÿô\u0002?Íó\nò\u0003\u0006\u00056¸\u0007\u0003\u0000\u0007ìKíÎú\u000b\u000b\u0011íôü\u0010òÿ#Ü\u0010ð\u0010AÐìö\u0003ø\u000eû\u0007$âþû\u0003üû\b\u0003û@»\u000eôü\u0010÷\u000bþòEÛîôü\u0010÷\u000bþò(×\u0015\u0000\u0000\fîôü\u0010÷\u000bþò(×P·\u0004ûù\u0002Oó\r\u0000ßÍ\u0004\u000fó\u0004\rõ\u0019Ú\u000bú\f\u0003ñ\u000b\u0006\u0017ëô\u000bþ\u00031".getBytes("ISO-8859-1"), 0, bArr, 0, 537);
        $$d = bArr;
        $$e = 65;
        $$a = new byte[]{97, 58, 103, -72, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24};
        $$b = 28;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new char[]{38071, 1815, 46060, 12201, 55813, 30420, 58024, 40241, 2511, 42369, 20592, 52349, 30883, 60246, 34608, 13310, 44624, 23072, 63212, 24914, 7470, 35301, 9646, 53258, 19679, 63653, 18909, 55908, 28306, 62145, 1895, 43963, 16336, 16438, 54454, 30953, 36100, 4434, 42473, 13884, 23128, 61078, 29473, 34639, 62263, 24723, 54389, 18481, 48591, 4442, 34086, 64250, 28226, 49748, 14296, 43937, 7962, 36042, 57514, 21617, 45557, 8791, 38567, 2815, 65364, 21406, 51186, 47148, 11436, 32986, 30009, 59761, 24043, 52752, 41578, 5816, 7603, 36371, 15080, 42669, 21249, 65488, 27564, 5173, 32965, 11398, 55594, 17668, 61855, 25154, 3636, 47862, 10063, 54030, 32752, 59456, 37917, 226, 15597, 44875, 7095, 34805, 29255, 56966, 19190, 13587, 41365, 3534, 63538, 25721, 53461, 17158, 12159, 45486, 8790, 38564, 2800, 65345, 21397, 51168, 47203, 11485, 32989, 29996, 59692, 24013, 52762, 41583, 5864, 35675, 32562, 54244, 17412, 14341, 44272, 161, 62791, 27025, 56764, 20024, 8920, 38539, 2859, 65322, 21396, 50245, 47218, 11408, 33096, 30001, 59878, 23134, 52820, 41634, 5806, 35614, 32705, 54254, 17466, 14557, 44168, 301, 62931, 27018, 55840, 20004, 8863, 38724, 2919, 65517, 20563, 50190, 47275, 11514, 33097, 30156, 59887, 45567, 8786, 38566, 2727, 65296, 21442, 51172, 47202, 11393, 32989, 30074, 59771, 24013, 52813, 41576, 5865, 35678, 32560, 54244, 17490, 14341, 44272, 240, 62739, 27030, 56767, 20024, 8912, 38539, 2934, 65319, 21397, 50245, 47217, 11415, 33088, 30004, 59826, 23047, 52743, 41718, 5886, 35660, 32719, 54207, 17515, 14557, 44174, 373, 62848, 27019, 55928, 20082, 8851, 38725, 2871, 65463, 20493, 50184, 47357, 11513, 33055, 30152, 59883};
        b = 5330554087015391795L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, byte r8, short r9) {
        /*
            byte[] r0 = com.google.android.gms.maps.StreetViewPanoramaFragment.$$c
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r9 = r9 * 3
            int r9 = 115 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaFragment.$$g(int, byte, short):java.lang.String");
    }
}

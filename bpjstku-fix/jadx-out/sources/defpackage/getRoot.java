package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.android.volley.toolbox.HttpHeaderParser;
import com.bumptech.glide.request.BaseRequestOptions;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.snap.params.CreditCardPaymentParams;
import com.midtrans.sdk.corekit.utilities.CustomTypeAdapter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.ByteCompanionObject;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes.dex */
public final class getRoot {
    private static final byte[] $$c = {111, 40, 23, -13};
    private static final int $$f = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, ByteCompanionObject.MIN_VALUE, -37, -48, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 169;
    private static final byte[] $$a = {5, -91, 77, 46, -16, 15, 0, 11};
    private static final int $$b = 70;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -9032639136594788307L;
    private static int TuitionPaymentFragmentbindingInflater1 = -981105359;
    private static char b = 34097;

    public static final class TuitionPaymentFragmentbindingInflater1 implements Interceptor {
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) throws IOException {
            return chain.proceed(chain.request().newBuilder().addHeader(HttpHeaderParser.HEADER_CONTENT_TYPE, "application/json").addHeader("Accept", "application/json").build());
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Interceptor {
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) throws IOException {
            return chain.proceed(chain.request().newBuilder().addHeader(HttpHeaderParser.HEADER_CONTENT_TYPE, "application/json").addHeader("Accept", "application/json").addHeader("X-Source", "mobile-android").addHeader("X-Source-Version", "android-1.29.3").addHeader("X-Service", "snap").build());
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.getRoot.$$a
            int r8 = r8 * 3
            int r8 = r8 + 98
            int r7 = r7 * 4
            int r7 = 5 - r7
            int r9 = r9 * 4
            int r9 = 4 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r8 = r8 + r9
            int r9 = r3 + 1
            int r8 = r8 + 3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getRoot.a(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r6 = r6 * 52
            int r6 = r6 + 1
            int r8 = r8 + 84
            byte[] r0 = defpackage.getRoot.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r5 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            r3 = r0[r7]
        L28:
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getRoot.c(short, short, byte, java.lang.Object[]):void");
    }

    public static OkHttpClient TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) throws Throwable {
        int i2;
        int i3;
        String string;
        Method method;
        int i4 = 2 % 2;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        ArrayList arrayList = new ArrayList();
        byte b2 = $$a[6];
        byte b3 = b2;
        Object[] objArr = new Object[1];
        a(b2, b3, b3, objArr);
        int i5 = 0;
        Method[] methodArr = {OkHttpClient.Builder.class.getMethod((String) objArr[0], new Class[0])};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int minimumFlingVelocity = 2823 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iResolveOpacity = 22 - Drawable.resolveOpacity(0, 0);
            byte[] bArr = $$d;
            byte b4 = (byte) (-bArr[5]);
            Object[] objArr2 = new Object[1];
            c(b4, b4, bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, minimumFlingVelocity, iResolveOpacity, 1814927978, false, (String) objArr2[0], null);
        }
        long j = 0;
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
            Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myPid() >> 22), KeyEvent.normalizeMetaState(0) + 2823, Color.blue(0) + 22)).getDeclaredMethods();
            int length = declaredMethods.length;
            int i6 = 0;
            while (i6 < length) {
                Method method2 = declaredMethods[i6];
                try {
                    Object[] objArr3 = new Object[1];
                    d(new char[]{34076, 11135, 29692, 9691}, new char[]{33159, 8780, 8473, 31670}, (char) (TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(j), new char[]{27966, 6519, 57124, 41595, 24906, 30880, 18251, 31430, 31466, 24906, 34902, 62275, 55090, 29744, 4283, 39138, 4511, 46790, 48065, 31133, 34425, 46094, 46810, 33290}, objArr3);
                    Class<?> cls = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    d(new char[]{34076, 11135, 29692, 9691}, new char[]{33311, 56422, 3591, 16552}, (char) KeyEvent.keyCodeFromString(""), 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{20383, 1818, 36849, 47002, 54704, 24010, 27576, 25343, 47027, 65030, 41637, 8330}, objArr4);
                    Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], null).invoke(method2, null)).intValue())};
                    Object[] objArr6 = new Object[1];
                    d(new char[]{34076, 11135, 29692, 9691}, new char[]{32662, 'R', 65294, 27932}, (char) (KeyEvent.getDeadChar(0, 0) + 7423), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{15981, 41955, 25936, 55089, 33523, 34679, 44280, 62828, 49600, 63917, 54862, 53245, 6744, 35552, 20699, 57649, 42928, 34116, 10189, 10415, 40507, 9582, 59252, 3777, 25613, 37562}, objArr6);
                    Class<?> cls2 = Class.forName((String) objArr6[0]);
                    Method[] methodArr2 = declaredMethods;
                    Object[] objArr7 = new Object[1];
                    d(new char[]{34076, 11135, 29692, 9691}, new char[]{57636, 18077, 48222, 57181}, (char) Color.red(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{28207, 52597, 33095, 9297, 59805, 44570, 31927, 62957}, objArr7);
                    if (((Boolean) cls2.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).booleanValue()) {
                        Class cls3 = Long.TYPE;
                        Object[] objArr8 = new Object[1];
                        d(new char[]{34076, 11135, 29692, 9691}, new char[]{33159, 8780, 8473, 31670}, (char) TextUtils.getCapsMode("", 0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{27966, 6519, 57124, 41595, 24906, 30880, 18251, 31430, 31466, 24906, 34902, 62275, 55090, 29744, 4283, 39138, 4511, 46790, 48065, 31133, 34425, 46094, 46810, 33290}, objArr8);
                        Class<?> cls4 = Class.forName((String) objArr8[0]);
                        Object[] objArr9 = new Object[1];
                        d(new char[]{34076, 11135, 29692, 9691}, new char[]{19285, 7018, 12843, 39795}, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 29490), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 723216971, new char[]{62249, 34273, 28069, 43507, 32479, 12841, 23774, 19969, 41555, 25053, ':', 56996, 14317}, objArr9);
                        if (!cls3.equals(cls4.getMethod((String) objArr9[0], null).invoke(method2, null))) {
                            continue;
                        } else {
                            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                            int i8 = i7 % 2;
                            Object[] objArr10 = new Object[1];
                            d(new char[]{34076, 11135, 29692, 9691}, new char[]{33159, 8780, 8473, 31670}, (char) View.MeasureSpec.getMode(0), TextUtils.getCapsMode("", 0, 0), new char[]{27966, 6519, 57124, 41595, 24906, 30880, 18251, 31430, 31466, 24906, 34902, 62275, 55090, 29744, 4283, 39138, 4511, 46790, 48065, 31133, 34425, 46094, 46810, 33290}, objArr10);
                            Class<?> cls5 = Class.forName((String) objArr10[0]);
                            Object[] objArr11 = new Object[1];
                            d(new char[]{34076, 11135, 29692, 9691}, new char[]{25128, 7169, 48275, 13584}, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4284), (-1826881182) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{51409, 46398, 51146, 36033, 3356, 49416, 14889, 50969, 20356, 49243, 53124, 6684, 47861, 57400, 51342, 55073, 45924}, objArr11);
                            Object[] objArr12 = (Object[]) cls5.getMethod((String) objArr11[0], null).invoke(method2, null);
                            if (objArr12.length == 2 && Long.TYPE.equals(objArr12[0])) {
                                Object[] objArr13 = new Object[1];
                                d(new char[]{34076, 11135, 29692, 9691}, new char[]{33159, 8780, 8473, 31670}, (char) Drawable.resolveOpacity(0, 0), View.MeasureSpec.getSize(0), new char[]{27966, 6519, 57124, 41595, 24906, 30880, 18251, 31430, 31466, 24906, 34902, 62275, 55090, 29744, 4283, 39138, 4511, 46790, 48065, 31133, 34425, 46094, 46810, 33290}, objArr13);
                                if (Class.forName((String) objArr13[0]).equals(objArr12[1])) {
                                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                                    int i10 = i9 % 2;
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                        int mode = 2823 - View.MeasureSpec.getMode(0);
                                        int i11 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                                        byte[] bArr2 = $$d;
                                        byte b5 = (byte) (-bArr2[5]);
                                        Object[] objArr14 = new Object[1];
                                        c(b5, b5, bArr2[7], objArr14);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(pressedStateDuration, mode, i11, 1814927978, false, (String) objArr14[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                        int iBlue = Color.blue(0) + 2823;
                                        int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0);
                                        byte[] bArr3 = $$d;
                                        byte b6 = (byte) (-bArr3[5]);
                                        Object[] objArr15 = new Object[1];
                                        c(b6, b6, bArr3[7], objArr15);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollDefaultDelay, iBlue, iIndexOf, 1814927978, false, (String) objArr15[0], null);
                                    }
                                    try {
                                        Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                            int iMyTid = 2823 - (Process.myTid() >> 22);
                                            int mirror = 'F' - AndroidCharacter.getMirror('0');
                                            byte[] bArr4 = $$d;
                                            byte b7 = bArr4[7];
                                            Object[] objArr17 = new Object[1];
                                            c(b7, b7, bArr4[54], objArr17);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, iMyTid, mirror, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr16)).longValue();
                                        break;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    i6++;
                    declaredMethods = methodArr2;
                    i5 = 0;
                    j = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2822;
            int iIndexOf2 = TextUtils.indexOf("", "") + 22;
            byte[] bArr5 = $$d;
            byte b8 = (byte) (-bArr5[5]);
            Object[] objArr18 = new Object[1];
            c(b8, b8, bArr5[7], objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, i12, iIndexOf2, 1814927978, false, (String) objArr18[0], null);
        }
        Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int i13 = 2824 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int bitsPerPixel = 21 - ImageFormat.getBitsPerPixel(0);
            byte b9 = $$d[7];
            byte b10 = b9;
            Object[] objArr20 = new Object[1];
            c(b9, b10, (byte) (b10 | 14), objArr20);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i13, bitsPerPixel, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
        }
        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
        Object[] objArr21 = {0, methodArr, null};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char cCombineMeasuredStates = (char) (37657 - View.combineMeasuredStates(0, 0));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2720;
            int iLastIndexOf = 18 - TextUtils.lastIndexOf("", '0', 0);
            byte b11 = $$d[7];
            byte b12 = b11;
            Object[] objArr22 = new Object[1];
            c(b11, b12, (byte) (b12 | 14), objArr22);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cCombineMeasuredStates, scrollBarSize, iLastIndexOf, -1568796068, false, (String) objArr22[0], new Class[]{Integer.TYPE, Method[].class, List.class});
        }
        long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
        long j2 = -1126285908;
        long j3 = (((long) (-589)) * j2) + (((long) 591) * jLongValue);
        long j4 = 590;
        long j5 = -1;
        long j6 = jLongValue ^ j5;
        long j7 = i;
        long j8 = j7 ^ j5;
        long j9 = ((j6 | j8) ^ j5) | ((j6 | j2) ^ j5) | ((j8 | j2) ^ j5);
        long j10 = j2 ^ j5;
        long j11 = j3 + ((j9 | (((j10 | jLongValue) | j7) ^ j5)) * j4) + (((long) (-1180)) * j9) + (j4 * (((j10 | j8) ^ j5) | ((j8 | jLongValue) ^ j5))) + ((long) (-684119937));
        int i14 = (int) Runtime.getRuntime().totalMemory();
        int i15 = ~i14;
        int i16 = (((int) (j11 >> 32)) & ((-272363754) + ((i14 | 545276932) * 988) + (((~(2022884431 | i15)) | (-2063265520)) * (-1976)) + (((~(i14 | 585658020)) | 545276932 | (~((-585658021) | i15))) * 988))) | (((int) j11) & ((-501357939) + (((~((-993830597) | i)) | 722993792) * 336) + (((~(1863910289 | i)) | (-2134747094)) * (-168)) + (((-993830597) | (~(1863910289 | (~i)))) * 168)));
        int i17 = i16 >>> 24;
        int i18 = i16 & ViewCompat.MEASURED_SIZE_MASK;
        if (i17 != 0) {
            int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
            i2 = 1;
            i3 = (i19 % 2 == 0 ? 1 : 0) ^ 1;
        } else {
            i2 = 1;
            i3 = 0;
        }
        if (i3 == 0 || i18 >= i2 || (method = methodArr[i18]) == null) {
            string = null;
        } else {
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
            if (i20 % 2 != 0) {
                method.toString();
                throw null;
            }
            string = method.toString();
        }
        arrayList.add(string);
        if ((i17 + 6) * i3 != 0) {
            throw new RuntimeException(String.valueOf(i));
        }
        HttpLoggingInterceptor httpLoggingInterceptorTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (BaseRequestOptions.TuitionPaymentFragmentbindingInflater1(new ArrayList()) != 0) {
            throw null;
        }
        OkHttpClient.Builder builderAddInterceptor = builder.addInterceptor(httpLoggingInterceptorTuitionPaymentFragmentspecialinlinedviewModeldefault1).addInterceptor(new TuitionPaymentFragmentbindingInflater1());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builderAddInterceptor.connectTimeout(j7, timeUnit).readTimeout(j7, timeUnit).writeTimeout(j7, timeUnit).build();
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionGroup = (char) (8328 - ExpandableListView.getPackedPositionGroup(0L));
                    int maxKeyCode = 1235 - (KeyEvent.getMaxKeyCode() >> 16);
                    int iGreen = Color.green(i3) + 35;
                    byte b2 = (byte) i3;
                    byte b3 = (byte) (b2 - 1);
                    String str$$g = $$g(b2, b3, (byte) (b3 + 3));
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, maxKeyCode, iGreen, -653973969, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) i3;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.keyCodeFromString(""), 2763 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14, 1504416861, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getEdgeSlop() >> 16)), 253 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 22 - Drawable.resolveOpacity(0, 0), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.myPid() >> 22) + 65200), TextUtils.indexOf((CharSequence) "", '0', 0) + 2892, Drawable.resolveOpacity(0, 0) + 17, 2012627446, false, $$g(b6, b7, (byte) (-b7)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i4 = $11 + 57;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 2;
                }
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i6 = $10 + 77;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Gson TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        Gson gsonCreate = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.IDENTITY).registerTypeAdapter(Date.class, new DateTypeAdapter()).registerTypeAdapter(CreditCardPaymentParams.class, new CustomTypeAdapter()).setLenient().create();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return gsonCreate;
    }

    public static HttpLoggingInterceptor TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        HttpLoggingInterceptor.Level level;
        int i;
        int i2 = 2 % 2;
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        if (!Logger.enabled) {
            level = HttpLoggingInterceptor.Level.NONE;
            i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        } else {
            level = HttpLoggingInterceptor.Level.BODY;
            i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        int i3 = i % 2;
        httpLoggingInterceptor.setLevel(level);
        return httpLoggingInterceptor;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r7 = r7 + 4
            byte[] r1 = defpackage.getRoot.$$c
            int r8 = 104 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r4 = r1[r8]
            int r3 = r3 + 1
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getRoot.$$g(short, short, byte):java.lang.String");
    }
}

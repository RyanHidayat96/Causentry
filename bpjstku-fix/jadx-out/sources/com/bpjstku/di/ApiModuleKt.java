package com.bpjstku.di;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
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
import com.bpjstku.data.lib.HeaderInterceptor;
import com.bpjstku.data.lib.OkHttpClientFactory;
import com.bpjstku.data.lib.ParameterInterceptor;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.SessionAuthenticator;
import com.bpjstku.di.ApiModuleKt;
import defpackage.CoordinateTransform;
import defpackage.FileTransformFactory;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.SessionProcessor;
import defpackage.ZoomGestureDetectorZoomEventEnd;
import defpackage.ZoomGestureDetectorZoomEventMove;
import defpackage.ZoomGestureDetectorgestureDetector1;
import defpackage.initSession;
import defpackage.isLenovoTablet;
import defpackage.recreateImageReaderProxy;
import defpackage.setSessionType;
import defpackage.setUsingExifOrientation;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0087 ¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0000H\u0087 ¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u0000H\u0087 ¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u0000H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u0000H\u0087 ¢\u0006\u0004\b\u0006\u0010\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u0000H\u0087 ¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u0010\u0010\b\u001a\u00020\u0000H\u0087 ¢\u0006\u0004\b\b\u0010\u0002\u001a\u0010\u0010\t\u001a\u00020\u0000H\u0087 ¢\u0006\u0004\b\t\u0010\u0002\u001a\u0010\u0010\n\u001a\u00020\u0000H\u0087 ¢\u0006\u0004\b\n\u0010\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u0000H\u0087 ¢\u0006\u0004\b\u000b\u0010\u0002\u001a\u0010\u0010\f\u001a\u00020\u0000H\u0087 ¢\u0006\u0004\b\f\u0010\u0002\"\u001a\u0010\u0012\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"", "getDevBaseUrl", "()Ljava/lang/String;", "getReleaseBaseUrl", "getAppSignature", "getContentKeyDigest", "getMidtransClientKeySandbox", "getMidtransClientKey", "getCertificatePublicKey", "getMainSubdomain", "getClaimPmiSaltKey", "getApikeyVida", "getLicenseVida", "LisLenovoTablet;", "TuitionPaymentFragmentbindingInflater1", "LisLenovoTablet;", "b", "()LisLenovoTablet;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ApiModuleKt {
    private static final isLenovoTablet TuitionPaymentFragmentbindingInflater1;

    public static final native String getApikeyVida();

    public static final native String getAppSignature();

    public static final native String getCertificatePublicKey();

    public static final native String getClaimPmiSaltKey();

    public static final native String getContentKeyDigest();

    public static final native String getDevBaseUrl();

    public static final native String getLicenseVida();

    public static final native String getMainSubdomain();

    public static final native String getMidtransClientKey();

    public static final native String getMidtransClientKeySandbox();

    public static final native String getReleaseBaseUrl();

    static {
        Function1 function1 = new Function1() { // from class: getRccStateFromState
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ApiModuleKt.TuitionPaymentFragmentspecialinlinedviewModeldefault3((isLenovoTablet) obj);
            }
        };
        isLenovoTablet islenovotablet = new isLenovoTablet(false, false);
        function1.invoke(islenovotablet);
        TuitionPaymentFragmentbindingInflater1 = islenovotablet;
    }

    public static final isLenovoTablet b() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    public static final class TuitionPaymentFragmentbindingInflater1 {
        private static int TuitionPaymentFragmentbindingInflater1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f417a;
        private static short[] asBinder;
        private static long b;
        private static int d;
        private static byte[] g;
        private static final byte[] $$a = {22, 102, 43, -6, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
        private static final int $$b = 251;
        private static final byte[] asInterface = {51, -99, -8, -59, -14, -13, -13, -11, 41, -15, -17, -2, 12, -41, -5, -28, 5, -29, -19};
        private static final int notify = 203;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.bpjstku.di.ApiModuleKt.TuitionPaymentFragmentbindingInflater1.asInterface
                int r7 = r7 * 4
                int r7 = r7 + 98
                int r6 = r6 * 5
                int r6 = 8 - r6
                int r8 = r8 * 5
                int r1 = 11 - r8
                byte[] r1 = new byte[r1]
                int r8 = 10 - r8
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r8
                r4 = r2
                goto L2f
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                int r6 = r6 + 1
                r3 = r0[r6]
                r5 = r3
                r3 = r7
                r7 = r5
            L2f:
                int r7 = -r7
                int r3 = r3 + r7
                int r7 = r3 + (-12)
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.di.ApiModuleKt.TuitionPaymentFragmentbindingInflater1.c(int, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void h(byte r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r8 = r8 + 84
                byte[] r0 = com.bpjstku.di.ApiModuleKt.TuitionPaymentFragmentbindingInflater1.$$a
                int r9 = r9 * 2
                int r9 = 53 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r8 = r7
                r3 = r9
                r5 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2d:
                int r7 = -r7
                int r8 = r8 + 1
                int r3 = r3 + r7
                int r7 = r3 + (-10)
                r3 = r5
                r6 = r8
                r8 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.di.ApiModuleKt.TuitionPaymentFragmentbindingInflater1.h(byte, int, byte, java.lang.Object[]):void");
        }

        TuitionPaymentFragmentbindingInflater1() throws Throwable {
            byte b2 = (byte) (notify & 5);
            byte b3 = (byte) (b2 - 1);
            Object[] objArr = new Object[1];
            c(b2, b3, (byte) (b3 + 1), objArr);
            TuitionPaymentFragmentbindingInflater1((String) objArr[0]);
        }

        private static InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault2(InputStream inputStream, int i, int i2, int i3, byte[] bArr) throws IOException {
            long j = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return new setSessionType(inputStream, new int[]{((int) (j >>> 32)) ^ i, i ^ ((int) j)}, bArr, i2, i2 <= 6, i3);
        }

        private static void e(char[] cArr, char c, int i, char[] cArr2, char[] cArr3, Object[] objArr) {
            SessionProcessor sessionProcessor = new SessionProcessor();
            int length = cArr2.length;
            char[] cArr4 = new char[length];
            int length2 = cArr.length;
            char[] cArr5 = new char[length2];
            System.arraycopy(cArr2, 0, cArr4, 0, length);
            System.arraycopy(cArr, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length3 = cArr3.length;
            char[] cArr6 = new char[length3];
            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
                int i2 = (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 2) % 4;
                int i3 = (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3) % 4;
                sessionProcessor.b = (char) (((cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[i3] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (b ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
            }
            objArr[0] = new String(cArr6);
        }

        private static void f(int i, short s, byte b2, int i2, int i3, Object[] objArr) {
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            int i4 = i2 + ((int) (((long) f417a) ^ 3046761265686732006L));
            int i5 = i4 == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = g;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        bArr2[i6] = (byte) (((long) bArr[i6]) ^ 3046761265686732006L);
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    i4 = (byte) (((byte) (((long) g[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) f417a) ^ 3046761265686732006L)));
                } else {
                    i4 = (short) (((short) (((long) asBinder[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) f417a) ^ 3046761265686732006L)));
                }
            }
            if (i4 > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + i4) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)) + i5;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (((int) (((long) d) ^ 3046761265686732006L)) + i);
                sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr3 = g;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i7 = 0; i7 < length2; i7++) {
                        bArr4[i7] = (byte) (((long) bArr3[i7]) ^ 3046761265686732006L);
                    }
                    bArr3 = bArr4;
                }
                boolean z = bArr3 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i4) {
                    if (z) {
                        byte[] bArr5 = g;
                        int i8 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i8 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr5[i8]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = asBinder;
                        int i9 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i9 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i9]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:170:0x0e49 A[Catch: all -> 0x0e5b, DONT_GENERATE, TRY_ENTER, TryCatch #17 {, blocks: (B:170:0x0e49, B:172:0x0e4b, B:173:0x0e50, B:175:0x0e52, B:177:0x0e59, B:178:0x0e5a, B:168:0x0dea), top: B:213:0x0dea, inners: #10 }] */
        /* JADX WARN: Code duplicated, block: B:172:0x0e4b A[Catch: all -> 0x0e5b, TryCatch #17 {, blocks: (B:170:0x0e49, B:172:0x0e4b, B:173:0x0e50, B:175:0x0e52, B:177:0x0e59, B:178:0x0e5a, B:168:0x0dea), top: B:213:0x0dea, inners: #10 }] */
        /* JADX WARN: Code duplicated, block: B:206:0x095c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:213:0x0dea A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x09b4 A[Catch: all -> 0x09c6, DONT_GENERATE, TRY_ENTER, TryCatch #5 {, blocks: (B:86:0x09b4, B:88:0x09b6, B:89:0x09bb, B:91:0x09bd, B:93:0x09c4, B:94:0x09c5, B:84:0x095c), top: B:206:0x095c, inners: #18 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x09b6 A[Catch: all -> 0x09c6, TryCatch #5 {, blocks: (B:86:0x09b4, B:88:0x09b6, B:89:0x09bb, B:91:0x09bd, B:93:0x09c4, B:94:0x09c5, B:84:0x095c), top: B:206:0x095c, inners: #18 }] */
        private static void TuitionPaymentFragmentbindingInflater1(String str) throws Throwable {
            Object objNewInstance;
            Object objInvoke;
            Object objInvoke2;
            ClassLoader classLoader;
            String str2;
            Object objInvoke3;
            ClassLoader classLoader2;
            String str3;
            Object[] objArr = new Object[1];
            e(new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, new char[]{38210, 48691, 36931, 580}, new char[]{47645, 9120, 31965, 58102, 21325, 43604, 57944, 44544, 44154, 62622}, objArr);
            String str4 = (String) objArr[0];
            Object[] objArr2 = new Object[1];
            e(new char[]{0, 0, 0, 0}, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, new char[]{43646, 61965, 21665, 50640}, new char[]{37239, 36017, 61015, 18973, 3694, 19952, 643, 63914, 29473, 24280, 53128, 60181, 48030, 41577, 44743, 38511, 15468, 32023, 5220, 37899, 51392, 65068}, objArr2);
            try {
                Object objNewInstance2 = File.class.getDeclaredConstructor(String.class).newInstance((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                f((-1381255101) - Color.rgb(0, 0, 0), (short) Drawable.resolveOpacity(0, 0), (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) - 68, KeyEvent.getDeadChar(0, 0) + 320094657, objArr3);
                if (!((Boolean) File.class.getMethod((String) objArr3[0], null).invoke(objNewInstance2, null)).booleanValue()) {
                    Object[] objArr4 = new Object[1];
                    f(View.getDefaultSize(0, 0) - 1364477878, (short) TextUtils.getOffsetAfter("", 0), (byte) Gravity.getAbsoluteGravity(0, 0), Color.alpha(0) - 62, 320094665 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr4);
                    String str5 = (String) objArr4[0];
                    objNewInstance2 = File.class.getDeclaredConstructor(String.class).newInstance(System.getProperty(str5, str5));
                    Object[] objArr5 = new Object[1];
                    f((-1364477886) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) Drawable.resolveOpacity(0, 0), (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) - 68, 320094657 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr5);
                    if (!((Boolean) File.class.getMethod((String) objArr5[0], null).invoke(objNewInstance2, null)).booleanValue()) {
                        objNewInstance2 = Environment.getExternalStorageDirectory();
                    }
                }
                ClassLoader classLoader3 = TuitionPaymentFragmentbindingInflater1.class.getClassLoader();
                byte b2 = (byte) (notify & 5);
                byte b3 = (byte) (b2 - 1);
                Object[] objArr6 = new Object[1];
                c(b2, b3, (byte) (b3 + 1), objArr6);
                try {
                    Object[] objArr7 = {(String) objArr6[0]};
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    Object[] objArr8 = new Object[1];
                    c(b4, b5, (byte) (b5 - 1), objArr8);
                    Method declaredMethod = ClassLoader.class.getDeclaredMethod((String) objArr8[0], String.class);
                    declaredMethod.setAccessible(true);
                    String str6 = (String) declaredMethod.invoke(classLoader3, objArr7);
                    if (str6 == null) {
                        Object[] objArr9 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, (char) (Process.getGidForName("") + 1), TextUtils.lastIndexOf("", '0', 0, 0) - 1807939891, new char[]{52325, 15622, 20116, 11360}, new char[]{39083, 53447, 44517, 65253, 27190, 31205, 12741, 26413, 19319, 64765, 8372}, objArr9);
                        Runtime.class.getMethod((String) objArr9[0], String.class).invoke(Runtime.class.getMethod(str4, null).invoke(null, null), str);
                        return;
                    }
                    Object[] objArr10 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, (char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 610833168, new char[]{4135, 26771, 21028, 55683}, new char[]{27188, 11692, 49059, 34765, 20479, 34600, 24576, 1358, 47705, 47370, 44844}, objArr10);
                    Object[] objArr11 = {Integer.valueOf(((Integer) String.class.getMethod((String) objArr10[0], Integer.TYPE).invoke(str6, 47)).intValue() + 1)};
                    Object[] objArr12 = new Object[1];
                    f(View.MeasureSpec.getSize(0) - 1364477869, (short) (ViewConfiguration.getEdgeSlop() >> 16), (byte) View.resolveSizeAndState(0, 0, 0), (-68) - TextUtils.lastIndexOf("", '0', 0, 0), MotionEvent.axisFromString("") + 320094678, objArr12);
                    File file = (File) File.class.getDeclaredConstructor(File.class, String.class).newInstance(objNewInstance2, String.class.getMethod((String) objArr12[0], Integer.TYPE).invoke(str6, objArr11));
                    Object[] objArr13 = new Object[1];
                    f(View.MeasureSpec.getMode(0) - 1364477885, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (-68) - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 320094685, objArr13);
                    if (((Boolean) String.class.getMethod((String) objArr13[0], CharSequence.class).invoke(str6, "!")).booleanValue()) {
                        StringBuilder sb = new StringBuilder();
                        Object[] objArr14 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, (char) (Process.myTid() >> 22), 8042206 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{56882, 31414, 61952, 44765}, new char[]{22968, 1215, 14871, 33394, 34257, 45026, 24597, 51992, 38127}, objArr14);
                        sb.append((String) objArr14[0]);
                        sb.append(str6);
                        Object objNewInstance3 = URL.class.getDeclaredConstructor(String.class).newInstance(sb.toString());
                        Object[] objArr15 = new Object[1];
                        f((ViewConfiguration.getScrollBarSize() >> 8) - 1364477881, (short) (ViewConfiguration.getPressedStateDuration() >> 16), (byte) KeyEvent.normalizeMetaState(0), Drawable.resolveOpacity(0, 0) - 69, 320094692 - View.MeasureSpec.getSize(0), objArr15);
                        Object objInvoke4 = URL.class.getMethod((String) objArr15[0], null).invoke(objNewInstance3, null);
                        Object[] objArr16 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, (char) TextUtils.indexOf("", ""), (ViewConfiguration.getPressedStateDuration() >> 16) + 610833168, new char[]{4135, 26771, 21028, 55683}, new char[]{27188, 11692, 49059, 34765, 20479, 34600, 24576, 1358, 47705, 47370, 44844}, objArr16);
                        Object[] objArr17 = {5, Integer.valueOf(((Integer) String.class.getMethod((String) objArr16[0], String.class).invoke(objInvoke4, "!/")).intValue())};
                        Object[] objArr18 = new Object[1];
                        f((-1364477869) - View.MeasureSpec.getSize(0), (short) (ViewConfiguration.getTapTimeout() >> 16), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-67) - (ViewConfiguration.getTouchSlop() >> 8), 320094677 - ((Process.getThreadPriority(0) + 20) >> 6), objArr18);
                        Object objNewInstance4 = ZipFile.class.getDeclaredConstructor(String.class).newInstance(String.class.getMethod((String) objArr18[0], Integer.TYPE, Integer.TYPE).invoke(objInvoke4, objArr17));
                        Object[] objArr19 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 610833168, new char[]{4135, 26771, 21028, 55683}, new char[]{27188, 11692, 49059, 34765, 20479, 34600, 24576, 1358, 47705, 47370, 44844}, objArr19);
                        Object[] objArr20 = {Integer.valueOf(((Integer) String.class.getMethod((String) objArr19[0], String.class).invoke(str6, "!/")).intValue())};
                        Object[] objArr21 = new Object[1];
                        f((-1364477870) - ((byte) KeyEvent.getModifierMetaStateMask()), (short) (TextUtils.lastIndexOf("", '0', 0) + 1), (byte) Color.red(0), (-67) - Color.argb(0, 0, 0, 0), 303317461 - Color.rgb(0, 0, 0), objArr21);
                        Object[] objArr22 = new Object[1];
                        f((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1364477870, (short) Drawable.resolveOpacity(0, 0), (byte) Color.argb(0, 0, 0, 0), Color.red(0) - 67, Gravity.getAbsoluteGravity(0, 0) + 320094677, objArr22);
                        Object[] objArr23 = {String.class.getMethod((String) objArr22[0], Integer.TYPE).invoke(String.class.getMethod((String) objArr21[0], Integer.TYPE).invoke(str6, objArr20), 2)};
                        Object[] objArr24 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 1, new char[]{32018, 60891, 42870, 54305}, new char[]{18769, 29279, 17745, 35178, 11817, 46458, 14327, 62709}, objArr24);
                        Object[] objArr25 = {ZipFile.class.getMethod((String) objArr24[0], String.class).invoke(objNewInstance4, objArr23)};
                        Object[] objArr26 = new Object[1];
                        f((KeyEvent.getMaxKeyCode() >> 16) - 1364477881, (short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") - 62, (ViewConfiguration.getTapTimeout() >> 16) + 320094698, objArr26);
                        objNewInstance = ZipFile.class.getMethod((String) objArr26[0], ZipEntry.class).invoke(objNewInstance4, objArr25);
                    } else {
                        objNewInstance = FileInputStream.class.getDeclaredConstructor(String.class).newInstance(str6);
                    }
                    InputStream inputStream = (InputStream) BufferedInputStream.class.getDeclaredConstructor(InputStream.class).newInstance(objNewInstance);
                    inputStream.skip(264L);
                    inputStream.skip(5L);
                    InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(inputStream, (-1185392520) - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 9, (ViewConfiguration.getWindowTouchSlop() >> 8) + 2, new byte[]{23, -4, -15, 27, -100, 56, 37, 89});
                    try {
                        if (inputStream == inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2.close();
                            try {
                                try {
                                    try {
                                        Object objInvoke5 = Runtime.class.getMethod(str4, null).invoke(null, null);
                                        ClassLoader classLoader4 = TuitionPaymentFragmentbindingInflater1.class.getClassLoader();
                                        Object[] objArr27 = {1257092341};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3413), 1559 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "") + 24, -86093833, false, null, new Class[]{Integer.TYPE});
                                        }
                                        Object[] objArr28 = {str6, classLoader4, true, 985057282, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr27), 985057282};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char maximumFlingVelocity = (char) (43042 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                            int iAlpha = 3111 - Color.alpha(0);
                                            int i = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            byte b6 = (byte) ($$a[7] - 1);
                                            byte b7 = b6;
                                            Object[] objArr29 = new Object[1];
                                            h(b6, b7, b7, objArr29);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, iAlpha, i, -675216362, false, (String) objArr29[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.alpha(0), 519 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 75 - ((byte) KeyEvent.getModifierMetaStateMask())), Integer.TYPE});
                                        }
                                        Object[] objArr30 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr28);
                                        int i2 = ((int[]) objArr30[1])[0];
                                        int i3 = ((int[]) objArr30[2])[0];
                                        if (i3 == i2) {
                                            int i4 = ((int[]) objArr30[0])[0];
                                            int i5 = ((int[]) objArr30[2])[0];
                                            int i6 = ((int[]) objArr30[1])[0];
                                            String[] strArr = (String[]) objArr30[3];
                                            int iNextInt = new Random().nextInt(1746731663);
                                            int i7 = ~iNextInt;
                                            int i8 = i4 + 1904622556 + (((~((-13379171) | i7)) | 1691652288) * (-602)) + (((~(iNextInt | (-13379171))) | 12845120 | (~(1692186338 | i7))) * (-301)) + ((~(i7 | 1691652288)) * 301);
                                            int i9 = (i8 << 13) ^ i8;
                                            int i10 = i9 ^ (i9 >>> 17);
                                            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
                                            Object[] objArr31 = {new int[1], new int[]{i6}, new int[]{i5}, strArr};
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            String[] strArr2 = (String[]) objArr30[3];
                                            if (strArr2 != null) {
                                                for (String str7 : strArr2) {
                                                    arrayList.add(str7);
                                                }
                                            }
                                            Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
                                            int i11 = ((int[]) objArr30[0])[0];
                                            int i12 = ((int[]) objArr30[2])[0];
                                            int i13 = ((int[]) objArr30[1])[0];
                                            String[] strArr3 = (String[]) objArr30[3];
                                            int i14 = ~((int) Runtime.getRuntime().freeMemory());
                                            int i15 = i11 + (-1334954174) + (((~(i14 | 32457625)) | (-1677685658)) * (-160)) + (((~(i14 | (-1672573834))) | 32457625) * 160);
                                            int i16 = (i15 << 13) ^ i15;
                                            int i17 = i16 ^ (i16 >>> 17);
                                            ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                                            Object[] objArr32 = {new int[1], new int[]{i13}, new int[]{i12}, strArr3};
                                        }
                                        try {
                                            Object[] objArr33 = new Object[1];
                                            e(new char[]{0, 0, 0, 0}, (char) (TextUtils.indexOf("", "", 0, 0) + 38882), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{57464, 44492, 57947, 23703}, new char[]{17943, 2704, 28490, 329}, objArr33);
                                            Method declaredMethod2 = Runtime.class.getDeclaredMethod((String) objArr33[0], String.class, ClassLoader.class);
                                            declaredMethod2.setAccessible(true);
                                            declaredMethod2.invoke(objInvoke5, str6, classLoader4);
                                            return;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    } catch (Throwable th2) {
                                        Throwable cause2 = th2.getCause();
                                        if (cause2 == null) {
                                            throw th2;
                                        }
                                        throw cause2;
                                    }
                                } catch (Exception unused) {
                                    if (Build.VERSION.SDK_INT <= 27) {
                                        try {
                                            Object objInvoke6 = Runtime.class.getMethod(str4, null).invoke(null, null);
                                            try {
                                                Object[] objArr34 = {str6, TuitionPaymentFragmentbindingInflater1.class.getClassLoader()};
                                                Object[] objArr35 = new Object[1];
                                                f(((byte) KeyEvent.getModifierMetaStateMask()) - 1364477883, (short) ExpandableListView.getPackedPositionGroup(0L), (byte) ExpandableListView.getPackedPositionType(0L), (-71) - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 320094711, objArr35);
                                                Method declaredMethod3 = Runtime.class.getDeclaredMethod((String) objArr35[0], String.class, ClassLoader.class);
                                                declaredMethod3.setAccessible(true);
                                                declaredMethod3.invoke(objInvoke6, objArr34);
                                                return;
                                            } catch (Throwable th3) {
                                                Throwable cause3 = th3.getCause();
                                                if (cause3 == null) {
                                                    throw th3;
                                                }
                                                throw cause3;
                                            }
                                        } catch (Throwable th4) {
                                            Throwable cause4 = th4.getCause();
                                            if (cause4 == null) {
                                                throw th4;
                                            }
                                            throw cause4;
                                        }
                                    }
                                    objInvoke3 = Runtime.class.getMethod(str4, null).invoke(null, null);
                                    classLoader2 = TuitionPaymentFragmentbindingInflater1.class.getClassLoader();
                                    synchronized (objInvoke3) {
                                        try {
                                            Object[] objArr36 = {str6, classLoader2};
                                            Object[] objArr37 = new Object[1];
                                            f(MotionEvent.axisFromString("") - 1364477873, (short) TextUtils.getTrimmedLength(""), (byte) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-66) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 320094715 - ExpandableListView.getPackedPositionChild(0L), objArr37);
                                            Method declaredMethod4 = Runtime.class.getDeclaredMethod((String) objArr37[0], String.class, ClassLoader.class);
                                            declaredMethod4.setAccessible(true);
                                            str3 = (String) declaredMethod4.invoke(objInvoke3, objArr36);
                                            if (str3 == null) {
                                                throw new UnsatisfiedLinkError(str3);
                                            }
                                        } catch (Throwable th5) {
                                            Throwable cause5 = th5.getCause();
                                            if (cause5 == null) {
                                                throw th5;
                                            }
                                            throw cause5;
                                        }
                                    }
                                    return;
                                }
                            } catch (NoSuchMethodException unused2) {
                                objInvoke3 = Runtime.class.getMethod(str4, null).invoke(null, null);
                                classLoader2 = TuitionPaymentFragmentbindingInflater1.class.getClassLoader();
                                synchronized (objInvoke3) {
                                    Object[] objArr38 = {str6, classLoader2};
                                    Object[] objArr39 = new Object[1];
                                    f(MotionEvent.axisFromString("") - 1364477873, (short) TextUtils.getTrimmedLength(""), (byte) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-66) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 320094715 - ExpandableListView.getPackedPositionChild(0L), objArr39);
                                    Method declaredMethod5 = Runtime.class.getDeclaredMethod((String) objArr39[0], String.class, ClassLoader.class);
                                    declaredMethod5.setAccessible(true);
                                    str3 = (String) declaredMethod5.invoke(objInvoke3, objArr38);
                                    if (str3 == null) {
                                        throw new UnsatisfiedLinkError(str3);
                                    }
                                    return;
                                }
                            }
                        }
                        Object[] objArr40 = {inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault2, file};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(531194526);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 41226), View.getDefaultSize(0, 0), 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -80231095, false, "b", new Class[]{InputStream.class, File.class});
                        }
                        Object objInvoke7 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr40);
                        try {
                            try {
                                Object objInvoke8 = Runtime.class.getMethod(str4, null).invoke(null, null);
                                try {
                                    try {
                                        Object[] objArr41 = new Object[1];
                                        e(new char[]{0, 0, 0, 0}, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35797), 517135039 - TextUtils.getTrimmedLength(""), new char[]{49054, 53978, 54558, 65163}, new char[]{42888, 8314, 32010, 30819, 26386, 28802, 12971, 44448, 17277, 61720, 64418, 39971, 17152, 27937, 1450}, objArr41);
                                        String str8 = (String) File.class.getMethod((String) objArr41[0], null).invoke(objInvoke7, null);
                                        ClassLoader classLoader5 = TuitionPaymentFragmentbindingInflater1.class.getClassLoader();
                                        Object[] objArr42 = {1257092341};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(507570208);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 3414), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1559, (ViewConfiguration.getFadingEdgeLength() >> 16) + 24, -86093833, false, null, new Class[]{Integer.TYPE});
                                        }
                                        Object[] objArr43 = {str8, classLoader5, true, 2039462308, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr42), 2039462308};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(861905857);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 43042);
                                            int i18 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3111;
                                            int edgeSlop = 22 - (ViewConfiguration.getEdgeSlop() >> 16);
                                            byte b8 = (byte) ($$a[7] - 1);
                                            byte b9 = b8;
                                            Object[] objArr44 = new Object[1];
                                            h(b8, b9, b9, objArr44);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, i18, edgeSlop, -675216362, false, (String) objArr44[0], new Class[]{String.class, ClassLoader.class, Boolean.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myTid() >> 22), 519 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 28), Integer.TYPE});
                                        }
                                        Object[] objArr45 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr43);
                                        int i19 = ((int[]) objArr45[1])[0];
                                        int i20 = ((int[]) objArr45[2])[0];
                                        if (i20 == i19) {
                                            int i21 = ((int[]) objArr45[0])[0];
                                            int i22 = ((int[]) objArr45[2])[0];
                                            int i23 = ((int[]) objArr45[1])[0];
                                            String[] strArr4 = (String[]) objArr45[3];
                                            int i24 = (int) Runtime.getRuntime().totalMemory();
                                            int i25 = ~i24;
                                            int i26 = i21 + (-341803444) + ((~((-671496603) | i25)) * 979) + ((i24 | 1033534856) * (-979)) + (((~(i24 | (-671496603))) | (~(i25 | 1033534856))) * 979);
                                            int i27 = (i26 << 13) ^ i26;
                                            int i28 = i27 ^ (i27 >>> 17);
                                            ((int[]) objArr[0])[0] = i28 ^ (i28 << 5);
                                            Object[] objArr46 = {new int[1], new int[]{i23}, new int[]{i22}, strArr4};
                                        } else {
                                            ArrayList arrayList2 = new ArrayList();
                                            String[] strArr5 = (String[]) objArr45[3];
                                            if (strArr5 != null) {
                                                for (String str9 : strArr5) {
                                                    arrayList2.add(str9);
                                                }
                                            }
                                            Toast.makeText((Context) null, i20 / (((i20 - 1) * i20) % 2), 0).show();
                                            int i29 = ((int[]) objArr45[0])[0];
                                            int i30 = ((int[]) objArr45[2])[0];
                                            int i31 = ((int[]) objArr45[1])[0];
                                            String[] strArr6 = (String[]) objArr45[3];
                                            int[] iArr = {i31};
                                            int iMyTid = Process.myTid();
                                            int i32 = i29 + (-967034562) + (((~iMyTid) | (-1637656721)) * 1444) + (((~(iMyTid | 1116090329)) | (~(588941129 | iMyTid)) | (-1671344090)) * (-1444)) + 1272145440;
                                            int i33 = (i32 << 13) ^ i32;
                                            int i34 = i33 ^ (i33 >>> 17);
                                            ((int[]) objArr[0])[0] = i34 ^ (i34 << 5);
                                            Object[] objArr47 = {new int[1], iArr, new int[]{i30}, strArr6};
                                        }
                                        try {
                                            Object[] objArr48 = {str8, classLoader5};
                                            Object[] objArr49 = new Object[1];
                                            e(new char[]{0, 0, 0, 0}, (char) (TextUtils.indexOf("", "", 0, 0) + 38882), TextUtils.indexOf("", "", 0), new char[]{57464, 44492, 57947, 23703}, new char[]{17943, 2704, 28490, 329}, objArr49);
                                            Method declaredMethod6 = Runtime.class.getDeclaredMethod((String) objArr49[0], String.class, ClassLoader.class);
                                            declaredMethod6.setAccessible(true);
                                            declaredMethod6.invoke(objInvoke8, objArr48);
                                        } catch (Throwable th6) {
                                            Throwable cause6 = th6.getCause();
                                            if (cause6 == null) {
                                                throw th6;
                                            }
                                            throw cause6;
                                        }
                                    } catch (NoSuchMethodException unused3) {
                                        objInvoke = Runtime.class.getMethod(str4, null).invoke(null, null);
                                        Object[] objArr50 = new Object[1];
                                        e(new char[]{0, 0, 0, 0}, (char) (35797 - Color.green(0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 517135039, new char[]{49054, 53978, 54558, 65163}, new char[]{42888, 8314, 32010, 30819, 26386, 28802, 12971, 44448, 17277, 61720, 64418, 39971, 17152, 27937, 1450}, objArr50);
                                        objInvoke2 = File.class.getMethod((String) objArr50[0], null).invoke(objInvoke7, null);
                                        classLoader = TuitionPaymentFragmentbindingInflater1.class.getClassLoader();
                                        synchronized (objInvoke) {
                                            try {
                                                Object[] objArr51 = new Object[1];
                                                f(Process.getGidForName("") - 1364477873, (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 67, 320094716 - (Process.myTid() >> 22), objArr51);
                                                Method declaredMethod7 = Runtime.class.getDeclaredMethod((String) objArr51[0], String.class, ClassLoader.class);
                                                declaredMethod7.setAccessible(true);
                                                str2 = (String) declaredMethod7.invoke(objInvoke, objInvoke2, classLoader);
                                                if (str2 == null) {
                                                    throw new UnsatisfiedLinkError(str2);
                                                }
                                            } catch (Throwable th7) {
                                                Throwable cause7 = th7.getCause();
                                                if (cause7 == null) {
                                                    throw th7;
                                                }
                                                throw cause7;
                                            }
                                        }
                                    }
                                } catch (Throwable th8) {
                                    Throwable cause8 = th8.getCause();
                                    if (cause8 == null) {
                                        throw th8;
                                    }
                                    throw cause8;
                                }
                            } catch (Throwable th9) {
                                Throwable cause9 = th9.getCause();
                                if (cause9 == null) {
                                    throw th9;
                                }
                                throw cause9;
                            }
                        } catch (Exception unused4) {
                            if (Build.VERSION.SDK_INT <= 27) {
                                try {
                                    Object objInvoke9 = Runtime.class.getMethod(str4, null).invoke(null, null);
                                    try {
                                        Object[] objArr52 = new Object[1];
                                        e(new char[]{0, 0, 0, 0}, (char) (35797 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 517135039 + View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{49054, 53978, 54558, 65163}, new char[]{42888, 8314, 32010, 30819, 26386, 28802, 12971, 44448, 17277, 61720, 64418, 39971, 17152, 27937, 1450}, objArr52);
                                        try {
                                            Object[] objArr53 = {File.class.getMethod((String) objArr52[0], null).invoke(objInvoke7, null), TuitionPaymentFragmentbindingInflater1.class.getClassLoader()};
                                            Object[] objArr54 = new Object[1];
                                            f((-1364477885) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) ((-1) - MotionEvent.axisFromString("")), (-70) - Color.argb(0, 0, 0, 0), 320094711 - Color.alpha(0), objArr54);
                                            Method declaredMethod8 = Runtime.class.getDeclaredMethod((String) objArr54[0], String.class, ClassLoader.class);
                                            declaredMethod8.setAccessible(true);
                                            declaredMethod8.invoke(objInvoke9, objArr53);
                                            return;
                                        } catch (Throwable th10) {
                                            Throwable cause10 = th10.getCause();
                                            if (cause10 == null) {
                                                throw th10;
                                            }
                                            throw cause10;
                                        }
                                    } catch (Throwable th11) {
                                        Throwable cause11 = th11.getCause();
                                        if (cause11 == null) {
                                            throw th11;
                                        }
                                        throw cause11;
                                    }
                                } catch (Throwable th12) {
                                    Throwable cause12 = th12.getCause();
                                    if (cause12 == null) {
                                        throw th12;
                                    }
                                    throw cause12;
                                }
                            }
                            objInvoke = Runtime.class.getMethod(str4, null).invoke(null, null);
                            Object[] objArr55 = new Object[1];
                            e(new char[]{0, 0, 0, 0}, (char) (35797 - Color.green(0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 517135039, new char[]{49054, 53978, 54558, 65163}, new char[]{42888, 8314, 32010, 30819, 26386, 28802, 12971, 44448, 17277, 61720, 64418, 39971, 17152, 27937, 1450}, objArr55);
                            objInvoke2 = File.class.getMethod((String) objArr55[0], null).invoke(objInvoke7, null);
                            classLoader = TuitionPaymentFragmentbindingInflater1.class.getClassLoader();
                            synchronized (objInvoke) {
                                Object[] objArr56 = new Object[1];
                                f(Process.getGidForName("") - 1364477873, (short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 67, 320094716 - (Process.myTid() >> 22), objArr56);
                                Method declaredMethod9 = Runtime.class.getDeclaredMethod((String) objArr56[0], String.class, ClassLoader.class);
                                declaredMethod9.setAccessible(true);
                                str2 = (String) declaredMethod9.invoke(objInvoke, objInvoke2, classLoader);
                                if (str2 == null) {
                                    throw new UnsatisfiedLinkError(str2);
                                }
                            }
                        }
                    } catch (Throwable th13) {
                        Throwable cause13 = th13.getCause();
                        if (cause13 == null) {
                            throw th13;
                        }
                        throw cause13;
                    }
                } catch (Throwable th14) {
                    Throwable cause14 = th14.getCause();
                    if (cause14 == null) {
                        throw th14;
                    }
                    throw cause14;
                }
            } catch (Throwable th15) {
                Throwable cause15 = th15.getCause();
                if (cause15 == null) {
                    throw th15;
                }
                throw cause15;
            }
        }

        static {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2618911636820900470L;
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            b = -6377398940819159759L;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 7403;
            TuitionPaymentFragmentbindingInflater1 = 1615258329;
            f417a = -1934795606;
            d = -570878778;
            g = new byte[]{23, -19, 17, -3, 15, -21, 24, -17, -29, 18, -27, 31, -96, 89, -32, -35, 43, 13, -13, 17, 31, -29, 17, 24, -25, -9, 11, -28, -29, -29, -18, 11, -32, 25, -22, 18, -11, -9, 58, -23, 24, -22, 26, 21, 24, -57, 57, 25, -29, -28, -61, 51, -23, 24, -27, 20, -59, 59, -19, -27, 20, -59, 1, 9, -21, 19, -11, 21, -26, -26, -26, -26, -26, -26, -26, -26};
        }
    }

    public static /* synthetic */ String TuitionPaymentFragmentbindingInflater1(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        return getReleaseBaseUrl();
    }

    public static /* synthetic */ OkHttpClient TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileTransformFactory fileTransformFactory, CoordinateTransform coordinateTransform) {
        Intrinsics.checkNotNullParameter(fileTransformFactory, "");
        Intrinsics.checkNotNullParameter(coordinateTransform, "");
        OkHttpClientFactory okHttpClientFactory = OkHttpClientFactory.INSTANCE;
        PreferenceManager preferenceManager = (PreferenceManager) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), null, null);
        HashMap map = new HashMap();
        map.put("Connection", "Keep-Alive");
        return okHttpClientFactory.create((Context) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(Context.class), null, null), new Interceptor[]{new HeaderInterceptor(map, preferenceManager), new ParameterInterceptor(new HashMap()), new recreateImageReaderProxy((Context) fileTransformFactory.b(Reflection.getOrCreateKotlinClass(Context.class), null, null), null, null, null, null, 30, null)}, new SessionAuthenticator(), false);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isLenovoTablet islenovotablet) {
        Intrinsics.checkNotNullParameter(islenovotablet, "");
        new TuitionPaymentFragmentbindingInflater1();
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function2 = new Function2() { // from class: sendState
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ApiModuleKt.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove = new ZoomGestureDetectorZoomEventMove<>(null, null, Reflection.getOrCreateKotlinClass(OkHttpClient.class));
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        zoomGestureDetectorZoomEventMove.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove);
        setUsingExifOrientation setusingexiforientation = new setUsingExifOrientation("baseUrl");
        Function2<? super FileTransformFactory, ? super CoordinateTransform, ? extends T> function3 = new Function2() { // from class: sendVolumeInfoChanged
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ApiModuleKt.TuitionPaymentFragmentbindingInflater1((FileTransformFactory) obj, (CoordinateTransform) obj2);
            }
        };
        ZoomGestureDetectorZoomEventEnd zoomGestureDetectorZoomEventEnd2 = ZoomGestureDetectorZoomEventEnd.INSTANCE;
        Kind kind2 = Kind.Single;
        ZoomGestureDetectorZoomEventMove<?> zoomGestureDetectorZoomEventMove2 = new ZoomGestureDetectorZoomEventMove<>(setusingexiforientation, null, Reflection.getOrCreateKotlinClass(String.class));
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function3;
        zoomGestureDetectorZoomEventMove2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kind2;
        islenovotablet.TuitionPaymentFragmentbindingInflater1(zoomGestureDetectorZoomEventMove2, new ZoomGestureDetectorgestureDetector1(false, false));
        islenovotablet.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(zoomGestureDetectorZoomEventMove2);
        return Unit.INSTANCE;
    }
}

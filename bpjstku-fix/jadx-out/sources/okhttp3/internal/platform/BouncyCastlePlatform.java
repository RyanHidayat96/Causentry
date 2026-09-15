package okhttp3.internal.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lokhttp3/internal/platform/BouncyCastlePlatform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "p2", "", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljava/security/Provider;", "provider", "Ljava/security/Provider;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BouncyCastlePlatform extends Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int[] b;
    private static final boolean isSupported;
    private final Provider provider;
    private static final byte[] $$c = {70, -114, 113, 8};
    private static final int $$f = 185;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {101, 89, 94, -73, 53, 3, 23, 12, -39, 54, 9, 16, 8, 7, 7, 10, 3, 23, -39, 53, 3, 23, 12, -26, 27, 27, -7, 22, 16, -54, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$h = 100;
    private static final byte[] $$a = {49, 89, 41, 48, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 230;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r8 = r8 * 52
            int r8 = 56 - r8
            byte[] r0 = okhttp3.internal.platform.BouncyCastlePlatform.$$a
            int r9 = 53 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.BouncyCastlePlatform.a(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 11
            int r0 = 38 - r5
            int r7 = r7 * 26
            int r7 = 30 - r7
            byte[] r1 = okhttp3.internal.platform.BouncyCastlePlatform.$$g
            int r6 = r6 * 19
            int r6 = 84 - r6
            byte[] r0 = new byte[r0]
            int r5 = 37 - r5
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r3 = r2
            r6 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2b:
            int r6 = r6 + r4
            int r6 = r6 + (-10)
            int r7 = r7 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.BouncyCastlePlatform.d(byte, short, int, java.lang.Object[]):void");
    }

    private BouncyCastlePlatform() {
        this.provider = new BouncyCastleJsseProvider();
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = isSupported;
        int i5 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext newSSLContext() throws NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.provider);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "");
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return sSLContext;
        }
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n"}, d2 = {"Lokhttp3/internal/platform/BouncyCastlePlatform$Companion;", "", "<init>", "()V", "Lokhttp3/internal/platform/BouncyCastlePlatform;", "buildIfSupported", "()Lokhttp3/internal/platform/BouncyCastlePlatform;", "", "isSupported", "Z", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isSupported() {
            return BouncyCastlePlatform.access$isSupported$cp();
        }

        public final BouncyCastlePlatform buildIfSupported() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (isSupported()) {
                return new BouncyCastlePlatform(defaultConstructorMarker);
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = b;
        int i5 = -1870535734;
        int i6 = -1;
        int i7 = 1;
        int i8 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = $11 + 65;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i8] = Integer.valueOf(iArr3[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i6;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myPid() >> 22), 3291 - (Process.myTid() >> 22), KeyEvent.normalizeMetaState(i8) + 31, 1948206109, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i9++;
                    i3 = 2;
                    i5 = -1870535734;
                    i6 = -1;
                    i8 = 0;
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
        int[] iArr6 = b;
        long j = 0;
        if (iArr6 != null) {
            int i12 = $10 + 101;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i13 = $11 + 113;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr3 = new Object[i7];
                objArr3[0] = Integer.valueOf(iArr6[i2]);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i15 = 3292 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int i16 = 32 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarFadeDuration, i15, i16, 1948206109, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr2[i2] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                i2++;
                iArr6 = iArr6;
                j = 0;
                i7 = 1;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        int i17 = 2;
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i18 = $10 + 119;
            $11 = i18 % 128;
            int i19 = i18 % i17;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i20 = 17;
            for (int i21 = 1; i20 > i21; i21 = 1) {
                int i22 = $10 + 111;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i20];
                    Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (-b6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 2559 - View.resolveSizeAndState(0, 0, 0), 29 - TextUtils.indexOf("", "", 0, 0), 683220507, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                    i20 += 43;
                } else {
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[i20];
                    try {
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) (-1);
                            byte b9 = (byte) (-b8);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.getSize(0), ExpandableListView.getPackedPositionChild(0L) + 2560, (-16777187) - Color.rgb(0, 0, 0), 683220507, false, $$i(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                        i20--;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            int i23 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr5[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr5[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i24 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 28879), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 347, 26 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
            i17 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // okhttp3.internal.platform.Platform
    public final X509TrustManager platformTrustManager() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
            int defaultSize = 28 - View.getDefaultSize(0, 0);
            byte b2 = $$a[7];
            Object[] objArr3 = new Object[1];
            a(b2, b2, (byte) 52, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveOpacity, defaultSize, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new int[]{-901659554, -124253991, 74895145, 1149835837, 191348628, -1788322012, -349375098, 1268279137, 480532203, 1049542797, -785966466, -2094999550, -2075431764, -264391335}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new int[]{1506185392, -1683005857, 897168812, 404376816, 467469815, 672969191, -1970882931, -1689288371, 427852070, 1141520546}, TextUtils.getOffsetAfter("", 0) + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode = (char) (31533 - View.MeasureSpec.getMode(0));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 922;
            int defaultSize2 = View.getDefaultSize(0, 0) + 28;
            byte[] bArr = $$a;
            byte b3 = bArr[80];
            Object[] objArr6 = new Object[1];
            a(b3, bArr[7], b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode, iLastIndexOf, defaultSize2, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 31534);
                int trimmedLength = 921 - TextUtils.getTrimmedLength("");
                int i4 = 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b4 = bArr2[80];
                Object[] objArr7 = new Object[1];
                a(b4, b4, (byte) (-bArr2[33]), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, trimmedLength, i4, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = ~(800628641 | i5);
            int i7 = (((269549091 + ((268771418 | i6) * (-712))) + (((~(iIdentityHashCode | 1069400059)) | (~(i5 | (-268771419)))) * (-712))) + (((-973451003) | i6) * 712)) - 969762923;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new int[]{1769008829, -1052879021, -1794662026, -2082819345, 1818232543, -707603362, -605060864, -2145679143, -37334363, 1856439027, -937321268, 296726084, -107223706, -1637098267, 1945434582, 1504634968}, 25 - TextUtils.lastIndexOf("", '0'), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new int[]{1125317421, -1112896690, -930861611, 628044510, -1712219655, -803925167, -2057106411, -117390949, -661912614, -1946207685, -960884432, -1841147947}, 18 - ExpandableListView.getPackedPositionGroup(0L), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
                int i11 = i10 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            c(new int[]{-42918869, 278914254, 1277439432, -1359412763, 687099636, -1447783650, 1101314138, -991853010, -1957979099, 516968509}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(new int[]{1982148102, -1516322075, 2063275662, 1406924926, -2076212060, 930843625, 1897724850, 527255179, -1653801089, -1979247475}, ImageFormat.getBitsPerPixel(0) + 17, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
            int i13 = i12 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13;
            int i14 = i12 % 2;
            int i15 = i13 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, -969762923};
                byte[] bArr3 = $$g;
                byte b5 = (byte) (-bArr3[33]);
                byte b6 = b5;
                Object[] objArr14 = new Object[1];
                d(b5, b6, b6, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b7 = bArr3[54];
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                d(b7, b8, b8, objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cArgb = (char) (Color.argb(0, 0, 0, 0) + 31533);
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
                    int maximumFlingVelocity2 = 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte[] bArr4 = $$a;
                    byte b9 = bArr4[80];
                    byte b10 = (byte) (-bArr4[33]);
                    Object[] objArr16 = new Object[1];
                    a(b9, b9, b10, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, maximumFlingVelocity, maximumFlingVelocity2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new int[]{-901659554, -124253991, 74895145, 1149835837, 191348628, -1788322012, -349375098, 1268279137, 480532203, 1049542797, -785966466, -2094999550, -2075431764, -264391335}, TextUtils.lastIndexOf("", '0', 0) + 23, objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new int[]{1506185392, -1683005857, 897168812, 404376816, 467469815, 672969191, -1970882931, -1689288371, 427852070, 1141520546}, (ViewConfiguration.getScrollBarSize() >> 8) + 15, objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char edgeSlop = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int iMyPid = 921 - (Process.myPid() >> 22);
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 28;
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b11, bArr5[7], b11, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, iMyPid, iKeyCodeFromString, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0'));
                        int scrollDefaultDelay = 921 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int windowTouchSlop = 28 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b12 = $$a[7];
                        Object[] objArr20 = new Object[1];
                        a(b12, b12, (byte) 52, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, scrollDefaultDelay, windowTouchSlop, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[3])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i20 = ~iMaxMemory;
            int i21 = 1353110691 + (((~((-705597197) | i20)) | (~(1060085646 | iMaxMemory))) * 520);
            int i22 = ~((-1060085647) | i20);
            int i23 = ~(iMaxMemory | 713993997);
            int i24 = i19 + i21 + ((i22 | i23) * (-1040)) + ((i23 | (~(i20 | (-713993998))) | 354488450) * 520);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr2[0])[0] = i26 ^ (i26 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                int i28 = 2;
                int i29 = i27 % 2;
                int i30 = 0;
                while (i30 < strArr.length) {
                    int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i31 % 128;
                    int i32 = i31 % i28;
                    arrayList.add(strArr[i30]);
                    i30++;
                    i28 = 2;
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i33 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i34 = i33 + 783464518 + (((~((-806261569) | (~iUptimeMillis))) | (-967818076)) * (-591)) + ((iUptimeMillis | (-806261569)) * 591);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr2[0])[0] = i36 ^ (i36 << 5);
        }
        String strConcat = "22\\30\\7\\".concat("BCJSSE");
        int i37 = ((int[]) objArr2[0])[0];
        int i38 = ((i37 * i37) - (~(-(171203900 * i37)))) - 1;
        int i39 = -(i37 * (-2117643958));
        int i40 = (i38 & i39) + (i39 | i38);
        int i41 = ((i40 | 1299159945) << 1) - (1299159945 ^ i40);
        int i42 = ((i41 >> 16) - 131071) / 65536;
        int i43 = (i42 ^ 1) + ((i42 & 1) << 1);
        int i44 = (i41 & i43) + (i43 | i41);
        int i45 = i41 >> 18;
        int i46 = ((i45 & (-32767)) + (i45 | (-32767))) / 16384;
        int i47 = -(i44 ^ ((i46 & 1) + (i46 | 1)));
        int i48 = (i47 & 4) + (i47 | 4);
        int i49 = ((i48 >> 26) + ComposerKt.defaultsKey) / 64;
        int i50 = ((i49 | 1) << 1) - (i49 ^ 1);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", strConcat.substring(34720 / (((-((i50 ^ 1) + ((i50 & 1) << 1))) & i48) * 1085)));
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                int i51 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i51 % 128;
                int i52 = i51 % 2;
                Intrinsics.checkNotNull(trustManager, "");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // okhttp3.internal.platform.Platform
    public final X509TrustManager trustManager(SSLSocketFactory p0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        super.configureTlsExtensions(r5, r6, r7);
        r5 = okhttp3.internal.platform.BouncyCastlePlatform.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        okhttp3.internal.platform.BouncyCastlePlatform.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if ((r5 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if ((r5 instanceof org.bouncycastle.jsse.BCSSLSocket) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if ((r5 instanceof org.bouncycastle.jsse.BCSSLSocket) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r5 = (org.bouncycastle.jsse.BCSSLSocket) r5;
        r6 = r5.getParameters();
        r6.setApplicationProtocols((java.lang.String[]) okhttp3.internal.platform.Platform.INSTANCE.alpnProtocolNames(r7).toArray(new java.lang.String[0]));
        r5.setParameters(r6);
        r5 = okhttp3.internal.platform.BouncyCastlePlatform.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        okhttp3.internal.platform.BouncyCastlePlatform.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r5 % 128;
        r5 = r5 % 2;
     */
    @Override // okhttp3.internal.platform.Platform
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureTlsExtensions(javax.net.ssl.SSLSocket r5, java.lang.String r6, java.util.List<okhttp3.Protocol> r7) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = okhttp3.internal.platform.BouncyCastlePlatform.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 1
            int r2 = r1 % 128
            okhttp3.internal.platform.BouncyCastlePlatform.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L1f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            boolean r1 = r5 instanceof org.bouncycastle.jsse.BCSSLSocket
            r3 = 8
            int r3 = r3 / r2
            if (r1 == 0) goto L4f
            goto L29
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            boolean r1 = r5 instanceof org.bouncycastle.jsse.BCSSLSocket
            if (r1 == 0) goto L4f
        L29:
            org.bouncycastle.jsse.BCSSLSocket r5 = (org.bouncycastle.jsse.BCSSLSocket) r5
            org.bouncycastle.jsse.BCSSLParameters r6 = r5.getParameters()
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.INSTANCE
            java.util.List r7 = r1.alpnProtocolNames(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.Object[] r7 = r7.toArray(r1)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r6.setApplicationProtocols(r7)
            r5.setParameters(r6)
            int r5 = okhttp3.internal.platform.BouncyCastlePlatform.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r5 = r5 + 89
            int r6 = r5 % 128
            okhttp3.internal.platform.BouncyCastlePlatform.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r6
            int r5 = r5 % r0
            return
        L4f:
            super.configureTlsExtensions(r5, r6, r7)
            int r5 = okhttp3.internal.platform.BouncyCastlePlatform.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r5 = r5 + 43
            int r6 = r5 % 128
            okhttp3.internal.platform.BouncyCastlePlatform.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L5e
            return
        L5e:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.BouncyCastlePlatform.configureTlsExtensions(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
    }

    @Override // okhttp3.internal.platform.Platform
    public final String getSelectedProtocol(SSLSocket p0) {
        boolean zAreEqual;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (!(p0 instanceof BCSSLSocket)) {
            return super.getSelectedProtocol(p0);
        }
        String applicationProtocol = ((BCSSLSocket) p0).getApplicationProtocol();
        if (applicationProtocol == null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            zAreEqual = true;
        } else {
            zAreEqual = Intrinsics.areEqual(applicationProtocol, "");
        }
        if (!zAreEqual) {
            return applicationProtocol;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static {
        boolean z = false;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        TuitionPaymentFragmentbindingInflater1 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        Companion companion = new Companion(null);
        INSTANCE = companion;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, companion.getClass().getClassLoader());
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
            TuitionPaymentFragmentbindingInflater1 = i % 128;
            if (i % 2 == 0) {
                int i2 = 4 % 4;
            } else {
                int i3 = 2 % 2;
            }
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        isSupported = z;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ BouncyCastlePlatform(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        b = new int[]{903155289, -1241300073, 1666323320, -1205673152, -1594097325, -416338548, -274924468, -1767774124, 1288795619, -2093679106, -1148595692, 1604260566, 423839795, -48597843, 904983874, -14996325, 1199150303, 317927922};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r6, int r7, short r8) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r0 = 1 - r8
            int r7 = r7 * 56
            int r7 = r7 + 66
            byte[] r1 = okhttp3.internal.platform.BouncyCastlePlatform.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.BouncyCastlePlatform.$$i(short, int, short):java.lang.String");
    }
}

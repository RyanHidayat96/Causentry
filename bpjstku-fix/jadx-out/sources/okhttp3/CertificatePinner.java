package okhttp3;

import android.content.Context;
import android.content.ContextWrapper;
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
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.api.internal.zabx;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 '2\u00020\u0001:\u0003(')B#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\t2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\u0004\b\u0012\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0004\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lokhttp3/CertificatePinner;", "", "", "Lokhttp3/CertificatePinner$Pin;", "p0", "Lokhttp3/internal/tls/CertificateChainCleaner;", "p1", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "", "Lkotlin/Function0;", "", "Ljava/security/cert/X509Certificate;", "", "check$okhttp", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "Ljava/security/cert/Certificate;", "check", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "(Ljava/lang/String;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "findMatchingPins", "(Ljava/lang/String;)Ljava/util/List;", "", "hashCode", "()I", "withCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "pins", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Companion", "Builder", "Pin"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CertificatePinner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CertificatePinner DEFAULT;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static long b;
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;
    private static final byte[] $$c = {109, 84, -87, -114};
    private static final int $$f = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, 88, -118, 32, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 156;
    private static final byte[] $$a = {80, -8, 43, 65, 3, -5, -4, 6};
    private static final int $$b = 147;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r0 = 5 - r7
            byte[] r1 = okhttp3.CertificatePinner.$$a
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r6 = r6 * 3
            int r6 = r6 + 99
            byte[] r0 = new byte[r0]
            int r7 = 4 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            int r6 = r6 + 1
            r3 = r1[r6]
        L30:
            int r8 = r8 + r3
            int r8 = r8 + 2
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.a(byte, short, short, java.lang.Object[]):void");
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
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 1
            int r8 = r8 * 52
            int r8 = 55 - r8
            int r6 = 103 - r6
            byte[] r0 = okhttp3.CertificatePinner.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.c(int, short, short, java.lang.Object[]):void");
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $10 + 111;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 64839), View.MeasureSpec.makeMeasureSpec(0, 0) + 1356, View.resolveSize(0, 0) + 38, 894276454, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AndroidCharacter.getMirror('0') + 47725), 467 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(set, "");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = i2 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            certificateChainCleaner = null;
        }
        this(set, certificateChainCleaner);
    }

    public final Set<Pin> getPins() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Set<Pin> set = this.pins;
        int i4 = i2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return set;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 85;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        int i4 = i3 + 123;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return certificateChainCleaner;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "<init>", "()V", "Ljava/security/cert/Certificate;", "p0", "", "pin", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Ljava/security/cert/X509Certificate;", "Lokio/ByteString;", "sha1Hash", "(Ljava/security/cert/X509Certificate;)Lokio/ByteString;", "sha256Hash", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private static final byte[] $$c = {87, 51, -85, 78};
        private static final int $$f = 110;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {12, -88, 33, 118, -4, 25, -33, 46, -2, 16, 8, -24, 40, 25, 14, 11, 7, -3, -21, 48, -1, 28, -1, -17, 44, -1, 11, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55};
        private static final int $$e = 233;
        private static final byte[] $$a = {83, -4, -55, -17, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
        private static final int $$b = 191;
        private static int d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f1284a = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 859000693;
        private static int TuitionPaymentFragmentbindingInflater1 = -1934795544;
        private static int b = -1449400898;
        private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, -27, 26, 21, -20, -14, Base64.padSymbol, -29, -19, 21, -21, 19, -9, -60, -11, 88, -26, -23, -43, 44, 29, 28, 27, -24, 16, -21, 25, -32, 19, -11, 24, 28, 27, 26, -26, -55, 43, -32, -17, 21, -26, 27, -12, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29, -26, -26, -26, -26, -26, -26};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r5, int r6, byte r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = okhttp3.CertificatePinner.Companion.$$a
                int r5 = r5 * 2
                int r5 = 84 - r5
                int r7 = r7 * 15
                int r1 = r7 + 38
                int r6 = r6 + 4
                byte[] r1 = new byte[r1]
                int r7 = r7 + 37
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r5
                r5 = r7
                r4 = r2
                goto L2b
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                int r6 = r6 + 1
                r3 = r0[r6]
            L2b:
                int r5 = r5 + r3
                int r5 = r5 + (-11)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Companion.c(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002b  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(int r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 29
                int r0 = r7 + 24
                int r6 = r6 + 4
                int r5 = r5 * 31
                int r5 = 115 - r5
                byte[] r1 = okhttp3.CertificatePinner.Companion.$$d
                byte[] r0 = new byte[r0]
                int r7 = r7 + 23
                r2 = -1
                if (r1 != 0) goto L16
                r5 = r6
                r3 = r7
                goto L2d
            L16:
                r4 = r6
                r6 = r5
                r5 = r4
            L19:
                int r2 = r2 + 1
                byte r3 = (byte) r6
                r0[r2] = r3
                int r5 = r5 + 1
                if (r2 != r7) goto L2b
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r0, r6)
                r8[r6] = r5
                return
            L2b:
                r3 = r1[r5]
            L2d:
                int r6 = r6 + r3
                int r6 = r6 + (-10)
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Companion.f(int, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:13:0x007a  */
        /* JADX WARN: Code duplicated, block: B:22:0x0094 A[PHI: r4
  0x0094: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v18 byte[]) binds: [B:21:0x0092, B:18:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:24:0x009a  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ad A[Catch: all -> 0x02b9, TryCatch #0 {all -> 0x02b9, blocks: (B:3:0x000f, B:6:0x002d, B:7:0x005d, B:25:0x009c, B:27:0x00ad, B:28:0x00df, B:46:0x01a7, B:48:0x01c4, B:49:0x020c), top: B:77:0x000f }] */
        private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
            int i4;
            int length;
            byte[] bArr;
            byte[] bArr2;
            int length2;
            byte[] bArr3;
            int i5;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i6 = 2 % 2;
            SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 2267 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.lastIndexOf("", '0', 0) + 34, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i7 = $10 + 7;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    int i8 = $10 + 111;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i9 = 17 / 0;
                        if (bArr2 != null) {
                            length2 = bArr2.length;
                            bArr3 = new byte[length2];
                            for (i5 = 0; i5 < length2; i5++) {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i5])};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b5 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.getSize(0) + 3358, 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1054011043, false, $$g(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                                }
                                bArr3[i5] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr3)).byteValue();
                            }
                            bArr2 = bArr3;
                        }
                    } else {
                        bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (bArr2 != null) {
                            length2 = bArr2.length;
                            bArr3 = new byte[length2];
                            while (i5 < length2) {
                                Object[] objArr4 = {Integer.valueOf(bArr2[i5])};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b6 = (byte) 0;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), View.MeasureSpec.getSize(0) + 3358, 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1054011043, false, $$g(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE});
                                }
                                bArr3[i5] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr4)).byteValue();
                            }
                            bArr2 = bArr3;
                        }
                    }
                    if (bArr2 != null) {
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        try {
                            Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (MotionEvent.axisFromString("") + 1), 2267 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1387473586, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    }
                }
                if (iIntValue > 0) {
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 3046761265686732006L)) + i4;
                    Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 55904), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2854, 12 - TextUtils.lastIndexOf("", '0', 0), -1529949196, false, $$g(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (bArr5 != null) {
                        int i10 = $11 + 119;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                        }
                        for (int i11 = 0; i11 < length; i11++) {
                            bArr[i11] = (byte) (((long) bArr5[i11]) ^ 3046761265686732006L);
                        }
                        bArr5 = bArr;
                    }
                    boolean z = bArr5 != null;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z) {
                            int i12 = $10 + 7;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i14]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i15 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i15 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i15]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
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

        private Companion() {
        }

        @JvmStatic
        public final ByteString sha1Hash(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
            int i = 2 % 2;
            int i2 = d + 49;
            f1284a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(x509Certificate, "");
            ByteString.Companion companion = ByteString.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "");
            ByteString byteStringB = ByteString.Companion.b(encoded).b("SHA-1");
            int i4 = f1284a + 81;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                return byteStringB;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x029d  */
        /* JADX WARN: Code duplicated, block: B:27:0x02ab  */
        @JvmStatic
        public final ByteString sha256Hash(X509Certificate x509Certificate) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = f1284a + 75;
            d = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(x509Certificate, "");
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
                int offsetAfter = 10 - TextUtils.getOffsetAfter("", 0);
                byte[] bArr = $$a;
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                c(b2, bArr[5], b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, packedPositionChild, offsetAfter, -1650998592, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 624343287, 7 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) TextUtils.indexOf("", "", 0), 1080159341 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e((-624343283) - TextUtils.getOffsetBefore("", 0), -((byte) KeyEvent.getModifierMetaStateMask()), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (ViewConfiguration.getScrollBarSize() >> 8), 1080159362 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iRed = 10 - Color.red(0);
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                c(b3, (byte) (b3 | 36), bArr2[28], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, edgeSlop, iRed, 2012020043, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i4 = f1284a + 65;
                d = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int capsMode = 876 - TextUtils.getCapsMode("", 0, 0);
                    int iAlpha = 10 - Color.alpha(0);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[7];
                    Object[] objArr6 = new Object[1];
                    c(b4, (byte) (b4 | 88), bArr3[28], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, capsMode, iAlpha, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i6 = 1728687124 + (((~(969365510 | iIdentityHashCode)) | (-929055282)) * 672);
                int i7 = ~iIdentityHashCode;
                int i8 = i6 + (((~(iIdentityHashCode | (-929055282))) | (~((-969365511) | i7))) * (-672)) + (((~(929055281 | i7)) | (-1072126520)) * 672) + 1932103557;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                e((-624343286) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 12, (short) View.combineMeasuredStates(0, 0), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), Color.blue(0) + 1080159376, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                e((-624343286) - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.indexOf("", "", 0, 0) + 4, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1080159400 - TextUtils.lastIndexOf("", '0', 0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i11 = d + 35;
                    f1284a = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 9 / 0;
                        if (applicationContext instanceof ContextWrapper) {
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                int i13 = d + 53;
                                f1284a = i13 % 128;
                                int i14 = i13 % 2;
                                applicationContext = null;
                            }
                        }
                    } else if (!(!(applicationContext instanceof ContextWrapper))) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            int i15 = d + 53;
                            f1284a = i15 % 128;
                            int i16 = i15 % 2;
                            applicationContext = null;
                        }
                    }
                    applicationContext = applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                e((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 624343279, 2 - TextUtils.indexOf("", "", 0, 0), (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (ViewConfiguration.getLongPressTimeout() >> 16), 1080159419 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                e((ViewConfiguration.getKeyRepeatDelay() >> 16) - 624343279, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) TextUtils.getOffsetBefore("", 0), 1080159432 - TextUtils.lastIndexOf("", '0'), objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1932103557};
                    byte[] bArr4 = $$d;
                    byte b5 = (byte) (bArr4[60] - 1);
                    byte b6 = bArr4[20];
                    Object[] objArr13 = new Object[1];
                    f(b5, b6, (byte) (b6 + 1), objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr4[60];
                    Object[] objArr14 = new Object[1];
                    f(b7, (byte) (bArr4[29] + 1), b7, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i17 = d + 1;
                        f1284a = i17 % 128;
                        int i18 = i17 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) TextUtils.indexOf("", "");
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                            int iGreen = 10 - Color.green(0);
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[7];
                            Object[] objArr15 = new Object[1];
                            c(b8, (byte) (b8 | 88), bArr5[28], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, doubleTapTimeout, iGreen, 2012931276, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            e(TextUtils.getOffsetAfter("", 0) - 624343287, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1080159341, objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            e((-641120499) - Color.rgb(0, 0, 0), -TextUtils.indexOf((CharSequence) "", '0', 0), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ExpandableListView.getPackedPositionGroup(0L), 1080159361 - TextUtils.lastIndexOf("", '0'), objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 877;
                                int i19 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                                byte[] bArr6 = $$a;
                                byte b9 = bArr6[7];
                                Object[] objArr18 = new Object[1];
                                c(b9, (byte) (b9 | 36), bArr6[28], objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf3, iLastIndexOf, i19, 2012020043, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                                int i20 = 877 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int tapTimeout = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                                byte[] bArr7 = $$a;
                                byte b10 = bArr7[7];
                                Object[] objArr19 = new Object[1];
                                c(b10, bArr7[5], b10, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf2, i20, tapTimeout, -1650998592, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
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
            int i21 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i22 = i21 + 2082191308 + (((-67578401) | (~iIdentityHashCode2)) * (-490)) + (((~(iIdentityHashCode2 | 464016603)) | (-531595004)) * 490) + 1987954998;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr20[1])[0] = i24 ^ (i24 << 5);
            ByteString.Companion companion = ByteString.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            int i25 = ((int[]) objArr20[1])[0];
            int i26 = ((i25 * i25) - (~(-(343383871 * i25)))) - 1;
            int i27 = -(i25 * (-1744292121));
            int i28 = (i26 & i27) + (i27 | i26);
            int i29 = (i28 ^ 1328931689) + ((1328931689 & i28) << 1);
            int i30 = i29 >> 16;
            int i31 = (((-131071) & i30) + (i30 | (-131071))) / 65536;
            int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
            int i33 = (i29 ^ i32) + ((i32 & i29) << 1);
            int i34 = ((i29 >> 19) - 16383) / 8192;
            int i35 = -(i33 ^ ((i34 ^ 1) + ((i34 & 1) << 1)));
            int i36 = ((i35 | 2) << 1) - (i35 ^ 2);
            int i37 = i36 >> 15;
            int i38 = ((((-262143) | i37) << 1) - (i37 ^ (-262143))) / 131072;
            Intrinsics.checkNotNullExpressionValue(encoded, "5|26|17|publicKey.encoded".substring(25184 / (((-((((i38 | 1) << 1) - (i38 ^ 1)) + 1)) & i36) * 1574)));
            ByteString byteStringB = ByteString.Companion.b(encoded).b("SHA-256");
            int i39 = f1284a + 49;
            d = i39 % 128;
            if (i39 % 2 != 0) {
                int i40 = 38 / 0;
            }
            return byteStringB;
        }

        @JvmStatic
        public final String pin(Certificate p0) {
            int i = 2 % 2;
            int i2 = d + 67;
            f1284a = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(p0, "");
            if (!(p0 instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            StringBuilder sb = new StringBuilder("sha256/");
            sb.append(sha256Hash((X509Certificate) p0).b());
            String string = sb.toString();
            int i4 = d + 95;
            f1284a = i4 % 128;
            int i5 = i4 % 2;
            return string;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
        private static java.lang.String $$g(short r6, int r7, short r8) {
            /*
                int r8 = r8 + 117
                int r7 = r7 * 3
                int r7 = 3 - r7
                byte[] r0 = okhttp3.CertificatePinner.Companion.$$c
                int r6 = r6 * 3
                int r1 = r6 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r7 = r7 + 1
                if (r3 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r4 = r0[r7]
                int r3 = r3 + 1
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Companion.$$g(short, int, short):java.lang.String");
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0013"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/security/cert/X509Certificate;", "matchesCertificate", "(Ljava/security/cert/X509Certificate;)Z", "matchesHostname", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "Lokio/ByteString;", "hash", "Lokio/ByteString;", "getHash", "()Lokio/ByteString;", "hashAlgorithm", "Ljava/lang/String;", "getHashAlgorithm", "pattern", "getPattern"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if ((!StringsKt.startsWith$default(str, "*.", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) str, "*", 1, false, 4, (Object) null) != -1) && ((!StringsKt.startsWith$default(str, "**.", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) str, "*", 2, false, 4, (Object) null) != -1) && StringsKt.indexOf$default((CharSequence) str, "*", 0, false, 6, (Object) null) != -1)) {
                throw new IllegalArgumentException("Unexpected pattern: ".concat(String.valueOf(str)).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.pattern = canonicalHost;
                if (StringsKt.startsWith$default(str2, "sha1/", false, 2, (Object) null)) {
                    this.hashAlgorithm = "sha1";
                    ByteString.Companion companion = ByteString.INSTANCE;
                    String strSubstring = str2.substring(5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strSubstring);
                    if (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        throw new IllegalArgumentException("Invalid pin hash: ".concat(String.valueOf(str2)));
                    }
                    this.hash = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    return;
                }
                if (StringsKt.startsWith$default(str2, "sha256/", false, 2, (Object) null)) {
                    this.hashAlgorithm = "sha256";
                    ByteString.Companion companion2 = ByteString.INSTANCE;
                    String strSubstring2 = str2.substring(7);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strSubstring2);
                    if (byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        throw new IllegalArgumentException("Invalid pin hash: ".concat(String.valueOf(str2)));
                    }
                    this.hash = byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    return;
                }
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(String.valueOf(str2)));
            }
            throw new IllegalArgumentException("Invalid pattern: ".concat(String.valueOf(str)));
        }

        public final String getPattern() {
            return this.pattern;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final ByteString getHash() {
            return this.hash;
        }

        public final boolean matchesHostname(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (StringsKt.startsWith$default(this.pattern, "**.", false, 2, (Object) null)) {
                int length = this.pattern.length() - 3;
                int length2 = p0.length() - length;
                return StringsKt.regionMatches$default(p0, p0.length() - length, this.pattern, 3, length, false, 16, (Object) null) && (length2 == 0 || p0.charAt(length2 - 1) == '.');
            }
            if (StringsKt.startsWith$default(this.pattern, "*.", false, 2, (Object) null)) {
                int length3 = this.pattern.length() - 1;
                return StringsKt.regionMatches$default(p0, p0.length() - length3, this.pattern, 1, length3, false, 16, (Object) null) && StringsKt.lastIndexOf$default((CharSequence) p0, '.', (p0.length() - length3) + (-1), false, 4, (Object) null) == -1;
            }
            return Intrinsics.areEqual(p0, this.pattern);
        }

        public final boolean matchesCertificate(X509Certificate p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            String str = this.hashAlgorithm;
            if (Intrinsics.areEqual(str, "sha256")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.INSTANCE.sha256Hash(p0));
            }
            if (Intrinsics.areEqual(str, "sha1")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.INSTANCE.sha1Hash(p0));
            }
            return false;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.hashAlgorithm);
            sb.append('/');
            sb.append(this.hash.b());
            return sb.toString();
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) p0;
            return Intrinsics.areEqual(this.pattern, pin.pattern) && Intrinsics.areEqual(this.hashAlgorithm, pin.hashAlgorithm) && Intrinsics.areEqual(this.hash, pin.hash);
        }

        public final int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }
    }

    public final void check(final String p0, final List<? extends Certificate> p1) throws SSLPeerUnverifiedException {
        int length;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            length = p0.length();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            length = 0;
        }
        if (zabx.b(new ArrayList()) != 0) {
            int[] iArr = new int[length];
            int i6 = length - 1;
            iArr[i6] = 1;
            Toast.makeText((Context) null, iArr[((length * i6) % 2) - 1], 1).show();
        }
        check$okhttp(p0, new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner.check.1
            @Override // kotlin.jvm.functions.Function0
            public final List<? extends X509Certificate> invoke() {
                List<Certificate> listClean;
                CertificateChainCleaner certificateChainCleaner$okhttp = CertificatePinner.this.getCertificateChainCleaner$okhttp();
                if (certificateChainCleaner$okhttp == null || (listClean = certificateChainCleaner$okhttp.clean(p1, p0)) == null) {
                    listClean = p1;
                }
                List<Certificate> list = listClean;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Certificate certificate : list) {
                    Intrinsics.checkNotNull(certificate, "");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }
        });
    }

    public final void check$okhttp(String p0, Function0<? extends List<? extends X509Certificate>> p1) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        List<Pin> listFindMatchingPins = findMatchingPins(p0);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = p1.invoke();
        Iterator<? extends X509Certificate> it = listInvoke.iterator();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            ByteString byteStringSha256Hash = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
                for (X509Certificate x509Certificate : listInvoke) {
                    int i4 = TuitionPaymentFragmentbindingInflater1 + 123;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                    int i5 = i4 % 2;
                    sb.append("\n    ");
                    sb.append(INSTANCE.pin(x509Certificate));
                    sb.append(": ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                }
                sb.append("\n  Pinned certificates for ");
                sb.append(p0);
                sb.append(":");
                Iterator<Pin> it2 = listFindMatchingPins.iterator();
                while (it2.hasNext()) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
                    TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                    if (i6 % 2 != 0) {
                        Pin next = it2.next();
                        sb.append("\n    ");
                        sb.append(next);
                        byteStringSha256Hash.hashCode();
                        throw null;
                    }
                    Pin next2 = it2.next();
                    sb.append("\n    ");
                    sb.append(next2);
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                throw new SSLPeerUnverifiedException(string);
            }
            X509Certificate next3 = it.next();
            ByteString byteStringSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (!(!Intrinsics.areEqual(hashAlgorithm, "sha256"))) {
                    if (byteStringSha256Hash == null) {
                        byteStringSha256Hash = INSTANCE.sha256Hash(next3);
                    }
                    if (Intrinsics.areEqual(pin.getHash(), byteStringSha256Hash)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.areEqual(hashAlgorithm, "sha1")) {
                        StringBuilder sb2 = new StringBuilder("unsupported hashAlgorithm: ");
                        sb2.append(pin.getHashAlgorithm());
                        throw new AssertionError(sb2.toString());
                    }
                    if (byteStringSha1Hash == null) {
                        byteStringSha1Hash = INSTANCE.sha1Hash(next3);
                        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    if (Intrinsics.areEqual(pin.getHash(), byteStringSha1Hash)) {
                        return;
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\"\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "<init>", "()V", "", "p0", "", "p1", "add", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "Lokhttp3/CertificatePinner;", "build", "()Lokhttp3/CertificatePinner;", "", "Lokhttp3/CertificatePinner$Pin;", "pins", "Ljava/util/List;", "getPins", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final List<Pin> getPins() {
            return this.pins;
        }

        public final Builder add(String p0, String... p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            for (String str : p1) {
                this.pins.add(new Pin(p0, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(CollectionsKt.toSet(this.pins), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:34:0x022e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0237  */
    /* JADX WARN: Code duplicated, block: B:39:0x0282  */
    /* JADX WARN: Code duplicated, block: B:43:0x02d9 A[Catch: all -> 0x0622, TryCatch #1 {all -> 0x0622, blocks: (B:41:0x02c4, B:43:0x02d9, B:44:0x031e, B:53:0x03c3, B:55:0x03d8, B:56:0x041a, B:68:0x0488, B:70:0x0495, B:71:0x04db, B:73:0x04f8, B:74:0x0549), top: B:99:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x032c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0335  */
    /* JADX WARN: Code duplicated, block: B:51:0x037f  */
    /* JADX WARN: Code duplicated, block: B:55:0x03d8 A[Catch: all -> 0x0622, TryCatch #1 {all -> 0x0622, blocks: (B:41:0x02c4, B:43:0x02d9, B:44:0x031e, B:53:0x03c3, B:55:0x03d8, B:56:0x041a, B:68:0x0488, B:70:0x0495, B:71:0x04db, B:73:0x04f8, B:74:0x0549), top: B:99:0x007e }] */
    @Deprecated(message = "replaced with {@link #check(String, List)}.", replaceWith = @ReplaceWith(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(String p0, Certificate... p1) throws Throwable {
        Method method;
        Method[] declaredMethods;
        int length;
        int i;
        Object[] objArr;
        int i2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ArrayList arrayList = new ArrayList();
        byte b2 = (byte) 0;
        byte b3 = b2;
        Object[] objArr2 = new Object[1];
        a(b2, b3, b3, objArr2);
        Method[] methodArr = {CertificatePinner.class.getMethod((String) objArr2[0], String.class, List.class)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        char c = '0';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2824;
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 22;
            byte[] bArr = $$d;
            byte b4 = bArr[54];
            byte b5 = (byte) (-bArr[5]);
            Object[] objArr3 = new Object[1];
            c(b4, b5, b5, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(mirror, iLastIndexOf, iResolveOpacity, 1814927978, false, (String) objArr3[0], null);
        }
        Class<?>[] clsArr = null;
        int i4 = 16;
        try {
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).get(null) == null) {
                int i5 = TuitionPaymentFragmentbindingInflater1 + 117;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                if (i5 % 2 == 0) {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTouchSlop() >> 8), 2823 - View.MeasureSpec.getSize(0), View.getDefaultSize(0, 0) + 22)).getDeclaredMethods();
                    length = declaredMethods.length;
                    i = 1;
                } else {
                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) Color.green(0), 2822 - TextUtils.indexOf((CharSequence) "", '0'), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getDeclaredMethods();
                    length = declaredMethods.length;
                    i = 0;
                }
                while (i < length) {
                    Method method2 = declaredMethods[i];
                    try {
                        int i6 = -TextUtils.lastIndexOf("", c, 0, 0);
                        Object[] objArr4 = new Object[1];
                        d(new char[]{55431, 30865, 14442, 55533, 24247, 29842, 36232, 65340, 16821, 51102, 56737, 34327, 60120, 8384, 18142, 10464, 5045, 35174, 12269, 46018, 48259, 61960, 35033, 23208, 9599, 23338, 29215, 64909}, i6, objArr4);
                        Class<?> cls = Class.forName((String) objArr4[0]);
                        char[] cArr = new char[i4];
                        // fill-array-data instruction
                        cArr[0] = 60131;
                        cArr[1] = 45981;
                        cArr[2] = 17302;
                        cArr[3] = 60036;
                        cArr[4] = 38335;
                        cArr[5] = 3948;
                        cArr[6] = 30956;
                        cArr[7] = 2676;
                        cArr[8] = 29584;
                        cArr[9] = 3226;
                        cArr[10] = 42581;
                        cArr[11] = 29563;
                        cArr[12] = 55474;
                        cArr[13] = 60295;
                        cArr[14] = 15650;
                        cArr[15] = 56722;
                        Object[] objArr5 = new Object[1];
                        d(cArr, 1 - (Process.myTid() >> 22), objArr5);
                        Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], clsArr).invoke(method2, clsArr)).intValue())};
                        Object[] objArr7 = new Object[1];
                        d(new char[]{25051, 14153, 25988, 25009, 4463, 10620, 30744, 2732, 63721, 34886, 32847, 29575, 21380, 28440, 6960, 56688, 43753, 50878, 29187, 18002, 1503, 48592, 54583, 44850, 39987, 5363, 12280, 2064, 63254, 35796}, 1 - ((Process.getThreadPriority(0) + 20) >> 6), objArr7);
                        Class<?> cls2 = Class.forName((String) objArr7[0]);
                        Object[] objArr8 = new Object[1];
                        d(new char[]{62750, 48716, 46535, 62839, 39032, 63751, 47554, 52086, 27766, 326, 20507, 45654}, -ImageFormat.getBitsPerPixel(0), objArr8);
                        if (((Boolean) cls2.getMethod((String) objArr8[0], Integer.TYPE).invoke(null, objArr6)).booleanValue()) {
                            Class cls3 = Long.TYPE;
                            Object[] objArr9 = new Object[1];
                            d(new char[]{55431, 30865, 14442, 55533, 24247, 29842, 36232, 65340, 16821, 51102, 56737, 34327, 60120, 8384, 18142, 10464, 5045, 35174, 12269, 46018, 48259, 61960, 35033, 23208, 9599, 23338, 29215, 64909}, Color.argb(0, 0, 0, 0) + 1, objArr9);
                            Class<?> cls4 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            d(new char[]{26044, 56702, 40726, 26075, 64348, 54252, 53489, 41590, 64709, 25193, 31433, 56178, 22506, 34133, 57769, 30092, 44685}, TextUtils.getTrimmedLength("") + 1, objArr10);
                            if (cls3.equals(cls4.getMethod((String) objArr10[0], null).invoke(method2, null))) {
                                Object[] objArr11 = new Object[1];
                                d(new char[]{55431, 30865, 14442, 55533, 24247, 29842, 36232, 65340, 16821, 51102, 56737, 34327, 60120, 8384, 18142, 10464, 5045, 35174, 12269, 46018, 48259, 61960, 35033, 23208, 9599, 23338, 29215, 64909}, Color.rgb(0, 0, 0) + 16777217, objArr11);
                                Class<?> cls5 = Class.forName((String) objArr11[0]);
                                Object[] objArr12 = new Object[1];
                                d(new char[]{26858, 11402, 54545, 26765, 2728, 39403, 38182, 59299, 61847, 37787, 12506, 40634, 23223, 29825, 43954, 12377, 41962, 56680, 49795, 43882, 3305}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr12);
                                Object[] objArr13 = (Object[]) cls5.getMethod((String) objArr12[0], null).invoke(method2, null);
                                if (objArr13.length == 2) {
                                    int i7 = TuitionPaymentFragmentbindingInflater1 + 79;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
                                    if (i7 % 2 == 0) {
                                        if (Long.TYPE.equals(objArr13[0])) {
                                            objArr = new Object[1];
                                            d(new char[]{55431, 30865, 14442, 55533, 24247, 29842, 36232, 65340, 16821, 51102, 56737, 34327, 60120, 8384, 18142, 10464, 5045, 35174, 12269, 46018, 48259, 61960, 35033, 23208, 9599, 23338, 29215, 64909}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                                            if (Class.forName((String) objArr[0]).equals(objArr13[1])) {
                                                i2 = TuitionPaymentFragmentbindingInflater1 + 115;
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                                                if (i2 % 2 == 0) {
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                                                        int scrollDefaultDelay = 2823 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                        int iRed = 22 - Color.red(0);
                                                        byte[] bArr2 = $$d;
                                                        byte b6 = bArr2[54];
                                                        byte b7 = (byte) (-bArr2[5]);
                                                        Object[] objArr14 = new Object[1];
                                                        c(b6, b7, b7, objArr14);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity, scrollDefaultDelay, iRed, 1814927978, false, (String) objArr14[0], null);
                                                    }
                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 2824;
                                                        int iIndexOf = 22 - TextUtils.indexOf("", "", 0, 0);
                                                        byte[] bArr3 = $$d;
                                                        byte b8 = bArr3[54];
                                                        byte b9 = (byte) (-bArr3[5]);
                                                        Object[] objArr15 = new Object[1];
                                                        c(b8, b9, b9, objArr15);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, modifierMetaStateMask, iIndexOf, 1814927978, false, (String) objArr15[0], null);
                                                    }
                                                    Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                        char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2823;
                                                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 22;
                                                        byte b10 = $$d[7];
                                                        byte b11 = b10;
                                                        Object[] objArr17 = new Object[1];
                                                        c(b10, b11, b11, objArr17);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, maxKeyCode, iNormalizeMetaState, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                                    }
                                                    ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr16)).longValue();
                                                    break;
                                                }
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int pressedStateDuration2 = 2823 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int trimmedLength = TextUtils.getTrimmedLength("") + 22;
                                                    byte[] bArr4 = $$d;
                                                    byte b12 = bArr4[54];
                                                    byte b13 = (byte) (-bArr4[5]);
                                                    Object[] objArr18 = new Object[1];
                                                    c(b12, b13, b13, objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay2, pressedStateDuration2, trimmedLength, 1814927978, false, (String) objArr18[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                                    int packedPositionGroup = 2823 - ExpandableListView.getPackedPositionGroup(0L);
                                                    int iRed2 = Color.red(0) + 22;
                                                    byte[] bArr5 = $$d;
                                                    byte b14 = bArr5[54];
                                                    byte b15 = (byte) (-bArr5[5]);
                                                    Object[] objArr19 = new Object[1];
                                                    c(b14, b15, b15, objArr19);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, packedPositionGroup, iRed2, 1814927978, false, (String) objArr19[0], null);
                                                }
                                                Object[] objArr20 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                    char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2823;
                                                    int iGreen = Color.green(0) + 22;
                                                    byte b16 = $$d[7];
                                                    byte b17 = b16;
                                                    Object[] objArr21 = new Object[1];
                                                    c(b16, b17, b17, objArr21);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, doubleTapTimeout, iGreen, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr20)).longValue();
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else if (Long.TYPE.equals(objArr13[0])) {
                                        objArr = new Object[1];
                                        d(new char[]{55431, 30865, 14442, 55533, 24247, 29842, 36232, 65340, 16821, 51102, 56737, 34327, 60120, 8384, 18142, 10464, 5045, 35174, 12269, 46018, 48259, 61960, 35033, 23208, 9599, 23338, 29215, 64909}, 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                                        if (Class.forName((String) objArr[0]).equals(objArr13[1])) {
                                            i2 = TuitionPaymentFragmentbindingInflater1 + 115;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                                            if (i2 % 2 == 0) {
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                    char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                                                    int scrollDefaultDelay3 = 2823 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    int iRed3 = 22 - Color.red(0);
                                                    byte[] bArr6 = $$d;
                                                    byte b18 = bArr6[54];
                                                    byte b19 = (byte) (-bArr6[5]);
                                                    Object[] objArr110 = new Object[1];
                                                    c(b18, b19, b19, objArr110);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveOpacity2, scrollDefaultDelay3, iRed3, 1814927978, false, (String) objArr110[0], null);
                                                }
                                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).set(null, method2);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                    char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                    int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 2824;
                                                    int iIndexOf2 = 22 - TextUtils.indexOf("", "", 0, 0);
                                                    byte[] bArr7 = $$d;
                                                    byte b20 = bArr7[54];
                                                    byte b21 = (byte) (-bArr7[5]);
                                                    Object[] objArr111 = new Object[1];
                                                    c(b20, b21, b21, objArr111);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout2, modifierMetaStateMask2, iIndexOf2, 1814927978, false, (String) objArr111[0], null);
                                                }
                                                Object[] objArr112 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).get(null)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    char pressedStateDuration3 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                    int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 2823;
                                                    int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 22;
                                                    byte b110 = $$d[7];
                                                    byte b111 = b110;
                                                    Object[] objArr113 = new Object[1];
                                                    c(b110, b111, b111, objArr113);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration3, maxKeyCode2, iNormalizeMetaState2, -2137287382, false, (String) objArr113[0], new Class[]{Long.TYPE, Method.class});
                                                }
                                                ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr112)).longValue();
                                                break;
                                            }
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char scrollDefaultDelay4 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                int pressedStateDuration4 = 2823 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                                int trimmedLength2 = TextUtils.getTrimmedLength("") + 22;
                                                byte[] bArr8 = $$d;
                                                byte b112 = bArr8[54];
                                                byte b113 = (byte) (-bArr8[5]);
                                                Object[] objArr114 = new Object[1];
                                                c(b112, b113, b113, objArr114);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay4, pressedStateDuration4, trimmedLength2, 1814927978, false, (String) objArr114[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, method2);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                                                int packedPositionGroup2 = 2823 - ExpandableListView.getPackedPositionGroup(0L);
                                                int iRed4 = Color.red(0) + 22;
                                                byte[] bArr9 = $$d;
                                                byte b114 = bArr9[54];
                                                byte b115 = (byte) (-bArr9[5]);
                                                Object[] objArr115 = new Object[1];
                                                c(b114, b115, b115, objArr115);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf2, packedPositionGroup2, iRed4, 1814927978, false, (String) objArr115[0], null);
                                            }
                                            Object[] objArr22 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2823;
                                                int iGreen2 = Color.green(0) + 22;
                                                byte b116 = $$d[7];
                                                byte b117 = b116;
                                                Object[] objArr23 = new Object[1];
                                                c(b116, b117, b117, objArr23);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, doubleTapTimeout2, iGreen2, -2137287382, false, (String) objArr23[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr22)).longValue();
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                        i++;
                        clsArr = null;
                        i4 = 16;
                        c = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 1);
                int keyRepeatDelay = 2823 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iBlue = 22 - Color.blue(0);
                byte[] bArr10 = $$d;
                byte b22 = bArr10[54];
                byte b23 = (byte) (-bArr10[5]);
                Object[] objArr24 = new Object[1];
                c(b22, b23, b23, objArr24);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionChild, keyRepeatDelay, iBlue, 1814927978, false, (String) objArr24[0], null);
            }
            Object[] objArr25 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char c4 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 2824;
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 22;
                byte[] bArr11 = $$d;
                byte b24 = (byte) (bArr11[51] - 1);
                byte b25 = bArr11[7];
                Object[] objArr26 = new Object[1];
                c(b24, b25, b25, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, iIndexOf3, packedPositionType, 1025296417, false, (String) objArr26[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr25);
            Object[] objArr27 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char deadChar = (char) (37657 - KeyEvent.getDeadChar(0, 0));
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2720;
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 20;
                byte[] bArr12 = $$d;
                byte b26 = (byte) (bArr12[51] - 1);
                byte b27 = bArr12[7];
                Object[] objArr28 = new Object[1];
                c(b26, b27, b27, objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(deadChar, tapTimeout, iLastIndexOf2, -1568796068, false, (String) objArr28[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr27)).longValue();
            long j = -515209406;
            long j2 = -1;
            long j3 = j ^ j2;
            long j4 = 184;
            long j5 = jLongValue ^ j2;
            long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j2;
            long j6 = (((long) (-183)) * j) + (((long) 185) * jLongValue) + (((long) (-368)) * (jLongValue | j3)) + ((j | j5 | jIdentityHashCode) * j4) + (j4 * (((jLongValue | j) ^ j2) | ((j3 | j5) ^ j2) | ((jIdentityHashCode | j) ^ j2))) + ((long) (-1295196439));
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = ((int) (j6 >> 32)) & (1942906178 + (((~(533637291 | i8)) | (-1970863703) | (~((-533637292) | iIdentityHashCode))) * (-564)) + ((~(iIdentityHashCode | (-357083139))) * 1128) + (((~((-1970863703) | i8)) | 176554153) * 564));
            int iMyPid = Process.myPid();
            int i10 = ~iMyPid;
            int i11 = i9 | (((int) j6) & ((-1843013019) + ((~(439856357 | i10)) * (-560)) + ((~(iMyPid | 2146938607)) * (-560)) + (((~((-1877082768) | i10)) | 170000517) * 560)));
            int i12 = i11 >>> 24;
            int i13 = i11 & ViewCompat.MEASURED_SIZE_MASK;
            int i14 = i12 != 0 ? 1 : 0;
            int i15 = (i14 ^ 1) ^ 1;
            arrayList.add((i14 == 0 || i13 >= 1 || (method = methodArr[i13]) == null) ? null : method.toString());
            if ((i12 + 6) * i15 != 0) {
                throw null;
            }
            check(p0, ArraysKt.toList(p1));
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        if (!Intrinsics.areEqual(this.certificateChainCleaner, p0)) {
            return new CertificatePinner(this.pins, p0);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i4 + 69;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 95;
        TuitionPaymentFragmentbindingInflater1 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 34 / 0;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, r5.certificateChainCleaner) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, r5.certificateChainCleaner) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        r6 = okhttp3.CertificatePinner.TuitionPaymentFragmentbindingInflater1 + 67;
        okhttp3.CertificatePinner.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if ((r6 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = okhttp3.CertificatePinner.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 99
            int r2 = r1 % 128
            okhttp3.CertificatePinner.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            boolean r1 = r6 instanceof okhttp3.CertificatePinner
            r2 = 0
            if (r1 == 0) goto L4d
            okhttp3.CertificatePinner r6 = (okhttp3.CertificatePinner) r6
            java.util.Set<okhttp3.CertificatePinner$Pin> r1 = r6.pins
            java.util.Set<okhttp3.CertificatePinner$Pin> r3 = r5.pins
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            r3 = 1
            if (r1 == r3) goto L1f
            goto L4d
        L1f:
            int r1 = okhttp3.CertificatePinner.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 113
            int r4 = r1 % 128
            okhttp3.CertificatePinner.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r4
            int r1 = r1 % r0
            okhttp3.internal.tls.CertificateChainCleaner r6 = r6.certificateChainCleaner
            if (r1 != 0) goto L38
            okhttp3.internal.tls.CertificateChainCleaner r1 = r5.certificateChainCleaner
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r1)
            r1 = 74
            int r1 = r1 / r2
            if (r6 == 0) goto L4d
            goto L40
        L38:
            okhttp3.internal.tls.CertificateChainCleaner r1 = r5.certificateChainCleaner
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r1)
            if (r6 == 0) goto L4d
        L40:
            int r6 = okhttp3.CertificatePinner.TuitionPaymentFragmentbindingInflater1
            int r6 = r6 + 67
            int r1 = r6 % 128
            okhttp3.CertificatePinner.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L4c
            return r2
        L4c:
            return r3
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.pins.hashCode();
            throw null;
        }
        int iHashCode2 = this.pins.hashCode();
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            iHashCode = certificateChainCleaner.hashCode();
        } else {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        }
        return ((iHashCode2 + 1517) * 41) + iHashCode;
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        b();
        INSTANCE = new Companion(null);
        DEFAULT = new Builder().build();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    public final List<Pin> findMatchingPins(String p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Set<Pin> set = this.pins;
        ArrayList arrayListEmptyList = CollectionsKt.emptyList();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        for (Object obj : set) {
            if (!(!((Pin) obj).matchesHostname(p0))) {
                if (arrayListEmptyList.isEmpty()) {
                    arrayListEmptyList = new ArrayList();
                }
                Intrinsics.checkNotNull(arrayListEmptyList, "");
                TypeIntrinsics.asMutableList(arrayListEmptyList).add(obj);
            }
        }
        return arrayListEmptyList;
    }

    @JvmStatic
    public static final String pin(Certificate certificate) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String strPin = INSTANCE.pin(certificate);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return strPin;
    }

    @JvmStatic
    public static final ByteString sha1Hash(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        ByteString byteStringSha1Hash = INSTANCE.sha1Hash(x509Certificate);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return byteStringSha1Hash;
    }

    @JvmStatic
    public static final ByteString sha256Hash(X509Certificate x509Certificate) throws Throwable {
        ByteString byteStringSha256Hash;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            byteStringSha256Hash = INSTANCE.sha256Hash(x509Certificate);
            int i3 = 2 / 0;
        } else {
            byteStringSha256Hash = INSTANCE.sha256Hash(x509Certificate);
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return byteStringSha256Hash;
    }

    static void b() {
        b = -1449534858394350559L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, short r6, int r7) {
        /*
            byte[] r0 = okhttp3.CertificatePinner.$$c
            int r5 = r5 * 2
            int r1 = 1 - r5
            int r7 = r7 * 2
            int r7 = r7 + 107
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r5
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L27:
            r3 = r0[r6]
        L29:
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.$$g(byte, short, int):java.lang.String");
    }
}

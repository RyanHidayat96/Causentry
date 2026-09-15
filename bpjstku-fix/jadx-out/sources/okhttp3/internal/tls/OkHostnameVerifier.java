package okhttp3.internal.tls;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0013\u0010\u0016\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u000e*\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "p0", "", "", "allSubjectAltNames", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "", "p1", "getSubjectAltNames", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;", "", "verify", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "Ljavax/net/ssl/SSLSession;", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "verifyHostname", "(Ljava/lang/String;Ljava/lang/String;)Z", "verifyIpAddress", "asciiToLowercase", "(Ljava/lang/String;)Ljava/lang/String;", "isAscii", "(Ljava/lang/String;)Z", "ALT_DNS_NAME", "I", "ALT_IPA_NAME"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static char b;
    private static final byte[] $$c = {53, -70, 9, -72};
    private static final int $$f = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, 65, -9, -121, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -59, 0, 15, 5, -16, 14, -3, 4, 67, -73, 3, 5};
    private static final int $$e = 16;
    private static final byte[] $$a = {25, 5, -88, -44, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 247;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1290a = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 14
            int r8 = r8 + 84
            int r7 = r7 * 52
            int r7 = r7 + 1
            int r9 = r9 * 52
            int r9 = r9 + 4
            byte[] r0 = okhttp3.internal.tls.OkHostnameVerifier.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r8 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r3 = -r3
            int r9 = r9 + r3
            int r8 = r8 + 1
            int r9 = r9 + (-11)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.OkHostnameVerifier.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = okhttp3.internal.tls.OkHostnameVerifier.$$d
            int r7 = r7 + 98
            int r9 = r9 * 34
            int r9 = 35 - r9
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + 3
            r8 = r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.OkHostnameVerifier.e(short, byte, byte, java.lang.Object[]):void");
    }

    private OkHostnameVerifier() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String p0, SSLSession p1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        boolean zVerify = false;
        if (!isAscii(p0)) {
            int i2 = f1290a + 33;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        try {
            Certificate certificate = p1.getPeerCertificates()[0];
            Intrinsics.checkNotNull(certificate, "");
            zVerify = verify(p0, (X509Certificate) certificate);
            int i4 = asInterface + 9;
            f1290a = i4 % 128;
            int i5 = i4 % 2;
        } catch (SSLException unused) {
        }
        return zVerify;
    }

    public final boolean verify(String p0, X509Certificate p1) {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        f1290a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (Util.canParseAsIpAddress(p0)) {
            int i4 = f1290a + 67;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return verifyIpAddress(p0, p1);
        }
        boolean zVerifyHostname = verifyHostname(p0, p1);
        int i6 = f1290a + 33;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return zVerifyHostname;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f A[PHI: r6 r7
  0x002f: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v11 java.lang.String) binds: [B:8:0x002d, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r7v3 java.util.List<java.lang.String>) = (r7v2 java.util.List<java.lang.String>), (r7v12 java.util.List<java.lang.String>) binds: [B:8:0x002d, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean verifyIpAddress(String p0, X509Certificate p1) {
        String canonicalHost;
        List<String> subjectAltNames;
        int i = 2 % 2;
        int i2 = f1290a + 41;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            canonicalHost = HostnamesKt.toCanonicalHost(p0);
            subjectAltNames = getSubjectAltNames(p1, 35);
            if (subjectAltNames instanceof Collection) {
                if (subjectAltNames.isEmpty()) {
                    int i3 = asInterface + 97;
                    f1290a = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
            }
        } else {
            canonicalHost = HostnamesKt.toCanonicalHost(p0);
            subjectAltNames = getSubjectAltNames(p1, 7);
            if (subjectAltNames instanceof Collection) {
                if (subjectAltNames.isEmpty()) {
                    int i5 = asInterface + 97;
                    f1290a = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
            }
        }
        Iterator<T> it = subjectAltNames.iterator();
        do {
            Object obj = null;
            if (!it.hasNext()) {
                int i7 = f1290a + 13;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }
            int i8 = f1290a + 11;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                Intrinsics.areEqual(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()));
                obj.hashCode();
                throw null;
            }
        } while (!Intrinsics.areEqual(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next())));
        return true;
    }

    private final boolean verifyHostname(String p0, X509Certificate p1) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        f1290a = i2 % 128;
        int i3 = i2 % 2;
        String strAsciiToLowercase = asciiToLowercase(p0);
        List<String> subjectAltNames = getSubjectAltNames(p1, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            int i4 = asInterface + 45;
            f1290a = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (!(!it.hasNext())) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                int i6 = asInterface;
                int i7 = i6 + 111;
                f1290a = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 57;
                f1290a = i9 % 128;
                int i10 = i9 % 2;
                return true;
            }
        }
        return false;
    }

    private final String asciiToLowercase(String str) {
        int i = 2 % 2;
        int i2 = f1290a + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        if (!isAscii(str)) {
            return str;
        }
        int i4 = asInterface + 13;
        f1290a = i4 % 128;
        if (i4 % 2 == 0) {
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return lowerCase;
        }
        Locale locale2 = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        Intrinsics.checkNotNullExpressionValue(str.toLowerCase(locale2), "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean isAscii(String str) {
        int i;
        char cCharAt;
        int i2 = 2 % 2;
        int length = str.length();
        int length2 = str.length();
        Intrinsics.checkNotNullParameter(str, "");
        if (length2 < 0) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(length2);
            sb.append(" < 0");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        int i3 = asInterface + 71;
        f1290a = i3 % 128;
        int i4 = i3 % 2;
        if (length2 > str.length()) {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(length2);
            sb2.append(" > ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j = 0;
        int i5 = 0;
        while (i5 < length2) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 128) {
                int i6 = asInterface + 47;
                int i7 = i6 % 128;
                f1290a = i7;
                if (i6 % 2 == 0) {
                    j++;
                }
                int i8 = i7 + 47;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
            } else {
                if (cCharAt2 < 2048) {
                    i = 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    i = 3;
                } else {
                    int i10 = i5 + 1;
                    if (i10 < length2) {
                        int i11 = f1290a + 91;
                        asInterface = i11 % 128;
                        int i12 = i11 % 2;
                        cCharAt = str.charAt(i10);
                    } else {
                        int i13 = f1290a + 73;
                        asInterface = i13 % 128;
                        int i14 = i13 % 2;
                        cCharAt = 0;
                    }
                    if (cCharAt2 <= 56319) {
                        int i15 = asInterface + 105;
                        f1290a = i15 % 128;
                        int i16 = i15 % 2;
                        if (cCharAt >= 56320 && cCharAt <= 57343) {
                            j += 4;
                            i5 += 2;
                        }
                    }
                    j++;
                    i5 = i10;
                }
                j += (long) i;
            }
            i5++;
        }
        int i17 = f1290a + 69;
        asInterface = i17 % 128;
        int i18 = i17 % 2;
        return length == ((int) j);
    }

    private static void d(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.green(0) + 8328), 1234 - Process.getGidForName(""), 34 - MotionEvent.axisFromString(""), -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int iRed = Color.red(0) + 2764;
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 14;
                    byte b4 = (byte) ($$f & 6);
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cCombineMeasuredStates, iRed, edgeSlop, 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43324 - ImageFormat.getBitsPerPixel(0)), 253 - TextUtils.getTrimmedLength(""), 22 - ExpandableListView.getPackedPositionType(0L), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 65200);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2891;
                    int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 17;
                    byte b6 = (byte) ($$f & 5);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cNormalizeMetaState, packedPositionType, edgeSlop2, 2012627446, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) b) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $11 + 89;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    private final boolean verifyHostname(String p0, String p1) {
        String str;
        String string = p0;
        String string2 = p1;
        int i = 2 % 2;
        String str2 = string;
        if (str2 != null && str2.length() != 0) {
            int i2 = f1290a + 45;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (!StringsKt.startsWith$default(string, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(string, "..", false, 2, (Object) null) && (str = string2) != null) {
                int i4 = asInterface + 1;
                f1290a = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 51 / 0;
                    if (str.length() != 0) {
                        if (StringsKt.startsWith$default(string2, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(string2, "..", false, 2, (Object) null)) {
                            int i6 = asInterface + 109;
                            f1290a = i6 % 128;
                            if (i6 % 2 == 0 ? !StringsKt.endsWith$default(string, ".", false, 2, (Object) null) : !StringsKt.endsWith$default(string, ".", false, 3, (Object) null)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(string);
                                sb.append('.');
                                string = sb.toString();
                                int i7 = asInterface + 35;
                                f1290a = i7 % 128;
                                if (i7 % 2 != 0) {
                                    int i8 = 4 % 2;
                                }
                            }
                            if (!StringsKt.endsWith$default(string2, ".", false, 2, (Object) null)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(string2);
                                sb2.append('.');
                                string2 = sb2.toString();
                            }
                            String strAsciiToLowercase = asciiToLowercase(string2);
                            String str3 = strAsciiToLowercase;
                            if (!StringsKt.contains$default((CharSequence) str3, (CharSequence) "*", false, 2, (Object) null)) {
                                int i9 = f1290a + 121;
                                asInterface = i9 % 128;
                                if (i9 % 2 != 0) {
                                    return Intrinsics.areEqual(string, strAsciiToLowercase);
                                }
                                boolean zAreEqual = Intrinsics.areEqual(string, strAsciiToLowercase);
                                int i10 = 86 / 0;
                                return zAreEqual;
                            }
                            if (StringsKt.startsWith$default(strAsciiToLowercase, "*.", false, 2, (Object) null) && StringsKt.indexOf$default((CharSequence) str3, '*', 1, false, 4, (Object) null) == -1) {
                                if (string.length() < strAsciiToLowercase.length()) {
                                    int i11 = f1290a + 123;
                                    asInterface = i11 % 128;
                                    int i12 = i11 % 2;
                                    return false;
                                }
                                if (Intrinsics.areEqual("*.", strAsciiToLowercase)) {
                                    return false;
                                }
                                String strSubstring = strAsciiToLowercase.substring(1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                if (!StringsKt.endsWith$default(string, strSubstring, false, 2, (Object) null)) {
                                    return false;
                                }
                                int length = string.length() - strSubstring.length();
                                if (length > 0) {
                                    int i13 = f1290a + 45;
                                    asInterface = i13 % 128;
                                    int i14 = i13 % 2;
                                    if (StringsKt.lastIndexOf$default((CharSequence) string, '.', length - 1, false, 4, (Object) null) != -1) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                        }
                    }
                } else if (str.length() != 0) {
                    if (StringsKt.startsWith$default(string2, ".", false, 2, (Object) null)) {
                    }
                }
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = f1290a + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        List<String> subjectAltNames = getSubjectAltNames(p0, 7);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16814783);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 626;
            int i4 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, bArr[5], b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iLastIndexOf, i4, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{33278, 61884, 3895, 57517}, new char[]{9120, 5004, 29253, 33809}, (char) KeyEvent.getDeadChar(0, 0), TextUtils.lastIndexOf("", '0', 0) + 1, new char[]{43615, 64457, 63681, 5525, 37166, 40752, 39864, 65140, 23822, 31566, 57646, 25999, 50003, 11640, 57848, 50682, 503, 64130, 7192, 56614, 19649, 18526}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{33278, 61884, 3895, 57517}, new char[]{28333, 1678, 1552, 28308}, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 37894), (ViewConfiguration.getEdgeSlop() >> 16) + 268865134, new char[]{9471, 29484, 53395, 35294, 37527, 10027, 23596, 63303, 18790, 43826, 21821, 36884, 64373, 17860, 11430}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAlpha = (char) (37567 - Color.alpha(0));
            int i5 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 625;
            int i6 = 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b3 = bArr2[5];
            byte b4 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAlpha, i5, i6, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) (37566 - ImageFormat.getBitsPerPixel(0));
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 625;
                int iIndexOf = 14 - TextUtils.indexOf("", "");
                byte[] bArr3 = $$a;
                byte b5 = bArr3[5];
                Object[] objArr6 = new Object[1];
                c(b5, bArr3[7], b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, windowTouchSlop, iIndexOf, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i9 = ~startElapsedRealtime;
            int i10 = 1899760768 + (((~((-828851672) | i9)) | 994886449) * 226) + (((~(i9 | (-2294983))) | (~((-994886450) | startElapsedRealtime)) | 168329760) * (-113)) + ((~(startElapsedRealtime | (-828851672))) * 113) + 450397177;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[1])[0] = i12 ^ (i12 << 5);
            objArr = new Object[]{new int[]{i8}, new int[1], new int[]{i7}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{33278, 61884, 3895, 57517}, new char[]{11124, 42966, 16989, 18101}, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46402), Color.blue(0), new char[]{63032, 11994, 30825, 12644, 48545, 59032, 41759, 22693, 27464, 28867, 9895, 43436, 49729, 9005, 9724, 44125, 7814, 54423, 63274, 4416, 9953, 57079, 10836, 58243, 55148, 39098}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{33278, 61884, 3895, 57517}, new char[]{25596, 18003, 10240, 26097}, (char) ((-16715480) - Color.rgb(0, 0, 0)), ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{10881, 38977, 3273, 35997, 38655, 1513, 34718, 16659, 26760, 24387, 33065, 30117, 19196, 20914, 46827, 44387, 14492, 45485}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i13 = asInterface + 117;
                f1290a = i13 % 128;
                int i14 = i13 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{33278, 61884, 3895, 57517}, new char[]{64542, 25822, 9560, 647}, (char) (34597 - (ViewConfiguration.getTouchSlop() >> 8)), 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{15010, 477, 34162, 32474, 50200, 59020, 57952, 1490, 3721, 52517, 8499, 2495, 24853, 47434, 20199, 25395}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{33278, 61884, 3895, 57517}, new char[]{35653, 18103, 32309, 6568}, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 43134), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{16080, 25028, 43941, 10109, 23843, 46574, 10373, 27577, 11344, 48188, 20106, 13789, 34911, 20319, 17339, 65469}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            d(new char[]{33278, 61884, 3895, 57517}, new char[]{29657, 2453, 30228, 30890}, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-1) - ImageFormat.getBitsPerPixel(0), new char[]{43367, 24688, 58745, 9776, 35400, 37668, 1482, 59776, 13528, 61036, 24271, 15782, 4055, 11125, 51507, 27257, 53541, 47221, 17397, 65293, 52706, 39100, 9086, 42849, 21142, 44621, 33630, 33759, 25258, 24899, 12394, 2318, 34593, 39274, 64645, 33523, 28970, 51316, 60448, 43913, 48762, 47614, 32844, 23899, 14112, 21985, 29253, 11713, 55804, 50672, 42946, 25536, 41488, 21396, 23882, 42448, 17464, 60436, 58765, 9407, 21618, 65171, 18851, 22013}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            d(new char[]{33278, 61884, 3895, 57517}, new char[]{55451, 34778, 52697, 52294}, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ViewConfiguration.getScrollDefaultDelay() >> 16, new char[]{11401, 41125, 40733, 19867, 31688, 28300, 36862, 14122, 8194, 13637, 7075, 50789, 25588, 30135, 28175, 34236, 56378, 7399, 7412, 52663, 8119, 18022, 1352, 10414, 34861, 8455, 9163, 25429, 15618, 41251, 295, 53031, 38086, 62278, 52752, 12654, 29673, 38927, 5005, 21542, 59335, 48087, 11844, 35952, 42183, 45068, 63438, 44125, 59073, 16718, 51391, 52970, 52305, 32614, 4300, 6327, 26766, 7313, 53362, 14016, 61147, 10177, 26651, 9355}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 450397177};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[27];
                byte b7 = (byte) (b6 + 1);
                Object[] objArr15 = new Object[1];
                e(b7, (byte) (-b7), b6, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b8 = bArr4[27];
                byte b9 = (byte) (b8 | 33);
                Object[] objArr16 = new Object[1];
                e(b8, b9, (byte) (b9 & 7), objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i15 = ((int[]) objArr[0])[0];
                int i16 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char scrollBarFadeDuration = (char) (37567 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int pressedStateDuration = 625 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int maximumDrawingCacheSize = 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte[] bArr5 = $$a;
                        byte b10 = bArr5[5];
                        Object[] objArr17 = new Object[1];
                        c(b10, bArr5[7], b10, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, pressedStateDuration, maximumDrawingCacheSize, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        d(new char[]{33278, 61884, 3895, 57517}, new char[]{9120, 5004, 29253, 33809}, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ViewConfiguration.getTouchSlop() >> 8, new char[]{43615, 64457, 63681, 5525, 37166, 40752, 39864, 65140, 23822, 31566, 57646, 25999, 50003, 11640, 57848, 50682, 503, 64130, 7192, 56614, 19649, 18526}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        d(new char[]{33278, 61884, 3895, 57517}, new char[]{28333, 1678, 1552, 28308}, (char) (37894 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 268865134, new char[]{9471, 29484, 53395, 35294, 37527, 10027, 23596, 63303, 18790, 43826, 21821, 36884, 64373, 17860, 11430}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMakeMeasureSpec = (char) (37567 - View.MeasureSpec.makeMeasureSpec(0, 0));
                            int iIndexOf2 = 625 - TextUtils.indexOf("", "", 0, 0);
                            int i17 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr6 = $$a;
                            byte b11 = bArr6[5];
                            byte b12 = bArr6[7];
                            Object[] objArr20 = new Object[1];
                            c(b11, b12, b12, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, iIndexOf2, i17, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) (37568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int windowTouchSlop2 = 625 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int iResolveSize = 14 - View.resolveSize(0, 0);
                            byte[] bArr7 = $$a;
                            byte b13 = bArr7[7];
                            Object[] objArr21 = new Object[1];
                            c(b13, bArr7[5], b13, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, windowTouchSlop2, iResolveSize, -477065106, false, (String) objArr21[0], null);
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                for (String str2 : strArr2) {
                    int i18 = asInterface + 119;
                    f1290a = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(str2);
                }
            }
            throw null;
        }
        int i20 = asInterface + 89;
        f1290a = i20 % 128;
        int i21 = i20 % 2;
        int i22 = ((int[]) objArr[1])[0];
        int i23 = ((int[]) objArr[2])[0];
        int i24 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr = {i23};
        int iNextInt = new Random().nextInt(1078571949);
        int i25 = i22 + ((((-1665830560) + (((-214175875) | (~iNextInt)) * (-490))) + (((~(iNextInt | (-1287952519))) | 1073776644) * 490)) - 541940414);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        Object obj = new Object[]{new int[]{i24}, new int[1], iArr, strArr3}[1];
        ((int[]) obj)[0] = i27 ^ (i27 << 5);
        int i28 = ((int[]) obj)[0];
        int i29 = i28 * i28;
        int i30 = -(1955132086 * i28);
        int i31 = (i29 & i30) + (i29 | i30);
        int i32 = -(i28 * 2060722422);
        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
        int i34 = ((i33 | (-1658929436)) << 1) - ((-1658929436) ^ i33);
        int i35 = i34 >> 15;
        int i36 = (i34 - (~((((((-262143) | i35) << 1) - (i35 ^ (-262143))) / 131072) + 1))) - 1;
        int i37 = i34 >> 18;
        int i38 = ((i37 ^ (-32767)) + ((i37 & (-32767)) << 1)) / 16384;
        int i39 = -(i36 ^ (((i38 | 1) << 1) - (i38 ^ 1)));
        int i40 = ((i39 | 9) << 1) - (i39 ^ 9);
        int i41 = i40 >> 24;
        int i42 = ((i41 ^ (-511)) + ((i41 & (-511)) << 1)) / 256;
        int i43 = ((i42 | 1) << 1) - (i42 ^ 1);
        return CollectionsKt.plus((Collection) subjectAltNames, (Iterable) getSubjectAltNames(p0, 34866 / (((-(((i43 | 1) << 1) - (i43 ^ 1))) & i40) * 1937)));
    }

    private final List<String> getSubjectAltNames(X509Certificate p0, int p1) {
        Object obj;
        int i = 2 % 2;
        try {
            Collection<List<?>> subjectAlternativeNames = p0.getSubjectAlternativeNames();
            Object obj2 = null;
            if (subjectAlternativeNames == null) {
                int i2 = asInterface + 49;
                f1290a = i2 % 128;
                if (i2 % 2 == 0) {
                    return CollectionsKt.emptyList();
                }
                CollectionsKt.emptyList();
                obj2.hashCode();
                throw null;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(p1)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            int i3 = asInterface + 13;
            f1290a = i3 % 128;
            if (i3 % 2 == 0) {
                return arrayList;
            }
            throw null;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        INSTANCE = new OkHostnameVerifier();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentbindingInflater1 = 5175729179340637391L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -981105359;
        b = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, short r7, short r8) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = okhttp3.internal.tls.OkHostnameVerifier.$$c
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 + 102
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.OkHostnameVerifier.$$g(short, short, short):java.lang.String");
    }
}

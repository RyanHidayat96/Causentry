package okhttp3.internal.tls;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lokhttp3/internal/tls/BasicTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "Ljava/security/cert/X509Certificate;", "p0", "<init>", "([Ljava/security/cert/X509Certificate;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "findByIssuerAndSignature", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "", "hashCode", "()I", "", "Ljavax/security/auth/x500/X500Principal;", "", "subjectToCaCerts", "Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BasicTrustRootIndex implements TrustRootIndex {
    private final Map<X500Principal, Set<X509Certificate>> subjectToCaCerts;
    private static final byte[] $$c = {41, 2, 45, -60};
    private static final int $$f = 30;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {33, -59, 107, -108, -10, 4, 65, -52, 5, -17, 21, -1, -9, 10, 59, -49, -11, 12, -12, 5, 8, 7, 56, -66, -1, 10, 65, -57, -3, -4, 17, -11, 6, 15, -9, 64, -52, -9, 4, 14, -6, -3, 66, -67, 18, -10, 1, 13, 57, -34, -33, 10, 46, -32, -15, 13, -4, 3, 29, -14, -10, 1, 13, 67, -77, 16, -7, 12, 37, -32, -15, 13, -4, 3, 76, -12, 16, -12, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 20, -5, -3, 12, -3, -3, 9, 32, -35, 10, -4, 13, -17, 17, -11, 67};
    private static final int $$e = 101;
    private static final byte[] $$a = {56, 94, 119, -19, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 103;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 4432023381757549793L;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = 53 - r6
            int r8 = r8 * 52
            int r8 = 108 - r8
            int r7 = r7 * 3
            int r7 = r7 + 84
            byte[] r1 = okhttp3.internal.tls.BasicTrustRootIndex.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.BasicTrustRootIndex.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 37
            int r6 = r6 + 38
            int r7 = r7 * 74
            int r7 = 78 - r7
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r0 = okhttp3.internal.tls.BasicTrustRootIndex.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + 2
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.BasicTrustRootIndex.c(int, byte, byte, java.lang.Object[]):void");
    }

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
        Intrinsics.checkNotNullParameter(x509CertificateArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = x509CertificateArr.length;
        int i = 0;
        while (i < length) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            X509Certificate x509Certificate = x509CertificateArr[i];
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(subjectX500Principal, "");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = (Set) new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
            ((Set) obj).add(x509Certificate);
            i++;
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 / 3;
            } else {
                int i8 = 2 % 2;
            }
        }
        this.subjectToCaCerts = linkedHashMap;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (p0 != this) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 7;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (!(p0 instanceof BasicTrustRootIndex) || (!Intrinsics.areEqual(((BasicTrustRootIndex) p0).subjectToCaCerts, this.subjectToCaCerts))) {
                return false;
            }
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i3 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.green(0) + 64838), 1356 - TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionChild(0L) + 39, 894276454, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - Color.green(0)), Color.argb(0, 0, 0, 0) + 468, TextUtils.getCapsMode("", 0, 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i4 = $11 + 21;
                $10 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $10 + 37;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public final X509Certificate findByIssuerAndSignature(X509Certificate p0) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.subjectToCaCerts.get(p0.getIssuerX500Principal());
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        Set<X509Certificate> set = this.subjectToCaCerts.get(p0.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        for (Object obj2 : set) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            try {
                p0.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 43042);
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3111;
            int i4 = 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b, b, bArr[40], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, keyRepeatTimeout, i4, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{26420, 444, 18188, 26453, 46933, 10854, 22217, 29998, 48455, 37238, 'B', 34993, 54115, 27504, 26212, 41648, 59673, 17684, 48154, 50338, 3881, 7944, 37406, 63812, 9691, 63684}, TextUtils.indexOf("", "", 0) + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{7205, 51698, 10643, 7232, 32537, 17660, 59700, 51921, 50762, 22836, 28381, 14130, 43128, 41772, 2233, 7528, 37400, 36164, 53908}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43041);
            int iIndexOf = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int scrollBarFadeDuration = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b2, b2, bArr2[5], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iIndexOf, scrollBarFadeDuration, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (43043 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                int iIndexOf2 = 3110 - TextUtils.indexOf((CharSequence) "", '0');
                int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22;
                byte[] bArr3 = $$a;
                byte b3 = bArr3[5];
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iIndexOf2, i7, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr7[2])[0];
            int i9 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i8};
            int iNextInt = new Random().nextInt();
            int i10 = 1489877946 + ((~((~iNextInt) | 1669312145)) * (-116)) + ((578529425 | iNextInt) * 116) + (((~(iNextInt | (-1126502034))) | 35719313) * 116) + 139125841;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[0])[0] = i12 ^ (i12 << 5);
            objArr = new Object[]{new int[1], new int[]{i9}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            b(new char[]{32456, 19129, 45399, 32418, 64607, 56367, 39236, 47792, 42234, 55926, 63004, 18287, 51863, 8232, 36930, 27908, 61679, 3606, 19024, 2868}, Color.rgb(0, 0, 0) + 16777217, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new char[]{26108, 49367, 43801, 26005, 30260, 50802, 55126, 62637, 49044, 20509, 60487, 2405, 53644, 43529, 35372, 8968, 60395, 33891, 20511, 17697}, ((Process.getThreadPriority(0) + 20) >> 6) + 1, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 139125841};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[46];
                byte b6 = b5;
                Object[] objArr11 = new Object[1];
                c(b5, b6, (byte) (b6 - 1), objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr4[46];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr12 = new Object[1];
                c(b8, b8, b7, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 43042);
                    int mirror = 3159 - AndroidCharacter.getMirror('0');
                    int i13 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr5 = $$a;
                    byte b9 = bArr5[5];
                    byte b10 = bArr5[7];
                    Object[] objArr13 = new Object[1];
                    a(b9, b10, b10, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(defaultSize, mirror, i13, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    b(new char[]{26420, 444, 18188, 26453, 46933, 10854, 22217, 29998, 48455, 37238, 'B', 34993, 54115, 27504, 26212, 41648, 59673, 17684, 48154, 50338, 3881, 7944, 37406, 63812, 9691, 63684}, -ImageFormat.getBitsPerPixel(0), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    b(new char[]{7205, 51698, 10643, 7232, 32537, 17660, 59700, 51921, 50762, 22836, 28381, 14130, 43128, 41772, 2233, 7528, 37400, 36164, 53908}, 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43042);
                        int maxKeyCode = 3111 - (KeyEvent.getMaxKeyCode() >> 16);
                        int maxKeyCode2 = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte[] bArr6 = $$a;
                        byte b11 = bArr6[7];
                        Object[] objArr16 = new Object[1];
                        a(b11, b11, bArr6[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, maxKeyCode, maxKeyCode2, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 43042);
                        int iLastIndexOf = 3110 - TextUtils.lastIndexOf("", '0');
                        int scrollBarSize = 22 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte[] bArr7 = $$a;
                        byte b12 = bArr7[7];
                        Object[] objArr17 = new Object[1];
                        a(b12, b12, bArr7[40], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize2, iLastIndexOf, scrollBarSize, -1272852037, false, (String) objArr17[0], null);
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            int i14 = TuitionPaymentFragmentbindingInflater1 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
            int i15 = i14 % 2;
            for (String str : strArr2) {
                int i16 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
                TuitionPaymentFragmentbindingInflater1 = i16 % 128;
                int i17 = i16 % 2;
                arrayList.add(str);
            }
            throw null;
        }
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        int i20 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i20};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i21 = 1809365622 + ((1432237266 | iMaxMemory) * 614);
        int i22 = ~iMaxMemory;
        int i23 = i18 + i21 + (((~((-422404457) | i22)) | 286007360 | (~(1282627002 | i22))) * (-1228)) + (((~(i22 | 1568634362)) | (~((-136397097) | i22))) * 614);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr[0])[0] = i25 ^ (i25 << 5);
        Object[] objArr18 = {new int[1], iArr2, new int[]{i19}, strArr3};
        int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
        TuitionPaymentFragmentbindingInflater1 = i26 % 128;
        int i27 = i26 % 2;
        Map<X500Principal, Set<X509Certificate>> map = this.subjectToCaCerts;
        if (i27 == 0) {
            return map.hashCode();
        }
        map.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = r6 * 4
            int r6 = 107 - r6
            byte[] r1 = okhttp3.internal.tls.BasicTrustRootIndex.$$c
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.tls.BasicTrustRootIndex.$$g(int, byte, int):java.lang.String");
    }
}

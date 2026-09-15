package okhttp3.tls.internal.der;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0080\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\bHÇ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÇ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\bHÇ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u000bHÇ\u0003¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\bHÇ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000eHÇ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0096\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\bHÇ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020*2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200H×\u0001¢\u0006\u0004\b1\u00102R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001aR&\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u001aR\u001c\u00108\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010&R\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001cR\u001a\u0010>\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001eR\u0011\u0010B\u001a\u0002008G¢\u0006\u0006\u001a\u0004\bA\u00102R&\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00104\u001a\u0004\bD\u0010\u001aR\u001a\u0010E\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010$R\u001c\u0010H\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u00109\u001a\u0004\bI\u0010&R\u001a\u0010J\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010!R\u001a\u0010M\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010\u0018"}, d2 = {"Lokhttp3/tls/internal/der/TbsCertificate;", "", "", "p0", "Ljava/math/BigInteger;", "p1", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "p2", "", "Lokhttp3/tls/internal/der/AttributeTypeAndValue;", "p3", "Lokhttp3/tls/internal/der/Validity;", "p4", "p5", "Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "p6", "Lokhttp3/tls/internal/der/BitString;", "p7", "p8", "Lokhttp3/tls/internal/der/Extension;", "p9", "<init>", "(JLjava/math/BigInteger;Lokhttp3/tls/internal/der/AlgorithmIdentifier;Ljava/util/List;Lokhttp3/tls/internal/der/Validity;Ljava/util/List;Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;Lokhttp3/tls/internal/der/BitString;Lokhttp3/tls/internal/der/BitString;Ljava/util/List;)V", "component1", "()J", "component10", "()Ljava/util/List;", "component2", "()Ljava/math/BigInteger;", "component3", "()Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "component4", "component5", "()Lokhttp3/tls/internal/der/Validity;", "component6", "component7", "()Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "component8", "()Lokhttp3/tls/internal/der/BitString;", "component9", "copy", "(JLjava/math/BigInteger;Lokhttp3/tls/internal/der/AlgorithmIdentifier;Ljava/util/List;Lokhttp3/tls/internal/der/Validity;Ljava/util/List;Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;Lokhttp3/tls/internal/der/BitString;Lokhttp3/tls/internal/der/BitString;Ljava/util/List;)Lokhttp3/tls/internal/der/TbsCertificate;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "extensions", "Ljava/util/List;", "getExtensions", "issuer", "getIssuer", "issuerUniqueID", "Lokhttp3/tls/internal/der/BitString;", "getIssuerUniqueID", "serialNumber", "Ljava/math/BigInteger;", "getSerialNumber", "signature", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "getSignature", "getSignatureAlgorithmName", "signatureAlgorithmName", "subject", "getSubject", "subjectPublicKeyInfo", "Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "getSubjectPublicKeyInfo", "subjectUniqueID", "getSubjectUniqueID", "validity", "Lokhttp3/tls/internal/der/Validity;", "getValidity", "version", "J", "getVersion"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class TbsCertificate {
    private final List<Extension> extensions;
    private final List<List<AttributeTypeAndValue>> issuer;
    private final BitString issuerUniqueID;
    private final BigInteger serialNumber;
    private final AlgorithmIdentifier signature;
    private final List<List<AttributeTypeAndValue>> subject;
    private final SubjectPublicKeyInfo subjectPublicKeyInfo;
    private final BitString subjectUniqueID;
    private final Validity validity;
    private final long version;
    private static final byte[] $$c = {12, -88, 33, 118};
    private static final int $$f = 179;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {101, 89, 94, -73, -9, 62, -71, 10, 1, -5, -20, 8, -16, 14, -22, 71, -62, -8, -9, 12, -16, 1, 10, -14, 59, -68, -4, 8, -16, 14, -22, 2, -6, -4, 66, -68, 10, -20, 11, -16, -7, 18, -4, -13, 4, 52, -36, -22, -20, 11, -16, -7, 18, -4, -13, 4, 18, -40, 16, -13, 0, -13, 8, -15, -1, 60, -55, -17, 3, -12, -4, 6, -13, 68, -57, 0, -22, 16, 48, -69, -5, 0, -1, -5, 62, -37, -37, 0, -1, -5, 40, -32, -22, 16, 11, -36, 2, -6, 10, 62, -3, -36, -54, 1, 12, -16, 1, 10, -14, 22, -41, 8, -9, 9, 0, -18, 8, 3, 20, -24, -15, 8, -5, 0, 45, -2};
    private static final int $$e = 71;
    private static final byte[] $$a = {109, 48, -62, 38, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$b = 213;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int g = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {47507, 47494, 47504, 47490, 47493, 47499, 47430, 47489, 47457, 47547, 47488, 47503, 47495, 47473, 47496, 47505, 47497, 47492, 47458, 47475, 47550, 47456, 47500, 47551, 47498, 47501, 47468};
    private static int TuitionPaymentFragmentbindingInflater1 = 2047719732;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    private static boolean b = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 100 - r8
            int r0 = 53 - r6
            byte[] r1 = okhttp3.tls.internal.der.TbsCertificate.$$a
            int r7 = 155 - r7
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.TbsCertificate.a(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 1
            int r8 = r8 * 59
            int r8 = r8 + 4
            int r7 = r7 + 98
            byte[] r1 = okhttp3.tls.internal.der.TbsCertificate.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + 1
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-3)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.TbsCertificate.d(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TbsCertificate(long j, BigInteger bigInteger, AlgorithmIdentifier algorithmIdentifier, List<? extends List<AttributeTypeAndValue>> list, Validity validity, List<? extends List<AttributeTypeAndValue>> list2, SubjectPublicKeyInfo subjectPublicKeyInfo, BitString bitString, BitString bitString2, List<Extension> list3) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        Intrinsics.checkNotNullParameter(algorithmIdentifier, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(validity, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(subjectPublicKeyInfo, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.version = j;
        this.serialNumber = bigInteger;
        this.signature = algorithmIdentifier;
        this.issuer = list;
        this.validity = validity;
        this.subject = list2;
        this.subjectPublicKeyInfo = subjectPublicKeyInfo;
        this.issuerUniqueID = bitString;
        this.subjectUniqueID = bitString2;
        this.extensions = list3;
    }

    public final long getVersion() {
        int i = 2 % 2;
        int i2 = g + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.version;
        }
        int i3 = 49 / 0;
        return this.version;
    }

    public final BigInteger getSerialNumber() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        BigInteger bigInteger = this.serialNumber;
        int i5 = i2 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return bigInteger;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AlgorithmIdentifier getSignature() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.signature;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<List<AttributeTypeAndValue>> getIssuer() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 39;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<List<AttributeTypeAndValue>> list = this.issuer;
        int i4 = i2 + 5;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return list;
    }

    public final Validity getValidity() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.validity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<List<AttributeTypeAndValue>> getSubject() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 93;
                $10 = i6 % 128;
                if (i6 % i2 != 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i5]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - Color.red(i4)), KeyEvent.keyCodeFromString("") + 2994, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, 1182129903, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 31340), 2994 - (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17, 1182129903, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i2 = 2;
                i4 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 254 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 23, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
        if (b) {
            int i7 = $11 + 89;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char size = (char) (33602 - View.MeasureSpec.getSize(0));
                    int i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3084;
                    int i10 = 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    byte b6 = (byte) ($$f & 5);
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, i9, i10, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i11 = 0;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i12 = $11 + 13;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                try {
                    Object[] objArr6 = {getsupportedpostviewsize, getsupportedpostviewsize};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (33601 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int gidForName = Process.getGidForName("") + 3086;
                        int iResolveOpacity = 26 - Drawable.resolveOpacity(0, 0);
                        byte b8 = (byte) ($$f & 5);
                        byte b9 = (byte) (b8 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, gidForName, iResolveOpacity, -2146875848, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    int i14 = $11 + 49;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                i11 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
            }
        }
    }

    public final SubjectPublicKeyInfo getSubjectPublicKeyInfo() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int gidForName = Process.getGidForName("") + 877;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 42, (short) (-bArr[9]), (byte) (-bArr[14]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, gidForName, longPressTimeout, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, TextUtils.lastIndexOf("", '0', 0) + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i2 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
            int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
            short s = $$a[7];
            Object[] objArr5 = new Object[1];
            a((byte) 52, s, (byte) s, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, i2, i3, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                int iIndexOf = TextUtils.indexOf("", "", 0) + 10;
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a((byte) (-bArr2[81]), bArr2[7], (byte) (-bArr2[14]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, iMakeMeasureSpec, iIndexOf, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i4 = (((1427345000 + (((~((-40902694) | iUptimeMillis)) | (~((~iUptimeMillis) | (-592465)))) * (-318))) + (((~(200307759 | iUptimeMillis)) | (-200900224)) * (-318))) + (((~(iUptimeMillis | (-200307760))) | 159997530) * TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - 749677679;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            c = 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(null, null, ImageFormat.getBitsPerPixel(0) + 128, new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(null, null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i7 = g + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -749677679};
                byte[] bArr3 = $$d;
                byte b2 = (byte) (bArr3[5] + 1);
                byte b3 = bArr3[8];
                Object[] objArr11 = new Object[1];
                d(b2, b3, b3, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b4 = bArr3[60];
                Object[] objArr12 = new Object[1];
                d(b4, b4, bArr3[8], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 876;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 11;
                    byte[] bArr4 = $$a;
                    Object[] objArr13 = new Object[1];
                    a((byte) (-bArr4[81]), bArr4[7], (byte) (-bArr4[14]), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, offsetBefore2, iLastIndexOf, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(null, null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(null, null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 876;
                        int iIndexOf2 = 9 - TextUtils.indexOf((CharSequence) "", '0');
                        short s2 = $$a[7];
                        Object[] objArr16 = new Object[1];
                        a((byte) 52, s2, (byte) s2, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, capsMode, iIndexOf2, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        int i9 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                        int i10 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        byte[] bArr5 = $$a;
                        Object[] objArr17 = new Object[1];
                        a((byte) 42, (short) (-bArr5[9]), (byte) (-bArr5[14]), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSizeAndState, i9, i10, -1199417970, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    int i11 = g + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                    c = 2;
                    int i12 = i11 % 2;
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
        int i13 = ((int[]) objArr[c])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    int i15 = g + 125;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 33;
        g = i17 % 128;
        int i18 = i17 % 2;
        int i19 = ((int[]) objArr[1])[0];
        Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i20 = ~System.identityHashCode(this);
        int i21 = i19 + 625831284 + ((1069527029 | i20) * 184) + (((~(i20 | 974562165)) | 230239957) * 184);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr18[1])[0] = i23 ^ (i23 << 5);
        return this.subjectPublicKeyInfo;
    }

    public final BitString getIssuerUniqueID() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 41;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        BitString bitString = this.issuerUniqueID;
        int i4 = i2 + 3;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return bitString;
    }

    public final BitString getSubjectUniqueID() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
        g = i2 % 128;
        int i3 = i2 % 2;
        BitString bitString = this.subjectUniqueID;
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return bitString;
    }

    public final List<Extension> getExtensions() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Extension> list = this.extensions;
        int i4 = i3 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String getSignatureAlgorithmName() {
        int i = 2 % 2;
        int i2 = g + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String algorithm = this.signature.getAlgorithm();
        if (!Intrinsics.areEqual(algorithm, ObjectIdentifiers.sha256WithRSAEncryption)) {
            if (!(!Intrinsics.areEqual(algorithm, ObjectIdentifiers.sha256withEcdsa))) {
                return "SHA256withECDSA";
            }
            throw new IllegalStateException(Intrinsics.stringPlus("unexpected signature algorithm: ", this.signature.getAlgorithm()).toString());
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
        g = i4 % 128;
        int i5 = i4 % 2;
        return "SHA256WithRSA";
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = (int) this.version;
        int iHashCode2 = this.serialNumber.hashCode();
        int iHashCode3 = this.signature.hashCode();
        int iHashCode4 = this.issuer.hashCode();
        int iHashCode5 = this.validity.hashCode();
        int iHashCode6 = this.subject.hashCode();
        int iHashCode7 = this.subjectPublicKeyInfo.hashCode();
        BitString bitString = this.issuerUniqueID;
        int iHashCode8 = 0;
        if (bitString == null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
            g = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bitString.hashCode();
        }
        BitString bitString2 = this.subjectUniqueID;
        if (bitString2 != null) {
            int i5 = g + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            if (i5 % 2 != 0) {
                bitString2.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iHashCode8 = bitString2.hashCode();
        }
        return (((((((((((((((((i2 * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + this.extensions.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x01fe  */
    public final AlgorithmIdentifier component3() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        AlgorithmIdentifier algorithmIdentifier = this.signature;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
            int mode = View.MeasureSpec.getMode(0) + 10;
            Object[] objArr2 = new Object[1];
            a((byte) 15, (short) 151, (byte) (-$$a[27]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, packedPositionChild, mode, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(null, null, Drawable.resolveOpacity(0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(null, null, 127 - View.MeasureSpec.getMode(0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iIndexOf = 876 - TextUtils.indexOf("", "");
            int iRgb = (-16777206) - Color.rgb(0, 0, 0);
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b2, (short) (b2 | 114), (byte) (-bArr[27]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, iIndexOf, iRgb, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int gidForName = Process.getGidForName("") + 877;
                int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr2[7], (short) (-bArr2[2]), (byte) (-bArr2[27]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, gidForName, maximumFlingVelocity, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i2 = ((((-27916000) + (((~((~iIdentityHashCode) | (-308470795))) | (~((-26804785) | iIdentityHashCode))) * (-302))) + ((~((-308470795) | iIdentityHashCode)) * (-604))) + (((~(iIdentityHashCode | (-335275579))) | (-402390592)) * 302)) - 551235309;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(null, null, 127 - TextUtils.getTrimmedLength(""), new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(null, null, 127 - View.MeasureSpec.getMode(0), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i6 = i5 + 115;
                g = i6 % 128;
                int i7 = i6 % 2;
                if (!(applicationContext instanceof ContextWrapper)) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i8 = i5 + 27;
                    g = i8 % 128;
                    int i9 = i8 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                }
            }
            Object[] objArr10 = new Object[1];
            c(null, null, 127 - (ViewConfiguration.getTapTimeout() >> 16), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(null, null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -551235309};
                byte[] bArr3 = $$d;
                Object[] objArr13 = new Object[1];
                d(bArr3[24], (byte) (-bArr3[40]), bArr3[60], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b3 = bArr3[60];
                Object[] objArr14 = new Object[1];
                d(b3, b3, bArr3[8], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString("");
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11;
                        byte[] bArr4 = $$a;
                        Object[] objArr15 = new Object[1];
                        a(bArr4[7], (short) (-bArr4[2]), (byte) (-bArr4[27]), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionGroup, iKeyCodeFromString, iIndexOf2, 2012931276, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        c(null, null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        c(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int scrollBarFadeDuration = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int i10 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b4 = bArr5[7];
                            Object[] objArr18 = new Object[1];
                            a(b4, (short) (b4 | 114), (byte) (-bArr5[27]), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, scrollBarFadeDuration, i10, 2012020043, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                            int iGreen = 876 - Color.green(0);
                            int gidForName2 = 9 - Process.getGidForName("");
                            Object[] objArr19 = new Object[1];
                            a((byte) 15, (short) 151, (byte) (-$$a[27]), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf2, iGreen, gidForName2, -1650998592, false, (String) objArr19[0], null);
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
        int i11 = ((int[]) objArr[2])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 != i11) {
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i13 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iNextInt = new Random().nextInt(88470438);
            int i14 = i13 + ((((~((-161933209) | iNextInt)) | 19317120) * (-566)) - 1911101740) + ((~(iNextInt | (-142616089))) * 566);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr20[1])[0] = i16 ^ (i16 << 5);
            return algorithmIdentifier;
        }
        int i17 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i18 = i17 + (-697369862) + ((~(1069129527 | iIdentityHashCode2)) * 623) + (((~iIdentityHashCode2) | 570460418) * (-623)) + (((~(iIdentityHashCode2 | 839950087)) | (~(799639858 | iIdentityHashCode2)) | (-1069129528)) * 623);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
        return algorithmIdentifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TbsCertificate copy$default(TbsCertificate tbsCertificate, long j, BigInteger bigInteger, AlgorithmIdentifier algorithmIdentifier, List list, Validity validity, List list2, SubjectPublicKeyInfo subjectPublicKeyInfo, BitString bitString, BitString bitString2, List list3, int i, Object obj) {
        BigInteger bigInteger2;
        Validity validity2;
        List list4;
        SubjectPublicKeyInfo subjectPublicKeyInfo2;
        BitString bitString3;
        List list5;
        int i2 = 2 % 2;
        long j2 = (i & 1) != 0 ? tbsCertificate.version : j;
        if ((i & 2) != 0) {
            int i3 = g + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0) {
                bigInteger2 = tbsCertificate.serialNumber;
                int i4 = 42 / 0;
            } else {
                bigInteger2 = tbsCertificate.serialNumber;
            }
        } else {
            bigInteger2 = bigInteger;
        }
        AlgorithmIdentifier algorithmIdentifier2 = (i & 4) != 0 ? tbsCertificate.signature : algorithmIdentifier;
        List list6 = (i & 8) != 0 ? tbsCertificate.issuer : list;
        if ((i & 16) != 0) {
            int i5 = g + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            validity2 = tbsCertificate.validity;
        } else {
            validity2 = validity;
        }
        Object obj2 = null;
        if ((i & 32) != 0) {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
            g = i7 % 128;
            if (i7 % 2 == 0) {
                List<List<AttributeTypeAndValue>> list7 = tbsCertificate.subject;
                obj2.hashCode();
                throw null;
            }
            list4 = tbsCertificate.subject;
        } else {
            list4 = list2;
        }
        if ((i & 64) != 0) {
            int i8 = g + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
            if (i8 % 2 != 0) {
                SubjectPublicKeyInfo subjectPublicKeyInfo3 = tbsCertificate.subjectPublicKeyInfo;
                throw null;
            }
            subjectPublicKeyInfo2 = tbsCertificate.subjectPublicKeyInfo;
        } else {
            subjectPublicKeyInfo2 = subjectPublicKeyInfo;
        }
        if ((i & 128) != 0) {
            int i9 = g + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
            if (i9 % 2 != 0) {
                bitString3 = tbsCertificate.issuerUniqueID;
                int i10 = 61 / 0;
            } else {
                bitString3 = tbsCertificate.issuerUniqueID;
            }
        } else {
            bitString3 = bitString;
        }
        BitString bitString4 = (i & 256) != 0 ? tbsCertificate.subjectUniqueID : bitString2;
        if ((i & 512) != 0) {
            int i11 = g + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
            int i12 = i11 % 2;
            list5 = tbsCertificate.extensions;
        } else {
            list5 = list3;
        }
        return tbsCertificate.copy(j2, bigInteger2, algorithmIdentifier2, list6, validity2, list4, subjectPublicKeyInfo2, bitString3, bitString4, list5);
    }

    public final long component1() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 99;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        long j = this.version;
        int i4 = i2 + 115;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return j;
    }

    public final List<Extension> component10() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 63;
        g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<Extension> list = this.extensions;
        int i4 = i2 + 81;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final BigInteger component2() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.serialNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<List<AttributeTypeAndValue>> component4() {
        int i = 2 % 2;
        int i2 = g + 55;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        List<List<AttributeTypeAndValue>> list = this.issuer;
        int i5 = i3 + 123;
        g = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Validity component5() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.validity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<List<AttributeTypeAndValue>> component6() {
        int i = 2 % 2;
        int i2 = g + 75;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        List<List<AttributeTypeAndValue>> list = this.subject;
        int i5 = i3 + 69;
        g = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final SubjectPublicKeyInfo component7() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subjectPublicKeyInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BitString component8() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        BitString bitString = this.issuerUniqueID;
        int i5 = i3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 == 0) {
            return bitString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BitString component9() {
        BitString bitString;
        int i = 2 % 2;
        int i2 = g + 87;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        if (i2 % 2 != 0) {
            bitString = this.subjectUniqueID;
            int i4 = 47 / 0;
        } else {
            bitString = this.subjectUniqueID;
        }
        int i5 = i3 + 23;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            return bitString;
        }
        throw null;
    }

    public final TbsCertificate copy(long p0, BigInteger p1, AlgorithmIdentifier p2, List<? extends List<AttributeTypeAndValue>> p3, Validity p4, List<? extends List<AttributeTypeAndValue>> p5, SubjectPublicKeyInfo p6, BitString p7, BitString p8, List<Extension> p9) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p9, "");
        TbsCertificate tbsCertificate = new TbsCertificate(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 113;
        g = i2 % 128;
        int i3 = i2 % 2;
        return tbsCertificate;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TbsCertificate)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            g = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        TbsCertificate tbsCertificate = (TbsCertificate) p0;
        if (this.version != tbsCertificate.version) {
            return false;
        }
        if (!Intrinsics.areEqual(this.serialNumber, tbsCertificate.serialNumber)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            g = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.signature, tbsCertificate.signature) || !Intrinsics.areEqual(this.issuer, tbsCertificate.issuer) || (!Intrinsics.areEqual(this.validity, tbsCertificate.validity)) || !Intrinsics.areEqual(this.subject, tbsCertificate.subject) || !Intrinsics.areEqual(this.subjectPublicKeyInfo, tbsCertificate.subjectPublicKeyInfo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.issuerUniqueID, tbsCertificate.issuerUniqueID)) {
            int i6 = g + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 1 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.subjectUniqueID, tbsCertificate.subjectUniqueID)) {
            return Intrinsics.areEqual(this.extensions, tbsCertificate.extensions);
        }
        int i8 = g + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("TbsCertificate(version=");
        sb.append(this.version);
        sb.append(", serialNumber=");
        sb.append(this.serialNumber);
        sb.append(", signature=");
        sb.append(this.signature);
        sb.append(", issuer=");
        sb.append(this.issuer);
        sb.append(", validity=");
        sb.append(this.validity);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", subjectPublicKeyInfo=");
        sb.append(this.subjectPublicKeyInfo);
        sb.append(", issuerUniqueID=");
        sb.append(this.issuerUniqueID);
        sb.append(", subjectUniqueID=");
        sb.append(this.subjectUniqueID);
        sb.append(", extensions=");
        sb.append(this.extensions);
        sb.append(')');
        String string = sb.toString();
        int i2 = g + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, int r6, int r7) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = okhttp3.tls.internal.der.TbsCertificate.$$c
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r5 = 68 - r5
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L14
            r3 = r6
            r5 = r7
            goto L27
        L14:
            r4 = r7
            r7 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r0[r2] = r3
            if (r2 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L25:
            r3 = r1[r5]
        L27:
            int r3 = -r3
            int r7 = r7 + r3
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.TbsCertificate.$$g(short, int, int):java.lang.String");
    }
}

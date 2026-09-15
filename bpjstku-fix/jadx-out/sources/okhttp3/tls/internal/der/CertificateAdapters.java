package okhttp3.tls.internal.der;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\tR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\tR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R2\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\tR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\tR2\u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u001bR \u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b%\u0010\u0007\u001a\u0004\b&\u0010\tR,\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0'0'0\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b(\u0010\u0007\u001a\u0004\b)\u0010\tR2\u0010*\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180'0\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0007R \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b,\u0010\u0007\u001a\u0004\b-\u0010\tR \u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b/\u0010\u0007\u001a\u0004\b0\u0010\tR \u00102\u001a\b\u0012\u0004\u0012\u0002010\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b2\u0010\f\u001a\u0004\b3\u0010\u001bR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0007"}, d2 = {"Lokhttp3/tls/internal/der/CertificateAdapters;", "", "<init>", "()V", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "Lokhttp3/tls/internal/der/AlgorithmIdentifier;", "algorithmIdentifier", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "getAlgorithmIdentifier$okhttp_tls", "()Lokhttp3/tls/internal/der/BasicDerAdapter;", "Lokhttp3/tls/internal/der/DerAdapter;", "algorithmParameters", "Lokhttp3/tls/internal/der/DerAdapter;", "Lokhttp3/tls/internal/der/AttributeTypeAndValue;", "attributeTypeAndValue", "Lokhttp3/tls/internal/der/BasicConstraints;", "basicConstraints", "Lokhttp3/tls/internal/der/Certificate;", "certificate", "getCertificate$okhttp_tls", "Lokhttp3/tls/internal/der/Extension;", "extension", "getExtension$okhttp_tls", "extensionValue", "Lkotlin/Pair;", "generalName", "getGeneralName$okhttp_tls", "()Lokhttp3/tls/internal/der/DerAdapter;", "", "generalNameDnsName", "getGeneralNameDnsName$okhttp_tls", "Lokio/ByteString;", "generalNameIpAddress", "getGeneralNameIpAddress$okhttp_tls", "name", "getName$okhttp_tls", "Lokhttp3/tls/internal/der/PrivateKeyInfo;", "privateKeyInfo", "getPrivateKeyInfo$okhttp_tls", "", "rdnSequence", "getRdnSequence$okhttp_tls", "subjectAlternativeName", "Lokhttp3/tls/internal/der/SubjectPublicKeyInfo;", "subjectPublicKeyInfo", "getSubjectPublicKeyInfo$okhttp_tls", "Lokhttp3/tls/internal/der/TbsCertificate;", "tbsCertificate", "getTbsCertificate$okhttp_tls", "", "time", "getTime$okhttp_tls", "Lokhttp3/tls/internal/der/Validity;", "validity"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CertificateAdapters {
    public static final CertificateAdapters INSTANCE = new CertificateAdapters();
    private static final BasicDerAdapter<AlgorithmIdentifier> algorithmIdentifier;
    private static final DerAdapter<Object> algorithmParameters;
    private static final BasicDerAdapter<AttributeTypeAndValue> attributeTypeAndValue;
    private static final BasicDerAdapter<BasicConstraints> basicConstraints;
    private static final BasicDerAdapter<Certificate> certificate;
    private static final BasicDerAdapter<Extension> extension;
    private static final BasicDerAdapter<Object> extensionValue;
    private static final DerAdapter<Pair<DerAdapter<?>, Object>> generalName;
    private static final BasicDerAdapter<String> generalNameDnsName;
    private static final BasicDerAdapter<ByteString> generalNameIpAddress;
    private static final DerAdapter<Pair<DerAdapter<?>, Object>> name;
    private static final BasicDerAdapter<PrivateKeyInfo> privateKeyInfo;
    private static final BasicDerAdapter<List<List<AttributeTypeAndValue>>> rdnSequence;
    private static final BasicDerAdapter<List<Pair<DerAdapter<?>, Object>>> subjectAlternativeName;
    private static final BasicDerAdapter<SubjectPublicKeyInfo> subjectPublicKeyInfo;
    private static final BasicDerAdapter<TbsCertificate> tbsCertificate;
    private static final DerAdapter<Long> time;
    private static final BasicDerAdapter<Validity> validity;

    private CertificateAdapters() {
    }

    static {
        DerAdapter<Long> derAdapter = new DerAdapter<Long>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$time$1
            private static short[] TuitionPaymentFragmentbindingInflater1;
            private static final byte[] $$c = {21, 65, -9, -121};
            private static final int $$d = 1;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {27, -8, 5, 78, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
            private static final int $$b = 33;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f1291a = 0;
            private static int g = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -791196479;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1934795559;
            private static int b = -1161909655;
            private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {49, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 54, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 55, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 55, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int r7, short r8, byte r9, java.lang.Object[] r10) {
                /*
                    byte[] r0 = okhttp3.tls.internal.der.CertificateAdapters$time$1.$$a
                    int r8 = r8 * 15
                    int r8 = 53 - r8
                    int r7 = r7 * 2
                    int r7 = 84 - r7
                    int r9 = 92 - r9
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r9
                    r4 = r2
                    r9 = r8
                    goto L2d
                L15:
                    r3 = r2
                L16:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r8) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L25:
                    int r9 = r9 + 1
                    r3 = r0[r9]
                    r6 = r9
                    r9 = r7
                    r7 = r3
                    r3 = r6
                L2d:
                    int r7 = -r7
                    int r9 = r9 + r7
                    int r7 = r9 + (-11)
                    r9 = r3
                    r3 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.CertificateAdapters$time$1.c(int, short, byte, java.lang.Object[]):void");
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<List<Long>> asSequenceOf(String str, int i, long j) {
                int i2 = 2 % 2;
                int i3 = g + 83;
                f1291a = i3 % 128;
                CertificateAdapters$time$1 certificateAdapters$time$1 = this;
                if (i3 % 2 == 0) {
                    return DerAdapter.DefaultImpls.asSequenceOf(certificateAdapters$time$1, str, i, j);
                }
                DerAdapter.DefaultImpls.asSequenceOf(certificateAdapters$time$1, str, i, j);
                throw null;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<List<Long>> asSetOf() {
                int i = 2 % 2;
                int i2 = g + 5;
                f1291a = i2 % 128;
                CertificateAdapters$time$1 certificateAdapters$time$1 = this;
                if (i2 % 2 == 0) {
                    return DerAdapter.DefaultImpls.asSetOf(certificateAdapters$time$1);
                }
                DerAdapter.DefaultImpls.asSetOf(certificateAdapters$time$1);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Long fromDer(ByteString byteString) {
                int i = 2 % 2;
                int i2 = f1291a + 31;
                g = i2 % 128;
                int i3 = i2 % 2;
                Long l = (Long) DerAdapter.DefaultImpls.fromDer(this, byteString);
                if (i3 == 0) {
                    int i4 = 7 / 0;
                }
                return l;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final /* bridge */ /* synthetic */ Long fromDer(DerReader derReader) throws Throwable {
                int i = 2 % 2;
                int i2 = g + 31;
                f1291a = i2 % 128;
                int i3 = i2 % 2;
                Long lFromDer = fromDer(derReader);
                int i4 = f1291a + 49;
                g = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 76 / 0;
                }
                return lFromDer;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final /* bridge */ /* synthetic */ Long fromDer(ByteString byteString) {
                int i = 2 % 2;
                int i2 = g + 107;
                f1291a = i2 % 128;
                int i3 = i2 % 2;
                Long lFromDer = fromDer(byteString);
                int i4 = f1291a + 107;
                g = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 64 / 0;
                }
                return lFromDer;
            }

            public final ByteString toDer(long j) {
                int i = 2 % 2;
                int i2 = f1291a + 39;
                g = i2 % 128;
                int i3 = i2 % 2;
                ByteString der = DerAdapter.DefaultImpls.toDer(this, Long.valueOf(j));
                int i4 = f1291a + 49;
                g = i4 % 128;
                int i5 = i4 % 2;
                return der;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final /* bridge */ /* synthetic */ ByteString toDer(Long l) {
                int i = 2 % 2;
                int i2 = f1291a + 125;
                g = i2 % 128;
                int i3 = i2 % 2;
                ByteString der = toDer(l.longValue());
                int i4 = g + 117;
                f1291a = i4 % 128;
                int i5 = i4 % 2;
                return der;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final /* bridge */ /* synthetic */ void toDer(DerWriter derWriter, Long l) throws IOException {
                int i = 2 % 2;
                int i2 = f1291a + 3;
                g = i2 % 128;
                int i3 = i2 % 2;
                toDer(derWriter, l.longValue());
                int i4 = f1291a + 69;
                g = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<Long> withExplicitBox(int i, long j, Boolean bool) {
                int i2 = 2 % 2;
                int i3 = f1291a + 15;
                g = i3 % 128;
                CertificateAdapters$time$1 certificateAdapters$time$1 = this;
                if (i3 % 2 != 0) {
                    return DerAdapter.DefaultImpls.withExplicitBox(certificateAdapters$time$1, i, j, bool);
                }
                DerAdapter.DefaultImpls.withExplicitBox(certificateAdapters$time$1, i, j, bool);
                throw null;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final boolean matches(DerHeader p0) {
                int i = 2 % 2;
                int i2 = g + 109;
                f1291a = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(p0, "");
                    Adapters.INSTANCE.getUTC_TIME().matches(p0);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(p0, "");
                if (Adapters.INSTANCE.getUTC_TIME().matches(p0) || Adapters.INSTANCE.getGENERALIZED_TIME().matches(p0)) {
                    return true;
                }
                int i3 = f1291a + 41;
                g = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }

            private static void d(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
                long j;
                boolean z;
                int length;
                byte[] bArr;
                int i4 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    long j2 = 0;
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        int keyRepeatTimeout = 2267 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 34;
                        byte b3 = (byte) ($$d - 1);
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, keyRepeatTimeout, packedPositionChild, 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    int i5 = iIntValue == -1 ? 1 : 0;
                    if (i5 == 0) {
                        j = 3046761265686732006L;
                    } else {
                        byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (bArr2 != null) {
                            int i6 = $10 + 87;
                            $11 = i6 % 128;
                            if (i6 % 2 == 0) {
                                length = bArr2.length;
                                bArr = new byte[length];
                            } else {
                                length = bArr2.length;
                                bArr = new byte[length];
                            }
                            int i7 = 0;
                            while (i7 < length) {
                                try {
                                    Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                                        int packedPositionChild2 = 3357 - ExpandableListView.getPackedPositionChild(j2);
                                        int iResolveSizeAndState = 18 - View.resolveSizeAndState(0, 0, 0);
                                        byte b5 = (byte) ($$d - 1);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, packedPositionChild2, iResolveSizeAndState, -1054011043, false, $$e(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                                    }
                                    bArr[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                    i7++;
                                    j2 = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            bArr2 = bArr;
                        }
                        if (bArr2 != null) {
                            byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                int i8 = 2267 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                byte b6 = (byte) ($$d - 1);
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i8, iIndexOf, 1387473586, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                            j = 3046761265686732006L;
                        } else {
                            j = 3046761265686732006L;
                            iIntValue = (short) (((short) (((long) TuitionPaymentFragmentbindingInflater1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ j)) + i5;
                        Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 55904);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2855;
                            int iIndexOf2 = TextUtils.indexOf("", "", 0) + 13;
                            int i9 = $$d;
                            byte b8 = (byte) (i9 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(windowTouchSlop, longPressTimeout, iIndexOf2, -1529949196, false, $$e(b8, b8, (byte) i9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            int i10 = $10 + 23;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            for (int i12 = 0; i12 < length2; i12++) {
                                bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 3046761265686732006L);
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            z = true;
                        } else {
                            int i13 = $11 + 53;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            z = false;
                        }
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                        while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                            if (z) {
                                int i15 = $10 + 13;
                                $11 = i15 % 128;
                                if (i15 % 2 == 0) {
                                    byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 + 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % (((byte) (((byte) (((long) bArr6[i16]) + 3046761265686732006L)) % s)) ^ b2));
                                } else {
                                    byte[] bArr7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr7[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                                }
                            } else {
                                short[] sArr = TuitionPaymentFragmentbindingInflater1;
                                int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
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

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Long fromDer(DerReader p0) throws Throwable {
                Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113;
                Object[] objArr;
                int i;
                long jLongValue;
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(p0, "");
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char trimmedLength = (char) (29944 - TextUtils.getTrimmedLength(""));
                    int iIndexOf = 1755 - TextUtils.indexOf("", "", 0, 0);
                    int mode = 23 - View.MeasureSpec.getMode(0);
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    byte b3 = bArr[5];
                    Object[] objArr2 = new Object[1];
                    c(b2, b3, (byte) (b3 | 88), objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(trimmedLength, iIndexOf, mode, 986134021, false, (String) objArr2[0], null);
                }
                Object obj = null;
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                d((-907277870) - (ViewConfiguration.getScrollBarSize() >> 8), (-64) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) View.MeasureSpec.getMode(0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1551503399, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                d(TextUtils.getTrimmedLength("") - 907277866, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 65, (short) (ViewConfiguration.getTapTimeout() >> 16), (byte) (TextUtils.indexOf((CharSequence) "", '0') + 1), KeyEvent.keyCodeFromString("") - 1551503377, objArr4);
                long jLongValue2 = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) (29945 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int touchSlop = 1755 - (ViewConfiguration.getTouchSlop() >> 8);
                    int threadPriority = 23 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr5 = new Object[1];
                    c(b4, b5, (byte) (b5 | 52), objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, touchSlop, threadPriority, 1596667560, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29944);
                        int gidForName = Process.getGidForName("") + 1756;
                        int iArgb = 23 - Color.argb(0, 0, 0, 0);
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr6 = new Object[1];
                        c(b6, b7, b7, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, gidForName, iArgb, 1599039318, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArrTuitionPaymentFragmentbindingInflater1$7879113 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i3 = ~((-545019103) | (~iIdentityHashCode));
                    int i4 = ((((((-872175359) | i3) | (~(545019102 | iIdentityHashCode))) * (-338)) + 1770074507) + (((~(iIdentityHashCode | (-327156257))) | i3) * 338)) - 114470243;
                    int i5 = (i4 << 13) ^ i4;
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0] = i6 ^ (i6 << 5);
                    int i7 = f1291a + 59;
                    g = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    Object[] objArr8 = new Object[1];
                    d((ViewConfiguration.getKeyRepeatDelay() >> 16) - 907277861, (-64) - (Process.myPid() >> 22), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (byte) Color.blue(0), (-1551503362) - (Process.myPid() >> 22), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    d((-907277863) - ImageFormat.getBitsPerPixel(0), Drawable.resolveOpacity(0, 0) - 64, (short) View.resolveSize(0, 0), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-1551503346) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr10 = {-1518307398};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 42049), 1726 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ImageFormat.getBitsPerPixel(0) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                        }
                        objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -114470243, false, true);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29944);
                            int packedPositionType = 1755 - ExpandableListView.getPackedPositionType(0L);
                            int packedPositionGroup = 23 - ExpandableListView.getPackedPositionGroup(0L);
                            byte b8 = $$a[7];
                            byte b9 = b8;
                            Object[] objArr11 = new Object[1];
                            c(b8, b9, b9, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, packedPositionType, packedPositionGroup, 1599039318, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
                        try {
                            Object[] objArr12 = new Object[1];
                            d((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 907277871, (-65) - ExpandableListView.getPackedPositionChild(0L), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1551503399, objArr12);
                            Class<?> cls3 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            d((-907277866) - View.combineMeasuredStates(0, 0), (-64) - KeyEvent.keyCodeFromString(""), (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-1551503377) - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr13);
                            long jLongValue3 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue3);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cMyTid = (char) (29944 - (Process.myTid() >> 22));
                                int iRgb = (-16775461) - Color.rgb(0, 0, 0);
                                int packedPositionGroup2 = 23 - ExpandableListView.getPackedPositionGroup(0L);
                                byte b10 = $$a[7];
                                byte b11 = b10;
                                Object[] objArr14 = new Object[1];
                                c(b10, b11, (byte) (b11 | 52), objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cMyTid, iRgb, packedPositionGroup2, 1596667560, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue3 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 29944);
                                int scrollDefaultDelay = 1755 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                int keyRepeatDelay = 23 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                byte[] bArr2 = $$a;
                                byte b12 = bArr2[7];
                                byte b13 = bArr2[5];
                                Object[] objArr15 = new Object[1];
                                c(b12, b13, (byte) (b13 | 88), objArr15);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(offsetBefore, scrollDefaultDelay, keyRepeatDelay, 986134021, false, (String) objArr15[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
                int i9 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0];
                int i10 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0];
                if (i10 == i9) {
                    int i11 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
                    objArr = new Object[]{new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
                    int i12 = ~System.identityHashCode(this);
                    int i13 = i11 + 783195996 + (((~((-1011174065) | i12)) | 798571638) * (-933)) + (((~(i12 | 798571638)) | (-1071480567)) * 933) + 431391518;
                    int i14 = (i13 << 13) ^ i13;
                    int i15 = i14 ^ (i14 >>> 17);
                    ((int[]) objArr[3])[0] = i15 ^ (i15 << 5);
                    i = 2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
                    int i16 = ((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[3])[0];
                    objArr = new Object[]{new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[0])[0]}, new int[]{((int[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[1])[0]}, (Object[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[2], new int[1], (String[]) objArrTuitionPaymentFragmentbindingInflater1$7879113[4]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i17 = i16 + (((~((-138412069) | iIdentityHashCode2)) | (-1073485423)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 532918016 + ((~((~iIdentityHashCode2) | (-138412069))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                    int i18 = (i17 << 13) ^ i17;
                    int i19 = i18 ^ (i18 >>> 17);
                    ((int[]) objArr[3])[0] = i19 ^ (i19 << 5);
                    int i20 = g + 49;
                    f1291a = i20 % 128;
                    i = 2;
                    int i21 = i20 % 2;
                }
                DerHeader derHeaderPeekHeader = p0.peekHeader();
                if (derHeaderPeekHeader == null) {
                    throw new ProtocolException(Intrinsics.stringPlus("expected time but was exhausted at ", p0));
                }
                int i22 = g + 29;
                f1291a = i22 % 128;
                if (i22 % i != 0) {
                    derHeaderPeekHeader.getTagClass();
                    Adapters.INSTANCE.getUTC_TIME().getTagClass();
                    obj.hashCode();
                    throw null;
                }
                if (derHeaderPeekHeader.getTagClass() != Adapters.INSTANCE.getUTC_TIME().getTagClass() || derHeaderPeekHeader.getTag() != Adapters.INSTANCE.getUTC_TIME().getTag()) {
                    if (derHeaderPeekHeader.getTagClass() == Adapters.INSTANCE.getGENERALIZED_TIME().getTagClass()) {
                        int i23 = f1291a + 43;
                        g = i23 % 128;
                        if (i23 % 2 == 0) {
                            derHeaderPeekHeader.getTag();
                            Adapters.INSTANCE.getGENERALIZED_TIME().getTag();
                            throw null;
                        }
                        if (derHeaderPeekHeader.getTag() == Adapters.INSTANCE.getGENERALIZED_TIME().getTag()) {
                            jLongValue = Adapters.INSTANCE.getGENERALIZED_TIME().fromDer(p0).longValue();
                        }
                    }
                    int i24 = ((int[]) objArr[3])[0];
                    int i25 = i24 * i24;
                    int i26 = -(984582763 * i24);
                    int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                    int i28 = -(i24 * (-1046434377));
                    int i29 = ((i27 & i28) + (i28 | i27)) - 2073839327;
                    int i30 = ((i29 >> 19) - 16383) / 8192;
                    int i31 = (i30 & 1) + (i30 | 1);
                    int i32 = (i29 ^ i31) + ((i31 & i29) << 1);
                    int i33 = i29 >> 20;
                    int i34 = ((i33 & (-8191)) + (i33 | (-8191))) / 4096;
                    int i35 = (-(i32 ^ ((i34 ^ 1) + ((i34 & 1) << 1)))) + 5;
                    int i36 = i35 >> 29;
                    int i37 = ((((i36 | (-15)) << 1) - (i36 ^ (-15))) / 8) + 1;
                    StringBuilder sb = new StringBuilder("8/0/expected time but was ".substring(12880 / ((i35 & (-((i37 ^ 1) + ((i37 & 1) << 1)))) * 644)));
                    sb.append(derHeaderPeekHeader);
                    sb.append(" at ");
                    sb.append(p0);
                    throw new ProtocolException(sb.toString());
                }
                int i38 = g + 23;
                f1291a = i38 % 128;
                int i39 = i38 % 2;
                jLongValue = Adapters.INSTANCE.getUTC_TIME().fromDer(p0).longValue();
                return Long.valueOf(jLongValue);
            }

            public final void toDer(DerWriter p0, long p1) throws IOException {
                int i = 2 % 2;
                int i2 = f1291a + 27;
                g = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(p0, "");
                if (-631152000000L <= p1) {
                    int i4 = g + 57;
                    int i5 = i4 % 128;
                    f1291a = i5;
                    if (i4 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (p1 < 2524608000000L) {
                        int i6 = i5 + 101;
                        g = i6 % 128;
                        int i7 = i6 % 2;
                        Adapters.INSTANCE.getUTC_TIME().toDer(p0, Long.valueOf(p1));
                        return;
                    }
                }
                Adapters.INSTANCE.getGENERALIZED_TIME().toDer(p0, Long.valueOf(p1));
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r6, short r7, short r8) {
                /*
                    int r8 = r8 + 117
                    int r6 = r6 * 2
                    int r0 = r6 + 1
                    byte[] r1 = okhttp3.tls.internal.der.CertificateAdapters$time$1.$$c
                    int r7 = r7 * 4
                    int r7 = r7 + 4
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r3 = r6
                    r8 = r7
                    r4 = r2
                    goto L29
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L23
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L23:
                    r3 = r1[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r5
                L29:
                    int r7 = r7 + r3
                    int r8 = r8 + 1
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.CertificateAdapters$time$1.$$e(byte, short, short):java.lang.String");
            }
        };
        time = derAdapter;
        Adapters adapters = Adapters.INSTANCE;
        Boolean bool = Boolean.FALSE;
        BasicDerAdapter<Validity> basicDerAdapterSequence = adapters.sequence("Validity", new DerAdapter[]{derAdapter, derAdapter}, new Function1<Validity, List<?>>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$validity$1
            @Override // kotlin.jvm.functions.Function1
            public final List<?> invoke(Validity validity2) {
                Intrinsics.checkNotNullParameter(validity2, "");
                return CollectionsKt.listOf((Object[]) new Long[]{Long.valueOf(validity2.getNotBefore()), Long.valueOf(validity2.getNotAfter())});
            }
        }, new Function1<List<?>, Validity>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$validity$2
            @Override // kotlin.jvm.functions.Function1
            public final Validity invoke(List<?> list) {
                Intrinsics.checkNotNullParameter(list, "");
                Object obj = list.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
                long jLongValue = ((Long) obj).longValue();
                Object obj2 = list.get(1);
                if (obj2 != null) {
                    return new Validity(jLongValue, ((Long) obj2).longValue());
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
        });
        validity = basicDerAdapterSequence;
        DerAdapter<Object> derAdapterUsingTypeHint = Adapters.INSTANCE.usingTypeHint(new Function1<Object, DerAdapter<?>>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$algorithmParameters$1
            @Override // kotlin.jvm.functions.Function1
            public final DerAdapter<?> invoke(Object obj) {
                if (!Intrinsics.areEqual(obj, ObjectIdentifiers.sha256WithRSAEncryption) && !Intrinsics.areEqual(obj, ObjectIdentifiers.rsaEncryption)) {
                    if (Intrinsics.areEqual(obj, ObjectIdentifiers.ecPublicKey)) {
                        return Adapters.INSTANCE.getOBJECT_IDENTIFIER();
                    }
                    return null;
                }
                return Adapters.INSTANCE.getNULL();
            }
        });
        algorithmParameters = derAdapterUsingTypeHint;
        BasicDerAdapter<AlgorithmIdentifier> basicDerAdapterSequence2 = Adapters.INSTANCE.sequence("AlgorithmIdentifier", new DerAdapter[]{Adapters.INSTANCE.getOBJECT_IDENTIFIER().asTypeHint(), derAdapterUsingTypeHint}, new Function1<AlgorithmIdentifier, List<?>>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$algorithmIdentifier$1
            @Override // kotlin.jvm.functions.Function1
            public final List<?> invoke(AlgorithmIdentifier algorithmIdentifier2) {
                Intrinsics.checkNotNullParameter(algorithmIdentifier2, "");
                return CollectionsKt.listOf(algorithmIdentifier2.getAlgorithm(), algorithmIdentifier2.getParameters());
            }
        }, new Function1<List<?>, AlgorithmIdentifier>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$algorithmIdentifier$2
            @Override // kotlin.jvm.functions.Function1
            public final AlgorithmIdentifier invoke(List<?> list) {
                Intrinsics.checkNotNullParameter(list, "");
                Object obj = list.get(0);
                if (obj != null) {
                    return new AlgorithmIdentifier((String) obj, list.get(1));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        });
        algorithmIdentifier = basicDerAdapterSequence2;
        basicConstraints = Adapters.INSTANCE.sequence("BasicConstraints", new DerAdapter[]{Adapters.INSTANCE.getBOOLEAN().optional(bool), BasicDerAdapter.optional$default(Adapters.INSTANCE.getINTEGER_AS_LONG(), null, 1, null)}, new Function1<BasicConstraints, List<?>>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$basicConstraints$1
            @Override // kotlin.jvm.functions.Function1
            public final List<?> invoke(BasicConstraints basicConstraints2) {
                Intrinsics.checkNotNullParameter(basicConstraints2, "");
                boolean ca = basicConstraints2.getCa();
                return CollectionsKt.listOf(Boolean.valueOf(ca), basicConstraints2.getMaxIntermediateCas());
            }
        }, new Function1<List<?>, BasicConstraints>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$basicConstraints$2
            @Override // kotlin.jvm.functions.Function1
            public final BasicConstraints invoke(List<?> list) {
                Intrinsics.checkNotNullParameter(list, "");
                Object obj = list.get(0);
                if (obj != null) {
                    return new BasicConstraints(((Boolean) obj).booleanValue(), (Long) list.get(1));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
        });
        BasicDerAdapter<String> basicDerAdapterWithTag$default = BasicDerAdapter.withTag$default(Adapters.INSTANCE.getIA5_STRING(), 0, 2L, 1, null);
        generalNameDnsName = basicDerAdapterWithTag$default;
        BasicDerAdapter<ByteString> basicDerAdapterWithTag$default2 = BasicDerAdapter.withTag$default(Adapters.INSTANCE.getOCTET_STRING(), 0, 7L, 1, null);
        generalNameIpAddress = basicDerAdapterWithTag$default2;
        DerAdapter<Pair<DerAdapter<?>, Object>> derAdapterChoice = Adapters.INSTANCE.choice(basicDerAdapterWithTag$default, basicDerAdapterWithTag$default2, Adapters.INSTANCE.getANY_VALUE());
        generalName = derAdapterChoice;
        subjectAlternativeName = DerAdapter.DefaultImpls.asSequenceOf$default(derAdapterChoice, null, 0, 0L, 7, null);
        BasicDerAdapter<Object> basicDerAdapterWithExplicitBox = Adapters.INSTANCE.usingTypeHint(new Function1<Object, DerAdapter<?>>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$extensionValue$1
            @Override // kotlin.jvm.functions.Function1
            public final DerAdapter<?> invoke(Object obj) {
                if (Intrinsics.areEqual(obj, ObjectIdentifiers.subjectAlternativeName)) {
                    return CertificateAdapters.subjectAlternativeName;
                }
                if (Intrinsics.areEqual(obj, ObjectIdentifiers.basicConstraints)) {
                    return CertificateAdapters.basicConstraints;
                }
                return null;
            }
        }).withExplicitBox(Adapters.INSTANCE.getOCTET_STRING().getTagClass(), Adapters.INSTANCE.getOCTET_STRING().getTag(), bool);
        extensionValue = basicDerAdapterWithExplicitBox;
        BasicDerAdapter<Extension> basicDerAdapterSequence3 = Adapters.INSTANCE.sequence("Extension", new DerAdapter[]{Adapters.INSTANCE.getOBJECT_IDENTIFIER().asTypeHint(), Adapters.INSTANCE.getBOOLEAN().optional(bool), basicDerAdapterWithExplicitBox}, new Function1<Extension, List<?>>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$extension$1
            @Override // kotlin.jvm.functions.Function1
            public final List<?> invoke(Extension extension2) {
                Intrinsics.checkNotNullParameter(extension2, "");
                String id2 = extension2.getId();
                boolean critical = extension2.getCritical();
                return CollectionsKt.listOf(id2, Boolean.valueOf(critical), extension2.getValue());
            }
        }, new Function1<List<?>, Extension>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$extension$2
            @Override // kotlin.jvm.functions.Function1
            public final Extension invoke(List<?> list) {
                Intrinsics.checkNotNullParameter(list, "");
                Object obj = list.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                String str = (String) obj;
                Object obj2 = list.get(1);
                if (obj2 != null) {
                    return new Extension(str, ((Boolean) obj2).booleanValue(), list.get(2));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
        });
        extension = basicDerAdapterSequence3;
        BasicDerAdapter<AttributeTypeAndValue> basicDerAdapterSequence4 = Adapters.INSTANCE.sequence("AttributeTypeAndValue", new DerAdapter[]{Adapters.INSTANCE.getOBJECT_IDENTIFIER(), Adapters.any$default(Adapters.INSTANCE, new Pair[]{TuplesKt.to(Reflection.getOrCreateKotlinClass(String.class), Adapters.INSTANCE.getUTF8_STRING()), TuplesKt.to(Reflection.getOrCreateKotlinClass(Void.class), Adapters.INSTANCE.getPRINTABLE_STRING()), TuplesKt.to(Reflection.getOrCreateKotlinClass(AnyValue.class), Adapters.INSTANCE.getANY_VALUE())}, false, null, 6, null)}, new Function1<AttributeTypeAndValue, List<?>>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$attributeTypeAndValue$1
            @Override // kotlin.jvm.functions.Function1
            public final List<?> invoke(AttributeTypeAndValue attributeTypeAndValue2) {
                Intrinsics.checkNotNullParameter(attributeTypeAndValue2, "");
                return CollectionsKt.listOf(attributeTypeAndValue2.getType(), attributeTypeAndValue2.getValue());
            }
        }, new Function1<List<?>, AttributeTypeAndValue>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$attributeTypeAndValue$2
            @Override // kotlin.jvm.functions.Function1
            public final AttributeTypeAndValue invoke(List<?> list) {
                Intrinsics.checkNotNullParameter(list, "");
                Object obj = list.get(0);
                if (obj != null) {
                    return new AttributeTypeAndValue((String) obj, list.get(1));
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        });
        attributeTypeAndValue = basicDerAdapterSequence4;
        BasicDerAdapter<List<List<AttributeTypeAndValue>>> basicDerAdapterAsSequenceOf$default = DerAdapter.DefaultImpls.asSequenceOf$default(basicDerAdapterSequence4.asSetOf(), null, 0, 0L, 7, null);
        rdnSequence = basicDerAdapterAsSequenceOf$default;
        DerAdapter<Pair<DerAdapter<?>, Object>> derAdapterChoice2 = Adapters.INSTANCE.choice(basicDerAdapterAsSequenceOf$default);
        name = derAdapterChoice2;
        BasicDerAdapter<AlgorithmIdentifier> basicDerAdapter = basicDerAdapterSequence2;
        BasicDerAdapter<SubjectPublicKeyInfo> basicDerAdapterSequence5 = Adapters.INSTANCE.sequence("SubjectPublicKeyInfo", new DerAdapter[]{basicDerAdapter, Adapters.INSTANCE.getBIT_STRING()}, new Function1<SubjectPublicKeyInfo, List<?>>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$subjectPublicKeyInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final List<?> invoke(SubjectPublicKeyInfo subjectPublicKeyInfo2) {
                Intrinsics.checkNotNullParameter(subjectPublicKeyInfo2, "");
                return CollectionsKt.listOf(subjectPublicKeyInfo2.getAlgorithm(), subjectPublicKeyInfo2.getSubjectPublicKey());
            }
        }, new Function1<List<?>, SubjectPublicKeyInfo>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$subjectPublicKeyInfo$2
            @Override // kotlin.jvm.functions.Function1
            public final SubjectPublicKeyInfo invoke(List<?> list) {
                Intrinsics.checkNotNullParameter(list, "");
                Object obj = list.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
                }
                AlgorithmIdentifier algorithmIdentifier2 = (AlgorithmIdentifier) obj;
                Object obj2 = list.get(1);
                if (obj2 != null) {
                    return new SubjectPublicKeyInfo(algorithmIdentifier2, (BitString) obj2);
                }
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.BitString");
            }
        });
        subjectPublicKeyInfo = basicDerAdapterSequence5;
        BasicDerAdapter<TbsCertificate> basicDerAdapterSequence6 = Adapters.INSTANCE.sequence("TBSCertificate", new DerAdapter[]{DerAdapter.DefaultImpls.withExplicitBox$default(Adapters.INSTANCE.getINTEGER_AS_LONG(), 0, 0L, null, 5, null).optional(0L), Adapters.INSTANCE.getINTEGER_AS_BIG_INTEGER(), basicDerAdapter, derAdapterChoice2, basicDerAdapterSequence, derAdapterChoice2, basicDerAdapterSequence5, BasicDerAdapter.optional$default(BasicDerAdapter.withTag$default(Adapters.INSTANCE.getBIT_STRING(), 0, 1L, 1, null), null, 1, null), BasicDerAdapter.optional$default(BasicDerAdapter.withTag$default(Adapters.INSTANCE.getBIT_STRING(), 0, 2L, 1, null), null, 1, null), DerAdapter.DefaultImpls.withExplicitBox$default(DerAdapter.DefaultImpls.asSequenceOf$default(basicDerAdapterSequence3, null, 0, 0L, 7, null), 0, 3L, null, 5, null).optional(CollectionsKt.emptyList())}, new Function1<TbsCertificate, List<?>>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$tbsCertificate$1
            @Override // kotlin.jvm.functions.Function1
            public final List<?> invoke(TbsCertificate tbsCertificate2) throws Throwable {
                Intrinsics.checkNotNullParameter(tbsCertificate2, "");
                long version = tbsCertificate2.getVersion();
                return CollectionsKt.listOf(Long.valueOf(version), tbsCertificate2.getSerialNumber(), tbsCertificate2.getSignature(), TuplesKt.to(CertificateAdapters.INSTANCE.getRdnSequence$okhttp_tls(), tbsCertificate2.getIssuer()), tbsCertificate2.getValidity(), TuplesKt.to(CertificateAdapters.INSTANCE.getRdnSequence$okhttp_tls(), tbsCertificate2.getSubject()), tbsCertificate2.getSubjectPublicKeyInfo(), tbsCertificate2.getIssuerUniqueID(), tbsCertificate2.getSubjectUniqueID(), tbsCertificate2.getExtensions());
            }
        }, new Function1<List<?>, TbsCertificate>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$tbsCertificate$2
            @Override // kotlin.jvm.functions.Function1
            public final TbsCertificate invoke(List<?> list) {
                Intrinsics.checkNotNullParameter(list, "");
                Object obj = list.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
                long jLongValue = ((Long) obj).longValue();
                Object obj2 = list.get(1);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.math.BigInteger");
                }
                BigInteger bigInteger = (BigInteger) obj2;
                Object obj3 = list.get(2);
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
                }
                AlgorithmIdentifier algorithmIdentifier2 = (AlgorithmIdentifier) obj3;
                Object obj4 = list.get(3);
                if (obj4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Pair<*, *>");
                }
                Object second = ((Pair) obj4).getSecond();
                if (second == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<okhttp3.tls.internal.der.AttributeTypeAndValue>>");
                }
                List list2 = (List) second;
                Object obj5 = list.get(4);
                if (obj5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.Validity");
                }
                Validity validity2 = (Validity) obj5;
                Object obj6 = list.get(5);
                if (obj6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Pair<*, *>");
                }
                Object second2 = ((Pair) obj6).getSecond();
                if (second2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<okhttp3.tls.internal.der.AttributeTypeAndValue>>");
                }
                List list3 = (List) second2;
                Object obj7 = list.get(6);
                if (obj7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.SubjectPublicKeyInfo");
                }
                SubjectPublicKeyInfo subjectPublicKeyInfo2 = (SubjectPublicKeyInfo) obj7;
                BitString bitString = (BitString) list.get(7);
                BitString bitString2 = (BitString) list.get(8);
                Object obj8 = list.get(9);
                if (obj8 != null) {
                    return new TbsCertificate(jLongValue, bigInteger, algorithmIdentifier2, list2, validity2, list3, subjectPublicKeyInfo2, bitString, bitString2, (List) obj8);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.tls.internal.der.Extension>");
            }
        });
        tbsCertificate = basicDerAdapterSequence6;
        certificate = Adapters.INSTANCE.sequence("Certificate", new DerAdapter[]{basicDerAdapterSequence6, basicDerAdapter, Adapters.INSTANCE.getBIT_STRING()}, new Function1<Certificate, List<?>>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$certificate$1
            @Override // kotlin.jvm.functions.Function1
            public final List<?> invoke(Certificate certificate2) {
                Intrinsics.checkNotNullParameter(certificate2, "");
                return CollectionsKt.listOf(certificate2.getTbsCertificate(), certificate2.getSignatureAlgorithm(), certificate2.getSignatureValue());
            }
        }, new Function1<List<?>, Certificate>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$certificate$2
            @Override // kotlin.jvm.functions.Function1
            public final Certificate invoke(List<?> list) {
                Intrinsics.checkNotNullParameter(list, "");
                Object obj = list.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.TbsCertificate");
                }
                TbsCertificate tbsCertificate2 = (TbsCertificate) obj;
                Object obj2 = list.get(1);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
                }
                AlgorithmIdentifier algorithmIdentifier2 = (AlgorithmIdentifier) obj2;
                Object obj3 = list.get(2);
                if (obj3 != null) {
                    return new Certificate(tbsCertificate2, algorithmIdentifier2, (BitString) obj3);
                }
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.BitString");
            }
        });
        privateKeyInfo = Adapters.INSTANCE.sequence("PrivateKeyInfo", new DerAdapter[]{Adapters.INSTANCE.getINTEGER_AS_LONG(), basicDerAdapter, Adapters.INSTANCE.getOCTET_STRING()}, new Function1<PrivateKeyInfo, List<?>>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$privateKeyInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final List<?> invoke(PrivateKeyInfo privateKeyInfo2) {
                Intrinsics.checkNotNullParameter(privateKeyInfo2, "");
                long version = privateKeyInfo2.getVersion();
                return CollectionsKt.listOf(Long.valueOf(version), privateKeyInfo2.getAlgorithmIdentifier(), privateKeyInfo2.getPrivateKey());
            }
        }, new Function1<List<?>, PrivateKeyInfo>() { // from class: okhttp3.tls.internal.der.CertificateAdapters$privateKeyInfo$2
            @Override // kotlin.jvm.functions.Function1
            public final PrivateKeyInfo invoke(List<?> list) {
                Intrinsics.checkNotNullParameter(list, "");
                Object obj = list.get(0);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                }
                long jLongValue = ((Long) obj).longValue();
                Object obj2 = list.get(1);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
                }
                AlgorithmIdentifier algorithmIdentifier2 = (AlgorithmIdentifier) obj2;
                Object obj3 = list.get(2);
                if (obj3 != null) {
                    return new PrivateKeyInfo(jLongValue, algorithmIdentifier2, (ByteString) obj3);
                }
                throw new NullPointerException("null cannot be cast to non-null type okio.ByteString");
            }
        });
    }

    public final DerAdapter<Long> getTime$okhttp_tls() {
        return time;
    }

    public final BasicDerAdapter<AlgorithmIdentifier> getAlgorithmIdentifier$okhttp_tls() {
        return algorithmIdentifier;
    }

    public final BasicDerAdapter<String> getGeneralNameDnsName$okhttp_tls() {
        return generalNameDnsName;
    }

    public final BasicDerAdapter<ByteString> getGeneralNameIpAddress$okhttp_tls() {
        return generalNameIpAddress;
    }

    public final DerAdapter<Pair<DerAdapter<?>, Object>> getGeneralName$okhttp_tls() {
        return generalName;
    }

    public final BasicDerAdapter<Extension> getExtension$okhttp_tls() {
        return extension;
    }

    public final BasicDerAdapter<List<List<AttributeTypeAndValue>>> getRdnSequence$okhttp_tls() {
        return rdnSequence;
    }

    public final DerAdapter<Pair<DerAdapter<?>, Object>> getName$okhttp_tls() {
        return name;
    }

    public final BasicDerAdapter<SubjectPublicKeyInfo> getSubjectPublicKeyInfo$okhttp_tls() {
        return subjectPublicKeyInfo;
    }

    public final BasicDerAdapter<TbsCertificate> getTbsCertificate$okhttp_tls() {
        return tbsCertificate;
    }

    public final BasicDerAdapter<Certificate> getCertificate$okhttp_tls() {
        return certificate;
    }

    public final BasicDerAdapter<PrivateKeyInfo> getPrivateKeyInfo$okhttp_tls() {
        return privateKeyInfo;
    }
}

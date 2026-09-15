package okhttp3.tls.internal.der;

import androidx.exifinterface.media.ExifInterface;
import defpackage.RotationProviderListenerWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J9\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\tH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\u0018\u0010\u001cJ3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Lokhttp3/tls/internal/der/DerAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "p0", "", "p1", "", "p2", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "", "asSequenceOf", "(Ljava/lang/String;IJ)Lokhttp3/tls/internal/der/BasicDerAdapter;", "asSetOf", "()Lokhttp3/tls/internal/der/BasicDerAdapter;", "Lokhttp3/tls/internal/der/DerReader;", "fromDer", "(Lokhttp3/tls/internal/der/DerReader;)Ljava/lang/Object;", "Lokio/ByteString;", "(Lokio/ByteString;)Ljava/lang/Object;", "Lokhttp3/tls/internal/der/DerHeader;", "", "matches", "(Lokhttp3/tls/internal/der/DerHeader;)Z", "toDer", "(Ljava/lang/Object;)Lokio/ByteString;", "Lokhttp3/tls/internal/der/DerWriter;", "", "(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V", "withExplicitBox", "(IJLjava/lang/Boolean;)Lokhttp3/tls/internal/der/BasicDerAdapter;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface DerAdapter<T> {
    BasicDerAdapter<List<T>> asSequenceOf(String p0, int p1, long p2);

    BasicDerAdapter<List<T>> asSetOf();

    T fromDer(DerReader p0);

    T fromDer(ByteString p0);

    boolean matches(DerHeader p0);

    ByteString toDer(T p0);

    void toDer(DerWriter p0, T p1);

    BasicDerAdapter<T> withExplicitBox(int p0, long p1, Boolean p2);

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T> T fromDer(DerAdapter<T> derAdapter, ByteString byteString) {
            Intrinsics.checkNotNullParameter(derAdapter, "");
            Intrinsics.checkNotNullParameter(byteString, "");
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            Intrinsics.checkNotNullParameter(byteString, "");
            byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault2(rotationProviderListenerWrapper, 0, byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            return derAdapter.fromDer(new DerReader(rotationProviderListenerWrapper));
        }

        public static <T> ByteString toDer(DerAdapter<T> derAdapter, T t) {
            Intrinsics.checkNotNullParameter(derAdapter, "");
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            derAdapter.toDer(new DerWriter(rotationProviderListenerWrapper), t);
            return rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size);
        }

        public static /* synthetic */ BasicDerAdapter withExplicitBox$default(DerAdapter derAdapter, int i, long j, Boolean bool, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withExplicitBox");
            }
            if ((i2 & 1) != 0) {
                i = 128;
            }
            if ((i2 & 4) != 0) {
                bool = null;
            }
            return derAdapter.withExplicitBox(i, j, bool);
        }

        public static <T> BasicDerAdapter<T> withExplicitBox(final DerAdapter<T> derAdapter, int i, long j, final Boolean bool) {
            Intrinsics.checkNotNullParameter(derAdapter, "");
            return new BasicDerAdapter<>("EXPLICIT", i, j, new BasicDerAdapter.Codec<T>() { // from class: okhttp3.tls.internal.der.DerAdapter$withExplicitBox$codec$1
                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                public final T decode(DerReader p0) {
                    Intrinsics.checkNotNullParameter(p0, "");
                    return derAdapter.fromDer(p0);
                }

                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                public final void encode(DerWriter p0, T p1) {
                    Intrinsics.checkNotNullParameter(p0, "");
                    derAdapter.toDer(p0, p1);
                    Boolean bool2 = bool;
                    if (bool2 != null) {
                        p0.setConstructed(bool2.booleanValue());
                    }
                }
            }, false, null, false, 112, null);
        }

        public static /* synthetic */ BasicDerAdapter asSequenceOf$default(DerAdapter derAdapter, String str, int i, long j, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asSequenceOf");
            }
            if ((i2 & 1) != 0) {
                str = "SEQUENCE OF";
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                j = 16;
            }
            return derAdapter.asSequenceOf(str, i, j);
        }

        public static <T> BasicDerAdapter<List<T>> asSequenceOf(final DerAdapter<T> derAdapter, String str, int i, long j) {
            Intrinsics.checkNotNullParameter(derAdapter, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new BasicDerAdapter<>(str, i, j, new BasicDerAdapter.Codec<List<? extends T>>() { // from class: okhttp3.tls.internal.der.DerAdapter$asSequenceOf$codec$1
                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                public final void encode(DerWriter p0, List<? extends T> p1) {
                    Intrinsics.checkNotNullParameter(p0, "");
                    Intrinsics.checkNotNullParameter(p1, "");
                    Iterator<? extends T> it = p1.iterator();
                    while (it.hasNext()) {
                        derAdapter.toDer(p0, it.next());
                    }
                }

                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                public final List<T> decode(DerReader p0) {
                    Intrinsics.checkNotNullParameter(p0, "");
                    ArrayList arrayList = new ArrayList();
                    while (p0.hasNext()) {
                        arrayList.add(derAdapter.fromDer(p0));
                    }
                    return arrayList;
                }
            }, false, null, false, 112, null);
        }

        public static <T> BasicDerAdapter<List<T>> asSetOf(DerAdapter<T> derAdapter) {
            Intrinsics.checkNotNullParameter(derAdapter, "");
            return derAdapter.asSequenceOf("SET OF", 0, 17L);
        }
    }
}

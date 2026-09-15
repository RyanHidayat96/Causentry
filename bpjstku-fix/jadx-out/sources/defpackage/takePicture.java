package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okhttp3.Dns;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0015B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0002\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00038\u0002X\u0083\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\f\u0010\u0014\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"LtakePicture;", "Lokhttp3/Dns;", "p0", "Lkotlin/time/Duration;", "p1", "<init>", "(Lokhttp3/Dns;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/util/List;)Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lokhttp3/Dns;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "", "LtakePicture$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "Ljava/util/Map;", "J", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class takePicture implements Dns {
    private static final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Map<String, TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Dns TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    private takePicture(Dns dns, long j) {
        Intrinsics.checkNotNullParameter(dns, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dns;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        this.TuitionPaymentFragmentbindingInflater1 = new LinkedHashMap();
    }

    public /* synthetic */ takePicture(Dns dns, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dns.SYSTEM : dns, (i & 2) != 0 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2 : j, null);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private final String TuitionPaymentFragmentbindingInflater1;
        final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final List<InetAddress> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, List<InetAddress> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = System.nanoTime();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        public final int hashCode() {
            return (this.TuitionPaymentFragmentbindingInflater1.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentbindingInflater1;
            List<InetAddress> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("ResolvedHost(hostname=");
            sb.append(str);
            sb.append(", addresses=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    @Override // okhttp3.Dns
    public final List<InetAddress> lookup(String p0) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(p0, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1.get(p0);
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            Duration.Companion companion = Duration.INSTANCE;
            if (Duration.m9373compareToLRDsOJo(DurationKt.toDuration(System.nanoTime() - tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, DurationUnit.NANOSECONDS), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) < 0 && !tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
                synchronized (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    InetAddress inetAddress = (InetAddress) CollectionsKt.removeFirstOrNull(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (inetAddress != null) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(inetAddress);
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        List<InetAddress> listLookup = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.lookup(p0);
        this.TuitionPaymentFragmentbindingInflater1.put(p0, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, CollectionsKt.toMutableList((Collection) listLookup)));
        return TuitionPaymentFragmentbindingInflater1(listLookup);
    }

    private static List<InetAddress> TuitionPaymentFragmentbindingInflater1(List<? extends InetAddress> p0) {
        List<InetAddress> list;
        synchronized (p0) {
            list = CollectionsKt.toList(p0);
        }
        return list;
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = DurationKt.toDuration(30, DurationUnit.MINUTES);
    }

    public /* synthetic */ takePicture(Dns dns, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(dns, j);
    }
}

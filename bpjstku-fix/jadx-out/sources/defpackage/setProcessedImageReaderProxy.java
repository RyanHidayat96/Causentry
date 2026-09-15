package defpackage;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018"}, d2 = {"LsetProcessedImageReaderProxy;", "", "", "p0", "p1", "p2", "", "p3", "", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "[B", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/Map;", "b", "asBinder", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class setProcessedImageReaderProxy {
    public final Map<String, String> TuitionPaymentFragmentbindingInflater1;
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String d;
    public final String b;

    public setProcessedImageReaderProxy(String str, String str2, String str3, Map<String, String> map, byte[] bArr, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.d = str3;
        this.TuitionPaymentFragmentbindingInflater1 = map;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str4;
    }

    public /* synthetic */ setProcessedImageReaderProxy(String str, String str2, String str3, Map map, byte[] bArr, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, map, bArr, (i & 32) != 0 ? null : str4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setProcessedImageReaderProxy)) {
            return false;
        }
        setProcessedImageReaderProxy setprocessedimagereaderproxy = (setProcessedImageReaderProxy) p0;
        return Intrinsics.areEqual(this.b, setprocessedimagereaderproxy.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, setprocessedimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.d, setprocessedimagereaderproxy.d) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, setprocessedimagereaderproxy.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, setprocessedimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, setprocessedimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode();
        int iHashCode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        int iHashCode3 = this.d.hashCode();
        int iHashCode4 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int iHashCode5 = Arrays.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str3 = this.d;
        Map<String, String> map = this.TuitionPaymentFragmentbindingInflater1;
        String string = Arrays.toString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String str4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("setProcessedImageReaderProxy(b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str2);
        sb.append(", d=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(map);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(string);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}

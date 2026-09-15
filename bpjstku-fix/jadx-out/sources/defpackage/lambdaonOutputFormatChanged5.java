package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0087\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0012\u0092\u0001\u0004\u0018\u00010\u0002"}, d2 = {"LlambdaonOutputFormatChanged5;", ExifInterface.LONGITUDE_EAST, "", "p0", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/Object;", "b", "holder"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class lambdaonOutputFormatChanged5<E> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Object b;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1() {
        return null;
    }

    public static final Object TuitionPaymentFragmentbindingInflater1(Object obj, E e2) {
        scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (obj == null) {
            return e2;
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "");
            ((ArrayList) obj).add(e2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e2);
        return arrayList;
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof lambdaonOutputFormatChanged5) && Intrinsics.areEqual(this.b, ((lambdaonOutputFormatChanged5) p0).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("lambdaonOutputFormatChanged5(b=");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}

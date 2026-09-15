package defpackage;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class abort extends createBitmap {
    private final List<RgbaImageProxy2> b;

    public abort(List<RgbaImageProxy2> list) {
        this.b = list;
    }

    @Override // defpackage.createBitmap
    @Encodable.Field(name = "logRequest")
    public final List<RgbaImageProxy2> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchedLogRequest{logRequests=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof createBitmap) {
            return this.b.equals(((createBitmap) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }
}

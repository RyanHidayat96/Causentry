package androidx.room.util;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/room/util/ByteArrayWrapper;", "", "", "p0", "<init>", "([B)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "array", "[B"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ByteArrayWrapper {
    public final byte[] array;

    public ByteArrayWrapper(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.array = bArr;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof ByteArrayWrapper) {
            return Arrays.equals(this.array, ((ByteArrayWrapper) p0).array);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.array);
    }
}

package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u001a\u001c\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0007\u001a\u00020\u0006*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a(\u0010\f\u001a\u00020\u0000*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0000*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u000e\u0010\r\u001a(\u0010\u000f\u001a\u00020\u0000*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u000f\u0010\r\u001a,\u0010\u000f\u001a\u00020\u0000*\u00060\u0000j\u0002`\u00012\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u000b\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014*\n\u0010\t\"\u00020\u00002\u00020\u0000"}, d2 = {"", "Landroidx/compose/runtime/CompositeKeyHashCode;", "toLong", "(J)J", "", "p0", "", "toString", "(JI)Ljava/lang/String;", "CompositeKeyHashCode", "(I)J", "p1", "compoundWith", "(JII)J", "unCompoundWith", "bottomUpCompoundWith", "(JJI)J", "CompositeKeyHashSizeBits", "I", "EmptyCompositeKeyHashCode", "J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CompositeKeyHashCode_jvmKt {
    public static final int CompositeKeyHashSizeBits = 64;
    public static final long EmptyCompositeKeyHashCode = 0;

    public static final long CompositeKeyHashCode(int i) {
        return i;
    }

    public static final long toLong(long j) {
        return j;
    }

    public static final String toString(long j, int i) {
        String string = Long.toString(j, CharsKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final long compoundWith(long j, int i, int i2) {
        return Long.rotateLeft(j, i2) ^ ((long) i);
    }

    public static final long unCompoundWith(long j, int i, int i2) {
        return Long.rotateRight(j ^ ((long) i), i2);
    }

    public static final long bottomUpCompoundWith(long j, int i, int i2) {
        return j ^ Long.rotateLeft(i, i2);
    }

    public static final long bottomUpCompoundWith(long j, long j2, int i) {
        return j ^ Long.rotateLeft(j2, i);
    }
}

package androidx.compose.ui.util;

import androidx.collection.SieveCacheKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\b\u0010\u0007\u001a\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\t\u0010\u0007\u001a\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\n\u0010\u0007\u001a \u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0086\b¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0010\u0010\u000f"}, d2 = {"", "p0", "p1", "", "packFloats", "(FF)J", "unpackFloat1", "(J)F", "unpackAbsFloat1", "unpackFloat2", "unpackAbsFloat2", "", "packInts", "(II)J", "unpackInt1", "(J)I", "unpackInt2"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InlineClassHelperKt {
    public static final long packInts(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final int unpackInt1(long j) {
        return (int) (j >> 32);
    }

    public static final int unpackInt2(long j) {
        return (int) (j & 4294967295L);
    }

    public static final long packFloats(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final float unpackFloat1(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float unpackAbsFloat1(long j) {
        return Float.intBitsToFloat((int) ((j >> 32) & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackFloat2(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float unpackAbsFloat2(long j) {
        return Float.intBitsToFloat((int) (j & SieveCacheKt.NodeLinkMask));
    }
}

package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0001\n\u0002\b\t\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0013H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\fH\u0081\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a \u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u0011\u001a'\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\bH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aS\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2*\u0010\u0001\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!0 \"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0007¢\u0006\u0004\b\u001e\u0010\"\u001a\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0004\b#\u0010\u0011\u001a\u0017\u0010$\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0004\b$\u0010\u0011\u001a \u0010%\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0081\b¢\u0006\u0004\b%\u0010\u000f\u001a\u0017\u0010&\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0004\b&\u0010\u0011\u001a0\u0010)\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\fH\u0080\b¢\u0006\u0004\b)\u0010*\u001a(\u0010+\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\fH\u0080\b¢\u0006\u0004\b+\u0010,\u001a\u0018\u0010.\u001a\u00020\u0002*\u00060\fj\u0002`-H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0018\u00100\u001a\u00020\u0016*\u00060\fj\u0002`-H\u0080\b¢\u0006\u0004\b0\u0010\u001b\u001a\u0018\u00102\u001a\u00020\u0002*\u00060\fj\u0002`1H\u0081\b¢\u0006\u0004\b2\u0010/\u001a\u001c\u00103\u001a\u00060\fj\u0002`-*\u00060\fj\u0002`\rH\u0080\b¢\u0006\u0004\b3\u00104\u001a\u001c\u00105\u001a\u00060\fj\u0002`-*\u00060\fj\u0002`\rH\u0081\b¢\u0006\u0004\b5\u00104\u001a$\u00106\u001a\u00060\fj\u0002`-*\u00060\fj\u0002`\r2\u0006\u0010\u0001\u001a\u00020\u0002H\u0081\b¢\u0006\u0004\b6\u00107\u001a\u0018\u00108\u001a\u00020\f*\u00060\fj\u0002`-H\u0080\b¢\u0006\u0004\b8\u00104\"\u0014\u00109\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\b9\u0010:\"\u001a\u0010;\u001a\u00020\f8\u0000X\u0081T¢\u0006\f\n\u0004\b;\u0010:\u0012\u0004\b<\u0010=\"\u001a\u0010>\u001a\u00020\f8\u0000X\u0081T¢\u0006\f\n\u0004\b>\u0010:\u0012\u0004\b?\u0010=\"\u0014\u0010@\u001a\u00020\u00028\u0000X\u0081T¢\u0006\u0006\n\u0004\b@\u0010A\"\u0014\u0010B\u001a\u00020\u00028\u0000X\u0081T¢\u0006\u0006\n\u0004\bB\u0010A\"\u0014\u0010C\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\bC\u0010:\"\u0014\u0010D\u001a\u00020\f8\u0000X\u0081T¢\u0006\u0006\n\u0004\bD\u0010:\"\u0014\u0010E\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bE\u0010F\"\"\u0010H\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020G0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010I\"\u0014\u0010J\u001a\u00020\u00028\u0000X\u0081T¢\u0006\u0006\n\u0004\bJ\u0010A\"\u0014\u0010K\u001a\u00020\u00028\u0000X\u0081T¢\u0006\u0006\n\u0004\bK\u0010A\"\u001a\u0010L\u001a\u00020\f8\u0000X\u0081T¢\u0006\f\n\u0004\bL\u0010:\u0012\u0004\bM\u0010=*\f\b\u0000\u0010N\"\u00020\f2\u00020\f*\f\b\u0000\u0010O\"\u00020\f2\u00020\f*\f\b\u0000\u0010P\"\u00020\f2\u00020\f"}, d2 = {"", "p0", "", "p1", "", "convertMetadataForCleanup", "([JI)V", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/ScatterMap;", "emptyScatterMap", "()Landroidx/collection/ScatterMap;", "", "Landroidx/collection/Group;", "group", "([JI)J", "h1", "(I)I", "h2", "", "hash", "(Ljava/lang/Object;)I", "", "isDeleted", "([JI)Z", "isEmpty", "isFull", "(J)Z", "loadedCapacity", "Landroidx/collection/MutableScatterMap;", "mutableScatterMapOf", "()Landroidx/collection/MutableScatterMap;", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/collection/MutableScatterMap;", "nextCapacity", "normalizeCapacity", "readRawMetadata", "unloadedCapacity", "p2", "p3", "writeMetadata", "([JIIJ)V", "writeRawMetadata", "([JIJ)V", "Landroidx/collection/Bitmask;", "get", "(J)I", "hasNext", "Landroidx/collection/StaticBitmask;", "lowestBitSet", "maskEmpty", "(J)J", "maskEmptyOrDeleted", "match", "(JI)J", "next", "AllEmpty", "J", "BitmaskLsb", "getBitmaskLsb$annotations", "()V", "BitmaskMsb", "getBitmaskMsb$annotations", "ClonedMetadataCount", "I", "DefaultScatterCapacity", "Deleted", "Empty", "EmptyGroup", "[J", "", "EmptyScatterMap", "Landroidx/collection/MutableScatterMap;", "GroupWidth", "MurmurHashC1", "Sentinel", "getSentinel$annotations", "Bitmask", "Group", "StaticBitmask"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};
    private static final MutableScatterMap EmptyScatterMap = new MutableScatterMap(0);
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    public static /* synthetic */ void getSentinel$annotations() {
    }

    public static final int h1(int i) {
        return i >>> 7;
    }

    public static final int h2(int i) {
        return i & 127;
    }

    public static final boolean hasNext(long j) {
        return j != 0;
    }

    public static final boolean isFull(long j) {
        return j < 128;
    }

    public static final long maskEmpty(long j) {
        return j & ((~j) << 6) & (-9187201950435737472L);
    }

    public static final long maskEmptyOrDeleted(long j) {
        return j & ((~j) << 7) & (-9187201950435737472L);
    }

    public static final long match(long j, int i) {
        long j2 = j ^ (((long) i) * BitmaskLsb);
        return (j2 - BitmaskLsb) & (~j2) & (-9187201950435737472L);
    }

    public static final long next(long j) {
        return j & (j - 1);
    }

    public static final int nextCapacity(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        MutableScatterMap mutableScatterMap = EmptyScatterMap;
        Intrinsics.checkNotNull(mutableScatterMap, "");
        return mutableScatterMap;
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        return new MutableScatterMap<>(0, 1, null);
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairArr.length);
        mutableScatterMap.putAll(pairArr);
        return mutableScatterMap;
    }

    public static final void convertMetadataForCleanup(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        for (int i2 = 0; i2 < ((i + 7) >> 3); i2++) {
            long j = jArr[i2] & (-9187201950435737472L);
            jArr[i2] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i3 = lastIndex - 1;
        jArr[i3] = (jArr[i3] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
    }

    public static final int hash(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final int normalizeCapacity(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int loadedCapacity(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int unloadedCapacity(int i) {
        if (i == 7) {
            return 8;
        }
        return i + ((i - 1) / 7);
    }

    public static final long readRawMetadata(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return (jArr[i >> 3] >> ((i & 7) << 3)) & 255;
    }

    public static final void writeRawMetadata(long[] jArr, int i, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (j << i3) | (jArr[i2] & (~(255 << i3)));
    }

    public static final int lowestBitSet(long j) {
        return Long.numberOfTrailingZeros(j) >> 3;
    }

    public static final long group(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        return (jArr[i2] >>> i3) | ((jArr[i2 + 1] << (64 - i3)) & ((-i3) >> 63));
    }

    public static final void writeMetadata(long[] jArr, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        long j2 = (j << i4) | (jArr[i3] & (~(255 << i4)));
        jArr[i3] = j2;
        jArr[(((i2 - 7) & i) + (i & 7)) >> 3] = j2;
    }

    public static final boolean isEmpty(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return ((jArr[i >> 3] >> ((i & 7) << 3)) & 255) == 128;
    }

    public static final boolean isDeleted(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return ((jArr[i >> 3] >> ((i & 7) << 3)) & 255) == 254;
    }

    public static final boolean isFull(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return ((jArr[i >> 3] >> ((i & 7) << 3)) & 255) < 128;
    }

    public static final int get(long j) {
        return Long.numberOfTrailingZeros(j) >> 3;
    }
}

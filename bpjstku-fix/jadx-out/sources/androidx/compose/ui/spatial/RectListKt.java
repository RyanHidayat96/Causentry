package androidx.compose.ui.spatial;

import androidx.collection.SieveCacheKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\n\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a@\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0010\u0010\u000e\u001a \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0007H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0016\u001a(\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a \u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001a\u0010\u0012\u001a\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001b\u0010\u000e\u001a\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001c\u0010\u000e\u001a\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001d\u0010\u000e\u001a\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001e\u0010\u000e\u001a\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001f\u0010\u000e\u001a0\u0010 \u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b \u0010!\u001a\u0014\u0010\"\u001a\u00020\u0003*\u00020\u0007H\u0080\b¢\u0006\u0004\b\"\u0010#\u001aW\u0010'\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0000H\u0000¢\u0006\u0004\b'\u0010(\u001a?\u0010)\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b)\u0010*\"\u0014\u0010+\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010-\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010,\"\u0014\u0010.\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u0010/\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010,\"\u0014\u00101\u001a\u0002008\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00103\u001a\u0002008\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u00102\"\u0014\u00104\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00102\"\u0014\u00105\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00102\"\u0014\u00106\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u00102\"\u0014\u00107\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010,\"\u0014\u00108\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u0010,\"\u0014\u00109\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010,\"\u0014\u0010:\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010,"}, d2 = {"", "p0", "p1", "", "packXY", "(II)J", "p2", "", "p3", "p4", "p5", "packMeta", "(IIIZZZ)J", "unpackMetaValue", "(J)I", "unpackMetaParentId", "unpackMetaLastChildOffset", "metaWithParentId", "(JI)J", "metaWithUpdated", "(JZ)J", "metaMarkUpdated", "(J)J", "metaUnMarkUpdated", "metaMarkFlags", "(JZZ)J", "metaWithLastChildOffset", "unpackMetaFocusable", "unpackMetaGesturable", "unpackMetaUpdated", "unpackX", "unpackY", "rectIntersectsRect", "(JJJJ)Z", "toLong", "(Z)J", "p6", "p7", "p8", "distanceScore", "(IIIIIIIII)I", "distanceScoreAlongAxis", "(IIIIII)I", "LongsPerItem", "I", "InitialSize", "Lower26Bits", "Lower9Bits", "Lkotlin/ULong;", "EverythingButParentId", "J", "EverythingButLastChildOffset", "PackedIntsLowestBit", "PackedIntsHighestBit", "TombStone", "AxisNorth", "AxisSouth", "AxisWest", "AxisEast"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RectListKt {
    public static final int AxisEast = 3;
    public static final int AxisNorth = 0;
    public static final int AxisSouth = 1;
    public static final int AxisWest = 2;
    public static final long EverythingButLastChildOffset = -2301339409586323457L;
    public static final long EverythingButParentId = -4503599560261633L;
    public static final int InitialSize = 64;
    public static final int LongsPerItem = 3;
    public static final int Lower26Bits = 67108863;
    public static final int Lower9Bits = 511;
    private static final long PackedIntsHighestBit = -9223372034707292160L;
    private static final long PackedIntsLowestBit = 4294967297L;
    public static final long TombStone = 2305843009213693951L;

    public static final long metaMarkFlags(long j, boolean z, boolean z2) {
        return (j & 4611686018427387903L) | ((z ? 1L : 0L) * SieveCacheKt.NodeVisitedBit) | ((z2 ? 1L : 0L) * Long.MIN_VALUE);
    }

    public static final long metaMarkUpdated(long j) {
        return j | 2305843009213693952L;
    }

    public static final long metaUnMarkUpdated(long j) {
        return j & (-2305843009213693953L);
    }

    public static final long metaWithLastChildOffset(long j, int i) {
        return (j & EverythingButLastChildOffset) | (((long) (i & 511)) << 52);
    }

    public static final long metaWithParentId(long j, int i) {
        return (j & EverythingButParentId) | (((long) (i & Lower26Bits)) << 26);
    }

    public static final long metaWithUpdated(long j, boolean z) {
        return (j & (-2305843009213693953L)) | ((z ? 1L : 0L) << 61);
    }

    public static final long packMeta(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        return ((z2 ? 1L : 0L) << 62) | ((z3 ? 1L : 0L) << 63) | ((z ? 1L : 0L) << 61) | (((long) (i3 & 511)) << 52) | (((long) (i2 & Lower26Bits)) << 26) | ((long) (i & Lower26Bits));
    }

    public static final long packXY(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final boolean rectIntersectsRect(long j, long j2, long j3, long j4) {
        return ((((j4 - j) - 4294967297L) | ((j2 - j3) - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static final long toLong(boolean z) {
        return z ? 1L : 0L;
    }

    public static final int unpackMetaFocusable(long j) {
        return ((int) (j >> 62)) & 1;
    }

    public static final int unpackMetaGesturable(long j) {
        return ((int) (j >> 63)) & 1;
    }

    public static final int unpackMetaLastChildOffset(long j) {
        return ((int) (j >> 52)) & 511;
    }

    public static final int unpackMetaParentId(long j) {
        return ((int) (j >> 26)) & Lower26Bits;
    }

    public static final int unpackMetaUpdated(long j) {
        return ((int) (j >> 61)) & 1;
    }

    public static final int unpackMetaValue(long j) {
        return ((int) j) & Lower26Bits;
    }

    public static final int unpackX(long j) {
        return (int) (j >> 32);
    }

    public static final int unpackY(long j) {
        return (int) j;
    }

    public static final int distanceScore(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i == 0) {
            return distanceScoreAlongAxis(i3, i9, i4, i2, i8, i6);
        }
        if (i == 1) {
            return distanceScoreAlongAxis(i7, i5, i4, i2, i8, i6);
        }
        if (i == 2) {
            return distanceScoreAlongAxis(i2, i8, i5, i3, i9, i7);
        }
        if (i != 3) {
            return Integer.MAX_VALUE;
        }
        return distanceScoreAlongAxis(i6, i4, i5, i3, i9, i7);
    }

    public static final int distanceScoreAlongAxis(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((i - i2) + 1) * ((((i3 - i4) + Math.max(i4, i6)) - Math.min(i3, i5)) + 1);
    }
}

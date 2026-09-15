package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b)\u001a\u0018\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a0\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a0\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000fH\u0080\b¢\u0006\u0004\b\r\u0010\u0010\u001a \u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0007\u001a\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0003\u001a \u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0007\u001a \u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0007\"\u0014\u0010\u0017\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u0019\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018\"\u0014\u0010\u001e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b \u0010\u0018\"\u001a\u0010!\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b!\u0010\u001f\u0012\u0004\b\"\u0010#\"\u001a\u0010$\u001a\u00020\u00008\u0000X\u0081T¢\u0006\f\n\u0004\b$\u0010\u0018\u0012\u0004\b%\u0010#\"\u0014\u0010&\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\b&\u0010\u0018\"\u0014\u0010'\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\b'\u0010\u0018\"\u0014\u0010(\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\b(\u0010\u0018\"\u0014\u0010)\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\b)\u0010\u0018\"\u0014\u0010*\u001a\u00020\u00008\u0000X\u0081T¢\u0006\u0006\n\u0004\b*\u0010\u0018\"\u0019\u0010-\u001a\u00020\u0004*\u00020\u00008Á\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u001f\u00101\u001a\u00020\u0004*\u00020\u00008Á\u0002X\u0081\u0004¢\u0006\f\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010,\"\u001f\u00104\u001a\u00020\u0004*\u00020\u00008Á\u0002X\u0081\u0004¢\u0006\f\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010,\"\u0019\u00106\u001a\u00020\u0004*\u00020\u00008Á\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u0010,\"\u0019\u00108\u001a\u00020\u0004*\u00020\u00008Á\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u0010,"}, d2 = {"", "p0", "clearVisitedBit", "(J)J", "", "p1", "createDstMapping", "(JI)J", "createLinkToNext", "(I)J", "p2", "", "p3", "createLinks", "(JII[I)J", "", "(JII[J)J", "createMapping", "(II)J", "createSrcMapping", "eraseSrcMapping", "setLinkToNext", "setLinkToPrevious", "EmptyNode", "J", "EmptyNodes", "[J", "getEmptyNodes", "()[J", "InvalidMapping", "InvalidMappingLink", "I", "MaxSize", "NodeInvalidLink", "getNodeInvalidLink$annotations", "()V", "NodeLinkMask", "getNodeLinkMask$annotations", "NodeLinksMask", "NodeMetaAndNextMask", "NodeMetaAndPreviousMask", "NodeMetaMask", "NodeVisitedBit", "getDst", "(J)I", "dst", "getNextNode", "getNextNode$annotations", "(J)V", "nextNode", "getPreviousNode", "getPreviousNode$annotations", "previousNode", "getSrc", "src", "getVisited", "visited"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SieveCacheKt {
    public static final long EmptyNode = 4611686018427387903L;
    private static final long[] EmptyNodes = new long[0];
    public static final long InvalidMapping = 9223372034707292159L;
    public static final int InvalidMappingLink = Integer.MAX_VALUE;
    private static final long MaxSize = 2147483646;
    public static final int NodeInvalidLink = Integer.MAX_VALUE;
    public static final long NodeLinkMask = 2147483647L;
    public static final long NodeLinksMask = 4611686018427387903L;
    public static final long NodeMetaAndNextMask = -4611686016279904257L;
    public static final long NodeMetaAndPreviousMask = -2147483648L;
    public static final long NodeMetaMask = -4611686018427387904L;
    public static final long NodeVisitedBit = 4611686018427387904L;

    public static final long clearVisitedBit(long j) {
        return j & 4611686018427387903L;
    }

    public static final long createDstMapping(long j, int i) {
        return (j & (-4294967296L)) | ((long) i);
    }

    public static final long createLinkToNext(int i) {
        return (((long) i) & NodeLinkMask) | 4611686016279904256L;
    }

    public static final long createMapping(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    public static final long createSrcMapping(long j, int i) {
        return (j & 4294967295L) | (((long) i) << 32);
    }

    public static final long eraseSrcMapping(long j) {
        return (j & 4294967295L) | (-4294967296L);
    }

    public static final int getDst(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int getNextNode(long j) {
        return (int) (j & NodeLinkMask);
    }

    public static /* synthetic */ void getNextNode$annotations(long j) {
    }

    public static /* synthetic */ void getNodeInvalidLink$annotations() {
    }

    public static /* synthetic */ void getNodeLinkMask$annotations() {
    }

    public static final int getPreviousNode(long j) {
        return (int) ((j >> 31) & NodeLinkMask);
    }

    public static /* synthetic */ void getPreviousNode$annotations(long j) {
    }

    public static final int getSrc(long j) {
        return (int) ((j >> 32) & 4294967295L);
    }

    public static final int getVisited(long j) {
        return (int) ((j >> 62) & 1);
    }

    public static final long setLinkToNext(long j, int i) {
        return (j & NodeMetaAndPreviousMask) | (((long) i) & NodeLinkMask);
    }

    public static final long setLinkToPrevious(long j, int i) {
        return (j & NodeMetaAndNextMask) | ((((long) i) & NodeLinkMask) << 31);
    }

    public static final long[] getEmptyNodes() {
        return EmptyNodes;
    }

    public static final long createLinks(long j, int i, int i2, long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return (((j & NodeMetaMask) | ((long) (i == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i] & 4294967295L)))) << 31) | ((long) (i2 != Integer.MAX_VALUE ? (int) (jArr[i2] & 4294967295L) : Integer.MAX_VALUE));
    }

    public static final long createLinks(long j, int i, int i2, int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return (((j & NodeMetaMask) | ((long) (i == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i]))) << 31) | ((long) (i2 != Integer.MAX_VALUE ? iArr[i2] : Integer.MAX_VALUE));
    }
}

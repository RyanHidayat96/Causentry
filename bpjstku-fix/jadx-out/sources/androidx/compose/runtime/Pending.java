package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.MultiValueMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u0019R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#\"\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001dR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R'\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030-8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u0003038G¢\u0006\u0006\u001a\u0004\b4\u0010\u001f"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "", "Landroidx/compose/runtime/KeyInfo;", "p0", "", "p1", "<init>", "(Ljava/util/List;I)V", "getNext", "(ILjava/lang/Object;)Landroidx/compose/runtime/KeyInfo;", "", "recordUsed", "(Landroidx/compose/runtime/KeyInfo;)Z", "", "registerMoveSlot", "(II)V", "p2", "registerMoveNode", "(III)V", "registerInsert", "(Landroidx/compose/runtime/KeyInfo;I)V", "updateNodeCount", "(II)Z", "slotPositionOf", "(Landroidx/compose/runtime/KeyInfo;)I", "nodePositionOf", "updatedNodeCountOf", "keyInfos", "Ljava/util/List;", "getKeyInfos", "()Ljava/util/List;", "startIndex", "I", "getStartIndex", "()I", "groupIndex", "getGroupIndex", "setGroupIndex", "(I)V", "usedKeys", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/runtime/GroupInfo;", "groupInfos", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/runtime/collection/MultiValueMap;", "keyMap$delegate", "Lkotlin/Lazy;", "getKeyMap-fVlnmYg", "()Landroidx/collection/MutableScatterMap;", "keyMap", "", "getUsed", "used"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Pending {
    private int groupIndex;
    private final MutableIntObjectMap<GroupInfo> groupInfos;
    private final List<KeyInfo> keyInfos;

    /* JADX INFO: renamed from: keyMap$delegate, reason: from kotlin metadata */
    private final Lazy keyMap;
    private final int startIndex;
    private final List<KeyInfo> usedKeys;

    public Pending(List<KeyInfo> list, int i) {
        this.keyInfos = list;
        this.startIndex = i;
        if (i < 0) {
            PreconditionsKt.throwIllegalArgumentException("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        MutableIntObjectMap<GroupInfo> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        int size = list.size();
        int nodes = 0;
        for (int i2 = 0; i2 < size; i2++) {
            KeyInfo keyInfo = this.keyInfos.get(i2);
            mutableIntObjectMap.set(keyInfo.getLocation(), new GroupInfo(i2, nodes, keyInfo.getNodes()));
            nodes += keyInfo.getNodes();
        }
        this.groupInfos = mutableIntObjectMap;
        this.keyMap = LazyKt.lazy(new Function0<MultiValueMap<Object, KeyInfo>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ MultiValueMap<Object, KeyInfo> invoke() {
                return MultiValueMap.m3613boximpl(m3485invokefVlnmYg());
            }

            /* JADX INFO: renamed from: invoke-fVlnmYg, reason: not valid java name */
            public final MutableScatterMap<Object, Object> m3485invokefVlnmYg() {
                MutableScatterMap<Object, Object> mutableScatterMapMultiMap = ComposerKt.multiMap(this.this$0.getKeyInfos().size());
                Pending pending = this.this$0;
                int size2 = pending.getKeyInfos().size();
                for (int i3 = 0; i3 < size2; i3++) {
                    KeyInfo keyInfo2 = pending.getKeyInfos().get(i3);
                    MultiValueMap.m3612addimpl(mutableScatterMapMultiMap, ComposerKt.getJoinedKey(keyInfo2), keyInfo2);
                }
                return mutableScatterMapMultiMap;
            }
        });
    }

    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final void setGroupIndex(int i) {
        this.groupIndex = i;
    }

    /* JADX INFO: renamed from: getKeyMap-fVlnmYg, reason: not valid java name */
    public final MutableScatterMap<Object, Object> m3484getKeyMapfVlnmYg() {
        return ((MultiValueMap) this.keyMap.getValue()).getMap();
    }

    public final KeyInfo getNext(int p0, Object p1) {
        return (KeyInfo) MultiValueMap.m3625removeFirstimpl(m3484getKeyMapfVlnmYg(), p1 != null ? new JoinedKey(Integer.valueOf(p0), p1) : Integer.valueOf(p0));
    }

    public final boolean recordUsed(KeyInfo p0) {
        return this.usedKeys.add(p0);
    }

    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final void registerMoveSlot(int p0, int p1) {
        char c = 7;
        long j = -9187201950435737472L;
        if (p0 > p1) {
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j2 = jArr[i];
                if ((((~j2) << 7) & j2 & j) != j) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j2 & 255) < 128) {
                            GroupInfo groupInfo = (GroupInfo) objArr[(i << 3) + i3];
                            int slotIndex = groupInfo.getSlotIndex();
                            if (slotIndex == p0) {
                                groupInfo.setSlotIndex(p1);
                            } else if (p1 <= slotIndex && slotIndex < p0) {
                                groupInfo.setSlotIndex(slotIndex + 1);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                }
                i++;
                j = -9187201950435737472L;
            }
        } else {
            if (p1 <= p0) {
                return;
            }
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.values;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j3 = jArr2[i4];
                if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j3 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i4 << 3) + i6];
                            int slotIndex2 = groupInfo2.getSlotIndex();
                            if (slotIndex2 == p0) {
                                groupInfo2.setSlotIndex(p1);
                            } else if (p0 + 1 <= slotIndex2 && slotIndex2 < p1) {
                                groupInfo2.setSlotIndex(slotIndex2 - 1);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 == length2) {
                    return;
                }
                i4++;
                c = 7;
            }
        }
    }

    public final void registerMoveNode(int p0, int p1, int p2) {
        char c = 7;
        long j = -9187201950435737472L;
        if (p0 > p1) {
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j2 = jArr[i];
                if ((((~j2) << 7) & j2 & j) != j) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j2 & 255) < 128) {
                            GroupInfo groupInfo = (GroupInfo) objArr[(i << 3) + i3];
                            int nodeIndex = groupInfo.getNodeIndex();
                            if (p0 <= nodeIndex && nodeIndex < p0 + p2) {
                                groupInfo.setNodeIndex((nodeIndex - p0) + p1);
                            } else if (p1 <= nodeIndex && nodeIndex < p0) {
                                groupInfo.setNodeIndex(nodeIndex + p2);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                }
                i++;
                j = -9187201950435737472L;
            }
        } else {
            if (p1 <= p0) {
                return;
            }
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.values;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j3 = jArr2[i4];
                if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j3 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i4 << 3) + i6];
                            int nodeIndex2 = groupInfo2.getNodeIndex();
                            if (p0 <= nodeIndex2 && nodeIndex2 < p0 + p2) {
                                groupInfo2.setNodeIndex((nodeIndex2 - p0) + p1);
                            } else if (p0 + 1 <= nodeIndex2 && nodeIndex2 < p1) {
                                groupInfo2.setNodeIndex(nodeIndex2 - p2);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 == length2) {
                    return;
                }
                i4++;
                c = 7;
            }
        }
    }

    public final void registerInsert(KeyInfo p0, int p1) {
        this.groupInfos.set(p0.getLocation(), new GroupInfo(-1, p1, 0));
    }

    public final boolean updateNodeCount(int p0, int p1) {
        int nodeIndex;
        GroupInfo groupInfo = this.groupInfos.get(p0);
        if (groupInfo == null) {
            return false;
        }
        int nodeIndex2 = groupInfo.getNodeIndex();
        int nodeCount = p1 - groupInfo.getNodeCount();
        groupInfo.setNodeCount(p1);
        if (nodeCount == 0) {
            return true;
        }
        MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        GroupInfo groupInfo2 = (GroupInfo) objArr[(i << 3) + i3];
                        if (groupInfo2.getNodeIndex() >= nodeIndex2 && !Intrinsics.areEqual(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                            groupInfo2.setNodeIndex(nodeIndex);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final int slotPositionOf(KeyInfo p0) {
        GroupInfo groupInfo = this.groupInfos.get(p0.getLocation());
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final int nodePositionOf(KeyInfo p0) {
        GroupInfo groupInfo = this.groupInfos.get(p0.getLocation());
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final int updatedNodeCountOf(KeyInfo p0) {
        GroupInfo groupInfo = this.groupInfos.get(p0.getLocation());
        return groupInfo != null ? groupInfo.getNodeCount() : p0.getNodes();
    }
}

package androidx.compose.ui.node;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.layout.Ruler;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00102 \u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0003R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010&"}, d2 = {"Landroidx/compose/ui/node/RulerTrackingMap;", "", "<init>", "()V", "Landroidx/compose/ui/layout/Ruler;", "p0", "", "p1", "getOrDefault", "(Landroidx/compose/ui/layout/Ruler;F)F", "", "set", "(Landroidx/compose/ui/layout/Ruler;F)V", "", "contains", "(Landroidx/compose/ui/layout/Ruler;)Z", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/collection/MutableScatterMap;", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/node/WeakReference;", "Landroidx/compose/ui/node/LayoutNode;", "p2", "notifyChanged", "(ZLandroidx/compose/ui/node/LookaheadCapablePlaceable;Landroidx/collection/MutableScatterMap;)V", "clear", "", "size", "I", "", "rulers", "[Landroidx/compose/ui/layout/Ruler;", "", "values", "[F", "", "accessFlags", "[B", "layoutNodes", "Landroidx/collection/MutableScatterSet;", "newRulers"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class RulerTrackingMap {
    private int size;
    private Ruler[] rulers = new Ruler[32];
    private float[] values = new float[32];
    private byte[] accessFlags = new byte[32];
    private MutableScatterSet<WeakReference<LayoutNode>> layoutNodes = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterSet<Ruler> newRulers = ScatterSetKt.mutableScatterSetOf();

    public final float getOrDefault(Ruler p0, float p1) {
        int iIndexOf = ArraysKt.indexOf(this.rulers, p0);
        return iIndexOf < 0 ? p1 : this.values[iIndexOf];
    }

    public final void set(Ruler p0, float p1) {
        int iIndexOf = ArraysKt.indexOf(this.rulers, p0);
        if (iIndexOf < 0) {
            int i = this.size;
            Ruler[] rulerArr = this.rulers;
            if (i == rulerArr.length) {
                int i2 = i * 2;
                Object[] objArrCopyOf = Arrays.copyOf(rulerArr, i2);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                this.rulers = (Ruler[]) objArrCopyOf;
                float[] fArrCopyOf = Arrays.copyOf(this.values, i2);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
                this.values = fArrCopyOf;
                byte[] bArrCopyOf = Arrays.copyOf(this.accessFlags, i2);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                this.accessFlags = bArrCopyOf;
            }
            this.rulers[i] = p0;
            this.accessFlags[i] = 3;
            this.values[i] = p1;
            this.size++;
            return;
        }
        float[] fArr = this.values;
        if (fArr[iIndexOf] != p1) {
            fArr[iIndexOf] = p1;
            this.accessFlags[iIndexOf] = 1;
        } else {
            byte[] bArr = this.accessFlags;
            if (bArr[iIndexOf] == 2) {
                bArr[iIndexOf] = 0;
            }
        }
    }

    public final boolean contains(Ruler p0) {
        return ArraysKt.contains(this.rulers, p0);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2 A[LOOP:3: B:28:0x0089->B:42:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c7 A[EDGE_INSN: B:79:0x00c7->B:43:0x00c7 BREAK  A[LOOP:3: B:28:0x0089->B:42:0x00c2], SYNTHETIC] */
    public final void notifyChanged(boolean p0, LookaheadCapablePlaceable p1, MutableScatterMap<Ruler, MutableScatterSet<WeakReference<LayoutNode>>> p2) {
        LayoutNode layoutNode;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = this.accessFlags[i2];
            if (b == 3) {
                MutableScatterSet<Ruler> mutableScatterSet = this.newRulers;
                Ruler ruler = this.rulers[i2];
                Intrinsics.checkNotNull(ruler);
                mutableScatterSet.plusAssign(ruler);
            } else if (b != 0 && p2 != null) {
                Ruler ruler2 = this.rulers[i2];
                Intrinsics.checkNotNull(ruler2);
                MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSetRemove = p2.remove(ruler2);
                if (mutableScatterSetRemove != null) {
                    this.layoutNodes.plusAssign(mutableScatterSetRemove);
                }
            }
        }
        int i3 = this.size;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte[] bArr = this.accessFlags;
            if (bArr[i5] == 2) {
                i4++;
            } else if (i4 > 0) {
                Ruler[] rulerArr = this.rulers;
                rulerArr[i5 - i4] = rulerArr[i5];
            }
            bArr[i5] = 2;
        }
        int i6 = this.size;
        for (int i7 = i6 - i4; i7 < i6; i7++) {
            this.rulers[i7] = null;
        }
        this.size -= i4;
        LookaheadCapablePlaceable parent = p1.getParent();
        MutableScatterSet<Ruler> mutableScatterSet2 = this.newRulers;
        Object[] objArr = mutableScatterSet2.elements;
        long[] jArr = mutableScatterSet2.metadata;
        int length = jArr.length - 2;
        long j = 255;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j2 = jArr[i8];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j2 & j) < 128) {
                            (parent == null ? p1 : parent).invalidateChildrenOfDefiningRuler$ui_release((Ruler) objArr[(i8 << 3) + i10]);
                        }
                        j2 >>= 8;
                        i10++;
                        j = 255;
                    }
                    if (i9 != 8) {
                        break;
                    }
                    if (i8 != length) {
                        break;
                    }
                    i8++;
                    j = 255;
                } else if (i8 != length) {
                    break;
                    break;
                } else {
                    i8++;
                    j = 255;
                }
            }
        }
        this.newRulers.clear();
        MutableScatterSet<WeakReference<LayoutNode>> mutableScatterSet3 = this.layoutNodes;
        Object[] objArr2 = mutableScatterSet3.elements;
        long[] jArr2 = mutableScatterSet3.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i11 = 0;
            while (true) {
                long j3 = jArr2[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j3 & 255) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr2[(i11 << 3) + i13]).get()) != null) {
                            if (p0) {
                                layoutNode.requestLookaheadRelayout$ui_release(false);
                            } else {
                                layoutNode.requestRelayout$ui_release(false);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length2) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.layoutNodes.clear();
    }

    public final void clear() {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.rulers[i2] = null;
            this.values[i2] = Float.NaN;
            this.accessFlags[i2] = 0;
        }
        this.size = 0;
    }
}

package androidx.compose.ui.spatial;

import androidx.collection.SieveCacheKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJS\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0019J%\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010 J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J;\u0010$\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042$\u0010\b\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0#¢\u0006\u0004\b$\u0010%J/\u0010'\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b0&¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b)\u0010\u0017J\u0015\u0010*\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-JD\u0010/\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0.H\u0086\b¢\u0006\u0004\b/\u00100JD\u00101\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0.H\u0086\b¢\u0006\u0004\b1\u00100J<\u00103\u001a\u00020\u000b2*\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b02H\u0086\b¢\u0006\u0004\b3\u00104J4\u0010/\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0.H\u0086\b¢\u0006\u0004\b/\u00105JD\u00106\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b02H\u0086\b¢\u0006\u0004\b6\u00107J7\u00109\u001a\u0002082\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b9\u0010:J\u0090\u0001\u0010=\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042N\u0010\u0012\u001aJ\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b<\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b<\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b<\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b<\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b<\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b<\u0012\u0004\u0012\u00020\u000b0;H\u0086\b¢\u0006\u0004\b=\u0010>J8\u0010?\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u000b¢\u0006\u0004\bA\u0010\u0003J\r\u0010B\u001a\u00020\u000b¢\u0006\u0004\bB\u0010\u0003J0\u0010D\u001a\u00020\u000b2\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b0CH\u0086\b¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0016\u0010L\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0011\u0010O\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bN\u0010\u0006"}, d2 = {"Landroidx/compose/ui/spatial/RectList;", "", "<init>", "()V", "", "allocateItemsIndex", "()I", "p0", "p1", "", "p2", "", "resizeStorage", "(II[J)V", "p3", "p4", "p5", "", "p6", "p7", "insert", "(IIIIIIZZ)V", "remove", "(I)Z", "update", "(IIIII)Z", "updateFlagsFor", "(IZZ)Z", "move", "updateSubhierarchy", "(III)V", "", "(JII)V", "markUpdated", "(I)V", "Lkotlin/Function4;", "withRect", "(ILkotlin/jvm/functions/Function4;)Z", "Lkotlin/Function2;", "withTopLeftBottomRight", "(ILkotlin/jvm/functions/Function2;)Z", "contains", "indexOf", "(I)I", "metaFor", "(I)J", "Lkotlin/Function1;", "forEachIntersection", "(IIIILkotlin/jvm/functions/Function1;)V", "forEachGesturableIntersection", "Lkotlin/Function5;", "forEachRect", "(Lkotlin/jvm/functions/Function5;)V", "(IILkotlin/jvm/functions/Function1;)V", "forEachIntersectingRectWithValueAt", "(ILkotlin/jvm/functions/Function5;)V", "", "neighborsScoredByDistance$ui_release", "(IIIII)[I", "Lkotlin/Function6;", "Lkotlin/ParameterName;", "findKNearestNeighbors", "(IIIIIILkotlin/jvm/functions/Function6;)V", "findNearestNeighbor", "(IIIII)I", "defragment", "clearUpdated", "Lkotlin/Function3;", "forEachUpdatedRect", "(Lkotlin/jvm/functions/Function3;)V", "", "debugString", "()Ljava/lang/String;", FirebaseAnalytics.Param.ITEMS, "[J", "stack", "itemsSize", "I", "getSize", "size"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RectList {
    public static final int $stable = 8;
    public int itemsSize;
    public long[] items = new long[DerHeader.TAG_CLASS_PRIVATE];
    public long[] stack = new long[DerHeader.TAG_CLASS_PRIVATE];

    public final int getSize() {
        return this.itemsSize / 3;
    }

    private final int allocateItemsIndex() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = i + 3;
        this.itemsSize = i2;
        int length = jArr.length;
        if (length <= i2) {
            resizeStorage(length, i, jArr);
        }
        return i;
    }

    private final void resizeStorage(int p0, int p1, long[] p2) {
        int iMax = Math.max(p0 * 2, p1 + 3);
        long[] jArrCopyOf = Arrays.copyOf(p2, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
        this.items = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.stack, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf2, "");
        this.stack = jArrCopyOf2;
    }

    public final boolean remove(int p0) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            if ((((int) jArr[i3]) & RectListKt.Lower26Bits) == (67108863 & p0)) {
                jArr[i2] = -1;
                jArr[i2 + 1] = -1;
                jArr[i3] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final boolean update(int p0, int p1, int p2, int p3, int p4) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & RectListKt.Lower26Bits) == (67108863 & p0)) {
                jArr[i2] = (((long) p1) << 32) | (((long) p2) & 4294967295L);
                jArr[i2 + 1] = (((long) p3) << 32) | (((long) p4) & 4294967295L);
                jArr[i3] = 2305843009213693952L | j;
                return true;
            }
        }
        return false;
    }

    public final boolean updateFlagsFor(int p0, boolean p1, boolean p2) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & RectListKt.Lower26Bits) == (67108863 & p0)) {
                jArr[i3] = ((p1 ? 1L : 0L) * SieveCacheKt.NodeVisitedBit) | (j & 4611686018427387903L) | ((p2 ? 1L : 0L) * Long.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    public final boolean move(int p0, int p1, int p2, int p3, int p4) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & RectListKt.Lower26Bits) == (p0 & RectListKt.Lower26Bits)) {
                long j2 = jArr[i2];
                jArr[i2] = (((long) p2) & 4294967295L) | (((long) p1) << 32);
                jArr[i2 + 1] = (((long) p3) << 32) | (((long) p4) & 4294967295L);
                jArr[i3] = 2305843009213693952L | j;
                int i4 = p1 - ((int) (j2 >> 32));
                int i5 = p2 - ((int) j2);
                if ((i4 != 0) | (i5 != 0)) {
                    updateSubhierarchy((((long) (67108863 & (i2 + 3))) << 26) | (RectListKt.EverythingButParentId & j), i4, i5);
                }
                return true;
            }
        }
        return false;
    }

    public final void updateSubhierarchy(int p0, int p1, int p2) {
        updateSubhierarchy((((long) (this.itemsSize & 511)) << 52) | ((long) (p0 & RectListKt.Lower26Bits)), p1, p2);
    }

    private final void updateSubhierarchy(long p0, int p1, int p2) {
        int i;
        char c;
        int i2;
        char c2;
        char c3;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        int size = getSize();
        jArr2[0] = p0;
        int i3 = 1;
        while (i3 > 0) {
            i3--;
            long j = jArr2[i3];
            int i4 = RectListKt.Lower26Bits;
            int i5 = ((int) j) & RectListKt.Lower26Bits;
            char c4 = 26;
            int i6 = ((int) (j >> 26)) & RectListKt.Lower26Bits;
            char c5 = 511;
            int i7 = ((int) (j >> 52)) & 511;
            int i8 = i7 == 511 ? size : i7 + i6;
            if (i6 < 0) {
                return;
            }
            while (i6 < jArr.length - 2 && i6 < i8) {
                int i9 = i6 + 2;
                long j2 = jArr[i9];
                if ((((int) (j2 >> c4)) & i4) == i5) {
                    long j3 = jArr[i6];
                    int i10 = i6 + 1;
                    long j4 = jArr[i10];
                    i = i5;
                    jArr[i6] = (((long) (((int) j3) + p2)) & 4294967295L) | (((long) (((int) (j3 >> 32)) + p1)) << 32);
                    jArr[i10] = (((long) (((int) j4) + p2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + p1)) << 32);
                    jArr[i9] = 2305843009213693952L | j2;
                    c3 = '4';
                    c2 = 511;
                    if ((((int) (j2 >> 52)) & 511) > 0) {
                        i2 = RectListKt.Lower26Bits;
                        c = 26;
                        jArr2[i3] = (((long) ((i6 + 3) & RectListKt.Lower26Bits)) << 26) | (j2 & RectListKt.EverythingButParentId);
                        i3++;
                    } else {
                        c = 26;
                        i2 = RectListKt.Lower26Bits;
                    }
                } else {
                    i = i5;
                    c = c4;
                    i2 = i4;
                    c2 = c5;
                    c3 = '4';
                }
                i6 += 3;
                c5 = c2;
                i4 = i2;
                c4 = c;
                i5 = i;
            }
        }
    }

    public final void markUpdated(int p0) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & RectListKt.Lower26Bits) == (67108863 & p0)) {
                jArr[i3] = 2305843009213693952L | j;
                return;
            }
        }
    }

    public final boolean withRect(int p0, Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> p1) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & RectListKt.Lower26Bits) == (67108863 & p0)) {
                long j = jArr[i2];
                long j2 = jArr[i2 + 1];
                p1.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return true;
            }
        }
        return false;
    }

    public final boolean withTopLeftBottomRight(int p0, Function2<? super Long, ? super Long, Unit> p1) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & RectListKt.Lower26Bits) == (67108863 & p0)) {
                p1.invoke(Long.valueOf(jArr[i2]), Long.valueOf(jArr[i2 + 1]));
                return true;
            }
        }
        return false;
    }

    public final boolean contains(int p0) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & RectListKt.Lower26Bits) == (67108863 & p0)) {
                return true;
            }
        }
        return false;
    }

    public final int indexOf(int p0) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & RectListKt.Lower26Bits) == (67108863 & p0)) {
                return i2;
            }
        }
        return -1;
    }

    public final long metaFor(int p0) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2 + 2];
            if ((((int) j) & RectListKt.Lower26Bits) == (67108863 & p0)) {
                return j;
            }
        }
        return RectListKt.TombStone;
    }

    public final void forEachIntersection(int p0, int p1, int p2, int p3, Function1<? super Integer, Unit> p4) {
        long j = p0;
        long j2 = p1;
        long j3 = p2;
        long j4 = p3;
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if (((((((j3 << 32) | (j4 & 4294967295L)) - jArr[i2]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i2 + 1] - ((j << 32) | (j2 & 4294967295L))) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                p4.invoke(Integer.valueOf(((int) jArr[i2 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    public final void forEachGesturableIntersection(int p0, int p1, int p2, int p3, Function1<? super Integer, Unit> p4) {
        long j = p0;
        long j2 = p1;
        long j3 = p2;
        long j4 = p3;
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j5 = jArr[i2 + 2];
            if ((((int) (j5 >> 63)) & 1) != 0) {
                if (((((((j3 << 32) | (j4 & 4294967295L)) - jArr[i2]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i2 + 1] - ((j << 32) | (j2 & 4294967295L))) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    p4.invoke(Integer.valueOf(((int) j5) & RectListKt.Lower26Bits));
                }
            }
        }
    }

    public final void forEachRect(Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> p0) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            p0.invoke(Integer.valueOf(67108863 & ((int) jArr[i2 + 2])), Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
        }
    }

    public final void forEachIntersection(int p0, int p1, Function1<? super Integer, Unit> p2) {
        long j = (((long) p1) & 4294967295L) | (((long) p0) << 32);
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if (((((j - jArr[i2]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i2 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                p2.invoke(Integer.valueOf(((int) jArr[i2 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }

    public final void forEachIntersectingRectWithValueAt(int p0, Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> p1) {
        int i = p0;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        long j = jArr[i];
        long j2 = jArr[i + 1];
        int i3 = 0;
        while (i3 < jArr.length - 2 && i3 < i2) {
            if (i3 != i) {
                long j3 = jArr[i3];
                long j4 = jArr[i3 + 1];
                if (((((j2 - j3) - InlineClassHelperKt.Uint64Low32) | ((j4 - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    p1.invoke(Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3), Integer.valueOf((int) (j4 >> 32)), Integer.valueOf((int) j4), Integer.valueOf(67108863 & ((int) jArr[i3 + 2])));
                }
            }
            i3 += 3;
            i = p0;
        }
    }

    public final int[] neighborsScoredByDistance$ui_release(int p0, int p1, int p2, int p3, int p4) {
        long[] jArr = this.items;
        int i = this.itemsSize / 3;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 3;
            if (i3 < 0 || i3 >= jArr.length - 1) {
                break;
            }
            long j = jArr[i3];
            long j2 = jArr[i3 + 1];
            iArr[i2] = RectListKt.distanceScore(p0, p1, p2, p3, p4, (int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        }
        return iArr;
    }

    public final void findKNearestNeighbors(int p0, int p1, int p2, int p3, int p4, int p5, Function6<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> p6) {
        int[] iArrNeighborsScoredByDistance$ui_release = neighborsScoredByDistance$ui_release(p0, p2, p3, p4, p5);
        long[] jArr = this.items;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (i2 <= p1) {
            int iMin = Integer.MAX_VALUE;
            int i4 = 0;
            while (i4 < iArrNeighborsScoredByDistance$ui_release.length) {
                int i5 = iArrNeighborsScoredByDistance$ui_release[i4];
                if (i5 > i) {
                    iMin = Math.min(iMin, i5);
                }
                if (i5 == i) {
                    int i6 = i4 * 3;
                    long j = jArr[i6];
                    long j2 = jArr[i6 + 1];
                    p6.invoke(Integer.valueOf(i5), Integer.valueOf(((int) jArr[i6 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                    i3++;
                    if (i3 == p1) {
                        return;
                    }
                }
                i4++;
                i2 = i2;
                iArrNeighborsScoredByDistance$ui_release = iArrNeighborsScoredByDistance$ui_release;
            }
            i2++;
            i = iMin;
        }
    }

    public final int findNearestNeighbor(int p0, int p1, int p2, int p3, int p4) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i; i4 += 3) {
            long j = jArr[i4];
            int i5 = i4 + 1;
            long j2 = jArr[i5];
            int iDistanceScore = RectListKt.distanceScore(p0, p1, p2, p3, p4, (int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
            boolean z = (iDistanceScore < i2) & (iDistanceScore > 0);
            if (z) {
                i2 = iDistanceScore;
            }
            if (z) {
                i3 = i5;
            }
        }
        if (i3 < 0 || i3 >= jArr.length) {
            return -1;
        }
        return ((int) jArr[i3]) & RectListKt.Lower26Bits;
    }

    public final void defragment() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        long[] jArr2 = this.stack;
        int i2 = 0;
        for (int i3 = 0; i3 < jArr.length - 2 && i2 < jArr2.length - 2 && i3 < i; i3 += 3) {
            int i4 = i3 + 2;
            if (jArr[i4] != RectListKt.TombStone) {
                jArr2[i2] = jArr[i3];
                jArr2[i2 + 1] = jArr[i3 + 1];
                jArr2[i2 + 2] = jArr[i4];
                i2 += 3;
            }
        }
        this.itemsSize = i2;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final void clearUpdated() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            jArr[i3] = jArr[i3] & (-2305843009213693953L);
        }
    }

    public final void forEachUpdatedRect(Function3<? super Integer, ? super Long, ? super Long, Unit> p0) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2 + 2];
            if ((((int) (j >> 61)) & 1) != 0) {
                p0.invoke(Integer.valueOf(((int) j) & RectListKt.Lower26Bits), Long.valueOf(jArr[i2]), Long.valueOf(jArr[i2 + 1]));
            }
        }
    }

    public final String debugString() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            StringBuilder sb2 = new StringBuilder("id=");
            sb2.append(((int) j3) & RectListKt.Lower26Bits);
            sb2.append(", rect=[");
            sb2.append((int) (j >> 32));
            sb2.append(',');
            sb2.append((int) j);
            sb2.append(',');
            sb2.append((int) (j2 >> 32));
            sb2.append(',');
            sb2.append((int) j2);
            sb2.append("], parent=");
            sb2.append(((int) (j3 >> 26)) & RectListKt.Lower26Bits);
            sb.append(sb2.toString());
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void insert(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6, boolean p7) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = i + 3;
        this.itemsSize = i2;
        int length = jArr.length;
        if (length <= i2) {
            resizeStorage(length, i, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i] = (((long) p2) & 4294967295L) | (p1 << 32);
        jArr2[i + 1] = (((long) p3) << 32) | (((long) p4) & 4294967295L);
        long j = p7 ? 1L : 0L;
        long j2 = p6 ? 1L : 0L;
        int i3 = p5 & RectListKt.Lower26Bits;
        jArr2[i + 2] = (j << 63) | (j2 << 62) | 2305843009213693952L | (((long) i3) << 26) | ((long) (p0 & RectListKt.Lower26Bits));
        if (p5 >= 0) {
            for (int i4 = i - 3; i4 >= 0; i4 -= 3) {
                int i5 = i4 + 2;
                long j3 = jArr2[i5];
                if ((((int) j3) & RectListKt.Lower26Bits) == i3) {
                    jArr2[i5] = (j3 & RectListKt.EverythingButLastChildOffset) | (((long) ((i - i4) & 511)) << 52);
                    return;
                }
            }
        }
    }
}

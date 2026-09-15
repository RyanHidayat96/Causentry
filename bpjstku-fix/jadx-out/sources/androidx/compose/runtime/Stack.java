package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\b\u0007\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0012J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R$\u0010'\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b)\u0010*\u0088\u0001'\u0092\u0001\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004"}, d2 = {"Landroidx/compose/runtime/Stack;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/util/ArrayList;", "Lkotlin/collections/b;", "p0", "constructor-impl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "", "push-impl", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "push", "pop-impl", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "peek-impl", "peek", "", "(Ljava/util/ArrayList;I)Ljava/lang/Object;", "isEmpty-impl", "(Ljava/util/ArrayList;)Z", "isEmpty", "isNotEmpty-impl", "isNotEmpty", "", "clear-impl", "(Ljava/util/ArrayList;)V", "clear", "", "toArray-impl", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "toArray", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "backing", "Ljava/util/ArrayList;", "getSize-impl", "(Ljava/util/ArrayList;)I", "size"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class Stack<T> {
    private final ArrayList<T> backing;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m3519constructorimpl(ArrayList<T> arrayList) {
        return arrayList;
    }

    private /* synthetic */ Stack(ArrayList arrayList) {
        this.backing = arrayList;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m3520constructorimpl$default(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m3519constructorimpl(arrayList);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m3523getSizeimpl(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* JADX INFO: renamed from: push-impl, reason: not valid java name */
    public static final boolean m3530pushimpl(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    /* JADX INFO: renamed from: pop-impl, reason: not valid java name */
    public static final T m3529popimpl(ArrayList<T> arrayList) {
        return arrayList.remove(m3523getSizeimpl(arrayList) - 1);
    }

    /* JADX INFO: renamed from: peek-impl, reason: not valid java name */
    public static final T m3527peekimpl(ArrayList<T> arrayList) {
        return arrayList.get(m3523getSizeimpl(arrayList) - 1);
    }

    /* JADX INFO: renamed from: peek-impl, reason: not valid java name */
    public static final T m3528peekimpl(ArrayList<T> arrayList, int i) {
        return arrayList.get(i);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m3525isEmptyimpl(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m3526isNotEmptyimpl(ArrayList<T> arrayList) {
        return !m3525isEmptyimpl(arrayList);
    }

    /* JADX INFO: renamed from: clear-impl, reason: not valid java name */
    public static final void m3518clearimpl(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    /* JADX INFO: renamed from: toArray-impl, reason: not valid java name */
    public static final T[] m3531toArrayimpl(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = arrayList.get(i);
        }
        return tArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Stack m3517boximpl(ArrayList arrayList) {
        return new Stack(arrayList);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3521equalsimpl(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof Stack) && Intrinsics.areEqual(arrayList, ((Stack) obj).getBacking());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3522equalsimpl0(ArrayList<T> arrayList, ArrayList<T> arrayList2) {
        return Intrinsics.areEqual(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3524hashCodeimpl(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3532toStringimpl(ArrayList<T> arrayList) {
        StringBuilder sb = new StringBuilder("Stack(backing=");
        sb.append(arrayList);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return m3521equalsimpl(this.backing, p0);
    }

    public final int hashCode() {
        return m3524hashCodeimpl(this.backing);
    }

    public final String toString() {
        return m3532toStringimpl(this.backing);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ ArrayList getBacking() {
        return this.backing;
    }
}

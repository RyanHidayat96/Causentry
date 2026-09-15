package androidx.compose.ui.node;

import androidx.exifinterface.media.ExifInterface;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0003j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/node/SortedSet;", ExifInterface.LONGITUDE_EAST, "Ljava/util/TreeSet;", "Ljava/util/Comparator;", "Lkotlin/cancelAll;", "p0", "<init>", "(Ljava/util/Comparator;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SortedSet<E> extends TreeSet<E> {
    public static final int $stable = 8;

    public final int getSize() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return getSize();
    }

    public SortedSet(Comparator<? super E> comparator) {
        super(comparator);
    }
}

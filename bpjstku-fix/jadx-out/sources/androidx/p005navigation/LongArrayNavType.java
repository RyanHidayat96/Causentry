package androidx.p005navigation;

import android.os.Bundle;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0012J#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/navigation/LongArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "", "p1", "p2", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "parseValue", "(Ljava/lang/String;)[J", "(Ljava/lang/String;[J)[J", "", "valueEquals", "([J[J)Z", "", "serializeAsValues", "([J)Ljava/util/List;", "emptyCollection", "()[J", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LongArrayNavType extends CollectionNavType<long[]> {
    public LongArrayNavType() {
        super(true);
    }

    @Override // androidx.p005navigation.NavType
    public final String getName() {
        return "long[]";
    }

    @Override // androidx.p005navigation.NavType
    public final long[] parseValue(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new long[]{NavType.LongType.parseValue(p0).longValue()};
    }

    @Override // androidx.p005navigation.NavType
    public final long[] parseValue(String p0, long[] p1) {
        long[] jArrPlus;
        Intrinsics.checkNotNullParameter(p0, "");
        return (p1 == null || (jArrPlus = ArraysKt.plus(p1, parseValue(p0))) == null) ? parseValue(p0) : jArrPlus;
    }

    @Override // androidx.p005navigation.NavType
    public final boolean valueEquals(long[] p0, long[] p1) {
        return ArraysKt.contentDeepEquals(p0 != null ? ArraysKt.toTypedArray(p0) : null, p1 != null ? ArraysKt.toTypedArray(p1) : null);
    }

    @Override // androidx.p005navigation.CollectionNavType
    public final List<String> serializeAsValues(long[] p0) {
        List<Long> list;
        if (p0 == null || (list = ArraysKt.toList(p0)) == null) {
            return CollectionsKt.emptyList();
        }
        List<Long> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        return arrayList;
    }

    @Override // androidx.p005navigation.NavType
    public final void put(Bundle p0, String p1, long[] p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(p0);
        if (p2 != null) {
            SavedStateWriter.m7476putLongArrayimpl(bundleM7454constructorimpl, p1, p2);
        } else {
            SavedStateWriter.m7477putNullimpl(bundleM7454constructorimpl, p1);
        }
    }

    @Override // androidx.p005navigation.NavType
    public final long[] get(Bundle p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
        if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
            return null;
        }
        return SavedStateReader.m7410getLongArrayimpl(bundleM7368constructorimpl, p1);
    }

    @Override // androidx.p005navigation.CollectionNavType
    public final long[] emptyCollection() {
        return new long[0];
    }
}

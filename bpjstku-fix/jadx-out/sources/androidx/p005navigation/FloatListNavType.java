package androidx.p005navigation;

import android.os.Bundle;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0013J/\u0010\u0015\u001a\u00020\u00142\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/navigation/FloatListNavType;", "Landroidx/navigation/CollectionNavType;", "", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "", "p1", "p2", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "parseValue", "(Ljava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "", "valueEquals", "(Ljava/util/List;Ljava/util/List;)Z", "serializeAsValues", "(Ljava/util/List;)Ljava/util/List;", "emptyCollection", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FloatListNavType extends CollectionNavType<List<? extends Float>> {
    public FloatListNavType() {
        super(true);
    }

    @Override // androidx.p005navigation.CollectionNavType
    public final /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Float> list) {
        return serializeAsValues2((List<Float>) list);
    }

    @Override // androidx.p005navigation.NavType
    public final String getName() {
        return "List<Float>";
    }

    @Override // androidx.p005navigation.NavType
    public final List<Float> parseValue(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return CollectionsKt.listOf(NavType.FloatType.parseValue(p0));
    }

    @Override // androidx.p005navigation.NavType
    public final List<Float> parseValue(String p0, List<Float> p1) {
        List<Float> listPlus;
        Intrinsics.checkNotNullParameter(p0, "");
        return (p1 == null || (listPlus = CollectionsKt.plus((Collection) p1, (Iterable) parseValue(p0))) == null) ? parseValue(p0) : listPlus;
    }

    @Override // androidx.p005navigation.NavType
    public final boolean valueEquals(List<Float> p0, List<Float> p1) {
        return ArraysKt.contentDeepEquals(p0 != null ? (Float[]) p0.toArray(new Float[0]) : null, p1 != null ? (Float[]) p1.toArray(new Float[0]) : null);
    }

    /* JADX INFO: renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
    public final List<String> serializeAsValues2(List<Float> p0) {
        if (p0 != null) {
            List<Float> list = p0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    @Override // androidx.p005navigation.CollectionNavType
    public final List<? extends Float> emptyCollection() {
        return CollectionsKt.emptyList();
    }

    @Override // androidx.p005navigation.NavType
    public final void put(Bundle p0, String p1, List<Float> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(p0);
        if (p2 != null) {
            SavedStateWriter.m7470putFloatArrayimpl(bundleM7454constructorimpl, p1, CollectionsKt.toFloatArray(p2));
        } else {
            SavedStateWriter.m7477putNullimpl(bundleM7454constructorimpl, p1);
        }
    }

    @Override // androidx.p005navigation.NavType
    public final List<Float> get(Bundle p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
        if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
            return null;
        }
        return ArraysKt.toList(SavedStateReader.m7396getFloatArrayimpl(bundleM7368constructorimpl, p1));
    }
}

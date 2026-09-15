package androidx.p005navigation.p009serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.p002lifecycle.SavedStateHandle;
import androidx.p005navigation.NavType;
import androidx.p013savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/navigation/serialization/SavedStateHandleArgStore;", "Landroidx/navigation/serialization/ArgStore;", "Landroidx/lifecycle/SavedStateHandle;", "p0", "", "", "Landroidx/navigation/NavType;", "p1", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)V", "", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "", "contains", "(Ljava/lang/String;)Z", "handle", "Landroidx/lifecycle/SavedStateHandle;", "typeMap", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SavedStateHandleArgStore extends ArgStore {
    private final SavedStateHandle handle;
    private final Map<String, NavType<?>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateHandleArgStore(SavedStateHandle savedStateHandle, Map<String, ? extends NavType<?>> map) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.handle = savedStateHandle;
        this.typeMap = map;
    }

    @Override // androidx.p005navigation.p009serialization.ArgStore
    public final Object get(String p0) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(p0, "");
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(p0, this.handle.get(p0)));
        if (mapMapOf.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapMapOf.size());
            for (Map.Entry entry : mapMapOf.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        NavType<?> navType = this.typeMap.get(p0);
        if (navType != null) {
            return navType.get(bundleBundleOf, p0);
        }
        StringBuilder sb = new StringBuilder("Failed to find type for ");
        sb.append(p0);
        sb.append(" when decoding ");
        sb.append(this.handle);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // androidx.p005navigation.p009serialization.ArgStore
    public final boolean contains(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.handle.contains(p0);
    }
}

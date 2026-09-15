package androidx.p005navigation.p009serialization;

import android.os.Bundle;
import androidx.p005navigation.NavType;
import androidx.p013savedstate.SavedStateReader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/navigation/serialization/SavedStateArgStore;", "Landroidx/navigation/serialization/ArgStore;", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "", "", "Landroidx/navigation/NavType;", "p1", "<init>", "(Landroid/os/Bundle;Ljava/util/Map;)V", "", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "", "contains", "(Ljava/lang/String;)Z", "savedState", "Landroid/os/Bundle;", "typeMap", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SavedStateArgStore extends ArgStore {
    private final Bundle savedState;
    private final Map<String, NavType<?>> typeMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SavedStateArgStore(Bundle bundle, Map<String, ? extends NavType<?>> map) {
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.savedState = bundle;
        this.typeMap = map;
    }

    @Override // androidx.p005navigation.p009serialization.ArgStore
    public final Object get(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        NavType<?> navType = this.typeMap.get(p0);
        if (navType != null) {
            return navType.get(this.savedState, p0);
        }
        return null;
    }

    @Override // androidx.p005navigation.p009serialization.ArgStore
    public final boolean contains(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return SavedStateReader.m7369containsimpl(SavedStateReader.m7368constructorimpl(this.savedState), p0);
    }
}

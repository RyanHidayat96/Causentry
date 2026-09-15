package androidx.p005navigation;

import android.os.Bundle;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0001\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0012J/\u0010\u0014\u001a\u00020\u00132\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/navigation/StringArrayNavType;", "Landroidx/navigation/CollectionNavType;", "", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "p1", "p2", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "parseValue", "(Ljava/lang/String;)[Ljava/lang/String;", "(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;", "", "valueEquals", "([Ljava/lang/String;[Ljava/lang/String;)Z", "", "serializeAsValues", "([Ljava/lang/String;)Ljava/util/List;", "emptyCollection", "()[Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StringArrayNavType extends CollectionNavType<String[]> {
    public StringArrayNavType() {
        super(true);
    }

    @Override // androidx.p005navigation.NavType
    public final String getName() {
        return "string[]";
    }

    @Override // androidx.p005navigation.NavType
    public final String[] parseValue(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new String[]{p0};
    }

    @Override // androidx.p005navigation.NavType
    public final String[] parseValue(String p0, String[] p1) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(p0, "");
        return (p1 == null || (strArr = (String[]) ArraysKt.plus((Object[]) p1, (Object[]) parseValue(p0))) == null) ? parseValue(p0) : strArr;
    }

    @Override // androidx.p005navigation.NavType
    public final boolean valueEquals(String[] p0, String[] p1) {
        return ArraysKt.contentDeepEquals(p0, p1);
    }

    @Override // androidx.p005navigation.NavType
    public final void put(Bundle p0, String p1, String[] p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(p0);
        if (p2 != null) {
            SavedStateWriter.m7488putStringArrayimpl(bundleM7454constructorimpl, p1, p2);
        } else {
            SavedStateWriter.m7477putNullimpl(bundleM7454constructorimpl, p1);
        }
    }

    @Override // androidx.p005navigation.NavType
    public final String[] get(Bundle p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
        if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
            return null;
        }
        return SavedStateReader.m7440getStringArrayimpl(bundleM7368constructorimpl, p1);
    }

    @Override // androidx.p005navigation.CollectionNavType
    public final List<String> serializeAsValues(String[] p0) {
        if (p0 == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(p0.length);
        for (String str : p0) {
            arrayList.add(NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null));
        }
        return arrayList;
    }

    @Override // androidx.p005navigation.CollectionNavType
    public final String[] emptyCollection() {
        return new String[0];
    }
}

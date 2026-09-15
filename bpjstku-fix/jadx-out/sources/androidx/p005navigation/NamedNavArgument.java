package androidx.p005navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000b"}, d2 = {"Landroidx/navigation/NamedNavArgument;", "", "", "p0", "Landroidx/navigation/NavArgument;", "p1", "<init>", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroidx/navigation/NavArgument;", "name", "Ljava/lang/String;", "getName", "argument", "Landroidx/navigation/NavArgument;", "getArgument"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NamedNavArgument {
    private final NavArgument argument;
    private final String name;

    public NamedNavArgument(String str, NavArgument navArgument) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(navArgument, "");
        this.name = str;
        this.argument = navArgument;
    }

    public final String getName() {
        return this.name;
    }

    public final NavArgument getArgument() {
        return this.argument;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NavArgument getArgument() {
        return this.argument;
    }
}

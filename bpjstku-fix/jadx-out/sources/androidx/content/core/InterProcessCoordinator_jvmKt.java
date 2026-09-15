package androidx.content.core;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/File;", "p0", "Landroidx/datastore/core/InterProcessCoordinator;", "createSingleProcessCoordinator", "(Ljava/io/File;)Landroidx/datastore/core/InterProcessCoordinator;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InterProcessCoordinator_jvmKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(File file) {
        Intrinsics.checkNotNullParameter(file, "");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}

package androidx.content;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.datastore.DataStoreFile, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/content/Context;", "", "p0", "Ljava/io/File;", "dataStoreFile", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Context {
    public static final File dataStoreFile(android.content.Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(String.valueOf(str)));
    }
}

package androidx.collection;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0081\b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/collection/CollectionPlatformUtils;", "", "<init>", "()V", "Ljava/lang/IndexOutOfBoundsException;", "Lkotlin/a;", "createIndexOutOfBoundsException$collection", "()Ljava/lang/IndexOutOfBoundsException;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CollectionPlatformUtils {
    public static final CollectionPlatformUtils INSTANCE = new CollectionPlatformUtils();

    private CollectionPlatformUtils() {
    }

    public final IndexOutOfBoundsException createIndexOutOfBoundsException$collection() {
        return new ArrayIndexOutOfBoundsException();
    }
}

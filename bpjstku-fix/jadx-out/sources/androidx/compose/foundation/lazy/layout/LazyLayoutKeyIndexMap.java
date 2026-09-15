package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "", "p0", "", "getIndex", "(Ljava/lang/Object;)I", "getKey", "(I)Ljava/lang/Object;", "Empty"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyLayoutKeyIndexMap {

    /* JADX INFO: renamed from: Empty, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    int getIndex(Object p0);

    Object getKey(int p0);

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap$Empty, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap$Empty;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "<init>", "()V", "", "p0", "", "getIndex", "(Ljava/lang/Object;)I", "", "getKey", "(I)Ljava/lang/Void;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements LazyLayoutKeyIndexMap {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public final int getIndex(Object p0) {
            return -1;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
        public final Void getKey(int p0) {
            return null;
        }

        private Companion() {
        }
    }
}

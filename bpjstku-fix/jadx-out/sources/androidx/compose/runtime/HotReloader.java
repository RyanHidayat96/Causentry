package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/HotReloader;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class HotReloader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/HotReloader$Companion;", "", "<init>", "()V", "p0", "saveStateAndDispose", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "loadStateAndCompose", "(Ljava/lang/Object;)V", "simulateHotReload$runtime", "", "invalidateGroupsWithKey", "(I)V", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors", "()Ljava/util/List;", "clearErrors"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final Object saveStateAndDispose(Object p0) {
            return Recomposer.INSTANCE.saveStateAndDisposeForHotReload$runtime();
        }

        private final void loadStateAndCompose(Object p0) {
            Recomposer.INSTANCE.loadStateAndComposeForHotReload$runtime(p0);
        }

        public final void simulateHotReload$runtime(Object p0) {
            loadStateAndCompose(saveStateAndDispose(p0));
        }

        public final void invalidateGroupsWithKey(int p0) {
            Recomposer.INSTANCE.invalidateGroupsWithKey$runtime(p0);
        }

        public final List<RecomposerErrorInfo> getCurrentErrors() {
            return Recomposer.INSTANCE.getCurrentErrors$runtime();
        }

        public final void clearErrors() {
            Recomposer.INSTANCE.clearErrors$runtime();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

package androidx.window.embedding;

import android.app.Activity;
import androidx.core.util.Consumer;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\ba\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\u0018\u0010\fJ#\u0010\u0019\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H&¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/window/embedding/EmbeddingBackend;", "", "", "Landroidx/window/embedding/EmbeddingRule;", "getSplitRules", "()Ljava/util/Set;", "", "isSplitSupported", "()Z", "p0", "", "registerRule", "(Landroidx/window/embedding/EmbeddingRule;)V", "Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "p1", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "p2", "registerSplitListenerForActivity", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "setSplitRules", "(Ljava/util/Set;)V", "unregisterRule", "unregisterSplitListenerForActivity", "(Landroidx/core/util/Consumer;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface EmbeddingBackend {
    Set<EmbeddingRule> getSplitRules();

    boolean isSplitSupported();

    void registerRule(EmbeddingRule p0);

    void registerSplitListenerForActivity(Activity p0, Executor p1, Consumer<List<SplitInfo>> p2);

    void setSplitRules(Set<? extends EmbeddingRule> p0);

    void unregisterRule(EmbeddingRule p0);

    void unregisterSplitListenerForActivity(Consumer<List<SplitInfo>> p0);
}

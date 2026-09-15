package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\u000b0\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u000b0\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0010\u001a\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\t"}, d2 = {"", "p0", "", "simulateHotReload", "(Ljava/lang/Object;)V", "", "invalidateGroupsWithKey", "(I)V", "disableHotReloadMode", "()V", "", "Lkotlin/Pair;", "Ljava/lang/Exception;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "currentCompositionErrors", "()Ljava/util/List;", "", "getCurrentCompositionErrors", "clearCompositionErrors"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HotReloaderKt {
    public static final void simulateHotReload(Object obj) {
        HotReloader.INSTANCE.simulateHotReload$runtime(obj);
    }

    public static final void invalidateGroupsWithKey(int i) {
        HotReloader.INSTANCE.invalidateGroupsWithKey(i);
    }

    public static final void disableHotReloadMode() {
        Recomposer.INSTANCE.setHotReloadEnabled$runtime(false);
    }

    @Deprecated(message = "currentCompositionErrors only reports errors that extend from Exception. This method is unsupported outside of Compose runtime tests. Internally, getCurrentCompositionErrors should be used instead.")
    public static final List<Pair<Exception, Boolean>> currentCompositionErrors() {
        List<Pair<Throwable, Boolean>> currentCompositionErrors = getCurrentCompositionErrors();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = currentCompositionErrors.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Throwable th = (Throwable) pair.component1();
            boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
            Exception exc = th instanceof Exception ? (Exception) th : null;
            Pair pair2 = exc != null ? TuplesKt.to(exc, Boolean.valueOf(zBooleanValue)) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        return arrayList;
    }

    public static final List<Pair<Throwable, Boolean>> getCurrentCompositionErrors() {
        List<RecomposerErrorInfo> currentErrors = HotReloader.INSTANCE.getCurrentErrors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentErrors, 10));
        for (RecomposerErrorInfo recomposerErrorInfo : currentErrors) {
            arrayList.add(TuplesKt.to(recomposerErrorInfo.getCause(), Boolean.valueOf(recomposerErrorInfo.getRecoverable())));
        }
        return arrayList;
    }

    public static final void clearCompositionErrors() {
        HotReloader.INSTANCE.clearErrors();
    }
}

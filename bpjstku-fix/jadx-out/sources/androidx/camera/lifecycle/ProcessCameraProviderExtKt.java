package androidx.camera.lifecycle;

import android.content.Context;
import androidx.concurrent.futures.ListenableFutureKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;", "Landroid/content/Context;", "p0", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "awaitInstance", "(Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ProcessCameraProviderExtKt {
    public static final Object awaitInstance(ProcessCameraProvider.Companion companion, Context context, Continuation<? super ProcessCameraProvider> continuation) {
        return ListenableFutureKt.await(companion.getInstance(context), continuation);
    }
}

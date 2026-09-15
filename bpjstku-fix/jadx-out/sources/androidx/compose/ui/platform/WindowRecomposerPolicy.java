package androidx.compose.ui.platform;

import android.view.View;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.Recomposer;
import defpackage.BufferCopiedEncodedDataExternalSyntheticLambda0;
import defpackage.VideoConfigUtil;
import defpackage.VideoMimeInfoBuilder;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "<init>", "()V", "Landroidx/compose/ui/platform/WindowRecomposerFactory;", "p0", "getAndSetFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;)Landroidx/compose/ui/platform/WindowRecomposerFactory;", "p1", "", "compareAndSetFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Landroidx/compose/ui/platform/WindowRecomposerFactory;)Z", "", "setFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;)V", "R", "Lkotlin/Function0;", "withFactory", "(Landroidx/compose/ui/platform/WindowRecomposerFactory;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroid/view/View;", "Landroidx/compose/runtime/Recomposer;", "createAndInstallWindowRecomposer$ui_release", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "Ljava/util/concurrent/atomic/AtomicReference;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WindowRecomposerPolicy {
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();
    private static final AtomicReference<WindowRecomposerFactory> factory = new AtomicReference<>(WindowRecomposerFactory.INSTANCE.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    public final WindowRecomposerFactory getAndSetFactory(WindowRecomposerFactory p0) {
        return factory.getAndSet(p0);
    }

    public final boolean compareAndSetFactory(WindowRecomposerFactory p0, WindowRecomposerFactory p1) {
        return PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(factory, p0, p1);
    }

    public final void setFactory(WindowRecomposerFactory p0) {
        factory.set(p0);
    }

    public final <R> R withFactory(WindowRecomposerFactory p0, Function0<? extends R> p1) {
        WindowRecomposerFactory andSetFactory = getAndSetFactory(p0);
        try {
            R rInvoke = p1.invoke();
            if (compareAndSetFactory(p0, andSetFactory)) {
                return rInvoke;
            }
            throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (compareAndSetFactory(p0, andSetFactory)) {
                    throw th2;
                }
                ExceptionsKt.addSuppressed(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }

    public final Recomposer createAndInstallWindowRecomposer$ui_release(View p0) {
        Recomposer recomposerCreateRecomposer = factory.get().createRecomposer(p0);
        WindowRecomposer_androidKt.setCompositionContext(p0, recomposerCreateRecomposer);
        final VideoMimeInfoBuilder videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 = b.TuitionPaymentFragmentbindingInflater1(VideoConfigUtil.INSTANCE, BufferCopiedEncodedDataExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0.getHandler(), "windowRecomposer cleanup").TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(recomposerCreateRecomposer, p0, null), 2, null);
        p0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View p1) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View p1) {
                p1.removeOnAttachStateChangeListener(this);
                videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
            }
        });
        return recomposerCreateRecomposer;
    }
}

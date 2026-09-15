package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u000b2\u00020\u00012\u00020\u00022\u00060\u0003j\u0002`\u0004:\u0001\u000bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"LAutoValue_VideoMimeInfo1;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/io/Closeable;", "Ljava/lang/AutoCloseable;", "Lkotlin/jdk7/TuitionPaymentFragmentbindingInflater1;", "<init>", "()V", "Ljava/util/concurrent/Executor;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/util/concurrent/Executor;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AutoValue_VideoMimeInfo1 extends CoroutineDispatcher implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract Executor TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    /* JADX INFO: renamed from: AutoValue_VideoMimeInfo1$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LAutoValue_VideoMimeInfo1$b;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlinx/coroutines/CoroutineDispatcher;", "LAutoValue_VideoMimeInfo1;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion extends AbstractCoroutineContextKey<CoroutineDispatcher, AutoValue_VideoMimeInfo1> {
        private Companion() {
            super(CoroutineDispatcher.INSTANCE, new Function1() { // from class: setCompatibleVideoProfile
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoValue_VideoMimeInfo1.Companion.TuitionPaymentFragmentbindingInflater1((CoroutineContext.Element) obj);
                }
            });
        }

        public static /* synthetic */ AutoValue_VideoMimeInfo1 TuitionPaymentFragmentbindingInflater1(CoroutineContext.Element element) {
            if (element instanceof AutoValue_VideoMimeInfo1) {
                return (AutoValue_VideoMimeInfo1) element;
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

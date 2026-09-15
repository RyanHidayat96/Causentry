package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u0000 12\u00020\u0001:\u00011J\u0011\u0010\f\u001a\u00060\u000ej\u0002`\rH'¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\bH&J\u001f\u0010\u0011\u001a\u00020\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\rH&¢\u0006\u0002\u0010\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0017J\u0014\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0015H'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH'J\u000e\u0010\u001e\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u001fJ6\u0010$\u001a\u00020%2'\u0010&\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00120(j\u0002`'H&¢\u0006\u0002\u0010+JJ\u0010$\u001a\u00020%2\b\b\u0002\u0010,\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020\b2'\u0010&\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00120(j\u0002`'H'¢\u0006\u0002\u0010.J\u0011\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0000H\u0097\u0002R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00008&X§\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010 \u001a\u00020!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00062"}, d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Element;", "parent", "getParent$annotations", "()V", "getParent", "()Lkotlinx/coroutines/Job;", "isActive", "", "()Z", "isCompleted", "isCancelled", "getCancellationException", "Lkotlinx/coroutines/CancellationException;", "Ljava/util/concurrent/CancellationException;", "()Ljava/util/concurrent/CancellationException;", "start", "cancel", "", "cause", "(Ljava/util/concurrent/CancellationException;)V", "", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", "child", "Lkotlinx/coroutines/ChildJob;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handler", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "plus", "other", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface VideoMimeInfoBuilder extends CoroutineContext.Element {
    public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 b = TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;

    boolean INotificationSideChannel();

    ReportedVideoQualityNotSupportedQuirk TuitionPaymentFragmentspecialinlinedviewModeldefault1(isHuaweiP40Lite ishuaweip40lite);

    void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CancellationException cancellationException);

    Object a_(Continuation<? super Unit> continuation);

    setCompatibleAudioProfile a_(Function1<? super Throwable, Unit> function1);

    Sequence<VideoMimeInfoBuilder> asInterface();

    setCompatibleAudioProfile b(boolean z, boolean z2, Function1<? super Throwable, Unit> function1);

    boolean cancel();

    boolean d();

    boolean r_();

    CancellationException s_();

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public static <E extends CoroutineContext.Element> E TuitionPaymentFragmentbindingInflater1(VideoMimeInfoBuilder videoMimeInfoBuilder, CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.get(videoMimeInfoBuilder, key);
        }

        public static <R> R TuitionPaymentFragmentspecialinlinedviewModeldefault1(VideoMimeInfoBuilder videoMimeInfoBuilder, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(videoMimeInfoBuilder, r, function2);
        }

        public static CoroutineContext TuitionPaymentFragmentspecialinlinedviewModeldefault1(VideoMimeInfoBuilder videoMimeInfoBuilder, CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(videoMimeInfoBuilder, key);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements CoroutineContext.Key<VideoMimeInfoBuilder> {
        static final /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1 b = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }
    }
}

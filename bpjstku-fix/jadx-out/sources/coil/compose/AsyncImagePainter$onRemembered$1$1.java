package coil.compose;

import androidx.compose.runtime.SnapshotStateKt;
import coil.compose.AsyncImagePainter$onRemembered$1$1;
import com.bpjstku.presentation.main.home.HomeFragment$special$$inlined$inject$default$1;
import defpackage.MediaBrowserCompatServiceBinderWrapper;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.lambdarequestKeyFrame8androidxcameravideointernalencoderEncoderImpl;
import defpackage.newStarRating;
import defpackage.newUnratedRating;
import defpackage.writeToParcel;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$1", f = "AsyncImagePainter.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
public final class AsyncImagePainter$onRemembered$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MediaBrowserCompatServiceBinderWrapper this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper = this.this$0;
            this.label = 1;
            if (lambdarequestKeyFrame8androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(SnapshotStateKt.snapshotFlow(new Function0() { // from class: getMediaItem
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AsyncImagePainter$onRemembered$1$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mediaBrowserCompatServiceBinderWrapper);
                }
            }), new AnonymousClass2(this.this$0, null)).collect(new AnonymousClass4(this.this$0), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$onRemembered$1$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "Lcoil/compose/AsyncImagePainter$State;", "it", "Lcoil/request/ImageRequest;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "coil.compose.AsyncImagePainter$onRemembered$1$1$2", f = "AsyncImagePainter.kt", i = {}, l = {307}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<newUnratedRating, Continuation<? super MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MediaBrowserCompatServiceBinderWrapper this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                newUnratedRating newunratedrating = (newUnratedRating) this.L$0;
                MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper2 = this.this$0;
                writeToParcel writetoparcelB = mediaBrowserCompatServiceBinderWrapper2.b();
                Object[] objArr = {this.this$0, newunratedrating};
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                this.L$0 = mediaBrowserCompatServiceBinderWrapper2;
                this.label = 1;
                obj = writetoparcelB.TuitionPaymentFragmentspecialinlinedviewModeldefault2((newUnratedRating) MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, 2461191, -2461185), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mediaBrowserCompatServiceBinderWrapper = mediaBrowserCompatServiceBinderWrapper2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mediaBrowserCompatServiceBinderWrapper = (MediaBrowserCompatServiceBinderWrapper) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(mediaBrowserCompatServiceBinderWrapper, (newStarRating) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = mediaBrowserCompatServiceBinderWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
        public Object invoke(newUnratedRating newunratedrating, Continuation<? super MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3> continuation) {
            return ((AnonymousClass2) create(newunratedrating, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final newUnratedRating TuitionPaymentFragmentspecialinlinedviewModeldefault2(MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper) {
        return mediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    /* JADX INFO: renamed from: coil.compose.AsyncImagePainter$onRemembered$1$1$4, reason: invalid class name */
    final /* synthetic */ class AnonymousClass4 implements addSignalEosTimeoutIfNeeded, FunctionAdapter {
        private /* synthetic */ MediaBrowserCompatServiceBinderWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // defpackage.addSignalEosTimeoutIfNeeded
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
        public Object emit(MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, Continuation<? super Unit> continuation) {
            Object objB = AsyncImagePainter$onRemembered$1$1.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Unit.INSTANCE;
        }

        AnonymousClass4(MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mediaBrowserCompatServiceBinderWrapper;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof addSignalEosTimeoutIfNeeded) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new AdaptedFunctionReference(2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, MediaBrowserCompatServiceBinderWrapper.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object b(MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper, MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        MediaBrowserCompatServiceBinderWrapper.TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, HomeFragment$special$$inlined$inject$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{mediaBrowserCompatServiceBinderWrapper, tuitionPaymentFragmentspecialinlinedviewModeldefault3}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1170380119, 1170380120);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AsyncImagePainter$onRemembered$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePainter$onRemembered$1$1(MediaBrowserCompatServiceBinderWrapper mediaBrowserCompatServiceBinderWrapper, Continuation<? super AsyncImagePainter$onRemembered$1$1> continuation) {
        super(2, continuation);
        this.this$0 = mediaBrowserCompatServiceBinderWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AsyncImagePainter$onRemembered$1$1(this.this$0, continuation);
    }
}

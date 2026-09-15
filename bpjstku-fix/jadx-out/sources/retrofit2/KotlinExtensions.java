package retrofit2;

import androidx.exifinterface.media.ExifInterface;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a'\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001c\u0010\t\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\bH\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lretrofit2/Call;", "await", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "Lretrofit2/Response;", "awaitResponse", "Lretrofit2/Retrofit;", "create", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "suspendAndThrow", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0})
public final class KotlinExtensions {

    /* JADX INFO: renamed from: retrofit2.KotlinExtensions$suspendAndThrow$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Lkotlin/coroutines/Continuation;", "", "p0", "", "suspendAndThrow", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {2, 3, 0})
    @DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {113}, m = "suspendAndThrow", n = {"$this$suspendAndThrow"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) retrofit.create(Object.class);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final Object suspendAndThrow(final Exception exc, Continuation<?> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            anonymousClass1.L$0 = exc;
            anonymousClass1.label = 1;
            final AnonymousClass1 anonymousClass2 = anonymousClass1;
            Dispatchers.TuitionPaymentFragmentspecialinlinedviewModeldefault2().dispatch(anonymousClass2.get$context(), new Runnable() { // from class: retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    Continuation continuationIntercepted = IntrinsicsKt.intercepted(anonymousClass2);
                    Exception exc2 = exc;
                    Result.Companion companion = Result.INSTANCE;
                    continuationIntercepted.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(exc2)));
                }
            });
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (coroutine_suspended2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(anonymousClass2);
            }
            if (coroutine_suspended2 == coroutine_suspended) {
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

    public static final <T> Object await(final Call<T> call, Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.b((Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
            public static int $TuitionPaymentFragmentbindingInflater1 = -966290755;

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                call.cancel();
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public final void onResponse(Call<T> p0, Response<T> p1) {
                if (p1.isSuccessful()) {
                    T tBody = p1.body();
                    if (tBody == null) {
                        Object objTag = p0.request().tag(Invocation.class);
                        if (objTag == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(objTag, "");
                        Method method = ((Invocation) objTag).method();
                        StringBuilder sb = new StringBuilder("Response from ");
                        Intrinsics.checkExpressionValueIsNotNull(method, "");
                        Class<?> declaringClass = method.getDeclaringClass();
                        Intrinsics.checkExpressionValueIsNotNull(declaringClass, "");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(method.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
                        MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
                        return;
                    }
                    MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk2 = cancellableContinuationImpl2;
                    Result.Companion companion2 = Result.INSTANCE;
                    mediaFormatMustNotUseFrameRateToFindEncoderQuirk2.resumeWith(Result.m8024constructorimpl(tBody));
                    return;
                }
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk3 = cancellableContinuationImpl2;
                HttpException httpException = new HttpException(p1);
                Result.Companion companion3 = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk3.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(httpException)));
            }

            @Override // retrofit2.Callback
            public final void onFailure(Call<T> p0, Throwable p1) {
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(p1)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> Object awaitNullable(final Call<T> call, Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.b((Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                call.cancel();
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public final void onResponse(Call<T> p0, Response<T> p1) {
                if (p1.isSuccessful()) {
                    MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                    T tBody = p1.body();
                    Result.Companion companion = Result.INSTANCE;
                    mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(tBody));
                    return;
                }
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk2 = cancellableContinuationImpl2;
                HttpException httpException = new HttpException(p1);
                Result.Companion companion2 = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk2.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(httpException)));
            }

            @Override // retrofit2.Callback
            public final void onFailure(Call<T> p0, Throwable p1) {
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(p1)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> Object awaitResponse(final Call<T> call, Continuation<? super Response<T>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.b((Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                call.cancel();
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public final void onResponse(Call<T> p0, Response<T> p1) {
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(p1));
            }

            @Override // retrofit2.Callback
            public final void onFailure(Call<T> p0, Throwable p1) {
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(p1)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}

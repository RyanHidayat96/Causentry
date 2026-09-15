package kotlinx.coroutines.channels;

import defpackage.EncodeExceptionErrorType;
import defpackage.EncodedDataImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
public final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ EncodeExceptionErrorType<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(EncodeExceptionErrorType<E> encodeExceptionErrorType, Continuation<? super BufferedChannel$receiveCatching$1> continuation) {
        super(continuation);
        this.this$0 = encodeExceptionErrorType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = EncodeExceptionErrorType.TuitionPaymentFragmentspecialinlinedviewModeldefault1((EncodeExceptionErrorType) this.this$0, (Continuation) this);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault1 : EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }
}

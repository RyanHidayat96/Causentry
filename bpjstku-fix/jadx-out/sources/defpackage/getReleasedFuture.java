package defpackage;

import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class getReleasedFuture {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object TuitionPaymentFragmentbindingInflater1(EncoderSurfaceInputOnSurfaceUpdateListener<? super E> encoderSurfaceInputOnSurfaceUpdateListener, E e2) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = encoderSurfaceInputOnSurfaceUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(e2);
        if (!(objTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof EncodedDataImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            EncodedDataImplExternalSyntheticLambda0.Companion companion = EncodedDataImplExternalSyntheticLambda0.INSTANCE;
            return EncodedDataImplExternalSyntheticLambda0.Companion.b(Unit.INSTANCE);
        }
        return ((EncodedDataImplExternalSyntheticLambda0) BuildersKt.runBlocking(EmptyCoroutineContext.INSTANCE, new ChannelsKt__ChannelsKt$trySendBlocking$2(encoderSurfaceInputOnSurfaceUpdateListener, e2, null))).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getProblematicSizes<T> extends AudioEncoderConfigBuilder implements isHuaweiMate20<T> {
    @Override // defpackage.AudioEncoderConfigBuilder
    public final boolean t_() {
        return true;
    }

    public getProblematicSizes(VideoMimeInfoBuilder videoMimeInfoBuilder) {
        super(true);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2((VideoMimeInfoBuilder) null);
    }

    @Override // kotlinx.coroutines.Deferred
    public final T b() {
        return (T) cancelAll();
    }

    @Override // kotlinx.coroutines.Deferred
    public final Object await(Continuation<? super T> continuation) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1((Continuation<Object>) continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.isHuaweiMate20
    public final boolean b(T t) {
        return asInterface(t);
    }

    @Override // defpackage.isHuaweiMate20
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
        return asInterface(new isVivoY91i(th, false, 2, null));
    }
}

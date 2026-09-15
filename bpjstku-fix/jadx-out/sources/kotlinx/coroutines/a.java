package kotlinx.coroutines;

import defpackage.AutoValue_AudioMimeInfoBuilder;
import defpackage.VideoConfigUtil;
import defpackage.VideoEncoderCrashQuirk;
import defpackage.isX650;
import defpackage.setDataSpace;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class a {
    public static final <T> T runBlocking(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        AutoValue_AudioMimeInfoBuilder autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        CoroutineContext coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Thread threadCurrentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.INSTANCE);
        if (continuationInterceptor == null) {
            setDataSpace setdataspace = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2 = VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VideoConfigUtil.INSTANCE, coroutineContext.plus(autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3));
        } else {
            if (continuationInterceptor instanceof AutoValue_AudioMimeInfoBuilder) {
            }
            setDataSpace setdataspace2 = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setDataSpace.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2 = VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VideoConfigUtil.INSTANCE, coroutineContext);
        }
        isX650 isx650 = new isX650(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2, threadCurrentThread, autoValue_AudioMimeInfoBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        isx650.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoroutineStart.DEFAULT, isx650, function2);
        return (T) isx650.b();
    }
}

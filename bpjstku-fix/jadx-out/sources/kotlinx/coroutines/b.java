package kotlinx.coroutines;

import defpackage.AudioEncoderConfigDefaultResolver;
import defpackage.AudioEncoderInfo;
import defpackage.AudioEncoderInfoImpl;
import defpackage.EncoderImplByteBufferInputExternalSyntheticLambda5;
import defpackage.EncoderImplMediaCodecCallbackExternalSyntheticLambda4;
import defpackage.EncoderImplSurfaceInput;
import defpackage.StretchedVideoResolutionQuirk;
import defpackage.VideoEncoderCrashQuirk;
import defpackage.VideoMimeInfo;
import defpackage.VideoMimeInfoBuilder;
import defpackage.generateCopiedByteInfo;
import defpackage.getBitrateRange;
import defpackage.isVivoY91i;
import defpackage.onOutputBufferAvailable;
import defpackage.resolveAudioSourceFormat;
import defpackage.setColorFormat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ VideoMimeInfoBuilder TuitionPaymentFragmentbindingInflater1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.b(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final VideoMimeInfoBuilder b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        getBitrateRange setcolorformat;
        CoroutineContext coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2 = VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coroutineScope, coroutineContext);
        if (coroutineStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            setcolorformat = new getBitrateRange(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2, function2);
        } else {
            setcolorformat = new setColorFormat(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2, true);
        }
        setcolorformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineStart, setcolorformat, function2);
        return setcolorformat;
    }

    public static /* synthetic */ Deferred async$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return BuildersKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> Deferred<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        AudioEncoderInfoImpl resolveaudiosourceformat;
        CoroutineContext coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2 = VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coroutineScope, coroutineContext);
        if (coroutineStart.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            resolveaudiosourceformat = new AudioEncoderInfoImpl(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2, function2);
        } else {
            resolveaudiosourceformat = new resolveAudioSourceFormat(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault2, true);
        }
        resolveaudiosourceformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineStart, resolveaudiosourceformat, function2);
        return resolveaudiosourceformat;
    }

    public static final <T> Object TuitionPaymentFragmentbindingInflater1(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws Throwable {
        CoroutineContext coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        CoroutineContext context = continuation.get$context();
        if (!((Boolean) coroutineContext.fold(Boolean.FALSE, new StretchedVideoResolutionQuirk())).booleanValue()) {
            coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3 = context.plus(coroutineContext);
        } else {
            coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3 = VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, coroutineContext, false);
        }
        VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(VideoMimeInfoBuilder.b);
        if (videoMimeInfoBuilder != null) {
            VideoMimeInfo.b(videoMimeInfoBuilder);
        }
        if (coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3 == context) {
            onOutputBufferAvailable onoutputbufferavailable = new onOutputBufferAvailable(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3, continuation);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplSurfaceInput.TuitionPaymentFragmentbindingInflater1(onoutputbufferavailable, onoutputbufferavailable, function2);
        } else if (Intrinsics.areEqual(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(ContinuationInterceptor.INSTANCE), context.get(ContinuationInterceptor.INSTANCE))) {
            generateCopiedByteInfo generatecopiedbyteinfo = new generateCopiedByteInfo(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3, continuation);
            CoroutineContext context2 = generatecopiedbyteinfo.get$context();
            Object objTuitionPaymentFragmentbindingInflater1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(context2, null);
            try {
                Object objTuitionPaymentFragmentbindingInflater2 = EncoderImplSurfaceInput.TuitionPaymentFragmentbindingInflater1(generatecopiedbyteinfo, generatecopiedbyteinfo, function2);
                EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context2, objTuitionPaymentFragmentbindingInflater1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = objTuitionPaymentFragmentbindingInflater2;
            } catch (Throwable th) {
                EncoderImplMediaCodecCallbackExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context2, objTuitionPaymentFragmentbindingInflater1);
                throw th;
            }
        } else {
            AudioEncoderConfigDefaultResolver audioEncoderConfigDefaultResolver = new AudioEncoderConfigDefaultResolver(coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3, continuation);
            AudioEncoderConfigDefaultResolver audioEncoderConfigDefaultResolver2 = audioEncoderConfigDefaultResolver;
            try {
                Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, audioEncoderConfigDefaultResolver, audioEncoderConfigDefaultResolver2));
                Result.Companion companion = Result.INSTANCE;
                EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(continuationIntercepted, Result.m8024constructorimpl(Unit.INSTANCE));
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdaterB = AudioEncoderConfigDefaultResolver.b();
                while (true) {
                    int i = atomicIntegerFieldUpdaterB.get(audioEncoderConfigDefaultResolver);
                    if (i != 0) {
                        if (i == 2) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(audioEncoderConfigDefaultResolver.getInterfaceDescriptor());
                            if (!(objTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof isVivoY91i)) {
                                break;
                            }
                            throw ((isVivoY91i) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentbindingInflater1;
                        }
                        throw new IllegalStateException("Already suspended".toString());
                    }
                    if (AudioEncoderConfigDefaultResolver.b().compareAndSet(audioEncoderConfigDefaultResolver, 0, 1)) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        break;
                    }
                }
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                audioEncoderConfigDefaultResolver2.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(th2)));
                throw th2;
            }
        }
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}

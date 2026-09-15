package defpackage;

import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoEncoderCrashQuirk {
    public static final CoroutineContext TuitionPaymentFragmentspecialinlinedviewModeldefault2(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(coroutineScope.getCoroutineContext(), coroutineContext, true);
        CoroutineContext coroutineContextPlus = scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault2() ? coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3.plus(new VideoQualityQuirk(scaleAndClampBitrate.b().incrementAndGet())) : coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return (coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3 == Dispatchers.TuitionPaymentFragmentspecialinlinedviewModeldefault2() || coroutineContextTuitionPaymentFragmentspecialinlinedviewModeldefault3.get(ContinuationInterceptor.INSTANCE) != null) ? coroutineContextPlus : coroutineContextPlus.plus(Dispatchers.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    public static final generateCopiedByteInfo<?> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        generateCopiedByteInfo<?> generatecopiedbyteinfo = null;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (coroutineContext.get(getBufferInfo.INSTANCE) != null) {
            CoroutineStackFrame callerFrame = (CoroutineStackFrame) continuation;
            while (!(callerFrame instanceof AudioEncoderConfigDefaultResolver) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof generateCopiedByteInfo) {
                    generatecopiedbyteinfo = (generateCopiedByteInfo) callerFrame;
                    break;
                }
            }
            if (generatecopiedbyteinfo != null) {
                generatecopiedbyteinfo.threadLocalIsSet = true;
                generatecopiedbyteinfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3.set(TuplesKt.to(coroutineContext, obj));
            }
        }
        return generatecopiedbyteinfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Object] */
    public static final CoroutineContext TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z) {
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(Boolean.FALSE, new StretchedVideoResolutionQuirk())).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(Boolean.FALSE, new StretchedVideoResolutionQuirk())).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(EmptyCoroutineContext.INSTANCE, new Function2() { // from class: StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
            /* JADX WARN: Type inference failed for: r1v3, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Ref.ObjectRef objectRef2 = objectRef;
                boolean z2 = z;
                CoroutineContext coroutineContext4 = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof getAlternativeResolution)) {
                    return coroutineContext4.plus(element);
                }
                if (((CoroutineContext) objectRef2.element).get(element.getKey()) == null) {
                    return coroutineContext4.plus(z2 ? ((getAlternativeResolution) element).TuitionPaymentFragmentspecialinlinedviewModeldefault2() : (getAlternativeResolution) element);
                }
                objectRef2.element = ((CoroutineContext) objectRef2.element).minusKey(element.getKey());
                return coroutineContext4.plus(((getAlternativeResolution) element).TuitionPaymentFragmentbindingInflater1());
            }
        });
        if (zBooleanValue2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(EmptyCoroutineContext.INSTANCE, new Function2() { // from class: resolveAudioEncoderConfig
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    CoroutineContext coroutineContext4 = (CoroutineContext) obj;
                    CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                    return element instanceof getAlternativeResolution ? coroutineContext4.plus(((getAlternativeResolution) element).TuitionPaymentFragmentspecialinlinedviewModeldefault2()) : coroutineContext4.plus(element);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }
}

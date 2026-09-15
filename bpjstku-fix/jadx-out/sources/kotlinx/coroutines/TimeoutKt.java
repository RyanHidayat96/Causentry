package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import defpackage.AudioEncoderConfigAudioProfileResolver;
import defpackage.AudioMimeInfo;
import defpackage.EncoderImplSurfaceInput;
import defpackage.VideoMimeInfo;
import defpackage.VideoMimeInfoBuilder;
import defpackage.selectSampleRateOrNearestSupported;
import defpackage.setIFrameInterval;
import defpackage.setMimeType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aT\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u001aT\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\f\u0010\n\u001aI\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@¢\u0006\u0004\b\r\u0010\n\u001a^\u0010\u0010\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\r\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\r\u0010\u0016"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "p1", "withTimeout", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "U", "LsetIFrameInterval;", "b", "(LsetIFrameInterval;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "LselectSampleRateOrNearestSupported;", "LVideoMimeInfoBuilder;", "p2", "Lkotlinx/coroutines/TimeoutCancellationException;", "(JLselectSampleRateOrNearestSupported;LVideoMimeInfoBuilder;)Lkotlinx/coroutines/TimeoutCancellationException;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TimeoutKt {
    public static final <T> Object withTimeout(long j, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objB = b(new setIFrameInterval(j, continuation), function2);
        if (objB == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, setIFrameInterval] */
    public static final <T> Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        TimeoutCancellationException e2;
        Ref.ObjectRef objectRef;
        if (continuation instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) continuation;
            if ((timeoutKt$withTimeoutOrNull$1.label & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.label -= Integer.MIN_VALUE;
            } else {
                timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
            }
        } else {
            timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
        }
        Object obj = timeoutKt$withTimeoutOrNull$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = timeoutKt$withTimeoutOrNull$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (j <= 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                timeoutKt$withTimeoutOrNull$1.L$0 = function2;
                timeoutKt$withTimeoutOrNull$1.L$1 = objectRef2;
                timeoutKt$withTimeoutOrNull$1.J$0 = j;
                timeoutKt$withTimeoutOrNull$1.label = 1;
                ?? r4 = (T) new setIFrameInterval(j, timeoutKt$withTimeoutOrNull$1);
                objectRef2.element = r4;
                Object objB = b(r4, function2);
                if (objB == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(timeoutKt$withTimeoutOrNull$1);
                }
                return objB == coroutine_suspended ? coroutine_suspended : objB;
            } catch (TimeoutCancellationException e3) {
                e2 = e3;
                objectRef = objectRef2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = timeoutKt$withTimeoutOrNull$1.J$0;
            objectRef = (Ref.ObjectRef) timeoutKt$withTimeoutOrNull$1.L$1;
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (TimeoutCancellationException e4) {
                e2 = e4;
            }
        }
        if (e2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == objectRef.element) {
            return null;
        }
        throw e2;
    }

    private static final <U, T extends U> Object b(setIFrameInterval<U, ? super T> setiframeinterval, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(setiframeinterval, true, new setMimeType(AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(setiframeinterval.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get$context()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(setiframeinterval.TuitionPaymentFragmentspecialinlinedviewModeldefault2, setiframeinterval, setiframeinterval.get$context())));
        return EncoderImplSurfaceInput.b(setiframeinterval, setiframeinterval, function2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public static final TimeoutCancellationException TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, selectSampleRateOrNearestSupported selectsamplerateornearestsupported, VideoMimeInfoBuilder videoMimeInfoBuilder) {
        String string;
        AudioMimeInfo audioMimeInfo = selectsamplerateornearestsupported instanceof AudioMimeInfo ? (AudioMimeInfo) selectsamplerateornearestsupported : null;
        if (audioMimeInfo != null) {
            Duration.Companion companion = Duration.INSTANCE;
            DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
            string = audioMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (string == null) {
                StringBuilder sb = new StringBuilder("Timed out waiting for ");
                sb.append(j);
                sb.append(" ms");
                string = sb.toString();
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Timed out waiting for ");
            sb2.append(j);
            sb2.append(" ms");
            string = sb2.toString();
        }
        return new TimeoutCancellationException(string, videoMimeInfoBuilder);
    }

    public static final <T> Object TuitionPaymentFragmentbindingInflater1(long j, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        long jM9385getInWholeMillisecondsimpl;
        boolean zM9401isPositiveimpl = Duration.m9401isPositiveimpl(j);
        if (zM9401isPositiveimpl) {
            Duration.Companion companion = Duration.INSTANCE;
            jM9385getInWholeMillisecondsimpl = Duration.m9385getInWholeMillisecondsimpl(Duration.m9403plusLRDsOJo(j, DurationKt.toDuration(999999L, DurationUnit.NANOSECONDS)));
        } else {
            if (zM9401isPositiveimpl) {
                throw new NoWhenBranchMatchedException();
            }
            jM9385getInWholeMillisecondsimpl = 0;
        }
        return withTimeout(jM9385getInWholeMillisecondsimpl, function2, continuation);
    }
}

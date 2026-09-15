package defpackage;

import androidx.collection.SieveCacheKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1;

/* JADX INFO: loaded from: classes4.dex */
public final class EncodedData {
    private static final requestKeyFrame<Object> INotificationSideChannel = new requestKeyFrame<>(-1, null, null, 0);
    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = EncoderImplMediaCodecCallbackExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    private static final int g = EncoderImplMediaCodecCallbackExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault1("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("BUFFERED");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 cancelAll = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("SHOULD_BUFFER");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 INotificationSideChannelDefault = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("S_RESUMING_BY_RCV");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 INotificationSideChannelStubProxy = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("RESUMING_BY_EB");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 onTransact = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("POISONED");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 d = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("DONE_RCV");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 asInterface = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 f134a = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("INTERRUPTED_RCV");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("CHANNEL_CLOSED");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 RemoteActionCompatParcelizer = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("SUSPEND");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 INotificationSideChannelStub = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("SUSPEND_NO_WAITER");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 asBinder = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("FAILED");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 cancel = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("NO_RECEIVE_RESULT");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 b = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("CLOSE_HANDLER_CLOSED");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("CLOSE_HANDLER_INVOKED");
    private static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 notify = new EncoderImplMediaCodecCallbackExternalSyntheticLambda0("NO_CLOSE_CAUSE");

    public static final /* synthetic */ long TuitionPaymentFragmentbindingInflater1(long j, boolean z) {
        return (z ? SieveCacheKt.NodeVisitedBit : 0L) + j;
    }

    public static final /* synthetic */ long TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, int i) {
        return (((long) i) << 60) + j;
    }

    public static final /* synthetic */ long TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        if (i == 0) {
            return 0L;
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return Long.MAX_VALUE;
    }

    public static final <E> KFunction<requestKeyFrame<E>> INotificationSideChannelStub() {
        return BufferedChannelKt$createSegmentFunction$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static final EncoderImplMediaCodecCallbackExternalSyntheticLambda0 INotificationSideChannelDefault() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    public static final /* synthetic */ requestKeyFrame TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, requestKeyFrame requestkeyframe) {
        EncodeExceptionErrorType<E> encodeExceptionErrorType = requestkeyframe.b;
        Intrinsics.checkNotNull(encodeExceptionErrorType);
        return new requestKeyFrame(j, requestkeyframe, encodeExceptionErrorType, 0);
    }

    public static final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk, Object obj, Function3 function3) {
        Object objB = mediaFormatMustNotUseFrameRateToFindEncoderQuirk.b(obj, null, function3);
        if (objB == null) {
            return false;
        }
        mediaFormatMustNotUseFrameRateToFindEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objB);
        return true;
    }

    static /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk, Object obj) {
        Object objB = mediaFormatMustNotUseFrameRateToFindEncoderQuirk.b(obj, null, null);
        if (objB == null) {
            return false;
        }
        mediaFormatMustNotUseFrameRateToFindEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objB);
        return true;
    }
}

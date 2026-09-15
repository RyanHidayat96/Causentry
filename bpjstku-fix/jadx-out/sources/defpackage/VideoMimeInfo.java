package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoMimeInfo {
    public static final VideoMimeInfoBuilder TuitionPaymentFragmentbindingInflater1(CoroutineContext coroutineContext) {
        return toMediaFormat.b(coroutineContext);
    }

    public static final SizeCannotEncodeVideoQuirk TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoMimeInfoBuilder videoMimeInfoBuilder) {
        return toMediaFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(videoMimeInfoBuilder);
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoroutineContext coroutineContext) {
        return toMediaFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coroutineContext);
    }

    public static final void b(VideoMimeInfoBuilder videoMimeInfoBuilder) {
        toMediaFormat.TuitionPaymentFragmentbindingInflater1(videoMimeInfoBuilder);
    }

    public static final setCompatibleAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(VideoMimeInfoBuilder videoMimeInfoBuilder, boolean z, getInputTimebase getinputtimebase) {
        return videoMimeInfoBuilder instanceof AudioEncoderConfigBuilder ? ((AudioEncoderConfigBuilder) videoMimeInfoBuilder).TuitionPaymentFragmentspecialinlinedviewModeldefault2(z, getinputtimebase) : videoMimeInfoBuilder.b(getinputtimebase.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), z, new JobKt__JobKt$invokeOnCompletion$1(getinputtimebase));
    }
}

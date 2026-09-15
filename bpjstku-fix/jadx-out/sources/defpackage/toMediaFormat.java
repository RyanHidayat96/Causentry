package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class toMediaFormat {
    public static final SizeCannotEncodeVideoQuirk TuitionPaymentFragmentspecialinlinedviewModeldefault1(VideoMimeInfoBuilder videoMimeInfoBuilder) {
        return new AudioEncoderConfig(videoMimeInfoBuilder);
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(CoroutineContext coroutineContext) {
        VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) coroutineContext.get(VideoMimeInfoBuilder.b);
        if (videoMimeInfoBuilder != null) {
            return videoMimeInfoBuilder.r_();
        }
        return true;
    }

    public static final void TuitionPaymentFragmentbindingInflater1(VideoMimeInfoBuilder videoMimeInfoBuilder) {
        if (!videoMimeInfoBuilder.r_()) {
            throw videoMimeInfoBuilder.s_();
        }
    }

    public static final VideoMimeInfoBuilder b(CoroutineContext coroutineContext) {
        VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) coroutineContext.get(VideoMimeInfoBuilder.b);
        if (videoMimeInfoBuilder != null) {
            return videoMimeInfoBuilder;
        }
        throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(coroutineContext)).toString());
    }
}

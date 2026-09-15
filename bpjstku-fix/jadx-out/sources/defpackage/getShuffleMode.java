package defpackage;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
final class getShuffleMode implements Callback, Function1<Throwable, Unit> {
    private final MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Response> TuitionPaymentFragmentbindingInflater1;
    private final Call TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: Multi-variable type inference failed */
    public getShuffleMode(Call call, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Response> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = call;
        this.TuitionPaymentFragmentbindingInflater1 = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        b();
        return Unit.INSTANCE;
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        AutoValue_Bitmap2JpegBytes_In.b(call, response);
        try {
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Response> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.TuitionPaymentFragmentbindingInflater1;
            Result.Companion companion = Result.INSTANCE;
            mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(response));
        } finally {
            AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2(call, iOException);
        try {
            if (!call.getCanceled()) {
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Response> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.TuitionPaymentFragmentbindingInflater1;
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(iOException)));
            }
        } finally {
            AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    private void b() {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel();
        } catch (Throwable unused) {
        }
    }
}

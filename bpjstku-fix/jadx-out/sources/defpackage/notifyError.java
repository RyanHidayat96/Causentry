package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.internal.operators.single.SingleToObservable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class notifyError {
    public static <T> boolean b(Object obj, readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, VideoOutputSourceState videoOutputSourceState) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            AbsActionBarViewVisibilityAnimListener absActionBarViewVisibilityAnimListener = (Object) ((Callable) obj).call();
            VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6 = absActionBarViewVisibilityAnimListener != null ? (VideoEncoderSessionExternalSyntheticLambda6) share.b(readablems.apply(absActionBarViewVisibilityAnimListener), "The mapper returned a null CompletableSource") : null;
            if (videoEncoderSessionExternalSyntheticLambda6 == null) {
                EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(videoOutputSourceState);
            } else {
                videoEncoderSessionExternalSyntheticLambda6.b(videoOutputSourceState);
            }
            return true;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, videoOutputSourceState);
            return true;
        }
    }

    public static <T, R> boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, deriveMediaType<? super R> derivemediatype) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            AbsActionBarViewVisibilityAnimListener absActionBarViewVisibilityAnimListener = (Object) ((Callable) obj).call();
            VideoSpecBuilder videoSpecBuilder = absActionBarViewVisibilityAnimListener != null ? (VideoSpecBuilder) share.b(readablems.apply(absActionBarViewVisibilityAnimListener), "The mapper returned a null MaybeSource") : null;
            if (videoSpecBuilder == null) {
                EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype);
            } else {
                videoSpecBuilder.TuitionPaymentFragmentbindingInflater1(MaybeToObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivemediatype));
            }
            return true;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, derivemediatype);
            return true;
        }
    }

    public static <T, R> boolean b(Object obj, readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems, deriveMediaType<? super R> derivemediatype) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            AbsActionBarViewVisibilityAnimListener absActionBarViewVisibilityAnimListener = (Object) ((Callable) obj).call();
            generateBackupProfile generatebackupprofile = absActionBarViewVisibilityAnimListener != null ? (generateBackupProfile) share.b(readablems.apply(absActionBarViewVisibilityAnimListener), "The mapper returned a null SingleSource") : null;
            if (generatebackupprofile == null) {
                EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype);
            } else {
                generatebackupprofile.TuitionPaymentFragmentbindingInflater1(SingleToObservable.TuitionPaymentFragmentbindingInflater1(derivemediatype));
            }
            return true;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, derivemediatype);
            return true;
        }
    }
}

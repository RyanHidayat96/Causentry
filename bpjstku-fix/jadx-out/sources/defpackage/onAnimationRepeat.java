package defpackage;

import com.google.android.gms.internal.mlkit_vision_face.zzee;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class onAnimationRepeat {
    private static final Logger TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Logger.getLogger("okio.Okio");

    public static final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault3(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "");
        return new SurfaceViewImplementationExternalSyntheticLambda0(outputStream, new cancelPreviousRequest());
    }

    public static final tryToComplete TuitionPaymentFragmentbindingInflater1(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "");
        return new lambdaanimateToFullOpacity0androidxcameraviewScreenFlashView(inputStream, new cancelPreviousRequest());
    }

    public static final SurfaceViewImplementationApi24Impl b(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "");
        SurfaceViewImplementationExternalSyntheticLambda2 surfaceViewImplementationExternalSyntheticLambda2 = new SurfaceViewImplementationExternalSyntheticLambda2(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        return surfaceViewImplementationExternalSyntheticLambda2.sink(new SurfaceViewImplementationExternalSyntheticLambda0(outputStream, surfaceViewImplementationExternalSyntheticLambda2));
    }

    public static final tryToComplete TuitionPaymentFragmentbindingInflater1(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "");
        SurfaceViewImplementationExternalSyntheticLambda2 surfaceViewImplementationExternalSyntheticLambda2 = new SurfaceViewImplementationExternalSyntheticLambda2(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "");
        return surfaceViewImplementationExternalSyntheticLambda2.source(new lambdaanimateToFullOpacity0androidxcameraviewScreenFlashView(inputStream, surfaceViewImplementationExternalSyntheticLambda2));
    }

    public static final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault3(File file, boolean z) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "");
        return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new FileOutputStream(file, z));
    }

    public static final SurfaceViewImplementationApi24Impl TuitionPaymentFragmentspecialinlinedviewModeldefault2(File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "");
        return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new FileOutputStream(file, true));
    }

    public static final tryToComplete TuitionPaymentFragmentbindingInflater1(File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "");
        return new lambdaanimateToFullOpacity0androidxcameraviewScreenFlashView(new FileInputStream(file), cancelPreviousRequest.NONE);
    }

    public static final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(AssertionError assertionError) {
        String message;
        Intrinsics.checkNotNullParameter(assertionError, "");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null)) ? false : true;
    }

    public static final SurfaceViewImplementationApi24Impl b(File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "");
        int iB = zzee.b();
        int iB2 = zzee.b();
        return (SurfaceViewImplementationApi24Impl) SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzee.b(), 892870984, iB2, zzee.b(), -892870984, iB, new Object[]{file});
    }
}

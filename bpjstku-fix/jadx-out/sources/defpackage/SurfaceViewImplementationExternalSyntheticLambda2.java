package defpackage;

import com.google.android.gms.internal.mlkit_vision_face.zzee;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
final class SurfaceViewImplementationExternalSyntheticLambda2 extends ProcessCameraProviderWrapper {
    private final Socket b;

    public SurfaceViewImplementationExternalSyntheticLambda2(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "");
        this.b = socket;
    }

    @Override // defpackage.ProcessCameraProviderWrapper
    protected final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.ProcessCameraProviderWrapper
    protected final void timedOut() {
        try {
            this.b.close();
        } catch (AssertionError e2) {
            int iB = zzee.b();
            int iB2 = zzee.b();
            if (((Boolean) SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzee.b(), -989713985, iB2, zzee.b(), 989713986, iB, new Object[]{e2})).booleanValue()) {
                Logger logger = onAnimationRepeat.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                sb.append(this.b);
                logger.log(level, sb.toString(), (Throwable) e2);
                return;
            }
            throw e2;
        } catch (Exception e3) {
            Logger logger2 = onAnimationRepeat.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Level level2 = Level.WARNING;
            StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
            sb2.append(this.b);
            logger2.log(level2, sb2.toString(), (Throwable) e3);
        }
    }
}

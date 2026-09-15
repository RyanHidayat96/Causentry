package defpackage;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class TextureViewImplementationExternalSyntheticLambda0 {
    private static final ExecutorService onTransact = Executors.newCachedThreadPool();
    boolean TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    lambdatryToProvidePreviewSurface2androidxcameraviewTextureViewImplementation f234a;
    List<ZoomGestureDetector> cancel;
    boolean cancelAll;
    boolean d;
    lambdawaitForNextFrame3androidxcameraviewTextureViewImplementation g;
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
    boolean asInterface = true;
    boolean asBinder = true;
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    ExecutorService b = onTransact;

    TextureViewImplementationExternalSyntheticLambda0() {
    }

    static Object TuitionPaymentFragmentbindingInflater1() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }
}

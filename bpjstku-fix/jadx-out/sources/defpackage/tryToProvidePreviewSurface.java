package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import kotlin.collections.ArraysUtilJVM;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes4.dex */
public final class tryToProvidePreviewSurface extends Handler implements TextureViewImplementationExternalSyntheticLambda4 {
    private final TextureViewImplementationExternalSyntheticLambda1 TuitionPaymentFragmentbindingInflater1;
    private final lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int b;

    protected tryToProvidePreviewSurface(lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation, Looper looper) {
        super(looper);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation;
        this.b = 10;
        this.TuitionPaymentFragmentbindingInflater1 = new TextureViewImplementationExternalSyntheticLambda1();
    }

    @Override // defpackage.TextureViewImplementationExternalSyntheticLambda4
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onSurfaceTextureUpdated onsurfacetextureupdated, Object obj) {
        TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda3B = TextureViewImplementationExternalSyntheticLambda3.b(onsurfacetextureupdated, obj);
        synchronized (this) {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(textureViewImplementationExternalSyntheticLambda3B);
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:3:0x0001, B:4:0x0005, B:6:0x000d, B:16:0x001e, B:17:0x001f, B:19:0x002c, B:20:0x0049, B:22:0x0055, B:25:0x0061, B:26:0x0068, B:7:0x000e), top: B:30:0x0001, inners: #1 }] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation;
        Object obj;
        onSurfaceTextureUpdated onsurfacetextureupdated;
        boolean z = false;
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                TextureViewImplementationExternalSyntheticLambda3 textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                if (textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    synchronized (this) {
                        textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        if (textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                            lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            obj = textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            onsurfacetextureupdated = textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                            TextureViewImplementationExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            if (onsurfacetextureupdated.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1545908961, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, -1545908961, new Object[]{lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation, onsurfacetextureupdated, obj});
                            }
                        }
                    }
                } else {
                    lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    obj = textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    onsurfacetextureupdated = textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                    TextureViewImplementationExternalSyntheticLambda3.TuitionPaymentFragmentbindingInflater1(textureViewImplementationExternalSyntheticLambda3TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (onsurfacetextureupdated.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        lambdatryToProvidePreviewSurface1androidxcameraviewTextureViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault1(ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), 1545908961, ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), ArraysUtilJVM.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault4, -1545908961, new Object[]{lambdatrytoprovidepreviewsurface1androidxcameraviewtextureviewimplementation, onsurfacetextureupdated, obj});
                    }
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            z = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
        } catch (Throwable th) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
            throw th;
        }
    }
}

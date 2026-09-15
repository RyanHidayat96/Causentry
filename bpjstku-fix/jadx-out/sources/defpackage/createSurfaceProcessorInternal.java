package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class createSurfaceProcessorInternal extends CameraControl<AssetFileDescriptor> {
    @Override // defpackage.CameraControl
    protected final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    public createSurfaceProcessorInternal(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final Class<AssetFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.CameraControl
    protected final /* synthetic */ AssetFileDescriptor b(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}

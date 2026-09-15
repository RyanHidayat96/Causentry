package defpackage;

import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class FocusMeteringAction implements Camera<File, File> {
    @Override // defpackage.Camera
    public final /* synthetic */ Resource<File> TuitionPaymentFragmentbindingInflater1(File file, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        return new ExperimentalZeroShutterLag(file);
    }

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(File file, getTargetRotation gettargetrotation) throws IOException {
        return true;
    }
}

package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraControlOperationCanceledException extends CameraEffectFormats<AssetFileDescriptor> {
    @Override // defpackage.CameraEffectFormats
    protected final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    public CameraControlOperationCanceledException(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final Class<AssetFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.CameraEffectFormats
    protected final /* synthetic */ AssetFileDescriptor b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(uri)));
    }
}

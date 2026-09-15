package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getSurfaceProcessor extends CameraEffectFormats<ParcelFileDescriptor> {
    @Override // defpackage.CameraEffectFormats
    protected final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    public getSurfaceProcessor(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final Class<ParcelFileDescriptor> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.CameraEffectFormats
    protected final /* synthetic */ ParcelFileDescriptor b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
            throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(uri)));
        }
        return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
    }
}

package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class findNearestHigherSupportedQualityFor extends FileOutputOptions {
    private static final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 22;
    private AssetManager TuitionPaymentFragmentbindingInflater1;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Object b = new Object();

    public findNearestHigherSupportedQualityFor(Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
    }

    @Override // defpackage.FileOutputOptions
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
        Uri uri = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // defpackage.FileOutputOptions
    public final FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, int i) throws IOException {
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            synchronized (this.b) {
                if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                    this.TuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getAssets();
                }
            }
        }
        return new FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1.open(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault.toString().substring(TuitionPaymentFragmentspecialinlinedviewModeldefault2))), Picasso.LoadedFrom.DISK);
    }
}

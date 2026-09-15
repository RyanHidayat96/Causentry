package defpackage;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class higherQualityThan extends getProfiles {
    public higherQualityThan(Context context) {
        super(context);
    }

    @Override // defpackage.getProfiles, defpackage.FileOutputOptions
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
        return "file".equals(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault.getScheme());
    }

    @Override // defpackage.getProfiles, defpackage.FileOutputOptions
    public final FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, int i) throws IOException {
        return new FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null, SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getContentResolver().openInputStream(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault)), Picasso.LoadedFrom.DISK, new ExifInterface(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault.getPath()).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1));
    }
}

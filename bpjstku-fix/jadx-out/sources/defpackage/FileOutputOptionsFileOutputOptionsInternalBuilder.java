package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class FileOutputOptionsFileOutputOptionsInternalBuilder extends FileOutputOptions {
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public FileOutputOptionsFileOutputOptionsInternalBuilder(Context context) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
    }

    @Override // defpackage.FileOutputOptions
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
        if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.cancel != 0) {
            return true;
        }
        return "android.resource".equals(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault.getScheme());
    }

    @Override // defpackage.FileOutputOptions
    public final FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, int i) throws IOException {
        Resources resourcesB = outputFormatToMuxerFormat.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);
        return new FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault2(resourcesB, outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(resourcesB, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder), fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder), Picasso.LoadedFrom.DISK);
    }

    private static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(Resources resources, int i, FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
        BitmapFactory.Options optionsB = b(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);
        if (optionsB != null && optionsB.inJustDecodeBounds) {
            BitmapFactory.decodeResource(resources, i, optionsB);
            FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.RemoteActionCompatParcelizer, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.getInterfaceDescriptor, optionsB.outWidth, optionsB.outHeight, optionsB, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);
        }
        return BitmapFactory.decodeResource(resources, i, optionsB);
    }
}

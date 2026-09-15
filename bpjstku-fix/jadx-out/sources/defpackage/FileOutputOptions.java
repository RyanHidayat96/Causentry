package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FileOutputOptions {
    protected int TuitionPaymentFragmentbindingInflater1() {
        return 0;
    }

    public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, int i) throws IOException;

    public abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);

    protected boolean b() {
        return false;
    }

    protected boolean b(NetworkInfo networkInfo) {
        return false;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        final tryToComplete TuitionPaymentFragmentbindingInflater1;
        final Picasso.LoadedFrom TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final Bitmap b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) outputFormatToMuxerFormat.b(bitmap, "bitmap == null"), null, loadedFrom, 0);
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(tryToComplete trytocomplete, Picasso.LoadedFrom loadedFrom) {
            this(null, (tryToComplete) outputFormatToMuxerFormat.b(trytocomplete, "source == null"), loadedFrom, 0);
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap bitmap, tryToComplete trytocomplete, Picasso.LoadedFrom loadedFrom, int i) {
            if ((bitmap != null) == (trytocomplete != null)) {
                throw new AssertionError();
            }
            this.b = bitmap;
            this.TuitionPaymentFragmentbindingInflater1 = trytocomplete;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (Picasso.LoadedFrom) outputFormatToMuxerFormat.b(loadedFrom, "loadedFrom == null");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        }
    }

    protected static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, BitmapFactory.Options options, FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
        int iMin;
        double dFloor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                dFloor = Math.floor(i3 / i);
            } else if (i == 0) {
                dFloor = Math.floor(i4 / i2);
            } else {
                int iFloor = (int) Math.floor(i4 / i2);
                int iFloor2 = (int) Math.floor(i3 / i);
                if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    iMin = Math.max(iFloor, iFloor2);
                } else {
                    iMin = Math.min(iFloor, iFloor2);
                }
            }
            iMin = (int) dFloor;
        } else {
            iMin = 1;
        }
        options.inSampleSize = iMin;
        options.inJustDecodeBounds = false;
    }

    protected static BitmapFactory.Options b(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
        boolean z = (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.RemoteActionCompatParcelizer == 0 && fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.getInterfaceDescriptor == 0) ? false : true;
        boolean z2 = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentbindingInflater1 != null;
        if (!z && !z2 && !fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.g) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = z;
        options.inInputShareable = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.g;
        options.inPurgeable = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.g;
        if (z2) {
            options.inPreferredConfig = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentbindingInflater1;
        }
        return options;
    }
}

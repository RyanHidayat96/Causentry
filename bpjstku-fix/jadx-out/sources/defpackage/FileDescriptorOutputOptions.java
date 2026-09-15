package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: loaded from: classes4.dex */
public final class FileDescriptorOutputOptions implements isQualitySupported {
    private LruCache<String, TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentbindingInflater1;

    public FileDescriptorOutputOptions(Context context) {
        this(outputFormatToMuxerFormat.b(context));
    }

    private FileDescriptorOutputOptions(int i) {
        this.TuitionPaymentFragmentbindingInflater1 = new LruCache<String, TuitionPaymentFragmentspecialinlinedviewModeldefault2>(i) { // from class: FileDescriptorOutputOptions.4
            @Override // android.util.LruCache
            protected final /* synthetic */ int sizeOf(String str, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        };
    }

    @Override // defpackage.isQualitySupported
    public final Bitmap TuitionPaymentFragmentbindingInflater1(String str) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1.get(str);
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        return null;
    }

    @Override // defpackage.isQualitySupported
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int iB = outputFormatToMuxerFormat.b(bitmap);
        if (iB > this.TuitionPaymentFragmentbindingInflater1.maxSize()) {
            this.TuitionPaymentFragmentbindingInflater1.remove(str);
        } else {
            this.TuitionPaymentFragmentbindingInflater1.put(str, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmap, iB));
        }
    }

    @Override // defpackage.isQualitySupported
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentbindingInflater1.size();
    }

    @Override // defpackage.isQualitySupported
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentbindingInflater1.maxSize();
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bitmap bitmap, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bitmap;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        }
    }
}

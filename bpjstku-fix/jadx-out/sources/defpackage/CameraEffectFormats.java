package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CameraEffectFormats<T> implements isUseCasesCombinationSupportedByFramework<T> {
    private T TuitionPaymentFragmentbindingInflater1;
    private final ContentResolver TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Uri TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
    }

    protected abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault3(T t) throws IOException;

    protected abstract T b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    public CameraEffectFormats(ContentResolver contentResolver, Uri uri) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = contentResolver;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = uri;
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super T> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        try {
            T tB = b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            this.TuitionPaymentFragmentbindingInflater1 = tB;
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tB);
        } catch (FileNotFoundException e2) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
        }
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void b() {
        T t = this.TuitionPaymentFragmentbindingInflater1;
        if (t != null) {
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final DataSource TuitionPaymentFragmentbindingInflater1() {
        return DataSource.LOCAL;
    }
}

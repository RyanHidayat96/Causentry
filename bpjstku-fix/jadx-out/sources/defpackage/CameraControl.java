package defpackage;

import android.content.res.AssetManager;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CameraControl<T> implements isUseCasesCombinationSupportedByFramework<T> {
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private T TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final AssetManager b;

    protected abstract void TuitionPaymentFragmentbindingInflater1(T t) throws IOException;

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
    }

    protected abstract T b(AssetManager assetManager, String str) throws IOException;

    public CameraControl(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super T> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        try {
            T tB = b(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tB;
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tB);
        } catch (IOException e2) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2);
        }
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void b() {
        T t = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (t != null) {
            try {
                TuitionPaymentFragmentbindingInflater1(t);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final DataSource TuitionPaymentFragmentbindingInflater1() {
        return DataSource.LOCAL;
    }
}

package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@getExtraEncoderProfiles
public abstract class decrementRetryCounter implements Closeable {

    interface TuitionPaymentFragmentbindingInflater1 {
        decrementRetryCounter TuitionPaymentFragmentbindingInflater1();

        TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context);
    }

    abstract AutoValue_StreamSpec1 TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public abstract TakePictureManager1 TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    decrementRetryCounter() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1().close();
    }
}

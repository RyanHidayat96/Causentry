package defpackage;

import com.bpjstku.data.digitalcard.model.request.DigitalCardImageRequest;
import com.bpjstku.domain.digitalcard.downloader.DataFetcherException;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class onBackPressedDispatcher_delegatelambda0 implements isUseCasesCombinationSupportedByFramework<InputStream> {
    private final DigitalCardImageRequest TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final ensureViewModelStore TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
    }

    public onBackPressedDispatcher_delegatelambda0(DigitalCardImageRequest digitalCardImageRequest, ensureViewModelStore ensureviewmodelstore) {
        Intrinsics.checkNotNullParameter(digitalCardImageRequest, "");
        Intrinsics.checkNotNullParameter(ensureviewmodelstore, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = digitalCardImageRequest;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ensureviewmodelstore;
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final Class<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return InputStream.class;
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void b() throws IOException {
        InputStream inputStream = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final DataSource TuitionPaymentFragmentbindingInflater1() {
        return DataSource.REMOTE;
    }

    @Override // defpackage.isUseCasesCombinationSupportedByFramework
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super InputStream> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        InputStream inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(inputStreamTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new DataFetcherException("Unable to fetch the image data"));
        }
    }
}

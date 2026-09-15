package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class setMinLogLevel implements MetadataImageReader {
    private final MetadataImageReader[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public setMinLogLevel(MetadataImageReader... metadataImageReaderArr) {
        Intrinsics.checkNotNullParameter(metadataImageReaderArr, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = metadataImageReaderArr;
    }

    @Override // defpackage.MetadataImageReader
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        for (MetadataImageReader metadataImageReader : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            metadataImageReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, z);
        }
    }
}

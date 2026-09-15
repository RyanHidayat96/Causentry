package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class copyBitmapToByteBuffer implements copyByteBufferToBitmap {
    private final AtomicReference<String> TuitionPaymentFragmentbindingInflater1;

    public copyBitmapToByteBuffer(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentbindingInflater1 = new AtomicReference<>(str);
    }

    @Override // defpackage.copyByteBufferToBitmap
    public final String b() {
        String str = this.TuitionPaymentFragmentbindingInflater1.get();
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @Override // defpackage.copyByteBufferToBitmap
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentbindingInflater1.set(str);
    }
}

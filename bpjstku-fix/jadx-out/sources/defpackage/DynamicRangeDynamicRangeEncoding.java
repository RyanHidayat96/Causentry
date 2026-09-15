package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class DynamicRangeDynamicRangeEncoding implements getOutputOption<ByteBuffer> {
    private final ByteBuffer TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.getOutputOption
    public final void TuitionPaymentFragmentbindingInflater1() {
    }

    public DynamicRangeDynamicRangeEncoding(ByteBuffer byteBuffer) {
        this.TuitionPaymentFragmentbindingInflater1 = byteBuffer;
    }

    public static class b implements getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<ByteBuffer> {
        @Override // getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ getOutputOption<ByteBuffer> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ByteBuffer byteBuffer) {
            return new DynamicRangeDynamicRangeEncoding(byteBuffer);
        }

        @Override // getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final Class<ByteBuffer> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return ByteBuffer.class;
        }
    }

    @Override // defpackage.getOutputOption
    public final /* synthetic */ ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
        this.TuitionPaymentFragmentbindingInflater1.position(0);
        return this.TuitionPaymentFragmentbindingInflater1;
    }
}

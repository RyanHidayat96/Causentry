package defpackage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes3.dex */
public final class setDynamicRange implements setMaxResolution<Drawable> {
    private final boolean TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private setOnePixelShiftEnabled TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    protected setDynamicRange(int i, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.TuitionPaymentFragmentbindingInflater1 = z;
    }

    @Override // defpackage.setMaxResolution
    public final setImageQueueDepth<Drawable> TuitionPaymentFragmentspecialinlinedviewModeldefault1(DataSource dataSource) {
        if (dataSource == DataSource.MEMORY_CACHE) {
            return setOutputImageFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new setOnePixelShiftEnabled(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1);
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static class b {
        private final int TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public b() {
            this((byte) 0);
        }

        private b(byte b) {
            this.TuitionPaymentFragmentbindingInflater1 = 300;
        }

        public final setDynamicRange TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new setDynamicRange(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }
}

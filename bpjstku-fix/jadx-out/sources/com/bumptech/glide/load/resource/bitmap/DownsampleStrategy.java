package com.bumptech.glide.load.resource.bitmap;

import defpackage.isMirroring;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DownsampleStrategy {
    public static final DownsampleStrategy TuitionPaymentFragmentbindingInflater1;
    public static final DownsampleStrategy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static final DownsampleStrategy TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public static final DownsampleStrategy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static final isMirroring<DownsampleStrategy> asInterface;
    static final boolean b;
    public static final DownsampleStrategy g;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    public abstract float TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4);

    public abstract SampleSizeRounding b(int i, int i2, int i3, int i4);

    static {
        new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1();
        b bVar = new b();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar;
        g = new g();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar;
        asInterface = isMirroring.TuitionPaymentFragmentbindingInflater1("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
        b = true;
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends DownsampleStrategy {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4) {
            if (b) {
                return Math.min(i3 / i, i4 / i2);
            }
            int iMax = Math.max(i2 / i4, i / i3);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding b(int i, int i2, int i3, int i4) {
            if (b) {
                return SampleSizeRounding.QUALITY;
            }
            return SampleSizeRounding.MEMORY;
        }
    }

    static class b extends DownsampleStrategy {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends DownsampleStrategy {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i2 / i4, i / i3);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends DownsampleStrategy {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }
    }

    static class g extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4) {
            return 1.0f;
        }

        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    static class TuitionPaymentFragmentbindingInflater1 extends DownsampleStrategy {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final float TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(i, i2, i3, i4));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public final SampleSizeRounding b(int i, int i2, int i3, int i4) {
            if (Math.min(1.0f, TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(i, i2, i3, i4)) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(i, i2, i3, i4);
        }
    }
}

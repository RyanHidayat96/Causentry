package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageInputConfig {
    final float TuitionPaymentFragmentbindingInflater1;
    final float TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final float TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final float TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float f155a;
    final float asBinder;
    final float asInterface;
    final float b;
    final float g;

    private ImageInputConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = f;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = f4;
        this.b = f7;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f2;
        this.TuitionPaymentFragmentbindingInflater1 = f5;
        this.asBinder = f8;
        this.asInterface = f3;
        this.g = f6;
        this.f155a = f9;
    }

    private static ImageInputConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new ImageInputConfig(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new ImageInputConfig((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f4 - f2) + (f16 * f4), (f8 - f2) + (f17 * f8), f2, f16, f17, 1.0f);
    }

    private ImageInputConfig b() {
        float f = this.TuitionPaymentFragmentbindingInflater1;
        float f2 = this.f155a;
        float f3 = this.asBinder;
        float f4 = this.g;
        float f5 = this.asInterface;
        float f6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float f7 = this.b;
        float f8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return new ImageInputConfig((f * f2) - (f3 * f4), (f3 * f5) - (f6 * f2), (f6 * f4) - (f * f5), (f7 * f4) - (f8 * f2), (f2 * f9) - (f7 * f5), (f5 * f8) - (f4 * f9), (f8 * f3) - (f7 * f), (f7 * f6) - (f3 * f9), (f9 * f) - (f8 * f6));
    }

    private ImageInputConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageInputConfig imageInputConfig) {
        float f = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        float f2 = imageInputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        float f3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float f4 = imageInputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f5 = this.asInterface;
        float f6 = imageInputConfig.b;
        float f7 = imageInputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float f8 = imageInputConfig.TuitionPaymentFragmentbindingInflater1;
        float f9 = imageInputConfig.asBinder;
        float f10 = imageInputConfig.asInterface;
        float f11 = imageInputConfig.g;
        float f12 = imageInputConfig.f155a;
        float f13 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f14 = this.TuitionPaymentFragmentbindingInflater1;
        float f15 = this.g;
        float f16 = this.b;
        float f17 = this.asBinder;
        float f18 = this.f155a;
        return new ImageInputConfig((f * f2) + (f3 * f4) + (f5 * f6), (f * f7) + (f3 * f8) + (f5 * f9), (f * f10) + (f3 * f11) + (f5 * f12), (f13 * f2) + (f14 * f4) + (f15 * f6), (f13 * f7) + (f14 * f8) + (f15 * f9), (f13 * f10) + (f14 * f11) + (f15 * f12), (f2 * f16) + (f4 * f17) + (f6 * f18), (f16 * f7) + (f8 * f17) + (f9 * f18), (f16 * f10) + (f17 * f11) + (f18 * f12));
    }

    public static ImageInputConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(f9, f10, f11, f12, f13, f14, f15, f16).TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3(f, f2, f3, f4, f5, f6, f7, f8).b());
    }
}

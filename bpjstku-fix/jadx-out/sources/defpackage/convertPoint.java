package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes3.dex */
public final class convertPoint implements Resource<BitmapDrawable>, requireLensFacing {
    private final Resource<Bitmap> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Resources TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static Resource<BitmapDrawable> TuitionPaymentFragmentbindingInflater1(Resources resources, Resource<Bitmap> resource) {
        if (resource == null) {
            return null;
        }
        return new convertPoint(resources, resource);
    }

    private convertPoint(Resources resources, Resource<Bitmap> resource) {
        if (resources == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = resources;
        if (resource == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = resource;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class<BitmapDrawable> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.requireLensFacing
    public final void b() {
        Resource<Bitmap> resource = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (resource instanceof requireLensFacing) {
            ((requireLensFacing) resource).b();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final /* bridge */ /* synthetic */ BitmapDrawable TuitionPaymentFragmentbindingInflater1() {
        return new BitmapDrawable(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1());
    }
}

package com.bumptech.glide.request;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Transformation;
import defpackage.CameraSelector;
import defpackage.getCameraControl;

/* JADX INFO: loaded from: classes3.dex */
public class RequestOptions extends BaseRequestOptions<RequestOptions> {
    public static RequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraSelector cameraSelector) {
        return new RequestOptions().b(cameraSelector);
    }

    public static RequestOptions b(int i) {
        return new RequestOptions().TuitionPaymentFragmentbindingInflater1(i);
    }

    public static RequestOptions b(getCameraControl getcameracontrol) {
        return new RequestOptions().TuitionPaymentFragmentspecialinlinedviewModeldefault2(getcameracontrol);
    }

    public static RequestOptions bitmapTransform(Transformation<Bitmap> transformation) {
        return new RequestOptions().TuitionPaymentFragmentspecialinlinedviewModeldefault1(transformation);
    }

    public static RequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(Class<?> cls) {
        return new RequestOptions().TuitionPaymentFragmentspecialinlinedviewModeldefault3(cls);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public boolean equals(Object obj) {
        return (obj instanceof RequestOptions) && super.equals(obj);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public int hashCode() {
        return super.hashCode();
    }
}

package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bpjstku.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;
import com.esafirm.imagepicker.features.imageloader.ImageType;

/* JADX INFO: loaded from: classes3.dex */
public final class acceptProcessingRequest implements JpegImage2Result {
    @Override // defpackage.JpegImage2Result
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, ImageView imageView, ImageType imageType) {
        RequestBuilder<Drawable> requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageView.getContext()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
        ImageType imageType2 = ImageType.FOLDER;
        int i = R.drawable.ef_folder_placeholder;
        RequestOptions requestOptionsB = RequestOptions.b(imageType == imageType2 ? R.drawable.ef_folder_placeholder : R.drawable.ef_image_placeholder);
        if (imageType != ImageType.FOLDER) {
            i = R.drawable.ef_image_placeholder;
        }
        RequestBuilder<Drawable> requestBuilderApply = requestBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.apply(requestOptionsB.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i));
        ExperimentalImageCaptureOutputFormat experimentalImageCaptureOutputFormat = new ExperimentalImageCaptureOutputFormat();
        setDynamicRange setdynamicrangeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = new setDynamicRange.b().TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (setdynamicrangeTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            experimentalImageCaptureOutputFormat.TuitionPaymentFragmentbindingInflater1 = setdynamicrangeTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            requestBuilderApply.b(experimentalImageCaptureOutputFormat).into(imageView);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }
}

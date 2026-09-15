package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.esafirm.imagepicker.features.imageloader.ImageType;
import com.esafirm.imagepicker.model.Image;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ImagePipeline extends shouldEnablePostview<TuitionPaymentFragmentspecialinlinedviewModeldefault3> {
    public List<Image> TuitionPaymentFragmentbindingInflater1;
    public List<Image> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private ProcessingNode TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public getRotatedSize b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        boolean z;
        final boolean z2;
        String string;
        boolean z3;
        String mimeTypeFromExtension;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) viewHolder;
        final Image image = this.TuitionPaymentFragmentbindingInflater1.get(i);
        Iterator<Image> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z2 = false;
                break;
            } else if (it.next().TuitionPaymentFragmentbindingInflater1.equals(image.TuitionPaymentFragmentbindingInflater1)) {
                z2 = true;
                break;
            }
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2(image.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ImageType.GALLERY);
        if (!createPacket.TuitionPaymentFragmentspecialinlinedviewModeldefault3(image.TuitionPaymentFragmentbindingInflater1).equalsIgnoreCase("gif")) {
            string = "";
            z3 = false;
        } else {
            string = b().getResources().getString(R.string.ef_gif);
            z3 = true;
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = createPacket.TuitionPaymentFragmentspecialinlinedviewModeldefault3(image.TuitionPaymentFragmentbindingInflater1);
        if (TextUtils.isEmpty(strTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            mimeTypeFromExtension = URLConnection.guessContentTypeFromName(image.TuitionPaymentFragmentbindingInflater1);
        } else {
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        if (mimeTypeFromExtension == null || !mimeTypeFromExtension.startsWith("video")) {
            z = z3;
        } else {
            string = b().getResources().getString(R.string.ef_video);
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setText(string);
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setVisibility(z ? 0 : 8);
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.setAlpha(z2 ? 0.5f : 0.0f);
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.itemView.setOnClickListener(new View.OnClickListener() { // from class: getCameraRequestJpegQuality
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImagePipeline.b(this.TuitionPaymentFragmentbindingInflater1, z2, image, i, view);
            }
        });
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b.setForeground(z2 ? ContextCompat.getDrawable(b(), 2131231046) : null);
    }

    public ImagePipeline(Context context, JpegImage2Result jpegImage2Result, List<Image> list, ProcessingNode processingNode) {
        super(context, jpegImage2Result);
        this.TuitionPaymentFragmentbindingInflater1 = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = processingNode;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.TuitionPaymentFragmentbindingInflater1.size();
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends RecyclerView.ViewHolder {
        private View TuitionPaymentFragmentbindingInflater1;
        private TextView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private ImageView TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private FrameLayout b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
            super(view);
            this.b = (FrameLayout) view;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (ImageView) view.findViewById(R.id.image_view);
            this.TuitionPaymentFragmentbindingInflater1 = view.findViewById(R.id.view_alpha);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TextView) view.findViewById(R.id.ef_item_file_type_indicator);
        }
    }

    public static /* synthetic */ void b(final ImagePipeline imagePipeline, boolean z, final Image image, final int i, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            boolean zTuitionPaymentFragmentbindingInflater1 = imagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(z);
            if (z) {
                new Runnable() { // from class: expectsMetadata
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImagePipeline imagePipeline2 = this.TuitionPaymentFragmentbindingInflater1;
                        Image image2 = image;
                        int i2 = i;
                        imagePipeline2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(image2);
                        imagePipeline2.notifyItemChanged(i2);
                    }
                }.run();
                getRotatedSize getrotatedsize = imagePipeline.b;
                if (getrotatedsize != null) {
                    getrotatedsize.b(imagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            } else if (zTuitionPaymentFragmentbindingInflater1) {
                new Runnable() { // from class: createSessionConfigBuilder
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImagePipeline imagePipeline2 = this.b;
                        Image image2 = image;
                        int i2 = i;
                        imagePipeline2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(image2);
                        imagePipeline2.notifyItemChanged(i2);
                    }
                }.run();
                getRotatedSize getrotatedsize2 = imagePipeline.b;
                if (getrotatedsize2 != null) {
                    getrotatedsize2.b(imagePipeline.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1().inflate(R.layout.ef_imagepicker_item_image, viewGroup, false));
    }
}

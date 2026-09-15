package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.esafirm.imagepicker.features.imageloader.ImageType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class createProcessingRequest extends shouldEnablePostview<TuitionPaymentFragmentspecialinlinedviewModeldefault1> {
    private final getCameraCaptureResult TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public List<lambdaprocessInputPacket5> b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TuitionPaymentFragmentspecialinlinedviewModeldefault1) viewHolder;
        final lambdaprocessInputPacket5 lambdaprocessinputpacket5 = this.b.get(i);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaprocessinputpacket5.b().get(0).TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ImageType.FOLDER);
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setText(this.b.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setText(String.valueOf(this.b.get(i).b().size()));
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.itemView.setOnClickListener(new View.OnClickListener() { // from class: createCameraRequest
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                createProcessingRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, lambdaprocessinputpacket5, view);
            }
        });
    }

    public createProcessingRequest(Context context, JpegImage2Result jpegImage2Result, getCameraCaptureResult getcameracaptureresult) {
        super(context, jpegImage2Result);
        this.b = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getcameracaptureresult;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends RecyclerView.ViewHolder {
        private TextView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private ImageView TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private TextView TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view) {
            super(view);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (ImageView) view.findViewById(R.id.image);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TextView) view.findViewById(R.id.tv_name);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TextView) view.findViewById(R.id.tv_number);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(createProcessingRequest createprocessingrequest, lambdaprocessInputPacket5 lambdaprocessinputpacket5, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getCameraCaptureResult getcameracaptureresult = createprocessingrequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (getcameracaptureresult != null) {
                getcameracaptureresult.b(lambdaprocessinputpacket5);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1().inflate(R.layout.ef_imagepicker_item_folder, viewGroup, false));
    }
}

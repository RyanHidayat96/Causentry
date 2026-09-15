package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class VirtualCameraInfo<Data> extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private final setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final setVirtualCameraRotationDegrees.b TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Data data);

    public VirtualCameraInfo(Context context, View view, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        super(view);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                getAdapterPosition();
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            return false;
        }
        getAdapterPosition();
        return true;
    }
}

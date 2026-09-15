package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class failInFlightUpdate<Data> extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2 b;

    public abstract void TuitionPaymentFragmentbindingInflater1(Data data);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public failInFlightUpdate(Context context, View view, clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, clearCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
        super(view);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Intrinsics.checkNotNullParameter(view, "");
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                getAdapterPosition();
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (this.b == null) {
            return false;
        }
        getAdapterPosition();
        return true;
    }
}

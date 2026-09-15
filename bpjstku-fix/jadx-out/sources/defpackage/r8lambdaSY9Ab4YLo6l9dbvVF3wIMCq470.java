package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470<Data> extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    private final addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final addCaptureRequestOptionsInternal.b b;

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Data data);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470(Context context, View view, addCaptureRequestOptionsInternal.b bVar, addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        super(view);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
        this.b = bVar;
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            Intrinsics.checkNotNullParameter(view, "");
            if (this.b != null) {
                getAdapterPosition();
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            return false;
        }
        getAdapterPosition();
        return true;
    }
}

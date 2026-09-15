package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class shouldEnablePostview<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T> {
    private final LayoutInflater TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final JpegImage2Result b;

    public shouldEnablePostview(Context context, JpegImage2Result jpegImage2Result) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LayoutInflater.from(context);
        this.b = jpegImage2Result;
    }

    public final JpegImage2Result TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.b;
    }

    public final Context b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final LayoutInflater TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}

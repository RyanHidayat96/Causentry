package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.failInFlightUpdate;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class clearCaptureRequestOptionsInternal<Data, Holder extends failInFlightUpdate> extends RecyclerView.Adapter<Holder> {
    public final List<Data> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f357a;
    public TuitionPaymentFragmentspecialinlinedviewModeldefault3 asBinder;
    private Context asInterface;
    public setActiveInternal b;
    public TuitionPaymentFragmentbindingInflater1 d;
    public TuitionPaymentFragmentspecialinlinedviewModeldefault2 g;
    public Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Boolean.TRUE;
    public Integer TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    public Integer TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 10;

    public interface TuitionPaymentFragmentbindingInflater1 {
        void TuitionPaymentFragmentbindingInflater1(Integer num);

        void g();
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public abstract Holder onCreateViewHolder(ViewGroup viewGroup, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((failInFlightUpdate) viewHolder).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.get(i));
    }

    public clearCaptureRequestOptionsInternal(Context context, List<Data> list) {
        this.asInterface = context;
        this.TuitionPaymentFragmentbindingInflater1 = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        try {
            return this.TuitionPaymentFragmentbindingInflater1.size();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.d;
    }

    public final void TuitionPaymentFragmentbindingInflater1(List<Data> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Data data = list.get(i);
            int iIndexOf = this.TuitionPaymentFragmentbindingInflater1.indexOf(data);
            if (iIndexOf >= 0) {
                this.TuitionPaymentFragmentbindingInflater1.set(iIndexOf, data);
            } else {
                this.TuitionPaymentFragmentbindingInflater1.add(data);
                notifyItemInserted(this.TuitionPaymentFragmentbindingInflater1.size() - 1);
            }
        }
        notifyDataSetChanged();
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        List<Data> list = this.TuitionPaymentFragmentbindingInflater1;
        if (list.get(list.size() - 1) == null) {
            List<Data> list2 = this.TuitionPaymentFragmentbindingInflater1;
            list2.remove(list2.size() - 1);
            notifyItemRemoved(this.TuitionPaymentFragmentbindingInflater1.size() - 1);
            this.f357a.addOnScrollListener(this.b);
        }
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(clearCaptureRequestOptionsInternal clearcapturerequestoptionsinternal) {
        clearcapturerequestoptionsinternal.f357a.removeOnScrollListener(clearcapturerequestoptionsinternal.b);
    }
}

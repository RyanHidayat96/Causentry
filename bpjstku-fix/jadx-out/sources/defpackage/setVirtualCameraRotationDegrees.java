package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.VirtualCameraInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setVirtualCameraRotationDegrees<Data, Holder extends VirtualCameraInfo> extends RecyclerView.Adapter<Holder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f1400a;
    public Context asBinder;
    public TuitionPaymentFragmentspecialinlinedviewModeldefault2 asInterface;
    public List<Data> d;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    }

    public interface b {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public abstract Holder onCreateViewHolder(ViewGroup viewGroup, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((VirtualCameraInfo) viewHolder).TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.d.get(i));
    }

    public setVirtualCameraRotationDegrees(Context context, List<Data> list) {
        this.asBinder = context;
        this.d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        try {
            return this.d.size();
        } catch (Exception unused) {
            return 0;
        }
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<Data> list) {
        b(list);
    }

    public final void b(List<Data> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.d.add(list.get(i));
        }
        notifyDataSetChanged();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<Data> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Data data = list.get(i);
            int iIndexOf = this.d.indexOf(data);
            if (iIndexOf >= 0) {
                this.d.set(iIndexOf, data);
            } else {
                this.d.add(data);
                notifyItemInserted(this.d.size() - 1);
            }
        }
        notifyDataSetChanged();
    }
}

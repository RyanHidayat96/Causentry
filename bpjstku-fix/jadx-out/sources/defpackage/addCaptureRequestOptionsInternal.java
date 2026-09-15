package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class addCaptureRequestOptionsInternal<Data, Holder extends r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470> extends RecyclerView.Adapter<Holder> {
    public final List<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Camera2CameraControl f253a;
    public TuitionPaymentFragmentspecialinlinedviewModeldefault3 asBinder;
    public RecyclerView asInterface;
    public b d;
    public TuitionPaymentFragmentbindingInflater1 g;
    private Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Boolean.TRUE;
    public Integer b = 0;
    public Integer TuitionPaymentFragmentbindingInflater1 = 10;

    public interface TuitionPaymentFragmentbindingInflater1 {
        void TuitionPaymentFragmentbindingInflater1(Integer num, RecyclerView recyclerView);

        void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer num);
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
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
        ((r8lambdaSY9Ab4YLo6l9dbvVF3wIMCq470) viewHolder).TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i));
    }

    public final Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public addCaptureRequestOptionsInternal(Context context, List<Data> list) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        try {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.g;
    }

    public final void b(List<Data> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(list.get(i));
        }
        notifyDataSetChanged();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(List<Data> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Data data = list.get(i);
            int iIndexOf = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.indexOf(data);
            if (iIndexOf >= 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(iIndexOf, data);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(data);
                notifyItemInserted(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 1);
            }
        }
        notifyDataSetChanged();
    }

    public final void g() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Boolean.TRUE;
        List<Data> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (list.get(list.size() - 1) == null) {
            notifyItemChanged(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 1);
        } else {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(null);
            notifyDataSetChanged();
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RecyclerView recyclerView) {
        this.asInterface = recyclerView;
        Camera2CameraControl camera2CameraControl = new Camera2CameraControl() { // from class: addCaptureRequestOptionsInternal.4
            @Override // defpackage.Camera2CameraControl
            public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return addCaptureRequestOptionsInternal.this.TuitionPaymentFragmentbindingInflater1.intValue();
            }

            @Override // defpackage.Camera2CameraControl
            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, RecyclerView recyclerView2) {
                addCaptureRequestOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3(addCaptureRequestOptionsInternal.this);
                addCaptureRequestOptionsInternal.this.g.TuitionPaymentFragmentbindingInflater1(Integer.valueOf(i), recyclerView2);
                addCaptureRequestOptionsInternal.this.b = Integer.valueOf(i);
                addCaptureRequestOptionsInternal.this.TuitionPaymentFragmentbindingInflater1 = Integer.valueOf(i2);
            }
        };
        this.f253a = camera2CameraControl;
        camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1((RecyclerView.LayoutManager) Objects.requireNonNull(recyclerView.getLayoutManager()));
    }

    public final void b() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Boolean.FALSE;
        this.asInterface.removeOnScrollListener(this.f253a);
        List<Data> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (list.get(list.size() - 1) == null) {
            notifyItemChanged(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 1);
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        List<Data> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (list.get(list.size() - 1) == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove((Object) null);
            notifyItemRemoved(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 1);
            this.asInterface.removeOnScrollListener(this.f253a);
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        List<Data> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (list.get(list.size() - 1) == null) {
            List<Data> list2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            list2.remove(list2.size() - 1);
            notifyItemRemoved(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size() - 1);
            this.asInterface.addOnScrollListener(this.f253a);
        }
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(addCaptureRequestOptionsInternal addcapturerequestoptionsinternal) {
        addcapturerequestoptionsinternal.asInterface.removeOnScrollListener(addcapturerequestoptionsinternal.f253a);
    }
}

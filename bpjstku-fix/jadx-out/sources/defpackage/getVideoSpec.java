package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class getVideoSpec extends RecyclerView.Adapter<TuitionPaymentFragmentspecialinlinedviewModeldefault2> {
    public List<? extends Place> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Function1<Place, Unit> b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) viewHolder;
        final Place place = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i);
        final Function1<Place, Unit> function1 = this.b;
        View view = tuitionPaymentFragmentspecialinlinedviewModeldefault2.itemView;
        view.setOnClickListener(new View.OnClickListener() { // from class: getVideoSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault2.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    function1.invoke(place);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        ImageView imageView = (ImageView) view.findViewById(R.id.ivPlaceType);
        AutoValue_MediaSpecBuilder autoValue_MediaSpecBuilder = AutoValue_MediaSpecBuilder.INSTANCE;
        View view2 = tuitionPaymentFragmentspecialinlinedviewModeldefault2.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "");
        Context context = view2.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "");
        imageView.setImageResource(AutoValue_MediaSpecBuilder.b(context, place));
        TextView textView = (TextView) view.findViewById(R.id.tvPlaceName);
        Intrinsics.checkExpressionValueIsNotNull(textView, "");
        textView.setText(place.getName());
        TextView textView2 = (TextView) view.findViewById(R.id.tvPlaceAddress);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "");
        textView2.setText(place.getAddress());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getVideoSpec(List<? extends Place> list, Function1<? super Place, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        this.b = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends RecyclerView.ViewHolder {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view) {
            super(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_place, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(viewInflate, "");
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(viewInflate);
    }
}

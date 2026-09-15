package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.bpjstku.R;
import com.midtrans.sdk.uikit.models.CountryCodeModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class getServiceComponent extends ArrayAdapter<CountryCodeModel> {
    private int TuitionPaymentFragmentbindingInflater1;
    private ArrayList<CountryCodeModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Filter TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getServiceComponent(Context context, int i, ArrayList<CountryCodeModel> arrayList) {
        super(context, R.layout.layout_row_country_code);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        this.TuitionPaymentFragmentbindingInflater1 = R.layout.layout_row_country_code;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arrayList;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.TuitionPaymentFragmentbindingInflater1, viewGroup, false);
        }
        CountryCodeModel item = getItem(i);
        ((TextView) view.findViewById(R.id.text_country_name_row)).setText(item.name);
        view.setTag(item);
        return view;
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends Filter {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // android.widget.Filter
        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            if (charSequence == null) {
                return new Filter.FilterResults();
            }
            ArrayList arrayList = new ArrayList();
            for (CountryCodeModel countryCodeModel : getServiceComponent.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                if (countryCodeModel.name.toLowerCase().startsWith(charSequence.toString().toLowerCase())) {
                    arrayList.add(countryCodeModel);
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            getServiceComponent.this.clear();
            if (filterResults != null && filterResults.count > 0) {
                getServiceComponent.this.addAll((ArrayList) filterResults.values);
            }
            getServiceComponent.this.notifyDataSetChanged();
        }

        @Override // android.widget.Filter
        public final /* synthetic */ CharSequence convertResultToString(Object obj) {
            return ((CountryCodeModel) obj).name;
        }
    }
}

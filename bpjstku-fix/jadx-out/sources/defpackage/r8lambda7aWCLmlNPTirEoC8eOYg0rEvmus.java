package defpackage;

import com.bpjstku.data.country.CountryRepository;
import com.bpjstku.data.country.model.response.CountryItem;
import com.bpjstku.domain.general.model.CodeNamePair;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus implements r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 {
    private final CountryRepository TuitionPaymentFragmentbindingInflater1;

    public r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(CountryRepository countryRepository) {
        Intrinsics.checkNotNullParameter(countryRepository, "");
        this.TuitionPaymentFragmentbindingInflater1 = countryRepository;
    }

    @Override // defpackage.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
    public final deriveCodec<List<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        deriveCodec<List<CountryItem>> country = this.TuitionPaymentFragmentbindingInflater1.getCountry();
        final Function1 function1 = new Function1() { // from class: r8lambda7IJBVrN0sHyidCAZufWEJFc7yY
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.TuitionPaymentFragmentbindingInflater1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(country, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<CountryItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (CountryItem countryItem : list2) {
            Intrinsics.checkNotNullParameter(countryItem, "");
            arrayList.add(new CodeNamePair(countryItem.getDialCode(), countryItem.getName()));
        }
        return arrayList;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }
}

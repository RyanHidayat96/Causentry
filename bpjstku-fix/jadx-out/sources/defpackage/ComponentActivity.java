package defpackage;

import com.bpjstku.data.office.model.response.BranchOfficeItem;
import com.bpjstku.data.office.model.response.RegionalOfficeItem;
import com.bpjstku.domain.branchoffice.model.Office;
import com.bpjstku.domain.branchoffice.model.RegionalOffice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ComponentActivity {
    public static final Office TuitionPaymentFragmentspecialinlinedviewModeldefault2(BranchOfficeItem branchOfficeItem) {
        Intrinsics.checkNotNullParameter(branchOfficeItem, "");
        String address = branchOfficeItem.getAddress();
        String str = address == null ? "" : address;
        String code = branchOfficeItem.getCode();
        String str2 = code == null ? "" : code;
        Double latitude = branchOfficeItem.getLatitude();
        double dDoubleValue = latitude != null ? latitude.doubleValue() : 0.0d;
        Double longitude = branchOfficeItem.getLongitude();
        double dDoubleValue2 = longitude != null ? longitude.doubleValue() : 0.0d;
        String officeName = branchOfficeItem.getOfficeName();
        if (officeName == null) {
            officeName = "";
        }
        return new Office(str, str2, dDoubleValue, dDoubleValue2, officeName);
    }

    public static final RegionalOffice TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegionalOfficeItem regionalOfficeItem) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(regionalOfficeItem, "");
        String address = regionalOfficeItem.getAddress();
        String str = address == null ? "" : address;
        String code = regionalOfficeItem.getCode();
        String str2 = code == null ? "" : code;
        Double latitude = regionalOfficeItem.getLatitude();
        double dDoubleValue = latitude != null ? latitude.doubleValue() : 0.0d;
        Double longitude = regionalOfficeItem.getLongitude();
        double dDoubleValue2 = longitude != null ? longitude.doubleValue() : 0.0d;
        String officeName = regionalOfficeItem.getOfficeName();
        String str3 = officeName != null ? officeName : "";
        List<BranchOfficeItem> branchOffices = regionalOfficeItem.getBranchOffices();
        if (branchOffices != null) {
            List<BranchOfficeItem> list = branchOffices;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2((BranchOfficeItem) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new RegionalOffice(str, str2, dDoubleValue, dDoubleValue2, str3, arrayList == null ? CollectionsKt.emptyList() : arrayList);
    }
}

package defpackage;

import com.bpjstku.data.report.model.response.HealthcareItem;
import com.bpjstku.data.report.model.response.PreloadDataResponse;
import com.bpjstku.domain.report.model.Healthcare;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposePredictiveBackHandlercurrentOnBack1 {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());

    public static final Healthcare b(HealthcareItem healthcareItem) {
        Intrinsics.checkNotNullParameter(healthcareItem, "");
        String address = healthcareItem.getAddress();
        String str = address == null ? "" : address;
        String code = healthcareItem.getCode();
        String str2 = code == null ? "" : code;
        String latitude = healthcareItem.getLatitude();
        String str3 = latitude == null ? "" : latitude;
        String longitude = healthcareItem.getLongitude();
        String str4 = longitude == null ? "" : longitude;
        String name = healthcareItem.getName();
        return new Healthcare(str, str2, str3, str4, name == null ? "" : name);
    }

    public static final PreloadDataResponse TuitionPaymentFragmentbindingInflater1(PreloadDataResponse preloadDataResponse) {
        Intrinsics.checkNotNullParameter(preloadDataResponse, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String salary = preloadDataResponse.getSalary();
        if (salary == null) {
            salary = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(salary, TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        String totalEmployee = preloadDataResponse.getTotalEmployee();
        return new PreloadDataResponse(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, totalEmployee != null ? totalEmployee : "");
    }
}

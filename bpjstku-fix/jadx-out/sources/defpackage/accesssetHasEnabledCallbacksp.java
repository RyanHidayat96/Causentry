package defpackage;

import com.bpjstku.data.payment.model.response.CustomerObjectItem;
import com.bpjstku.data.payment.model.response.GetListSertakanAutodebetResponse;
import com.bpjstku.data.payment.model.response.GetListSertakanItemResponse;
import com.bpjstku.data.payment.model.response.GetStatusRecurringPlanResponse;
import com.bpjstku.data.payment.model.response.RecurringProfile;
import com.bpjstku.data.payment.model.response.SubmitAutodebitBniAutopayResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetHasEnabledCallbacksp {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());

    public static final List<CustomerObjectItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<CustomerObjectItem> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (CustomerObjectItem customerObjectItem : list) {
                String strValueOf = String.valueOf(customerObjectItem.getCustomerId());
                Intrinsics.checkNotNullParameter(strValueOf, "");
                Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
                String str = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf, str);
                String strValueOf2 = String.valueOf(customerObjectItem.getCustomerId());
                Intrinsics.checkNotNullParameter(strValueOf2, "");
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf2, str);
                String string = customerObjectItem.getEmail().toString();
                Intrinsics.checkNotNullParameter(string, "");
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(string, str);
                String strValueOf3 = String.valueOf(customerObjectItem.getMobileNumber());
                Intrinsics.checkNotNullParameter(strValueOf3, "");
                arrayList.add(new CustomerObjectItem(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, strTuitionPaymentFragmentspecialinlinedviewModeldefault5, Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf3, str)));
            }
        }
        return arrayList;
    }

    public static final GetStatusRecurringPlanResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(GetStatusRecurringPlanResponse getStatusRecurringPlanResponse) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault9 = "";
        Intrinsics.checkNotNullParameter(getStatusRecurringPlanResponse, "");
        String message = getStatusRecurringPlanResponse.getMessage();
        if (message == null) {
            message = "";
        }
        Boolean boolIsSuccessful = getStatusRecurringPlanResponse.isSuccessful();
        Integer statusCode = getStatusRecurringPlanResponse.getStatusCode();
        RecurringProfile recurringProfile = getStatusRecurringPlanResponse.getRecurringProfile();
        if (Intrinsics.areEqual(recurringProfile != null ? recurringProfile.getTglLahir() : null, "")) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = "";
        } else {
            RecurringProfile recurringProfile2 = getStatusRecurringPlanResponse.getRecurringProfile();
            String strValueOf = String.valueOf(recurringProfile2 != null ? recurringProfile2.getTglLahir() : null);
            Intrinsics.checkNotNullParameter(strValueOf, "");
            strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        RecurringProfile recurringProfile3 = getStatusRecurringPlanResponse.getRecurringProfile();
        if (Intrinsics.areEqual(recurringProfile3 != null ? recurringProfile3.getTipeRekening() : null, "")) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = "";
        } else {
            RecurringProfile recurringProfile4 = getStatusRecurringPlanResponse.getRecurringProfile();
            String strValueOf2 = String.valueOf(recurringProfile4 != null ? recurringProfile4.getTipeRekening() : null);
            Intrinsics.checkNotNullParameter(strValueOf2, "");
            strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf2, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        RecurringProfile recurringProfile5 = getStatusRecurringPlanResponse.getRecurringProfile();
        if (Intrinsics.areEqual(recurringProfile5 != null ? recurringProfile5.getNamaLengkap() : null, "")) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = "";
        } else {
            RecurringProfile recurringProfile6 = getStatusRecurringPlanResponse.getRecurringProfile();
            String strValueOf3 = String.valueOf(recurringProfile6 != null ? recurringProfile6.getNamaLengkap() : null);
            Intrinsics.checkNotNullParameter(strValueOf3, "");
            strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf3, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        RecurringProfile recurringProfile7 = getStatusRecurringPlanResponse.getRecurringProfile();
        String recurringAktif = recurringProfile7 != null ? recurringProfile7.getRecurringAktif() : null;
        String str = recurringAktif == null ? "" : recurringAktif;
        RecurringProfile recurringProfile8 = getStatusRecurringPlanResponse.getRecurringProfile();
        if (Intrinsics.areEqual(recurringProfile8 != null ? recurringProfile8.getPetugasRekam() : null, "")) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = "";
        } else {
            RecurringProfile recurringProfile9 = getStatusRecurringPlanResponse.getRecurringProfile();
            String strValueOf4 = String.valueOf(recurringProfile9 != null ? recurringProfile9.getPetugasRekam() : null);
            Intrinsics.checkNotNullParameter(strValueOf4, "");
            strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf4, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        RecurringProfile recurringProfile10 = getStatusRecurringPlanResponse.getRecurringProfile();
        String tglAktifRecurring = recurringProfile10 != null ? recurringProfile10.getTglAktifRecurring() : null;
        String str2 = tglAktifRecurring == null ? "" : tglAktifRecurring;
        RecurringProfile recurringProfile11 = getStatusRecurringPlanResponse.getRecurringProfile();
        if (Intrinsics.areEqual(recurringProfile11 != null ? recurringProfile11.getNik() : null, "")) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = "";
        } else {
            RecurringProfile recurringProfile12 = getStatusRecurringPlanResponse.getRecurringProfile();
            String strValueOf5 = String.valueOf(recurringProfile12 != null ? recurringProfile12.getNik() : null);
            Intrinsics.checkNotNullParameter(strValueOf5, "");
            strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf5, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        RecurringProfile recurringProfile13 = getStatusRecurringPlanResponse.getRecurringProfile();
        if (Intrinsics.areEqual(recurringProfile13 != null ? recurringProfile13.getKodePaket() : null, "")) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault8 = "";
        } else {
            RecurringProfile recurringProfile14 = getStatusRecurringPlanResponse.getRecurringProfile();
            String strValueOf6 = String.valueOf(recurringProfile14 != null ? recurringProfile14.getKodePaket() : null);
            Intrinsics.checkNotNullParameter(strValueOf6, "");
            strTuitionPaymentFragmentspecialinlinedviewModeldefault8 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf6, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        RecurringProfile recurringProfile15 = getStatusRecurringPlanResponse.getRecurringProfile();
        if (!Intrinsics.areEqual(recurringProfile15 != null ? recurringProfile15.getNominal() : null, "")) {
            RecurringProfile recurringProfile16 = getStatusRecurringPlanResponse.getRecurringProfile();
            String strValueOf7 = String.valueOf(recurringProfile16 != null ? recurringProfile16.getNominal() : null);
            Intrinsics.checkNotNullParameter(strValueOf7, "");
            strTuitionPaymentFragmentspecialinlinedviewModeldefault9 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf7, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return new GetStatusRecurringPlanResponse(message, boolIsSuccessful, statusCode, new RecurringProfile(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, strTuitionPaymentFragmentspecialinlinedviewModeldefault5, str, strTuitionPaymentFragmentspecialinlinedviewModeldefault6, str2, strTuitionPaymentFragmentspecialinlinedviewModeldefault7, strTuitionPaymentFragmentspecialinlinedviewModeldefault8, strTuitionPaymentFragmentspecialinlinedviewModeldefault9));
    }

    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2InteropExtender.INSTANCE, str, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public static final GetListSertakanAutodebetResponse b(GetListSertakanAutodebetResponse getListSertakanAutodebetResponse) {
        Intrinsics.checkNotNullParameter(getListSertakanAutodebetResponse, "");
        List<GetListSertakanItemResponse> data = getListSertakanAutodebetResponse.getData();
        ArrayList arrayList = new ArrayList();
        if (data != null) {
            for (GetListSertakanItemResponse getListSertakanItemResponse : data) {
                Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
                String namaLengkap = getListSertakanItemResponse.getNamaLengkap();
                if (namaLengkap == null) {
                    namaLengkap = "";
                }
                String str = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(namaLengkap, str);
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getListSertakanItemResponse.getEmail().toString(), str);
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getListSertakanItemResponse.getHandPhone().toString(), str);
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getListSertakanItemResponse.getTipeRekening().toString(), str);
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getListSertakanItemResponse.getNik().toString(), str);
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault8 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getListSertakanItemResponse.getNominal().toString(), str);
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault9 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getListSertakanItemResponse.getKodePlanRecurring().toString(), str);
                String tglRekamRecurring = getListSertakanItemResponse.getTglRekamRecurring();
                arrayList.add(new GetListSertakanItemResponse(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, strTuitionPaymentFragmentspecialinlinedviewModeldefault5, strTuitionPaymentFragmentspecialinlinedviewModeldefault6, strTuitionPaymentFragmentspecialinlinedviewModeldefault7, strTuitionPaymentFragmentspecialinlinedviewModeldefault8, strTuitionPaymentFragmentspecialinlinedviewModeldefault9, getListSertakanItemResponse.getAllowed_nonaktif(), getListSertakanItemResponse.getTglAktifRecurring(), tglRekamRecurring));
            }
        }
        return new GetListSertakanAutodebetResponse(arrayList);
    }

    public static final SubmitAutodebitBniAutopayResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(SubmitAutodebitBniAutopayResponse submitAutodebitBniAutopayResponse) {
        Intrinsics.checkNotNullParameter(submitAutodebitBniAutopayResponse, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String nik = submitAutodebitBniAutopayResponse.getNik();
        String str = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return new SubmitAutodebitBniAutopayResponse(companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(nik, str), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(submitAutodebitBniAutopayResponse.getMsg(), str), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(submitAutodebitBniAutopayResponse.getChargeToken(), str), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(submitAutodebitBniAutopayResponse.getReferenceNo(), str), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(submitAutodebitBniAutopayResponse.getConfirmPhoneNumber(), str), null, null, 96, null);
    }
}

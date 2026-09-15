package defpackage;

import com.bpjstku.data.tuition.model.response.BpuOneMonthTuitionResponse;
import com.bpjstku.data.tuition.model.response.BpuPaymentStatusItem;
import com.bpjstku.data.tuition.model.response.PaymentFee;
import com.bpjstku.data.tuition.model.response.PaymentHistoryResponseItem;
import com.bpjstku.domain.tuition.model.BpuCheckPaymentItem;
import com.bpjstku.domain.tuition.model.BpuTuitionOneMonth;
import com.bpjstku.domain.tuition.model.PaymentHistoryItem;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getResultCode {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());

    public static final BpuTuitionOneMonth TuitionPaymentFragmentspecialinlinedviewModeldefault1(BpuOneMonthTuitionResponse bpuOneMonthTuitionResponse) {
        Double doubleOrNull;
        Intrinsics.checkNotNullParameter(bpuOneMonthTuitionResponse, "");
        double dDoubleValue = (Intrinsics.areEqual(String.valueOf(bpuOneMonthTuitionResponse.getIuranJht()), "") || (doubleOrNull = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuOneMonthTuitionResponse.getIuranJkk()), TuitionPaymentFragmentspecialinlinedviewModeldefault3), new String[]{"#"}, false, 0, 6, (Object) null).get(0))) == null) ? 0.0d : doubleOrNull.doubleValue();
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String strValueOf = String.valueOf(bpuOneMonthTuitionResponse.getIuranJkm());
        String str = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Double doubleOrNull2 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf, str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue2 = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d;
        Double doubleOrNull3 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuOneMonthTuitionResponse.getIuranJkm()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue3 = doubleOrNull3 != null ? doubleOrNull3.doubleValue() : 0.0d;
        Double doubleOrNull4 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuOneMonthTuitionResponse.getIuranTotal()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        return new BpuTuitionOneMonth(dDoubleValue, dDoubleValue2, dDoubleValue3, doubleOrNull4 != null ? doubleOrNull4.doubleValue() : 0.0d, bpuOneMonthTuitionResponse.getCustomField());
    }

    public static final BpuCheckPaymentItem b(BpuPaymentStatusItem bpuPaymentStatusItem) {
        Intrinsics.checkNotNullParameter(bpuPaymentStatusItem, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String strValueOf = String.valueOf(bpuPaymentStatusItem.getCheckSum());
        String str = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf, str);
        Double doubleOrNull = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getIuranJht()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        Double doubleOrNull2 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getIuranJkk()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue2 = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d;
        Double doubleOrNull3 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getIuranJkm()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue3 = doubleOrNull3 != null ? doubleOrNull3.doubleValue() : 0.0d;
        Double doubleOrNull4 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getTotalIuran()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue4 = doubleOrNull4 != null ? doubleOrNull4.doubleValue() : 0.0d;
        String strValueOf2 = String.valueOf(bpuPaymentStatusItem.getKodePembayaran());
        int i = Integer.parseInt(bpuPaymentStatusItem.getStatusCode());
        String strValueOf3 = String.valueOf(bpuPaymentStatusItem.getCheckSumAutoDebit());
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        String jmlBulan = bpuPaymentStatusItem.getJmlBulan();
        Intrinsics.checkNotNull(jmlBulan);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jmlBulan, str);
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        PaymentFee paymentFee = bpuPaymentStatusItem.getPaymentFee();
        Double doubleOrNull5 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) companion3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(paymentFee != null ? paymentFee.getGoPay() : null), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue5 = doubleOrNull5 != null ? doubleOrNull5.doubleValue() : 0.0d;
        Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
        PaymentFee paymentFee2 = bpuPaymentStatusItem.getPaymentFee();
        Double doubleOrNull6 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) companion4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(paymentFee2 != null ? paymentFee2.getShopeePay() : null), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue6 = doubleOrNull6 != null ? doubleOrNull6.doubleValue() : 0.0d;
        Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
        PaymentFee paymentFee3 = bpuPaymentStatusItem.getPaymentFee();
        Double doubleOrNull7 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) companion5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(paymentFee3 != null ? paymentFee3.getOvo() : null), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue7 = doubleOrNull7 != null ? doubleOrNull7.doubleValue() : 0.0d;
        String strValueOf4 = String.valueOf(bpuPaymentStatusItem.getTanggalEfektif());
        String strValueOf5 = String.valueOf(bpuPaymentStatusItem.getTanggalExpired());
        String strValueOf6 = String.valueOf(bpuPaymentStatusItem.getHashData());
        String strValueOf7 = String.valueOf(bpuPaymentStatusItem.getCheckSum());
        String strValueOf8 = String.valueOf(bpuPaymentStatusItem.getKodeIuranTrx());
        String string = ((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getNik()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0)).toString();
        return new BpuCheckPaymentItem(dDoubleValue, dDoubleValue2, dDoubleValue3, strValueOf2, dDoubleValue4, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, i, dDoubleValue5, dDoubleValue6, Double.valueOf(dDoubleValue7), strValueOf6, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, ((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getSalary()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0)).toString(), strValueOf7, strValueOf3, strValueOf4, strValueOf5, strValueOf8, ((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getNamaLengkap()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0)).toString(), ((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getTglLahir()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0)).toString(), string, ((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getProgram()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0)).toString());
    }

    public static final BpuCheckPaymentItem TuitionPaymentFragmentspecialinlinedviewModeldefault2(BpuPaymentStatusItem bpuPaymentStatusItem) {
        Intrinsics.checkNotNullParameter(bpuPaymentStatusItem, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String strValueOf = String.valueOf(bpuPaymentStatusItem.getCheckSum());
        String str = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strValueOf, str);
        Double doubleOrNull = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getIuranJht()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        Double doubleOrNull2 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getIuranJkk()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue2 = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d;
        Double doubleOrNull3 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getIuranJkm()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue3 = doubleOrNull3 != null ? doubleOrNull3.doubleValue() : 0.0d;
        Double doubleOrNull4 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getTotalIuran()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue4 = doubleOrNull4 != null ? doubleOrNull4.doubleValue() : 0.0d;
        String strValueOf2 = String.valueOf(bpuPaymentStatusItem.getKodePembayaran());
        int i = Integer.parseInt(bpuPaymentStatusItem.getStatusCode());
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        String jmlBulan = bpuPaymentStatusItem.getJmlBulan();
        Intrinsics.checkNotNull(jmlBulan);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jmlBulan, str);
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        PaymentFee paymentFee = bpuPaymentStatusItem.getPaymentFee();
        Double doubleOrNull5 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) companion3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(paymentFee != null ? paymentFee.getGoPay() : null), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue5 = doubleOrNull5 != null ? doubleOrNull5.doubleValue() : 0.0d;
        Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
        PaymentFee paymentFee2 = bpuPaymentStatusItem.getPaymentFee();
        Double doubleOrNull6 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) companion4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(paymentFee2 != null ? paymentFee2.getShopeePay() : null), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue6 = doubleOrNull6 != null ? doubleOrNull6.doubleValue() : 0.0d;
        Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
        PaymentFee paymentFee3 = bpuPaymentStatusItem.getPaymentFee();
        Double doubleOrNull7 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) companion5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(paymentFee3 != null ? paymentFee3.getOvo() : null), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue7 = doubleOrNull7 != null ? doubleOrNull7.doubleValue() : 0.0d;
        String strValueOf3 = String.valueOf(bpuPaymentStatusItem.getTanggalEfektif());
        String strValueOf4 = String.valueOf(bpuPaymentStatusItem.getTanggalExpired());
        String strValueOf5 = String.valueOf(bpuPaymentStatusItem.getHashData());
        String strValueOf6 = String.valueOf(bpuPaymentStatusItem.getCheckSum());
        String strValueOf7 = String.valueOf(bpuPaymentStatusItem.getKodeIuranTrx());
        String str2 = (String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getNik()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0);
        return new BpuCheckPaymentItem(dDoubleValue, dDoubleValue2, dDoubleValue3, strValueOf2, dDoubleValue4, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, i, dDoubleValue5, dDoubleValue6, Double.valueOf(dDoubleValue7), strValueOf5, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, ((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getSalary()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0)).toString(), strValueOf6, "", strValueOf3, strValueOf4, strValueOf7, (String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getNamaLengkap()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0), (String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getTglLahir()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0), str2, (String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(bpuPaymentStatusItem.getProgram()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
    }

    public static final PaymentHistoryItem TuitionPaymentFragmentbindingInflater1(PaymentHistoryResponseItem paymentHistoryResponseItem) {
        Double doubleOrNull;
        Double doubleOrNull2;
        Double doubleOrNull3;
        Double doubleOrNull4;
        Intrinsics.checkNotNullParameter(paymentHistoryResponseItem, "");
        String transactionId = paymentHistoryResponseItem.getTransactionId();
        String amountJht = paymentHistoryResponseItem.getAmountJht();
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = (amountJht == null || (doubleOrNull4 = StringsKt.toDoubleOrNull(amountJht)) == null) ? 0.0d : doubleOrNull4.doubleValue();
        String amountJkk = paymentHistoryResponseItem.getAmountJkk();
        double dDoubleValue3 = (amountJkk == null || (doubleOrNull3 = StringsKt.toDoubleOrNull(amountJkk)) == null) ? 0.0d : doubleOrNull3.doubleValue();
        String amountJkm = paymentHistoryResponseItem.getAmountJkm();
        double dDoubleValue4 = (amountJkm == null || (doubleOrNull2 = StringsKt.toDoubleOrNull(amountJkm)) == null) ? 0.0d : doubleOrNull2.doubleValue();
        String amountTotal = paymentHistoryResponseItem.getAmountTotal();
        if (amountTotal != null && (doubleOrNull = StringsKt.toDoubleOrNull(amountTotal)) != null) {
            dDoubleValue = doubleOrNull.doubleValue();
        }
        String fullname = paymentHistoryResponseItem.getFullname();
        String quantity = paymentHistoryResponseItem.getQuantity();
        String settlementDate = paymentHistoryResponseItem.getSettlementDate();
        String status = paymentHistoryResponseItem.getStatus();
        String transactionDate = paymentHistoryResponseItem.getTransactionDate();
        String customerIdentifier = paymentHistoryResponseItem.getCustomerIdentifier();
        String paymentMethod = paymentHistoryResponseItem.getPaymentMethod();
        return new PaymentHistoryItem(transactionId, Double.valueOf(dDoubleValue3), Double.valueOf(dDoubleValue4), Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue), status, quantity, fullname, transactionDate, settlementDate, customerIdentifier, paymentMethod != null ? paymentMethod : "", "");
    }
}

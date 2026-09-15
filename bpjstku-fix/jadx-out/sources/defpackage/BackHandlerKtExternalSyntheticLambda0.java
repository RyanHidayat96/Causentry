package defpackage;

import com.bpjstku.data.registration.general.model.response.MembershipCheckItem;
import com.bpjstku.data.registration.general.model.response.RegistrationItem;
import com.bpjstku.data.registration.general.model.response.VerificationItem;
import com.bpjstku.data.registration.general.model.response.VerifyBiometricResponse;
import com.bpjstku.data.tuition.model.response.PaymentFee;
import com.bpjstku.domain.registration.general.model.MembershipCheckNew;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.registration.general.model.Verification;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class BackHandlerKtExternalSyntheticLambda0 {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());

    public static final Verification TuitionPaymentFragmentbindingInflater1(VerificationItem verificationItem) {
        Intrinsics.checkNotNullParameter(verificationItem, "");
        boolean isSuccessful = verificationItem.getIsSuccessful();
        String message = verificationItem.getMessage();
        String otp = verificationItem.getOtp();
        if (otp == null) {
            otp = "";
        }
        String checkSum = verificationItem.getCheckSum();
        return new Verification(isSuccessful, message, otp, checkSum != null ? checkSum : "");
    }

    public static final Registration TuitionPaymentFragmentspecialinlinedviewModeldefault3(RegistrationItem registrationItem) {
        Intrinsics.checkNotNullParameter(registrationItem, "");
        boolean isSuccessful = registrationItem.getIsSuccessful();
        String message = registrationItem.getMessage();
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String iuranJht = registrationItem.getIuranJht();
        if (iuranJht == null) {
            iuranJht = "";
        }
        String str = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = (String) StringsKt.split$default((CharSequence) companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iuranJht, str), new String[]{"#"}, false, 0, 6, (Object) null).get(0);
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        String iuranJkk = registrationItem.getIuranJkk();
        if (iuranJkk == null) {
            iuranJkk = "";
        }
        String str3 = (String) StringsKt.split$default((CharSequence) companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iuranJkk, str), new String[]{"#"}, false, 0, 6, (Object) null).get(0);
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        String iuranJkm = registrationItem.getIuranJkm();
        if (iuranJkm == null) {
            iuranJkm = "";
        }
        String str4 = (String) StringsKt.split$default((CharSequence) companion3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iuranJkm, str), new String[]{"#"}, false, 0, 6, (Object) null).get(0);
        String kodePembayaran = registrationItem.getKodePembayaran();
        if (kodePembayaran == null) {
            kodePembayaran = "";
        }
        Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
        String totalIuran = registrationItem.getTotalIuran();
        if (totalIuran == null) {
            totalIuran = "";
        }
        String str5 = (String) StringsKt.split$default((CharSequence) companion4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(totalIuran, str), new String[]{"#"}, false, 0, 6, (Object) null).get(0);
        String namaLengkap = registrationItem.getNamaLengkap();
        if (namaLengkap == null) {
            namaLengkap = "";
        }
        String email = registrationItem.getEmail();
        if (email == null) {
            email = "";
        }
        String noHp = registrationItem.getNoHp();
        if (noHp == null) {
            noHp = "";
        }
        String address = registrationItem.getAddress();
        if (address == null) {
            address = "";
        }
        String kodePos = registrationItem.getKodePos();
        if (kodePos == null) {
            kodePos = "";
        }
        Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
        String jmlBulan = registrationItem.getJmlBulan();
        Intrinsics.checkNotNull(jmlBulan);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jmlBulan, str);
        String context = registrationItem.getContext();
        String str6 = context == null ? "" : context;
        String nik = registrationItem.getNik();
        String str7 = nik == null ? "" : nik;
        Camera2InteropExtender.Companion companion6 = Camera2InteropExtender.INSTANCE;
        PaymentFee paymentFee = registrationItem.getPaymentFee();
        Double doubleOrNull = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) companion6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(paymentFee != null ? paymentFee.getGoPay() : null), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        Camera2InteropExtender.Companion companion7 = Camera2InteropExtender.INSTANCE;
        PaymentFee paymentFee2 = registrationItem.getPaymentFee();
        Intrinsics.checkNotNull(paymentFee2);
        String shopeePay = paymentFee2.getShopeePay();
        Intrinsics.checkNotNull(shopeePay);
        Double doubleOrNull2 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) companion7.TuitionPaymentFragmentspecialinlinedviewModeldefault3(shopeePay, str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue2 = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d;
        String strValueOf = String.valueOf(registrationItem.getHashData());
        String strValueOf2 = String.valueOf(registrationItem.getTanggalExpired());
        String strValueOf3 = String.valueOf(registrationItem.getTanggalEfektif());
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(registrationItem.getCheckSum()), str);
        String strValueOf4 = String.valueOf(registrationItem.getCheckSum());
        String tglLahir = registrationItem.getTglLahir();
        String str8 = tglLahir == null ? "" : tglLahir;
        String kodeIuranTrx = registrationItem.getKodeIuranTrx();
        String str9 = kodeIuranTrx == null ? "" : kodeIuranTrx;
        Double doubleOrNull3 = StringsKt.toDoubleOrNull((String) StringsKt.split$default((CharSequence) Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(String.valueOf(registrationItem.getPaymentFee().getOvo()), str), new String[]{"#"}, false, 0, 6, (Object) null).get(0));
        double dDoubleValue3 = doubleOrNull3 != null ? doubleOrNull3.doubleValue() : 0.0d;
        String transactionDate = registrationItem.getTransactionDate();
        String str10 = transactionDate == null ? "" : transactionDate;
        String salary = registrationItem.getSalary();
        return new Registration(isSuccessful, message, str2, str3, str4, kodePembayaran, str5, namaLengkap, str8, email, noHp, address, kodePos, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strValueOf3, strValueOf2, str6, str7, Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue3), strValueOf, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, salary == null ? "" : salary, strValueOf4, "", str9, str10, "", false, false, 1610612736, null);
    }

    public static final VerifyBiometricResponse TuitionPaymentFragmentbindingInflater1(VerifyBiometricResponse verifyBiometricResponse) {
        Intrinsics.checkNotNullParameter(verifyBiometricResponse, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1().get(0));
        return new VerifyBiometricResponse(Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(verifyBiometricResponse.isSuspend(), strB), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(verifyBiometricResponse.isSuccessful(), strB), verifyBiometricResponse.getMessage(), verifyBiometricResponse.getStatusCode());
    }

    public static final MembershipCheckNew TuitionPaymentFragmentspecialinlinedviewModeldefault1(MembershipCheckItem membershipCheckItem) {
        Intrinsics.checkNotNullParameter(membershipCheckItem, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1().get(0));
        String checkSum = membershipCheckItem.getCheckSum();
        String signature = membershipCheckItem.getSignature();
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String activationCheckSum = membershipCheckItem.getActivationCheckSum();
        if (activationCheckSum == null) {
            activationCheckSum = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activationCheckSum, strB);
        boolean isSuccessful = membershipCheckItem.getIsSuccessful();
        String message = membershipCheckItem.getMessage();
        return new MembershipCheckNew(checkSum, signature, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, message == null ? "" : message, isSuccessful, membershipCheckItem.getStatusCode());
    }
}

package defpackage;

import com.bpjstku.data.jht.model.response.ClaimLivenessResponse;
import com.bpjstku.data.jht.model.response.JhtBalanceItem;
import com.bpjstku.domain.jht.model.JhtBalance;
import com.bpjstku.util.constant.MembershipType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ComponentActivityExternalSyntheticLambda11 {
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    public static final JhtBalance TuitionPaymentFragmentbindingInflater1(JhtBalanceItem jhtBalanceItem) {
        MembershipType membershipType;
        Intrinsics.checkNotNullParameter(jhtBalanceItem, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        String companyCode = jhtBalanceItem.getCompanyCode();
        if (companyCode == null) {
            companyCode = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(companyCode, strB);
        String segmentCode = jhtBalanceItem.getSegmentCode();
        if (segmentCode == null) {
            segmentCode = "";
        }
        int iHashCode = segmentCode.hashCode();
        if (iHashCode != 2565) {
            if (iHashCode != 65991) {
                if (iHashCode == 79340 && segmentCode.equals("PMI")) {
                    membershipType = MembershipType.PMI;
                } else {
                    membershipType = MembershipType.PU;
                }
            } else if (segmentCode.equals("BPU")) {
                membershipType = MembershipType.BPU;
            } else {
                membershipType = MembershipType.PU;
            }
        } else if (segmentCode.equals("PU")) {
            membershipType = MembershipType.PU;
        } else {
            membershipType = MembershipType.PU;
        }
        MembershipType membershipType2 = membershipType;
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        String tkCode = jhtBalanceItem.getTkCode();
        if (tkCode == null) {
            tkCode = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tkCode, strB);
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        String kpj = jhtBalanceItem.getKpj();
        if (kpj == null) {
            kpj = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = companion3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kpj, strB);
        Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
        String companyName = jhtBalanceItem.getCompanyName();
        if (companyName == null) {
            companyName = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = companion4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(companyName, strB);
        Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
        String balance = jhtBalanceItem.getBalance();
        if (balance == null) {
            balance = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = companion5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(balance, strB);
        Camera2InteropExtender.Companion companion6 = Camera2InteropExtender.INSTANCE;
        String npp = jhtBalanceItem.getNpp();
        if (npp == null) {
            npp = "";
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault8 = companion6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(npp, strB);
        String totalWorker = jhtBalanceItem.getTotalWorker();
        String str = totalWorker == null ? "" : totalWorker;
        String subscribedProgram = jhtBalanceItem.getSubscribedProgram();
        String str2 = subscribedProgram == null ? "" : subscribedProgram;
        String lastTuitionDate = jhtBalanceItem.getLastTuitionDate();
        String str3 = lastTuitionDate == null ? "" : lastTuitionDate;
        String lastTuitionMonth = jhtBalanceItem.getLastTuitionMonth();
        String str4 = lastTuitionMonth == null ? "" : lastTuitionMonth;
        String membershipStatus = jhtBalanceItem.getMembershipStatus();
        String str5 = membershipStatus == null ? "" : membershipStatus;
        String divitionCode = jhtBalanceItem.getDivitionCode();
        return new JhtBalance(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, membershipType2, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, strTuitionPaymentFragmentspecialinlinedviewModeldefault5, strTuitionPaymentFragmentspecialinlinedviewModeldefault6, strTuitionPaymentFragmentspecialinlinedviewModeldefault7, strTuitionPaymentFragmentspecialinlinedviewModeldefault8, str, str2, str4, str3, str5, divitionCode == null ? "" : divitionCode);
    }

    public static final ClaimLivenessResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(ClaimLivenessResponse claimLivenessResponse) {
        Intrinsics.checkNotNullParameter(claimLivenessResponse, "");
        String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        return new ClaimLivenessResponse(Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(claimLivenessResponse.isSuspend(), strB), Camera2InteropExtender.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault3(claimLivenessResponse.isSuccessful(), strB), claimLivenessResponse.getMessage(), claimLivenessResponse.getStatusCode());
    }
}

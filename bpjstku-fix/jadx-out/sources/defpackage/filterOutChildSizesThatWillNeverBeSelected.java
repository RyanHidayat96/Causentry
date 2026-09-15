package defpackage;

import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.snap.TransactionStatusResponse;
import defpackage.getCameraSupportedResolutions;

/* JADX INFO: loaded from: classes4.dex */
public class filterOutChildSizesThatWillNeverBeSelected<V extends getCameraSupportedResolutions> extends filterOutParentSizeThatIsTooSmall<V> {
    private final String TuitionPaymentFragmentbindingInflater1 = "Back";
    public TransactionResponse b;

    public static TransactionResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(TransactionStatusResponse transactionStatusResponse) {
        TransactionResponse transactionResponse = new TransactionResponse();
        transactionResponse.setApprovalCode(transactionStatusResponse.getApprovalCode());
        transactionResponse.setBank(transactionStatusResponse.getBank());
        transactionResponse.setFraudStatus(transactionStatusResponse.getFraudStatus());
        transactionResponse.setGrossAmount(transactionStatusResponse.getGrossAmount());
        transactionResponse.setInstallmentTerm(transactionStatusResponse.getInstallmentTerm());
        transactionResponse.setMaskedCard(transactionStatusResponse.getMaskedCard());
        transactionResponse.setOrderId(transactionStatusResponse.getOrderId());
        transactionResponse.setPaymentType(transactionStatusResponse.getPaymentType());
        transactionResponse.setSavedTokenId(transactionStatusResponse.getSavedTokenId());
        transactionResponse.setSavedTokenIdExpiredAt(transactionStatusResponse.getSavedTokenIdExpiredAt());
        transactionResponse.setStatusCode(transactionStatusResponse.getStatusCode());
        transactionResponse.setStatusMessage(transactionStatusResponse.getStatusMessage());
        transactionResponse.setTransactionId(transactionStatusResponse.getTransactionId());
        transactionResponse.setTransactionStatus(transactionStatusResponse.getTransactionStatus());
        transactionResponse.setTransactionTime(transactionStatusResponse.getTransactionTime());
        return transactionResponse;
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str, String str2) {
        try {
            b().getmMixpanelAnalyticsManager().trackButtonClicked(b().readAuthenticationToken(), str, str2);
        } catch (NullPointerException e2) {
            String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("trackButtonClick():");
            sb.append(e2.getMessage());
            Logger.e(str3, sb.toString());
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return (b() == null || b().getUIKitCustomSetting() == null || !b().getUIKitCustomSetting().isShowPaymentStatus()) ? false : true;
    }

    public TransactionResponse TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.b;
    }

    public final void b(String str, boolean z) {
        try {
            b().getmMixpanelAnalyticsManager().trackPageViewed(b().readAuthenticationToken(), str, z);
        } catch (NullPointerException e2) {
            String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            StringBuilder sb = new StringBuilder("trackPageView():");
            sb.append(e2.getMessage());
            Logger.e(str2, sb.toString());
        }
    }
}

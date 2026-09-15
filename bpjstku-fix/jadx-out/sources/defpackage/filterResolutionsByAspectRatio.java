package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.midtrans.sdk.corekit.callback.DeleteCardCallback;
import com.midtrans.sdk.corekit.callback.SaveCardCallback;
import com.midtrans.sdk.corekit.core.TransactionRequest;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.SaveCardRequest;
import com.midtrans.sdk.corekit.models.SaveCardResponse;
import com.midtrans.sdk.corekit.models.snap.BankBinsResponse;
import com.midtrans.sdk.corekit.models.snap.CreditCard;
import com.midtrans.sdk.corekit.models.snap.Installment;
import com.midtrans.sdk.corekit.models.snap.SavedToken;
import defpackage.getCameraSupportedResolutions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class filterResolutionsByAspectRatio<V extends getCameraSupportedResolutions> extends filterOutChildSizesThatWillNeverBeSelected<V> {
    public getFallbackAspectRatio TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public final boolean TuitionPaymentFragmentbindingInflater1() {
        TransactionRequest transactionRequest = b().getTransactionRequest();
        boolean zIsSaveCard = b().getCreditCard().isSaveCard();
        if (transactionRequest != null) {
            String cardClickType = transactionRequest.getCardClickType();
            if (!TextUtils.isEmpty(cardClickType) && (cardClickType.equals(SavedToken.ONE_CLICK) || cardClickType.equals(SavedToken.TWO_CLICKS))) {
                return true;
            }
        }
        return zIsSaveCard;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
        CreditCard creditCard = b().getCreditCard();
        if (creditCard != null) {
            ArrayList<BankBinsResponse> arrayListTuitionPaymentFragmentbindingInflater1 = onConnectionFailed.TuitionPaymentFragmentbindingInflater1(context);
            getFallbackAspectRatio getfallbackaspectratio = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ArrayList<BankBinsResponse> arrayList = new ArrayList<>(arrayListTuitionPaymentFragmentbindingInflater1);
            if (creditCard != null) {
                getfallbackaspectratio.asInterface = creditCard;
                findCloserAspectRatio findcloseraspectratio = getfallbackaspectratio.TuitionPaymentFragmentbindingInflater1;
                findcloseraspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = creditCard.getInstallment();
                Installment installment = findcloseraspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                findcloseraspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (installment == null || installment.getTerms() == null || findcloseraspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTerms().isEmpty()) ? false : true;
            }
            if (!arrayList.isEmpty()) {
                getfallbackaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
                getfallbackaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arrayList;
            }
            ArrayList<String> whitelistBins = getfallbackaspectratio.asInterface.getWhitelistBins();
            List<String> blacklistBins = getfallbackaspectratio.asInterface.getBlacklistBins();
            getfallbackaspectratio.g = (whitelistBins == null || whitelistBins.isEmpty()) ? false : true;
            getfallbackaspectratio.b = (blacklistBins == null || blacklistBins.isEmpty()) ? false : true;
            ArrayList<BankBinsResponse> arrayList2 = getfallbackaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            getfallbackaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final SaveCardRequest saveCardRequest, final computeAreaOverlapping computeareaoverlapping) {
        if (b().isEnableBuiltInTokenStorage()) {
            b().deleteCard(b().readAuthenticationToken(), saveCardRequest.getMaskedCard(), new DeleteCardCallback() { // from class: filterResolutionsByAspectRatio.4
                @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                public final void onError(Throwable th) {
                    computeareaoverlapping.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }

                @Override // com.midtrans.sdk.corekit.callback.DeleteCardCallback
                public final void onFailure(Void r1) {
                    computeareaoverlapping.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }

                @Override // com.midtrans.sdk.corekit.callback.DeleteCardCallback
                public final void onSuccess(Void r2) {
                    computeareaoverlapping.TuitionPaymentFragmentspecialinlinedviewModeldefault1(saveCardRequest.getMaskedCard());
                }
            });
            return;
        }
        List<SaveCardRequest> listTuitionPaymentFragmentspecialinlinedviewModeldefault3 = onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b().getCreditCard().getSavedTokens());
        ArrayList<SaveCardRequest> arrayList = new ArrayList<>();
        if (!listTuitionPaymentFragmentspecialinlinedviewModeldefault3.isEmpty()) {
            arrayList.addAll(listTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            for (int i = 0; i < arrayList.size(); i++) {
                SaveCardRequest saveCardRequest2 = arrayList.get(i);
                if (saveCardRequest2 != null && !TextUtils.isEmpty(saveCardRequest2.getMaskedCard()) && saveCardRequest2.getMaskedCard().equalsIgnoreCase(saveCardRequest.getMaskedCard())) {
                    arrayList.remove(arrayList.get(i));
                }
            }
        }
        final String maskedCard = saveCardRequest.getMaskedCard();
        CustomerDetails customerDetails = b().getTransactionRequest().getCustomerDetails();
        if (customerDetails != null) {
            b().saveCards(customerDetails.getCustomerIdentifier(), arrayList, new SaveCardCallback() { // from class: filterResolutionsByAspectRatio.1
                @Override // com.midtrans.sdk.corekit.callback.HttpRequestCallback
                public final void onError(Throwable th) {
                    computeareaoverlapping.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }

                @Override // com.midtrans.sdk.corekit.callback.SaveCardCallback
                public final void onFailure(String str) {
                    computeareaoverlapping.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }

                @Override // com.midtrans.sdk.corekit.callback.SaveCardCallback
                public final void onSuccess(SaveCardResponse saveCardResponse) {
                    computeareaoverlapping.TuitionPaymentFragmentspecialinlinedviewModeldefault1(maskedCard);
                }
            });
        } else {
            computeareaoverlapping.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }
}

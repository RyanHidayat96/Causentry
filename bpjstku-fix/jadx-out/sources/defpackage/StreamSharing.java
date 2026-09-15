package defpackage;

import android.content.Context;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.models.SaveCardRequest;
import com.midtrans.sdk.corekit.models.snap.CreditCard;
import com.midtrans.sdk.corekit.models.snap.SavedToken;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class StreamSharing extends filterResolutionsByAspectRatio<getPreferredChildSizePair> {
    static final String TuitionPaymentFragmentbindingInflater1 = "SavedCreditCardPresenter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<SaveCardRequest> f213a;

    public StreamSharing(Context context, getPreferredChildSizePair getpreferredchildsizepair) {
        CreditCard creditCard;
        List<SavedToken> savedTokens;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getpreferredchildsizepair;
        this.f213a = new ArrayList();
        ((filterResolutionsByAspectRatio) this).TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getFallbackAspectRatio();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(context);
        if (!MidtransSDK.getInstance().isEnableBuiltInTokenStorage() || (creditCard = MidtransSDK.getInstance().getCreditCard()) == null || (savedTokens = creditCard.getSavedTokens()) == null || savedTokens.isEmpty()) {
            return;
        }
        this.f213a.addAll(onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(savedTokens));
    }
}

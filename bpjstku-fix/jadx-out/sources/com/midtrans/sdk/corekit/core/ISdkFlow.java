package com.midtrans.sdk.corekit.core;

import android.content.Context;
import com.midtrans.sdk.corekit.callback.CardRegistrationCallback;

/* JADX INFO: loaded from: classes4.dex */
public interface ISdkFlow {
    void runAkulaku(Context context, String str);

    void runAlfamart(Context context, String str);

    void runBCABankTransfer(Context context, String str);

    void runBCAKlikPay(Context context, String str);

    void runBRIEpay(Context context, String str);

    void runBankTransfer(Context context, String str);

    void runBniBankTransfer(Context context, String str);

    void runBriBankTransfer(Context context, String str);

    void runCIMBClicks(Context context, String str);

    void runCardRegistration(Context context, CardRegistrationCallback cardRegistrationCallback);

    void runCreditCard(Context context, String str);

    void runDanamonOnline(Context context, String str);

    void runGci(Context context, String str);

    void runGoPay(Context context, String str);

    void runIndomaret(Context context, String str);

    void runIndosatDompetku(Context context, String str);

    void runKioson(Context context, String str);

    void runKlikBCA(Context context, String str);

    void runMandiriBankTransfer(Context context, String str);

    void runMandiriClickpay(Context context, String str);

    void runMandiriECash(Context context, String str);

    void runOtherBankTransfer(Context context, String str);

    void runPermataBankTransfer(Context context, String str);

    void runShopeePay(Context context, String str);

    void runTelkomselCash(Context context, String str);

    void runUIFlow(Context context, String str);

    void runXlTunai(Context context, String str);
}

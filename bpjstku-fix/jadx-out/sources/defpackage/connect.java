package defpackage;

import android.content.Context;
import android.content.Intent;
import com.midtrans.sdk.corekit.callback.CardRegistrationCallback;
import com.midtrans.sdk.corekit.core.ISdkFlow;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.uikit.activities.UserDetailsActivity;
import com.midtrans.sdk.uikit.views.creditcard.register.CardRegistrationActivity;

/* JADX INFO: loaded from: classes.dex */
public final class connect implements ISdkFlow {
    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runAkulaku(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra(PaymentType.AKULAKU, true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runAlfamart(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra(PaymentType.ALFAMART, true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runBCABankTransfer(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("btonly", true);
            intent.putExtra("bt_bca", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runBCAKlikPay(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("bcaklikpay", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runBRIEpay(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("briepay", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runBankTransfer(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("btonly", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runBniBankTransfer(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("btonly", true);
            intent.putExtra("bt_bni", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runBriBankTransfer(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("btonly", true);
            intent.putExtra("bt_bri", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runCIMBClicks(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("cimbclicks", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runCardRegistration(Context context, CardRegistrationCallback cardRegistrationCallback) {
        context.startActivity(new Intent(context, (Class<?>) CardRegistrationActivity.class));
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runCreditCard(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("cconly", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runDanamonOnline(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra(PaymentType.DANAMON_ONLINE, true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runGci(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra(PaymentType.GCI, true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runGoPay(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra(PaymentType.GOPAY, true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runIndomaret(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra(PaymentType.INDOMARET, true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runIndosatDompetku(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("indosatdompetku", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runKioson(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra(PaymentType.KIOSON, true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runKlikBCA(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("klikbca", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runMandiriBankTransfer(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("btonly", true);
            intent.putExtra("bt_mandiri", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runMandiriClickpay(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("mandiriclickpay", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runMandiriECash(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("mandiriecash", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runOtherBankTransfer(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("btonly", true);
            intent.putExtra("bt_other", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runPermataBankTransfer(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("btonly", true);
            intent.putExtra("bt_permata", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runShopeePay(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra(PaymentType.SHOPEEPAY, true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runTelkomselCash(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("tcash", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runUIFlow(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }

    @Override // com.midtrans.sdk.corekit.core.ISdkFlow
    public final void runXlTunai(Context context, String str) {
        if (MidtransSDK.getInstance() != null) {
            Intent intent = new Intent(context, (Class<?>) UserDetailsActivity.class);
            intent.putExtra("xltunai", true);
            intent.putExtra("snap.token", str);
            context.startActivity(intent);
        }
    }
}

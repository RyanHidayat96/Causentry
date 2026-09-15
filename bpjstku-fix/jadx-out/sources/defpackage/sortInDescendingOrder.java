package defpackage;

import android.text.TextUtils;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;

/* JADX INFO: loaded from: classes5.dex */
public final class sortInDescendingOrder extends filterOutChildSizesThatWillNeverBeSelected {
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public sortInDescendingOrder(TransactionResponse transactionResponse, String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.b = transactionResponse;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final String TuitionPaymentFragmentbindingInflater1() {
        byte b;
        if (TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || this.b == null) {
            return "";
        }
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        str.hashCode();
        str.hashCode();
        switch (str.hashCode()) {
            case -1394897142:
                if (!str.equals(PaymentType.BCA_VA)) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1384500083:
                if (!str.equals(PaymentType.BNI_VA)) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1380805999:
                if (!str.equals(PaymentType.BRI_VA)) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1171137990:
                if (!str.equals(PaymentType.ALL_VA)) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -746273556:
                if (!str.equals(PaymentType.PERMATA_VA)) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 669135102:
                if (!str.equals("echannel")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return this.b.getBcaVaNumber();
        }
        if (b == 1) {
            return this.b.getBniVaNumber();
        }
        if (b == 2) {
            return this.b.getBriVaNumber();
        }
        if (b == 3) {
            return TextUtils.isEmpty(this.b.getBniVaNumber()) ? this.b.getPermataVANumber() : this.b.getBniVaNumber();
        }
        if (b != 4) {
            return b != 5 ? "" : this.b.getPaymentCode();
        }
        return this.b.getPermataVANumber();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        byte b;
        if (TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || this.b == null) {
            return "";
        }
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        str.hashCode();
        str.hashCode();
        switch (str.hashCode()) {
            case -1394897142:
                if (!str.equals(PaymentType.BCA_VA)) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1384500083:
                if (!str.equals(PaymentType.BNI_VA)) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1380805999:
                if (!str.equals(PaymentType.BRI_VA)) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1171137990:
                if (!str.equals(PaymentType.ALL_VA)) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -746273556:
                if (!str.equals(PaymentType.PERMATA_VA)) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return this.b.getBcaExpiration();
        }
        if (b == 1) {
            return this.b.getBniExpiration();
        }
        if (b == 2) {
            return this.b.getBriExpiration();
        }
        if (b != 3) {
            return b != 4 ? "" : this.b.getPermataExpiration();
        }
        return TextUtils.isEmpty(this.b.getBniExpiration()) ? this.b.getPermataExpiration() : this.b.getBniExpiration();
    }

    public final boolean g() {
        TransactionResponse transactionResponse = this.b;
        if (transactionResponse != null) {
            return (transactionResponse.getTransactionStatus().equals(TransactionResult.STATUS_PENDING) || this.b.getStatusCode().equals(Constants.STATUS_CODE_201)) ? false : true;
        }
        return true;
    }
}

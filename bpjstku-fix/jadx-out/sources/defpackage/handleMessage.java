package defpackage;

import android.content.Context;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.PaymentException;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import java.util.concurrent.TimeoutException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes.dex */
public final class handleMessage {
    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "b";

    public static getPreferredChildSizePairInternal TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, TransactionResponse transactionResponse) {
        return b(new PaymentException(transactionResponse.getStatusCode(), transactionResponse.getStatusMessage(), new Throwable(transactionResponse.getStatusMessage())), context);
    }

    public static getPreferredChildSizePairInternal b(Throwable th, Context context) {
        String string;
        String string2 = context.getString(R.string.error_message_others);
        try {
            if (th instanceof HttpException) {
                int iCode = ((HttpException) th).code();
                string = TuitionPaymentFragmentbindingInflater1(String.valueOf(iCode), ((HttpException) th).message(), context);
            } else if (th instanceof PaymentException) {
                string = TuitionPaymentFragmentbindingInflater1(((PaymentException) th).statusCode, th.getMessage(), context);
            } else {
                if (th instanceof TimeoutException) {
                    string = context.getString(R.string.timeout_message);
                }
                return new getPreferredChildSizePairInternal(context.getString(R.string.failed_title), string2);
            }
            string2 = string;
        } catch (RuntimeException e2) {
            Logger.e(TuitionPaymentFragmentspecialinlinedviewModeldefault2, e2.getMessage());
        }
        return new getPreferredChildSizePairInternal(context.getString(R.string.failed_title), string2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    private static String TuitionPaymentFragmentbindingInflater1(String str, String str2, Context context) {
        byte b;
        String strValueOf = String.valueOf(str);
        strValueOf.hashCode();
        strValueOf.hashCode();
        switch (strValueOf.hashCode()) {
            case 51508:
                if (!strValueOf.equals(Constants.STATUS_CODE_400)) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 51514:
                if (!strValueOf.equals("406")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 51515:
                if (!strValueOf.equals("407")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 51540:
                if (!strValueOf.equals("411")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 52469:
                if (!strValueOf.equals("500")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 52471:
                if (!strValueOf.equals("502")) {
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
            return context.getString(R.string.error_message_status_code_400);
        }
        if (b == 1) {
            return context.getString(R.string.error_message_status_code_406);
        }
        if (b == 2) {
            return context.getString(R.string.error_message_status_code_407);
        }
        if (b != 3) {
            if (b == 4) {
                return context.getString(R.string.error_message_status_code_500);
            }
            if (b != 5) {
                return context.getString(R.string.error_message_others);
            }
            return context.getString(R.string.error_message_status_code_502);
        }
        if (str2.contains("timed out") || str2.contains("timeout") || str2.equals("timeout")) {
            return context.getString(R.string.timeout_message);
        }
        return context.getString(R.string.details_message_invalid);
    }
}

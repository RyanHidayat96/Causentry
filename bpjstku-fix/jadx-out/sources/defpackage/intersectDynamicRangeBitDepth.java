package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.corekit.models.PaymentMethodsModel;

/* JADX INFO: loaded from: classes4.dex */
public final class intersectDynamicRangeBitDepth {
    public static getCropRectOfReferenceAspectRatio TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        if (str.equals(PaymentType.UOB_APP)) {
            return new getCropRectOfReferenceAspectRatio(str, context.getString(R.string.app_uob), 2131231486, 2, context.getString(R.string.payment_uob_description_app), str2);
        }
        if (str.equals(PaymentType.UOB_WEB)) {
            return new getCropRectOfReferenceAspectRatio(str, context.getString(R.string.web_uob), 2131231486, 1, context.getString(R.string.payment_uob_description_web), str2);
        }
        return null;
    }

    public static PaymentMethodsModel TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, String str, String str2, Boolean bool) {
        if (str.equals(context.getString(R.string.payment_credit_debit))) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 1) {
                return new PaymentMethodsModel(context.getString(R.string.payment_method_credit_card), context.getString(R.string.payment_method_description_credit_card), 2131231161, str, 1, str2);
            }
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 3) {
                return iTuitionPaymentFragmentspecialinlinedviewModeldefault2 != 4 ? new PaymentMethodsModel(context.getString(R.string.payment_method_credit_card), context.getString(R.string.payment_method_description_credit_card_2), 2131231162, str, 1, str2) : new PaymentMethodsModel(context.getString(R.string.payment_method_credit_card), context.getString(R.string.payment_method_description_credit_card_4), 2131231164, str, 1, str2);
            }
            return new PaymentMethodsModel(context.getString(R.string.payment_method_credit_card), context.getString(R.string.payment_method_description_credit_card_3), 2131231163, str, 1, str2);
        }
        if (str.equals(context.getString(R.string.payment_bank_transfer))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_bank_transfer), context.getString(R.string.payment_method_description_bank_transfer), 2131231098, str, 2, str2);
        }
        if (str.equals(context.getString(R.string.payment_bca_click))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_bca_klikpay), context.getString(R.string.payment_method_description_bca_klikpay), 2131231251, str, 3, str2);
        }
        if (str.equals(context.getString(R.string.payment_klik_bca))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_klik_bca), context.getString(R.string.payment_method_description_klik_bca), 2131231250, str, 4, str2);
        }
        if (str.equals(context.getString(R.string.payment_epay_bri))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_bri_epay), context.getString(R.string.payment_method_description_epay_bri), 2131231188, str, 5, str2);
        }
        if (str.equals(context.getString(R.string.payment_cimb_clicks))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_cimb_clicks), context.getString(R.string.payment_method_description_cimb_clicks), 2131231143, str, 6, str2);
        }
        if (str.equals(context.getString(R.string.payment_mandiri_clickpay))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_mandiri_clickpay), context.getString(R.string.payment_method_description_mandiri_clickpay), 2131231277, str, 7, str2);
        }
        if (str.equals(context.getString(R.string.payment_indomaret))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_indomaret), context.getString(R.string.payment_method_description_indomaret), 2131231227, str, 8, str2);
        }
        if (str.equals(context.getString(R.string.payment_kioson))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_kioson), context.getString(R.string.payment_method_description_kioson), 2131231248, str, 9, str2);
        }
        if (str.equals(context.getString(R.string.payment_telkomsel_cash))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_telkomsel_cash), context.getString(R.string.payment_method_description_telkomsel_cash), 2131231480, str, 10, str2);
        }
        if (str.equals(context.getString(R.string.payment_mandiri_ecash))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_mandiri_ecash), context.getString(R.string.payment_method_description_mandiri_ecash), 2131231279, str, 11, str2);
        }
        if (str.equals(context.getString(R.string.payment_indosat_dompetku))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_indosat_dompetku), context.getString(R.string.payment_method_description_indosat_dompetku), 2131231229, str, 12, str2);
        }
        if (str.equals(context.getString(R.string.payment_xl_tunai))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_xl_tunai), context.getString(R.string.payment_method_description_xl_tunai), 2131231505, str, 13, str2);
        }
        if (str.equals(context.getString(R.string.payment_gci))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_gci), context.getString(R.string.payment_method_description_gci), 2131231204, str, 14, str2);
        }
        if (str.equals(context.getString(R.string.payment_gopay))) {
            return bool.booleanValue() ? new PaymentMethodsModel(context.getString(R.string.payment_method_gopay_qris), context.getString(R.string.payment_method_description_gopay_qris), R.drawable.uikit_ic_gopay_qris, str, 15, str2) : new PaymentMethodsModel(context.getString(R.string.payment_method_gopay), context.getString(R.string.payment_method_description_gopay), 2131231206, str, 15, str2);
        }
        if (str.equals(context.getString(R.string.payment_shopeepay))) {
            return bool.booleanValue() ? new PaymentMethodsModel(context.getString(R.string.payment_method_shopeepay_qris), context.getString(R.string.payment_method_description_shopeepay_qris), R.drawable.uikit_ic_shopeepay_qris, str, 16, str2) : new PaymentMethodsModel(context.getString(R.string.payment_method_shopeepay_deeplink), context.getString(R.string.payment_method_description_shopeepay_deeplink), R.drawable.uikit_ic_shopeepay, str, 16, str2);
        }
        if (str.equals(context.getString(R.string.payment_danamon_online))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_danamon_online), context.getString(R.string.payment_method_description_danamon_online), 2131231170, str, 17, str2);
        }
        if (str.equals(context.getString(R.string.payment_akulaku))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_akulaku), context.getString(R.string.payment_method_description_akulaku), 2131231076, str, 18, str2);
        }
        if (str.equals(context.getString(R.string.payment_alfamart))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_alfamart), context.getString(R.string.payment_method_description_alfamart), 2131231077, str, 19, str2);
        }
        if (str.equals(context.getString(R.string.payment_uob))) {
            return new PaymentMethodsModel(context.getString(R.string.payment_method_uob), context.getString(R.string.payment_method_description_uob), 2131231486, str, 4, str2);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    public static getChildrenRequiredResolutions TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, String str, String str2) {
        byte b;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
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
            return new getChildrenRequiredResolutions(str, context.getString(R.string.bca_bank_transfer), 2131231105, 1, context.getString(R.string.payment_bank_description_bca), str2);
        }
        if (b == 1) {
            return new getChildrenRequiredResolutions(str, context.getString(R.string.bni_bank_transfer), 2131231108, 4, context.getString(R.string.payment_bank_description_bni), str2);
        }
        if (b == 2) {
            return new getChildrenRequiredResolutions(str, context.getString(R.string.bri_bank_transfer), R.drawable.ic_bri, 5, context.getString(R.string.payment_bank_description_bri), str2);
        }
        if (b == 3) {
            return new getChildrenRequiredResolutions(str, context.getString(R.string.all_bank_transfer), 2131231098, 6, context.getString(R.string.payment_bank_description_other), str2);
        }
        if (b == 4) {
            return new getChildrenRequiredResolutions(str, context.getString(R.string.permata_bank_transfer), 2131231338, 3, context.getString(R.string.payment_bank_description_permata), str2);
        }
        if (b != 5) {
            return null;
        }
        return new getChildrenRequiredResolutions(str, context.getString(R.string.mandiri_bill), 2131231278, 2, context.getString(R.string.payment_bank_description_mandiri), str2);
    }
}

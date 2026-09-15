package defpackage;

import android.text.TextUtils;
import com.midtrans.sdk.corekit.models.promo.Promo;
import com.midtrans.sdk.corekit.models.snap.BankBinsResponse;
import com.midtrans.sdk.corekit.models.snap.CreditCard;
import com.midtrans.sdk.corekit.models.snap.Installment;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class getFallbackAspectRatio {
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public boolean b;
    public Promo d;
    public boolean g;
    public ArrayList<BankBinsResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList<>();
    public findCloserAspectRatio TuitionPaymentFragmentbindingInflater1 = new findCloserAspectRatio();
    public getCenterCroppedRectangle TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getCenterCroppedRectangle();
    public CreditCard asInterface = new CreditCard();

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(BankBinsResponse bankBinsResponse, String str) {
        Iterator<String> it = bankBinsResponse.getBins().iterator();
        while (it.hasNext()) {
            if (it.next().contains(str)) {
                return bankBinsResponse.getBank();
            }
        }
        return null;
    }

    private String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        String bank;
        Iterator<BankBinsResponse> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
        while (true) {
            bank = null;
            if (!it.hasNext()) {
                break;
            }
            BankBinsResponse next = it.next();
            if (next.getBins() != null && !next.getBins().isEmpty()) {
                for (String str2 : next.getBins()) {
                    if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                        bank = next.getBank();
                        break;
                    }
                }
                if (bank != null) {
                    break;
                }
            }
        }
        return bank;
    }

    public final ArrayList<Integer> TuitionPaymentFragmentbindingInflater1(String str) {
        String strB = b(str);
        if (TextUtils.isEmpty(strB)) {
            strB = "offline";
        }
        ArrayList<Integer> arrayListB = this.TuitionPaymentFragmentbindingInflater1.b(strB);
        if (arrayListB != null) {
            return arrayListB;
        }
        return null;
    }

    public final ArrayList<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        ArrayList<Integer> arrayListB;
        String strB = b(str);
        if ((strB == null || !strB.contains("debit")) && (arrayListB = this.TuitionPaymentFragmentbindingInflater1.b("offline")) != null) {
            return arrayListB;
        }
        return null;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        findCloserAspectRatio findcloseraspectratio = this.TuitionPaymentFragmentbindingInflater1;
        findcloseraspectratio.b = findcloseraspectratio.TuitionPaymentFragmentbindingInflater1.size() == 0 ? 0 : findcloseraspectratio.TuitionPaymentFragmentbindingInflater1.get(i).intValue();
    }

    public final String b(String str) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        for (BankBinsResponse bankBinsResponse : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (bankBinsResponse.getBins() != null && !bankBinsResponse.getBins().isEmpty() && (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(bankBinsResponse, str)) != null) {
                return strTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
        }
        return null;
    }

    public final boolean b() {
        Installment installment;
        findCloserAspectRatio findcloseraspectratio = this.TuitionPaymentFragmentbindingInflater1;
        return (findcloseraspectratio == null || (installment = findcloseraspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null || !installment.isRequired()) ? false : true;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        if (!TextUtils.isEmpty(str) && this.g) {
            for (String str2 : this.asInterface.getWhitelistBins()) {
                if (!TextUtils.isEmpty(str2)) {
                    if (TextUtils.isDigitsOnly(str2)) {
                        if (str.startsWith(str2)) {
                        }
                    } else if (str2.equalsIgnoreCase(TuitionPaymentFragmentspecialinlinedviewModeldefault3(str))) {
                    }
                }
            }
            return true;
        }
        if (TextUtils.isEmpty(str) || !this.b) {
            return false;
        }
        for (String str3 : this.asInterface.getBlacklistBins()) {
            if (!TextUtils.isEmpty(str3)) {
                if (TextUtils.isDigitsOnly(str3)) {
                    if (str.startsWith(str3)) {
                        return true;
                    }
                } else if (str3.equalsIgnoreCase(TuitionPaymentFragmentspecialinlinedviewModeldefault3(str))) {
                    return true;
                }
            }
        }
        return false;
    }
}

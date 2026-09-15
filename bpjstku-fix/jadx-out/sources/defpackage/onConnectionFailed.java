package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.bpjstku.R;
import com.bpjstku.presentation.bsu.CheckEligibleBsuResultActivity$special$$inlined$viewModel$default$1;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.core.Currency;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.models.SaveCardRequest;
import com.midtrans.sdk.corekit.models.snap.BankBinsResponse;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import com.midtrans.sdk.corekit.models.snap.MerchantData;
import com.midtrans.sdk.corekit.models.snap.SavedToken;
import com.midtrans.sdk.corekit.utilities.Utils;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes.dex */
public final class onConnectionFailed {
    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "c";
    private static onConnectionSuspended b;

    public static final class TuitionPaymentFragmentbindingInflater1 implements Comparator<getChildrenRequiredResolutions> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(getChildrenRequiredResolutions getchildrenrequiredresolutions, getChildrenRequiredResolutions getchildrenrequiredresolutions2) {
            return getchildrenrequiredresolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault2.compareTo(getchildrenrequiredresolutions2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Comparator<getCropRectOfReferenceAspectRatio> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(getCropRectOfReferenceAspectRatio getcroprectofreferenceaspectratio, getCropRectOfReferenceAspectRatio getcroprectofreferenceaspectratio2) {
            return getcroprectofreferenceaspectratio.TuitionPaymentFragmentspecialinlinedviewModeldefault2.compareTo(getcroprectofreferenceaspectratio2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends TypeToken<ArrayList<BankBinsResponse>> {
    }

    public static void TuitionPaymentFragmentbindingInflater1() {
        onConnectionSuspended onconnectionsuspended = b;
        if (onconnectionsuspended != null) {
            try {
                onconnectionsuspended.dismiss();
            } catch (RuntimeException e2) {
                StringBuilder sb = new StringBuilder("error while hiding progress dialog : ");
                sb.append(e2.getMessage());
                Logger.e(sb.toString());
            }
            b = null;
        }
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int i = 0;
        boolean z = false;
        for (int length = str.length() - 1; length >= 0; length--) {
            int i2 = Integer.parseInt(str.substring(length, length + 1));
            if (z && (i2 = i2 * 2) > 9) {
                i2 = (i2 % 10) + 1;
            }
            i += i2;
            z = !z;
        }
        boolean z2 = i % 10 == 0;
        Logger.i("isValid:".concat(String.valueOf(z2)));
        return z2;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        Pattern patternCompile;
        try {
            if (TextUtils.isEmpty(str) || (patternCompile = Pattern.compile(Constants.EMAIL_PATTERN, 2)) == null) {
                return false;
            }
            return patternCompile.matcher(str.trim()).matches();
        } catch (RuntimeException e2) {
            Logger.e(TuitionPaymentFragmentspecialinlinedviewModeldefault1, e2.getMessage());
            return false;
        }
    }

    public static void b(AppCompatActivity appCompatActivity) {
        TuitionPaymentFragmentbindingInflater1();
        try {
            onConnectionSuspended onconnectionsuspendedB = onConnectionSuspended.b();
            b = onconnectionsuspendedB;
            onconnectionsuspendedB.setCancelable(false);
            b.show(appCompatActivity.getSupportFragmentManager(), "");
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("error while creating progress dialog : ");
            sb.append(e2.getMessage());
            Logger.e(sb.toString());
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Activity activity) {
        try {
            Logger.i("hide keyboard");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        } catch (RuntimeException e2) {
            String str = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            StringBuilder sb = new StringBuilder("hideKeyboard():");
            sb.append(e2.getMessage());
            Logger.d(str, sb.toString());
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Activity activity, String str) {
        try {
            Toast.makeText(activity, str, 0).show();
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder("message:");
            sb.append(e2.getMessage());
            Logger.e("showToast", sb.toString());
        }
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        List<String> enabledPrinciples;
        if (MidtransSDK.getInstance().getMerchantData() == null || (enabledPrinciples = MidtransSDK.getInstance().getMerchantData().getEnabledPrinciples()) == null || !enabledPrinciples.contains("mastercard") || !enabledPrinciples.contains("visa")) {
            return 0;
        }
        if (enabledPrinciples.contains("jcb")) {
            return enabledPrinciples.contains("amex") ? 1 : 3;
        }
        return enabledPrinciples.contains("amex") ? 4 : 2;
    }

    public static List<SaveCardRequest> TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<SavedToken> list) {
        ArrayList arrayList = new ArrayList();
        MerchantData merchantData = MidtransSDK.getInstance().getMerchantData();
        String priorityCardFeature = merchantData.getPriorityCardFeature();
        if (list != null && !list.isEmpty()) {
            for (SavedToken savedToken : list) {
                String tokenType = savedToken.getTokenType();
                if ((priorityCardFeature != null && !priorityCardFeature.isEmpty() && priorityCardFeature.equals(SavedToken.TWO_CLICKS)) || !merchantData.getRecurringMidIsActive().booleanValue()) {
                    tokenType = priorityCardFeature;
                }
                arrayList.add(new SaveCardRequest(savedToken.getToken(), savedToken.getMaskedCard(), tokenType));
            }
        }
        return arrayList;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        byte[] bArr = new byte[128];
        try {
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.nextBytes(bArr);
            return secureRandom.nextInt(89999) + 10000;
        } catch (NoSuchAlgorithmException e2) {
            StringBuilder sb = new StringBuilder("random number : ");
            sb.append(e2.getMessage());
            Logger.e(sb.toString());
            return new Random().nextInt(89999) + 10000;
        }
    }

    public static String TuitionPaymentFragmentbindingInflater1(Context context, double d, String str) {
        String string = context.getString(R.string.prefix_money_negative, Utils.getFormattedAmount(d));
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            if (str.equals(Currency.IDR)) {
                return context.getString(R.string.prefix_money_negative, Utils.getFormattedAmount(d));
            }
            if (str.equals(Currency.SGD)) {
                return context.getString(R.string.prefix_money_negative_sgd, Utils.getFormattedAmount(d));
            }
        }
        return string;
    }

    public static ArrayList<BankBinsResponse> TuitionPaymentFragmentbindingInflater1(Context context) {
        if (CheckEligibleBsuResultActivity$special$$inlined$viewModel$default$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
            int i = 0 % 2;
            throw new ArithmeticException();
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open("bank_bins.json");
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return (ArrayList) new Gson().fromJson(new String(bArr, Hex.DEFAULT_CHARSET_NAME), new TuitionPaymentFragmentspecialinlinedviewModeldefault3().getType());
        } catch (Exception e2) {
            Logger.e(TuitionPaymentFragmentspecialinlinedviewModeldefault1, e2.getMessage());
            return null;
        }
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        StringBuilder sb = new StringBuilder();
        String strReplace = str.replace("-", "●●●●●●");
        for (int i = 0; i < strReplace.length(); i++) {
            if (i > 0 && i % 4 == 0) {
                sb.append(' ');
                sb.append(strReplace.charAt(i));
            } else {
                sb.append(strReplace.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(List<EnabledPayment> list, String str) {
        if (list == null) {
            return false;
        }
        Iterator<EnabledPayment> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getType().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.heightPixels / displayMetrics.ydpi;
        float f2 = displayMetrics.widthPixels / displayMetrics.xdpi;
        return Math.sqrt((double) ((f2 * f2) + (f * f))) >= 6.5d ? "TABLET" : "PHONE";
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, double d, String str) {
        String string = context.getString(R.string.prefix_money, Utils.getFormattedAmount(d));
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            if (str.equals(Currency.IDR)) {
                return context.getString(R.string.prefix_money, Utils.getFormattedAmount(d));
            }
            if (str.equals(Currency.SGD)) {
                return context.getString(R.string.prefix_money_sgd, Utils.getFormattedAmount(d));
            }
        }
        return string;
    }
}

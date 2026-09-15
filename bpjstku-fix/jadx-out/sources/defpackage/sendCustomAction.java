package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.uikit.widgets.MagicViewPager;

/* JADX INFO: loaded from: classes.dex */
public final class sendCustomAction extends FragmentStatePagerAdapter {
    private int TuitionPaymentFragmentbindingInflater1;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int b;

    public sendCustomAction(Context context, String str, FragmentManager fragmentManager, int i) {
        super(fragmentManager);
        this.TuitionPaymentFragmentbindingInflater1 = -1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
        this.b = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
    }

    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return (str.equalsIgnoreCase(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_alto)) || str.equalsIgnoreCase(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_atm_bersama))) ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.instruction_atm_with, str) : str;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public final Fragment getItem(int i) {
        byte b;
        String string = getPageTitle(i).toString();
        if (TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            return needToAddSensorResolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2, TuitionPaymentFragmentspecialinlinedviewModeldefault2(string));
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
            case -746273556:
                if (!str.equals(PaymentType.PERMATA_VA)) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 669135102:
                if (!str.equals("echannel")) {
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
            return getSortedChildSizes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, string);
        }
        if (b == 1) {
            return isAnyChildSizeCanBeCroppedOutWithoutUpscalingParent.TuitionPaymentFragmentbindingInflater1(i, string);
        }
        if (b == 2) {
            return getSupportedPrivResolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, string);
        }
        if (b != 3) {
            return b != 4 ? needToAddSensorResolutions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, TuitionPaymentFragmentspecialinlinedviewModeldefault2(string)) : isDoubleCropping.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, string);
        }
        return reverseRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, TuitionPaymentFragmentspecialinlinedviewModeldefault2(string));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return -2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        byte b;
        if (TextUtils.isEmpty(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_alto);
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
            case -746273556:
                if (!str.equals(PaymentType.PERMATA_VA)) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 669135102:
                if (!str.equals("echannel")) {
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
            if (i == 0) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_bca_atm);
            }
            return i == 1 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_bca_klik) : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_bca_mobile);
        }
        if (b == 1) {
            if (i == 0) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_atm_bni);
            }
            return i == 1 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_bni_mobile) : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_bni_internet);
        }
        if (b == 2) {
            if (i == 0) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_atm_bri);
            }
            return i == 1 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_bri_mobile) : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_bri_internet);
        }
        if (b == 3) {
            return i == 0 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_permata_atm) : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_alto);
        }
        if (b == 4) {
            return i == 0 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_mandiri_atm) : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_mandiri_internet);
        }
        if (i == 0) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_prima);
        }
        return i == 1 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_atm_bersama) : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getString(R.string.tab_alto);
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        if (i != this.TuitionPaymentFragmentbindingInflater1) {
            Fragment fragment = (Fragment) obj;
            MagicViewPager magicViewPager = (MagicViewPager) viewGroup;
            if (fragment == null || fragment.getView() == null) {
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = i;
            magicViewPager.TuitionPaymentFragmentbindingInflater1 = fragment.getView();
            magicViewPager.requestLayout();
        }
    }
}

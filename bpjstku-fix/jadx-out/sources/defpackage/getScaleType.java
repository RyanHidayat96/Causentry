package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.widget.Toast;
import com.midtrans.sdk.corekit.models.UserAddress;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class getScaleType {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Context TuitionPaymentFragmentbindingInflater1;
    private final getAspectRatio TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("AppVersionTracker");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
    }

    public getScaleType(Context context, getAspectRatio getaspectratio) {
        this.TuitionPaymentFragmentbindingInflater1 = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getaspectratio;
    }

    public final checkEffectTargets TuitionPaymentFragmentbindingInflater1() {
        PackageInfo packageInfo;
        long longVersionCode;
        try {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1() >= 33) {
                PackageManager packageManager = this.TuitionPaymentFragmentbindingInflater1.getPackageManager();
                String packageName = this.TuitionPaymentFragmentbindingInflater1.getPackageName();
                PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(0L);
                int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                if (UserAddress.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ArrayList()) != 0) {
                    throw new RuntimeException(String.valueOf(iIntValue));
                }
                packageInfo = packageManager.getPackageInfo(packageName, packageInfoFlagsOf);
            } else {
                int iIntValue2 = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
                if (getSchedulerHandler.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ArrayList()) != 0) {
                    int[] iArr = new int[iIntValue2];
                    int i = iIntValue2 - 1;
                    iArr[i] = 1;
                    Toast.makeText((Context) null, iArr[((iIntValue2 * i) % 2) - 1], 1).show();
                }
                packageInfo = this.TuitionPaymentFragmentbindingInflater1.getPackageManager().getPackageInfo(this.TuitionPaymentFragmentbindingInflater1.getPackageName(), 0);
            }
            if (packageInfo == null) {
                return null;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1() >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
            } else {
                longVersionCode = packageInfo.versionCode;
            }
            String str = packageInfo.versionName;
            if (longVersionCode < 1) {
                return null;
            }
            return new checkEffectTargets(longVersionCode, str);
        } catch (PackageManager.NameNotFoundException unused) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentbindingInflater1("Failed to determine app version from PackageInfo");
            }
            return null;
        }
    }
}

package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.midtrans.sdk.corekit.BuildConfig;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompatConnectionCallback {
    private static Map<String, Typeface> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashMap();

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, float f) {
        return Math.round(f * context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static int b(Context context, float f) {
        return Math.round(f / context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(BuildConfig.MARKET_URL.concat(String.valueOf(str))));
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
            if (((PackageItemInfo) ((ComponentInfo) resolveInfo.activityInfo).applicationInfo).packageName.equals("com.android.vending")) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(((PackageItemInfo) ((ComponentInfo) activityInfo).applicationInfo).packageName, ((PackageItemInfo) activityInfo).name);
                intent.addFlags(268435456);
                intent.addFlags(2097152);
                intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                intent.setComponent(componentName);
                context.startActivity(intent);
                return;
            }
        }
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(BuildConfig.PLAY_STORE_URL.concat(String.valueOf(str)))));
    }

    public static Typeface b(Context context, String str, String str2) {
        if (str == null) {
            return Typeface.DEFAULT;
        }
        String name = new File(str).getName();
        String name2 = !TextUtils.isEmpty(str2) ? new File(str2).getName() : "";
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3.containsKey(name)) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(name);
        }
        try {
            AssetManager assets = context.getResources().getAssets();
            if (Arrays.asList(assets.list("")).contains(str)) {
                Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), name);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(name, typefaceCreateFromAsset);
                return typefaceCreateFromAsset;
            }
            if (Arrays.asList(assets.list("fonts")).contains(name)) {
                Typeface typefaceCreateFromAsset2 = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", name));
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(name, typefaceCreateFromAsset2);
                return typefaceCreateFromAsset2;
            }
            if (Arrays.asList(assets.list("iconfonts")).contains(name)) {
                Typeface typefaceCreateFromAsset3 = Typeface.createFromAsset(context.getAssets(), String.format("iconfonts/%s", name));
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(name, typefaceCreateFromAsset3);
                return typefaceCreateFromAsset3;
            }
            if (TextUtils.isEmpty(str2) || !Arrays.asList(assets.list("")).contains(str2)) {
                throw new Exception("Font not Found");
            }
            Typeface typefaceCreateFromAsset4 = Typeface.createFromAsset(context.getAssets(), str2);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(name2, typefaceCreateFromAsset4);
            return typefaceCreateFromAsset4;
        } catch (Exception unused) {
            Logger.e(FancyButton.TuitionPaymentFragmentspecialinlinedviewModeldefault2, String.format("Unable to find %s font. Using Typeface.DEFAULT instead.", name));
            TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(name, Typeface.DEFAULT);
            return Typeface.DEFAULT;
        }
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(Context context, String str) {
        try {
            context.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\n\u0010\u000f"}, d2 = {"LgetRccTransportControlFlagsFromActions;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/res/Configuration;", "p1", "Lkotlin/Pair;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/content/Context;Landroid/content/res/Configuration;)Lkotlin/Pair;", "b", "(Landroid/content/Context;)Landroid/content/Context;", "Landroid/content/res/Resources;", "(Landroid/content/Context;Landroid/content/res/Resources;)Landroid/content/res/Resources;"}, k = 1, mv = {1, 4, 2})
public final class getRccTransportControlFlagsFromActions {
    public static final getRccTransportControlFlagsFromActions INSTANCE = new getRccTransportControlFlagsFromActions();

    private getRccTransportControlFlagsFromActions() {
    }

    public final Context b(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Resources resources = p0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Pair<Configuration, Boolean> pairTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, configuration);
        Configuration configurationComponent1 = pairTuitionPaymentFragmentspecialinlinedviewModeldefault3.component1();
        boolean zBooleanValue = pairTuitionPaymentFragmentspecialinlinedviewModeldefault3.component2().booleanValue();
        if (zBooleanValue) {
            Context contextCreateConfigurationContext = p0.createConfigurationContext(configurationComponent1);
            Intrinsics.checkNotNullExpressionValue(contextCreateConfigurationContext, "");
            return contextCreateConfigurationContext;
        }
        if (zBooleanValue) {
            Resources resources2 = p0.getResources();
            Resources resources3 = p0.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "");
            resources2.updateConfiguration(configurationComponent1, resources3.getDisplayMetrics());
        }
        return p0;
    }

    public final Resources TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, Resources p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Configuration configuration = p1.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        Pair<Configuration, Boolean> pairTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, configuration);
        Configuration configurationComponent1 = pairTuitionPaymentFragmentspecialinlinedviewModeldefault3.component1();
        boolean zBooleanValue = pairTuitionPaymentFragmentspecialinlinedviewModeldefault3.component2().booleanValue();
        if (zBooleanValue) {
            Context contextCreateConfigurationContext = p0.createConfigurationContext(configurationComponent1);
            Intrinsics.checkNotNullExpressionValue(contextCreateConfigurationContext, "");
            Resources resources = contextCreateConfigurationContext.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            return resources;
        }
        if (!zBooleanValue) {
            return p1;
        }
        Resources resources2 = p0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        return new Resources(p0.getAssets(), displayMetrics, configurationComponent1);
    }

    public static Pair<Configuration, Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, Configuration p1) {
        Locale locale;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Locale localeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MediaSessionCompatCallbackStubApi21.INSTANCE.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, MediaSessionCompatCallbackStubApi21.b(p0));
        if (Build.VERSION.SDK_INT >= 26) {
            locale = p1.getLocales().get(0);
            if (locale == null) {
                locale = Locale.getDefault();
            }
            Intrinsics.checkNotNullExpressionValue(locale, "");
        } else {
            locale = p1.locale;
            Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        if (!(!StringsKt.equals(locale.toString(), localeTuitionPaymentFragmentspecialinlinedviewModeldefault1.toString(), true))) {
            return TuplesKt.to(p1, Boolean.FALSE);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            LocaleList localeList = new LocaleList(localeTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            LocaleList.setDefault(localeList);
            Configuration configuration = new Configuration(p1);
            configuration.setLocale(localeTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            configuration.setLocales(localeList);
            return TuplesKt.to(configuration, Boolean.TRUE);
        }
        Configuration configuration2 = new Configuration(p1);
        configuration2.setLocale(localeTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return TuplesKt.to(configuration2, Boolean.TRUE);
    }
}

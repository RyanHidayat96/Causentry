package androidx.p005navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.p013savedstate.SavedStateReader;
import com.google.firebase.messaging.Constants;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Navigator.Name("activity")
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001e\u001f\u001dB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0004\u001a\u00020\u00022\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00038GX\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$Destination;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "createDestination", "()Landroidx/navigation/ActivityNavigator$Destination;", "", "popBackStack", "()Z", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p1", "Landroidx/navigation/NavOptions;", "p2", "Landroidx/navigation/Navigator$Extras;", "p3", "Landroidx/navigation/NavDestination;", "navigate", "(Landroidx/navigation/ActivityNavigator$Destination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Landroidx/navigation/NavDestination;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "hostActivity", "Landroid/app/Activity;", "Companion", "Destination", "Extras"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ActivityNavigator extends Navigator<Destination> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXTRA_NAV_CURRENT = "android-support-navigation:ActivityNavigator:current";
    private static final String EXTRA_NAV_SOURCE = "android-support-navigation:ActivityNavigator:source";
    private static final String EXTRA_POP_ENTER_ANIM = "android-support-navigation:ActivityNavigator:popEnterAnim";
    private static final String EXTRA_POP_EXIT_ANIM = "android-support-navigation:ActivityNavigator:popExitAnim";
    private static final String LOG_TAG = "ActivityNavigator";
    private final Context context;
    private final Activity hostActivity;

    public final Context getContext() {
        return this.context;
    }

    public ActivityNavigator(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
        for (Object obj : SequencesKt.generateSequence(context, (Function1<? super Context, ? extends Context>) new Function1() { // from class: androidx.navigation.ActivityNavigator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ActivityNavigator.hostActivity$lambda$0((Context) obj2);
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.hostActivity = (Activity) obj;
            }
        }
        obj = null;
        this.hostActivity = (Activity) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context hostActivity$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    @Override // androidx.p005navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    @Override // androidx.p005navigation.Navigator
    public boolean popBackStack() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.p005navigation.Navigator
    public NavDestination navigate(Destination p0, Bundle p1, NavOptions p2, Navigator.Extras p3) {
        ActivityOptionsCompat activityOptions;
        Intent intent;
        int intExtra;
        String strEncode;
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.getIntent() == null) {
            StringBuilder sb = new StringBuilder("Destination ");
            sb.append(p0.getId());
            sb.append(" does not have an Intent set.");
            throw new IllegalStateException(sb.toString().toString());
        }
        Intent intent2 = new Intent(p0.getIntent());
        if (p1 != null) {
            intent2.putExtras(p1);
            String dataPattern = p0.getDataPattern();
            String str = dataPattern;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p1);
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNull(strGroup);
                    if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, strGroup)) {
                        StringBuilder sb2 = new StringBuilder("Could not find ");
                        sb2.append(strGroup);
                        sb2.append(" in ");
                        sb2.append(p1);
                        sb2.append(" to fill data pattern ");
                        sb2.append(dataPattern);
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    NavArgument navArgument = p0.getArguments().get(strGroup);
                    NavType<Object> type = navArgument != null ? navArgument.getType() : null;
                    if (type == null || (strEncode = type.serializeAsValue(type.get(p1, strGroup))) == null) {
                        strEncode = Uri.encode(String.valueOf(p1.get(strGroup)));
                    }
                    stringBuffer.append(strEncode);
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z = p3 instanceof Extras;
        if (z) {
            intent2.addFlags(((Extras) p3).getFlags());
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (p2 != null && p2.getSingleTop()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(EXTRA_NAV_CURRENT, 0)) != 0) {
            intent2.putExtra(EXTRA_NAV_SOURCE, intExtra);
        }
        intent2.putExtra(EXTRA_NAV_CURRENT, p0.getId());
        Resources resources = this.context.getResources();
        if (p2 != null) {
            int popEnterAnim = p2.getPopEnterAnim();
            int popExitAnim = p2.getPopExitAnim();
            if ((popEnterAnim > 0 && Intrinsics.areEqual(resources.getResourceTypeName(popEnterAnim), "animator")) || (popExitAnim > 0 && Intrinsics.areEqual(resources.getResourceTypeName(popExitAnim), "animator"))) {
                resources.getResourceName(popEnterAnim);
                resources.getResourceName(popExitAnim);
                Objects.toString(p0);
            } else {
                intent2.putExtra(EXTRA_POP_ENTER_ANIM, popEnterAnim);
                Intrinsics.checkNotNull(intent2.putExtra(EXTRA_POP_EXIT_ANIM, popExitAnim));
            }
        }
        if (z && (activityOptions = ((Extras) p3).getActivityOptions()) != null) {
            ActivityCompat.startActivity(this.context, intent2, activityOptions.toBundle());
        } else {
            this.context.startActivity(intent2);
        }
        if (p2 != null && this.hostActivity != null) {
            int enterAnim = p2.getEnterAnim();
            int exitAnim = p2.getExitAnim();
            if ((enterAnim > 0 && Intrinsics.areEqual(resources.getResourceTypeName(enterAnim), "animator")) || (exitAnim > 0 && Intrinsics.areEqual(resources.getResourceTypeName(exitAnim), "animator"))) {
                resources.getResourceName(enterAnim);
                resources.getResourceName(exitAnim);
                Objects.toString(p0);
            } else if (enterAnim >= 0 || exitAnim >= 0) {
                this.hostActivity.overridePendingTransition(RangesKt.coerceAtLeast(enterAnim, 0), RangesKt.coerceAtLeast(exitAnim, 0));
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\rJ\u0019\u0010\u0018\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u001a\u0010\rJ\u0019\u0010\u001c\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0017¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R(\u0010)\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b8\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R(\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\"R(\u00100\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8G@BX\u0087\u000e¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\"R(\u00102\u001a\u0004\u0018\u00010\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u00178G@BX\u0087\u000e¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R(\u00106\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b8G@BX\u0087\u000e¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u0010\"R(\u00108\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001b8G@BX\u0087\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;"}, d2 = {"Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/Navigator;", "p0", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "Landroid/content/Intent;", "setIntent", "(Landroid/content/Intent;)Landroidx/navigation/ActivityNavigator$Destination;", "", "setDataPattern", "(Ljava/lang/String;)Landroidx/navigation/ActivityNavigator$Destination;", "Landroid/content/Context;", "Landroid/util/AttributeSet;", "p1", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "parseApplicationId", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "setTargetPackage", "Landroid/content/ComponentName;", "setComponentName", "(Landroid/content/ComponentName;)Landroidx/navigation/ActivityNavigator$Destination;", "setAction", "Landroid/net/Uri;", "setData", "(Landroid/net/Uri;)Landroidx/navigation/ActivityNavigator$Destination;", "", "supportsActions", "()Z", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "intent", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "dataPattern", "Ljava/lang/String;", "getDataPattern", "targetPackage", "getTargetPackage", "component", "Landroid/content/ComponentName;", "getComponent", "()Landroid/content/ComponentName;", "action", "getAction", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class Destination extends NavDestination {
        private String action;
        private ComponentName component;
        private Uri data;
        private String dataPattern;
        private Intent intent;
        private String targetPackage;

        @Override // androidx.p005navigation.NavDestination
        public boolean supportsActions() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> navigator) {
            super(navigator);
            Intrinsics.checkNotNullParameter(navigator, "");
        }

        public final Intent getIntent() {
            return this.intent;
        }

        public final String getDataPattern() {
            return this.dataPattern;
        }

        public final Destination setIntent(Intent p0) {
            this.intent = p0;
            return this;
        }

        public final Destination setDataPattern(String p0) {
            this.dataPattern = p0;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(ActivityNavigator.class));
            Intrinsics.checkNotNullParameter(navigatorProvider, "");
        }

        @Override // androidx.p005navigation.NavDestination
        public void onInflate(Context p0, AttributeSet p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            super.onInflate(p0, p1);
            TypedArray typedArrayObtainAttributes = p0.getResources().obtainAttributes(p1, R.styleable.ActivityNavigator);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "");
            setTargetPackage(parseApplicationId(p0, typedArrayObtainAttributes.getString(R.styleable.ActivityNavigator_targetPackage)));
            String string = typedArrayObtainAttributes.getString(R.styleable.ActivityNavigator_android_name);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(p0.getPackageName());
                    sb.append(string);
                    string = sb.toString();
                }
                setComponentName(new ComponentName(p0, string));
            }
            setAction(typedArrayObtainAttributes.getString(R.styleable.ActivityNavigator_action));
            String applicationId = parseApplicationId(p0, typedArrayObtainAttributes.getString(R.styleable.ActivityNavigator_data));
            if (applicationId != null) {
                setData(Uri.parse(applicationId));
            }
            setDataPattern(parseApplicationId(p0, typedArrayObtainAttributes.getString(R.styleable.ActivityNavigator_dataPattern)));
            typedArrayObtainAttributes.recycle();
        }

        private final String parseApplicationId(Context p0, String p1) {
            if (p1 == null) {
                return null;
            }
            String packageName = p0.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return StringsKt.replace$default(p1, NavInflater.APPLICATION_ID_PLACEHOLDER, packageName, false, 4, (Object) null);
        }

        public final String getTargetPackage() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        public final Destination setTargetPackage(String p0) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            Intrinsics.checkNotNull(intent);
            intent.setPackage(p0);
            return this;
        }

        public final ComponentName getComponent() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        public final Destination setComponentName(ComponentName p0) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            Intrinsics.checkNotNull(intent);
            intent.setComponent(p0);
            return this;
        }

        public final String getAction() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        public final Destination setAction(String p0) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            Intrinsics.checkNotNull(intent);
            intent.setAction(p0);
            return this;
        }

        public final Uri getData() {
            Intent intent = this.intent;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        public final Destination setData(Uri p0) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent = this.intent;
            Intrinsics.checkNotNull(intent);
            intent.setData(p0);
            return this;
        }

        @Override // androidx.p005navigation.NavDestination
        public String toString() {
            ComponentName component = getComponent();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                String action = getAction();
                if (action != null) {
                    sb.append(" action=");
                    sb.append(action);
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // androidx.p005navigation.NavDestination
        public boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 == null || !(p0 instanceof Destination) || !super.equals(p0)) {
                return false;
            }
            Intent intent = this.intent;
            if (intent != null) {
                if (!intent.filterEquals(((Destination) p0).intent)) {
                    return false;
                }
            } else if (((Destination) p0).intent != null) {
                return false;
            }
            return Intrinsics.areEqual(this.dataPattern, ((Destination) p0).dataPattern);
        }

        @Override // androidx.p005navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode();
            Intent intent = this.intent;
            int iFilterHashCode = intent != null ? intent.filterHashCode() : 0;
            String str = this.dataPattern;
            return (((iHashCode * 31) + iFilterHashCode) * 31) + (str != null ? str.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0010B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "", "p0", "Landroidx/core/app/ActivityOptionsCompat;", "p1", "<init>", "(ILandroidx/core/app/ActivityOptionsCompat;)V", "flags", "I", "getFlags", "()I", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "getActivityOptions", "()Landroidx/core/app/ActivityOptionsCompat;", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Extras implements Navigator.Extras {
        private final ActivityOptionsCompat activityOptions;
        private final int flags;

        public Extras(int i, ActivityOptionsCompat activityOptionsCompat) {
            this.flags = i;
            this.activityOptions = activityOptionsCompat;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final ActivityOptionsCompat getActivityOptions() {
            return this.activityOptions;
        }

        /* JADX INFO: loaded from: classes4.dex */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras$Builder;", "", "<init>", "()V", "", "p0", "addFlags", "(I)Landroidx/navigation/ActivityNavigator$Extras$Builder;", "Landroidx/core/app/ActivityOptionsCompat;", "setActivityOptions", "(Landroidx/core/app/ActivityOptionsCompat;)Landroidx/navigation/ActivityNavigator$Extras$Builder;", "Landroidx/navigation/ActivityNavigator$Extras;", "build", "()Landroidx/navigation/ActivityNavigator$Extras;", "flags", "I", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Builder {
            private ActivityOptionsCompat activityOptions;
            private int flags;

            public final Builder addFlags(int p0) {
                this.flags = p0 | this.flags;
                return this;
            }

            public final Builder setActivityOptions(ActivityOptionsCompat p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                this.activityOptions = p0;
                return this;
            }

            public final Extras build() {
                return new Extras(this.flags, this.activityOptions);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b"}, d2 = {"Landroidx/navigation/ActivityNavigator$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "p0", "", "applyPopAnimationsToPendingTransition", "(Landroid/app/Activity;)V", "", "EXTRA_NAV_SOURCE", "Ljava/lang/String;", "EXTRA_NAV_CURRENT", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final void applyPopAnimationsToPendingTransition(Activity p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intent intent = p0.getIntent();
            if (intent != null) {
                int intExtra = intent.getIntExtra(ActivityNavigator.EXTRA_POP_ENTER_ANIM, -1);
                int intExtra2 = intent.getIntExtra(ActivityNavigator.EXTRA_POP_EXIT_ANIM, -1);
                if (intExtra == -1 && intExtra2 == -1) {
                    return;
                }
                if (intExtra == -1) {
                    intExtra = 0;
                }
                if (intExtra2 == -1) {
                    intExtra2 = 0;
                }
                p0.overridePendingTransition(intExtra, intExtra2);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final void applyPopAnimationsToPendingTransition(Activity activity) {
        INSTANCE.applyPopAnimationsToPendingTransition(activity);
    }
}

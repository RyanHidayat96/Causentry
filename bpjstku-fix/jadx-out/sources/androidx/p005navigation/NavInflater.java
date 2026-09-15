package androidx.p005navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
import androidx.p005navigation.common.R;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\n\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u0012J/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\f2\n\u0010\u0005\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010!\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Landroidx/navigation/NavInflater;", "", "Landroid/content/Context;", "p0", "Landroidx/navigation/NavigatorProvider;", "p1", "<init>", "(Landroid/content/Context;Landroidx/navigation/NavigatorProvider;)V", "", "Landroidx/navigation/NavGraph;", "inflate", "(I)Landroidx/navigation/NavGraph;", "Landroid/content/res/Resources;", "Landroid/content/res/XmlResourceParser;", "Landroid/util/AttributeSet;", "p2", "p3", "Landroidx/navigation/NavDestination;", "(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;I)Landroidx/navigation/NavDestination;", "", "inflateArgumentForDestination", "(Landroid/content/res/Resources;Landroidx/navigation/NavDestination;Landroid/util/AttributeSet;I)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "inflateArgumentForBundle", "(Landroid/content/res/Resources;Landroid/os/Bundle;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "Landroidx/navigation/NavArgument;", "inflateArgument", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources;I)Landroidx/navigation/NavArgument;", "inflateDeepLink", "(Landroid/content/res/Resources;Landroidx/navigation/NavDestination;Landroid/util/AttributeSet;)V", "p4", "inflateAction", "(Landroid/content/res/Resources;Landroidx/navigation/NavDestination;Landroid/util/AttributeSet;Landroid/content/res/XmlResourceParser;I)V", "context", "Landroid/content/Context;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavInflater {
    public static final String APPLICATION_ID_PLACEHOLDER = "${applicationId}";
    private static final String TAG_ACTION = "action";
    private static final String TAG_ARGUMENT = "argument";
    private static final String TAG_DEEP_LINK = "deepLink";
    private static final String TAG_INCLUDE = "include";
    private final Context context;
    private final NavigatorProvider navigatorProvider;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ThreadLocal<TypedValue> sTmpValue = new ThreadLocal<>();

    public NavInflater(Context context, NavigatorProvider navigatorProvider) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(navigatorProvider, "");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }

    public final NavGraph inflate(int p0) {
        int next;
        Resources resources = this.context.getResources();
        XmlResourceParser xml = resources.getXml(p0);
        Intrinsics.checkNotNullExpressionValue(xml, "");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception inflating ");
                    sb.append(resources.getResourceName(p0));
                    sb.append(" line ");
                    sb.append(xml.getLineNumber());
                    throw new RuntimeException(sb.toString(), e2);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        Intrinsics.checkNotNull(resources);
        Intrinsics.checkNotNull(attributeSetAsAttributeSet);
        NavDestination navDestinationInflate = inflate(resources, xml, attributeSetAsAttributeSet, p0);
        if (!(navDestinationInflate instanceof NavGraph)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root element <");
            sb2.append(name);
            sb2.append("> did not inflate into a NavGraph");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        NavGraph navGraph = (NavGraph) navDestinationInflate;
        xml.close();
        return navGraph;
    }

    private final NavDestination inflate(Resources p0, XmlResourceParser p1, AttributeSet p2, int p3) throws XmlPullParserException, IOException {
        int depth;
        NavigatorProvider navigatorProvider = this.navigatorProvider;
        String name = p1.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        NavDestination navDestinationCreateDestination = navigatorProvider.getNavigator(name).createDestination();
        navDestinationCreateDestination.onInflate(this.context, p2);
        int depth2 = p1.getDepth() + 1;
        while (true) {
            int next = p1.next();
            if (next == 1 || ((depth = p1.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = p1.getName();
                if (Intrinsics.areEqual(TAG_ARGUMENT, name2)) {
                    inflateArgumentForDestination(p0, navDestinationCreateDestination, p2, p3);
                } else if (Intrinsics.areEqual(TAG_DEEP_LINK, name2)) {
                    inflateDeepLink(p0, navDestinationCreateDestination, p2);
                } else if (Intrinsics.areEqual(TAG_ACTION, name2)) {
                    inflateAction(p0, navDestinationCreateDestination, p2, p1, p3);
                } else if (Intrinsics.areEqual(TAG_INCLUDE, name2) && (navDestinationCreateDestination instanceof NavGraph)) {
                    TypedArray typedArrayObtainAttributes = p0.obtainAttributes(p2, R.styleable.NavInclude);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "");
                    ((NavGraph) navDestinationCreateDestination).addDestination(inflate(typedArrayObtainAttributes.getResourceId(R.styleable.NavInclude_graph, 0)));
                    Unit unit = Unit.INSTANCE;
                    typedArrayObtainAttributes.recycle();
                } else if (navDestinationCreateDestination instanceof NavGraph) {
                    ((NavGraph) navDestinationCreateDestination).addDestination(inflate(p0, p1, p2, p3));
                }
            }
        }
        return navDestinationCreateDestination;
    }

    private final void inflateArgumentForDestination(Resources p0, NavDestination p1, AttributeSet p2, int p3) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = p0.obtainAttributes(p2, R.styleable.NavArgument);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "");
        String string = typedArrayObtainAttributes.getString(R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        p1.addArgument(string, inflateArgument(typedArrayObtainAttributes, p0, p3));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    private final void inflateArgumentForBundle(Resources p0, Bundle p1, AttributeSet p2, int p3) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = p0.obtainAttributes(p2, R.styleable.NavArgument);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "");
        String string = typedArrayObtainAttributes.getString(R.styleable.NavArgument_android_name);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        NavArgument navArgumentInflateArgument = inflateArgument(typedArrayObtainAttributes, p0, p3);
        if (navArgumentInflateArgument.getIsDefaultValuePresent()) {
            navArgumentInflateArgument.putDefaultValue(string, p1);
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    private final NavArgument inflateArgument(TypedArray p0, Resources p1, int p2) throws XmlPullParserException {
        int iValueOf;
        NavArgument.Builder builder = new NavArgument.Builder();
        builder.setIsNullable(p0.getBoolean(R.styleable.NavArgument_nullable, false));
        ThreadLocal<TypedValue> threadLocal = sTmpValue;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = p0.getString(R.styleable.NavArgument_argType);
        Object value = null;
        NavType<?> navTypeFromArgType = string != null ? NavType.INSTANCE.fromArgType(string, p1.getResourcePackageName(p2)) : null;
        if (p0.getValue(R.styleable.NavArgument_android_defaultValue, typedValue)) {
            if (navTypeFromArgType == NavType.ReferenceType) {
                if (typedValue.resourceId != 0) {
                    iValueOf = Integer.valueOf(typedValue.resourceId);
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    iValueOf = 0;
                } else {
                    StringBuilder sb = new StringBuilder("unsupported value '");
                    sb.append((Object) typedValue.string);
                    sb.append("' for ");
                    sb.append(navTypeFromArgType.getName());
                    sb.append(". Must be a reference to a resource.");
                    throw new XmlPullParserException(sb.toString());
                }
                value = iValueOf;
            } else if (typedValue.resourceId != 0) {
                if (navTypeFromArgType == null) {
                    navTypeFromArgType = NavType.ReferenceType;
                    value = Integer.valueOf(typedValue.resourceId);
                } else {
                    StringBuilder sb2 = new StringBuilder("unsupported value '");
                    sb2.append((Object) typedValue.string);
                    sb2.append("' for ");
                    sb2.append(navTypeFromArgType.getName());
                    sb2.append(". You must use a \"");
                    sb2.append(NavType.ReferenceType.getName());
                    sb2.append("\" type to reference other resources.");
                    throw new XmlPullParserException(sb2.toString());
                }
            } else if (navTypeFromArgType == NavType.StringType) {
                value = p0.getString(R.styleable.NavArgument_android_defaultValue);
            } else {
                int i = typedValue.type;
                if (i == 3) {
                    String string2 = typedValue.string.toString();
                    if (navTypeFromArgType == null) {
                        navTypeFromArgType = NavType.INSTANCE.inferFromValue(string2);
                    }
                    value = navTypeFromArgType.parseValue(string2);
                } else if (i == 4) {
                    navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, navTypeFromArgType, NavType.FloatType, string, TypedValues.Custom.S_FLOAT);
                    value = Float.valueOf(typedValue.getFloat());
                } else if (i == 5) {
                    navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, navTypeFromArgType, NavType.IntType, string, TypedValues.Custom.S_DIMENSION);
                    value = Integer.valueOf((int) typedValue.getDimension(p1.getDisplayMetrics()));
                } else if (i == 18) {
                    navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, navTypeFromArgType, NavType.BoolType, string, TypedValues.Custom.S_BOOLEAN);
                    value = Boolean.valueOf(typedValue.data != 0);
                } else if (typedValue.type >= 16 && typedValue.type <= 31) {
                    if (navTypeFromArgType == NavType.FloatType) {
                        navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, navTypeFromArgType, NavType.FloatType, string, TypedValues.Custom.S_FLOAT);
                        value = Float.valueOf(typedValue.data);
                    } else {
                        navTypeFromArgType = INSTANCE.checkNavType$navigation_runtime_release(typedValue, navTypeFromArgType, NavType.IntType, string, TypedValues.Custom.S_INT);
                        value = Integer.valueOf(typedValue.data);
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder("unsupported argument type ");
                    sb3.append(typedValue.type);
                    throw new XmlPullParserException(sb3.toString());
                }
            }
        }
        if (value != null) {
            builder.setDefaultValue(value);
        }
        if (navTypeFromArgType != null) {
            builder.setType(navTypeFromArgType);
        }
        return builder.build();
    }

    private final void inflateDeepLink(Resources p0, NavDestination p1, AttributeSet p2) throws XmlPullParserException {
        String str;
        String str2;
        TypedArray typedArrayObtainAttributes = p0.obtainAttributes(p2, R.styleable.NavDeepLink);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "");
        String string = typedArrayObtainAttributes.getString(R.styleable.NavDeepLink_uri);
        String string2 = typedArrayObtainAttributes.getString(R.styleable.NavDeepLink_action);
        String string3 = typedArrayObtainAttributes.getString(R.styleable.NavDeepLink_mimeType);
        String str3 = string;
        if ((str3 == null || str3.length() == 0) && (((str = string2) == null || str.length() == 0) && ((str2 = string3) == null || str2.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        NavDeepLink.Builder builder = new NavDeepLink.Builder();
        if (string != null) {
            String packageName = this.context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            builder.setUriPattern(StringsKt.replace$default(string, APPLICATION_ID_PLACEHOLDER, packageName, false, 4, (Object) null));
        }
        String str4 = string2;
        if (str4 != null && str4.length() != 0) {
            String packageName2 = this.context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, "");
            builder.setAction(StringsKt.replace$default(string2, APPLICATION_ID_PLACEHOLDER, packageName2, false, 4, (Object) null));
        }
        if (string3 != null) {
            String packageName3 = this.context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName3, "");
            builder.setMimeType(StringsKt.replace$default(string3, APPLICATION_ID_PLACEHOLDER, packageName3, false, 4, (Object) null));
        }
        p1.addDeepLink(builder.build());
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    private final void inflateAction(Resources p0, NavDestination p1, AttributeSet p2, XmlResourceParser p3, int p4) throws XmlPullParserException, IOException {
        Pair[] pairArr;
        int depth;
        Context context = this.context;
        int[] iArr = R.styleable.NavAction;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p2, iArr, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavAction_android_id, 0);
        NavAction navAction = new NavAction(typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavAction_destination, 0), null, null, 6, null);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NavAction_launchSingleTop, false));
        builder.setRestoreState(typedArrayObtainStyledAttributes.getBoolean(R.styleable.NavAction_restoreState, false));
        builder.setPopUpTo(typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavAction_popUpTo, -1), typedArrayObtainStyledAttributes.getBoolean(R.styleable.NavAction_popUpToInclusive, false), typedArrayObtainStyledAttributes.getBoolean(R.styleable.NavAction_popUpToSaveState, false));
        builder.setEnterAnim(typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavAction_enterAnim, -1));
        builder.setExitAnim(typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavAction_exitAnim, -1));
        builder.setPopEnterAnim(typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavAction_popEnterAnim, -1));
        builder.setPopExitAnim(typedArrayObtainStyledAttributes.getResourceId(R.styleable.NavAction_popExitAnim, -1));
        navAction.setNavOptions(builder.build());
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        int depth2 = p3.getDepth() + 1;
        while (true) {
            int next = p3.next();
            if (next == 1 || ((depth = p3.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && Intrinsics.areEqual(TAG_ARGUMENT, p3.getName())) {
                inflateArgumentForBundle(p0, bundleBundleOf, p2, p4);
            }
        }
        if (!SavedStateReader.m7446isEmptyimpl(SavedStateReader.m7368constructorimpl(bundleBundleOf))) {
            navAction.setDefaultArguments(bundleBundleOf);
        }
        p1.putAction(resourceId, navAction);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/navigation/NavInflater$Companion;", "", "<init>", "()V", "Landroid/util/TypedValue;", "p0", "Landroidx/navigation/NavType;", "p1", "p2", "", "p3", "p4", "checkNavType$navigation_runtime_release", "(Landroid/util/TypedValue;Landroidx/navigation/NavType;Landroidx/navigation/NavType;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavType;", "TAG_ARGUMENT", "Ljava/lang/String;", "TAG_DEEP_LINK", "TAG_ACTION", "TAG_INCLUDE", "APPLICATION_ID_PLACEHOLDER", "Ljava/lang/ThreadLocal;", "sTmpValue", "Ljava/lang/ThreadLocal;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final NavType<?> checkNavType$navigation_runtime_release(TypedValue p0, NavType<?> p1, NavType<?> p2, String p3, String p4) throws XmlPullParserException {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p4, "");
            if (p1 == null || p1 == p2) {
                return p1 == null ? p2 : p1;
            }
            StringBuilder sb = new StringBuilder("Type is ");
            sb.append(p3);
            sb.append(" but found ");
            sb.append(p4);
            sb.append(": ");
            sb.append(p0.data);
            throw new XmlPullParserException(sb.toString());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

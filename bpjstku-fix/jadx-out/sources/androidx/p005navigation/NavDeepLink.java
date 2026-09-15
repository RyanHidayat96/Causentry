package androidx.p005navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.p009serialization.RouteSerializerKt;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import defpackage.CameraController2;
import defpackage.updateMirroringFlagInOutputFileOptions;
import defpackage.updatePreviewViewTransform;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u0000 t2\u00020\u0001:\u0004uvwtB'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ1\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\u0010\u0005\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u000fj\u0002`\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0012\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00112\u000e\u0010\u0003\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\n\u0010\u0003\u001a\u00060\u000fj\u0002`\u00102\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0007¢\u0006\u0004\b!\u0010\"J9\u0010#\u001a\u00060\u001fj\u0002` 2\u000e\u0010\u0003\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0001¢\u0006\u0004\b#\u0010\"J;\u0010$\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0004\u001a\u00060\u001fj\u0002` 2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0002¢\u0006\u0004\b$\u0010%J9\u0010'\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020&2\n\u0010\u0004\u001a\u00060\u001fj\u0002` 2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0002¢\u0006\u0004\b'\u0010(J=\u0010)\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u000fj\u0002`\u00102\n\u0010\u0004\u001a\u00060\u001fj\u0002` 2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0002¢\u0006\u0004\b)\u0010*JG\u0010.\u001a\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020+2\u0006\u0010\u0004\u001a\u00020,2\n\u0010\u0005\u001a\u00060\u001fj\u0002` 2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u001a2\u000e\u0010\u0003\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0000¢\u0006\u0004\b0\u00101J5\u00102\u001a\u00020\f2\n\u0010\u0003\u001a\u00060\u001fj\u0002` 2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b2\u00103J7\u00104\u001a\u00020\u00112\n\u0010\u0003\u001a\u00060\u001fj\u0002` 2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010-\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u001aH\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,0<H\u0002¢\u0006\u0004\b=\u0010>J#\u0010@\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010?H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\fH\u0002¢\u0006\u0004\bB\u0010;J\u0013\u0010C\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\bC\u0010DR\u001c\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010I\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010HR\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010F\u001a\u0004\bL\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010FR\u001d\u0010U\u001a\u0004\u0018\u00010P8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001b\u0010W\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\f\n\u0004\bV\u0010R\u001a\u0004\bW\u0010XR'\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,0<8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\bY\u0010R\u001a\u0004\bZ\u0010>R\u0016\u0010\\\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R/\u0010`\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010?8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b^\u0010R\u001a\u0004\b_\u0010AR!\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00020\t8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\ba\u0010R\u001a\u0004\bb\u0010cR\u001d\u0010g\u001a\u0004\u0018\u00010\u00028CX\u0083\u0084\u0002¢\u0006\f\n\u0004\be\u0010R\u001a\u0004\bf\u0010HR\u001d\u0010j\u001a\u0004\u0018\u00010P8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\bh\u0010R\u001a\u0004\bi\u0010TR\u0018\u0010k\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bk\u0010FR\u001d\u0010n\u001a\u0004\u0018\u00010P8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\bl\u0010R\u001a\u0004\bm\u0010TR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00020+8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010cR*\u0010q\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00118G@AX\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010]\u001a\u0004\bq\u0010X\"\u0004\br\u0010s"}, d2 = {"Landroidx/navigation/NavDeepLink;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "buildRegex", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/StringBuilder;)V", "Landroid/net/Uri;", "Landroidx/navigation/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "matches$navigation_common_release", "(Landroid/net/Uri;)Z", "Landroidx/navigation/NavDeepLinkRequest;", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "matchUri", "matchAction", "(Ljava/lang/String;)Z", "matchMimeType", "", "getMimeTypeMatchRating", "(Ljava/lang/String;)I", "", "Landroidx/navigation/NavArgument;", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "getMatchingArguments", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "getMatchingPathAndQueryArgs$navigation_common_release", "getMatchingUriFragment", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)V", "Lkotlin/text/MatchResult;", "getMatchingPathArguments", "(Lkotlin/text/MatchResult;Landroid/os/Bundle;Ljava/util/Map;)Z", "getMatchingQueryArguments", "(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z", "", "Landroidx/navigation/NavDeepLink$ParamQuery;", "p3", "parseInputParams", "(Ljava/util/List;Landroidx/navigation/NavDeepLink$ParamQuery;Landroid/os/Bundle;Ljava/util/Map;)Z", "calculateMatchingPathSegments$navigation_common_release", "(Landroid/net/Uri;)I", "parseArgument", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "parseArgumentForRepeatedParam", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavArgument;)Z", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "parsePath", "()V", "", "parseQuery", "()Ljava/util/Map;", "Lkotlin/Pair;", "parseFragment", "()Lkotlin/Pair;", "parseMime", "saveWildcardInRegex", "(Ljava/lang/String;)Ljava/lang/String;", "uriPattern", "Ljava/lang/String;", "getUriPattern", "()Ljava/lang/String;", "action", "getAction", "mimeType", "getMimeType", "pathArgs", "Ljava/util/List;", "pathRegex", "Lkotlin/text/Regex;", "pathPattern$delegate", "Lkotlin/Lazy;", "getPathPattern", "()Lkotlin/text/Regex;", "pathPattern", "isParameterizedQuery$delegate", "isParameterizedQuery", "()Z", "queryArgsMap$delegate", "getQueryArgsMap", "queryArgsMap", "isSingleQueryParamValueOnly", "Z", "fragArgsAndRegex$delegate", "getFragArgsAndRegex", "fragArgsAndRegex", "fragArgs$delegate", "getFragArgs", "()Ljava/util/List;", "fragArgs", "fragRegex$delegate", "getFragRegex", "fragRegex", "fragPattern$delegate", "getFragPattern", "fragPattern", "mimeTypeRegex", "mimeTypePattern$delegate", "getMimeTypePattern", "mimeTypePattern", "getArgumentsNames$navigation_common_release", "argumentsNames", "isExactDeepLink", "setExactDeepLink$navigation_common_release", "(Z)V", "Companion", "ParamQuery", "MimeType", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavDeepLink {
    private static final String ANY_SYMBOLS_IN_THE_TAIL = "([\\s\\S]+?)?";
    private final String action;

    /* JADX INFO: renamed from: fragArgs$delegate, reason: from kotlin metadata */
    private final Lazy fragArgs;

    /* JADX INFO: renamed from: fragArgsAndRegex$delegate, reason: from kotlin metadata */
    private final Lazy fragArgsAndRegex;

    /* JADX INFO: renamed from: fragPattern$delegate, reason: from kotlin metadata */
    private final Lazy fragPattern;

    /* JADX INFO: renamed from: fragRegex$delegate, reason: from kotlin metadata */
    private final Lazy fragRegex;
    private boolean isExactDeepLink;

    /* JADX INFO: renamed from: isParameterizedQuery$delegate, reason: from kotlin metadata */
    private final Lazy isParameterizedQuery;
    private boolean isSingleQueryParamValueOnly;
    private final String mimeType;

    /* JADX INFO: renamed from: mimeTypePattern$delegate, reason: from kotlin metadata */
    private final Lazy mimeTypePattern;
    private String mimeTypeRegex;
    private final List<String> pathArgs;

    /* JADX INFO: renamed from: pathPattern$delegate, reason: from kotlin metadata */
    private final Lazy pathPattern;
    private String pathRegex;

    /* JADX INFO: renamed from: queryArgsMap$delegate, reason: from kotlin metadata */
    private final Lazy queryArgsMap;
    private final String uriPattern;
    private static final Companion Companion = new Companion(null);
    private static final Regex SCHEME_PATTERN = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");
    private static final Regex FILL_IN_PATTERN = new Regex("\\{(.+?)\\}");
    private static final Regex SCHEME_REGEX = new Regex("http[s]?://");
    private static final Regex WILDCARD_REGEX = new Regex(".*");
    private static final Regex PATH_REGEX = new Regex("([^/]*?|)");
    private static final Regex QUERY_PATTERN = new Regex("^[^?#]+\\?([^#]*).*");

    public NavDeepLink(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        this.pathArgs = new ArrayList();
        this.pathPattern = LazyKt.lazy(new Function0() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavDeepLink.pathPattern_delegate$lambda$1(this.f$0);
            }
        });
        this.isParameterizedQuery = LazyKt.lazy(new Function0() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(NavDeepLink.isParameterizedQuery_delegate$lambda$2(this.f$0));
            }
        });
        this.queryArgsMap = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.parseQuery();
            }
        });
        this.fragArgsAndRegex = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.parseFragment();
            }
        });
        this.fragArgs = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavDeepLink.fragArgs_delegate$lambda$5(this.f$0);
            }
        });
        this.fragRegex = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavDeepLink.fragRegex_delegate$lambda$6(this.f$0);
            }
        });
        this.fragPattern = LazyKt.lazy(new Function0() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavDeepLink.fragPattern_delegate$lambda$8(this.f$0);
            }
        });
        this.mimeTypePattern = LazyKt.lazy(new Function0() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavDeepLink.mimeTypePattern_delegate$lambda$10(this.f$0);
            }
        });
        parsePath();
        parseMime();
    }

    public final String getUriPattern() {
        return this.uriPattern;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    private final Regex getPathPattern() {
        return (Regex) this.pathPattern.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex pathPattern_delegate$lambda$1(NavDeepLink navDeepLink) {
        String str = navDeepLink.pathRegex;
        if (str != null) {
            return new Regex(str, RegexOption.IGNORE_CASE);
        }
        return null;
    }

    private final boolean isParameterizedQuery() {
        return ((Boolean) this.isParameterizedQuery.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isParameterizedQuery_delegate$lambda$2(NavDeepLink navDeepLink) {
        String str = navDeepLink.uriPattern;
        return str != null && QUERY_PATTERN.matches(str);
    }

    private final Map<String, ParamQuery> getQueryArgsMap() {
        return (Map) this.queryArgsMap.getValue();
    }

    private final Pair<List<String>, String> getFragArgsAndRegex() {
        return (Pair) this.fragArgsAndRegex.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List fragArgs_delegate$lambda$5(NavDeepLink navDeepLink) {
        List<String> first;
        Pair<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        return (fragArgsAndRegex == null || (first = fragArgsAndRegex.getFirst()) == null) ? new ArrayList() : first;
    }

    private final List<String> getFragArgs() {
        return (List) this.fragArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fragRegex_delegate$lambda$6(NavDeepLink navDeepLink) {
        Pair<List<String>, String> fragArgsAndRegex = navDeepLink.getFragArgsAndRegex();
        if (fragArgsAndRegex != null) {
            return fragArgsAndRegex.getSecond();
        }
        return null;
    }

    private final String getFragRegex() {
        return (String) this.fragRegex.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex fragPattern_delegate$lambda$8(NavDeepLink navDeepLink) {
        String fragRegex = navDeepLink.getFragRegex();
        if (fragRegex != null) {
            return new Regex(fragRegex, RegexOption.IGNORE_CASE);
        }
        return null;
    }

    private final Regex getFragPattern() {
        return (Regex) this.fragPattern.getValue();
    }

    private final Regex getMimeTypePattern() {
        return (Regex) this.mimeTypePattern.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Regex mimeTypePattern_delegate$lambda$10(NavDeepLink navDeepLink) {
        String str = navDeepLink.mimeTypeRegex;
        if (str != null) {
            return new Regex(str);
        }
        return null;
    }

    public final List<String> getArgumentsNames$navigation_common_release() {
        List<String> list = this.pathArgs;
        Collection<ParamQuery> collectionValues = getQueryArgsMap().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((ParamQuery) it.next()).getArguments());
        }
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) list, (Iterable) arrayList), (Iterable) getFragArgs());
    }

    /* JADX INFO: renamed from: isExactDeepLink, reason: from getter */
    public final boolean getIsExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final void setExactDeepLink$navigation_common_release(boolean z) {
        this.isExactDeepLink = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLink(String str) {
        this(str, null, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    private final void buildRegex(String p0, List<String> p1, StringBuilder p2) {
        int last = 0;
        for (MatchResult matchResultFind$default = Regex.find$default(FILL_IN_PATTERN, p0, 0, 2, null); matchResultFind$default != null; matchResultFind$default = matchResultFind$default.next()) {
            MatchGroup matchGroup = matchResultFind$default.getGroups().get(1);
            Intrinsics.checkNotNull(matchGroup);
            p1.add(matchGroup.getValue());
            if (matchResultFind$default.getRange().getFirst() > last) {
                Regex.Companion companion = Regex.INSTANCE;
                String strSubstring = p0.substring(last, matchResultFind$default.getRange().getFirst());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                p2.append(companion.escape(strSubstring));
            }
            p2.append(PATH_REGEX.getPattern());
            last = matchResultFind$default.getRange().getLast() + 1;
        }
        if (last < p0.length()) {
            Regex.Companion companion2 = Regex.INSTANCE;
            String strSubstring2 = p0.substring(last);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            p2.append(companion2.escape(strSubstring2));
        }
    }

    public final boolean matches$navigation_common_release(Uri p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return matches$navigation_common_release(new NavDeepLinkRequest(p0, null, null));
    }

    public final boolean matches$navigation_common_release(NavDeepLinkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return matchUri(p0.getUri()) && matchAction(p0.getAction()) && matchMimeType(p0.getMimeType());
    }

    private final boolean matchUri(Uri p0) {
        if (getPathPattern() == null) {
            return true;
        }
        if (p0 == null) {
            return false;
        }
        Regex pathPattern = getPathPattern();
        Intrinsics.checkNotNull(pathPattern);
        return pathPattern.matches(p0.toString());
    }

    private final boolean matchAction(String p0) {
        String str = this.action;
        if (str == null) {
            return true;
        }
        if (p0 == null) {
            return false;
        }
        return Intrinsics.areEqual(str, p0);
    }

    private final boolean matchMimeType(String p0) {
        if (this.mimeType == null) {
            return true;
        }
        if (p0 == null) {
            return false;
        }
        Regex mimeTypePattern = getMimeTypePattern();
        Intrinsics.checkNotNull(mimeTypePattern);
        return mimeTypePattern.matches(p0);
    }

    public final int getMimeTypeMatchRating(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.mimeType == null) {
            return -1;
        }
        Regex mimeTypePattern = getMimeTypePattern();
        Intrinsics.checkNotNull(mimeTypePattern);
        if (mimeTypePattern.matches(p0)) {
            return new MimeType(this.mimeType).compareTo(new MimeType(p0));
        }
        return -1;
    }

    public final Bundle getMatchingArguments(Uri p0, Map<String, NavArgument> p1) {
        MatchResult matchResultMatchEntire;
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Regex pathPattern = getPathPattern();
        if (pathPattern == null || (matchResultMatchEntire = pathPattern.matchEntire(p0.toString())) == null) {
            return null;
        }
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
        final Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        if (!getMatchingPathArguments(matchResultMatchEntire, bundleBundleOf, p1)) {
            return null;
        }
        if (isParameterizedQuery() && !getMatchingQueryArguments(p0, bundleBundleOf, p1)) {
            return null;
        }
        getMatchingUriFragment(p0.getFragment(), bundleBundleOf, p1);
        if (NavArgumentKt.missingRequiredArguments(p1, new Function1() { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NavDeepLink.getMatchingArguments$lambda$13(bundleBundleOf, (String) obj));
            }
        }).isEmpty()) {
            return bundleBundleOf;
        }
        return null;
    }

    private final void getMatchingUriFragment(String p0, Bundle p1, Map<String, NavArgument> p2) {
        MatchResult matchResultMatchEntire;
        String value;
        Regex fragPattern = getFragPattern();
        if (fragPattern == null || (matchResultMatchEntire = fragPattern.matchEntire(String.valueOf(p0))) == null) {
            return;
        }
        List<String> fragArgs = getFragArgs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(fragArgs, 10));
        int i = 0;
        for (Object obj : fragArgs) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            MatchGroup matchGroup = matchResultMatchEntire.getGroups().get(i2);
            String strDecode = (matchGroup == null || (value = matchGroup.getValue()) == null) ? null : NavUriUtils.INSTANCE.decode(value);
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(p1, str, strDecode, p2.get(str));
                arrayList.add(Unit.INSTANCE);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    private final boolean getMatchingPathArguments(MatchResult p0, Bundle p1, Map<String, NavArgument> p2) {
        String value;
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            MatchGroup matchGroup = p0.getGroups().get(i2);
            String strDecode = (matchGroup == null || (value = matchGroup.getValue()) == null) ? null : NavUriUtils.INSTANCE.decode(value);
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                parseArgument(p1, str, strDecode, p2.get(str));
                arrayList.add(Unit.INSTANCE);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean getMatchingQueryArguments(Uri p0, Bundle p1, Map<String, NavArgument> p2) {
        String query;
        for (Map.Entry<String, ParamQuery> entry : getQueryArgsMap().entrySet()) {
            String key = entry.getKey();
            ParamQuery value = entry.getValue();
            List<String> queryParameters = p0.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = p0.getQuery()) != null && !Intrinsics.areEqual(query, p0.toString())) {
                queryParameters = CollectionsKt.listOf(query);
            }
            if (!parseInputParams(queryParameters, value, p1, p2)) {
                return false;
            }
        }
        return true;
    }

    public final int calculateMatchingPathSegments$navigation_common_release(Uri p0) {
        if (p0 == null || this.uriPattern == null) {
            return 0;
        }
        return CollectionsKt.intersect(p0.getPathSegments(), NavUriUtils.INSTANCE.parse(this.uriPattern).getPathSegments()).size();
    }

    private final void parseArgument(Bundle p0, String p1, String p2, NavArgument p3) {
        if (p3 != null) {
            p3.getType().parseAndPut(p0, p1, p2);
        } else {
            SavedStateWriter.m7487putStringimpl(SavedStateWriter.m7454constructorimpl(p0), p1, p2);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\bR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/navigation/NavDeepLink$ParamQuery;", "", "<init>", "()V", "", "p0", "", "addArgumentName", "(Ljava/lang/String;)V", "", "getArgumentName", "(I)Ljava/lang/String;", "size", "()I", "paramRegex", "Ljava/lang/String;", "getParamRegex", "()Ljava/lang/String;", "setParamRegex", "", "arguments", "Ljava/util/List;", "getArguments", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class ParamQuery {
        private final List<String> arguments = new ArrayList();
        private String paramRegex;

        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(String str) {
            this.paramRegex = str;
        }

        public final List<String> getArguments() {
            return this.arguments;
        }

        public final void addArgumentName(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.arguments.add(p0);
        }

        public final String getArgumentName(int p0) {
            return this.arguments.get(p0);
        }

        public final int size() {
            return this.arguments.size();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005R\"\u0010\u000e\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0005"}, d2 = {"Landroidx/navigation/NavDeepLink$MimeType;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "compareTo", "(Landroidx/navigation/NavDeepLink$MimeType;)I", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "subType", "getSubType", "setSubType"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class MimeType implements Comparable<MimeType> {
        private String subType;
        private String type;

        public MimeType(String str) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(str, "");
            List<String> listSplit = new Regex("/").split(str, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    }
                }
                listEmptyList = CollectionsKt.emptyList();
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            this.type = (String) listEmptyList.get(0);
            this.subType = (String) listEmptyList.get(1);
        }

        public final String getType() {
            return this.type;
        }

        public final void setType(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.type = str;
        }

        public final String getSubType() {
            return this.subType;
        }

        public final void setSubType(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.subType = str;
        }

        @Override // java.lang.Comparable
        public final int compareTo(MimeType p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            int i = Intrinsics.areEqual(this.type, p0.type) ? 2 : 0;
            return Intrinsics.areEqual(this.subType, p0.subType) ? i + 1 : i;
        }
    }

    public final boolean equals(Object p0) {
        if (p0 == null || !(p0 instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) p0;
        return Intrinsics.areEqual(this.uriPattern, navDeepLink.uriPattern) && Intrinsics.areEqual(this.action, navDeepLink.action) && Intrinsics.areEqual(this.mimeType, navDeepLink.mimeType);
    }

    public final int hashCode() {
        String str = this.uriPattern;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.action;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.mimeType;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007JC\u0010\u0006\u001a\u00020\u0000\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u001d\b\u0002\u0010\r\u001a\u0017\u0012\u0004\u0012\u00020\n\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000b¢\u0006\u0002\b\f0\tH\u0086\b¢\u0006\u0004\b\u0006\u0010\u000eJN\u0010\u0006\u001a\u00020\u0000\"\b\b\u0000\u0010\b*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\r\u001a\u00020\u00042\u001d\b\u0002\u0010\u0010\u001a\u0017\u0012\u0004\u0012\u00020\n\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000b¢\u0006\u0002\b\f0\tH\u0007¢\u0006\u0004\b\u0006\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0007J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0007J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder;", "", "<init>", "()V", "", "p0", "setUriPattern", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLink$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "p1", "(Ljava/lang/String;Ljava/util/Map;)Landroidx/navigation/NavDeepLink$Builder;", "Lkotlin/reflect/KClass;", "p2", "(Lkotlin/reflect/KClass;Ljava/lang/String;Ljava/util/Map;)Landroidx/navigation/NavDeepLink$Builder;", "setAction", "setMimeType", "Landroidx/navigation/NavDeepLink;", "build", "()Landroidx/navigation/NavDeepLink;", "uriPattern", "Ljava/lang/String;", "action", "mimeType", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String action;
        private String mimeType;
        private String uriPattern;

        public final Builder setUriPattern(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.uriPattern = p0;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setUriPattern$default(Builder builder, String str, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = MapsKt.emptyMap();
            }
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return builder.setUriPattern(Reflection.getOrCreateKotlinClass(Object.class), str, map);
        }

        public final /* synthetic */ <T> Builder setUriPattern(String p0, Map<KType, NavType<?>> p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return setUriPattern(Reflection.getOrCreateKotlinClass(Object.class), p0, p1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setUriPattern$default(Builder builder, KClass kClass, String str, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            return builder.setUriPattern(kClass, str, map);
        }

        public final Builder setAction(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }
            this.action = p0;
            return this;
        }

        public final Builder setMimeType(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.mimeType = p0;
            return this;
        }

        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJC\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u001d\b\u0002\u0010\u000e\u001a\u0017\u0012\u0004\u0012\u00020\u000b\u0012\r\u0012\u000b\u0012\u0002\b\u00030\f¢\u0006\u0002\b\r0\nH\u0087\b¢\u0006\u0004\b\u0007\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\b"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder$Companion;", "", "<init>", "()V", "", "p0", "Landroidx/navigation/NavDeepLink$Builder;", "fromUriPattern", "(Ljava/lang/String;)Landroidx/navigation/NavDeepLink$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "p1", "(Ljava/lang/String;Ljava/util/Map;)Landroidx/navigation/NavDeepLink$Builder;", "fromAction", "fromMimeType"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @JvmStatic
            public final Builder fromUriPattern(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Builder builder = new Builder();
                builder.setUriPattern(p0);
                return builder;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Builder fromUriPattern$default(Companion companion, String str, Map map, int i, Object obj) {
                if ((i & 2) != 0) {
                    map = MapsKt.emptyMap();
                }
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                Builder builder = new Builder();
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                builder.setUriPattern(Reflection.getOrCreateKotlinClass(Object.class), str, map);
                return builder;
            }

            @JvmStatic
            public final /* synthetic */ <T> Builder fromUriPattern(String p0, Map<KType, NavType<?>> p1) {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                Builder builder = new Builder();
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                builder.setUriPattern(Reflection.getOrCreateKotlinClass(Object.class), p0, p1);
                return builder;
            }

            @JvmStatic
            public final Builder fromAction(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
                }
                Builder builder = new Builder();
                builder.setAction(p0);
                return builder;
            }

            @JvmStatic
            public final Builder fromMimeType(String p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                Builder builder = new Builder();
                builder.setMimeType(p0);
                return builder;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final <T> Builder setUriPattern(KClass<T> p0, String p1, Map<KType, NavType<?>> p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p0, "");
            videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
            videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) p0), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
                videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0);
            }
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
                this.uriPattern = RouteSerializerKt.generateRoutePattern(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1, p2, p1);
                return this;
            }
            updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) p0);
            throw new KotlinNothingValueException();
        }

        @JvmStatic
        public static final Builder fromAction(String str) {
            return INSTANCE.fromAction(str);
        }

        @JvmStatic
        public static final Builder fromMimeType(String str) {
            return INSTANCE.fromMimeType(str);
        }

        @JvmStatic
        public static final Builder fromUriPattern(String str) {
            return INSTANCE.fromUriPattern(str);
        }

        public final <T> Builder setUriPattern(KClass<T> kClass, String str) {
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(str, "");
            return setUriPattern$default(this, kClass, str, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/navigation/NavDeepLink$Companion;", "", "<init>", "()V", "Lkotlin/text/Regex;", "SCHEME_PATTERN", "Lkotlin/text/Regex;", "FILL_IN_PATTERN", "SCHEME_REGEX", "WILDCARD_REGEX", "PATH_REGEX", "QUERY_PATTERN", "", "ANY_SYMBOLS_IN_THE_TAIL", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void parsePath() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!SCHEME_PATTERN.containsMatchIn(this.uriPattern)) {
            sb.append(SCHEME_REGEX.getPattern());
        }
        boolean z = false;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("(\\?|#|$)"), this.uriPattern, 0, 2, null);
        if (matchResultFind$default != null) {
            String strSubstring = this.uriPattern.substring(0, matchResultFind$default.getRange().getFirst());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            buildRegex(strSubstring, this.pathArgs, sb);
            StringBuilder sb2 = sb;
            if (!WILDCARD_REGEX.containsMatchIn(sb2) && !PATH_REGEX.containsMatchIn(sb2)) {
                z = true;
            }
            this.isExactDeepLink = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.pathRegex = saveWildcardInRegex(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, ParamQuery> parseQuery() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (isParameterizedQuery()) {
            NavUriUtils navUriUtils = NavUriUtils.INSTANCE;
            String str = this.uriPattern;
            Intrinsics.checkNotNull(str);
            Uri uri = navUriUtils.parse(str);
            for (String str2 : uri.getQueryParameterNames()) {
                StringBuilder sb = new StringBuilder();
                List<String> queryParameters = uri.getQueryParameters(str2);
                if (queryParameters.size() > 1) {
                    StringBuilder sb2 = new StringBuilder("Query parameter ");
                    sb2.append(str2);
                    sb2.append(" must only be present once in ");
                    sb2.append(this.uriPattern);
                    sb2.append(". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String str3 = (String) CollectionsKt.firstOrNull((List) queryParameters);
                if (str3 == null) {
                    this.isSingleQueryParamValueOnly = true;
                    str3 = str2;
                }
                int last = 0;
                ParamQuery paramQuery = new ParamQuery();
                for (MatchResult matchResultFind$default = Regex.find$default(FILL_IN_PATTERN, str3, 0, 2, null); matchResultFind$default != null; matchResultFind$default = matchResultFind$default.next()) {
                    MatchGroup matchGroup = matchResultFind$default.getGroups().get(1);
                    Intrinsics.checkNotNull(matchGroup);
                    paramQuery.addArgumentName(matchGroup.getValue());
                    if (matchResultFind$default.getRange().getFirst() > last) {
                        String strSubstring = str3.substring(last, matchResultFind$default.getRange().getFirst());
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        sb.append(Regex.INSTANCE.escape(strSubstring));
                    }
                    sb.append(ANY_SYMBOLS_IN_THE_TAIL);
                    last = matchResultFind$default.getRange().getLast() + 1;
                }
                if (last < str3.length()) {
                    Regex.Companion companion = Regex.INSTANCE;
                    String strSubstring2 = str3.substring(last);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                    sb.append(companion.escape(strSubstring2));
                }
                sb.append("$");
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                paramQuery.setParamRegex(saveWildcardInRegex(string));
                linkedHashMap.put(str2, paramQuery);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> parseFragment() {
        if (this.uriPattern == null || NavUriUtils.INSTANCE.parse(this.uriPattern).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = NavUriUtils.INSTANCE.parse(this.uriPattern).getFragment();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(fragment);
        buildRegex(fragment, arrayList, sb);
        return TuplesKt.to(arrayList, sb.toString());
    }

    private final void parseMime() {
        if (this.mimeType == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").matches(this.mimeType)) {
            StringBuilder sb = new StringBuilder("The given mimeType ");
            sb.append(this.mimeType);
            sb.append(" does not match to required \"type/subtype\" format");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        MimeType mimeType = new MimeType(this.mimeType);
        StringBuilder sb2 = new StringBuilder("^(");
        sb2.append(mimeType.getType());
        sb2.append("|[*]+)/(");
        sb2.append(mimeType.getSubType());
        sb2.append("|[*]+)$");
        this.mimeTypeRegex = StringsKt.replace$default(sb2.toString(), "*|[*]", "[\\s\\S]", false, 4, (Object) null);
    }

    private final String saveWildcardInRegex(String str) {
        String str2 = str;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "\\Q", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str2, (CharSequence) "\\E", false, 2, (Object) null)) {
            return StringsKt.replace$default(str, ".*", "\\E.*\\Q", false, 4, (Object) null);
        }
        return StringsKt.contains$default((CharSequence) str2, (CharSequence) "\\.\\*", false, 2, (Object) null) ? StringsKt.replace$default(str, "\\.\\*", ".*", false, 4, (Object) null) : str;
    }

    public final Bundle getMatchingPathAndQueryArgs$navigation_common_release(Uri p0, Map<String, NavArgument> p1) {
        Pair[] pairArr;
        Regex pathPattern;
        MatchResult matchResultMatchEntire;
        Intrinsics.checkNotNullParameter(p1, "");
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
        if (p0 != null && (pathPattern = getPathPattern()) != null && (matchResultMatchEntire = pathPattern.matchEntire(p0.toString())) != null) {
            getMatchingPathArguments(matchResultMatchEntire, bundleBundleOf, p1);
            if (isParameterizedQuery()) {
                getMatchingQueryArguments(p0, bundleBundleOf, p1);
            }
        }
        return bundleBundleOf;
    }

    private final boolean parseInputParams(List<String> p0, ParamQuery p1, Bundle p2, Map<String, NavArgument> p3) {
        Pair[] pairArr;
        Object objValueOf;
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
        Iterator<T> it = p1.getArguments().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            NavArgument navArgument = p3.get(str);
            NavType<Object> type = navArgument != null ? navArgument.getType() : null;
            if ((type instanceof CollectionNavType) && !navArgument.getIsDefaultValuePresent()) {
                CollectionNavType collectionNavType = (CollectionNavType) type;
                collectionNavType.put(bundleBundleOf, str, collectionNavType.emptyCollection());
            }
        }
        for (String str2 : p0) {
            String paramRegex = p1.getParamRegex();
            MatchResult matchResultMatchEntire = paramRegex != null ? new Regex(paramRegex).matchEntire(str2) : null;
            if (matchResultMatchEntire == null) {
                return false;
            }
            List<String> arguments = p1.getArguments();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
            int i = 0;
            for (Object obj : arguments) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str3 = (String) obj;
                MatchGroup matchGroup = matchResultMatchEntire.getGroups().get(i2);
                String value = matchGroup != null ? matchGroup.getValue() : null;
                if (value == null) {
                    value = "";
                }
                NavArgument navArgument2 = p3.get(str3);
                try {
                    if (!SavedStateReader.m7369containsimpl(SavedStateReader.m7368constructorimpl(bundleBundleOf), str3)) {
                        parseArgument(bundleBundleOf, str3, value, navArgument2);
                        objValueOf = Unit.INSTANCE;
                    } else {
                        objValueOf = Boolean.valueOf(parseArgumentForRepeatedParam(bundleBundleOf, str3, value, navArgument2));
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = Unit.INSTANCE;
                }
                arrayList2.add(objValueOf);
                i = i2;
            }
        }
        SavedStateWriter.m7458putAllimpl(SavedStateWriter.m7454constructorimpl(p2), bundleBundleOf);
        return true;
    }

    private final boolean parseArgumentForRepeatedParam(Bundle p0, String p1, String p2, NavArgument p3) {
        if (!SavedStateReader.m7369containsimpl(SavedStateReader.m7368constructorimpl(p0), p1)) {
            return true;
        }
        if (p3 == null) {
            return false;
        }
        NavType<Object> type = p3.getType();
        type.parseAndPut(p0, p1, p2, type.get(p0, p1));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getMatchingArguments$lambda$13(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return !SavedStateReader.m7369containsimpl(SavedStateReader.m7368constructorimpl(bundle), str);
    }
}

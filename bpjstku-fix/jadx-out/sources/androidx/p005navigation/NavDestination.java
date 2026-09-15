package androidx.p005navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p005navigation.common.R;
import androidx.p005navigation.p008internal.NavContext;
import androidx.p005navigation.p008internal.NavDestinationImpl;
import androidx.p005navigation.p009serialization.RouteSerializerKt;
import androidx.p013savedstate.SavedStateReader;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import defpackage.CameraController2;
import defpackage.updateMirroringFlagInOutputFileOptions;
import defpackage.updatePreviewViewTransform;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\b\u0017\u0018\u0000 j2\u00020\u0001:\u0003kljB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\u0014\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` H\u0007¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0003\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020%2\u0006\u0010\n\u001a\u00020%¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020%2\u0006\u0010\n\u001a\u00020&¢\u0006\u0004\b)\u0010+J\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020%¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b1\u0010\u0005J'\u00102\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\u000e\u0010\u0003\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` H\u0007¢\u0006\u0004\b2\u00103J'\u00104\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` ¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0002H\u0017¢\u0006\u0004\b6\u00107J\u001a\u00108\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020%H\u0016¢\u0006\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u00107R\u0014\u0010@\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR.\u0010C\u001a\u0004\u0018\u00010B2\b\u0010\u0003\u001a\u0004\u0018\u00010B8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR/\u0010M\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028C@CX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\bI\u00107\"\u0004\bJ\u0010\u0005*\u0004\bK\u0010LR$\u0010O\u001a\u0004\u0018\u00010N8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR!\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00150U8CX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bV\u0010W*\u0004\bX\u0010LR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020&0Z8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001d\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020.0]8G¢\u0006\u0006\u001a\u0004\b^\u0010_R$\u0010c\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020%8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010;\"\u0004\bb\u0010-R/\u0010g\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028G@GX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bd\u00107\"\u0004\be\u0010\u0005*\u0004\bf\u0010LR\u0014\u0010i\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u00107"}, d2 = {"Landroidx/navigation/NavDestination;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "Landroid/util/AttributeSet;", "p1", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/net/Uri;", "", "hasDeepLink", "(Landroid/net/Uri;)Z", "Landroidx/navigation/NavDeepLinkRequest;", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "addDeepLink", "Landroidx/navigation/NavDeepLink;", "(Landroidx/navigation/NavDeepLink;)V", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchRoute", "(Ljava/lang/String;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "buildDeepLinkIds", "(Landroidx/navigation/NavDestination;)[I", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "hasRoute", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "supportsActions", "()Z", "", "Landroidx/navigation/NavAction;", "getAction", "(I)Landroidx/navigation/NavAction;", "putAction", "(II)V", "(ILandroidx/navigation/NavAction;)V", "removeAction", "(I)V", "Landroidx/navigation/NavArgument;", "addArgument", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "removeArgument", "addInDefaultArgs", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "fillInLabel", "(Landroid/content/Context;Landroid/os/Bundle;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "navigatorName", "Ljava/lang/String;", "getNavigatorName", "Landroidx/navigation/internal/NavDestinationImpl;", "impl", "Landroidx/navigation/internal/NavDestinationImpl;", "Landroidx/navigation/NavGraph;", "parent", "Landroidx/navigation/NavGraph;", "getParent", "()Landroidx/navigation/NavGraph;", "setParent", "(Landroidx/navigation/NavGraph;)V", "getIdName", "setIdName", "getIdName$delegate", "(Landroidx/navigation/NavDestination;)Ljava/lang/Object;", "idName", "", Constants.ScionAnalytics.PARAM_LABEL, "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "", "getDeepLinks", "()Ljava/util/List;", "getDeepLinks$delegate", "deepLinks", "Landroidx/collection/SparseArrayCompat;", "actions", "Landroidx/collection/SparseArrayCompat;", "", "getArguments", "()Ljava/util/Map;", "arguments", "getId", "setId", "id", "getRoute", "setRoute", "getRoute$delegate", PlaceTypes.ROUTE, "getDisplayName", "displayName", "Companion", "ClassType", "DeepLinkMatch"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavDestination {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Class<?>> classes = new LinkedHashMap();
    private final SparseArrayCompat<NavAction> actions;
    private final NavDestinationImpl impl;
    private CharSequence label;
    private final String navigatorName;
    private NavGraph parent;

    /* JADX INFO: loaded from: classes4.dex */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", "Lkotlin/reflect/KClass;", "p0", "value", "()Ljava/lang/Class;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface ClassType {
        Class<?> value();
    }

    public boolean supportsActions() {
        return true;
    }

    public NavDestination(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.navigatorName = str;
        this.impl = new NavDestinationImpl(this);
        this.actions = new SparseArrayCompat<>(0, 1, null);
    }

    public final String getNavigatorName() {
        return this.navigatorName;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00072\u000e\u0010\u0003\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e"}, d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "Landroidx/navigation/NavDestination;", "p0", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p1", "", "p2", "", "p3", "p4", "p5", "<init>", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZIZI)V", "compareTo", "(Landroidx/navigation/NavDestination$DeepLinkMatch;)I", "hasMatchingArgs", "(Landroid/os/Bundle;)Z", FirebaseAnalytics.Param.DESTINATION, "Landroidx/navigation/NavDestination;", "getDestination", "()Landroidx/navigation/NavDestination;", "matchingArgs", "Landroid/os/Bundle;", "getMatchingArgs", "()Landroid/os/Bundle;", "isExactDeepLink", "Z", "matchingPathSegments", "I", "hasMatchingAction", "mimeTypeMatchLevel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(NavDestination navDestination, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            Intrinsics.checkNotNullParameter(navDestination, "");
            this.destination = navDestination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z;
            this.matchingPathSegments = i;
            this.hasMatchingAction = z2;
            this.mimeTypeMatchLevel = i2;
        }

        public final NavDestination getDestination() {
            return this.destination;
        }

        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        @Override // java.lang.Comparable
        public final int compareTo(DeepLinkMatch p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            boolean z = this.isExactDeepLink;
            if (z && !p0.isExactDeepLink) {
                return 1;
            }
            if (!z && p0.isExactDeepLink) {
                return -1;
            }
            int i = this.matchingPathSegments - p0.matchingPathSegments;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && p0.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && p0.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int iM7448sizeimpl = SavedStateReader.m7448sizeimpl(SavedStateReader.m7368constructorimpl(bundle));
                Bundle bundle2 = p0.matchingArgs;
                Intrinsics.checkNotNull(bundle2);
                int iM7448sizeimpl2 = iM7448sizeimpl - SavedStateReader.m7448sizeimpl(SavedStateReader.m7368constructorimpl(bundle2));
                if (iM7448sizeimpl2 > 0) {
                    return 1;
                }
                if (iM7448sizeimpl2 < 0) {
                    return -1;
                }
            }
            boolean z2 = this.hasMatchingAction;
            if (z2 && !p0.hasMatchingAction) {
                return 1;
            }
            if (z2 || !p0.hasMatchingAction) {
                return this.mimeTypeMatchLevel - p0.mimeTypeMatchLevel;
            }
            return -1;
        }

        public final boolean hasMatchingArgs(Bundle p0) {
            Bundle bundle;
            if (p0 == null || (bundle = this.matchingArgs) == null) {
                return false;
            }
            Set<String> setKeySet = bundle.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "");
            for (String str : setKeySet) {
                Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
                Intrinsics.checkNotNull(str);
                if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, str)) {
                    return false;
                }
                NavArgument navArgument = this.destination.getArguments().get(str);
                NavType<Object> type = navArgument != null ? navArgument.getType() : null;
                Object obj = type != null ? type.get(this.matchingArgs, str) : null;
                Object obj2 = type != null ? type.get(p0, str) : null;
                if (type != null && !type.valueEquals(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public final NavGraph getParent() {
        return this.parent;
    }

    public final void setParent(NavGraph navGraph) {
        this.parent = navGraph;
    }

    private final String getIdName() {
        return this.impl.getIdName();
    }

    private final void setIdName(String str) {
        this.impl.setIdName$navigation_common_release(str);
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    private final List<NavDeepLink> getDeepLinks() {
        return this.impl.getDeepLinks$navigation_common_release();
    }

    public final Map<String, NavArgument> getArguments() {
        return MapsKt.toMap(this.impl.getArguments$navigation_common_release());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.INSTANCE.getNameForNavigator$navigation_common_release(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "");
    }

    public void onInflate(Context p0, AttributeSet p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        TypedArray typedArrayObtainAttributes = p0.getResources().obtainAttributes(p1, R.styleable.Navigator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "");
        setRoute(typedArrayObtainAttributes.getString(R.styleable.Navigator_route));
        if (typedArrayObtainAttributes.hasValue(R.styleable.Navigator_android_id)) {
            setId(typedArrayObtainAttributes.getResourceId(R.styleable.Navigator_android_id, 0));
            setIdName(INSTANCE.getDisplayName(new NavContext(p0), getId()));
        }
        this.label = typedArrayObtainAttributes.getText(R.styleable.Navigator_android_label);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final int getId() {
        return this.impl.getId();
    }

    public final void setId(int i) {
        this.impl.setId$navigation_common_release(i);
    }

    public final String getRoute() {
        return this.impl.getRoute();
    }

    public final void setRoute(String str) {
        this.impl.setRoute$navigation_common_release(str);
    }

    public String getDisplayName() {
        String idName = getIdName();
        return idName == null ? String.valueOf(getId()) : idName;
    }

    public boolean hasDeepLink(Uri p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return hasDeepLink(new NavDeepLinkRequest(p0, null, null));
    }

    public boolean hasDeepLink(NavDeepLinkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return matchDeepLink(p0) != null;
    }

    public final void addDeepLink(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(p0).build());
    }

    public final void addDeepLink(NavDeepLink p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.addDeepLink$navigation_common_release(p0);
    }

    public final DeepLinkMatch matchRoute(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.matchRoute$navigation_common_release(p0);
    }

    public DeepLinkMatch matchDeepLink(NavDeepLinkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.matchDeepLink$navigation_common_release(p0);
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.buildDeepLinkIds(navDestination2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[EDGE_INSN: B:26:0x0040->B:19:0x0040 BREAK  A[LOOP:0: B:3:0x0006->B:28:?], SYNTHETIC] */
    public final int[] buildDeepLinkIds(NavDestination p0) {
        ArrayDeque arrayDeque = new ArrayDeque();
        NavGraph navGraph = this;
        do {
            Intrinsics.checkNotNull(navGraph);
            NavGraph navGraph2 = navGraph.parent;
            if ((p0 != null ? p0.parent : null) != null) {
                NavGraph navGraph3 = p0.parent;
                Intrinsics.checkNotNull(navGraph3);
                if (navGraph3.findNode(navGraph.getId()) == navGraph) {
                    arrayDeque.addFirst(navGraph);
                    break;
                }
                if (navGraph2 != null || navGraph2.getStartDestinationId() != navGraph.getId()) {
                    arrayDeque.addFirst(navGraph);
                }
                if (!Intrinsics.areEqual(navGraph2, p0)) {
                    break;
                }
                navGraph = navGraph2;
            } else {
                if (navGraph2 != null) {
                    arrayDeque.addFirst(navGraph);
                } else {
                    arrayDeque.addFirst(navGraph);
                }
                if (!Intrinsics.areEqual(navGraph2, p0)) {
                    break;
                    break;
                }
                navGraph = navGraph2;
            }
        } while (navGraph != null);
        List list = CollectionsKt.toList(arrayDeque);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NavDestination) it.next()).getId()));
        }
        return CollectionsKt.toIntArray(arrayList);
    }

    public final boolean hasRoute(String p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.hasRoute$navigation_common_release(p0, p1);
    }

    public final NavAction getAction(int p0) {
        NavDestination navDestination = this;
        do {
            NavAction navAction = navDestination.actions.getIsEmpty() ? null : navDestination.actions.get(p0);
            if (navAction != null) {
                return navAction;
            }
            navDestination = navDestination.parent;
        } while (navDestination != null);
        return null;
    }

    public final void putAction(int p0, int p1) {
        putAction(p0, new NavAction(p1, null, null, 6, null));
    }

    public final void putAction(int p0, NavAction p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (supportsActions()) {
            if (p0 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
            }
            this.actions.put(p0, p1);
        } else {
            StringBuilder sb = new StringBuilder("Cannot add action ");
            sb.append(p0);
            sb.append(" to ");
            sb.append(this);
            sb.append(" as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    public final void removeAction(int p0) {
        this.actions.remove(p0);
    }

    public final void addArgument(String p0, NavArgument p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.impl.addArgument$navigation_common_release(p0, p1);
    }

    public final void removeArgument(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.removeArgument$navigation_common_release(p0);
    }

    public final Bundle addInDefaultArgs(Bundle p0) {
        return this.impl.addInDefaultArgs$navigation_common_release(p0);
    }

    public final String fillInLabel(Context p0, Bundle p1) {
        Map<String, Object> mapEmptyMap;
        String strValueOf;
        Intrinsics.checkNotNullParameter(p0, "");
        CharSequence charSequence = this.label;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        if (p1 == null || (mapEmptyMap = SavedStateReader.m7449toMapimpl(SavedStateReader.m7368constructorimpl(p1))) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup == null || !mapEmptyMap.containsKey(strGroup)) {
                StringBuilder sb = new StringBuilder("Could not find \"");
                sb.append(strGroup);
                sb.append("\" in ");
                sb.append(p1);
                sb.append(" to fill label \"");
                sb.append((Object) charSequence);
                sb.append(Typography.quote);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            matcher.appendReplacement(stringBuffer, "");
            NavArgument navArgument = getArguments().get(strGroup);
            NavType<Object> type = navArgument != null ? navArgument.getType() : null;
            if (Intrinsics.areEqual(type, NavType.ReferenceType)) {
                NavType<Integer> navType = NavType.ReferenceType;
                Intrinsics.checkNotNull(p1);
                Integer num = navType.get(p1, strGroup);
                Intrinsics.checkNotNull(num, "");
                strValueOf = p0.getString(num.intValue());
            } else {
                Intrinsics.checkNotNull(type);
                Intrinsics.checkNotNull(p1);
                strValueOf = String.valueOf(type.get(p1, strGroup));
            }
            Intrinsics.checkNotNull(strValueOf);
            stringBuffer.append(strValueOf);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (getIdName() == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(getId()));
        } else {
            sb.append(getIdName());
        }
        sb.append(")");
        String route = getRoute();
        if (route != null && !StringsKt.isBlank(route)) {
            sb.append(" route=");
            sb.append(getRoute());
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public boolean equals(Object p0) {
        boolean z;
        boolean z2;
        if (this == p0) {
            return true;
        }
        if (p0 != null && (p0 instanceof NavDestination)) {
            NavDestination navDestination = (NavDestination) p0;
            boolean zAreEqual = Intrinsics.areEqual(getDeepLinks(), navDestination.getDeepLinks());
            if (this.actions.size() != navDestination.actions.size()) {
                z = false;
                break;
            }
            Iterator it = SequencesKt.asSequence(SparseArrayKt.keyIterator(this.actions)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                int iIntValue = ((Number) it.next()).intValue();
                if (!Intrinsics.areEqual(this.actions.get(iIntValue), navDestination.actions.get(iIntValue))) {
                    z = false;
                    break;
                }
            }
            if (getArguments().size() != navDestination.getArguments().size()) {
                z2 = false;
                break;
            }
            Iterator it2 = MapsKt.asSequence(getArguments()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (!navDestination.getArguments().containsKey(entry.getKey()) || !Intrinsics.areEqual(navDestination.getArguments().get(entry.getKey()), entry.getValue())) {
                    z2 = false;
                    break;
                }
            }
            if (getId() == navDestination.getId() && Intrinsics.areEqual(getRoute(), navDestination.getRoute()) && zAreEqual && z && z2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int id2 = getId();
        String route = getRoute();
        int iHashCode = (id2 * 31) + (route != null ? route.hashCode() : 0);
        for (NavDeepLink navDeepLink : getDeepLinks()) {
            String uriPattern = navDeepLink.getUriPattern();
            int iHashCode2 = uriPattern != null ? uriPattern.hashCode() : 0;
            String action = navDeepLink.getAction();
            int iHashCode3 = action != null ? action.hashCode() : 0;
            String mimeType = navDeepLink.getMimeType();
            iHashCode = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (mimeType != null ? mimeType.hashCode() : 0);
        }
        Iterator itValueIterator = SparseArrayKt.valueIterator(this.actions);
        while (itValueIterator.hasNext()) {
            NavAction navAction = (NavAction) itValueIterator.next();
            int destinationId = navAction.getDestinationId();
            NavOptions navOptions = navAction.getNavOptions();
            iHashCode = (((iHashCode * 31) + destinationId) * 31) + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null) {
                iHashCode = (iHashCode * 31) + SavedStateReader.m7371contentDeepHashCodeimpl(SavedStateReader.m7368constructorimpl(defaultArguments));
            }
        }
        for (String str : getArguments().keySet()) {
            int iHashCode4 = str.hashCode();
            NavArgument navArgument = getArguments().get(str);
            iHashCode = (((iHashCode * 31) + iHashCode4) * 31) + (navArgument != null ? navArgument.hashCode() : 0);
        }
        return iHashCode;
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\tH\u0005¢\u0006\u0004\b\u000b\u0010\fJA\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\tH\u0007¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0017\u001a\u00020\u0016\"\n\b\u0000\u0010\u0014\u0018\u0001*\u00020\u0001*\u00020\u0015H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\u0014*\u00020\u0001*\u00020\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0007¢\u0006\u0004\b\u0017\u0010\u001aR$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e*\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "<init>", "()V", "C", "Landroid/content/Context;", "p0", "", "p1", "Ljava/lang/Class;", "p2", "parseClassFromName", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;", "parseClassFromNameInternal", "Landroidx/navigation/internal/NavContext;", "", "getDisplayName", "(Landroidx/navigation/internal/NavContext;I)Ljava/lang/String;", "createRoute", "(Ljava/lang/String;)Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavDestination;", "", "hasRoute", "(Landroidx/navigation/NavDestination;)Z", "Lkotlin/reflect/KClass;", "(Landroidx/navigation/NavDestination;Lkotlin/reflect/KClass;)Z", "", "classes", "Ljava/util/Map;", "Lkotlin/sequences/Sequence;", "getHierarchy", "(Landroidx/navigation/NavDestination;)Lkotlin/sequences/Sequence;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "hierarchy"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @JvmStatic
        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }

        private Companion() {
        }

        @JvmStatic
        protected final <C> Class<? extends C> parseClassFromName(Context p0, String p1, Class<? extends C> p2) {
            String string;
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            if (p1.charAt(0) == '.') {
                StringBuilder sb = new StringBuilder();
                sb.append(p0.getPackageName());
                sb.append(p1);
                string = sb.toString();
            } else {
                string = p1;
            }
            Class<? extends C> cls = (Class) NavDestination.classes.get(string);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(string, true, p0.getClassLoader());
                    NavDestination.classes.put(p1, cls);
                } catch (ClassNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            }
            Intrinsics.checkNotNull(cls);
            if (p2.isAssignableFrom(cls)) {
                return cls;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(" must be a subclass of ");
            sb2.append(p2);
            throw new IllegalArgumentException(sb2.toString().toString());
        }

        @JvmStatic
        public final <C> Class<? extends C> parseClassFromNameInternal(Context p0, String p1, Class<? extends C> p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            return NavDestination.parseClassFromName(p0, p1, p2);
        }

        @JvmStatic
        public final String getDisplayName(NavContext p0, int p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p1 <= 16777215) {
                return String.valueOf(p1);
            }
            return p0.getResourceName(p1);
        }

        public final String createRoute(String p0) {
            return p0 != null ? "android-app://androidx.navigation/".concat(String.valueOf(p0)) : "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavDestination _get_hierarchy_$lambda$1(NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "");
            return navDestination.getParent();
        }

        public final Sequence<NavDestination> getHierarchy(NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "");
            return SequencesKt.generateSequence(navDestination, (Function1<? super NavDestination, ? extends NavDestination>) new Function1() { // from class: androidx.navigation.NavDestination$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NavDestination.Companion._get_hierarchy_$lambda$1((NavDestination) obj);
                }
            });
        }

        @JvmStatic
        public final /* synthetic */ <T> boolean hasRoute(NavDestination navDestination) {
            Intrinsics.checkNotNullParameter(navDestination, "");
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return hasRoute(navDestination, Reflection.getOrCreateKotlinClass(Object.class));
        }

        @JvmStatic
        public final <T> boolean hasRoute(NavDestination navDestination, KClass<T> kClass) {
            Intrinsics.checkNotNullParameter(navDestination, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(kClass, "");
            videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
            videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) kClass), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
                videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(kClass);
            }
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
                return RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1) == navDestination.getId();
            }
            updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) kClass);
            throw new KotlinNothingValueException();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final String getDisplayName(NavContext navContext, int i) {
        return INSTANCE.getDisplayName(navContext, i);
    }

    public static final Sequence<NavDestination> getHierarchy(NavDestination navDestination) {
        return INSTANCE.getHierarchy(navDestination);
    }

    @JvmStatic
    public static final <T> boolean hasRoute(NavDestination navDestination, KClass<T> kClass) {
        return INSTANCE.hasRoute(navDestination, kClass);
    }

    @JvmStatic
    protected static final <C> Class<? extends C> parseClassFromName(Context context, String str, Class<? extends C> cls) {
        return INSTANCE.parseClassFromName(context, str, cls);
    }

    @JvmStatic
    public static final <C> Class<? extends C> parseClassFromNameInternal(Context context, String str, Class<? extends C> cls) {
        return INSTANCE.parseClassFromNameInternal(context, str, cls);
    }

    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, null, 1, null);
    }
}

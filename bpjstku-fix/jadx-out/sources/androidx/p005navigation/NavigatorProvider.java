package androidx.p005navigation;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0017¢\u0006\u0004\b\b\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0004H\u0017¢\u0006\u0004\b\r\u0010\u0010R(\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00040\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R%\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00040\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/navigation/NavigatorProvider;", "", "<init>", "()V", "Landroidx/navigation/Navigator;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "p0", "getNavigator", "(Ljava/lang/Class;)Landroidx/navigation/Navigator;", "", "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "addNavigator", "(Landroidx/navigation/Navigator;)Landroidx/navigation/Navigator;", "p1", "(Ljava/lang/String;Landroidx/navigation/Navigator;)Landroidx/navigation/Navigator;", "", "_navigators", "Ljava/util/Map;", "", "getNavigators", "()Ljava/util/Map;", "navigators", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavigatorProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Class<?>, String> annotationNames = new LinkedHashMap();
    private final Map<String, Navigator<? extends NavDestination>> _navigators = new LinkedHashMap();

    public final Map<String, Navigator<? extends NavDestination>> getNavigators() {
        return MapsKt.toMap(this._navigators);
    }

    public final <T extends Navigator<?>> T getNavigator(Class<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (T) getNavigator(INSTANCE.getNameForNavigator$navigation_common_release(p0));
    }

    public <T extends Navigator<?>> T getNavigator(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!INSTANCE.validateName$navigation_common_release(p0)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        Navigator<? extends NavDestination> navigator = this._navigators.get(p0);
        if (navigator != null) {
            return navigator;
        }
        StringBuilder sb = new StringBuilder("Could not find Navigator with name \"");
        sb.append(p0);
        sb.append("\". You must call NavController.addNavigator() for each navigation type.");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Navigator<? extends NavDestination> addNavigator(Navigator<? extends NavDestination> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return addNavigator(INSTANCE.getNameForNavigator$navigation_common_release(p0.getClass()), p0);
    }

    public Navigator<? extends NavDestination> addNavigator(String p0, Navigator<? extends NavDestination> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!INSTANCE.validateName$navigation_common_release(p0)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        Navigator<? extends NavDestination> navigator = this._navigators.get(p0);
        if (Intrinsics.areEqual(navigator, p1)) {
            return p1;
        }
        if (navigator != null && navigator.getIsAttached()) {
            StringBuilder sb = new StringBuilder("Navigator ");
            sb.append(p1);
            sb.append(" is replacing an already attached ");
            sb.append(navigator);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (p1.getIsAttached()) {
            StringBuilder sb2 = new StringBuilder("Navigator ");
            sb2.append(p1);
            sb2.append(" is already attached to another NavController");
            throw new IllegalStateException(sb2.toString().toString());
        }
        return this._navigators.put(p0, p1);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0001¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u000e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/navigation/NavigatorProvider$Companion;", "", "<init>", "()V", "", "p0", "", "validateName$navigation_common_release", "(Ljava/lang/String;)Z", "Ljava/lang/Class;", "Landroidx/navigation/Navigator;", "getNameForNavigator$navigation_common_release", "(Ljava/lang/Class;)Ljava/lang/String;", "", "annotationNames", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean validateName$navigation_common_release(String p0) {
            return p0 != null && p0.length() > 0;
        }

        @JvmStatic
        public final String getNameForNavigator$navigation_common_release(Class<? extends Navigator<?>> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            String strValue = (String) NavigatorProvider.annotationNames.get(p0);
            if (strValue == null) {
                Navigator.Name name = (Navigator.Name) p0.getAnnotation(Navigator.Name.class);
                strValue = name != null ? name.value() : null;
                if (validateName$navigation_common_release(strValue)) {
                    NavigatorProvider.annotationNames.put(p0, strValue);
                } else {
                    StringBuilder sb = new StringBuilder("No @Navigator.Name annotation found for ");
                    sb.append(p0.getSimpleName());
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            Intrinsics.checkNotNull(strValue);
            return strValue;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

package androidx.p005navigation;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p013savedstate.SavedStateReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001(B;\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\fj\u0002`\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\u0005\u001a\u00060\fj\u0002`\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R\u001a\u0010\"\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010 R\u001c\u0010$\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Landroidx/navigation/NavArgument;", "", "Landroidx/navigation/NavType;", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Landroidx/navigation/NavType;ZLjava/lang/Object;ZZ)V", "", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "", "putDefaultValue", "(Ljava/lang/String;Landroid/os/Bundle;)V", "verify", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "type", "Landroidx/navigation/NavType;", "getType", "()Landroidx/navigation/NavType;", "isNullable", "Z", "()Z", "isDefaultValuePresent", "isDefaultValueUnknown", "isDefaultValueUnknown$navigation_common_release", "defaultValue", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavArgument {
    private final Object defaultValue;
    private final boolean isDefaultValuePresent;
    private final boolean isDefaultValueUnknown;
    private final boolean isNullable;
    private final NavType<Object> type;

    public NavArgument(NavType<Object> navType, boolean z, Object obj, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(navType, "");
        if (!navType.getIsNullableAllowed() && z) {
            StringBuilder sb = new StringBuilder();
            sb.append(navType.getName());
            sb.append(" does not allow nullable values");
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (!z && z2 && obj == null) {
            StringBuilder sb2 = new StringBuilder("Argument with type ");
            sb2.append(navType.getName());
            sb2.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        this.type = navType;
        this.isNullable = z;
        this.defaultValue = obj;
        this.isDefaultValuePresent = z2 || z3;
        this.isDefaultValueUnknown = z3;
    }

    public final NavType<Object> getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isNullable, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    /* JADX INFO: renamed from: isDefaultValuePresent, reason: from getter */
    public final boolean getIsDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    /* JADX INFO: renamed from: isDefaultValueUnknown$navigation_common_release, reason: from getter */
    public final boolean getIsDefaultValueUnknown() {
        return this.isDefaultValueUnknown;
    }

    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final void putDefaultValue(String p0, Bundle p1) {
        Object obj;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!this.isDefaultValuePresent || (obj = this.defaultValue) == null) {
            return;
        }
        this.type.put(p1, p0, obj);
    }

    public final boolean verify(String p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!this.isNullable) {
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p1);
            if (SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p0) && SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p0)) {
                return false;
            }
        }
        try {
            this.type.get(p1, p0);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reflection.getOrCreateKotlinClass(getClass()).getSimpleName());
        StringBuilder sb2 = new StringBuilder(" Type: ");
        sb2.append(this.type);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder(" Nullable: ");
        sb3.append(this.isNullable);
        sb.append(sb3.toString());
        if (this.isDefaultValuePresent) {
            StringBuilder sb4 = new StringBuilder(" DefaultValue: ");
            sb4.append(this.defaultValue);
            sb.append(sb4.toString());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 != null && getClass() == p0.getClass()) {
            NavArgument navArgument = (NavArgument) p0;
            if (this.isNullable != navArgument.isNullable || this.isDefaultValuePresent != navArgument.isDefaultValuePresent || !Intrinsics.areEqual(this.type, navArgument.type)) {
                return false;
            }
            Object obj = this.defaultValue;
            if (obj != null) {
                return Intrinsics.areEqual(obj, navArgument.defaultValue);
            }
            if (navArgument.defaultValue == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode();
        boolean z = this.isNullable;
        boolean z2 = this.isDefaultValuePresent;
        Object obj = this.defaultValue;
        return (((((iHashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015"}, d2 = {"Landroidx/navigation/NavArgument$Builder;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavType;", "p0", "setType", "(Landroidx/navigation/NavType;)Landroidx/navigation/NavArgument$Builder;", "", "setIsNullable", "(Z)Landroidx/navigation/NavArgument$Builder;", "setDefaultValue", "(Ljava/lang/Object;)Landroidx/navigation/NavArgument$Builder;", "setUnknownDefaultValuePresent$navigation_common_release", "Landroidx/navigation/NavArgument;", "build", "()Landroidx/navigation/NavArgument;", "type", "Landroidx/navigation/NavType;", "isNullable", "Z", "defaultValue", "Ljava/lang/Object;", "defaultValuePresent", "unknownDefaultValuePresent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private Object defaultValue;
        private boolean defaultValuePresent;
        private boolean isNullable;
        private NavType<Object> type;
        private boolean unknownDefaultValuePresent;

        public final <T> Builder setType(NavType<T> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.type = p0;
            return this;
        }

        public final Builder setIsNullable(boolean p0) {
            this.isNullable = p0;
            return this;
        }

        public final Builder setDefaultValue(Object p0) {
            this.defaultValue = p0;
            this.defaultValuePresent = true;
            return this;
        }

        public final Builder setUnknownDefaultValuePresent$navigation_common_release(boolean p0) {
            this.unknownDefaultValuePresent = p0;
            return this;
        }

        public final NavArgument build() {
            NavType<Object> navTypeInferFromValueType = this.type;
            if (navTypeInferFromValueType == null) {
                navTypeInferFromValueType = NavType.INSTANCE.inferFromValueType(this.defaultValue);
                Intrinsics.checkNotNull(navTypeInferFromValueType, "");
            }
            return new NavArgument(navTypeInferFromValueType, this.isNullable, this.defaultValue, this.defaultValuePresent, this.unknownDefaultValuePresent);
        }
    }
}

package androidx.p005navigation.p009serialization;

import android.os.Bundle;
import androidx.p005navigation.CollectionNavType;
import androidx.p005navigation.NavType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType;", "", "<init>", "()V", "EnumNullableType", "SerializableNullableType", "EnumListType"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InternalAndroidNavType {
    public static final InternalAndroidNavType INSTANCE = new InternalAndroidNavType();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$EnumNullableType;", "", "D", "Landroidx/navigation/serialization/InternalAndroidNavType$SerializableNullableType;", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/Class;)V", "", "parseValue", "(Ljava/lang/String;)Ljava/lang/Enum;", "type", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumNullableType<D extends Enum<?>> extends SerializableNullableType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumNullableType(Class<D> cls) {
            super(cls);
            Intrinsics.checkNotNullParameter(cls, "");
            if (!cls.isEnum()) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls);
                sb.append(" is not an Enum type.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            this.type = cls;
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.p005navigation.NavType
        public final String getName() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            return name;
        }

        @Override // androidx.navigation.serialization.InternalAndroidNavType.SerializableNullableType, androidx.p005navigation.NavType
        public final D parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            D d = null;
            if (Intrinsics.areEqual(p0, "null")) {
                return null;
            }
            D[] enumConstants = this.type.getEnumConstants();
            Intrinsics.checkNotNull(enumConstants);
            for (D d2 : enumConstants) {
                D d3 = d2;
                Intrinsics.checkNotNull(d3);
                if (StringsKt.equals(d3.name(), p0, true)) {
                    d = d2;
                    break;
                }
            }
            D d4 = d;
            if (d4 != null) {
                return d4;
            }
            StringBuilder sb = new StringBuilder("Enum value ");
            sb.append(p0);
            sb.append(" not found for type ");
            sb.append(this.type.getName());
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private InternalAndroidNavType() {
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\bj\u0002`\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u00002\n\u0010\u0005\u001a\u00060\bj\u0002`\t2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$SerializableNullableType;", "Ljava/io/Serializable;", "D", "Landroidx/navigation/NavType;", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "", "p1", "p2", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "parseValue", "(Ljava/lang/String;)Ljava/io/Serializable;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "type", "Ljava/lang/Class;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class SerializableNullableType<D extends Serializable> extends NavType<D> {
        private final Class<D> type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SerializableNullableType(Class<D> cls) {
            super(true);
            Intrinsics.checkNotNullParameter(cls, "");
            this.type = cls;
            if (Serializable.class.isAssignableFrom(cls)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append(" does not implement Serializable.");
            throw new IllegalArgumentException(sb.toString().toString());
        }

        @Override // androidx.p005navigation.NavType
        public String getName() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            return name;
        }

        @Override // androidx.p005navigation.NavType
        public void put(Bundle p0, String p1, D p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            p0.putSerializable(p1, this.type.cast(p2));
        }

        @Override // androidx.p005navigation.NavType
        public D get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Object obj = p0.get(p1);
            if (obj instanceof Serializable) {
                return (D) obj;
            }
            return null;
        }

        @Override // androidx.p005navigation.NavType
        public D parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 instanceof SerializableNullableType) {
                return Intrinsics.areEqual(this.type, ((SerializableNullableType) p0).type);
            }
            return false;
        }

        public int hashCode() {
            return this.type.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0006\u001a\u00060\tj\u0002`\n2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\n\u0010\u0006\u001a\u00060\tj\u0002`\n2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0015J/\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'"}, d2 = {"Landroidx/navigation/serialization/InternalAndroidNavType$EnumListType;", "", "D", "Landroidx/navigation/CollectionNavType;", "", "Ljava/lang/Class;", "p0", "<init>", "(Ljava/lang/Class;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "", "p1", "p2", "", "put", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "get", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "parseValue", "(Ljava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "", "valueEquals", "(Ljava/util/List;Ljava/util/List;)Z", "serializeAsValues", "(Ljava/util/List;)Ljava/util/List;", "emptyCollection", "()Ljava/util/List;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/navigation/NavType$EnumType;", "enumNavType", "Landroidx/navigation/NavType$EnumType;", "getName", "()Ljava/lang/String;", "name"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnumListType<D extends Enum<?>> extends CollectionNavType<List<? extends D>> {
        private final NavType.EnumType<D> enumNavType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumListType(Class<D> cls) {
            super(true);
            Intrinsics.checkNotNullParameter(cls, "");
            this.enumNavType = new NavType.EnumType<>(cls);
        }

        @Override // androidx.p005navigation.NavType
        public final String getName() {
            StringBuilder sb = new StringBuilder("List<");
            sb.append(this.enumNavType.getName());
            sb.append("}>");
            return sb.toString();
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, List<? extends D> p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            p0.putSerializable(p1, p2 != null ? new ArrayList(p2) : null);
        }

        @Override // androidx.p005navigation.NavType
        public final List<D> get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Object obj = p0.get(p1);
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        }

        @Override // androidx.p005navigation.NavType
        public final List<D> parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return CollectionsKt.listOf(this.enumNavType.parseValue(p0));
        }

        @Override // androidx.p005navigation.NavType
        public final List<D> parseValue(String p0, List<? extends D> p1) {
            List<D> listPlus;
            Intrinsics.checkNotNullParameter(p0, "");
            return (p1 == null || (listPlus = CollectionsKt.plus((Collection) p1, (Iterable) parseValue(p0))) == null) ? parseValue(p0) : listPlus;
        }

        @Override // androidx.p005navigation.NavType
        public final boolean valueEquals(List<? extends D> p0, List<? extends D> p1) {
            return Intrinsics.areEqual(p0 != null ? new ArrayList(p0) : null, p1 != null ? new ArrayList(p1) : null);
        }

        @Override // androidx.p005navigation.CollectionNavType
        public final List<String> serializeAsValues(List<? extends D> p0) {
            if (p0 != null) {
                List<? extends D> list = p0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Enum) it.next()).toString());
                }
                return arrayList;
            }
            return CollectionsKt.emptyList();
        }

        @Override // androidx.p005navigation.CollectionNavType
        public final List<D> emptyCollection() {
            return CollectionsKt.emptyList();
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 instanceof EnumListType) {
                return Intrinsics.areEqual(this.enumNavType, ((EnumListType) p0).enumNavType);
            }
            return false;
        }

        public final int hashCode() {
            return this.enumNavType.hashCode();
        }
    }
}

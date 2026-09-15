package androidx.p005navigation.p009serialization;

import android.os.Bundle;
import androidx.p005navigation.CollectionNavType;
import androidx.p005navigation.NavType;
import androidx.p005navigation.NavUriUtils;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\"\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\tR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\tR*\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001b0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\tR*\u0010\u001f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u001e0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0007\u001a\u0004\b \u0010\tR\"\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0007\u001a\u0004\b#\u0010\tR(\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001e0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0007\u001a\u0004\b%\u0010\t"}, d2 = {"Landroidx/navigation/serialization/InternalNavType;", "", "<init>", "()V", "Landroidx/navigation/NavType;", "", "IntNullableType", "Landroidx/navigation/NavType;", "getIntNullableType", "()Landroidx/navigation/NavType;", "", "BoolNullableType", "getBoolNullableType", "", "DoubleType", "getDoubleType", "DoubleNullableType", "getDoubleNullableType", "", "FloatNullableType", "getFloatNullableType", "", "LongNullableType", "getLongNullableType", "", "StringNonNullableType", "getStringNonNullableType", "", "StringNullableArrayType", "getStringNullableArrayType", "", "StringNullableListType", "getStringNullableListType", "", "DoubleArrayType", "getDoubleArrayType", "DoubleListType", "getDoubleListType"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InternalNavType {
    public static final InternalNavType INSTANCE = new InternalNavType();
    private static final NavType<Integer> IntNullableType = new NavType<Integer>() { // from class: androidx.navigation.serialization.InternalNavType$IntNullableType$1
        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return "integer_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Integer parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (Intrinsics.areEqual(p0, "null")) {
                return null;
            }
            return NavType.IntType.parseValue(p0);
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, Integer p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            if (p2 == null) {
                SavedStateWriter.m7477putNullimpl(SavedStateWriter.m7454constructorimpl(p0), p1);
            } else {
                NavType.IntType.put(p0, p1, p2);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Integer get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
                return null;
            }
            return Integer.valueOf(SavedStateReader.m7399getIntimpl(bundleM7368constructorimpl, p1));
        }
    };
    private static final NavType<Boolean> BoolNullableType = new NavType<Boolean>() { // from class: androidx.navigation.serialization.InternalNavType$BoolNullableType$1
        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return "boolean_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Boolean parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (Intrinsics.areEqual(p0, "null")) {
                return null;
            }
            return NavType.BoolType.parseValue(p0);
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, Boolean p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            if (p2 == null) {
                SavedStateWriter.m7477putNullimpl(SavedStateWriter.m7454constructorimpl(p0), p1);
            } else {
                NavType.BoolType.put(p0, p1, p2);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Boolean get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
                return null;
            }
            return Boolean.valueOf(SavedStateReader.m7377getBooleanimpl(bundleM7368constructorimpl, p1));
        }
    };
    private static final NavType<Double> DoubleType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleType$1
        @Override // androidx.p005navigation.NavType
        public final /* bridge */ /* synthetic */ void put(Bundle bundle, String str, Double d) {
            put(bundle, str, d.doubleValue());
        }

        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return "double";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Double parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return Double.valueOf(Double.parseDouble(p0));
        }

        public final void put(Bundle p0, String p1, double p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            SavedStateWriter.m7467putDoubleimpl(SavedStateWriter.m7454constructorimpl(p0), p1, p2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Double get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return Double.valueOf(SavedStateReader.m7391getDoubleimpl(SavedStateReader.m7368constructorimpl(p0), p1));
        }
    };
    private static final NavType<Double> DoubleNullableType = new NavType<Double>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleNullableType$1
        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return "double_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Double parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (Intrinsics.areEqual(p0, "null")) {
                return null;
            }
            return InternalNavType.INSTANCE.getDoubleType().parseValue(p0);
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, Double p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            if (p2 == null) {
                SavedStateWriter.m7477putNullimpl(SavedStateWriter.m7454constructorimpl(p0), p1);
            } else {
                InternalNavType.INSTANCE.getDoubleType().put(p0, p1, p2);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Double get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
                return null;
            }
            return Double.valueOf(SavedStateReader.m7391getDoubleimpl(bundleM7368constructorimpl, p1));
        }
    };
    private static final NavType<Float> FloatNullableType = new NavType<Float>() { // from class: androidx.navigation.serialization.InternalNavType$FloatNullableType$1
        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return "float_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Float parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (Intrinsics.areEqual(p0, "null")) {
                return null;
            }
            return NavType.FloatType.parseValue(p0);
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, Float p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            if (p2 == null) {
                SavedStateWriter.m7477putNullimpl(SavedStateWriter.m7454constructorimpl(p0), p1);
            } else {
                NavType.FloatType.put(p0, p1, p2);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Float get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
                return null;
            }
            return Float.valueOf(SavedStateReader.m7395getFloatimpl(bundleM7368constructorimpl, p1));
        }
    };
    private static final NavType<Long> LongNullableType = new NavType<Long>() { // from class: androidx.navigation.serialization.InternalNavType$LongNullableType$1
        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return "long_nullable";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Long parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (Intrinsics.areEqual(p0, "null")) {
                return null;
            }
            return NavType.LongType.parseValue(p0);
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, Long p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            if (p2 == null) {
                SavedStateWriter.m7477putNullimpl(SavedStateWriter.m7454constructorimpl(p0), p1);
            } else {
                NavType.LongType.put(p0, p1, p2);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.p005navigation.NavType
        public final Long get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
                return null;
            }
            return Long.valueOf(SavedStateReader.m7409getLongimpl(bundleM7368constructorimpl, p1));
        }
    };
    private static final NavType<String> StringNonNullableType = new NavType<String>() { // from class: androidx.navigation.serialization.InternalNavType$StringNonNullableType$1
        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return "string_non_nullable";
        }

        @Override // androidx.p005navigation.NavType
        public final String serializeAsValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return NavUriUtils.encode$default(NavUriUtils.INSTANCE, p0, null, 2, null);
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, String p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            SavedStateWriter.m7487putStringimpl(SavedStateWriter.m7454constructorimpl(p0), p1, p2);
        }

        @Override // androidx.p005navigation.NavType
        public final String get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            return (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) ? "null" : SavedStateReader.m7439getStringimpl(bundleM7368constructorimpl, p1);
        }

        @Override // androidx.p005navigation.NavType
        public final String parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return p0;
        }
    };
    private static final NavType<String[]> StringNullableArrayType = new CollectionNavType<String[]>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableArrayType$1
        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return "string_nullable[]";
        }

        @Override // androidx.p005navigation.NavType
        public final String[] parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new String[]{NavType.StringType.parseValue(p0)};
        }

        @Override // androidx.p005navigation.NavType
        public final String[] parseValue(String p0, String[] p1) {
            String[] strArr;
            Intrinsics.checkNotNullParameter(p0, "");
            return (p1 == null || (strArr = (String[]) ArraysKt.plus((Object[]) p1, (Object[]) parseValue(p0))) == null) ? parseValue(p0) : strArr;
        }

        @Override // androidx.p005navigation.NavType
        public final boolean valueEquals(String[] p0, String[] p1) {
            return ArraysKt.contentDeepEquals(p0, p1);
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, String[] p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(p0);
            if (p2 == null) {
                SavedStateWriter.m7477putNullimpl(bundleM7454constructorimpl, p1);
                return;
            }
            ArrayList arrayList = new ArrayList(p2.length);
            for (String str : p2) {
                if (str == null) {
                    str = "null";
                }
                arrayList.add(str);
            }
            SavedStateWriter.m7488putStringArrayimpl(bundleM7454constructorimpl, p1, (String[]) arrayList.toArray(new String[0]));
        }

        @Override // androidx.p005navigation.NavType
        public final String[] get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
                return null;
            }
            String[] strArrM7440getStringArrayimpl = SavedStateReader.m7440getStringArrayimpl(bundleM7368constructorimpl, p1);
            ArrayList arrayList = new ArrayList(strArrM7440getStringArrayimpl.length);
            for (String str : strArrM7440getStringArrayimpl) {
                arrayList.add(NavType.StringType.parseValue(str));
            }
            return (String[]) arrayList.toArray(new String[0]);
        }

        @Override // androidx.p005navigation.CollectionNavType
        public final List<String> serializeAsValues(String[] p0) {
            String strEncode$default;
            if (p0 == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(p0.length);
            for (String str : p0) {
                if (str == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null)) == null) {
                    strEncode$default = "null";
                }
                arrayList.add(strEncode$default);
            }
            return arrayList;
        }

        @Override // androidx.p005navigation.CollectionNavType
        public final String[] emptyCollection() {
            return new String[0];
        }
    };
    private static final NavType<List<String>> StringNullableListType = new CollectionNavType<List<? extends String>>() { // from class: androidx.navigation.serialization.InternalNavType$StringNullableListType$1
        @Override // androidx.p005navigation.CollectionNavType
        public final /* bridge */ /* synthetic */ List serializeAsValues(List<? extends String> list) {
            return serializeAsValues2((List<String>) list);
        }

        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return "List<String?>";
        }

        @Override // androidx.p005navigation.NavType
        public final List<String> parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return CollectionsKt.listOf(NavType.StringType.parseValue(p0));
        }

        @Override // androidx.p005navigation.NavType
        public final List<String> parseValue(String p0, List<String> p1) {
            List<String> listPlus;
            Intrinsics.checkNotNullParameter(p0, "");
            return (p1 == null || (listPlus = CollectionsKt.plus((Collection) p1, (Iterable) parseValue(p0))) == null) ? parseValue(p0) : listPlus;
        }

        @Override // androidx.p005navigation.NavType
        public final boolean valueEquals(List<String> p0, List<String> p1) {
            return ArraysKt.contentDeepEquals(p0 != null ? (String[]) p0.toArray(new String[0]) : null, p1 != null ? (String[]) p1.toArray(new String[0]) : null);
        }

        /* JADX INFO: renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public final List<String> serializeAsValues2(List<String> p0) {
            String strEncode$default;
            if (p0 != null) {
                List<String> list = p0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (String str : list) {
                    if (str == null || (strEncode$default = NavUriUtils.encode$default(NavUriUtils.INSTANCE, str, null, 2, null)) == null) {
                        strEncode$default = "null";
                    }
                    arrayList.add(strEncode$default);
                }
                return arrayList;
            }
            return CollectionsKt.emptyList();
        }

        @Override // androidx.p005navigation.CollectionNavType
        public final List<? extends String> emptyCollection() {
            return CollectionsKt.emptyList();
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, List<String> p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(p0);
            if (p2 == null) {
                SavedStateWriter.m7477putNullimpl(bundleM7454constructorimpl, p1);
                return;
            }
            List<String> list = p2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (String str : list) {
                if (str == null) {
                    str = "null";
                }
                arrayList.add(str);
            }
            SavedStateWriter.m7488putStringArrayimpl(bundleM7454constructorimpl, p1, (String[]) arrayList.toArray(new String[0]));
        }

        @Override // androidx.p005navigation.NavType
        public final List<String> get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
                return null;
            }
            List list = ArraysKt.toList(SavedStateReader.m7440getStringArrayimpl(bundleM7368constructorimpl, p1));
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(NavType.StringType.parseValue((String) it.next()));
            }
            return arrayList;
        }
    };
    private static final NavType<double[]> DoubleArrayType = new CollectionNavType<double[]>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleArrayType$1
        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return "double[]";
        }

        @Override // androidx.p005navigation.NavType
        public final double[] parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new double[]{InternalNavType.INSTANCE.getDoubleType().parseValue(p0).doubleValue()};
        }

        @Override // androidx.p005navigation.NavType
        public final double[] parseValue(String p0, double[] p1) {
            double[] dArrPlus;
            Intrinsics.checkNotNullParameter(p0, "");
            return (p1 == null || (dArrPlus = ArraysKt.plus(p1, parseValue(p0))) == null) ? parseValue(p0) : dArrPlus;
        }

        @Override // androidx.p005navigation.NavType
        public final boolean valueEquals(double[] p0, double[] p1) {
            return ArraysKt.contentDeepEquals(p0 != null ? ArraysKt.toTypedArray(p0) : null, p1 != null ? ArraysKt.toTypedArray(p1) : null);
        }

        @Override // androidx.p005navigation.CollectionNavType
        public final List<String> serializeAsValues(double[] p0) {
            List<Double> list;
            if (p0 == null || (list = ArraysKt.toList(p0)) == null) {
                return CollectionsKt.emptyList();
            }
            List<Double> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
            }
            return arrayList;
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, double[] p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(p0);
            if (p2 == null) {
                SavedStateWriter.m7477putNullimpl(bundleM7454constructorimpl, p1);
            } else {
                SavedStateWriter.m7468putDoubleArrayimpl(bundleM7454constructorimpl, p1, p2);
            }
        }

        @Override // androidx.p005navigation.NavType
        public final double[] get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
                return null;
            }
            return SavedStateReader.m7392getDoubleArrayimpl(bundleM7368constructorimpl, p1);
        }

        @Override // androidx.p005navigation.CollectionNavType
        public final double[] emptyCollection() {
            return new double[0];
        }
    };
    private static final NavType<List<Double>> DoubleListType = new CollectionNavType<List<? extends Double>>() { // from class: androidx.navigation.serialization.InternalNavType$DoubleListType$1
        @Override // androidx.p005navigation.CollectionNavType
        public final /* bridge */ /* synthetic */ List serializeAsValues(List<? extends Double> list) {
            return serializeAsValues2((List<Double>) list);
        }

        @Override // androidx.p005navigation.NavType
        public final String getName() {
            return "List<Double>";
        }

        @Override // androidx.p005navigation.NavType
        public final List<Double> parseValue(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return CollectionsKt.listOf(InternalNavType.INSTANCE.getDoubleType().parseValue(p0));
        }

        @Override // androidx.p005navigation.NavType
        public final List<Double> parseValue(String p0, List<Double> p1) {
            List<Double> listPlus;
            Intrinsics.checkNotNullParameter(p0, "");
            return (p1 == null || (listPlus = CollectionsKt.plus((Collection) p1, (Iterable) parseValue(p0))) == null) ? parseValue(p0) : listPlus;
        }

        @Override // androidx.p005navigation.NavType
        public final boolean valueEquals(List<Double> p0, List<Double> p1) {
            return ArraysKt.contentDeepEquals(p0 != null ? (Double[]) p0.toArray(new Double[0]) : null, p1 != null ? (Double[]) p1.toArray(new Double[0]) : null);
        }

        /* JADX INFO: renamed from: serializeAsValues, reason: avoid collision after fix types in other method */
        public final List<String> serializeAsValues2(List<Double> p0) {
            if (p0 != null) {
                List<Double> list = p0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
                }
                return arrayList;
            }
            return CollectionsKt.emptyList();
        }

        @Override // androidx.p005navigation.CollectionNavType
        public final List<? extends Double> emptyCollection() {
            return CollectionsKt.emptyList();
        }

        @Override // androidx.p005navigation.NavType
        public final void put(Bundle p0, String p1, List<Double> p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(p0);
            if (p2 == null) {
                SavedStateWriter.m7477putNullimpl(bundleM7454constructorimpl, p1);
            } else {
                SavedStateWriter.m7468putDoubleArrayimpl(bundleM7454constructorimpl, p1, CollectionsKt.toDoubleArray(p2));
            }
        }

        @Override // androidx.p005navigation.NavType
        public final List<Double> get(Bundle p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Bundle bundleM7368constructorimpl = SavedStateReader.m7368constructorimpl(p0);
            if (!SavedStateReader.m7369containsimpl(bundleM7368constructorimpl, p1) || SavedStateReader.m7447isNullimpl(bundleM7368constructorimpl, p1)) {
                return null;
            }
            return ArraysKt.toList(SavedStateReader.m7392getDoubleArrayimpl(bundleM7368constructorimpl, p1));
        }
    };

    private InternalNavType() {
    }

    public final NavType<Integer> getIntNullableType() {
        return IntNullableType;
    }

    public final NavType<Boolean> getBoolNullableType() {
        return BoolNullableType;
    }

    public final NavType<Double> getDoubleType() {
        return DoubleType;
    }

    public final NavType<Double> getDoubleNullableType() {
        return DoubleNullableType;
    }

    public final NavType<Float> getFloatNullableType() {
        return FloatNullableType;
    }

    public final NavType<Long> getLongNullableType() {
        return LongNullableType;
    }

    public final NavType<String> getStringNonNullableType() {
        return StringNonNullableType;
    }

    public final NavType<String[]> getStringNullableArrayType() {
        return StringNullableArrayType;
    }

    public final NavType<List<String>> getStringNullableListType() {
        return StringNullableListType;
    }

    public final NavType<double[]> getDoubleArrayType() {
        return DoubleArrayType;
    }

    public final NavType<List<Double>> getDoubleListType() {
        return DoubleListType;
    }
}

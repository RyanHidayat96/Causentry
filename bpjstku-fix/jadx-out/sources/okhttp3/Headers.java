package okhttp3;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\f\u0018\u0000 22\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u000232B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u001aH\u0097\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001fH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0017H\u0007¢\u0006\u0004\b%\u0010\u0019J!\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030'0&H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0003H\u0017¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0017H\u0007¢\u0006\u0004\b,\u0010\u001eJ\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030'2\u0006\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b-\u0010.R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0011\u00101\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b1\u0010\u0019"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "", "p0", "<init>", "([Ljava/lang/String;)V", "", "byteCount", "()J", "", "", "equals", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "getDate", "(Ljava/lang/String;)Ljava/util/Date;", "Ljava/time/Instant;", "getInstant", "(Ljava/lang/String;)Ljava/time/Instant;", "", "hashCode", "()I", "", "iterator", "()Ljava/util/Iterator;", "name", "(I)Ljava/lang/String;", "", "names", "()Ljava/util/Set;", "Lokhttp3/Headers$Builder;", "newBuilder", "()Lokhttp3/Headers$Builder;", "-deprecated_size", "", "", "toMultimap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "value", "values", "(Ljava/lang/String;)Ljava/util/List;", "namesAndValues", "[Ljava/lang/String;", "size", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String[] namesAndValues;

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public final String get(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return INSTANCE.get(this.namesAndValues, p0);
    }

    public final Date getDate(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        String str = get(p0);
        if (str != null) {
            return DatesKt.toHttpDateOrNull(str);
        }
        return null;
    }

    public final Instant getInstant(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Date date = getDate(p0);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m9564deprecated_size() {
        return size();
    }

    public final String name(int p0) {
        return this.namesAndValues[p0 * 2];
    }

    public final String value(int p0) {
        return this.namesAndValues[(p0 * 2) + 1];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "");
        return setUnmodifiableSet;
    }

    public final List<String> values(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (StringsKt.equals(p0, name(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList != null) {
            List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
            return listUnmodifiableList;
        }
        return CollectionsKt.emptyList();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.namesAndValues[i].length();
        }
        return length;
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = TuplesKt.to(name(i), value(i));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        CollectionsKt.addAll(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) p0).namesAndValues);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strName = name(i);
            String strValue = value(i);
            sb.append(strName);
            sb.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb.append(strValue);
            sb.append("\n");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i = 0; i < size; i++) {
            String strName = name(i);
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = strName.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            ArrayList arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i));
        }
        return treeMap;
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0006\u0010\fJ\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0011\u0010\u0007J\u001f\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0007J \u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0087\u0002¢\u0006\u0004\b\u0018\u0010\nJ \u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b\u0018\u0010\fJ \u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u0018\u0010\rR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lokhttp3/Headers$Builder;", "", "<init>", "()V", "", "p0", "add", "(Ljava/lang/String;)Lokhttp3/Headers$Builder;", "Ljava/time/Instant;", "p1", "(Ljava/lang/String;Ljava/time/Instant;)Lokhttp3/Headers$Builder;", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)Lokhttp3/Headers$Builder;", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", "Lokhttp3/Headers;", "addAll", "(Lokhttp3/Headers;)Lokhttp3/Headers$Builder;", "addLenient$okhttp", "addUnsafeNonAscii", "build", "()Lokhttp3/Headers;", "get", "(Ljava/lang/String;)Ljava/lang/String;", "removeAll", "set", "", "namesAndValues", "Ljava/util/List;", "getNamesAndValues$okhttp", "()Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder addLenient$okhttp(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) p0, ':', 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = p0.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                String strSubstring2 = p0.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                addLenient$okhttp(strSubstring, strSubstring2);
                return this;
            }
            if (p0.charAt(0) == ':') {
                String strSubstring3 = p0.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                addLenient$okhttp("", strSubstring3);
                return this;
            }
            addLenient$okhttp("", p0);
            return this;
        }

        public final Builder add(String p0) throws IllegalAccessException {
            Intrinsics.checkNotNullParameter(p0, "");
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1096626159);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - TextUtils.getOffsetBefore("", 0)), 40 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getFadingEdgeLength() >> 16) + 19, 1513912262, false, "b", null);
            }
            int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-914723831);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (37836 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), KeyEvent.keyCodeFromString("") + 59, KeyEvent.normalizeMetaState(0) + 18, 769969118, false, "TuitionPaymentFragmentbindingInflater1", null);
            }
            int i2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
            long j = i2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-639884696);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (37836 - (ViewConfiguration.getLongPressTimeout() >> 16)), 59 - TextUtils.getOffsetBefore("", 0), 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1027769791, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault1", null);
            }
            int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).getInt(null);
            long j2 = 69;
            long j3 = -1;
            long j4 = j3 ^ 970104010673821343L;
            long j5 = j3 ^ 4549149486485964896L;
            long jUptimeMillis = (int) SystemClock.uptimeMillis();
            long j6 = (((long) 70) * 970104010673821343L) + (((long) (-68)) * 4549149486485964896L) + (((((j4 | j5) | jUptimeMillis) ^ j3) | ((4573356489961742079L | jUptimeMillis) ^ j3)) * j2) + (((long) (-69)) * (((j4 | 4549149486485964896L) ^ j3) | ((j4 | jUptimeMillis) ^ j3) | ((jUptimeMillis | 4549149486485964896L) ^ j3))) + (((j5 | 970104010673821343L) ^ j3) * j2);
            int i4 = i3;
            long j7 = j;
            int i5 = 0;
            while (true) {
                for (int i6 = 0; i6 != 8; i6++) {
                    i4 = (((((int) (j7 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                }
                if (i5 != 0) {
                    break;
                }
                i5++;
                j7 = j6;
            }
            if (i4 != i) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1551937752);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (46400 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 40 - View.getDefaultSize(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 20, -1205987569, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault2", null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                throw new RuntimeException(String.valueOf(i2));
            }
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) p0, ':', 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(String.valueOf(p0)).toString());
            }
            String strSubstring = p0.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = StringsKt.trim((CharSequence) strSubstring).toString();
            String strSubstring2 = p0.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            add(string, strSubstring2);
            return this;
        }

        public final Builder add(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Headers.INSTANCE.checkName(p0);
            Headers.INSTANCE.checkValue(p1, p0);
            addLenient$okhttp(p0, p1);
            return this;
        }

        public final Builder addUnsafeNonAscii(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Headers.INSTANCE.checkName(p0);
            addLenient$okhttp(p0, p1);
            return this;
        }

        public final Builder addAll(Headers p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            int size = p0.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(p0.name(i), p0.value(i));
            }
            return this;
        }

        public final Builder add(String p0, Date p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            add(p0, DatesKt.toHttpDateString(p1));
            return this;
        }

        public final Builder add(String p0, Instant p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            add(p0, new Date(p1.toEpochMilli()));
            return this;
        }

        public final Builder set(String p0, Date p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            set(p0, DatesKt.toHttpDateString(p1));
            return this;
        }

        public final Builder set(String p0, Instant p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            return set(p0, new Date(p1.toEpochMilli()));
        }

        public final Builder addLenient$okhttp(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.namesAndValues.add(p0);
            this.namesAndValues.add(StringsKt.trim((CharSequence) p1).toString());
            return this;
        }

        public final Builder removeAll(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (StringsKt.equals(p0, this.namesAndValues.get(i), true)) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String p0, String p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Headers.INSTANCE.checkName(p0);
            Headers.INSTANCE.checkValue(p1, p0);
            removeAll(p0);
            addLenient$okhttp(p0, p1);
            return this;
        }

        public final String get(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            int size = this.namesAndValues.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return null;
            }
            while (!StringsKt.equals(p0, this.namesAndValues.get(size), true)) {
                if (size == progressionLastElement) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }
    }

    @JvmStatic
    public static final Headers of(Map<String, String> map) {
        return INSTANCE.of(map);
    }

    @JvmStatic
    public static final Headers of(String... strArr) {
        return INSTANCE.of(strArr);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\"\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u000f2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\f\"\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0012\u001a\u00020\u000f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013H\u0007¢\u0006\u0004\b\u0012\u0010\u0014J\u001f\u0010\u0010\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013H\u0007¢\u0006\u0004\b\u0010\u0010\u0014"}, d2 = {"Lokhttp3/Headers$Companion;", "", "<init>", "()V", "", "p0", "", "checkName", "(Ljava/lang/String;)V", "p1", "checkValue", "(Ljava/lang/String;Ljava/lang/String;)V", "", "get", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/Headers;", "of", "([Ljava/lang/String;)Lokhttp3/Headers;", "-deprecated_of", "", "(Ljava/util/Map;)Lokhttp3/Headers;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] p0, String p1) {
            int length = p0.length - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
            if (progressionLastElement > length) {
                return null;
            }
            while (!StringsKt.equals(p1, p0[length], true)) {
                if (length == progressionLastElement) {
                    return null;
                }
                length -= 2;
            }
            return p0[length + 1];
        }

        @JvmStatic
        public final Headers of(String... p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values".toString());
            }
            String[] strArr = (String[]) p0.clone();
            int length = strArr.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                String str = strArr[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
                strArr[i2] = StringsKt.trim((CharSequence) str).toString();
            }
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
            if (progressionLastElement >= 0) {
                while (true) {
                    String str2 = strArr[i];
                    String str3 = strArr[i + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i == progressionLastElement) {
                        break;
                    }
                    i += 2;
                }
            }
            return new Headers(strArr, null);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "function name changed", replaceWith = @ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}))
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m9566deprecated_of(String... p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return of((String[]) Arrays.copyOf(p0, p0.length));
        }

        @JvmStatic
        public final Headers of(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = StringsKt.trim((CharSequence) key).toString();
                String string2 = StringsKt.trim((CharSequence) value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            return new Headers(strArr, null);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @ReplaceWith(expression = "headers.toHeaders()", imports = {}))
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m9565deprecated_of(Map<String, String> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return of(p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String p0) {
            if (p0.length() <= 0) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = p0.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = p0.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), p0).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String p0, String p1) {
            int length = p0.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = p0.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), p1));
                    sb.append(Util.isSensitiveHeader(p1) ? "" : ": ".concat(String.valueOf(p0)));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

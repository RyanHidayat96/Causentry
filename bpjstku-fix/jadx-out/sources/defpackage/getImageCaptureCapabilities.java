package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.datadog.android.api.InternalLogger;
import defpackage.getImageCaptureCapabilities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002JP\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u001a0\u0019\"\u0004\b\u0000\u0010\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u001a0\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001fH\u0016J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0006H\u0016J(\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#0\u00192\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#0\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\u0002`\t0\u0006X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000b¨\u0006&"}, d2 = {"Lcom/datadog/android/core/constraints/DatadogDataConstraints;", "Lcom/datadog/android/core/constraints/DataConstraints;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/api/InternalLogger;)V", "tagTransforms", "", "Lkotlin/Function1;", "", "Lcom/datadog/android/core/internal/constraints/StringTransform;", "getTagTransforms$annotations", "()V", "convertAttributeKey", "rawKey", "prefixDotCount", "", "convertTag", "rawTag", "isKeyReserved", "", "tag", "resolveDiscardedAttrsWarning", "attributesGroupName", "discardedCount", "validateAttributes", "", ExifInterface.GPS_DIRECTION_TRUE, "attributes", "", "keyPrefix", "reservedKeys", "", "validateTags", "tags", "validateTimings", "", "timings", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getImageCaptureCapabilities implements computeDispatchCropRect {
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;
    private final List<Function1<String, String>> b;
    public static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(null);
    private static final Set<String> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = SetsKt.setOf((Object[]) new String[]{"host", "device", "source", NotificationCompat.CATEGORY_SERVICE});

    public getImageCaptureCapabilities(InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
        this.b = CollectionsKt.listOf((Object[]) new Function1[]{new Function1<String, String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = str.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                return lowerCase;
            }
        }, new Function1<String, String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                CharRange charRange = new CharRange('a', 'z');
                Character orNull = StringsKt.getOrNull(str, 0);
                if (orNull == null || !charRange.contains(orNull.charValue())) {
                    return null;
                }
                return str;
            }
        }, new Function1<String, String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Regex("[^a-z0-9_:./-]").replace(str, "_");
            }
        }, new Function1<String, String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                String str2 = str;
                if (!StringsKt.endsWith$default((CharSequence) str2, ':', false, 2, (Object) null)) {
                    return str;
                }
                String strSubstring = str.substring(0, StringsKt.getLastIndex(str2));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                return strSubstring;
            }
        }, new Function1<String, String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                if (str.length() <= 200) {
                    return str;
                }
                String strSubstring = str.substring(0, 200);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                return strSubstring;
            }
        }, new Function1<String, String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                if (getImageCaptureCapabilities.TuitionPaymentFragmentbindingInflater1(str)) {
                    return null;
                }
                return str;
            }

            {
                super(1);
            }
        }});
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x003b A[SYNTHETIC] */
    @Override // defpackage.computeDispatchCropRect
    public final <T> Map<String, T> b(Map<String, ? extends T> map, String str, String str2, Set<String> set) {
        final String string;
        Pair pair;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(set, "");
        String str3 = str;
        int i = 0;
        for (int i2 = 0; i2 < str3.length(); i2++) {
            if (str3.charAt(i2) == '.') {
                i++;
            }
        }
        int i3 = i + 1;
        ArrayList arrayList = new ArrayList();
        for (final Map.Entry<String, ? extends T> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                if (!set.contains(entry.getKey())) {
                    String key = entry.getKey();
                    ArrayList arrayList2 = new ArrayList(key.length());
                    int i4 = i3;
                    for (int i5 = 0; i5 < key.length(); i5++) {
                        char cCharAt = key.charAt(i5);
                        if (cCharAt == '.' && (i4 = i4 + 1) > 9) {
                            cCharAt = '_';
                        }
                        arrayList2.add(Character.valueOf(cCharAt));
                    }
                    final String str4 = new String(CollectionsKt.toCharArray(arrayList2));
                    if (!Intrinsics.areEqual(str4, entry.getKey())) {
                        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$convertedAttributes$1$3
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                String key2 = entry.getKey();
                                String str5 = str4;
                                StringBuilder sb = new StringBuilder("Key \"");
                                sb.append((Object) key2);
                                sb.append("\" was modified to \"");
                                sb.append(str5);
                                sb.append("\" to match our constraints.");
                                return sb.toString();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }
                        }, null, false, null);
                    }
                    pair = TuplesKt.to(str4, entry.getValue());
                } else {
                    this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$convertedAttributes$1$2
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            Object obj = entry;
                            StringBuilder sb = new StringBuilder("\"");
                            sb.append(obj);
                            sb.append("\" key was in the reservedKeys set, and was dropped.");
                            return sb.toString();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }
                    }, null, false, null);
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            } else {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$convertedAttributes$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        Object obj = entry;
                        StringBuilder sb = new StringBuilder("\"");
                        sb.append(obj);
                        sb.append("\" is an invalid attribute, and was ignored.");
                        return sb.toString();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }
                }, null, false, null);
            }
            pair = null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        ArrayList arrayList3 = arrayList;
        int size = arrayList3.size() - 128;
        if (size > 0) {
            if (str2 != null) {
                StringBuilder sb = new StringBuilder("Too many attributes were added for [");
                sb.append(str2);
                sb.append("], ");
                sb.append(size);
                sb.append(" had to be discarded.");
                string = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder("Too many attributes were added, ");
                sb2.append(size);
                sb2.append(" had to be discarded.");
                string = sb2.toString();
            }
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return string;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
        }
        return createPlaneProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CollectionsKt.take(arrayList3, 128));
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"LgetImageCaptureCapabilities$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/Set;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.computeDispatchCropRect
    public final Map<String, Long> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Map<String, Long> map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            final Map.Entry entry = (Map.Entry) it.next();
            final String strReplace = new Regex("[^a-zA-Z0-9\\-_.@$]").replace((CharSequence) entry.getKey(), "_");
            if (!Intrinsics.areEqual(strReplace, entry.getKey())) {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateTimings$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        String str = String.format(Locale.US, "Invalid timing name: %s, sanitized to: %s", Arrays.copyOf(new Object[]{entry.getKey(), strReplace}, 2));
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        return str;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, null, false, null);
            }
            linkedHashMap.put(strReplace, entry.getValue());
        }
        return MapsKt.toMutableMap(linkedHashMap);
    }

    public static final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(String str) {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ':', 0, false, 6, (Object) null);
        if (iIndexOf$default <= 0) {
            return false;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1.contains(strSubstring);
    }
}

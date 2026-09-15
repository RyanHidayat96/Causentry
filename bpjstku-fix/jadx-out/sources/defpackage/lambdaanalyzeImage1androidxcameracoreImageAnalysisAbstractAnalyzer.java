package defpackage;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016"}, d2 = {"LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer {
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {"id", "name", "email"};

    public lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer(String str, String str2, String str3, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
    }

    public /* synthetic */ lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX INFO: renamed from: lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "", "p0", "LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;", "b", "(Ljava/lang/String;)LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;)LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "[Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer b(String p0) throws JsonParseException {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                JsonObject asJsonObject = JsonParser.parseString(p0).getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return b(asJsonObject);
            } catch (IllegalStateException e2) {
                throw new JsonParseException("Unable to parse json into type UserInfo", e2);
            }
        }

        @JvmStatic
        private static lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer b(JsonObject p0) throws JsonParseException {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                JsonElement jsonElement = p0.get("id");
                String asString = jsonElement != null ? jsonElement.getAsString() : null;
                JsonElement jsonElement2 = p0.get("name");
                String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                JsonElement jsonElement3 = p0.get("email");
                String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, JsonElement> entry : p0.entrySet()) {
                    if (!ArraysKt.contains(lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault1, entry.getKey())) {
                        String key = entry.getKey();
                        Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, entry.getValue());
                    }
                }
                return new lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer(asString, asString2, asString3, linkedHashMap);
            } catch (IllegalStateException e2) {
                throw new JsonParseException("Unable to parse json into type UserInfo", e2);
            } catch (NullPointerException e3) {
                throw new JsonParseException("Unable to parse json into type UserInfo", e3);
            } catch (NumberFormatException e4) {
                throw new JsonParseException("Unable to parse json into type UserInfo", e4);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer)) {
            return false;
        }
        lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer = (lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer) p0;
        return Intrinsics.areEqual(this.b, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = this.TuitionPaymentFragmentbindingInflater1;
        Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer(b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}

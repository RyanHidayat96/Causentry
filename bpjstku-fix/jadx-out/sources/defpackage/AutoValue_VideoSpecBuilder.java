package defpackage;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.LinkedHashTreeMap;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_VideoSpecBuilder<K, V> extends AutoValue_RecordingStats<Map<K, V>> {
    public static final AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1 = new AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: AutoValue_VideoSpecBuilder.2
        @Override // AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final AutoValue_RecordingStats<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Type type, Set<? extends Annotation> set, CapabilitiesByQuality capabilitiesByQuality) {
            Class<?> clsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Type[] actualTypeArguments;
            if (!set.isEmpty() || (clsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type)) != Map.class) {
                return null;
            }
            if (type == Properties.class) {
                actualTypeArguments = new Type[]{String.class, String.class};
            } else {
                if (!Map.class.isAssignableFrom(clsTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    throw new IllegalArgumentException();
                }
                Type typeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1(type, clsTuitionPaymentFragmentspecialinlinedviewModeldefault2, checkQualityConstantsOrThrow.TuitionPaymentFragmentbindingInflater1(type, clsTuitionPaymentFragmentspecialinlinedviewModeldefault2, Map.class));
                if (typeTuitionPaymentFragmentspecialinlinedviewModeldefault1 instanceof ParameterizedType) {
                    actualTypeArguments = ((ParameterizedType) typeTuitionPaymentFragmentspecialinlinedviewModeldefault1).getActualTypeArguments();
                } else {
                    actualTypeArguments = new Type[]{Object.class, Object.class};
                }
            }
            return new getEncoderProfiles(new AutoValue_VideoSpecBuilder(capabilitiesByQuality, actualTypeArguments[0], actualTypeArguments[1]));
        }
    };
    private final AutoValue_RecordingStats<K> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final AutoValue_RecordingStats<V> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.AutoValue_RecordingStats
    public final /* bridge */ /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Object obj) throws IOException {
        setqualityselector.b();
        for (Map.Entry<K, V> entry : ((Map) obj).entrySet()) {
            if (entry.getKey() == null) {
                StringBuilder sb = new StringBuilder("Map key is null at ");
                sb.append(setqualityselector.g());
                throw new JsonDataException(sb.toString());
            }
            int i = setqualityselector.asInterface;
            if (i == 0) {
                throw new IllegalStateException("JsonWriter is closed.");
            }
            int i2 = setqualityselector.d[i - 1];
            if (i2 != 5 && i2 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            setqualityselector.f1381a = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, entry.getKey());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, entry.getValue());
        }
        setqualityselector.TuitionPaymentFragmentbindingInflater1();
    }

    AutoValue_VideoSpecBuilder(CapabilitiesByQuality capabilitiesByQuality, Type type, Type type2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type, checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type2, checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonAdapter(");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.AutoValue_RecordingStats
    public final /* bridge */ /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        jsonReader.b();
        while (jsonReader.a()) {
            jsonReader.onTransact();
            K kB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(jsonReader);
            V vB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(jsonReader);
            V vPut = linkedHashTreeMap.put(kB, vB);
            if (vPut != null) {
                StringBuilder sb = new StringBuilder("Map key '");
                sb.append(kB);
                sb.append("' has multiple values at path ");
                sb.append(jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                sb.append(": ");
                sb.append(vPut);
                sb.append(" and ");
                sb.append(vB);
                throw new JsonDataException(sb.toString());
            }
        }
        jsonReader.TuitionPaymentFragmentbindingInflater1();
        return linkedHashTreeMap;
    }
}

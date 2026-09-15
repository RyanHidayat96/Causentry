package defpackage;

import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class isPersistent extends AutoValue_RecordingStats<Object> {
    public static final AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: isPersistent.4
        @Override // AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final AutoValue_RecordingStats<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Type type, Set<? extends Annotation> set, CapabilitiesByQuality capabilitiesByQuality) {
            Type componentType;
            if (type instanceof GenericArrayType) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = type instanceof Class ? ((Class) type).getComponentType() : null;
            }
            if (componentType != null && set.isEmpty()) {
                return new getEncoderProfiles(new isPersistent(toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault2(componentType), capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(componentType, checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null)));
            }
            return null;
        }
    };
    private final Class<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final AutoValue_RecordingStats<Object> b;

    isPersistent(Class<?> cls, AutoValue_RecordingStats<Object> autoValue_RecordingStats) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cls;
        this.b = autoValue_RecordingStats;
    }

    @Override // defpackage.AutoValue_RecordingStats
    public final Object b(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        while (jsonReader.a()) {
            arrayList.add(this.b.b(jsonReader));
        }
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        Object objNewInstance = Array.newInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // defpackage.AutoValue_RecordingStats
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Object obj) throws IOException {
        setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, Array.get(obj, i));
        }
        setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(".array()");
        return sb.toString();
    }
}

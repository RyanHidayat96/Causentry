package retrofit2.converter.moshi;

import defpackage.AutoValue_RecordingStats;
import defpackage.CapabilitiesByQuality;
import defpackage.getQualitySelector;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes4.dex */
public final class MoshiConverterFactory extends Converter.Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final CapabilitiesByQuality moshi;
    private final boolean serializeNulls;

    public static MoshiConverterFactory create() {
        return create(new CapabilitiesByQuality(new CapabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
    }

    public static MoshiConverterFactory create(CapabilitiesByQuality capabilitiesByQuality) {
        if (capabilitiesByQuality == null) {
            throw new NullPointerException("moshi == null");
        }
        return new MoshiConverterFactory(capabilitiesByQuality, false, false, false);
    }

    private MoshiConverterFactory(CapabilitiesByQuality capabilitiesByQuality, boolean z, boolean z2, boolean z3) {
        this.moshi = capabilitiesByQuality;
        this.lenient = z;
        this.failOnUnknown = z2;
        this.serializeNulls = z3;
    }

    public final MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls);
    }

    public final MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls);
    }

    public final MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true);
    }

    @Override // retrofit2.Converter.Factory
    public final Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        AutoValue_RecordingStats autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.moshi.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type, jsonAnnotations(annotationArr), null);
        if (this.lenient) {
            autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AutoValue_RecordingStats.AnonymousClass3(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (this.failOnUnknown) {
            autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AutoValue_RecordingStats.AnonymousClass1(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (this.serializeNulls) {
            autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AutoValue_RecordingStats.AnonymousClass2(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return new MoshiResponseBodyConverter(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    @Override // retrofit2.Converter.Factory
    public final Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        AutoValue_RecordingStats autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.moshi.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type, jsonAnnotations(annotationArr), null);
        if (this.lenient) {
            autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AutoValue_RecordingStats.AnonymousClass3(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (this.failOnUnknown) {
            autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AutoValue_RecordingStats.AnonymousClass1(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (this.serializeNulls) {
            autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AutoValue_RecordingStats.AnonymousClass2(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        return new MoshiRequestBodyConverter(autoValue_RecordingStatsTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(getQualitySelector.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }
}

package defpackage;

import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
abstract class getRecordedDurationNanos<C extends Collection<T>, T> extends AutoValue_RecordingStats<C> {
    public static final AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1() { // from class: getRecordedDurationNanos.4
        @Override // AutoValue_RecordingStats.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final AutoValue_RecordingStats<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Type type, Set<? extends Annotation> set, CapabilitiesByQuality capabilitiesByQuality) {
            Class<?> clsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsTuitionPaymentFragmentspecialinlinedviewModeldefault2 != List.class && clsTuitionPaymentFragmentspecialinlinedviewModeldefault2 != Collection.class) {
                if (clsTuitionPaymentFragmentspecialinlinedviewModeldefault2 == Set.class) {
                    return new getEncoderProfiles(getRecordedDurationNanos.TuitionPaymentFragmentspecialinlinedviewModeldefault3(type, capabilitiesByQuality));
                }
                return null;
            }
            return new getEncoderProfiles(getRecordedDurationNanos.TuitionPaymentFragmentspecialinlinedviewModeldefault2(type, capabilitiesByQuality));
        }
    };
    private final AutoValue_RecordingStats<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    abstract C TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    /* synthetic */ getRecordedDurationNanos(AutoValue_RecordingStats autoValue_RecordingStats, byte b) {
        this(autoValue_RecordingStats);
    }

    private getRecordedDurationNanos(AutoValue_RecordingStats<T> autoValue_RecordingStats) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_RecordingStats;
    }

    static <T> AutoValue_RecordingStats<Collection<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Type type, CapabilitiesByQuality capabilitiesByQuality) {
        return new getRecordedDurationNanos<Collection<T>, T>(capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault1(type, (Class<?>) Collection.class), checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null)) { // from class: getRecordedDurationNanos.3
            {
                byte b = 0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.getRecordedDurationNanos, defpackage.AutoValue_RecordingStats
            public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Object obj) throws IOException {
                super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, (Collection) obj);
            }

            @Override // defpackage.getRecordedDurationNanos, defpackage.AutoValue_RecordingStats
            public final /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
                return super.b(jsonReader);
            }

            @Override // defpackage.getRecordedDurationNanos
            final Collection<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return new ArrayList();
            }
        };
    }

    static <T> AutoValue_RecordingStats<Set<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Type type, CapabilitiesByQuality capabilitiesByQuality) {
        return new getRecordedDurationNanos<Set<T>, T>(capabilitiesByQuality.TuitionPaymentFragmentspecialinlinedviewModeldefault2(toValidatedProfiles.TuitionPaymentFragmentspecialinlinedviewModeldefault1(type, (Class<?>) Collection.class), checkQualityConstantsOrThrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null)) { // from class: getRecordedDurationNanos.5
            {
                byte b = 0;
            }

            @Override // defpackage.getRecordedDurationNanos, defpackage.AutoValue_RecordingStats
            public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, Object obj) throws IOException {
                super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, (Set) obj);
            }

            @Override // defpackage.getRecordedDurationNanos, defpackage.AutoValue_RecordingStats
            public final /* synthetic */ Object b(JsonReader jsonReader) throws IOException {
                return super.b(jsonReader);
            }

            @Override // defpackage.getRecordedDurationNanos
            final /* synthetic */ Collection TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
                return new LinkedHashSet();
            }
        };
    }

    @Override // defpackage.AutoValue_RecordingStats
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final C b(JsonReader jsonReader) throws IOException {
        C c = (C) TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        while (jsonReader.a()) {
            c.add(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(jsonReader));
        }
        jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return c;
    }

    @Override // defpackage.AutoValue_RecordingStats
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, C c) throws IOException {
        setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, (T) it.next());
        }
        setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(".collection()");
        return sb.toString();
    }
}

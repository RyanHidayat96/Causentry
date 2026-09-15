package defpackage;

import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AutoValue_RecordingStats<T> {

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        AutoValue_RecordingStats<?> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Type type, Set<? extends Annotation> set, CapabilitiesByQuality capabilitiesByQuality);
    }

    public abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, T t) throws IOException;

    public abstract T b(JsonReader jsonReader) throws IOException;

    /* JADX INFO: renamed from: AutoValue_RecordingStats$2, reason: invalid class name */
    public class AnonymousClass2 extends AutoValue_RecordingStats<T> {
        private /* synthetic */ AutoValue_RecordingStats TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public AnonymousClass2(AutoValue_RecordingStats autoValue_RecordingStats) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_RecordingStats;
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final T b(JsonReader jsonReader) throws IOException {
            return (T) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(jsonReader);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append(".serializeNulls()");
            return sb.toString();
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, T t) throws IOException {
            boolean z = setqualityselector.asBinder;
            setqualityselector.asBinder = true;
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, t);
            } finally {
                setqualityselector.asBinder = z;
            }
        }
    }

    /* JADX INFO: renamed from: AutoValue_RecordingStats$3, reason: invalid class name */
    public class AnonymousClass3 extends AutoValue_RecordingStats<T> {
        private /* synthetic */ AutoValue_RecordingStats b;

        public AnonymousClass3(AutoValue_RecordingStats autoValue_RecordingStats) {
            this.b = autoValue_RecordingStats;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append(".lenient()");
            return sb.toString();
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final T b(JsonReader jsonReader) throws IOException {
            boolean z = jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            try {
                return (T) this.b.b(jsonReader);
            } finally {
                jsonReader.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
            }
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, T t) throws IOException {
            boolean z = setqualityselector.TuitionPaymentFragmentbindingInflater1;
            setqualityselector.TuitionPaymentFragmentbindingInflater1 = true;
            try {
                this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, t);
            } finally {
                setqualityselector.TuitionPaymentFragmentbindingInflater1 = z;
            }
        }
    }

    /* JADX INFO: renamed from: AutoValue_RecordingStats$1, reason: invalid class name */
    public class AnonymousClass1 extends AutoValue_RecordingStats<T> {
        private /* synthetic */ AutoValue_RecordingStats TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public AnonymousClass1(AutoValue_RecordingStats autoValue_RecordingStats) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_RecordingStats;
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, T t) throws IOException {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, t);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(".failOnUnknown()");
            return sb.toString();
        }

        @Override // defpackage.AutoValue_RecordingStats
        public final T b(JsonReader jsonReader) throws IOException {
            boolean z = jsonReader.b;
            jsonReader.b = true;
            try {
                return (T) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(jsonReader);
            } finally {
                jsonReader.b = z;
            }
        }
    }
}

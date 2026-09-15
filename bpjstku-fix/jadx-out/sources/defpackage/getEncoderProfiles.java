package defpackage;

import com.squareup.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getEncoderProfiles<T> extends AutoValue_RecordingStats<T> {
    private final AutoValue_RecordingStats<T> TuitionPaymentFragmentbindingInflater1;

    public getEncoderProfiles(AutoValue_RecordingStats<T> autoValue_RecordingStats) {
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_RecordingStats;
    }

    @Override // defpackage.AutoValue_RecordingStats
    public final T b(JsonReader jsonReader) throws IOException {
        if (jsonReader.cancelAll() == JsonReader.Token.NULL) {
            return (T) jsonReader.INotificationSideChannel();
        }
        return this.TuitionPaymentFragmentbindingInflater1.b(jsonReader);
    }

    @Override // defpackage.AutoValue_RecordingStats
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setQualitySelector setqualityselector, T t) throws IOException {
        if (t == null) {
            setqualityselector.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        } else {
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setqualityselector, t);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(".nullSafe()");
        return sb.toString();
    }
}

package retrofit2.converter.moshi;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import defpackage.AutoValue_RecordingStats;
import defpackage.AutoValue_VideoSpec1;
import defpackage.RotationProvider1;
import java.io.IOException;
import okhttp3.ResponseBody;
import okio.ByteString;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes4.dex */
final class MoshiResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final ByteString UTF8_BOM = ByteString.TuitionPaymentFragmentbindingInflater1("EFBBBF");
    private final AutoValue_RecordingStats<T> adapter;

    MoshiResponseBodyConverter(AutoValue_RecordingStats<T> autoValue_RecordingStats) {
        this.adapter = autoValue_RecordingStats;
    }

    @Override // retrofit2.Converter
    public final T convert(ResponseBody responseBody) throws IOException {
        RotationProvider1 source = responseBody.getSource();
        try {
            ByteString byteString = UTF8_BOM;
            if (source.TuitionPaymentFragmentspecialinlinedviewModeldefault2(0L, byteString)) {
                source.g(byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            }
            AutoValue_VideoSpec1 autoValue_VideoSpec1 = new AutoValue_VideoSpec1(source);
            T tB = this.adapter.b(autoValue_VideoSpec1);
            if (autoValue_VideoSpec1.cancelAll() != JsonReader.Token.END_DOCUMENT) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return tB;
        } catch (Throwable th) {
            responseBody.close();
            throw th;
        }
    }
}

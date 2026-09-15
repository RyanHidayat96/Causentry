package retrofit2.converter.gson;

import RotationProviderListenerWrapper.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import defpackage.RotationProviderListenerWrapper;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.apache.commons.codec.binary.Hex;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes4.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    GsonRequestBodyConverter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    @Override // retrofit2.Converter
    public final RequestBody convert(T t) throws IOException {
        RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
        JsonWriter jsonWriterNewJsonWriter = this.gson.newJsonWriter(new OutputStreamWriter(rotationProviderListenerWrapper.new b(), UTF_8));
        this.adapter.write(jsonWriterNewJsonWriter, t);
        jsonWriterNewJsonWriter.close();
        return RequestBody.create(MEDIA_TYPE, rotationProviderListenerWrapper.TuitionPaymentFragmentbindingInflater1(rotationProviderListenerWrapper.size));
    }
}

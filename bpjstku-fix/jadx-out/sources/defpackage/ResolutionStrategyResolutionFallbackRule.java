package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.snap.Shopeepay;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ResolutionStrategyResolutionFallbackRule extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentbindingInflater1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Gson b;

    public ResolutionStrategyResolutionFallbackRule(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.b = gson;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Shopeepay shopeepay = (Shopeepay) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (shopeepay != shopeepay.callbackUrl) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 110);
            jsonWriter.value(shopeepay.callbackUrl);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        Shopeepay shopeepay = new Shopeepay();
        StateObservable stateObservable = this.TuitionPaymentFragmentbindingInflater1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 74) {
                jsonReader.skipValue();
            } else if (z) {
                shopeepay.callbackUrl = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                shopeepay.callbackUrl = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return shopeepay;
    }
}

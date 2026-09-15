package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.snap.UobEzpay;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ResolutionsMerger extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentbindingInflater1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public ResolutionsMerger(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservable;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        UobEzpay uobEzpay = (UobEzpay) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentbindingInflater1;
        jsonWriter.beginObject();
        if (uobEzpay != uobEzpay.callbackUrl) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 110);
            jsonWriter.value(uobEzpay.callbackUrl);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        UobEzpay uobEzpay = new UobEzpay();
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 74) {
                jsonReader.skipValue();
            } else if (z) {
                uobEzpay.callbackUrl = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                uobEzpay.callbackUrl = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return uobEzpay;
    }
}

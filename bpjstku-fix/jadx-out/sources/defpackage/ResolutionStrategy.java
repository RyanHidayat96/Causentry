package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.snap.Gopay;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ResolutionStrategy extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservable b;

    public ResolutionStrategy(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gson;
        this.b = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Gopay gopay = (Gopay) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonWriter.beginObject();
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 19);
        jsonWriter.value(gopay.enableCallback);
        if (gopay != gopay.merchantGopayDeeplink) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 110);
            jsonWriter.value(gopay.merchantGopayDeeplink);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        Gopay gopay = new Gopay();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StateObservable stateObservable = this.b;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 73) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 74) {
                    jsonReader.skipValue();
                } else if (z) {
                    gopay.merchantGopayDeeplink = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    gopay.merchantGopayDeeplink = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                gopay.enableCallback = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return gopay;
    }
}

package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.PermataBankTransferRequestModel;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class loadLocations extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Gson b;

    public loadLocations(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.b = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        PermataBankTransferRequestModel permataBankTransferRequestModel = (PermataBankTransferRequestModel) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonWriter.beginObject();
        if (permataBankTransferRequestModel != permataBankTransferRequestModel.recipientName) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 115);
            jsonWriter.value(permataBankTransferRequestModel.recipientName);
        }
        if (permataBankTransferRequestModel != permataBankTransferRequestModel.vaNumber) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 38);
            jsonWriter.value(permataBankTransferRequestModel.vaNumber);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        PermataBankTransferRequestModel permataBankTransferRequestModel = new PermataBankTransferRequestModel();
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 197) {
                permataBankTransferRequestModel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else if (z) {
                permataBankTransferRequestModel.recipientName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                permataBankTransferRequestModel.recipientName = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return permataBankTransferRequestModel;
    }
}

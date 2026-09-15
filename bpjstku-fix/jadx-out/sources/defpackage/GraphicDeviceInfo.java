package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.TransactionDetails;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class GraphicDeviceInfo extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Gson b;

    public GraphicDeviceInfo(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.b = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        TransactionDetails transactionDetails = (TransactionDetails) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (transactionDetails != transactionDetails.grossAmount) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 225);
            jsonWriter.value(transactionDetails.grossAmount);
        }
        if (transactionDetails != transactionDetails.orderId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 236);
            jsonWriter.value(transactionDetails.orderId);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        TransactionDetails transactionDetails = new TransactionDetails();
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 13) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 195) {
                    jsonReader.skipValue();
                } else if (z) {
                    transactionDetails.orderId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    transactionDetails.orderId = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                transactionDetails.grossAmount = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                transactionDetails.grossAmount = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return transactionDetails;
    }
}

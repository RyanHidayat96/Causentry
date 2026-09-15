package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.SnapTransactionDetails;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class updateTextureMatrix extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentbindingInflater1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public updateTextureMatrix(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        SnapTransactionDetails snapTransactionDetails = (SnapTransactionDetails) obj;
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentbindingInflater1;
        jsonWriter.beginObject();
        if (snapTransactionDetails != snapTransactionDetails.currency) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 142);
            jsonWriter.value(snapTransactionDetails.currency);
        }
        if (snapTransactionDetails != snapTransactionDetails.grossAmount) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 225);
            Double d = snapTransactionDetails.grossAmount;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, Double.class, d).write(jsonWriter, d);
        }
        if (snapTransactionDetails != snapTransactionDetails.orderId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 236);
            jsonWriter.value(snapTransactionDetails.orderId);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        SnapTransactionDetails snapTransactionDetails = new SnapTransactionDetails();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 13) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 195) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 225) {
                        jsonReader.skipValue();
                    } else if (z) {
                        snapTransactionDetails.currency = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        snapTransactionDetails.currency = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    snapTransactionDetails.orderId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    snapTransactionDetails.orderId = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                snapTransactionDetails.grossAmount = (Double) gson.getAdapter(Double.class).read(jsonReader);
            } else {
                snapTransactionDetails.grossAmount = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return snapTransactionDetails;
    }
}

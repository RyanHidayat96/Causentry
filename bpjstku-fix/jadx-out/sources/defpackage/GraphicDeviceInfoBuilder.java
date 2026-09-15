package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.TransactionModel;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class GraphicDeviceInfoBuilder extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentbindingInflater1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Gson b;

    public GraphicDeviceInfoBuilder(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.b = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((TransactionModel) obj).b(this.b, jsonWriter, this.TuitionPaymentFragmentbindingInflater1);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        TransactionModel transactionModel = new TransactionModel();
        transactionModel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, jsonReader, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return transactionModel;
    }
}

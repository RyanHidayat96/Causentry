package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.TransactionResponse;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ResolutionSelector extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Gson b;

    public ResolutionSelector(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.b = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((TransactionResponse) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, jsonWriter, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        TransactionResponse transactionResponse = new TransactionResponse();
        transactionResponse.b(this.b, jsonReader, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return transactionResponse;
    }
}

package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.snap.BankTransferRequestModel;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class fromResolutionSelector extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentbindingInflater1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservable b;

    public fromResolutionSelector(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gson;
        this.b = stateObservable;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        BankTransferRequestModel bankTransferRequestModel = (BankTransferRequestModel) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentbindingInflater1;
        jsonWriter.beginObject();
        if (bankTransferRequestModel != bankTransferRequestModel.vaNumber) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 38);
            jsonWriter.value(bankTransferRequestModel.vaNumber);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        BankTransferRequestModel bankTransferRequestModel = new BankTransferRequestModel();
        StateObservable stateObservable = this.b;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            bankTransferRequestModel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader));
        }
        jsonReader.endObject();
        return bankTransferRequestModel;
    }
}

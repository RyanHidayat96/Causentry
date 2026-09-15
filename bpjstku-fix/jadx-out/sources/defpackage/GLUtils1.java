package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.BcaBankTransferRequestModel;
import com.midtrans.sdk.corekit.models.FreeText;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class GLUtils1 extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentbindingInflater1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Gson b;

    public GLUtils1(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.b = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservable;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        BcaBankTransferRequestModel bcaBankTransferRequestModel = (BcaBankTransferRequestModel) obj;
        Gson gson = this.b;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentbindingInflater1;
        jsonWriter.beginObject();
        if (bcaBankTransferRequestModel != bcaBankTransferRequestModel.freeText) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 159);
            FreeText freeText = bcaBankTransferRequestModel.freeText;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, FreeText.class, freeText).write(jsonWriter, freeText);
        }
        if (bcaBankTransferRequestModel != bcaBankTransferRequestModel.subCompanyCode) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 53);
            jsonWriter.value(bcaBankTransferRequestModel.subCompanyCode);
        }
        if (bcaBankTransferRequestModel != bcaBankTransferRequestModel.vaNumber) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 38);
            jsonWriter.value(bcaBankTransferRequestModel.vaNumber);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        BcaBankTransferRequestModel bcaBankTransferRequestModel = new BcaBankTransferRequestModel();
        Gson gson = this.b;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 64) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 95) {
                    bcaBankTransferRequestModel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else if (z) {
                    bcaBankTransferRequestModel.subCompanyCode = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    bcaBankTransferRequestModel.subCompanyCode = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                bcaBankTransferRequestModel.freeText = (FreeText) gson.getAdapter(FreeText.class).read(jsonReader);
            } else {
                bcaBankTransferRequestModel.freeText = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return bcaBankTransferRequestModel;
    }
}

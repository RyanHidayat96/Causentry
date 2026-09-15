package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.CardTransfer;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class GLUtilsInputFormat extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentbindingInflater1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public GLUtilsInputFormat(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = gson;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((CardTransfer) obj).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jsonWriter, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        CardTransfer cardTransfer = new CardTransfer();
        cardTransfer.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, jsonReader, this.TuitionPaymentFragmentbindingInflater1);
        return cardTransfer;
    }
}

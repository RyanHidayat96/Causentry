package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.VaNumber;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ResolutionFilter extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Gson b;

    public ResolutionFilter(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.b = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        VaNumber vaNumber = (VaNumber) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonWriter.beginObject();
        if (vaNumber != vaNumber.accountNumber) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 38);
            jsonWriter.value(vaNumber.accountNumber);
        }
        if (vaNumber != vaNumber.bank) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 8);
            jsonWriter.value(vaNumber.bank);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        VaNumber vaNumber = new VaNumber();
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 17) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 105) {
                    jsonReader.skipValue();
                } else if (z) {
                    vaNumber.accountNumber = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    vaNumber.accountNumber = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                vaNumber.bank = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                vaNumber.bank = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return vaNumber;
    }
}

package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.ExpiryModel;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class GLUtils2 extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentbindingInflater1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservable b;

    public GLUtils2(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
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
        ExpiryModel expiryModel = (ExpiryModel) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentbindingInflater1;
        jsonWriter.beginObject();
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 211);
        jsonWriter.value(Integer.valueOf(expiryModel.duration));
        if (expiryModel != expiryModel.startTime) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 166);
            jsonWriter.value(expiryModel.startTime);
        }
        if (expiryModel != expiryModel.unit) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 55);
            jsonWriter.value(expiryModel.unit);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ExpiryModel expiryModel = new ExpiryModel();
        StateObservable stateObservable = this.b;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 203) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 211) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 235) {
                        jsonReader.skipValue();
                    } else if (z) {
                        expiryModel.unit = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        expiryModel.unit = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    expiryModel.startTime = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    expiryModel.startTime = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                try {
                    expiryModel.duration = jsonReader.nextInt();
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return expiryModel;
    }
}

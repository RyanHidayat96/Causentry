package defpackage;

import com.bpjstku.data.lib.ErrorResponse;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.mlkit.common.MlKitException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class sendSessionDestroyed extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservableErrorWrapper b;

    public sendSessionDestroyed(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.b = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        ErrorResponse errorResponse = (ErrorResponse) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.b;
        jsonWriter.beginObject();
        Boolean bool = errorResponse.isSuccessful;
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR);
        jsonWriter.value(errorResponse.isSuccessful);
        String str = errorResponse.message;
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 238);
        jsonWriter.value(errorResponse.message);
        String str2 = errorResponse.statusCode;
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 207);
        jsonWriter.value(errorResponse.statusCode);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ErrorResponse errorResponse = new ErrorResponse();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 45) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 92) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 219) {
                        jsonReader.skipValue();
                    } else if (z) {
                        errorResponse.statusCode = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        errorResponse.statusCode = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    errorResponse.isSuccessful = (Boolean) gson.getAdapter(Boolean.class).read(jsonReader);
                } else {
                    errorResponse.isSuccessful = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                errorResponse.message = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                errorResponse.message = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return errorResponse;
    }
}

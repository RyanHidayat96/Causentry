package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.DescriptionModel;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class GLUtils3 extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentbindingInflater1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public GLUtils3(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gson;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        DescriptionModel descriptionModel = (DescriptionModel) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (descriptionModel != descriptionModel.description) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 126);
            jsonWriter.value(descriptionModel.description);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        DescriptionModel descriptionModel = new DescriptionModel();
        StateObservable stateObservable = this.TuitionPaymentFragmentbindingInflater1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 238) {
                jsonReader.skipValue();
            } else if (z) {
                descriptionModel.description = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                descriptionModel.description = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return descriptionModel;
    }
}

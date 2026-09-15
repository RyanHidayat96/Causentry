package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class setGlExtensions extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentbindingInflater1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public setGlExtensions(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentbindingInflater1 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservableErrorWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        createTexture createtexture = (createTexture) obj;
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (createtexture != createtexture.b) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 25);
            checkGlThreadOrThrow[] checkglthreadorthrowArr = createtexture.b;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, checkGlThreadOrThrow[].class, checkglthreadorthrowArr).write(jsonWriter, checkglthreadorthrowArr);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        createTexture createtexture = new createTexture();
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 160) {
                jsonReader.skipValue();
            } else if (z) {
                createtexture.b = (checkGlThreadOrThrow[]) gson.getAdapter(checkGlThreadOrThrow[].class).read(jsonReader);
            } else {
                createtexture.b = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return createtexture;
    }
}

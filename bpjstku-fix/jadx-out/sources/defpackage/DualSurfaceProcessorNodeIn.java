package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class DualSurfaceProcessorNodeIn extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentbindingInflater1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public DualSurfaceProcessorNodeIn(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gson;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        GLUtils gLUtils = (GLUtils) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonWriter.beginObject();
        if (gLUtils != gLUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 82);
            jsonWriter.value(gLUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        GLUtils gLUtils = new GLUtils();
        StateObservable stateObservable = this.TuitionPaymentFragmentbindingInflater1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 191) {
                jsonReader.skipValue();
            } else if (z) {
                gLUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                gLUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return gLUtils;
    }
}

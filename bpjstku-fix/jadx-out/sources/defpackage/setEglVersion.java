package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class setEglVersion extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Gson b;

    public setEglVersion(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.b = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        checkLocationOrThrow checklocationorthrow = (checkLocationOrThrow) obj;
        Gson gson = this.b;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (checklocationorthrow != checklocationorthrow.TuitionPaymentFragmentbindingInflater1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 111);
            jsonWriter.value(checklocationorthrow.TuitionPaymentFragmentbindingInflater1);
        }
        if (checklocationorthrow != checklocationorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 131);
            createPrograms createprograms = checklocationorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, createPrograms.class, createprograms).write(jsonWriter, createprograms);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        checkLocationOrThrow checklocationorthrow = new checkLocationOrThrow();
        Gson gson = this.b;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 9) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 176) {
                    jsonReader.skipValue();
                } else if (z) {
                    checklocationorthrow.TuitionPaymentFragmentbindingInflater1 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    checklocationorthrow.TuitionPaymentFragmentbindingInflater1 = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                checklocationorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (createPrograms) gson.getAdapter(createPrograms.class).read(jsonReader);
            } else {
                checklocationorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return checklocationorthrow;
    }
}

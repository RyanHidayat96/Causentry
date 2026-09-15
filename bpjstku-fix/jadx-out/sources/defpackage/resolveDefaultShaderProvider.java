package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.FreeTextLanguage;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class resolveDefaultShaderProvider extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservableErrorWrapper b;

    public resolveDefaultShaderProvider(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.b = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        FreeTextLanguage freeTextLanguage = (FreeTextLanguage) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.b;
        jsonWriter.beginObject();
        if (freeTextLanguage != freeTextLanguage.en) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 179);
            jsonWriter.value(freeTextLanguage.en);
        }
        if (freeTextLanguage != freeTextLanguage.f842id) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 84);
            jsonWriter.value(freeTextLanguage.f842id);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        FreeTextLanguage freeTextLanguage = new FreeTextLanguage();
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 91) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 144) {
                    jsonReader.skipValue();
                } else if (z) {
                    freeTextLanguage.en = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    freeTextLanguage.en = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                freeTextLanguage.f842id = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                freeTextLanguage.f842id = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return freeTextLanguage;
    }
}

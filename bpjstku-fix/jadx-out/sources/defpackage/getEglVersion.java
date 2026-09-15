package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getEglVersion extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentbindingInflater1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getEglVersion(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentbindingInflater1 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        shouldRespectInputCropRect shouldrespectinputcroprect = (shouldRespectInputCropRect) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonWriter.beginObject();
        if (shouldrespectinputcroprect != shouldrespectinputcroprect.TuitionPaymentFragmentbindingInflater1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 222);
            jsonWriter.value(shouldrespectinputcroprect.TuitionPaymentFragmentbindingInflater1);
        }
        if (shouldrespectinputcroprect != shouldrespectinputcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 111);
            jsonWriter.value(shouldrespectinputcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (shouldrespectinputcroprect != shouldrespectinputcroprect.b) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 147);
            jsonWriter.value(shouldrespectinputcroprect.b);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        shouldRespectInputCropRect shouldrespectinputcroprect = new shouldRespectInputCropRect();
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 37) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 176) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 234) {
                        jsonReader.skipValue();
                    } else if (z) {
                        shouldrespectinputcroprect.b = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        shouldrespectinputcroprect.b = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    shouldrespectinputcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    shouldrespectinputcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                shouldrespectinputcroprect.TuitionPaymentFragmentbindingInflater1 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                shouldrespectinputcroprect.TuitionPaymentFragmentbindingInflater1 = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return shouldrespectinputcroprect;
    }
}

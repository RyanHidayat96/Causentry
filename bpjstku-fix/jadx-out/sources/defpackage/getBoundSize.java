package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.snap.SavedToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getBoundSize extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentbindingInflater1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Gson b;

    public getBoundSize(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.b = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservable;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        SavedToken savedToken = (SavedToken) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentbindingInflater1;
        jsonWriter.beginObject();
        if (savedToken != savedToken.expiresAt) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 3);
            jsonWriter.value(savedToken.expiresAt);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 219);
        jsonWriter.value(savedToken.fromHostApp);
        if (savedToken != savedToken.maskedCard) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 98);
            jsonWriter.value(savedToken.maskedCard);
        }
        if (savedToken != savedToken.token) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 17);
            jsonWriter.value(savedToken.token);
        }
        if (savedToken != savedToken.tokenType) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 72);
            jsonWriter.value(savedToken.tokenType);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        SavedToken savedToken = new SavedToken();
        Gson gson = this.b;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 28) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 50) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 62) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 146) {
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 198) {
                                jsonReader.skipValue();
                            } else if (z) {
                                savedToken.maskedCard = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                savedToken.maskedCard = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            savedToken.fromHostApp = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                        } else {
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        savedToken.token = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        savedToken.token = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    savedToken.tokenType = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    savedToken.tokenType = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                savedToken.expiresAt = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                savedToken.expiresAt = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return savedToken;
    }
}

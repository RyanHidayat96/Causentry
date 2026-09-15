package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getEglSurface extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservableErrorWrapper b;

    public getEglSurface(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservable;
        this.b = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        createPBufferSurface createpbuffersurface = (createPBufferSurface) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.b;
        jsonWriter.beginObject();
        if (createpbuffersurface != createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 176);
            jsonWriter.value(createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (createpbuffersurface != createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 132);
            jsonWriter.value(createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        if (createpbuffersurface != createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 108);
            jsonWriter.value(createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (createpbuffersurface != createpbuffersurface.b) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 82);
            jsonWriter.value(createpbuffersurface.b);
        }
        if (createpbuffersurface != createpbuffersurface.TuitionPaymentFragmentbindingInflater1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 0);
            jsonWriter.value(createpbuffersurface.TuitionPaymentFragmentbindingInflater1);
        }
        if (createpbuffersurface != createpbuffersurface.d) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 27);
            jsonWriter.value(createpbuffersurface.d);
        }
        if (createpbuffersurface != createpbuffersurface.g) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 116);
            jsonWriter.value(createpbuffersurface.g);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        createPBufferSurface createpbuffersurface = new createPBufferSurface();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 14) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 61) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 86) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 118) {
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 163) {
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 170) {
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 191) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        createpbuffersurface.b = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        createpbuffersurface.b = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    createpbuffersurface.d = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    createpbuffersurface.d = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                            } else {
                                createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            createpbuffersurface.TuitionPaymentFragmentbindingInflater1 = (Boolean) gson.getAdapter(Boolean.class).read(jsonReader);
                        } else {
                            createpbuffersurface.TuitionPaymentFragmentbindingInflater1 = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        createpbuffersurface.g = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        createpbuffersurface.g = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                createpbuffersurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return createpbuffersurface;
    }
}

package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_OutConfig extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentbindingInflater1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public AutoValue_OutConfig(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservable;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        checkGlThreadOrThrow checkglthreadorthrow = (checkGlThreadOrThrow) obj;
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentbindingInflater1;
        jsonWriter.beginObject();
        if (checkglthreadorthrow != checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 240);
            jsonWriter.value(checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (checkglthreadorthrow != checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 119);
            jsonWriter.value(checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        if (checkglthreadorthrow != checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 57);
            jsonWriter.value(checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (checkglthreadorthrow != checkglthreadorthrow.b) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 62);
            jsonWriter.value(checkglthreadorthrow.b);
        }
        if (checkglthreadorthrow != checkglthreadorthrow.TuitionPaymentFragmentbindingInflater1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 191);
            jsonWriter.value(checkglthreadorthrow.TuitionPaymentFragmentbindingInflater1);
        }
        if (checkglthreadorthrow != checkglthreadorthrow.asInterface) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 178);
            jsonWriter.value(checkglthreadorthrow.asInterface);
        }
        if (checkglthreadorthrow != checkglthreadorthrow.d) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 51);
            jsonWriter.value(checkglthreadorthrow.d);
        }
        if (checkglthreadorthrow != checkglthreadorthrow.f353a) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 35);
            createPBufferSurface createpbuffersurface = checkglthreadorthrow.f353a;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, createPBufferSurface.class, createpbuffersurface).write(jsonWriter, createpbuffersurface);
        }
        if (checkglthreadorthrow != checkglthreadorthrow.g) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 147);
            jsonWriter.value(checkglthreadorthrow.g);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        checkGlThreadOrThrow checkglthreadorthrow = new checkGlThreadOrThrow();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 32) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 35) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 56) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 65) {
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 88) {
                                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 128) {
                                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 151) {
                                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 156) {
                                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 234) {
                                                jsonReader.skipValue();
                                            } else if (z) {
                                                checkglthreadorthrow.g = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                            } else {
                                                checkglthreadorthrow.g = null;
                                                jsonReader.nextNull();
                                            }
                                        } else if (z) {
                                            checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                        } else {
                                            checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                                            jsonReader.nextNull();
                                        }
                                    } else if (z) {
                                        checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                    } else {
                                        checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    checkglthreadorthrow.b = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                                } else {
                                    checkglthreadorthrow.b = null;
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                checkglthreadorthrow.f353a = (createPBufferSurface) gson.getAdapter(createPBufferSurface.class).read(jsonReader);
                            } else {
                                checkglthreadorthrow.f353a = null;
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            checkglthreadorthrow.TuitionPaymentFragmentbindingInflater1 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            checkglthreadorthrow.TuitionPaymentFragmentbindingInflater1 = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        checkglthreadorthrow.asInterface = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        checkglthreadorthrow.asInterface = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    checkglthreadorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                checkglthreadorthrow.d = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                checkglthreadorthrow.d = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return checkglthreadorthrow;
    }
}

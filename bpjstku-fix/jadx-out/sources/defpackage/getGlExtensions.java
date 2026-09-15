package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getGlExtensions extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentbindingInflater1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Gson b;

    public getGlExtensions(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.b = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservableErrorWrapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        checkEglErrorOrLog checkeglerrororlog = (checkEglErrorOrLog) obj;
        Gson gson = this.b;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentbindingInflater1;
        jsonWriter.beginObject();
        if (checkeglerrororlog != checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 144);
            jsonWriter.value(checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        if (checkeglerrororlog != checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 103);
            checkEglErrorOrLog checkeglerrororlog2 = checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, checkEglErrorOrLog.class, checkeglerrororlog2).write(jsonWriter, checkeglerrororlog2);
        }
        if (checkeglerrororlog != checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 238);
            jsonWriter.value(checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (checkeglerrororlog != checkeglerrororlog.TuitionPaymentFragmentbindingInflater1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 23);
            checkInitializedOrThrow[] checkinitializedorthrowArr = checkeglerrororlog.TuitionPaymentFragmentbindingInflater1;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, checkInitializedOrThrow[].class, checkinitializedorthrowArr).write(jsonWriter, checkinitializedorthrowArr);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        checkEglErrorOrLog checkeglerrororlog = new checkEglErrorOrLog();
        Gson gson = this.b;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 21) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 45) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 70) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 97) {
                            jsonReader.skipValue();
                        } else if (z) {
                            checkeglerrororlog.TuitionPaymentFragmentbindingInflater1 = (checkInitializedOrThrow[]) gson.getAdapter(checkInitializedOrThrow[].class).read(jsonReader);
                        } else {
                            checkeglerrororlog.TuitionPaymentFragmentbindingInflater1 = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (checkEglErrorOrLog) gson.getAdapter(checkEglErrorOrLog.class).read(jsonReader);
            } else {
                checkeglerrororlog.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return checkeglerrororlog;
    }
}

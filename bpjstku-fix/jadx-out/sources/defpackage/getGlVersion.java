package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class getGlVersion extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getGlVersion(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        chooseSurfaceAttrib choosesurfaceattrib = (chooseSurfaceAttrib) obj;
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (choosesurfaceattrib != choosesurfaceattrib.TuitionPaymentFragmentbindingInflater1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 37);
            checkGlErrorOrThrow checkglerrororthrow = choosesurfaceattrib.TuitionPaymentFragmentbindingInflater1;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, checkGlErrorOrThrow.class, checkglerrororthrow).write(jsonWriter, checkglerrororthrow);
        }
        if (choosesurfaceattrib != choosesurfaceattrib.b) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, DerHeader.TAG_CLASS_PRIVATE);
            jsonWriter.value(choosesurfaceattrib.b);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        chooseSurfaceAttrib choosesurfaceattrib = new chooseSurfaceAttrib();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 157) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 189) {
                    jsonReader.skipValue();
                } else if (z) {
                    choosesurfaceattrib.TuitionPaymentFragmentbindingInflater1 = (checkGlErrorOrThrow) gson.getAdapter(checkGlErrorOrThrow.class).read(jsonReader);
                } else {
                    choosesurfaceattrib.TuitionPaymentFragmentbindingInflater1 = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                choosesurfaceattrib.b = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                choosesurfaceattrib.b = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return choosesurfaceattrib;
    }
}

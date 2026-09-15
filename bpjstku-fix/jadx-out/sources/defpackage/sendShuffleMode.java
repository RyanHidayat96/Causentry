package defpackage;

import com.bpjstku.data.config.model.RegisterParticipantConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class sendShuffleMode extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentbindingInflater1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservableErrorWrapper b;

    public sendShuffleMode(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentbindingInflater1 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.b = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        RegisterParticipantConfig registerParticipantConfig = (RegisterParticipantConfig) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.b;
        jsonWriter.beginObject();
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 29);
        jsonWriter.value(registerParticipantConfig.hideBpu);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 196);
        jsonWriter.value(registerParticipantConfig.hidePmi);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 239);
        jsonWriter.value(registerParticipantConfig.hidePu);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        RegisterParticipantConfig registerParticipantConfig = new RegisterParticipantConfig();
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 39) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 99) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 155) {
                        jsonReader.skipValue();
                    } else if (z) {
                        registerParticipantConfig.hidePmi = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                    } else {
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    registerParticipantConfig.hideBpu = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                } else {
                    jsonReader.nextNull();
                }
            } else if (z) {
                registerParticipantConfig.hidePu = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return registerParticipantConfig;
    }
}

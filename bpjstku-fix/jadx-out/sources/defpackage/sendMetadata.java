package defpackage;

import com.bpjstku.data.config.model.AntreanMenuConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class sendMetadata extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public sendMetadata(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        AntreanMenuConfig antreanMenuConfig = (AntreanMenuConfig) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonWriter.beginObject();
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 54);
        jsonWriter.value(antreanMenuConfig.hideMenu);
        String str = antreanMenuConfig.link;
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 16);
        jsonWriter.value(antreanMenuConfig.link);
        String str2 = antreanMenuConfig.linkAntreanInformasi;
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 123);
        jsonWriter.value(antreanMenuConfig.linkAntreanInformasi);
        String str3 = antreanMenuConfig.linkAntreanKlaim;
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 208);
        jsonWriter.value(antreanMenuConfig.linkAntreanKlaim);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 221);
        jsonWriter.value(antreanMenuConfig.status);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        AntreanMenuConfig antreanMenuConfig = new AntreanMenuConfig();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 44) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 135) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 162) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 194) {
                            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 241) {
                                jsonReader.skipValue();
                            } else if (z) {
                                antreanMenuConfig.status = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                            } else {
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            antreanMenuConfig.linkAntreanKlaim = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            antreanMenuConfig.linkAntreanKlaim = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        antreanMenuConfig.linkAntreanInformasi = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        antreanMenuConfig.linkAntreanInformasi = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    antreanMenuConfig.link = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    antreanMenuConfig.link = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                antreanMenuConfig.hideMenu = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return antreanMenuConfig;
    }
}

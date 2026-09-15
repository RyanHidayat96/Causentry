package defpackage;

import com.bpjstku.data.bsu.model.BsuConfig;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class sendRepeatMode extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public sendRepeatMode(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        BsuConfig bsuConfig = (BsuConfig) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonWriter.beginObject();
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 106);
        jsonWriter.value(bsuConfig.appBsuLogin);
        String str = bsuConfig.appBsuText;
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 233);
        jsonWriter.value(bsuConfig.appBsuText);
        String str2 = bsuConfig.appLinkPortalBsu;
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 146);
        jsonWriter.value(bsuConfig.appLinkPortalBsu);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 45);
        jsonWriter.value(bsuConfig.appWebviewBsu);
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        BsuConfig bsuConfig = new BsuConfig();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 18) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 20) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 120) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 232) {
                            jsonReader.skipValue();
                        } else if (z) {
                            bsuConfig.appLinkPortalBsu = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                        } else {
                            bsuConfig.appLinkPortalBsu = null;
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        bsuConfig.appBsuLogin = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                    } else {
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    bsuConfig.appWebviewBsu = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                } else {
                    jsonReader.nextNull();
                }
            } else if (z) {
                bsuConfig.appBsuText = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                bsuConfig.appBsuText = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return bsuConfig;
    }
}

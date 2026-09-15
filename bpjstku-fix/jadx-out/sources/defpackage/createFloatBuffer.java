package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.analytics.MixpanelEvent;
import com.midtrans.sdk.analytics.MixpanelProperties;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class createFloatBuffer extends TypeAdapter implements SessionProcessorSurface {
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservableErrorWrapper b;

    public createFloatBuffer(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = stateObservable;
        this.b = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        MixpanelEvent mixpanelEvent = (MixpanelEvent) obj;
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.b;
        jsonWriter.beginObject();
        if (mixpanelEvent != mixpanelEvent.event) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 34);
            jsonWriter.value(mixpanelEvent.event);
        }
        if (mixpanelEvent != mixpanelEvent.properties) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 101);
            MixpanelProperties mixpanelProperties = mixpanelEvent.properties;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, MixpanelProperties.class, mixpanelProperties).write(jsonWriter, mixpanelProperties);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        MixpanelEvent mixpanelEvent = new MixpanelEvent();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 229) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 240) {
                    jsonReader.skipValue();
                } else if (z) {
                    mixpanelEvent.event = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    mixpanelEvent.event = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                mixpanelEvent.properties = (MixpanelProperties) gson.getAdapter(MixpanelProperties.class).read(jsonReader);
            } else {
                mixpanelEvent.properties = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return mixpanelEvent;
    }
}

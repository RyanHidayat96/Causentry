package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class VirtualCameraCaptureResult extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservableErrorWrapper b;

    public VirtualCameraCaptureResult(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.b = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        lambdasubmitStillCaptureRequests0 lambdasubmitstillcapturerequests0 = (lambdasubmitStillCaptureRequests0) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.b;
        jsonWriter.beginObject();
        String str = lambdasubmitstillcapturerequests0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 67);
        jsonWriter.value(lambdasubmitstillcapturerequests0.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        String str2 = lambdasubmitstillcapturerequests0.b;
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 238);
        jsonWriter.value(lambdasubmitstillcapturerequests0.b);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 221);
        jsonWriter.value(Integer.valueOf(lambdasubmitstillcapturerequests0.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        lambdasubmitStillCaptureRequests0 lambdasubmitstillcapturerequests0 = new lambdasubmitStillCaptureRequests0();
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 12) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 45) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 241) {
                        jsonReader.skipValue();
                    } else if (z) {
                        try {
                            lambdasubmitstillcapturerequests0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = jsonReader.nextInt();
                        } catch (NumberFormatException e2) {
                            throw new JsonSyntaxException(e2);
                        }
                    } else {
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    lambdasubmitstillcapturerequests0.b = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    lambdasubmitstillcapturerequests0.b = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                lambdasubmitstillcapturerequests0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                lambdasubmitstillcapturerequests0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return lambdasubmitstillcapturerequests0;
    }
}

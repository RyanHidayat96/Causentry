package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_GraphicDeviceInfoBuilder extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservable b;

    public AutoValue_GraphicDeviceInfoBuilder(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gson;
        this.b = stateObservable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        checkInitializedOrThrow checkinitializedorthrow = (checkInitializedOrThrow) obj;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonWriter.beginObject();
        if (checkinitializedorthrow != checkinitializedorthrow.b) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 144);
            jsonWriter.value(checkinitializedorthrow.b);
        }
        if (checkinitializedorthrow != checkinitializedorthrow.TuitionPaymentFragmentbindingInflater1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 198);
            jsonWriter.value(checkinitializedorthrow.TuitionPaymentFragmentbindingInflater1);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 180);
        jsonWriter.value(Integer.valueOf(checkinitializedorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        if (checkinitializedorthrow != checkinitializedorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 112);
            jsonWriter.value(checkinitializedorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        checkInitializedOrThrow checkinitializedorthrow = new checkInitializedOrThrow();
        StateObservable stateObservable = this.b;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 3) {
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 70) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 180) {
                        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 215) {
                            jsonReader.skipValue();
                        } else if (z) {
                            try {
                                checkinitializedorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = jsonReader.nextInt();
                            } catch (NumberFormatException e2) {
                                throw new JsonSyntaxException(e2);
                            }
                        } else {
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        checkinitializedorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        checkinitializedorthrow.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    checkinitializedorthrow.b = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                } else {
                    checkinitializedorthrow.b = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                checkinitializedorthrow.TuitionPaymentFragmentbindingInflater1 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                checkinitializedorthrow.TuitionPaymentFragmentbindingInflater1 = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return checkinitializedorthrow;
    }
}

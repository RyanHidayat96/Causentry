package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.CardTokenRequest;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class GLUtilsProgram2D extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentbindingInflater1;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public GLUtilsProgram2D(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = gson;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable;
        this.TuitionPaymentFragmentbindingInflater1 = stateObservableErrorWrapper;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        CardTokenRequest cardTokenRequest = (CardTokenRequest) obj;
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentbindingInflater1;
        jsonWriter.beginObject();
        if (cardTokenRequest != cardTokenRequest.bank) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 8);
            jsonWriter.value(cardTokenRequest.bank);
        }
        if (cardTokenRequest != cardTokenRequest.bins) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 120);
            generateFbo generatefbo = new generateFbo();
            ArrayList<String> arrayList = cardTokenRequest.bins;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, generatefbo, arrayList).write(jsonWriter, arrayList);
        }
        if (cardTokenRequest != cardTokenRequest.cardCVV) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 168);
            jsonWriter.value(cardTokenRequest.cardCVV);
        }
        if (cardTokenRequest != cardTokenRequest.cardExpiryMonth) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 187);
            jsonWriter.value(cardTokenRequest.cardExpiryMonth);
        }
        if (cardTokenRequest != cardTokenRequest.cardExpiryYear) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 157);
            jsonWriter.value(cardTokenRequest.cardExpiryYear);
        }
        if (cardTokenRequest != cardTokenRequest.cardNumber) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 231);
            jsonWriter.value(cardTokenRequest.cardNumber);
        }
        if (cardTokenRequest != cardTokenRequest.cardType) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 125);
            jsonWriter.value(cardTokenRequest.cardType);
        }
        if (cardTokenRequest != cardTokenRequest.channel) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 1);
            jsonWriter.value(cardTokenRequest.channel);
        }
        if (cardTokenRequest != cardTokenRequest.clientKey) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 20);
            jsonWriter.value(cardTokenRequest.clientKey);
        }
        if (cardTokenRequest != cardTokenRequest.currency) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 142);
            jsonWriter.value(cardTokenRequest.currency);
        }
        if (cardTokenRequest != cardTokenRequest.grossAmount) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 30);
            Double d = cardTokenRequest.grossAmount;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, Double.class, d).write(jsonWriter, d);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 26);
        jsonWriter.value(cardTokenRequest.installment);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 172);
        jsonWriter.value(Integer.valueOf(cardTokenRequest.instalmentTerm));
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 94);
        jsonWriter.value(cardTokenRequest.isSaved);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 73);
        jsonWriter.value(cardTokenRequest.point);
        if (cardTokenRequest != cardTokenRequest.savedTokenId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 199);
            jsonWriter.value(cardTokenRequest.savedTokenId);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 224);
        jsonWriter.value(cardTokenRequest.secure);
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 237);
        jsonWriter.value(cardTokenRequest.twoClick);
        if (cardTokenRequest != cardTokenRequest.type) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 51);
            jsonWriter.value(cardTokenRequest.type);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        CardTokenRequest cardTokenRequest = new CardTokenRequest();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            switch (iTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                case 17:
                    if (!z) {
                        cardTokenRequest.bank = null;
                    } else {
                        cardTokenRequest.bank = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 24:
                    if (z) {
                        cardTokenRequest.installment = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                    }
                    break;
                case 25:
                    if (!z) {
                        cardTokenRequest.savedTokenId = null;
                    } else {
                        cardTokenRequest.savedTokenId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 29:
                    if (!z) {
                        break;
                    } else {
                        try {
                            cardTokenRequest.instalmentTerm = jsonReader.nextInt();
                        } catch (NumberFormatException e2) {
                            throw new JsonSyntaxException(e2);
                        }
                    }
                    break;
                case 32:
                    if (!z) {
                        cardTokenRequest.type = null;
                    } else {
                        cardTokenRequest.type = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 33:
                    if (!z) {
                        cardTokenRequest.clientKey = null;
                    } else {
                        cardTokenRequest.clientKey = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 47:
                    if (!z) {
                        cardTokenRequest.cardNumber = null;
                    } else {
                        cardTokenRequest.cardNumber = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 67:
                    if (z) {
                        cardTokenRequest.isSaved = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                    }
                    break;
                case 76:
                    if (!z) {
                        cardTokenRequest.cardCVV = null;
                    } else {
                        cardTokenRequest.cardCVV = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 85:
                    if (!z) {
                        cardTokenRequest.channel = null;
                    } else {
                        cardTokenRequest.channel = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 93:
                    if (z) {
                        cardTokenRequest.secure = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                    }
                    break;
                case 101:
                    if (z) {
                        cardTokenRequest.point = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                    }
                    break;
                case 121:
                    if (!z) {
                        cardTokenRequest.cardExpiryMonth = null;
                    } else {
                        cardTokenRequest.cardExpiryMonth = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 130:
                    if (!z) {
                        cardTokenRequest.cardExpiryYear = null;
                    } else {
                        cardTokenRequest.cardExpiryYear = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 131:
                    if (!z) {
                        cardTokenRequest.cardType = null;
                    } else {
                        cardTokenRequest.cardType = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 182:
                    if (z) {
                        cardTokenRequest.twoClick = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                    }
                    break;
                case 212:
                    if (!z) {
                        cardTokenRequest.bins = null;
                    } else {
                        cardTokenRequest.bins = (ArrayList) gson.getAdapter(new generateFbo()).read(jsonReader);
                    }
                    break;
                case 217:
                    if (!z) {
                        cardTokenRequest.grossAmount = null;
                    } else {
                        cardTokenRequest.grossAmount = (Double) gson.getAdapter(Double.class).read(jsonReader);
                    }
                    break;
                case 225:
                    if (!z) {
                        cardTokenRequest.currency = null;
                    } else {
                        cardTokenRequest.currency = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return cardTokenRequest;
    }
}

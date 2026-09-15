package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.snap.CreditCard;
import com.midtrans.sdk.corekit.models.snap.Installment;
import com.midtrans.sdk.corekit.models.snap.SavedToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setResolutionFilter extends TypeAdapter implements SessionProcessorSurface {
    private Gson TuitionPaymentFragmentbindingInflater1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private StateObservableErrorWrapper b;

    public setResolutionFilter(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
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
        CreditCard creditCard = (CreditCard) obj;
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.b;
        jsonWriter.beginObject();
        if (creditCard != creditCard.authentication) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 42);
            jsonWriter.value(creditCard.authentication);
        }
        if (creditCard != creditCard.bank) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 8);
            jsonWriter.value(creditCard.bank);
        }
        if (creditCard != creditCard.blacklistBins) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 149);
            getAspectRatioStrategy getaspectratiostrategy = new getAspectRatioStrategy();
            List<String> list = creditCard.blacklistBins;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, getaspectratiostrategy, list).write(jsonWriter, list);
        }
        if (creditCard != creditCard.channel) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 1);
            jsonWriter.value(creditCard.channel);
        }
        if (creditCard != creditCard.installment) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 26);
            Installment installment = creditCard.installment;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, Installment.class, installment).write(jsonWriter, installment);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 151);
        jsonWriter.value(creditCard.saveCard);
        if (creditCard != creditCard.savedTokens) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 150);
            setAspectRatioStrategy setaspectratiostrategy = new setAspectRatioStrategy();
            List<SavedToken> list2 = creditCard.savedTokens;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, setaspectratiostrategy, list2).write(jsonWriter, list2);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 224);
        jsonWriter.value(creditCard.secure);
        if (creditCard != creditCard.tokenId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 89);
            jsonWriter.value(creditCard.tokenId);
        }
        if (creditCard != creditCard.type) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 51);
            jsonWriter.value(creditCard.type);
        }
        if (creditCard != creditCard.whitelistBins) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 81);
            ResolutionSelectorBuilder resolutionSelectorBuilder = new ResolutionSelectorBuilder();
            ArrayList<String> arrayList = creditCard.whitelistBins;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, resolutionSelectorBuilder, arrayList).write(jsonWriter, arrayList);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        CreditCard creditCard = new CreditCard();
        Gson gson = this.TuitionPaymentFragmentbindingInflater1;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            switch (iTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                case 11:
                    if (!z) {
                        creditCard.tokenId = null;
                    } else {
                        creditCard.tokenId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 17:
                    if (!z) {
                        creditCard.bank = null;
                    } else {
                        creditCard.bank = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 24:
                    if (!z) {
                        creditCard.installment = null;
                    } else {
                        creditCard.installment = (Installment) gson.getAdapter(Installment.class).read(jsonReader);
                    }
                    break;
                case 32:
                    if (!z) {
                        creditCard.type = null;
                    } else {
                        creditCard.type = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 69:
                    if (!z) {
                        creditCard.blacklistBins = null;
                    } else {
                        creditCard.blacklistBins = (List) gson.getAdapter(new getAspectRatioStrategy()).read(jsonReader);
                    }
                    break;
                case 72:
                    if (z) {
                        creditCard.saveCard = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                    }
                    break;
                case 85:
                    if (!z) {
                        creditCard.channel = null;
                    } else {
                        creditCard.channel = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 93:
                    if (z) {
                        creditCard.secure = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                    }
                    break;
                case 165:
                    if (!z) {
                        creditCard.authentication = null;
                    } else {
                        creditCard.authentication = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 206:
                    if (!z) {
                        creditCard.whitelistBins = null;
                    } else {
                        creditCard.whitelistBins = (ArrayList) gson.getAdapter(new ResolutionSelectorBuilder()).read(jsonReader);
                    }
                    break;
                case 223:
                    if (!z) {
                        creditCard.savedTokens = null;
                    } else {
                        creditCard.savedTokens = (List) gson.getAdapter(new setAspectRatioStrategy()).read(jsonReader);
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return creditCard;
    }
}

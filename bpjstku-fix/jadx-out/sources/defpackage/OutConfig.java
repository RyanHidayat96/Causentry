package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.BcaBankTransferRequestModel;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.corekit.models.ExpiryModel;
import com.midtrans.sdk.corekit.models.ItemDetails;
import com.midtrans.sdk.corekit.models.SnapTransactionDetails;
import com.midtrans.sdk.corekit.models.TokenRequestModel;
import com.midtrans.sdk.corekit.models.snap.BankTransferRequestModel;
import com.midtrans.sdk.corekit.models.snap.CreditCard;
import com.midtrans.sdk.corekit.models.snap.Gopay;
import com.midtrans.sdk.corekit.models.snap.Shopeepay;
import com.midtrans.sdk.corekit.models.snap.SnapPromo;
import com.midtrans.sdk.corekit.models.snap.UobEzpay;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class OutConfig extends TypeAdapter implements SessionProcessorSurface {
    private StateObservableErrorWrapper TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private StateObservable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Gson TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public OutConfig(Gson gson, StateObservable stateObservable, StateObservableErrorWrapper stateObservableErrorWrapper) {
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
        TokenRequestModel tokenRequestModel = (TokenRequestModel) obj;
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StateObservableErrorWrapper stateObservableErrorWrapper = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        jsonWriter.beginObject();
        if (tokenRequestModel != tokenRequestModel.bcaVa) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 60);
            BcaBankTransferRequestModel bcaBankTransferRequestModel = tokenRequestModel.bcaVa;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, BcaBankTransferRequestModel.class, bcaBankTransferRequestModel).write(jsonWriter, bcaBankTransferRequestModel);
        }
        if (tokenRequestModel != tokenRequestModel.bniVa) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 9);
            BankTransferRequestModel bankTransferRequestModel = tokenRequestModel.bniVa;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, BankTransferRequestModel.class, bankTransferRequestModel).write(jsonWriter, bankTransferRequestModel);
        }
        if (tokenRequestModel != tokenRequestModel.briVa) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 206);
            BankTransferRequestModel bankTransferRequestModel2 = tokenRequestModel.briVa;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, BankTransferRequestModel.class, bankTransferRequestModel2).write(jsonWriter, bankTransferRequestModel2);
        }
        if (tokenRequestModel != tokenRequestModel.costumerDetails) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 48);
            CustomerDetails customerDetails = tokenRequestModel.costumerDetails;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, CustomerDetails.class, customerDetails).write(jsonWriter, customerDetails);
        }
        if (tokenRequestModel != tokenRequestModel.creditCard) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 135);
            CreditCard creditCard = tokenRequestModel.creditCard;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, CreditCard.class, creditCard).write(jsonWriter, creditCard);
        }
        if (tokenRequestModel != tokenRequestModel.customField1) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 174);
            jsonWriter.value(tokenRequestModel.customField1);
        }
        if (tokenRequestModel != tokenRequestModel.customField2) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 56);
            jsonWriter.value(tokenRequestModel.customField2);
        }
        if (tokenRequestModel != tokenRequestModel.customField3) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 88);
            jsonWriter.value(tokenRequestModel.customField3);
        }
        if (tokenRequestModel != tokenRequestModel.enabledPayments) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 114);
            getFallbackRule getfallbackrule = new getFallbackRule();
            List<String> list = tokenRequestModel.enabledPayments;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, getfallbackrule, list).write(jsonWriter, list);
        }
        if (tokenRequestModel != tokenRequestModel.expiry) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 15);
            ExpiryModel expiryModel = tokenRequestModel.expiry;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, ExpiryModel.class, expiryModel).write(jsonWriter, expiryModel);
        }
        if (tokenRequestModel != tokenRequestModel.gopay) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 230);
            Gopay gopay = tokenRequestModel.gopay;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, Gopay.class, gopay).write(jsonWriter, gopay);
        }
        if (tokenRequestModel != tokenRequestModel.itemDetails) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 124);
            AspectRatioStrategyAspectRatioFallbackRule aspectRatioStrategyAspectRatioFallbackRule = new AspectRatioStrategyAspectRatioFallbackRule();
            ArrayList<ItemDetails> arrayList = tokenRequestModel.itemDetails;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, aspectRatioStrategyAspectRatioFallbackRule, arrayList).write(jsonWriter, arrayList);
        }
        if (tokenRequestModel != tokenRequestModel.permataVa) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 143);
            BankTransferRequestModel bankTransferRequestModel3 = tokenRequestModel.permataVa;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, BankTransferRequestModel.class, bankTransferRequestModel3).write(jsonWriter, bankTransferRequestModel3);
        }
        if (tokenRequestModel != tokenRequestModel.promo) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 228);
            SnapPromo snapPromo = tokenRequestModel.promo;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, SnapPromo.class, snapPromo).write(jsonWriter, snapPromo);
        }
        if (tokenRequestModel != tokenRequestModel.shopeepay) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 183);
            Shopeepay shopeepay = tokenRequestModel.shopeepay;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, Shopeepay.class, shopeepay).write(jsonWriter, shopeepay);
        }
        if (tokenRequestModel != tokenRequestModel.transactionDetails) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 139);
            SnapTransactionDetails snapTransactionDetails = tokenRequestModel.transactionDetails;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, SnapTransactionDetails.class, snapTransactionDetails).write(jsonWriter, snapTransactionDetails);
        }
        if (tokenRequestModel != tokenRequestModel.uobEzpay) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 6);
            UobEzpay uobEzpay = tokenRequestModel.uobEzpay;
            getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, UobEzpay.class, uobEzpay).write(jsonWriter, uobEzpay);
        }
        if (tokenRequestModel != tokenRequestModel.userId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 80);
            jsonWriter.value(tokenRequestModel.userId);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        TokenRequestModel tokenRequestModel = new TokenRequestModel();
        Gson gson = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StateObservable stateObservable = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            switch (iTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                case 1:
                    if (!z) {
                        tokenRequestModel.transactionDetails = null;
                    } else {
                        tokenRequestModel.transactionDetails = (SnapTransactionDetails) gson.getAdapter(SnapTransactionDetails.class).read(jsonReader);
                    }
                    break;
                case 30:
                    if (!z) {
                        tokenRequestModel.briVa = null;
                    } else {
                        tokenRequestModel.briVa = (BankTransferRequestModel) gson.getAdapter(BankTransferRequestModel.class).read(jsonReader);
                    }
                    break;
                case 41:
                    if (!z) {
                        tokenRequestModel.bcaVa = null;
                    } else {
                        tokenRequestModel.bcaVa = (BcaBankTransferRequestModel) gson.getAdapter(BcaBankTransferRequestModel.class).read(jsonReader);
                    }
                    break;
                case 60:
                    if (!z) {
                        tokenRequestModel.promo = null;
                    } else {
                        tokenRequestModel.promo = (SnapPromo) gson.getAdapter(SnapPromo.class).read(jsonReader);
                    }
                    break;
                case 78:
                    if (!z) {
                        tokenRequestModel.bniVa = null;
                    } else {
                        tokenRequestModel.bniVa = (BankTransferRequestModel) gson.getAdapter(BankTransferRequestModel.class).read(jsonReader);
                    }
                    break;
                case 111:
                    if (!z) {
                        tokenRequestModel.uobEzpay = null;
                    } else {
                        tokenRequestModel.uobEzpay = (UobEzpay) gson.getAdapter(UobEzpay.class).read(jsonReader);
                    }
                    break;
                case 122:
                    if (!z) {
                        tokenRequestModel.creditCard = null;
                    } else {
                        tokenRequestModel.creditCard = (CreditCard) gson.getAdapter(CreditCard.class).read(jsonReader);
                    }
                    break;
                case 127:
                    if (!z) {
                        tokenRequestModel.itemDetails = null;
                    } else {
                        tokenRequestModel.itemDetails = (ArrayList) gson.getAdapter(new AspectRatioStrategyAspectRatioFallbackRule()).read(jsonReader);
                    }
                    break;
                case 133:
                    if (!z) {
                        tokenRequestModel.customField3 = null;
                    } else {
                        tokenRequestModel.customField3 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 134:
                    if (!z) {
                        tokenRequestModel.userId = null;
                    } else {
                        tokenRequestModel.userId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 138:
                    if (!z) {
                        tokenRequestModel.permataVa = null;
                    } else {
                        tokenRequestModel.permataVa = (BankTransferRequestModel) gson.getAdapter(BankTransferRequestModel.class).read(jsonReader);
                    }
                    break;
                case 143:
                    if (!z) {
                        tokenRequestModel.shopeepay = null;
                    } else {
                        tokenRequestModel.shopeepay = (Shopeepay) gson.getAdapter(Shopeepay.class).read(jsonReader);
                    }
                    break;
                case 168:
                    if (!z) {
                        tokenRequestModel.expiry = null;
                    } else {
                        tokenRequestModel.expiry = (ExpiryModel) gson.getAdapter(ExpiryModel.class).read(jsonReader);
                    }
                    break;
                case 186:
                    if (!z) {
                        tokenRequestModel.costumerDetails = null;
                    } else {
                        tokenRequestModel.costumerDetails = (CustomerDetails) gson.getAdapter(CustomerDetails.class).read(jsonReader);
                    }
                    break;
                case 213:
                    if (!z) {
                        tokenRequestModel.customField2 = null;
                    } else {
                        tokenRequestModel.customField2 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                case 221:
                    if (!z) {
                        tokenRequestModel.enabledPayments = null;
                    } else {
                        tokenRequestModel.enabledPayments = (List) gson.getAdapter(new getFallbackRule()).read(jsonReader);
                    }
                    break;
                case 224:
                    if (!z) {
                        tokenRequestModel.gopay = null;
                    } else {
                        tokenRequestModel.gopay = (Gopay) gson.getAdapter(Gopay.class).read(jsonReader);
                    }
                    break;
                case 231:
                    if (!z) {
                        tokenRequestModel.customField1 = null;
                    } else {
                        tokenRequestModel.customField1 = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return tokenRequestModel;
    }
}

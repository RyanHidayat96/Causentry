package com.midtrans.sdk.corekit.utilities;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.models.snap.params.CreditCardPaymentParams;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class CustomTypeAdapter extends TypeAdapter<CreditCardPaymentParams> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public CreditCardPaymentParams read(JsonReader jsonReader) throws IOException {
        CreditCardPaymentParams creditCardPaymentParams = new CreditCardPaymentParams(null, null, null);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("masked_card".equals(strNextName)) {
                creditCardPaymentParams.setMaskedCard(jsonReader.nextString());
            } else if ("card_token".equals(strNextName)) {
                creditCardPaymentParams.setCardToken(jsonReader.nextString());
            } else if (PlaceTypes.BANK.equals(strNextName)) {
                creditCardPaymentParams.setBank(jsonReader.nextString());
            } else if ("installment".equals(strNextName)) {
                creditCardPaymentParams.setInstallmentTerm(jsonReader.nextString());
            } else if ("save_card".equals(strNextName)) {
                creditCardPaymentParams.setSaveCard(jsonReader.nextBoolean());
            } else if ("point".equals(strNextName)) {
                creditCardPaymentParams.setPointRedeemed((float) jsonReader.nextDouble());
            }
        }
        jsonReader.endObject();
        return creditCardPaymentParams;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, CreditCardPaymentParams creditCardPaymentParams) throws IOException {
        jsonWriter.beginObject();
        if (creditCardPaymentParams.getMaskedCard() != null && !TextUtils.isEmpty(creditCardPaymentParams.getMaskedCard())) {
            jsonWriter.name("masked_card").value(creditCardPaymentParams.getMaskedCard());
        }
        if (creditCardPaymentParams.getBank() != null && !TextUtils.isEmpty(creditCardPaymentParams.getBank())) {
            jsonWriter.name(PlaceTypes.BANK).value(creditCardPaymentParams.getBank());
        }
        if (creditCardPaymentParams.getCardToken() != null && !TextUtils.isEmpty(creditCardPaymentParams.getCardToken())) {
            jsonWriter.name("card_token").value(creditCardPaymentParams.getCardToken());
        }
        if (creditCardPaymentParams.getInstallmentTerm() != null && !TextUtils.isEmpty(creditCardPaymentParams.getInstallmentTerm())) {
            jsonWriter.name("installment").value(creditCardPaymentParams.getInstallmentTerm());
        }
        jsonWriter.name("save_card").value(creditCardPaymentParams.isSaveCard());
        if (creditCardPaymentParams.isFromBankPoint()) {
            if (creditCardPaymentParams.getPointRedeemed() == 0.0f) {
                jsonWriter.name("point").value(0L);
            } else {
                jsonWriter.name("point").value(creditCardPaymentParams.getPointRedeemed());
            }
        }
        jsonWriter.endObject();
    }
}

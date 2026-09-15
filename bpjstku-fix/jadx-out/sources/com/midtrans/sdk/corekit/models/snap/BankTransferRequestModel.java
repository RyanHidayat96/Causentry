package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class BankTransferRequestModel implements Serializable {

    @SerializedName("va_number")
    public String vaNumber;

    public BankTransferRequestModel() {
    }

    public BankTransferRequestModel(String str) {
        setVaNumber(str);
    }

    public String getVaNumber() {
        return this.vaNumber;
    }

    public void setVaNumber(String str) {
        this.vaNumber = str;
    }

    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(JsonReader jsonReader, int i) throws IOException {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 105) {
            jsonReader.skipValue();
            return;
        }
        if (!z) {
            this.vaNumber = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.vaNumber = jsonReader.nextString();
        } else {
            this.vaNumber = Boolean.toString(jsonReader.nextBoolean());
        }
    }
}

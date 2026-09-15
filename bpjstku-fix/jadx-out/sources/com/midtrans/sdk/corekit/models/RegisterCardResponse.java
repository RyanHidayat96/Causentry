package com.midtrans.sdk.corekit.models;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.StateObservable;
import defpackage.StateObservableErrorWrapper;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class RegisterCardResponse extends TransactionResponse implements Serializable {

    @SerializedName("user_id")
    private String userId;

    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Gson gson, JsonWriter jsonWriter, StateObservableErrorWrapper stateObservableErrorWrapper) throws IOException {
        jsonWriter.beginObject();
        if (this != this.userId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 80);
            jsonWriter.value(this.userId);
        }
        TuitionPaymentFragmentbindingInflater1(gson, jsonWriter, stateObservableErrorWrapper);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Gson gson, JsonReader jsonReader, StateObservable stateObservable) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 != 134) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, jsonReader, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else if (z) {
                this.userId = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
            } else {
                this.userId = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
    }

    public RegisterCardResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public /* synthetic */ RegisterCardResponse() {
    }
}

package com.midtrans.raygun;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class MessageApiKey implements Serializable {
    public String apiKey;
    public String message;

    public MessageApiKey() {
    }

    public MessageApiKey(String str, String str2) {
        this.apiKey = str;
        this.message = str2;
    }
}

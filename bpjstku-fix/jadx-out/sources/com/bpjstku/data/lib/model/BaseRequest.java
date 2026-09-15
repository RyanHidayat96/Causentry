package com.bpjstku.data.lib.model;

import com.google.gson.annotations.SerializedName;
import defpackage.LifecycleCameraProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/data/lib/model/BaseRequest;", "LLifecycleCameraProvider;", "<init>", "()V", "", "channelId", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseRequest extends LifecycleCameraProvider {
    public static final int $stable = 0;

    @SerializedName("chId")
    private final String channelId = "ANDROID";

    public final String getChannelId() {
        return this.channelId;
    }
}

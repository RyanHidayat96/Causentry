package com.bpjstku.data.about.model.request;

import defpackage.LifecycleCameraProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/about/model/request/AboutEventRequest;", "LLifecycleCameraProvider;", "", "p0", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/bpjstku/data/about/model/request/AboutEventRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "id", "I", "getId"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AboutEventRequest extends LifecycleCameraProvider {
    public static final int $stable = 0;
    private final int id;

    public AboutEventRequest(int i) {
        this.id = i;
    }

    public /* synthetic */ AboutEventRequest(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int getId() {
        return this.id;
    }

    public AboutEventRequest() {
        this(0, 1, null);
    }

    public static /* synthetic */ AboutEventRequest copy$default(AboutEventRequest aboutEventRequest, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aboutEventRequest.id;
        }
        return aboutEventRequest.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final AboutEventRequest copy(int p0) {
        return new AboutEventRequest(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof AboutEventRequest) && this.id == ((AboutEventRequest) p0).id;
    }

    public final int hashCode() {
        return Integer.hashCode(this.id);
    }

    public final String toString() {
        int i = this.id;
        StringBuilder sb = new StringBuilder("AboutEventRequest(id=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}

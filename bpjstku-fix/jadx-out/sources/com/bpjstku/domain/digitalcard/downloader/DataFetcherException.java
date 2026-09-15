package com.bpjstku.domain.digitalcard.downloader;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/bpjstku/domain/digitalcard/downloader/DataFetcherException;", "Ljava/lang/Exception;", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "errorMessage", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DataFetcherException extends Exception {
    private final String errorMessage;

    public DataFetcherException(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorMessage = str;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof DataFetcherException) && Intrinsics.areEqual(this.errorMessage, ((DataFetcherException) p0).errorMessage);
    }

    public final int hashCode() {
        return this.errorMessage.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str = this.errorMessage;
        StringBuilder sb = new StringBuilder("DataFetcherException(errorMessage=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}

package com.sofakingforever.analytics.exceptions;

import defpackage.AutoValue_Quality_ConstantQuality;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/sofakingforever/analytics/exceptions/UnsupportedEventException;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/asBinder;", "LAutoValue_Quality_ConstantQuality;", "p0", "<init>", "(LAutoValue_Quality_ConstantQuality;)V", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0})
public final class UnsupportedEventException extends UnsupportedOperationException {
    private final String message;

    public UnsupportedEventException(AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality) {
        StringBuilder sb = new StringBuilder("couldn't fire \"");
        sb.append(autoValue_Quality_ConstantQuality.getClass().getName());
        sb.append("\" event");
        this.message = sb.toString();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}

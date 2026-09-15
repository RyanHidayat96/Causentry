package com.sofakingforever.repoverse;

import java.net.MalformedURLException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/sofakingforever/repoverse/IllegalVersionFormatException;", "Ljava/net/MalformedURLException;", "", "p0", "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0})
public final class IllegalVersionFormatException extends MalformedURLException {
    public IllegalVersionFormatException(String str) {
        StringBuilder sb = new StringBuilder("Version '");
        sb.append(str);
        sb.append("' is illegal");
        super(sb.toString());
    }
}

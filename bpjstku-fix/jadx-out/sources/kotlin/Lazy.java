package kotlin;

import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Lazy;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "isInitialized", "()Z", "getValue", "()Ljava/lang/Object;", "value"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Lazy<T> {
    T getValue();

    boolean isInitialized();
}

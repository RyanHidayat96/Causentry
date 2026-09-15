package androidx.content.core;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/datastore/core/ReadException;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/State;", "", "p0", "", "p1", "<init>", "(Ljava/lang/Throwable;I)V", "readException", "Ljava/lang/Throwable;", "getReadException", "()Ljava/lang/Throwable;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReadException<T> extends State<T> {
    private final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadException(Throwable th, int i) {
        super(i, null);
        Intrinsics.checkNotNullParameter(th, "");
        this.readException = th;
    }

    public final Throwable getReadException() {
        return this.readException;
    }
}

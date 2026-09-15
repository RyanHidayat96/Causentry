package androidx.p005navigation;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00028\u0000H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/navigation/CollectionNavType;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavType;", "", "p0", "<init>", "(Z)V", "", "", "serializeAsValues", "(Ljava/lang/Object;)Ljava/util/List;", "emptyCollection", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CollectionNavType<T> extends NavType<T> {
    public abstract T emptyCollection();

    public abstract List<String> serializeAsValues(T p0);

    public CollectionNavType(boolean z) {
        super(z);
    }
}

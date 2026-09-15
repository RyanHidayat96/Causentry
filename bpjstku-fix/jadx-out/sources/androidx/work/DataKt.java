package androidx.work;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a@\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\n\u001a\u00020\t\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0003*\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "Lkotlin/Pair;", "", "", "p0", "Landroidx/work/Data;", "workDataOf", "([Lkotlin/Pair;)Landroidx/work/Data;", ExifInterface.GPS_DIRECTION_TRUE, "", "hasKeyWithValueOfType", "(Landroidx/work/Data;Ljava/lang/String;)Z"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DataKt {
    public static final Data workDataOf(Pair<String, ? extends Object>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        Data.Builder builder = new Data.Builder();
        for (Pair<String, ? extends Object> pair : pairArr) {
            builder.put(pair.getFirst(), pair.getSecond());
        }
        return builder.build();
    }

    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(Data data, String str) {
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return data.hasKeyWithValueOfType(str, Object.class);
    }
}

package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/util/List;Ljava/lang/String;)V", "missingFields", "Ljava/util/List;", "getMissingFields", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MissingFieldException extends SerializationException {
    private final List<String> missingFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List<String> list, String str, Throwable th) {
        super(str, th);
        Intrinsics.checkNotNullParameter(list, "");
        this.missingFields = list;
    }

    public final List<String> getMissingFields() {
        return this.missingFields;
    }

    public MissingFieldException(List<String> list, String str) {
        String string;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (list.size() == 1) {
            StringBuilder sb = new StringBuilder("Field '");
            sb.append(list.get(0));
            sb.append("' is required for type with serial name '");
            sb.append(str);
            sb.append("', but it was missing");
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("Fields ");
            sb2.append(list);
            sb2.append(" are required for type with serial name '");
            sb2.append(str);
            sb2.append("', but they were missing");
            string = sb2.toString();
        }
        this(list, string, null);
    }
}

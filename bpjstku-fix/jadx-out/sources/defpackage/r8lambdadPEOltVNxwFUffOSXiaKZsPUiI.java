package defpackage;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.domain.programinfo.model.ProgramAttribute;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lr8lambdadPEOltVNxwFUffOSXiaKZsPUiI;", "Lcom/bpjstku/data/lib/model/BaseItem;", "Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;", "p0", "<init>", "(Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/domain/programinfo/model/ProgramAttribute;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class r8lambdadPEOltVNxwFUffOSXiaKZsPUiI extends BaseItem {
    public static final int $stable = 8;
    public final ProgramAttribute data;

    public r8lambdadPEOltVNxwFUffOSXiaKZsPUiI(ProgramAttribute programAttribute) {
        Intrinsics.checkNotNullParameter(programAttribute, "");
        this.data = programAttribute;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof r8lambdadPEOltVNxwFUffOSXiaKZsPUiI) && Intrinsics.areEqual(this.data, ((r8lambdadPEOltVNxwFUffOSXiaKZsPUiI) p0).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        ProgramAttribute programAttribute = this.data;
        StringBuilder sb = new StringBuilder("r8lambdadPEOltVNxwFUffOSXiaKZsPUiI(data=");
        sb.append(programAttribute);
        sb.append(")");
        return sb.toString();
    }
}

package androidx.compose.runtime.tooling;

import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R \u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001a\u0010#\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018"}, d2 = {"Landroidx/compose/runtime/tooling/SourceInformation;", "", "", "p0", "p1", "", "p2", "p3", "", "Landroidx/compose/runtime/tooling/ParameterSourceInformation;", "p4", "p5", "Landroidx/compose/runtime/tooling/LocationSourceInformation;", "p6", "p7", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "isCall", "Z", "()Z", "isInline", "functionName", "Ljava/lang/String;", "getFunctionName", "()Ljava/lang/String;", "sourceFile", "getSourceFile", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "packageHash", "getPackageHash", "locations", "getLocations", Constants.MessagePayloadKeys.RAW_DATA, "getRawData"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SourceInformation {
    public static final int $stable = 8;
    private final String functionName;
    private final boolean isCall;
    private final boolean isInline;
    private final List<LocationSourceInformation> locations;
    private final String packageHash;
    private final List<ParameterSourceInformation> parameters;
    private final String rawData;
    private final String sourceFile;

    public SourceInformation(boolean z, boolean z2, String str, String str2, List<ParameterSourceInformation> list, String str3, List<LocationSourceInformation> list2, String str4) {
        this.isCall = z;
        this.isInline = z2;
        this.functionName = str;
        this.sourceFile = str2;
        this.parameters = list;
        this.packageHash = str3;
        this.locations = list2;
        this.rawData = str4;
    }

    /* JADX INFO: renamed from: isCall, reason: from getter */
    public final boolean getIsCall() {
        return this.isCall;
    }

    /* JADX INFO: renamed from: isInline, reason: from getter */
    public final boolean getIsInline() {
        return this.isInline;
    }

    public final String getFunctionName() {
        return this.functionName;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final List<ParameterSourceInformation> getParameters() {
        return this.parameters;
    }

    public final String getPackageHash() {
        return this.packageHash;
    }

    public final List<LocationSourceInformation> getLocations() {
        return this.locations;
    }

    public final String getRawData() {
        return this.rawData;
    }
}

package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "", "", "Landroid/net/Uri;", "p0", "Landroid/view/InputEvent;", "p1", "<init>", "(Ljava/util/List;Landroid/view/InputEvent;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "inputEvent", "Landroid/view/InputEvent;", "getInputEvent", "()Landroid/view/InputEvent;", "registrationUris", "Ljava/util/List;", "getRegistrationUris", "()Ljava/util/List;", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.RegisterSourceOptIn
public final class SourceRegistrationRequest {
    private final InputEvent inputEvent;
    private final List<Uri> registrationUris;

    /* JADX WARN: Multi-variable type inference failed */
    public SourceRegistrationRequest(List<? extends Uri> list, InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(list, "");
        this.registrationUris = list;
        this.inputEvent = inputEvent;
    }

    public /* synthetic */ SourceRegistrationRequest(List list, InputEvent inputEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : inputEvent);
    }

    public final InputEvent getInputEvent() {
        return this.inputEvent;
    }

    public final List<Uri> getRegistrationUris() {
        return this.registrationUris;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SourceRegistrationRequest)) {
            return false;
        }
        SourceRegistrationRequest sourceRegistrationRequest = (SourceRegistrationRequest) p0;
        return Intrinsics.areEqual(this.registrationUris, sourceRegistrationRequest.registrationUris) && Intrinsics.areEqual(this.inputEvent, sourceRegistrationRequest.inputEvent);
    }

    public final int hashCode() {
        int iHashCode = this.registrationUris.hashCode();
        InputEvent inputEvent = this.inputEvent;
        return inputEvent != null ? (iHashCode * 31) + inputEvent.hashCode() : iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationUris=[");
        sb.append(this.registrationUris);
        sb.append("], InputEvent=");
        sb.append(this.inputEvent);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("AppSourcesRegistrationRequest { ");
        sb2.append(string);
        sb2.append(" }");
        return sb2.toString();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest$Builder;", "", "", "Landroid/net/Uri;", "p0", "<init>", "(Ljava/util/List;)V", "Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "build", "()Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest;", "Landroid/view/InputEvent;", "setInputEvent", "(Landroid/view/InputEvent;)Landroidx/privacysandbox/ads/adservices/measurement/SourceRegistrationRequest$Builder;", "inputEvent", "Landroid/view/InputEvent;", "registrationUris", "Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private InputEvent inputEvent;
        private final List<Uri> registrationUris;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(List<? extends Uri> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.registrationUris = list;
        }

        public final Builder setInputEvent(InputEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.inputEvent = p0;
            return this;
        }

        public final SourceRegistrationRequest build() {
            return new SourceRegistrationRequest(this.registrationUris, this.inputEvent);
        }
    }
}

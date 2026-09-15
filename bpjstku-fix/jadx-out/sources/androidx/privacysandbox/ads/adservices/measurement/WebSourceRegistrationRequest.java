package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001,BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001c\u0010&\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "", "", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceParams;", "p0", "Landroid/net/Uri;", "p1", "Landroid/view/InputEvent;", "p2", "p3", "p4", "p5", "<init>", "(Ljava/util/List;Landroid/net/Uri;Landroid/view/InputEvent;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V", "Landroid/adservices/measurement/WebSourceRegistrationRequest;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/measurement/WebSourceRegistrationRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "appDestination", "Landroid/net/Uri;", "getAppDestination", "()Landroid/net/Uri;", "inputEvent", "Landroid/view/InputEvent;", "getInputEvent", "()Landroid/view/InputEvent;", "topOriginUri", "getTopOriginUri", "verifiedDestination", "getVerifiedDestination", "webDestination", "getWebDestination", "webSourceParams", "Ljava/util/List;", "getWebSourceParams", "()Ljava/util/List;", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSourceRegistrationRequest {
    private final Uri appDestination;
    private final InputEvent inputEvent;
    private final Uri topOriginUri;
    private final Uri verifiedDestination;
    private final Uri webDestination;
    private final List<WebSourceParams> webSourceParams;

    public WebSourceRegistrationRequest(List<WebSourceParams> list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(uri, "");
        this.webSourceParams = list;
        this.topOriginUri = uri;
        this.inputEvent = inputEvent;
        this.appDestination = uri2;
        this.webDestination = uri3;
        this.verifiedDestination = uri4;
    }

    public /* synthetic */ WebSourceRegistrationRequest(List list, Uri uri, InputEvent inputEvent, Uri uri2, Uri uri3, Uri uri4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, uri, (i & 4) != 0 ? null : inputEvent, (i & 8) != 0 ? null : uri2, (i & 16) != 0 ? null : uri3, (i & 32) != 0 ? null : uri4);
    }

    public final List<WebSourceParams> getWebSourceParams() {
        return this.webSourceParams;
    }

    public final Uri getTopOriginUri() {
        return this.topOriginUri;
    }

    public final InputEvent getInputEvent() {
        return this.inputEvent;
    }

    public final Uri getAppDestination() {
        return this.appDestination;
    }

    public final Uri getWebDestination() {
        return this.webDestination;
    }

    public final Uri getVerifiedDestination() {
        return this.verifiedDestination;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof WebSourceRegistrationRequest)) {
            return false;
        }
        WebSourceRegistrationRequest webSourceRegistrationRequest = (WebSourceRegistrationRequest) p0;
        return Intrinsics.areEqual(this.webSourceParams, webSourceRegistrationRequest.webSourceParams) && Intrinsics.areEqual(this.webDestination, webSourceRegistrationRequest.webDestination) && Intrinsics.areEqual(this.appDestination, webSourceRegistrationRequest.appDestination) && Intrinsics.areEqual(this.topOriginUri, webSourceRegistrationRequest.topOriginUri) && Intrinsics.areEqual(this.inputEvent, webSourceRegistrationRequest.inputEvent) && Intrinsics.areEqual(this.verifiedDestination, webSourceRegistrationRequest.verifiedDestination);
    }

    public final int hashCode() {
        int iHashCode = (this.webSourceParams.hashCode() * 31) + this.topOriginUri.hashCode();
        InputEvent inputEvent = this.inputEvent;
        if (inputEvent != null) {
            iHashCode = (iHashCode * 31) + inputEvent.hashCode();
        }
        Uri uri = this.appDestination;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.webDestination;
        if (uri2 != null) {
            iHashCode = (iHashCode * 31) + uri2.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + this.topOriginUri.hashCode();
        InputEvent inputEvent2 = this.inputEvent;
        if (inputEvent2 != null) {
            iHashCode2 = (iHashCode2 * 31) + inputEvent2.hashCode();
        }
        Uri uri3 = this.verifiedDestination;
        return uri3 != null ? (iHashCode2 * 31) + uri3.hashCode() : iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebSourceParams=[");
        sb.append(this.webSourceParams);
        sb.append("], TopOriginUri=");
        sb.append(this.topOriginUri);
        sb.append(", InputEvent=");
        sb.append(this.inputEvent);
        sb.append(", AppDestination=");
        sb.append(this.appDestination);
        sb.append(", WebDestination=");
        sb.append(this.webDestination);
        sb.append(", VerifiedDestination=");
        sb.append(this.verifiedDestination);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("WebSourceRegistrationRequest { ");
        sb2.append(string);
        sb2.append(" }");
        return sb2.toString();
    }

    public final android.adservices.measurement.WebSourceRegistrationRequest convertToAdServices$ads_adservices_release() {
        android.adservices.measurement.WebSourceRegistrationRequest webSourceRegistrationRequestBuild = new android.adservices.measurement.WebSourceRegistrationRequest.Builder(WebSourceParams.INSTANCE.convertWebSourceParams$ads_adservices_release(this.webSourceParams), this.topOriginUri).setWebDestination(this.webDestination).setAppDestination(this.appDestination).setInputEvent(this.inputEvent).setVerifiedDestination(this.verifiedDestination).build();
        Intrinsics.checkNotNullExpressionValue(webSourceRegistrationRequestBuild, "");
        return webSourceRegistrationRequestBuild;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\rJ\u0019\u0010\u0012\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\rR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest$Builder;", "", "", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceParams;", "p0", "Landroid/net/Uri;", "p1", "<init>", "(Ljava/util/List;Landroid/net/Uri;)V", "Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "build", "()Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest;", "setAppDestination", "(Landroid/net/Uri;)Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest$Builder;", "Landroid/view/InputEvent;", "setInputEvent", "(Landroid/view/InputEvent;)Landroidx/privacysandbox/ads/adservices/measurement/WebSourceRegistrationRequest$Builder;", "setVerifiedDestination", "setWebDestination", "appDestination", "Landroid/net/Uri;", "inputEvent", "Landroid/view/InputEvent;", "topOriginUri", "verifiedDestination", "webDestination", "webSourceParams", "Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private Uri appDestination;
        private InputEvent inputEvent;
        private final Uri topOriginUri;
        private Uri verifiedDestination;
        private Uri webDestination;
        private final List<WebSourceParams> webSourceParams;

        public Builder(List<WebSourceParams> list, Uri uri) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(uri, "");
            this.webSourceParams = list;
            this.topOriginUri = uri;
        }

        public final Builder setInputEvent(InputEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.inputEvent = p0;
            return this;
        }

        public final Builder setAppDestination(Uri p0) {
            this.appDestination = p0;
            return this;
        }

        public final Builder setWebDestination(Uri p0) {
            this.webDestination = p0;
            return this;
        }

        public final Builder setVerifiedDestination(Uri p0) {
            this.verifiedDestination = p0;
            return this;
        }

        public final WebSourceRegistrationRequest build() {
            return new WebSourceRegistrationRequest(this.webSourceParams, this.topOriginUri, this.inputEvent, this.appDestination, this.webDestination, this.verifiedDestination);
        }
    }
}

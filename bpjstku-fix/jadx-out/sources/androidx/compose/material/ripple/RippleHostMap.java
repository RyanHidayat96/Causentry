package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Landroidx/compose/material/ripple/RippleHostMap;", "", "<init>", "()V", "Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "p0", "Landroidx/compose/material/ripple/RippleHostView;", "get", "(Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;)Landroidx/compose/material/ripple/RippleHostView;", "(Landroidx/compose/material/ripple/RippleHostView;)Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;", "", "remove", "(Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;)V", "p1", "set", "(Landroidx/compose/material/ripple/AndroidRippleIndicationInstance;Landroidx/compose/material/ripple/RippleHostView;)V", "", "hostToIndicationMap", "Ljava/util/Map;", "indicationToHostMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class RippleHostMap {
    private final Map<AndroidRippleIndicationInstance, RippleHostView> indicationToHostMap = new LinkedHashMap();
    private final Map<RippleHostView, AndroidRippleIndicationInstance> hostToIndicationMap = new LinkedHashMap();

    public final void set(AndroidRippleIndicationInstance p0, RippleHostView p1) {
        this.indicationToHostMap.put(p0, p1);
        this.hostToIndicationMap.put(p1, p0);
    }

    public final RippleHostView get(AndroidRippleIndicationInstance p0) {
        return this.indicationToHostMap.get(p0);
    }

    public final AndroidRippleIndicationInstance get(RippleHostView p0) {
        return this.hostToIndicationMap.get(p0);
    }

    public final void remove(AndroidRippleIndicationInstance p0) {
        RippleHostView rippleHostView = this.indicationToHostMap.get(p0);
        if (rippleHostView != null) {
            this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(p0);
    }
}

package androidx.p005navigation;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n"}, d2 = {"Landroidx/navigation/PopUpToBuilder;", "", "<init>", "()V", "", "inclusive", "Z", "getInclusive", "()Z", "setInclusive", "(Z)V", "saveState", "getSaveState", "setSaveState"}, k = 1, mv = {2, 0, 0}, xi = 48)
@NavOptionsDsl
public final class PopUpToBuilder {
    private boolean inclusive;
    private boolean saveState;

    public final boolean getInclusive() {
        return this.inclusive;
    }

    public final void setInclusive(boolean z) {
        this.inclusive = z;
    }

    public final boolean getSaveState() {
        return this.saveState;
    }

    public final void setSaveState(boolean z) {
        this.saveState = z;
    }
}

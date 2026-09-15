package androidx.view.compose.internal;

import androidx.p010navigationevent.NavigationEvent;
import androidx.p010navigationevent.NavigationEventHandler;
import androidx.p010navigationevent.NavigationEventInfo;
import androidx.view.BackEventCompat;
import androidx.view.OnBackPressedCallback;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00128W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/activity/compose/internal/BackHandlerCompat;", "", "Landroidx/navigationevent/NavigationEventInfo;", "p0", "<init>", "(Landroidx/navigationevent/NavigationEventInfo;)V", "Landroidx/activity/BackEventCompat;", "", "onBackStarted", "(Landroidx/activity/BackEventCompat;)V", "onBackProgressed", "onBackCompleted", "()V", "onBackCancelled", "info", "Landroidx/navigationevent/NavigationEventInfo;", "getInfo", "()Landroidx/navigationevent/NavigationEventInfo;", "", "isBackEnabled", "()Z", "setBackEnabled", "(Z)V", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "getOnBackPressedCallback", "()Landroidx/activity/OnBackPressedCallback;", "Landroidx/navigationevent/NavigationEventHandler;", "navigationEventHandler", "Landroidx/navigationevent/NavigationEventHandler;", "getNavigationEventHandler", "()Landroidx/navigationevent/NavigationEventHandler;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BackHandlerCompat {
    public static final int $stable = 8;
    private final NavigationEventInfo info;
    private final NavigationEventHandler<NavigationEventInfo> navigationEventHandler;
    private final OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.activity.compose.internal.BackHandlerCompat$onBackPressedCallback$1
        {
            super(false);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackStarted(BackEventCompat p0) {
            this.this$0.onBackStarted(p0);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackProgressed(BackEventCompat p0) {
            this.this$0.onBackProgressed(p0);
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackPressed() {
            this.this$0.onBackCompleted();
        }

        @Override // androidx.view.OnBackPressedCallback
        public final void handleOnBackCancelled() {
            this.this$0.onBackCancelled();
        }
    };

    public void onBackCancelled() {
    }

    public abstract void onBackCompleted();

    public void onBackProgressed(BackEventCompat p0) {
    }

    public void onBackStarted(BackEventCompat p0) {
    }

    public BackHandlerCompat(final NavigationEventInfo navigationEventInfo) {
        this.info = navigationEventInfo;
        this.navigationEventHandler = new NavigationEventHandler<NavigationEventInfo>(navigationEventInfo) { // from class: androidx.activity.compose.internal.BackHandlerCompat$navigationEventHandler$1
            @Override // androidx.p010navigationevent.NavigationEventHandler
            public final void onBackStarted(NavigationEvent p0) {
                this.this$0.onBackStarted(new BackEventCompat(p0));
            }

            @Override // androidx.p010navigationevent.NavigationEventHandler
            public final void onBackProgressed(NavigationEvent p0) {
                this.this$0.onBackProgressed(new BackEventCompat(p0));
            }

            @Override // androidx.p010navigationevent.NavigationEventHandler
            public final void onBackCompleted() {
                this.this$0.onBackCompleted();
            }

            @Override // androidx.p010navigationevent.NavigationEventHandler
            public final void onBackCancelled() {
                this.this$0.onBackCancelled();
            }
        };
    }

    public final NavigationEventInfo getInfo() {
        return this.info;
    }

    public boolean isBackEnabled() {
        return this.onBackPressedCallback.getIsEnabled() && this.navigationEventHandler.isBackEnabled();
    }

    public void setBackEnabled(boolean z) {
        this.onBackPressedCallback.setEnabled(z);
        this.navigationEventHandler.setBackEnabled(z);
    }

    public final OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    public final NavigationEventHandler<NavigationEventInfo> getNavigationEventHandler() {
        return this.navigationEventHandler;
    }
}

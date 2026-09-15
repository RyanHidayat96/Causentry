package androidx.p010navigationevent.p011compose;

import androidx.exifinterface.media.ExifInterface;
import androidx.p010navigationevent.NavigationEvent;
import androidx.p010navigationevent.NavigationEventHandler;
import androidx.p010navigationevent.NavigationEventInfo;
import androidx.p010navigationevent.NavigationEventTransitionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0010R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR(\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001e"}, d2 = {"Landroidx/navigationevent/compose/ComposeNavigationEventHandler;", "Landroidx/navigationevent/NavigationEventInfo;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigationevent/NavigationEventHandler;", "p0", "Lkotlin/Function1;", "Landroidx/navigationevent/NavigationEventTransitionState;", "", "p1", "<init>", "(Landroidx/navigationevent/NavigationEventInfo;Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigationevent/NavigationEvent;", "onForwardStarted", "(Landroidx/navigationevent/NavigationEvent;)V", "onForwardProgressed", "onForwardCancelled", "()V", "onForwardCompleted", "onBackStarted", "onBackProgressed", "onBackCancelled", "onBackCompleted", "onTransitionStateChanged", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "currentOnForwardCancelled", "Lkotlin/jvm/functions/Function0;", "getCurrentOnForwardCancelled", "()Lkotlin/jvm/functions/Function0;", "setCurrentOnForwardCancelled", "(Lkotlin/jvm/functions/Function0;)V", "currentOnForwardCompleted", "getCurrentOnForwardCompleted", "setCurrentOnForwardCompleted", "currentOnBackCancelled", "getCurrentOnBackCancelled", "setCurrentOnBackCancelled", "currentOnBackCompleted", "getCurrentOnBackCompleted", "setCurrentOnBackCompleted"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ComposeNavigationEventHandler<T extends NavigationEventInfo> extends NavigationEventHandler<T> {
    private Function0<Unit> currentOnBackCancelled;
    private Function0<Unit> currentOnBackCompleted;
    private Function0<Unit> currentOnForwardCancelled;
    private Function0<Unit> currentOnForwardCompleted;
    private final Function1<NavigationEventTransitionState, Unit> onTransitionStateChanged;

    public /* synthetic */ ComposeNavigationEventHandler(NavigationEventInfo navigationEventInfo, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navigationEventInfo, (i & 2) != 0 ? new Function1() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComposeNavigationEventHandler._init_$lambda$0((NavigationEventTransitionState) obj);
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(NavigationEventTransitionState navigationEventTransitionState) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeNavigationEventHandler(T t, Function1<? super NavigationEventTransitionState, Unit> function1) {
        super(t, false, false);
        this.onTransitionStateChanged = function1;
        this.currentOnForwardCancelled = new Function0() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.currentOnForwardCompleted = new Function0() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.currentOnBackCancelled = new Function0() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.currentOnBackCompleted = new Function0() { // from class: androidx.navigationevent.compose.ComposeNavigationEventHandler$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
    }

    public final Function0<Unit> getCurrentOnForwardCancelled() {
        return this.currentOnForwardCancelled;
    }

    public final void setCurrentOnForwardCancelled(Function0<Unit> function0) {
        this.currentOnForwardCancelled = function0;
    }

    public final Function0<Unit> getCurrentOnForwardCompleted() {
        return this.currentOnForwardCompleted;
    }

    public final void setCurrentOnForwardCompleted(Function0<Unit> function0) {
        this.currentOnForwardCompleted = function0;
    }

    public final Function0<Unit> getCurrentOnBackCancelled() {
        return this.currentOnBackCancelled;
    }

    public final void setCurrentOnBackCancelled(Function0<Unit> function0) {
        this.currentOnBackCancelled = function0;
    }

    public final Function0<Unit> getCurrentOnBackCompleted() {
        return this.currentOnBackCompleted;
    }

    public final void setCurrentOnBackCompleted(Function0<Unit> function0) {
        this.currentOnBackCompleted = function0;
    }

    @Override // androidx.p010navigationevent.NavigationEventHandler
    public final void onForwardStarted(NavigationEvent p0) {
        this.onTransitionStateChanged.invoke(getTransitionState());
    }

    @Override // androidx.p010navigationevent.NavigationEventHandler
    public final void onForwardProgressed(NavigationEvent p0) {
        this.onTransitionStateChanged.invoke(getTransitionState());
    }

    @Override // androidx.p010navigationevent.NavigationEventHandler
    public final void onForwardCancelled() {
        this.onTransitionStateChanged.invoke(getTransitionState());
        this.currentOnForwardCancelled.invoke();
    }

    @Override // androidx.p010navigationevent.NavigationEventHandler
    public final void onForwardCompleted() {
        this.onTransitionStateChanged.invoke(getTransitionState());
        this.currentOnForwardCompleted.invoke();
    }

    @Override // androidx.p010navigationevent.NavigationEventHandler
    public final void onBackStarted(NavigationEvent p0) {
        this.onTransitionStateChanged.invoke(getTransitionState());
    }

    @Override // androidx.p010navigationevent.NavigationEventHandler
    public final void onBackProgressed(NavigationEvent p0) {
        this.onTransitionStateChanged.invoke(getTransitionState());
    }

    @Override // androidx.p010navigationevent.NavigationEventHandler
    public final void onBackCancelled() {
        this.onTransitionStateChanged.invoke(getTransitionState());
        this.currentOnBackCancelled.invoke();
    }

    @Override // androidx.p010navigationevent.NavigationEventHandler
    public final void onBackCompleted() {
        this.onTransitionStateChanged.invoke(getTransitionState());
        this.currentOnBackCompleted.invoke();
    }
}

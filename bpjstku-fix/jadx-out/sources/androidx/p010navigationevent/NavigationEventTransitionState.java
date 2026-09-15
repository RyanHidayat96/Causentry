package androidx.p010navigationevent;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t"}, d2 = {"Landroidx/navigationevent/NavigationEventTransitionState;", "", "<init>", "()V", "Companion", "Idle", "InProgress", "Direction", "Landroidx/navigationevent/NavigationEventTransitionState$Idle;", "Landroidx/navigationevent/NavigationEventTransitionState$InProgress;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NavigationEventTransitionState {
    public static final int TRANSITIONING_BACK = -1;
    public static final int TRANSITIONING_FORWARD = 1;
    public static final int TRANSITIONING_UNKNOWN = 0;

    /* JADX INFO: loaded from: classes4.dex */
    @Target({ElementType.METHOD, ElementType.PARAMETER})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/navigationevent/NavigationEventTransitionState$Direction;", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.PROPERTY, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Direction {
    }

    private NavigationEventTransitionState() {
    }

    public /* synthetic */ NavigationEventTransitionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/navigationevent/NavigationEventTransitionState$Idle;", "Landroidx/navigationevent/NavigationEventTransitionState;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Idle extends NavigationEventTransitionState {
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }

        public final String toString() {
            return "Idle()";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\r"}, d2 = {"Landroidx/navigationevent/NavigationEventTransitionState$InProgress;", "Landroidx/navigationevent/NavigationEventTransitionState;", "Landroidx/navigationevent/NavigationEvent;", "p0", "", "p1", "<init>", "(Landroidx/navigationevent/NavigationEvent;I)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "latestEvent", "Landroidx/navigationevent/NavigationEvent;", "getLatestEvent", "()Landroidx/navigationevent/NavigationEvent;", "direction", "I", "getDirection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InProgress extends NavigationEventTransitionState {
        private final int direction;
        private final NavigationEvent latestEvent;

        public final NavigationEvent getLatestEvent() {
            return this.latestEvent;
        }

        public final int getDirection() {
            return this.direction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(NavigationEvent navigationEvent, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(navigationEvent, "");
            this.latestEvent = navigationEvent;
            this.direction = i;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (p0 == null || getClass() != p0.getClass()) {
                return false;
            }
            InProgress inProgress = (InProgress) p0;
            return this.direction == inProgress.direction && Intrinsics.areEqual(this.latestEvent, inProgress.latestEvent);
        }

        public final int hashCode() {
            return (this.direction * 31) + this.latestEvent.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InProgress(latestEvent=");
            sb.append(this.latestEvent);
            sb.append(", direction=");
            sb.append(this.direction);
            sb.append(')');
            return sb.toString();
        }
    }
}

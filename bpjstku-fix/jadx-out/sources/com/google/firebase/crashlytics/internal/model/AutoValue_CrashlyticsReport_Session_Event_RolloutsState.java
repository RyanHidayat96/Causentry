package com.google.firebase.crashlytics.internal.model;

import android.content.Context;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState extends CrashlyticsReport.Session.Event.RolloutsState {
    private final List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutAssignments;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static int TuitionPaymentFragmentbindingInflater1;
        public static int b;

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = b;
            int i2 = i % 5174982;
            b = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentbindingInflater1;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().orientation;
            TuitionPaymentFragmentbindingInflater1 = i3;
            return i3;
        }
    }

    /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_RolloutsState(List list, AnonymousClass1 anonymousClass1) {
        this(list);
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutsState(List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
        this.rolloutAssignments = list;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState
    @Encodable.Field(name = "assignments")
    public final List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutAssignments() {
        return this.rolloutAssignments;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutsState{rolloutAssignments=");
        sb.append(this.rolloutAssignments);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutsState) {
            return this.rolloutAssignments.equals(((CrashlyticsReport.Session.Event.RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    public final int hashCode() {
        return this.rolloutAssignments.hashCode() ^ 1000003;
    }

    static final class Builder extends CrashlyticsReport.Session.Event.RolloutsState.Builder {
        private List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutAssignments;

        Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public final CrashlyticsReport.Session.Event.RolloutsState.Builder setRolloutAssignments(List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.rolloutAssignments = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public final CrashlyticsReport.Session.Event.RolloutsState build() {
            List<CrashlyticsReport.Session.Event.RolloutAssignment> list = this.rolloutAssignments;
            if (list == null) {
                throw new IllegalStateException("Missing required properties: rolloutAssignments");
            }
            return new AutoValue_CrashlyticsReport_Session_Event_RolloutsState(list, null);
        }
    }
}

package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class RolloutAssignmentList {
    static final String ROLLOUTS_STATE = "rolloutsState";
    private final int maxEntries;
    private final List<RolloutAssignment> rolloutsState = new ArrayList();

    public RolloutAssignmentList(int i) {
        this.maxEntries = i;
    }

    public List<RolloutAssignment> getRolloutAssignmentList() {
        List<RolloutAssignment> listUnmodifiableList;
        synchronized (this) {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(this.rolloutsState));
        }
        return listUnmodifiableList;
    }

    public boolean updateRolloutAssignmentList(List<RolloutAssignment> list) {
        synchronized (this) {
            this.rolloutsState.clear();
            if (list.size() > this.maxEntries) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Ignored 0 entries when adding rollout assignments. Maximum allowable: ");
                sb.append(this.maxEntries);
                logger.w(sb.toString());
                return this.rolloutsState.addAll(list.subList(0, this.maxEntries));
            }
            return this.rolloutsState.addAll(list);
        }
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getReportRolloutsState() {
        List<RolloutAssignment> rolloutAssignmentList = getRolloutAssignmentList();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < rolloutAssignmentList.size(); i++) {
            arrayList.add(rolloutAssignmentList.get(i).toReportProto());
        }
        return arrayList;
    }
}

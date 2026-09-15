package com.zimperium.api.v5;

import java.util.Date;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public interface ZDefendThreat {

    public enum ZThreatSeverity {
        HIDDEN,
        LOW,
        IMPORTANT,
        CRITICAL
    }

    String getAppName();

    Date getAttackTime();

    String getInternalName();

    int getInternalThreatID();

    JSONObject getJson();

    String getLocalizedAlertText();

    String getLocalizedDetails();

    String getLocalizedName();

    String getPackageName();

    ZThreatSeverity getSeverity();

    String getUUID();

    String getUrl();

    String getVector();

    boolean isMitigated();
}

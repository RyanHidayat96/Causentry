package com.zimperium.api.v5;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface ZDeviceStatus {
    List<ZDefendThreat> getAllThreats();

    String getBase64();

    String getBase64Signature();

    String getDeviceId();

    int getInitialScanProgressPercentage();

    ZLoginError getLoginLastError();

    ZLoginStatus getLoginStatus();
}

package com.karumi.dexter;

import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiplePermissionsReport {
    private final List<PermissionGrantedResponse> grantedPermissionResponses = new LinkedList();
    private final List<PermissionDeniedResponse> deniedPermissionResponses = new LinkedList();

    MultiplePermissionsReport() {
    }

    final boolean addDeniedPermissionResponse(PermissionDeniedResponse permissionDeniedResponse) {
        return this.deniedPermissionResponses.add(permissionDeniedResponse);
    }

    final boolean addGrantedPermissionResponse(PermissionGrantedResponse permissionGrantedResponse) {
        return this.grantedPermissionResponses.add(permissionGrantedResponse);
    }

    public final boolean areAllPermissionsGranted() {
        return this.deniedPermissionResponses.isEmpty();
    }

    final void clear() {
        this.grantedPermissionResponses.clear();
        this.deniedPermissionResponses.clear();
    }

    public final List<PermissionDeniedResponse> getDeniedPermissionResponses() {
        return this.deniedPermissionResponses;
    }

    public final List<PermissionGrantedResponse> getGrantedPermissionResponses() {
        return this.grantedPermissionResponses;
    }

    public final boolean isAnyPermissionPermanentlyDenied() {
        Iterator<PermissionDeniedResponse> it = this.deniedPermissionResponses.iterator();
        while (it.hasNext()) {
            if (it.next().isPermanentlyDenied()) {
                return true;
            }
        }
        return false;
    }
}

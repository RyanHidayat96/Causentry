package com.google.android.gms.location;

import com.google.android.gms.common.api.Response;
import defpackage.degreesToSurfaceRotation;
import defpackage.surfaceRotationToDegrees;

/* JADX INFO: loaded from: classes3.dex */
public class LocationSettingsResponse extends Response<LocationSettingsResult> {
    public LocationSettingsResponse(LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }

    public LocationSettingsStates getLocationSettingsStates() {
        return getResult().getLocationSettingsStates();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        surfaceRotationToDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = degreesToSurfaceRotation.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
    }
}

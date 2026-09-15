package com.google.mlkit.vision.common.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.CameraControlInternal2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zze implements OnCompleteListener {
    public final /* synthetic */ CameraControlInternal2 zza;

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        CameraControlInternal2 cameraControlInternal2 = this.zza;
        int i = MobileVisionBase.zza;
        cameraControlInternal2.close();
    }
}

package com.google.android.datatransport.cct;

import defpackage.RequestWithCallback;
import defpackage.TakePictureRequestExternalSyntheticLambda0;
import defpackage.TakePictureRequestExternalSyntheticLambda4;
import defpackage.lambdaonPostviewBitmapAvailable4androidxcameracoreimagecaptureTakePictureRequest;

/* JADX INFO: loaded from: classes6.dex */
public class CctBackendFactory implements lambdaonPostviewBitmapAvailable4androidxcameracoreimagecaptureTakePictureRequest {
    @Override // defpackage.lambdaonPostviewBitmapAvailable4androidxcameracoreimagecaptureTakePictureRequest
    public TakePictureRequestExternalSyntheticLambda4 create(TakePictureRequestExternalSyntheticLambda0 takePictureRequestExternalSyntheticLambda0) {
        return new RequestWithCallback(takePictureRequestExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), takePictureRequestExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(), takePictureRequestExternalSyntheticLambda0.b());
    }
}

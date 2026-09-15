package com.dynatrace.android.agent.comm;

import defpackage.SurfaceRequestExternalSyntheticLambda7;

/* JADX INFO: loaded from: classes4.dex */
public class InvalidResponseException extends Exception {
    public SurfaceRequestExternalSyntheticLambda7 response;

    public InvalidResponseException(String str, SurfaceRequestExternalSyntheticLambda7 surfaceRequestExternalSyntheticLambda7) {
        super(str);
        this.response = surfaceRequestExternalSyntheticLambda7;
    }

    public InvalidResponseException(String str, Throwable th, SurfaceRequestExternalSyntheticLambda7 surfaceRequestExternalSyntheticLambda7) {
        super(str, th);
        this.response = surfaceRequestExternalSyntheticLambda7;
    }
}

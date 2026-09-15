package com.squareup.okhttp.internal.framed;

import defpackage.RotationProvider1;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface PushObserver {
    public static final PushObserver CANCEL = new PushObserver() { // from class: com.squareup.okhttp.internal.framed.PushObserver.1
        @Override // com.squareup.okhttp.internal.framed.PushObserver
        public final boolean onHeaders(int i, List<Header> list, boolean z) {
            return true;
        }

        @Override // com.squareup.okhttp.internal.framed.PushObserver
        public final boolean onRequest(int i, List<Header> list) {
            return true;
        }

        @Override // com.squareup.okhttp.internal.framed.PushObserver
        public final void onReset(int i, ErrorCode errorCode) {
        }

        @Override // com.squareup.okhttp.internal.framed.PushObserver
        public final boolean onData(int i, RotationProvider1 rotationProvider1, int i2, boolean z) throws IOException {
            rotationProvider1.g(i2);
            return true;
        }
    };

    boolean onData(int i, RotationProvider1 rotationProvider1, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<Header> list, boolean z);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}

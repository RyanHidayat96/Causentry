package io.reactivex.internal.util;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.OutputTransform;
import defpackage.VideoOutputSourceState;
import defpackage.VideoRecordEventPause;
import defpackage.deriveMediaType;
import defpackage.errorToString;
import defpackage.getDefaultVideoProfile;

/* JADX INFO: loaded from: classes4.dex */
public enum EmptyComponent implements VideoRecordEventPause<Object>, deriveMediaType<Object>, errorToString<Object>, getDefaultVideoProfile<Object>, VideoOutputSourceState, OutputTransform, BufferProviderState {
    INSTANCE;

    @Override // defpackage.OutputTransform
    public final void b() {
    }

    @Override // defpackage.OutputTransform
    public final void b(long j) {
    }

    @Override // defpackage.errorToString
    public final void b(Object obj) {
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return true;
    }

    @Override // defpackage.AudioConfig
    public final void onComplete() {
    }

    @Override // defpackage.AudioConfig
    public final void onNext(Object obj) {
    }

    public static <T> deriveMediaType<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return INSTANCE;
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        bufferProviderState.dispose();
    }

    @Override // defpackage.VideoRecordEventPause, defpackage.AudioConfig
    public final void b(OutputTransform outputTransform) {
        outputTransform.b();
    }

    @Override // defpackage.AudioConfig
    public final void onError(Throwable th) {
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
    }
}
